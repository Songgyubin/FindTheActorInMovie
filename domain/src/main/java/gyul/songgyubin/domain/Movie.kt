package gyul.songgyubin.domain

/**
 * 영화 목록 받아올 때 사용
 */
data class Movie(
    val movieCode:String,
    val movieName:String,
    val openDate:String
)