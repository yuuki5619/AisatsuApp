package jp.techacademy.satou.aisatsuapp

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() , View.OnClickListener {

    var Hour =0
    var Minute=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener(this)




    }


    override fun onClick(v: View?) {
        var calender = Calendar.getInstance()
        Hour = calender.get(Calendar.HOUR_OF_DAY)
        Minute = calender.get(Calendar.MINUTE)
        if (2 <= Hour && Hour <= 9) {
            showTimePickerDialog()
        } else if (10 <= Hour && Hour <= 17){
            showTimePickerDialog2()
        } else if (18 <= Hour && Hour <= 23){
            showTimePickerDialog3()
        } else if (0 <= Hour && Hour <= 1){
            showTimePickerDialog3()
        }

    }


    private fun showTimePickerDialog(){
    val timePickerDialog = TimePickerDialog(
        this,
        TimePickerDialog.OnTimeSetListener { view, hour, minute ->
            textview.text="おはよう"
        },
        Hour,Minute,true)
        timePickerDialog.show()


    }
    private fun showTimePickerDialog2(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                textview.text="こんにちは"
            },
            Hour,Minute,true)
        timePickerDialog.show()


    }

    private fun showTimePickerDialog3(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                textview.text="こんばんは"
            },
            Hour,Minute,true)
        timePickerDialog.show()


    }



}

