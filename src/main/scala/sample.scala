object ScalaPractice extends App{
  println("Hello Scala!")
  println("素数計算")
  println(getPrimeNumbers())
  // 素数計算
  def getPrimeNumbers() = {
    print(2 + "\t")
    for(i <- 3 to 1000 by 2){
      var div_flg = false
      for(j <- 3 until i by 2){
        if(i%j==0){
          div_flg = true
        }
      }
      if(!div_flg){
        print(i + "\t")
      }
    }
  }
}
