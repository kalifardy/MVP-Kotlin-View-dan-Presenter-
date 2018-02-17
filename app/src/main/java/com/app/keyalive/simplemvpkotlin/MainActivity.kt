package com.app.keyalive.simplemvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresener()
        initView()
    }

    private fun initView() {
        btnproses.setOnClickListener {
            presenter.logicView(edtmasukan.text.toString())
        }

    }

    override fun Sucsses() {
        Toast.makeText(this,"Sucsses",Toast.LENGTH_SHORT).show()

    }

    override fun Salah() {
        Toast.makeText(this,"Edit Text harap di isi",Toast.LENGTH_SHORT).show()
    }

    private fun initPresener() {

        presenter = MainPresenter(this)
    }
}
