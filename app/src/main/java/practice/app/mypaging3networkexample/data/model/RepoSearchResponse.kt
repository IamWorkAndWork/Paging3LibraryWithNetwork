package practice.app.mypaging3networkexample.data.model

import com.google.gson.annotations.SerializedName
import java.lang.Exception

data class RepoSearchResponse(

    @SerializedName("total_count")
    val total: Int = 0,

    @SerializedName("items")
    val items: List<Repo> = emptyList(),

    val nextPage: Int? = null

)
