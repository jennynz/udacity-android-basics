package com.jennynz.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
    }

    public void addPoints(View view) {
        int points = Integer.parseInt(view.getTag().toString());
        this.addPoints(points);
    }

    public void addPoints(int points) {
        teamAScore += points;
        displayForTeamA(teamAScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
