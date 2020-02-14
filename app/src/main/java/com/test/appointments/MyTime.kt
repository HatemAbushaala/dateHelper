package com.test.appointments

import java.text.SimpleDateFormat
import java.util.*

class MyTime {
    private var timePattern = "hh:mm"
    private var hours = 0
    private var minutes = 0
    private var date : Date

    constructor()
    {
        date = Date()
        timeToString(date)

    }

    constructor(h:Int,m:Int)
    {
        this.hours = h
        this.minutes = m
        date = stringToTime("$h:$m")
    }


    fun timeToString(date : Date) : String {

        var dateString = SimpleDateFormat(timePattern).format(date)
        var l = dateString.split(":")

        this.hours = l[0].toInt()
        this.minutes = l[1].toInt()


        return dateString

    }

    fun stringToTime(str: String) : Date {

        date = SimpleDateFormat(timePattern).parse(str)
        timeToString(date)
        return date
    }

    override fun toString(): String {
        return "$hours:$minutes"
    }

    fun getHours() : Int
    {
        return this.hours
    }
    fun getMinutes() : Int
    {
        return this.minutes
    }

    fun addMinutes(minute : Int) : MyTime
    {
        this.minutes += minute
        stringToTime(toString())
        return this

    }

    fun addHour(hour : Int) : MyTime
    {
        this.hours += hour
        stringToTime(toString())
        return this

    }


    fun addHourAndMinute(hour : Int,minute : Int) : MyTime
    {
        this.hours += hour
        this.minutes += minute
        stringToTime(toString())
        return this

    }



}