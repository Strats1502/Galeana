package mx.gob.galeana.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mx.gob.galeana.model.DatosModificarPerfil;
import mx.gob.galeana.model.DatosUsuario;
import mx.gob.galeana.model.DatosUsuarioIdioma;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by codigus on 04/07/2017.
 */

public interface RegistroModificarPerfil {

    @POST("profile/update")
    Call<Response<Boolean>> postModificarPerfil (
            @Body Object request
    );

    @POST("profile/get")
    Call<Response<DatosModificarPerfil>> getModificarPerfil (
            @Query("api_token") String apiToken
    );

}
