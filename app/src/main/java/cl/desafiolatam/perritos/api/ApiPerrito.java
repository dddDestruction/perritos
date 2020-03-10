package cl.desafiolatam.perritos.api;

import cl.desafiolatam.perritos.model.Pojo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiPerrito {
    @GET("/api/breeds/list/all")
    Call<Pojo> perritos();
}
