package com.first.recyclerviewdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var ulkelerlist:ArrayList<Ulkeler>
    lateinit var adapter:RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvView.setHasFixedSize(true)
       // rvView.layoutManager=LinearLayoutManager(this@MainActivity)
        rvView.layoutManager= StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)


        val u1=Ulkeler(1,"Türkiye")
        val u2=Ulkeler(2,"Almanya")
        val u3=Ulkeler(3,"Japonya")
        val u4=Ulkeler(4,"Çin")
        val u5=Ulkeler(5,"Acaristan")


        ulkelerlist= ArrayList<Ulkeler>()
        ulkelerlist.add(u1)
        ulkelerlist.add(u2)
        ulkelerlist.add(u3)
        ulkelerlist.add(u4)
        ulkelerlist.add(u5)

        adapter= RvAdapter(this@MainActivity,ulkelerlist)

        rvView.adapter=adapter

    }
}