package mx.com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int TeamScoreA=0;
int TeamScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void display(int teamScoreA) {
        TextView TeamAValue=(TextView) findViewById(R.id.TeamAValue);
        TeamAValue.setText(""+TeamScoreA);
    }
    public void TrPuntosEquipoA(View view) {
        TeamScoreA=TeamScoreA+3;
        display(TeamScoreA);
    }


    public void DsPuntosEquipoA(View view) {
        TeamScoreA=TeamScoreA+2;
        display(TeamScoreA);
    }

    public void UnPuntoEquipoA(View view) {
        TeamScoreA=TeamScoreA+1;
        display(TeamScoreA);
    }
    private void displayB(int teamScoreB) {
        TextView TeamBValue=(TextView) findViewById(R.id.TeamBValue);
        TeamBValue.setText(""+TeamScoreB);
    }
    public void TrPuntosEquipoB(View view) {
        TeamScoreB=TeamScoreB+3;
        displayB(TeamScoreB);
    }

    public void DoPuntosEquipoB(View view) {
        TeamScoreB=TeamScoreB+2;
        displayB(TeamScoreB);
    }

    public void UnPuntoEquipoB(View view) {
        TeamScoreB=TeamScoreB+1;
        displayB(TeamScoreB);
    }

    public void reiniciar(View view) {
        TeamScoreB=0;
        TeamScoreA=0;
        displayB(TeamScoreB);
        display(TeamScoreA);
    }
}