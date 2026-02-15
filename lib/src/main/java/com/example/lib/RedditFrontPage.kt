package com.example.lib

class RedditFrontPage(private val posts: MutableList<RedditPost>){

    fun showAllPost(){
        posts.forEach { println(it) }
    }

    fun deleteRedditPost(index: Int){
        posts.removeAt(index)
    }

}