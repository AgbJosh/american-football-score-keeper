package com.ithub.americanfootballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void addPointsTeamA(int scorePoint){
        scoreTeamA = scoreTeamA + scorePoint;
    }

    private void addPointsTeamB(int scorePoint){
        scoreTeamB = scoreTeamB + scorePoint;
    }

    private void displayPointsTeamA(){
        TextView teamAText = findViewById(R.id.txt_team_one_score);
        teamAText.setText(String.valueOf(scoreTeamA));
    }

    private void displayPointsTeamB(){
        TextView teamBText = findViewById(R.id.txt_team_two_score);
        teamBText.setText(String.valueOf(scoreTeamB));
    }

    public void displayTouchdownPointsTeamA(View view) {
        int touchdownPoint = 6;
        addPointsTeamA(touchdownPoint);
        displayPointsTeamA();
    }

    public void displayTouchdownPointsTeamB(View view) {
        int touchdownPoint = 6;
        addPointsTeamB(touchdownPoint);
        displayPointsTeamB();
    }

    public void displayFieldGoalTeamA(View view) {
        int fieldGoalPoint = 3;
        addPointsTeamA(fieldGoalPoint);
        displayPointsTeamA();
    }

    public void displayFieldGoalTeamB(View view) {
        int fieldGoalPoint = 3;
        addPointsTeamB(fieldGoalPoint);
        displayPointsTeamB();
    }

    public void displaySafetyTeamA(View view) {
        int safetyPoint = 2;
        addPointsTeamA(safetyPoint);
        displayPointsTeamA();
    }

    public void displaySafetyTeamB(View view) {
        int safetyPoint = 2;
        addPointsTeamB(safetyPoint);
        displayPointsTeamB();
    }

    public void resetTeamScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayPointsTeamA();
        displayPointsTeamB();
    }
}
