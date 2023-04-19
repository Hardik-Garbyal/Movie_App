package com.tutorials.movieapp.service;

import com.tutorials.movieapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    //BASE - https://api.themoviedb.org/3/
    //
    // end point - movie/popular?api_key=329ee5d0db8699644e7af1d358d31d71
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
