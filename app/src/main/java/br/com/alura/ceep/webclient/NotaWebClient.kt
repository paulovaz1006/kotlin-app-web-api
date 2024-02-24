package br.com.alura.ceep.webclient

import br.com.alura.ceep.model.Nota
import retrofit2.Response

class NotaWebClient {
    suspend fun buscaTodas(): Response<List<Nota>> {
        val notasResposta = RetrofitInicializador().notaServies
            .buscaTodas()

       return notasResposta.map { notaResposta ->
           notaResposta.nota
       }
    }
}