import sun.awt.AppContext

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world!!!")
            println(AppContext.getAppContext())
        }
    }
}