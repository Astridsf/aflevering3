package com.example.lib

fun main() {

    opgave1()
    opgave2og3()
    val wordList = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
    (opgave4(wordList))
    opgave5()

}

fun opgave1() {
    //Create 5 articles:
    val articles: Array<Article> = arrayOf(
        Article("Jake Knapp", "Sprint"),
        Article("Harold Kerzner", "Kerne i projektledelse"),
        Article("Cole Nussbaumer Knaflic", "Storytelling with Data"),
        Article("Bella Martin", "Universal Methods of Design"),
        Article("Alla Kholmatova", "Design Systems")
    )

    // Opret en tom MutableList til at gemme artiklerne som strings
    val articleList: MutableList<String> = mutableListOf()

    // Tilføj hver artikel til listen som en string
    for (article in articles) {
        articleList.add(article.toString())
    }

    // Print alle artikler
    println(articleList)

}

fun opgave2og3(){

    val redditPost1 = RedditPost("BlækPåFingrene", "Min nabo klager over støj – men det er ikke mig?")
    val redditPost2 = RedditPost("KaffeOgKode", "Er det uhøfligt at rette folks grammatik i arbejdsmails?")
    val redditPost3 = RedditPost("NatteUgle92", "Min chef siger jeg er for stille – men jeg laver mest arbejde?")
    val redditPost4 = RedditPost("CykelKaos", "Blev råbt ad i myldretiden, fordi jeg brugte ringeklokken?")

    println(redditPost1)
    println(redditPost2)
    println(redditPost3)
    println(redditPost4)
    redditPost1.upvote()
    redditPost2.upvote()
    redditPost2.upvote()
    redditPost2.upvote()
    redditPost2.upvote()
    redditPost3.upvote()
    redditPost3.upvote()
    redditPost3.upvote()
    redditPost4.upvote()
    redditPost4.downvote()
    redditPost4.upvote()

    val redditPostList: MutableList<RedditPost> = mutableListOf()

    redditPostList.add(redditPost1)
    redditPostList.add(redditPost2)
    redditPostList.add(redditPost3)
    redditPostList.add(redditPost4)

    val sortedPosts = redditPostList.sortedBy{ it._balance }

    println(sortedPosts)

    //opgave 3

    val postList = RedditFrontPage(redditPostList)

    // Udskriv alle posts
    println("\nPosts før sletning:")
    postList.showAllPost()

    // Slet en post ved hjælp af dens indeks
    postList.deleteRedditPost(1)

    // Udskriv alle posts igen
    println("\nPosts efter sletning:")
    postList.showAllPost()
}

//kildehenvisning: https://stackoverflow.com/questions/64692293/how-to-count-number-of-occurences-of-items-in-an-array-in-kotlin
fun opgave4(wordList: List<String>){
    val frequencyMap: MutableMap<String, Int> = HashMap()

    for (word in wordList) {
        var count = frequencyMap[word]
        if (count == null) count = 0
        frequencyMap[word] = count + 1
    }
    println(frequencyMap)
}

fun opgave5(){
    val productList: MutableList<Product> = mutableListOf(
        Product("Sko", 8),
        Product("T-shit", 3),
        Product("Bukser", 1),
        Product("Skjorte", 12),
        Product("Kasket", 5)
    )

    // Opret inventory
    val inventory = ProductInventory(productList)

    // Vis lager før ændringer
    println("Lager før ændringer:")
    inventory.displayInventory()

    // Tilføj varer
    inventory.addProducts("Sko", 2)

    // Fjern varer
    inventory.removeProducts("Bukser", 1)

    // Vis lager efter ændringer
    println("\nLager efter ændringer:")
    inventory.displayInventory()
}





