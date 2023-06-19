package com.example.kotlinndemo.test
class TestClass() {
    var name: String = "";
     var age: String = "";
}

class AnotherClass(){
    var test = TestClass();

    fun abcd(){
        test.name
    }
}
