package scala

object Test3 {
	
	
	
	def test1(){
	  println("test1")
	  var oneTwoThree=List(1,2,3);
	  //println(oneTwoThree)
	  var oneTwo=List(1,2)
	  var threeFour=List(3,4)
	  var oneTwoThreeFour=oneTwo:::threeFour;
	  println(oneTwoThreeFour)
	}
	
	def test2(){
	  println("test2")
	  var twoThree=List(2,3);
	  var oneTwoThree=1::twoThree;
	  println(oneTwoThree)
	}
	
	def test3(){
	  println("test3")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var oneTwoThree=1::2::3::Nil
	  println(oneTwoThree);
	}
	
	
	def test4(){
	  println("test4")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::","::"world"::Nil
	  println(greetString(2));
	}
	
	def test5(){
	  println("test5")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.drop(1));
	  println(greetString.length)
	}
	
	def test6(){
	  println("test6")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.dropRight(2));
	  println(greetString.length)
	}
	
	
	def test7(){
	  println("test7")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.count(s=>s.length()==5));
	  println(greetString.count(s=>s.length()==1));
	}
	
	
	def test8(){
	  println("test8")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.filter(s=>s.length()==1))
	  println(greetString.length)
	  for(i<-0 to greetString.length-1){
	    println(greetString(i))
	  }
	}
	
	def test9(){
	  println("test9")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.forall(s=>s.length()==5))
	  greetString="hello"::";;;;;"::"world"::Nil;
	  println(greetString.forall(s=>s.length()==5));
	}

	def test10(){
	  println("test10")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.head)
	  
	}	
	
	def test11(){
	  println("test11")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.init)
	}	

	
	def test12(){
	  println("test12")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.isEmpty)
	}	

	def test13(){
	  println("test13")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.last)
	}	
	
	def test14(){
	  println("test14")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.length)
	}		

	def test15(){
	  println("test16")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.map(s=>s+"y"))
	}

	def test16(){
	  println("test16")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.mkString(""))
	}
	
//	def test17(){
//	  println("test17")
//	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
//	  var greetString="hello"::";"::"world"::Nil
//	  println(greetString.remove(s=>s.length==5))
//	}

	def test18(){
	  println("test18")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.reverse)
	}

	def test19(){
	  println("test19")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="hello"::";"::"world"::Nil
	  println(greetString.sorted)
	}

	def test20(){
	  println("test20")
	  // oneTwoThree=1::2::3; wrong Nil is the end of symbol for this list
	  var greetString="B"::"c"::"A"::Nil;
	  println(greetString.tail)
	}
	
	def main(args:Array[String]){
	  test20()
	}
	
	
	
}