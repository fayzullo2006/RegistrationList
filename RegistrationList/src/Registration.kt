//@@ -0,0 +1,105 @@
import java.util.*
import kotlin.collections.ArrayList
class Registration:Registrations {
    var scanner = Scanner(System.`in`)
    var list:ArrayList<Registration> = ArrayList()
    var count = 0
    data class Registration(var name:String, var year:Int, var password:Int,var count:Int){
    }

    override fun sigIn() {
        print("Enter name: ")
        val name = scanner.next()
        print("Enter age: ")
        val year = scanner.nextInt()
        print("Enter password: ")
        val password = scanner.nextInt()
        println()
        count++
        list.add(Registration(name, year, password,count))

    }

    override fun signUp() {
        print("Enter name: ")
        val name = scanner.next()

        print("Enter password: ")
        val password = scanner.nextInt()
        for (i in list){
            if (password==i.password&&name.equals(i.name)){
                println("succes")
            }
            else {
                println("name or password error")
            }
            println()
        }



    }

    override fun list() {
        list.forEach { registration ->
            println( " Name: "+ registration.name )
            println("Year: "+ registration.year )
            println("Index: "+ registration.count )
            println("Password "+"*********")
            println()
        }
    }

    override fun remove() {
        try {


            print("Enter name: ")
            val name = scanner.next()

            print("Enter password: ")
            val password = scanner.nextInt()
            list.forEach { registration -> if (password==registration.password&&name.equals(registration.name)){

                list.removeIf { r-> name.equals(r.name) }
                println("succes")
            }
            else {
                println("name or password error")
            } }}catch (e:Exception){
            println()
        }



    }

    override fun update() {
        try {


            print("Enter name: ")
            val name = scanner.next()


            print("Enter password: ")
            val password = scanner.nextInt()
            list.forEach { registration ->
                if (password==registration.password&&name.equals(registration.name)){
                    print("Enter new name: ")
                    val names = scanner.next()
                    print("Enter new age: ")
                    val year = scanner.nextInt()
                    print("Enter new password: ")
                    val passwords = scanner.nextInt()
                    println("Enter index ")
                    val c  = scanner.nextInt()
                    list.set(c,Registration(names, year, passwords,c))
                    println("succes")
                }

                println()
            }}catch (e:Exception){
            println("name or password error")
        }}}