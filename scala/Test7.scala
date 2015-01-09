package scala

object Test7 {

	def main(args:Array[String]){
		var treasureMap=Map[Int,String](1->"张三",2->"李四",1->"王五");
		println(treasureMap.keySet)
		println(treasureMap.values)
		treasureMap.iterator
		for((k,v)<-treasureMap){
		  println(k+"="+v)
		}
		
		println(treasureMap.get(1))
		
	}
  
}