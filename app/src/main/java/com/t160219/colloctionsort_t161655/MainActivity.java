package com.t160219.colloctionsort_t161655;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText a1;
        TextView b2;
        Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2 =(TextView) findViewById(R.id.tv2);
        a1 =(EditText) findViewById(R.id.ed1);
        btn =(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp;
                String[] numString = a1.getText().toString().split(",");
                int[] numArray = new int[numString.length];
                for(int i=0;i<numString.length;i++){
                    numArray[i]= Integer.parseInt(numString[i]);
                }
                for (int i = 0; i < numString.length; i++)

                {
                    for (int j = i + 1; j < numString.length; j++)
                    {
                        if (numArray[i] > numArray[j])
                        {
                            temp = numArray[i];
                            numArray[i] = numArray[j];
                            numArray[j] = temp;
                        }
                    }
                }
                String acs = "";
                for (int i = 0; i <= numString.length - 1; i++)
                {
                    acs += numArray[i] + ",";
                }
                b2.setText(acs);

            }
        });
    }
}
