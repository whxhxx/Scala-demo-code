object Demo_function
{

  /**
    * 1. basic function
    * default input values can be set
    * @param a , b
    * @return Int
    */
  def addInt(a:Int = 99, b:Int = 9900): Int =
  {
    var sum : Int = 0
    sum = a + b
    return sum
  }

  /**
    * 2. function that takes multiple input parameter
    * @param args
    * @return Int
    */
  def addManyInt(args: Int*): Int =
  {
    var sum = 0
    for (arg <- args)
      {
        sum += arg
      }
    return sum
  }

  /**
    * 3. recursive function
    * @param n
    * @return
    */
  def recursiveFunction(n:Int): Int =
  {
    if (n < 1)
      //return statement won't be necessary here
      100
    else
      //return statement won't be necessary here
      n + recursiveFunction( n - 1 )
  }


  /**
   * 4.high order function. Demo with a childFunction
   */
  def childFunction(n: Int): Int =
  {
    return n * n
  }

  /**
    * 5.high order function that defines a function as its input parameter
    * @param f: a function as a parameter input
    * @param v: a normal parameter input
    * @return
    */
  def highOrderFunction(f: Int => Int, v: Int): Int = f( v )


  /**
    * 6.functions can have inner functions
    * @param a
    * @return
    */
  def outerFunction( a : Int): Int =
  {
    def innerFunction( b : Int): Int =
    {
      return b * 10
    }
    return a + innerFunction(a)
  }


  /**
   * 7.Anonymous function. To use "=>"
   */
  var mul = (x:Int, y:Int) => x * y

  println ( mul( 3 , 4 ) )


  /**
    * 8. Partial Application. To use "_"
    */

  def log(para1: String, para2: Int): Unit =
  {
    println(para1 + para2)
  }

  def demoPartialApp(): Unit =
  {
    val a : String = "this is:"
    //use a new value to bound one parameter
    val logWithPara1Bound = log(a, _ :Int)
    logWithPara1Bound(1)
    logWithPara1Bound(2)
    logWithPara1Bound(3)
  }

    /**
      * 9. Currying : take only one parameter once and yield a function with variable
       * @param x
      * @return
      */
  //Currying 1
  def cat_1(s1:String)(s2:String) =
      {
          s1 + s2
      }

  def cat_2(s1:String) = (s2:String) => s1 + s2


  /**
    *  a closure is a function that depends on variable outside the func
    */
  def closure_demo(): Unit =
  {
    var factor =3
    val multiplier = (i:Int) => i * factor
  }




  /***
    * main for TEST
    * @param args
    */
  def main(args: Array[String]): Unit =
    {
      var res1 = addInt(2,3)
      var res2 = addInt(b = 5, a = 2)
      var res3 = addManyInt(1,2,3,4)
      var res4 = recursiveFunction( n = 4 )
      var res5 = highOrderFunction( childFunction, 9)
      var res6 = outerFunction(3)
      demoPartialApp()

      var res7 = cat_1("hei")("sup")
      var res8 = cat_2("im")("OK")




      println(res8)
    }
}
