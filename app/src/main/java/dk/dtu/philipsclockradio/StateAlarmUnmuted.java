package dk.dtu.philipsclockradio;

import android.os.CountDownTimer;

public class StateAlarmUnmuted extends StateAdapter {

    @Override
    public void onEnterState(ContextClockradio context) {

        context.ui.setDisplayText(context.getTime().toString().substring(11,16));

    }

    @Override
    public void onExitState(ContextClockradio context) {
        super.onExitState(context);
    }
}
