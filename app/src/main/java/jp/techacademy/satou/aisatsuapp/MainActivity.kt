package jp.techacademy.satou.aisatsuapp

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() , View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener(this)




    }


    override fun onClick(v: View?) {
        showTimePickerDialog()
    }
    private fun showTimePickerDialog(){
    val timePickerDialog = TimePickerDialog(
        this,
        TimePickerDialog.OnTimeSetListener { view, hour, minute ->
            if (2 <= hour && hour <= 9) {
                textview.text="おはよう"
            }else if(10 <= hour && hour <= 17){
                textview.text="こんにちは"
            }else if (18 <= hour && hour <= 23){
                textview.text="こんばんは"
            } else if (0 <= hour && hour <= 1){
                textview.text="こんばんは"
            }

        },
        13,0,true)
        timePickerDialog.show()


    }




}

