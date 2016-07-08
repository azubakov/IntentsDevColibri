package tomer.edu.intentsdevcolibri;

import android.annotation.TargetApi;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.icu.util.TimeZone;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class CurrentDateActivity extends AppCompatActivity {

    TextView txtDate;

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_date);

        txtDate = (TextView) findViewById(R.id.txtDate);
        /////Calendar c1 = new GregorianCalendar(TimeZone.getTimeZone("GMT+3"));
        /*Calendar c1 = new GregorianCalendar();
        c1.setTimeZone(TimeZone.getTimeZone("GMT+3"));*/
        Calendar c1 = Calendar.getInstance();
        c1.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        String monthStr = "";
        if (month == 0)
            monthStr = "January";
        else if (month == 1)
             monthStr = "February";
        else if (month == 2)
            monthStr = "March";
        else if (month == 3)
            monthStr = "April";
        else if (month == 4)
            monthStr = "May";
        else if (month == 5)
            monthStr = "June";
        else if (month == 6)
            monthStr = "July";
        else if (month == 7)
            monthStr = "August";
        else if (month == 8)
            monthStr = "September";
        else if (month == 9)
            monthStr = "Ocober";
        else if (month == 10)
            monthStr = "November";
        else if (month == 11)
            monthStr = "December";

        int day = c1.get(Calendar.DAY_OF_MONTH);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minutes = c1.get(Calendar.MINUTE);
        int seconds = c1.get(Calendar.SECOND);
        int ampm = c1.get(Calendar.AM_PM);
        /*Date CurrTime = c1.getTime();
        String CurrTimeStr = CurrTime.toString();
        txtDate.setText(CurrTimeStr);*/
        String ampmStr = (ampm == 0) ? "AM" : "PM";
        ////txtDate.setText(String.format("The date is: %d %s %d %d:%d:%d %s", day, monthStr, year, hour, minutes, seconds, ampmStr + "."));
        txtDate.setText(String.format("The date is: %d/%d/%d %d:%d:%d %s", day, month+1, year, hour, minutes, seconds, ampmStr + "."));
        //txtDate.setText(Calendar.getInstance().getTime().toString());





    }
}
