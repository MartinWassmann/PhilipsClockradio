package dk.dtu.philipsclockradio;

import android.content.Context;

import java.net.ConnectException;

public class StateTuneFreqAM extends StateAdapter {

    long freq = 1;

    @Override
    public void onEnterState(ContextClockradio context) {
        context.ui.setDisplayText(freq + "AM");
    }

    @Override
    public void onExitState(ContextClockradio context) {
    }

    @Override
    public void onClick_Hour(ContextClockradio context) {
        if (freq == 1){
            freq = 300;
        } else {
            freq--;
        }
        context.ui.setDisplayText(freq + "AM");
    }

    @Override
    public void onClick_Min(ContextClockradio context) {
        if (freq == 300) {
            freq = 1;
        } else {
            freq++;
        }
        context.ui.setDisplayText(freq + "AM");
    }

    @Override
    public void onClick_Power(ContextClockradio context) {
        context.setState(new StateTuneFreqFM());
    }

    @Override
    public void onLongClick_Power(ContextClockradio context) {
        context.setState(new StateStandby(context.getTime()));
    }

    @Override
    public void onLongClick_Preset(ContextClockradio context) {
        context.setState(new StatePreset());
    }
}
