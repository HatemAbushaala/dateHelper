package com.test.appointments

import java.text.SimpleDateFormat
import java.util.*

class MyDate  {

   private var date : Date
    private var year : Int
    private var month : Int
    private var day : Int
    private  var datePattern = "yyyy-MM-dd"

    constructor()
    {
        date = Date()
        var s = dateToString(date)
        var l = s.split("-")

        this.day = l[2].toInt()
        this.month = l[1].toInt()
        this.year = l[0].toInt()
    }

    constructor(year: Int,month: Int,day: Int)
    {
        this.day = day
        this.month = month
        this.year = year


        date = stringToDate("$year-$month-$day")
    }


    fun dateToString(date : Date) : String { return SimpleDateFormat(datePattern).format(date) }

    override fun toString(): String {
        return "$year-$month-$day"
    }

    fun stringToDate(str: String) : Date { return SimpleDateFormat(datePattern).parse(str) }



    fun getYear() : Int {
        return this.year
    }


    fun getMonth() : Int {
        return this.month
    }


    fun getDay() : Int {
        return this.day
    }

}