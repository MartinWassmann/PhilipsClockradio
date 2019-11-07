package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

public class StateAlarmUnmuted extends StateAdapter {

    CountDownTimer alarmTimer;
    String alarmTime;
    String time;

    StateAlarmUnmuted (String alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void onEnterState(final ContextClockradio context) {

        time = context.getTime().toString().substring(11, 16);

        alarmTimer = new CountDownTimer((3600000 * 24), 60000) {

            @Override
            public void onTick(long millisUntilFinished) {
                String currentTime = context.getTime().toString().substring(11, 16);

                if (currentTime.equals(alarmTime)) {
                    alarmTimer.onFinish();
                }
                context.ui.setDisplayText(context.getTime().toString().substring(11, 16));
            }

            @Override
            public void onFinish() {
                context.setState(new StateAlarmPlaying(false));
                alarmTimer.cancel();
            }
        }; alarmTimer.start();
    }

    @Override
    public void onExitState(ContextClockradio context) {
    }

    @Override
    public void onClick_AL1(ContextClockradio context) {
    }
}
