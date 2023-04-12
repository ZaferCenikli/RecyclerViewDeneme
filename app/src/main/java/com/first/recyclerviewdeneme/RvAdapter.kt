package com.first.recyclerviewdeneme

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(private val mContex:Context,private val ulkelerlistesi:List<Ulkeler>)
    :RecyclerView.Adapter<RvAdapter.CardViewGorselNesneleriTutucu>() {
    inner class CardViewGorselNesneleriTutucu(view: View):RecyclerView.ViewHolder(view){
        var satirCartView:CardView
        var satirYazi:TextView
        var noktaResim:ImageView
        init {
            satirCartView=view.findViewById(R.id.card_view)
            satirYazi=view.findViewById(R.id.satirYazi)
            noktaResim=view.findViewById(R.id.resimNokta)



        }



    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewGorselNesneleriTutucu {
        val tasarim=LayoutInflater.from(mContex).inflate(R.layout.card_tasarimi,parent,false)
        return CardViewGorselNesneleriTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return ulkelerlistesi.size

    }

    override fun onBindViewHolder(holder: CardViewGorselNesneleriTutucu, position: Int) {
        val ulke=ulkelerlistesi[position]
        holder.satirYazi.text=ulke.ulkeAdi
        holder.satirCartView.setOnClickListener {
            Toast.makeText(mContex,"Ulke:${ulke.ulkeAdi}",Toast.LENGTH_SHORT).show()
        }
        holder.noktaResim.setOnClickListener {
            val popup=PopupMenu(mContex,holder.noktaResim)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()

            /*popup.setOnMenuItemClickListener {item->

                when(item.itemId){
                    R.
                }



            }*/



        }
    }
}