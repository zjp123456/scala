package scala

//mutable英语翻译是可变的，易变的，因此，这个包里面的类是可变的即执行+=这样的操作不会产生新的变量。
//import scala.collection.mutable.HashSet
//immutable不可变的
//使用HashSet必须要import引入包，或为mutable,或为immutable因为没有原生的HashSet
//HashSet继承自Set可变的HashSet继承自可变的Set不可变的HashSet继承自不可变的Set
import scala.collection.immutable.HashSet

object Test6 {
	def main(args:Array[String]){
	  test2();
	}
	def test2(){
	  var jetSet=HashSet("Boeing","Airbus");
	  var jetSet1=jetSet;
	  jetSet+="another";
	  println(jetSet1==jetSet)
	  println(jetSet)
	  println(jetSet1)
	}
}