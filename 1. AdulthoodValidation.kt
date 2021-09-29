/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// Use "const val EXAMPLE_IRL_VIDEOS" when: 
// The variable's value won't be changed,
// It'll be called multiple times throughout the entire code,
// The values won't need to be changed for years or ever.
// Note: If you need a constant variable only, use "val" instead.
// Since "const val" will make the values assigned restricted to only reading,
// And it'll be set in the code compiling stage

const val MIN_AGE_BR = 18 // age of majority in Brazil
const val MIN_AGE_JP = 21 // age of majority in Japan

fun main() { // main function! :D
    println("Hello, world!!!") // prints the well known "Hello, world"
    minAge()	// calls minAge function
}

fun minAge() { // function to verify if I'm an adult in Brazil and Japan
    val name:String		// constant variables, values assigned won't change through code execution
    	name = "Feliphe" // assigning my name, String value
    val currentAge:Int
    	currentAge = 20	// assigning my current age, Integer value
    
    println(name+" is "+currentAge+" years old!")  // It'll print the following message: "Feliphe is 20 years old!"
    
    if (currentAge >= MIN_AGE_BR && currentAge >= MIN_AGE_JP) {  // Compares my current age with age of majority in Brazil and Japan, respectively
        println("Congrats! You're an adult in both countries!")
    } else if (currentAge >= MIN_AGE_BR && currentAge < MIN_AGE_JP) { // Adult only in Brazil
        println("Well, you're an adult in Brazil, but in Japan you are not.")
    } else {
        println("You're too young for that, little boy... :)") // When no conditions are met.
    }
}