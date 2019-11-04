object Fibonacci {

    def fibonacci(n: Int): Int ={
        if(n == 1 || n == 2){
            n - 1
        }else{
            fibonacci(n - 2) + fibonacci(n - 1)
        }
    }

    def main(args: Array[String]): Unit = {
        var n = 10
        for (i <- 1 to n){
            print(fibonacci(i) + " ")
        }
    }

}
