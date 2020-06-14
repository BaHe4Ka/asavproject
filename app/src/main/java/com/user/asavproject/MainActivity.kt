package com.user.asavproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val exchange: Array<Array<Double> > = arrayOf(
        arrayOf(1.0, 78.55, 74.0),
        arrayOf(0.013, 1.0, 0.9),
        arrayOf(0.014, 1.11, 1.0))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputValue : EditText = findViewById <EditText> (R.id.editText)
        val convertFrom : Spinner = findViewById <Spinner> (R.id.spinnerFrom)
        val convertTo : Spinner = findViewById <Spinner> (R.id.spinnerTo)
        val buttonConvert : Button = findViewById <Button> (R.id.buttonConvert)
        val outputValue : TextView = findViewById <TextView> (R.id.textView)
        spinnerTo.setSelection(1)
        buttonConvert.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v:View?) {
                val s: String = inputValue.getText().toString();
                if (!s.isEmpty()) {
                    val checkFrom: Int = convertFrom.getSelectedItemId().toString().toInt();
                    val checkTo: Int = convertTo.getSelectedItemId().toString().toInt();

                    val sum: Int = (s.toString()).toInt();

                    outputValue.setText(((sum.toFloat()) / exchange[checkFrom][checkTo]).toString())
                }
            }
        })
    }
}