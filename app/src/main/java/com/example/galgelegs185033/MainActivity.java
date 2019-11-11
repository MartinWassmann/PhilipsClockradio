package com.example.galgelegs185033;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int keyboardSize = 28;
    Galgelogik spil = new Galgelogik();
    TextView TV;
    int antalForkerte = 0;
    ImageView Galge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] keyButtons = new Button[keyboardSize]; //https://stackoverflow.com/questions/15642104/array-of-buttons-in-android
        keyButtons[0] = (Button)findViewById(R.id.buttonA); keyButtons[0].setOnClickListener(this);
        keyButtons[1] = (Button)findViewById(R.id.buttonB); keyButtons[1].setOnClickListener(this);
        keyButtons[2] = (Button)findViewById(R.id.buttonC); keyButtons[2].setOnClickListener(this);
        keyButtons[3] = (Button)findViewById(R.id.buttonD); keyButtons[3].setOnClickListener(this);
        keyButtons[4] = (Button)findViewById(R.id.buttonE); keyButtons[4].setOnClickListener(this);
        keyButtons[5] = (Button)findViewById(R.id.buttonF); keyButtons[5].setOnClickListener(this);
        keyButtons[6] = (Button)findViewById(R.id.buttonG); keyButtons[6].setOnClickListener(this);
        keyButtons[7] = (Button)findViewById(R.id.buttonH); keyButtons[7].setOnClickListener(this);
        keyButtons[8] = (Button)findViewById(R.id.buttonI); keyButtons[8].setOnClickListener(this);
        keyButtons[9] = (Button)findViewById(R.id.buttonJ); keyButtons[9].setOnClickListener(this);
        keyButtons[10] = (Button)findViewById(R.id.buttonK); keyButtons[10].setOnClickListener(this);
        keyButtons[11] = (Button)findViewById(R.id.buttonL); keyButtons[11].setOnClickListener(this);
        keyButtons[12] = (Button)findViewById(R.id.buttonM); keyButtons[12].setOnClickListener(this);
        keyButtons[13] = (Button)findViewById(R.id.buttonN); keyButtons[13].setOnClickListener(this);
        keyButtons[14] = (Button)findViewById(R.id.buttonO); keyButtons[14].setOnClickListener(this);
        keyButtons[15] = (Button)findViewById(R.id.buttonP); keyButtons[15].setOnClickListener(this);
        keyButtons[16] = (Button)findViewById(R.id.buttonQ); keyButtons[16].setOnClickListener(this);
        keyButtons[17] = (Button)findViewById(R.id.buttonR); keyButtons[17].setOnClickListener(this);
        keyButtons[18] = (Button)findViewById(R.id.buttonS); keyButtons[18].setOnClickListener(this);
        keyButtons[19] = (Button)findViewById(R.id.buttonT); keyButtons[19].setOnClickListener(this);
        keyButtons[20] = (Button)findViewById(R.id.buttonU); keyButtons[20].setOnClickListener(this);
        keyButtons[21] = (Button)findViewById(R.id.buttonV); keyButtons[21].setOnClickListener(this);
        keyButtons[22] = (Button)findViewById(R.id.buttonX); keyButtons[22].setOnClickListener(this);
        keyButtons[23] = (Button)findViewById(R.id.buttonY); keyButtons[23].setOnClickListener(this);
        keyButtons[24] = (Button)findViewById(R.id.buttonZ); keyButtons[24].setOnClickListener(this);
        keyButtons[25] = (Button)findViewById(R.id.buttonAE); keyButtons[25].setOnClickListener(this);
        keyButtons[26] = (Button)findViewById(R.id.buttonOE); keyButtons[26].setOnClickListener(this);
        keyButtons[27] = (Button)findViewById(R.id.buttonAA); keyButtons[27].setOnClickListener(this);

        Button Start = (Button)findViewById(R.id.buttonStart);
        Start.setOnClickListener(this);

        Galge = (ImageView)findViewById(R.id.imageView);

        /*
        Button A = (Button)findViewById(R.id.buttonA);
        A.setOnClickListener(this);

        Button B = (Button)findViewById(R.id.buttonB);
        B.setOnClickListener(this);

        Button C = (Button)findViewById(R.id.buttonC);
        C.setOnClickListener(this);

        Button D = (Button)findViewById(R.id.buttonD);
        D.setOnClickListener(this);

        Button E = (Button)findViewById(R.id.buttonE);
        E.setOnClickListener(this);

        Button F = (Button)findViewById(R.id.buttonF);
        F.setOnClickListener(this);

        Button G = (Button)findViewById(R.id.buttonG);
        G.setOnClickListener(this);

        Button H = (Button)findViewById(R.id.buttonH);
        H.setOnClickListener(this);

        Button I = (Button)findViewById(R.id.buttonI);
        I.setOnClickListener(this);

        Button J = (Button)findViewById(R.id.buttonJ);
        J.setOnClickListener(this);

        Button K = (Button)findViewById(R.id.buttonK);
        K.setOnClickListener(this);

        Button L = (Button)findViewById(R.id.buttonL);
        L.setOnClickListener(this);

        Button M = (Button)findViewById(R.id.buttonM);
        M.setOnClickListener(this);

        Button N = (Button)findViewById(R.id.buttonN);
        N.setOnClickListener(this);

        Button O = (Button)findViewById(R.id.buttonO);
        O.setOnClickListener(this);

        Button P = (Button)findViewById(R.id.buttonP);
        P.setOnClickListener(this);

        Button Q = (Button)findViewById(R.id.buttonQ);
        Q.setOnClickListener(this);

        Button Rr = (Button)findViewById(R.id.buttonR);
        Rr.setOnClickListener(this);

        Button S = (Button)findViewById(R.id.buttonS);
        S.setOnClickListener(this);

        Button T = (Button)findViewById(R.id.buttonT);
        T.setOnClickListener(this);

        Button U = (Button)findViewById(R.id.buttonU);
        U.setOnClickListener(this);

        Button V = (Button)findViewById(R.id.buttonV);
        V.setOnClickListener(this);

        Button X = (Button)findViewById(R.id.buttonX);
        X.setOnClickListener(this);

        Button Y = (Button)findViewById(R.id.buttonY);
        Y.setOnClickListener(this);

        Button Z = (Button)findViewById(R.id.buttonZ);
        Z.setOnClickListener(this);

        Button AE = (Button)findViewById(R.id.buttonAE);
        AE.setOnClickListener(this);

        Button OE = (Button)findViewById(R.id.buttonOE);
        OE.setOnClickListener(this);

        Button AA = (Button)findViewById(R.id.buttonAA);
        AA.setOnClickListener(this);


         */ //Keyboard buttons that are not in an array

    }

    public void onClick(View v) {
        TV = findViewById(R.id.buttonVelkommen);

        if(R.id.buttonStart == v.getId()) {
            spil.nulstil();
            TV.setText(spil.getSynligtOrd());
            spil.logStatus();
            Galge.setImageResource(R.drawable.galge);
            antalForkerte = 0;
        }

        else if (R.id.buttonA == v.getId()) {
            spil.gætBogstav("a");
            spil.logStatus();

            if (spil.getOrdet().contains("a")) {
                TV.setText(spil.getSynligtOrd());
            }

        }

        else if (R.id.buttonB == v.getId()) {
            spil.gætBogstav("b");
            spil.logStatus();

            if (spil.getOrdet().contains("b")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonC == v.getId()) {
            spil.gætBogstav("c");
            spil.logStatus();

            if (spil.getOrdet().contains("c")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonD == v.getId()) {
            spil.gætBogstav("D");
            spil.logStatus();

            if (spil.getOrdet().contains("d")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonE == v.getId()) {
            spil.gætBogstav("e");
            spil.logStatus();

            if (spil.getOrdet().contains("e")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonF == v.getId()) {
            spil.gætBogstav("f");
            spil.logStatus();

            if (spil.getOrdet().contains("f")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonG == v.getId()) {
            spil.gætBogstav("g");
            spil.logStatus();

            if (spil.getOrdet().contains("g")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonH == v.getId()) {
            spil.gætBogstav("h");
            spil.logStatus();

            if (spil.getOrdet().contains("h")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonI == v.getId()) {
            spil.gætBogstav("i");
            spil.logStatus();

            if (spil.getOrdet().contains("i")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonJ == v.getId()) {
            spil.gætBogstav("j");
            spil.logStatus();

            if (spil.getOrdet().contains("j")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonK == v.getId()) {
            spil.gætBogstav("k");
            spil.logStatus();

            if (spil.getOrdet().contains("k")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonL == v.getId()) {
            spil.gætBogstav("l");
            spil.logStatus();

            if (spil.getOrdet().contains("l")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonM == v.getId()) {
            spil.gætBogstav("m");
            spil.logStatus();

            if (spil.getOrdet().contains("m")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonN == v.getId()) {
            spil.gætBogstav("n");
            spil.logStatus();

            if (spil.getOrdet().contains("n")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonO == v.getId()) {
            spil.gætBogstav("o");
            spil.logStatus();

            if (spil.getOrdet().contains("o")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonP == v.getId()) {
            spil.gætBogstav("p");
            spil.logStatus();

            if (spil.getOrdet().contains("p")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonQ == v.getId()) {
            spil.gætBogstav("q");
            spil.logStatus();

            if (spil.getOrdet().contains("q")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonR == v.getId()) {
            spil.gætBogstav("r");
            spil.logStatus();

            if (spil.getOrdet().contains("r")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonS == v.getId()) {
            spil.gætBogstav("s");
            spil.logStatus();

            if (spil.getOrdet().contains("s")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonT == v.getId()) {
            spil.gætBogstav("t");
            spil.logStatus();

            if (spil.getOrdet().contains("t")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonU == v.getId()) {
            spil.gætBogstav("u");
            spil.logStatus();

            if (spil.getOrdet().contains("u")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonV == v.getId()) {
            spil.gætBogstav("v");
            spil.logStatus();

            if (spil.getOrdet().contains("v")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonX == v.getId()) {
            spil.gætBogstav("x");
            spil.logStatus();

            if (spil.getOrdet().contains("x")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonY == v.getId()) {
            spil.gætBogstav("y");
            spil.logStatus();

            if (spil.getOrdet().contains("y")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonZ == v.getId()) {
            spil.gætBogstav("z");
            spil.logStatus();

            if (spil.getOrdet().contains("z")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonAE == v.getId()) {
            spil.gætBogstav("æ");
            spil.logStatus();

            if (spil.getOrdet().contains("æ")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonOE == v.getId()) {
            spil.gætBogstav("ø");
            spil.logStatus();

            if (spil.getOrdet().contains("ø")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        else if (R.id.buttonAA == v.getId()) {
            spil.gætBogstav("å");
            spil.logStatus();

            if (spil.getOrdet().contains("å")) {
                TV.setText(spil.getSynligtOrd());
            }
        }

        if (spil.erSidsteBogstavKorrekt() == false) {
            if(antalForkerte == 2) {
                Galge.setImageResource(R.drawable.forkert1);
            } else if (antalForkerte == 3) {
                Galge.setImageResource(R.drawable.forkert2);
            } else if (antalForkerte == 4) {
                Galge.setImageResource(R.drawable.forkert3);
            } else if (antalForkerte == 5) {
                Galge.setImageResource(R.drawable.forkert4);
            } else if (antalForkerte == 6) {
                Galge.setImageResource(R.drawable.forkert5);
            }
            antalForkerte++;
        }
        opdaterSkærm();
    }

    private void opdaterSkærm() {
        TV.setText("Gæt ordet: " + spil.getSynligtOrd());
        TV.append("\n\nDu har " + spil.getAntalForkerteBogstaver() + " forkerte:" + spil.getBrugteBogstaver());

        if (spil.erSpilletVundet()) {
            TV.append("\nDu har vundet");
        }
        if (spil.erSpilletTabt()) {
            TV.setText("Du har tabt, ordet var : " + spil.getOrdet());
            Galge.setImageResource(R.drawable.forkert6);
        }

    }
}
