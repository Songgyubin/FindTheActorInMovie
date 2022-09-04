package gyul.songgyubin.data

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

/**
 *  "movieCd": "20209349",
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
"actors": [
{
"peopleNm": "장현성",
"peopleNmEn": "JANG Hyun-sung",
"cast": "민석",
"castEn": "Minsuk"
},
{
"peopleNm": "안승균",
"peopleNmEn": "",
"cast": "현재",
"castEn": "Hyunjae"
},
]
"companys": []
 */

/**
 * @param actors: 영화 상세 정보에서만 받아올 수 있음
 */

@Serializable
data class MovieDTO(
    @SerializedName("movieCd")
    val movieCode: String,
    @SerializedName("movieNm")
    val movieName: String,
    @SerializedName("openDt")
    val openDate: String,
    @SerializedName("actors")
    val actors: List<ActorDTO>?
)