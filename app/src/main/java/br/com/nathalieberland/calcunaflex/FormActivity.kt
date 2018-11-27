package br.com.nathalieberland.calcunaflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

    btCalculate.setOnClickListener {it^:View!
    val proximaTela = Intent(packageontent: this, ResultActivity: class.java)
        proximaTela.putExtra (name:"GASPRICE", etGasPrice.text.toString)
        proximaTela.putExtra (name:"ETHANOL_PRICE", etEthanolPrice.text.toString)
        proximaTela.putExtra (name:"GAS_AVERAGE", etGasAverage.text.toString)
        proximaTela.putExtra (name:"ETHANOL_AVERAGE", etEthanolAverage.text.toString())
        startActivity(proximaTela)
    }


}
