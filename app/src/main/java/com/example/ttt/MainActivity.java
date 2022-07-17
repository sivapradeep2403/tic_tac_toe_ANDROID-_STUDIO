package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,resetbtn;

    ArrayList<Integer> playermoves = new ArrayList<>();
    ArrayList<Integer> cpumoves = new ArrayList<>();


    ArrayList<Integer> r1=new ArrayList<Integer>(Arrays.asList(1,2,3));
    ArrayList<Integer> r2=new ArrayList<Integer>(Arrays.asList(4,5,6));
    ArrayList<Integer> r3=new ArrayList<Integer>(Arrays.asList(7,8,9));

    ArrayList<Integer> c1=new ArrayList<Integer>(Arrays.asList(1,4,7));
    ArrayList<Integer> c2=new ArrayList<Integer>(Arrays.asList(2,5,8));
    ArrayList<Integer> c3=new ArrayList<Integer>(Arrays.asList(3,6,9));

    ArrayList<Integer> cr1=new ArrayList<Integer>(Arrays.asList(1,5,9));
    ArrayList<Integer> cr2=new ArrayList<Integer>(Arrays.asList(3,5,7));




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        resetbtn=findViewById(R.id.resetbtn);



      /*  r1.add(1);r1.add(2);r1.add(3);
        r2.add(4);r2.add(5);r2.add(6);
        r3.add(7);r3.add(8);r3.add(9);  */



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(1))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                    {
                    btn1.setText("X");
                    playermoves.add(1);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(2))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn2.setText("X");
                    playermoves.add(2);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(3))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn3.setText("X");
                    playermoves.add(3);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(4))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn4.setText("X");
                    playermoves.add(4);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(5))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn5.setText("X");
                    playermoves.add(5);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(6))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn6.setText("X");
                    playermoves.add(6);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(7))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn7.setText("X");
                    playermoves.add(7);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(8))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn8.setText("X");
                    playermoves.add(8);
                    cpuTurn();
                    checkWinner();
                }
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cpumoves.contains(9))
                {
                    Toast.makeText(MainActivity.this,"ALREADY PLACED",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn9.setText("X");
                    playermoves.add(9);
                    cpuTurn();
                    checkWinner();
                }
            }
        });



          resetbtn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  playermoves.clear();
                  cpumoves.clear();


                  btn1.setText("");
                  btn2.setText("");
                  btn3.setText("");
                  btn4.setText("");
                  btn5.setText("");
                  btn6.setText("");
                  btn7.setText("");
                  btn8.setText("");
                  btn9.setText("");

              }
          });


    }
//--------------------------------------------------------------------------------------------------




    public void cpuTurn()
    {
        int randomnumber=0;

        while(true)
        {
             Random r=new Random();
             randomnumber=r.nextInt(9)+1;

             if(playermoves.contains(randomnumber)) {
                 continue;
             }
             else
                 {
                 cpumoves.add(randomnumber);
                 break;
             }


        }

        switch (randomnumber)
        {
            case 1:
                  btn1.setText("O");
                  break;

            case 2:
                btn2.setText("O");
                break;

            case 3:
                btn3.setText("O");
                break;

            case 4:
                btn4.setText("O");
                break;

            case 5:
                btn5.setText("O");
                break;

            case 6:
                btn6.setText("O");
                break;

            case 7:
                btn7.setText("O");
                break;

            case 8:
                btn8.setText("O");
                break;

            case 9:
                btn9.setText("O");
                break;

        }







    }


public void checkWinner(){

        if(playermoves.containsAll(r1))
        {
            Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();
        }
        if(cpumoves.containsAll(r1))
        {
            Toast.makeText(MainActivity.this, "CPU WINS ", Toast.LENGTH_SHORT).show();
        }


        if(playermoves.containsAll(r2))
           Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();
        if(cpumoves.containsAll(r2))
           Toast.makeText(MainActivity.this,"CPU WINS ",Toast.LENGTH_SHORT).show();



       if(playermoves.containsAll(r3))
           Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();
       if(cpumoves.containsAll(r3))
           Toast.makeText(MainActivity.this,"CPU WINS ",Toast.LENGTH_SHORT).show();



        if(playermoves.containsAll(c1))
                 Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();
         if(cpumoves.containsAll(c1))
                 Toast.makeText(MainActivity.this,"CPU WINS ",Toast.LENGTH_SHORT).show();

           if(playermoves.containsAll(c2))
                Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();
            if(cpumoves.containsAll(c2))
                Toast.makeText(MainActivity.this,"CPU WINS ",Toast.LENGTH_SHORT).show();

           if(playermoves.containsAll(c3))
              Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();
              if(cpumoves.containsAll(c3))
                  Toast.makeText(MainActivity.this,"CPU WINS ",Toast.LENGTH_SHORT).show();




            if(playermoves.containsAll(cr1))
                 Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();


             if(cpumoves.containsAll(cr1))
                 Toast.makeText(MainActivity.this,"CPU WINS ",Toast.LENGTH_SHORT).show();


             if(playermoves.containsAll(cr2))
                    Toast.makeText(MainActivity.this,"PLAYER WINS ",Toast.LENGTH_SHORT).show();


               if(cpumoves.containsAll(cr2))
                     Toast.makeText(MainActivity.this,"CPU WINS ",Toast.LENGTH_SHORT).show();


}


}