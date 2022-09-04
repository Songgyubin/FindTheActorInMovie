package gyul.songgyubin.data

import com.google.gson.annotations.SerializedName
import gyul.songgyubin.domain.Movie
import kotlinx.serialization.Serializable

/**
 *  "movieInfoResult": {
                         "movieInfo": {
                                        movieCd": "20209349",
                                        "movieNm": "나를 죽여줘",
                                        "movieNmEn": "Kill me now",
                                        "movieNmOg": "",
                                        "showTm": "119",
                                        "prdtYear": "2020",
                                        "openDt": "",
                                        "prdtStatNm": "후반작업",
                                        "typeNm": "장편",
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
                            },
 */
@Serializable
data class MovieInfoResult(
    @SerializedName("movieInfo")
    val movieInfo: MovieDTO
)