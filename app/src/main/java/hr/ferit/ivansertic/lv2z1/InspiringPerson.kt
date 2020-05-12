package hr.ferit.ivansertic.lv2z1

import android.net.Uri

data class InspiringPerson (
    val id: Int = 0,
    val name: String,
    val dateOfBirth:String,
    val dateOfDeath:String,
    val description:String,
    val quotes: MutableList<String>,
    val pictureLink: String
)