package com.example.lib

/*
Write a class: Article
An article has an author and a title
Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method
*/

//Base class
class Article (
    public val author: String,
    public val title: String
){

    override fun toString(): String{
        return "Article: '$author', '$title'"
    }
}