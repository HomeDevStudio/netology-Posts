package ru.netology

data class DocAttachment(override val type: String, val doc: Doc) : Attachment

data class Doc(val id: Int, val ownerId: Int, val title: String, val size: Int, val url: String)
