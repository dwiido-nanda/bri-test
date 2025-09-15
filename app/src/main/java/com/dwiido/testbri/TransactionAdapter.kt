package com.dwiido.testbri

import ItemData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter(private val ItemDataList: List<ItemData>) :
    RecyclerView.Adapter<TransactionAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardNameText: TextView = itemView.findViewById(R.id.cardNameText)
        val cardNumberText: TextView = itemView.findViewById(R.id.cardNumberText)
        val amountText: TextView = itemView.findViewById(R.id.amountText)
        val dateText: TextView = itemView.findViewById(R.id.dateText)
        val timeText: TextView = itemView.findViewById(R.id.timeText)
        val ItemDataTypeText: TextView = itemView.findViewById(R.id.ItemDataTypeText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemData = ItemDataList[position]
        holder.cardNameText.text = ItemData.cardName
        holder.cardNumberText.text = ItemData.cardNumber
        holder.amountText.text = ItemData.amount
        holder.dateText.text = ItemData.date
        holder.timeText.text = ItemData.time
        holder.ItemDataTypeText.text = ItemData.ItemDataType
    }

    override fun getItemCount(): Int = ItemDataList.size
}

