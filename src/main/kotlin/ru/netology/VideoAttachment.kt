package ru.netology

data class VideoAttachment(override val type: String, val video: Video) : Attachment

data class Video(val id: Int, val ownerId: Int, val title: String, val duration: Int)