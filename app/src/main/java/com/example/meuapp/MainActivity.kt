package com.example.meuapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun calculo(componente: View) {

        val nome = et_texto.text.toString()

        val notaUm = et_texto1.text.toString().toInt()

        val notaDois = et_texto2.text.toString().toInt()

        val notaSoma = (notaUm + notaDois) / 2

        if (nome == "") {
            tv_resultado.text = "Por favor, preencha o primeiro campo com o nome do aluno."
            tv_resultado.visibility = View.VISIBLE
        } else {

            if (notaUm < 0 || notaUm > 10 || notaDois < 0 || notaDois > 10) {

                tv_resultado.text = "Só serão aceitos números entre 0 e 10. Por favor, corrija os" +
                        " valores digitados."
                tv_resultado.visibility = View.VISIBLE
            } else {

                if (notaSoma >= 5) {
                    tv_resultado.text =
                        "O aluno(a) ${nome} foi aprovado, e sua média foi: ${notaSoma}"
                    tv_resultado.setTextColor(Color.GREEN)
                    tv_resultado.visibility = View.VISIBLE
                } else {
                    tv_resultado.text =
                        "O aluno(a) ${nome} foi reprovado, e sua média é: ${notaSoma}"
                    tv_resultado.setTextColor(Color.RED)
                    tv_resultado.visibility = View.VISIBLE
                }
            }
        }
    }
}