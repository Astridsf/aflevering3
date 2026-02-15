package com.example.lib

import java.time.LocalDate

/*
Write a class: RedditPost

A Redditpost has :

A date of which is has been posted

An author

A balance of upvotes / downvotes

A Title

When a new instance of RedditPost is instantiated:

The current date will be generated.

The balance of upvotes and downvotes starts at 1.

The title and author has to be provided by the constructor.

Ensure all attributes are private, but accesible by getters & setters.

Implement functionality such that redditposts can be sorted by upvotes/downvotes
 */



class RedditPost(private val author: String, private val title: String){

    private val date: LocalDate? = LocalDate.now()

    var _balance: Int = 1
        private set //dette gør at den er readable udefra, men kun kan ændres inde i redditpost classen
    var balance: Int
        get() = _balance
        set(value) {
            if (value >= 0) {
                _balance = value
            } else {
                println("Balance cannot be negative")
            }
        }
    fun upvote() {
        balance += 1
    }

    fun downvote() {
        balance -= 1

    }

    override fun toString(): String {
        return "RedditPost(author='$author', title='$title', date=$date, _balance=$_balance)"
    }

}




