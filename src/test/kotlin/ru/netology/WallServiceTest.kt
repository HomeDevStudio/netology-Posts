package ru.netology

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class WallServiceTest {

    var attachmentArray: Array<Attachment> = emptyArray()

    @Before
    fun clearBeforeTest() {
        WallService.clear()

        attachmentArray += PhotoAttachment(
            "photo",
            Photo(1, 1, "https://vk.com/some_photo_link", "https://vk.com/another_photo_link")
        )

        attachmentArray += VideoAttachment("video", Video(1, 1, "A Funny Video", 30))

        attachmentArray += AudioAttachment("audio", Audio(1, 1, "Scorpions", "Wind of change"))

        attachmentArray += DocAttachment("doc", Doc(1, 1, "doc", 10_000, "https://vk.com/another_photo_link"))

        attachmentArray += AppAttachment(
            "app",
            App(1, "app", "https://vk.com/some_photo_link", "https://vk.com/another_photo_link")
        )
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
            true,
            attachmentArray
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
            true,
            attachmentArray
        )
        val postAdded = WallService.addPost(post)
        assertEquals(post.copy(id = 1), postAdded)
    }

    @Test
    fun updateIsTrue() {
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
                true,
                attachmentArray
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
                true,
                attachmentArray
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
                true,
                attachmentArray
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
            true,
            attachmentArray
        )

        val result = WallService.update(update)
        assertTrue(result)
    }

    @Test
    fun updateIsFalse() {
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
                true,
                attachmentArray
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
            true,
            attachmentArray
        )

        val result = WallService.update(update)
        assertFalse(result)
    }
}