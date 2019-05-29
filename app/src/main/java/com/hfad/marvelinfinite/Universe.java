package com.hfad.marvelinfinite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Universe extends AppCompatActivity {

    //  Assigns index of related characters (3)

    int[] am = {3, 7, 10}; int[] bp = {3, 20, 2}; int[] bw = {11, 12, 3};
    int[] ca = {12, 20, 2}; int[] cm = {12, 3, 18}; int[] ds = {12, 19, 11};
    int[] dx = {18, 15, 9}; int[] fc = {3, 20, 0}; int[] gm = {18, 6, 15};
    int[] gr = {15, 18, 19}; int[] hk = {2, 3, 11}; int[] hl = {2, 19, 13};
    int[] im = {17, 3, 5}; int[] lk = {19, 11, 12}; int[] qs = {16, 10, 3};
    int[] rr = {9, 19, 18}; int[] sw = {14, 2, 10}; int[] sm = {12, 3, 5};
    int[] sl = {8, 15, 19}; int[] th = {13, 15, 3}; int[] ws = {3, 7, 1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universe);


        ImageView MCU = findViewById(R.id.mcu);

        MCU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Universe.this, Heroes.class);
                intent.putExtra("Hero List", getHeroesList());

                startActivity(intent);

            }
        });



    }

    public Character[] getHeroesList() {


        return new Character[] {
                new Character("Ant-Man", R.drawable.am, R.raw.antman, "status", "hi", am), //0
                new Character("Black Panther", R.drawable.bp, R.raw.blackpanther, "status", "hi", bp),//1
                new Character("Black Widow", R.drawable.bw, R.raw.bw, "status", "hi", bw), //2
                new Character("Captain America", R.drawable.ca, R.raw.captainamerica, "status", "hi", ca), //3
                new Character("Captain Marvel", R.drawable.cm, R.raw.cm, "status", "hi", cm), //4
                new Character("Doctor Strange", R.drawable.ds, R.raw.doctorstrange, "status", "hi", cm), //5
                new Character("Drax", R.drawable.dx, R.raw.dx, "status", "hi", dx), //6
                new Character("Falcon", R.drawable.fc, R.raw.falcon, "status", "hi", fc), //7
                new Character("Gamora", R.drawable.gm, R.raw.gm, "status", "hi", gm), //8
                new Character("Groot", R.drawable.gr, R.raw.groot, "status", "hi", gr), //9
                new Character("Hawkeye", R.drawable.hwk, R.raw.hawkeye, "status", "hi", hk), //10
                new Character("Hulk", R.drawable.hk, R.raw.hulk, "status", "hi", hl), //11
                new Character("Iron Man", R.drawable.im, R.raw.ironman, "status", "hi", im), //12
                new Character("Loki", R.drawable.lk, R.raw.loki, "status", "hi", lk), //13
                new Character("Quicksilver", R.drawable.qs, R.raw.quicksilver, "status", "hi", qs), //14
                new Character("Rocket Raccoon", R.drawable.rr, R.raw.rocketracoon, "status", "hi", rr), //15
                new Character("Scarlet Witch", R.drawable.sw, R.raw.scarletwitch, "status", "hi", sw), //16
                new Character("Spider-Man", R.drawable.sp, R.raw.spiderman, "status", "hi", sm), //17
                new Character("Star-Lord", R.drawable.sl, R.raw.starlord, "status", "hi", sl), //18
                new Character("Thor", R.drawable.th, R.raw.thor, "status", "hi", th), //19
                new Character("Winter Soldier", R.drawable.ws, R.raw.wintersoldier, "status", "hi", ws) //20

        };
    }



}
