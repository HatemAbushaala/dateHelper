package com.test.appointments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class AppointmentAdapter
    (val context: Context, private val mDataset: ArrayList<Appointment>) :
    RecyclerView.Adapter<AppointmentAdapter.MyViewHolder>() {


    class MyViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // each data item is just a string in this case
        var customerName: TextView
        var startTime: TextView
        var endTime: TextView
        var container: View


        init {
            customerName = itemView.findViewById(R.id.name)
            startTime = itemView.findViewById(R.id.start)
            endTime = itemView.findViewById(R.id.end)
            container = itemView.findViewById(R.id.container)
        }


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AppointmentAdapter.MyViewHolder {
        // create a new
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_appointment, parent, false)

        return MyViewHolder(view)


    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.customerName.text = mDataset.get(position).name
        var startTime = mDataset.get(position).sTime
        var duration = mDataset.get(position).dur
        holder.startTime.text = startTime.toString()

        var endTime = startTime.addMinutes(duration)
        holder.endTime.text = endTime.toString()

        var h = 75 +  mDataset[position].dur
        holder.itemView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, h)

    }

    override fun getItemCount(): Int {
        return mDataset.size
    }
}