package gyul.songgyubin.data

import com.google.gson.annotations.SerializedName
import gyul.songgyubin.domain.Movie
import kotlinx.serialization.Serializable

/**
 * "movieListResult": {
"totCnt": 91801,
"source": "영화진흥위원회",
"movieList": [
{
"movieCd": "20209349",
"movieNm": "나를 죽여줘",
"movieNmEn": "Kill me now",
"prdtYear": "2020",
"openDt": "",
"typeNm": "장편",
"prdtStatNm": "후반작업",
"nationAlt": "한국",
"genreAlt": "드라마",
"repNationNm": "한국",
"repGenreNm": "드라마",
"directors": [
{
"peopleNm": "최익환"
}
],
"companys": []
},
...
 */

@Serializable
data class MovieListResult(
    @SerializedName("totCnt")
    val totCnt: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("movieList")
    val movieList: List<MovieDTO>
)