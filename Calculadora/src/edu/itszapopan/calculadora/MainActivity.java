package edu.itszapopan.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClickNum(View v){
    	EditText display = (EditText) findViewById(R.id.txtDisplay);
    	
    	switch (v.getId()){
    	  case R.id.btnPunto:
    		  display.append(".");
		  break;
    	  case R.id.btn0:
    		  display.append("0");
		  break;
    	  case R.id.btn1:
    		  display.append("1");
		  break;
    	  case R.id.btn2:
    		  display.append("2");
		  break;
    	  case R.id.btn3:
    		  display.append("3");
		  break;
    	  case R.id.btn4:
		  break;
    	  case R.id.btn5:
		  break;
    	  case R.id.btn6:
		  break;
    	  case R.id.btn7:
		  break;
    	  case R.id.btn8:
		  break;
    	  case R.id.btn9:
		  break;
    	}
    }

    public void onClickOp(View v){
    	switch (v.getId()){
    	  case R.id.btnEntre:
		  break;
    	  case R.id.btnPor:
		  break;
    	  case R.id.btnMenos:
		  break;
    	  case R.id.btnMas:
		  break;
    	  case R.id.btnIgual:
		  break;
    	}
    }
    
}
