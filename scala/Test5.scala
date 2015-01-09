package scala

//原生Set是不可变的
//添加可变Set集合，<<scall编程>>中翻译有误
//import scala.collection.mutable.Set
//添加不可变可变Set集合，<<scall编程>>中翻译有误
//import scala.collection.immutable.Set

//可变和不可变的集合均继承自原生的Set集合即，什么也不引入的Set

object Test5 {

	def main(args:Array[String]){
	  test1();
	}
	
	def test1(){
	  var jetSet=Set("Boeing","Airbus");
	  var jetSet1=jetSet;
	  println(jetSet)
	  jetSet+="Lear"
	  println(jetSet1==jetSet)
	  println(jetSet.contains("hello"))
	  println(jetSet.contains("Lear"))
	}
	
}