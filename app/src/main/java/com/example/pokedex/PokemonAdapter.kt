package com.example.pokedex

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class PokemonAdapter(var listofpokemon: List<pokemon>) :
    RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tv_name: TextView
        var tv_description: TextView
        var iv_icon: ImageView

        init {
            tv_name = itemView.findViewById(R.id.tv_name)
            tv_description = itemView.findViewById(R.id.tv_description)
            iv_icon = itemView.findViewById(R.id.iv_icon)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val myView =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false)
        return PokemonViewHolder(myView)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val context = holder.itemView.context
        holder.tv_name.text = listofpokemon[position].name!!
        holder.tv_description.text = listofpokemon[position].description!!
        holder.iv_icon.setImageResource(listofpokemon[position].image!!)

        //intent
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("name", listofpokemon[position].name!!)
            intent.putExtra("description", listofpokemon[position].description!!)
            intent.putExtra("image", listofpokemon[position].image!!)
            context!!.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listofpokemon.size
    }
}