package br.com.alura.ceep.webclient.services

import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webclient.model.NotasResposta
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface NotaServices {
    @GET("notas")
    suspend fun buscaTodas(): Response<List<NotasResposta>>
}