package dk.dtu.philipsclockradio;

import android.content.Context;
import android.os.CountDownTimer;

import java.util.Date;

public class StateAlarm extends StateAdapter {

    int hour = 00;
    int minute =00;
    public String alarmTime;
    CountDownTimer alarmTimer;


    @Override
    public void onEnterState(ContextClockradio context) {
        super.onEnterState(context);
        context.ui.turnOnTextBlink();
        context.ui.setDisplayText("00:00");
    }

    @Override
    public void onExitState(final ContextClockradio context) {
        context.ui.turnOnTextBlink();

        alarmTimer = new CountDownTimer((3600000 * 24), 60000) {

            String alarmTime = hour + ";" + minute;

            @Override
            public void onTick(long millisUntilFinished) {
                String currentTime = context.getTime().toString().substring(11, 16);

                if (currentTime == alarmTime) {
                    alarmTimer.onFinish();
                }
            }

            @Override
            public void onFinish() {
                context.setState(new StateAlarmUnmuted());
            }
        };
    }

    @Override
    public void onClick_Hour(ContextClockradio context) {
        if (hour == 23) {
            hour = 0;
        } else {
            hour++;
        }

        if (hour >= 10 && minute >= 10) {
            context.ui.setDisplayText(hour + ":" + minute);
        } else if (hour >= 10 && minute < 10 ) {
            context.ui.setDisplayText(hour + ":0" + minute);
        } else if (hour < 10 && minute < 10) {
            context.ui.setDisplayText("0" + hour + ":0" + minute);
        } else if (hour < 10 && minute >= 10) {
            context.ui.setDisplayText("0" + hour + ":" + minute);
        }
    }

    @Override
    public void onClick_Min(ContextClockradio context) {
        if (minute == 59) {
            minute = 0;
        } else {
            minute++;
        }

        if (hour >= 10 && minute >= 10) {
            context.ui.setDisplayText(hour + ":" + minute);
        } else if (hour >= 10 && minute < 10 ) {
            context.ui.setDisplayText(hour + ":0" + minute);
        } else if (hour < 10 && minute < 10) {
            context.ui.setDisplayText("0" + hour + ":0" + minute);
        } else if (hour < 10 && minute >= 10) {
            context.ui.setDisplayText("0" + hour + ":" + minute);
        }
    }

    @Override
    public void onClick_AL1(ContextClockradio context) {
        context.ui.turnOffTextBlink();

    }
}
