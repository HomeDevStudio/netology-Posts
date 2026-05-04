package ru.netology

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun clear() {
        val post = Post(
            0,
            1,
            1,
            1,
            1,
            "text",
            1,
            1,
            1,
            Comments(1, false, 1, false, true),
            "post",
            true
        )
        WallService.addPost(post)
        WallService.clear()
        val size = WallService.size()
        assertEquals(0, size)
    }

    @Test
    fun addPost() {
        val post = Post(
            0,
            1,
            1,
            1,
            1,
            "text",
            1,
            1,
            1,
            Comments(1, false, 1, false, true),
            "post",
            true
        )
        val postAdded = WallService.addPost(post)
        assertEquals(post.copy(id = 1), postAdded)
    }

    @Test
    fun update() {
        WallService.addPost(
            Post(
                0,
                1,
                1,
                1,
                1,
                "text",
                1,
                1,
                1,
                Comments(1, false, 1, false, true),
                "post",
                true
            )
        )

        WallService.addPost(
            Post(
                0,
                2,
                2,
                2,
                2,
                "text2",
                1,
                1,
                1,
                Comments(1, false, 1, false, true),
                "post2",
                true
            )
        )

        WallService.addPost(
            Post(
                0,
                3,
                1,
                1,
                1,
                "text3",
                1,
                1,
                1,
                Comments(1, false, 1, false, true),
                "post3",
                true
            )
        )

        val update = Post(
            2,
            2,
            2,
            2,
            2,
            "text_UPDATE",
            1,
            1,
            1,
            Comments(1, false, 1, false, true),
            "post_UPDATE",
            true
        )

        val result = WallService.update(update)
        assertTrue(result)
    }
}