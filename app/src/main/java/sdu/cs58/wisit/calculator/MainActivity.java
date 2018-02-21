package sdu.cs58.wisit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //ประกาศตัวเเปร
    EditText edtNumber1,edtNumber2;
    Button addButton;
    TextView resultTextview;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวเเปรบนJAVA กับอิลิเม้นท์ XML
         edtNumber1 = findViewById(R.id.edtNumber1);
         edtNumber2 = findViewById(R.id.edtNumber2);
         addButton = findViewById(R.id.button);
         resultTextview = findViewById(R.id.txvResult);

         addButton .setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //เเปลงค่าที่รับจาก edit text เป็นตัวเลข เก็บค่าเป็นชนิด int
                 num1 = Integer.parseInt(edtNumber1.getText().toString().trim());
                 num2 = Integer.parseInt(edtNumber2.getText().toString().trim());
                 result = num1+num2;

                 //เเสดงผลลัพธ์การคำนวน
                 resultTextview.setText(result+"");

             }
         });// end set OnClickListener

    }//end on create

}//end class
