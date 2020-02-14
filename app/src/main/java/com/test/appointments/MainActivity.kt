package com.test.appointments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var list = ArrayList<Appointment>()
        list.add(Appointment("Hatem",MyTime(7,30),60))
        list.add(Appointment("Hatem2",MyTime(9,30),30))
        list.add(Appointment("Hate3",MyTime(10,30),15))
        list.add(Appointment("Hatem",MyTime(17,0),75))

        var adp = AppointmentAdapter(this,list)
        rv.adapter = adp
        rv.layoutManager = LinearLayoutManager(this)



    }
}
