package com.example.listaandroid

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val lista = findViewById<ListView>(R.id.list_View)
		lista.adapter = MiAdaptador(this)
	}

	private class MiAdaptador(contexto: Context) : BaseAdapter() {
		private val miContexto: Context = contexto

		override fun getCount(): Int {
			return 17
		}

		override fun getItem(position: Int): Any {
			TODO("Not yet implemented")
		}

		override fun getItemId(position: Int): Long {
			return position.toLong()
		}

		override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
			val layourInflater = LayoutInflater.from(miContexto)
			val listRowLayout = layourInflater.inflate(R.layout.fila_lista, parent, false)
			listRowLayout.findViewById<TextView>(R.id.aTitle).text = "Hello there # $position"
			listRowLayout.findViewById<TextView>(R.id.subtitle).text = "General Kenobi  # $position"
			val image = listRowLayout.findViewById<ImageView>(R.id.listImage)
			Glide.with(miContexto)
				.load("https://amigos-informaticos.github.io/GourmetRacePWA/images/logo512.png")
				.centerCrop()
				.apply(RequestOptions.overrideOf(200, 200))
				.into(image)
			return listRowLayout
		}
	}
}