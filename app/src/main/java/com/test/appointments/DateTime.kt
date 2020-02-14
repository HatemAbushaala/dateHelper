package com.test.appointments

import java.text.SimpleDateFormat
import java.util.*

class DateTime {

    var date : MyDate
    var time : MyTime
    var dateTimePattern = "yyyy-MM-dd hh:mm"


    constructor()
    {
        date = MyDate()
        time = MyTime()
    }

    constructor(date: MyDate,time: MyTime)
    {
        this.date = date
        this.time = time
    }

    fun getDate() : Date
    {
       return stringToDate(getDateString())
    }

    fun getDateString() : String
    {
        return  date.toString() + " " + time.toString()
    }

    fun stringToDate(str: String) : Date { return SimpleDateFormat(dateTimePattern).parse(str) }

}