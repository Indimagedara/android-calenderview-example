package com.nimezzz.android_calender_view_sample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalenderActivity extends AppCompatActivity {

    private static final String TAG = "CalenderActivity";

    private CalendarView mCalendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calender_layout);
        mCalendarView = (CalendarView)findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                String date = i +"-"+ (i1+1) +"-"+i2;

                Toast.makeText(CalenderActivity.this, date, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(CalenderActivity.this,MainActivity.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }
        });
    }
}
