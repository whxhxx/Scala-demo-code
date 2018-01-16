object Demo_string
{


    /***
      * main for TEST
      * @param args
      */
    def main(args: Array[String]): Unit =
    {

        val greeting : String = "hello"

        val my_buffer = new StringBuilder;
        // += for char
        my_buffer += 'a'
        // ++= for string
        my_buffer ++= "b"

        // concat func for link two strings

        var string1 = "today"
        var string2 : String = ""
        string2 = string1.concat(greeting)
        println (string2)




        print ("buff is " + my_buffer.toString())
    }
}
