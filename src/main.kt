fun main() {
    println(Person("omar",32)); //Person(name=omar, age=32)
    println(Person1("omar",32));//Person1@506e1b77
}

//ata class must have all pros defined in its primary constructor,
// the primary constructor is required not private because
// the generated copy() method will expose its primary constructor.
// Data class can’t hide all its constructors.
//I always treat data class as something that sounds not bad but never works well.
// I suggest you not pay so much attention into data class. If you want a value-base class,
// just write it as how you write with Java.
data class Person(val name: String, val age: Int);



//normal class
class Person1(name: String, age: Int) {
    var name: String = name;
    var age: Int = age;
}