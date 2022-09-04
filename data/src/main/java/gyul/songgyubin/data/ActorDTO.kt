package gyul.songgyubin.data

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

/**
"peopleNm": "장현성",
"peopleNmEn": "JANG Hyun-sung",
"cast": "민석",
"castEn": "Minsuk"
 */

@Serializable
data class ActorDTO(
    @SerializedName("peopleNm")
    val peopleName:String,
    @SerializedName("cast")
    val cast:String
)