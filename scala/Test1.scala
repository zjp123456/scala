package scala

object Test1 {

  def main(args:Array[String]){
    test4(args);
  }
  
  def test1(args:Array[String]){
    println("test1")
    var i=0;
    while(i<args.length){
      print(args(i)+" ")
      i+=1;
    }
  }
  
  def test2(args:Array[String]){
    println("test2")
    args.foreach(arg=>print(arg+" "))
    println();
    args.foreach((arg:String)=>print(arg+" "))
  }
  
  def test3(args:Array[String]){
    println("test3")
    for(index<- 0 to args.length-1){
      print(args(index)+" ")
    }
  }
  
  def test4(args:Array[String]){
    println("test4")
    args.foreach(print)
  }
}