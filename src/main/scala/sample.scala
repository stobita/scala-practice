object ScalaPractice extends App{
  println("Hello Scala!")
  println("素数計算")
  println(getPrimeNumbers())
  println("フィボナッチ")
  for( i <- 1 to 30 ){
    print(getFibonacci(i) + "\t")
  }

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
  // フィボナッチ
  def getFibonacci( num: Int ): Int = {
    if( num == 1 ){
      return 1
    } else if( num == 2 ){
      return 1
    }
    return getFibonacci( num - 1 ) + getFibonacci( num - 2 )
  }
}
