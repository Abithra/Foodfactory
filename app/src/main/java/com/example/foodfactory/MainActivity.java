package com.example.foodfactory;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button _submit;
    EditText _textname;
    EditText _textweight;
    EditText _textprice;
    EditText _textdescription;

    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_product);
        openHelper=new DatabaseHelper(this);
        _submit=(Button) findViewById(R.id.submit);
        _textname= (EditText) findViewById(R.id.textname);
        _textweight=( EditText)findViewById(R.id.textweight);
        _textprice= (EditText)findViewById(R.id.textprice);
        _textdescription=(EditText)findViewById(R.id.textdescription);
        _submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                RegisterProduct();
                DisplayProducts();
                Availability();

            }
        });



    }
     public void RegisterProduct(){
        Intent intent= new Intent(this,RegisterProduct.class);
        startActivity(intent);
     }

     public void DisplayProducts(){
         Intent intent= new Intent(this,DisplayProducts.class);
         startActivity(intent);

     }

    public void Availability(){
        Intent intent= new Intent(this,Availability.class);
        startActivity(intent);

    }


}
