package ru.netology

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Long,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val comments: Comments,
    val postType: String,
    val isFavorite: Boolean
)