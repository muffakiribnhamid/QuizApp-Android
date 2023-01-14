package com.muffakir.sawall_jawab_thequizapp

import android.R
import android.content.Context

object Constants {
    const val USERNAME : String = "username"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answers"



fun getQuestions(context: Context):ArrayList<Question>{
    val drawable = context.resources.getIdentifier("india.png","drawable",
        context.packageName
    )
    val questionlist = ArrayList<Question>()


    val que1= Question(
        1,
        "What is the correct syntax for a for loop in Python?",
        "for i in range(0,10):",
        "for (i=0; i<10; i++)",
        "for i = 0 to 10",
        "for (i<10; i++)",
        1
    )
    questionlist.add(que1)

    val que2= Question(
        2,
        "What is the correct syntax for a while loop in JavaScript?",
        "while i < 10",
        "while (i < 10)",
        "while (i=0; i<10; i++)",
        "while i=0 to 10",
        2
    )
    questionlist.add(que2)

    val que3= Question(
        3,
        "What is the correct syntax for an if statement in Java?",
        "if i = 10",
        "if i == 10 then",
        "if (i == 10)",
        "if (i = 10)",
        3
    )
    questionlist.add(que3)

    val que4= Question(
        4,
        "What is the correct syntax for a switch statement in C++?",
        "switch i:",
        "switch (i):",
        "switch (i=0; i<10; i++)",
        "switch i=0 to 10",
        2
    )
    questionlist.add(que4)

    val que5= Question(
        5,
        "What is the correct syntax for a do-while loop in Java?",
        "do { i++; } while (i<10);",
        "do while (i<10)",
        "do { i=0; i<10; i++ } while",
        "do while (i=0 to 10)",
        1
    )
    questionlist.add(que5)

    val que6= Question(
        6,
        "What is the correct syntax for an array in JavaScript?",
        "var myArray = [1,2,3]",
        "array myArray = (1,2,3)",
        "array myArray[1,2,3]",
        "var myArray = {1,2,3}",
        1
    )
    questionlist.add(que6)

    val que7= Question(
        7,
        "What is the correct syntax for a function in C++?",
        "function myFunc()",
        "func myFunc()",
        "void myFunc()",
        "myFunc()",
        3
    )
    questionlist.add(que7)

    val que8= Question(
        8,
        "What is the correct syntax for a class in Java?",
        "public class MyClass",
        "class MyClass",
        "public MyClass",
        "class public MyClass",
        1
    )
    questionlist.add(que8)

    val que9= Question(
        9,
        "What is the correct syntax for an if-else statement in JavaScript?",
        "if (i == 10) else",
        "if (i == 10) { } else",
        "if i == 10 else",
        "if (i = 10) else",
        2
    )
    questionlist.add(que9)

    val que10= Question(
        10,
        "What is the correct syntax for a for-in loop in Python?",
        "for i in myList:",
        "for (i=0; i<myList; i++)",
        "for i = 0 to myList",
        "for (i<myList; i++)",
        1
    )
    questionlist.add(que10)

    val que11= Question(
        11,
        "What is the correct syntax for a try-catch block in Java?",
        "try { } catch (Exception e)",
        "try (Exception e) { } catch",
        "try { } catch",
        "try (Exception e) catch",
        1
    )
    questionlist.add(que11)

    val que12= Question(
        12,
        "What is the correct syntax for a switch statement in Java?",
        "switch i:",
        "switch (i):",
        "switch (i=0; i<10; i++)",
        "switch i=0 to 10",
        2
    )
    questionlist.add(que12)

    val que13= Question(
        13,
        "What is the correct syntax for an if statement in C++?",
        "if i = 10",
        "if i == 10 then",
        "if (i == 10)",
        "if (i = 10)",
        3
    )
    questionlist.add(que13)

    val que14= Question(
        14,
        "What is the correct syntax for a while loop in C++?",
        "while i < 10",
        "while (i < 10)",
        "while (i=0; i<10; i++)",
        "while i=0 to 10",
        2
    )
    questionlist.add(que14)

    val que15= Question(
        15,
        "What is the correct syntax for a for-in loop in JavaScript?",
        "for (var i in myList) { }",
        "for in (i=0; i<myList; i++)",
        "for (i in myList; i++)",
        "for i = 0 to myList",
        1
    )
    questionlist.add(que15)

    val que16= Question(
        16,
        "What is the correct syntax for a try-catch block in C++?",
        "try { } catch (Exception e)",
        "try (Exception e) { } catch",
        "try { } catch",
        "try (Exception e) catch",
        1
    )
    questionlist.add(que16)

    val que17= Question(
        17,
        "What is the correct syntax for a class in C++?",
        "public class MyClass",
        "class MyClass",
        "class public MyClass",
        "public MyClass",
        2
    )
    questionlist.add(que17)

    val que18= Question(
        18,
        "What is the correct syntax for an if-else statement in C++?",
        "if (i == 10) else",
        "if i == 10 else",
        "if (i = 10) else",
        "if (i == 10) { } else",
        4
    )
    questionlist.add(que18)

    val que19= Question(
        19,
        "What is the correct syntax for a do-while loop in C++?",
        "do { i++; } while (i<10);",
        "do while (i<10)",
        "do { i=0; i<10; i++ } while",
        "do while (i=0 to 10)",
        1
    )
    questionlist.add(que19)

    val que20= Question(
        20,
        "What is the correct syntax for an array in Java?",
        "var myArray = [1,2,3]",
        "array myArray = (1,2,3)",
        "array myArray[1,2,3]",
        "var myArray = {1,2,3}",
        4
    )
    questionlist.add(que20)





    return questionlist

}
}