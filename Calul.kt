import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class Calul {


    suspend fun  Calkulytor_delenie(num1:Double,num2:Double):Double{
        var otv:Double
        if (num1==0.0){
            throw
                    IllegalArgumentException("$num1 нельзя делить")
        }
        else{
            otv=num1/num2
        }
        return otv
    }

    suspend fun  Calkulytor_umnogenie(num1:Double,num2:Double):Double{
        var otv:Double
        otv=num1*num2
        return  otv
    }

    suspend fun main()= coroutineScope {
        launch {
            println("Введите сколько раз будет выполнятся код")
            var n = readLine()!!.toInt()
            for (i in 1..n) {
                delay(200)
            }

        }
    }

}