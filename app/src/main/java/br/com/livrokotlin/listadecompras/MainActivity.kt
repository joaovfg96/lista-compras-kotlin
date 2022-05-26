package br.com.livrokotlin.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val produtosAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        list_view_produtos.adapter = produtosAdapter

        btn_inserir.setOnClickListener {
            val produto = txt_produto.text.toString()

            produtosAdapter.add(produto)
        }

    }
}