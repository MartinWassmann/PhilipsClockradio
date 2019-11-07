package dk.dtu.philipsclockradio;

public class StatePreset extends StateAdapter {

    int Station = 1;
    int channel;

    @Override
    public void onEnterState(ContextClockradio context) {
        context.ui.setDisplayText(Station + "");
    }

    @Override
    public void onExitState(ContextClockradio context) {
    }

    @Override
    public void onLongClick_Preset(ContextClockradio context) {
        if (Station == 10) {
            Station = 1;
        } else {
            Station ++;
        }
        context.ui.setDisplayText(Station + "");
    }

    @Override
    public void onClick_Preset(ContextClockradio context) {
        context.ui.setPreset(Station, channel);

        context.setState(new StateTuneFreqFM());
    }
}
