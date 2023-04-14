import kotlin.contracts.Returns

//KOTLIN FUNCTIONS.
//Kotlin Object-Oriented Programme
//This is a technique used to break a complex problem into smaller bits by creating objects
//We have objets which have different states ,behaviours and attributes.
       //example :object(calculator)
       //functions/behavours include:addition, sabtraction,divission etc.


fun main(){
    var value = Calculator(625,25.0)
    value.addition()
    value.subtraction()
    value.division()
    value.multiplication()


    var toyota = Car("KBD 563H",60.0,0)
    toyota.start()
    toyota.speed
    println(toyota.speed)
    toyota.decelerate(72)
    println(toyota.speed)
    toyota.register()


    println(Vehicles("Mazda",40))

}

//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers

 class Calculator(var number1: Int, var number2: Double) {
     fun addition(){
         var sum = number1 + number2
         println(sum)
     }
     fun subtraction(){
         var difference = number1 - number2
         println(difference)
     }
     fun division(){
         var divide = number1 / number2
         println(divide)
     }
     fun multiplication(){
         var product = number1 * number2
         println(product)
         }
     }
// Write a function that takes in a list of Car objects each with a
//registration,speed,start attribute and returns the speed
//of the object.
class Car(var registration:String,var speed:Double,var start:Int){
    fun start(){
        println("start journey")
    }
    fun decelerate(deceleration:Int): Double {
        speed = speed - deceleration
        return speed
    }
    fun register (){
        println(registration)
    }

}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Vehicles(var registration:String,var mileage:Int)

fun Vehicles(listOfVehicles:List<Vehicles>): Double {
    var sum =listOf<Int>()

    for(vehicle in listOfVehicles) {
        sum += vehicle.mileage
    }
    return (sum.average())
//    println(sum)
}



