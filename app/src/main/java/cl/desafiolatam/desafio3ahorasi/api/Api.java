package cl.desafiolatam.desafio3ahorasi.api;

import cl.desafiolatam.desafio3ahorasi.models.Result;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("/api.php?amount=10&category=15&difficulty=easy")
    Call<Result> getAllQuestions();
}
