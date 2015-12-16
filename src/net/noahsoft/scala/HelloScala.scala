package net.noahsoft.scala

/**
  * Created by marmot on 15/12/2.
  */
object HelloScala {

    def main(args: Array[String]) {

        val arg = if (args.isEmpty) "world!" else args(0)
        println("Hello, " + arg)

    }
}
