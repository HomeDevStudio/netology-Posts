package ru.netology

data class PhotoAttachment(override val type: String, val audio: Photo) : Attachment

data class Photo(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)