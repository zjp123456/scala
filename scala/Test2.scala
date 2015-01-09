package scala

object Test2 {
	def main(args:Array[String]){
	  test3()
	}
	
	def test1(){
	  println("test1")
	  val greetString=new Array[String](3);
	  greetString(0)="hello"
	  greetString(1)=","
	  greetString(2)="world"
	  for(i<- 0 to greetString.length-1){
	    print(greetString(i)+" ")
	  }
	}
	
	def test2(){
	  println("test2")
	  var greetString=Array("hello",",","world");
	  for(i<- 0 to greetString.length-1){
	    print(greetString(i)+" ")
	  }
	}
	
	def test3(){
	  println("test3");
	  var greetString=Array("hello",",","world");
	  greetString.update(0, "world");
	  greetString.update(2, "hello");
	  for(i<-0 to greetString.length-1){
	    print(greetString(i)+" ")
	  }
	  
	  

	}
	
	
	
	
	
	
}