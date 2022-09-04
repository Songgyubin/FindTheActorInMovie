package gyul.songgyubin.domain

data class Movie(
    val movieCode: String,
    val movieName: String,
    val openDate: String,
    val actors: List<Actor>?
)