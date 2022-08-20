import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val registration = Registration()
while (true){



    println("1-> sign in")
    println("2-> sign up")
    println("3-> list of users")
    println("4-> remove")
    println("5-> update")
    var n = scanner.nextInt()
    when(n){
        1->{
            registration.sigIn()
        }
        2->{
            registration.signUp()
        }
        3->{
            registration.list()
        }
        4->{
           registration.remove()
        }
        5->{
            registration.update()
        }
    }

}}