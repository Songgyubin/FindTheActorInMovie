package gyul.songgyubin.data

import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("movie/searchMovieList.json")
    suspend fun searchMovieWithMovieName(
        @Query("key") key: String = BuildConfig.MOVIE_KEY,
        @Query("movieNm") movieName: String
    ): MovieListResult

    @GET("movie/searchMovieInfo.json")
    suspend fun getMovieInfo(
        @Query("key") key: String = BuildConfig.MOVIE_KEY,
        @Query("movieCd") movieName: String
    ): MovieInfoResult

}