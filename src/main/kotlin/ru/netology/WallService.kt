package ru.netology

object WallService {
    var posts = emptyArray<Post>()
    var id = 1

    fun addPost(post: Post): Post {
        posts += post.copy(id = id)
        id++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArr) in posts.withIndex()) {
            if (postInArr.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        id = 1
    }

    fun size(): Int {
        return posts.size
    }
}