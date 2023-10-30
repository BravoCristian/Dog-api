package cristianjb.dog_api

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)
//lo mismo pero solo que con Seria se puede cambiar el nombre de la var
//data class DogsResponse(var status: String, var message: List<String>)