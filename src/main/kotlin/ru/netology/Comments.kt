package ru.netology

data class Comments(
    val count: Int,
    val isCanPost: Boolean,
    val groupsCanPost: Int,
    val isCanClose: Boolean,
    val isCanOpen: Boolean
)
