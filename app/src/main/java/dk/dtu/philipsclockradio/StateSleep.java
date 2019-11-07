package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

public class StateSleep extends StateAdapter {

    int sleepTimer = 120;
    CountDownTimer idleTime;

    @Override
    public void onEnterState(final ContextClockradio context) {
        context.ui.setDisplayText(sleepTimer + "");

        idleTime = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                context.setState(new StateStandby(context.getTime()));
            }
        };

        idleTime.start();
    }

    @Override
    public void onExitState(ContextClockradio context) {
        super.onExitState(context);
    }

    @Override
    public void onClick_Sleep(ContextClockradio context) {
        idleTime.cancel();

        if (sleepTimer < 0) {
            sleepTimer = 15;
            context.ui.setDisplayText(sleepTimer + "");
        } else if (sleepTimer == 15) {
            context.ui.setDisplayText("Off");
            sleepTimer = 150;
        } else if (sleepTimer == 30) {
            sleepTimer = 15;
            context.ui.setDisplayText(sleepTimer + "");
        } else if (sleepTimer !=30 && sleepTimer !=15) {
            sleepTimer = sleepTimer - 30;
            context.ui.setDisplayText(sleepTimer + "");
        }
        idleTime.start();
    }


}
