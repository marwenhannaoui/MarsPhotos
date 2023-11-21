
package com.example.marsphotos.ui
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MarsPhoto(
    val id: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)
