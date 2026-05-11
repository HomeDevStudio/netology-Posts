package ru.netology

data class AudioAttachment(override val type: String, val audio: Audio) : Attachment

data class Audio(val id: Int, val ownerId: Int, val artist: String, val title: String)
