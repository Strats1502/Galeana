package mx.gob.galeana.api;

import java.util.ArrayList;

import mx.gob.galeana.model.Publicidad;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Uriel on 10/04/2017.
 */

public interface PublicidadAPI {

    @GET("publicidad")
    Call<Response<ArrayList<Publicidad>>> get(
            @Query("timestamp") String timestamp
    );
}
