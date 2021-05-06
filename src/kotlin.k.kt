fun main() {
        Introduction("Iman",18)
        students(8)
        students(5)
        students(18)
        multiply(64,38)
        division(58,2)





}
fun Introduction(name:String,age:Int){
    println("My name is $name and   I am $age years old".format(name,age))
    names("Iman","Bilal","Mahir","Anastasia","Zeddy")

}
fun students(age:Int){
    if (age<6){
        println("glass of milk")
    }
    else if (age>6 && age<15){
        println("fanta")
    }
    else{
        println("coca cola")
    }

}
fun names(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{
    var p= arrayOf(name1,name2,name3,name4,name5)
    for (x in p)
        if (x.length >4){
            println(x)
        }
    return p


}
fun multiply(numb1:Int,numb2:Int){
    var times=numb1*numb2
    println(times)

}
fun division(numb3:Int,numb4:Int){
    var divide=(numb3/numb4)
    println(divide)

}