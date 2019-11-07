package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

public class StateAlarmPlaying extends StateAdapter {

    boolean snoozed = false;
    CountDownTimer snoozeTimer;

    StateAlarmPlaying (boolean snoozed) {
        this.snoozed = snoozed;
    }

    @Override
    public void onEnterState(final ContextClockradio context) {

        if (snoozed == true) {
            System.out.println("phillip boomer");

            snoozeTimer = new CountDownTimer(540000, 1000) { //change 6000 to 540000
                @Override
                public void onTick(long l) {
                }

                @Override
                public void onFinish() {
                    context.ui.turnOnLED(2);
                    context.ui.turnOnTextBlink();
                    context.ui.setDisplayText(context.getTime().toString().substring(11, 16));
                }
            }; snoozeTimer.start();
        } else {
            context.ui.turnOnLED(2);
            context.ui.turnOnTextBlink();
        }
    }

    @Override
    public void onExitState(ContextClockradio context) {
        context.ui.turnOffTextBlink();
    }

    @Override
    public void onClick_Snooze(ContextClockradio context) {
        context.setState(new StateAlarmPlaying(true));
        context.ui.turnOffLED(2);
        context.ui.turnOffTextBlink();
    }
}

