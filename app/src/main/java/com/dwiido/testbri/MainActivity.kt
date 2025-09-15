package com.dwiido.testbri

import ItemData
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kartu = 0
        var qris = 0

        val tvKartu = findViewById<TextView>(R.id.tvKartu)
        val tvQris = findViewById<TextView>(R.id.tvQris)
        val rvItem = findViewById<RecyclerView>(R.id.rv_item)

        tvKartu.setOnClickListener {
            kartu = 1
            qris = 0
            if(kartu == 1){
                tvKartu.setBackgroundResource(R.drawable.bl_blue)
                tvKartu.setTextColor(resources.getColor(R.color.white))

                tvQris.setBackgroundResource(R.drawable.br_gray)
                tvQris.setTextColor(resources.getColor(R.color.black))
            } else{
                tvKartu.setBackgroundResource(R.drawable.bl_gray)
                tvKartu.setTextColor(resources.getColor(R.color.blue))

                tvQris.setBackgroundResource(R.drawable.br_blue)
                tvQris.setTextColor(resources.getColor(R.color.white))
            }
        }

        tvQris.setOnClickListener {
            qris = 1
            kartu = 0
            if(qris == 1){
                tvKartu.setBackgroundResource(R.drawable.bl_gray)
                tvKartu.setTextColor(resources.getColor(R.color.black))

                tvQris.setBackgroundResource(R.drawable.br_blue)
                tvQris.setTextColor(resources.getColor(R.color.white))
            } else{
                tvKartu.setBackgroundResource(R.drawable.bl_blue)
                tvKartu.setTextColor(resources.getColor(R.color.white))

                tvQris.setBackgroundResource(R.drawable.br_gray)
                tvQris.setTextColor(resources.getColor(R.color.black))
            }
        }

        rvItem.layoutManager = LinearLayoutManager(this)
        val listAdapter = TransactionAdapter(generateDummyData())
        rvItem.adapter = listAdapter
        rvItem.isNestedScrollingEnabled = false
        
    }
    private fun generateDummyData(): List<ItemData> {
        return listOf(
            ItemData("Kartu Debit BRI", "60901238098132", "Rp. 100.000", "31 Nov 2022", "23:59", "Purchase"),
            ItemData("Kartu Kredit BRI", "60901238098133", "Rp. 250.000", "01 Dec 2022", "14:30", "Payment"),
            ItemData("Kartu Debit BRI", "60901238098134", "Rp. 50.000", "02 Dec 2022", "09:15", "Purchase"),
            ItemData("Kartu Kredit BRI", "60901238098135", "Rp. 300.000", "03 Dec 2022", "18:45", "Refund"),
            ItemData("Kartu Debit BRI", "60901238098136", "Rp. 75.000", "04 Dec 2022", "12:00", "Purchase"),
            ItemData("Kartu Kredit BRI", "60901238098137", "Rp. 400.000", "05 Dec 2022", "20:10", "Payment"),
            ItemData("Kartu Debit BRI", "60901238098138", "Rp. 150.000", "06 Dec 2022", "16:25", "Purchase"),
            ItemData("Kartu Kredit BRI", "60901238098139", "Rp. 200.000", "07 Dec 2022", "10:50", "Refund"),
            ItemData("Kartu Debit BRI", "60901238098140", "Rp. 90.000", "08 Dec 2022", "15:30", "Purchase"),
            ItemData("Kartu Kredit BRI", "60901238098141", "Rp. 500.000", "09 Dec 2022", "21:00", "Payment")
        )
    }

}