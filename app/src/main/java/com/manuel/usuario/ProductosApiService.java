package com.manuel.usuario;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductosApiService {
    @GET("productos")
    Call<List<Productos>> productos();
}
