package edu.itszapopan.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private Calculadora cal = null;
    private EditText display = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (cal == null) cal = new Calculadora();
        display = (EditText) findViewById(R.id.txtDisplay);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClickNum(View v){
    	switch (v.getId()){
    	  case R.id.btnPunto:
              cal.addPunto();
		  break;
    	  case R.id.btn0:
              cal.add('0');
		  break;
    	  case R.id.btn1:
              cal.add('1');
		  break;
    	  case R.id.btn2:
              cal.add('2');
		  break;
    	  case R.id.btn3:
              cal.add('3');
		  break;
    	  case R.id.btn4:
              cal.add('4');
		  break;
    	  case R.id.btn5:
              cal.add('5');
		  break;
    	  case R.id.btn6:
              cal.add('6');
		  break;
    	  case R.id.btn7:
              cal.add('7');
		  break;
    	  case R.id.btn8:
              cal.add('8');
		  break;
    	  case R.id.btn9:
              cal.add('9');
		  break;
    	}
    	display.setText(cal.get());
    }

    public void onClickOp(View v){
    	switch (v.getId()){
    	  case R.id.btnEntre:
              cal.setOp(Calculadora.DIVISION);
		  break;
    	  case R.id.btnPor:
    		  cal.setOp(Calculadora.MULTIPLICACION);
		  break;
    	  case R.id.btnMenos:
    		  cal.setOp(Calculadora.RESTA);
		  break;
    	  case R.id.btnMas:
    		  cal.setOp(Calculadora.SUMA);
		  break;
    	  case R.id.btnIgual:
    		  cal.setOp(Calculadora.IGUAL);
    		  display.setText(cal.get());
		  break;
    	}
    }
    
}
