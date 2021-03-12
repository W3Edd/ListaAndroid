package com.example.listaandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

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
            val texto = TextView(miContexto)
            texto.text = "General Kenobi"
            return texto
        }

    }
}