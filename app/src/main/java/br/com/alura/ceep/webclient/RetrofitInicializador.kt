package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.services.NotaServices
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitInicializador {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.1.105:8080/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val notaServies = retrofit.create(NotaServices::class.java)
}