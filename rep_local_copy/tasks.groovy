

String task

print "Please input task number:"
task = System.console().readLine()
num = Integer.parseInt(task)

 
switch(num){

case 1:

  println "Calculates D.O.B - 2012 and if result is more than 17years prints - you are an adult, else prints you are not an adult"
  break

case 2:

  println "Nothing, because i is > than 5 from the start"

  break

case 3:

  println "1) Asks user for input"
  println "2) While user input is < 10 adds 1 to i and request second user input"
  println "3) If user seconf input is 0, breaks the loop"
  println "4) For each second  input, if value is not 1, prints input value"
  println "5) When loop is finished, prints - finished"
  break

case 4:
  String version
  int num
  
  print "Which version you would like to try?(type 1 or 2)"
  version = System.console().readLine()
  num     = Integer.parseInt(version)
  
  if(num == 1){
  
    int a, b, c
    
    print "please enter number:" 
    String str = System.console().readLine()
    
    a = Integer.parseInt(str)
    b = 2
    
    while(b <= 9){
    
      c = a % b
      
      //checks if the number is not prime
      if(b !=a && c == 0){
      println "your number is not prime"
      break
      }
    
      //check when number is prime 
      if(b !=a && b == 9){
      println "number is prime"
      break
      }
      
      b++
      
    }
 
  
  } else if(num == 2){
  
    int a, b, c, count
    def d
    d = [1];
    print "Please Input Number:"
    String str = System.console().readLine()
        
    a = Integer.parseInt(str)
    b = 2
    
    while(b <=9){
      c = a%b
      
      if(c==0 && a!=b){
        count++
        d.push(b)
      }
      
      b++
    }
    
    if(count<1){
      println "The number is Prime "
    }
    else{
      println "Number is Not Prime, It can be devided by " + d
    }      
  
  
  }
  
  break

case 5:

    int num1, num2, mult, summ
    String number1, number2
    
    print "Please type first Number: "
    number1 = System.console().readLine()
    print "Please type second number: "
    number2 = System.console().readLine()
    
    summ = 0
    mult = 0
    num1 = Integer.parseInt(number1)
    num2 = Integer.parseInt(number2)

    // while for positive number
    if(mult < num2){
      while(mult < num2){
      summ = summ + num1
      mult ++
      }
    }
    
    //while for neg number
    if(mult > num2){
      while(mult > num2){
      summ = summ + num1
      mult --
      }
    }
    
    // Sets the summ to + or - 
    if(num1 >0 && num2>0){
      summ = summ
    } else if(num1<0 && num2>0){
      summ = summ
    } else if(num1>0 && num2<0){
      summ = -summ
    } else if (num1<0 && num2<0){
      summ = -summ
    }
  
    println "Result: " + summ 
      
  break

case 6:

    int num1, num2, result, left
    String number1, number2
    
    print "Please type first Number: "
    number1 = System.console().readLine()
    print "Please type second number: "
    number2 = System.console().readLine()
    
    
    num1   = Integer.parseInt(number1)
    num2   = Integer.parseInt(number2)
    
    result = 0
    left   = num1

    if (num1 == num2){
      left = num1 - num2
      result++
    } 
    else if (num2 < 0 && num1 > 0){
      num2 = -num2
      while(left > num2){
        left = left - num2
        result-- 
      }
      left = -left
    }
    else if(num1 < 0 && num2 <0){
      left = -num1
      num2 = -num2   
      while(left > num2){
          left = num1 + num2
          result++ 
      }
      left = -left
    }
    else if (left >0 ){
      while(left > num2){
        left = num1 - num2
        result++
      }
    }
    else if(left <0){
    left = -left
      while(left > num2){
        left = num1 + num2
        result--
      }
      left = +left
    }

    
  println "Result : "+ result+ " and "+left+" is left"
    
  break

case 7:

    int num1, num2, num3
    String number1, number2, number3
    
    print "Please type first Number: "
    number1 = System.console().readLine()
    print "Please type second number: "
    number2 = System.console().readLine()
    print "Please type third number: "
    number3 = System.console().readLine()

    num1   = Integer.parseInt(number1)
    num2   = Integer.parseInt(number2)
    num3   = Integer.parseInt(number3)
    
    
    def arr = [num1, num2, num3];
      
    println arr.sort()
  break

case 8:

  int num 
  def arr = [] 
  boolean stop = false
  
  while(!stop){
  
    print "Please type numbers to evaluate: "
    number = System.console().readLine()    
    num   = Integer.parseInt(number)
    
    arr.push(num)
     
    if(num < 0){
    println "ste biggest value is: "+arr.max()
    stop = true;
    }
  
  }
  
  break


case 9:

    int num, num2
    String sec = "Yes"
    def arr = [] 
    
    print "Please type first Number: "
    number = System.console().readLine()    
    num   = Integer.parseInt(number)
    num2  = num
    
    arr.push(num)
    num2 = num
    
    boolean stop = false
    
    while(!stop){
    
      print "Please type first Number: "
      number = System.console().readLine()    
      num   = Integer.parseInt(number)
      
      arr.push(num)
      
      if(num -1 != num2 && num > 0){
        sec = "No"
        println "Here sequence is breaking"
      } 
      
      if (num < 0){
      stop = true
      break
      }
      
      num2 = num
  
  }
  
  println "Secuence asnwer is:"+sec

  break


 
case 10:
	int num, num2
    String sec = "Yes"
    String type = null
    def arr = [] 
    
    print "Please type number to evaluate: "
    number = System.console().readLine()    
    num   = Integer.parseInt(number)
    num2  = num
    
    arr.push(num)
    num2 = num
    
    boolean stop = false
    boolean decresing = false
    boolean increasing = false
    
    while(!stop){
    
      print "Please type first Number: "
      number = System.console().readLine()    
      num   = Integer.parseInt(number)
      
      arr.push(num)
      
      if(num-num2<0){
          decresing = true
      } else if(num-num2>0){
          increasing = true
      }
      
      if(decresing){
      
        if(num != num2-1 && num > 0){
          sec = "No"
          println "Here sequence is breaking"
        } 
        
        num2 = num
        type = "Decreasing"
      }
      
      if(increasing){
      
        if(num -1 != num2 && num > 0){
          sec = "No"
          println "Here sequence the breaking point of your sequence"
        } 
        num2 = num
        type = "Increasing"
      }
      
      if (num < 0){
        stop = true
        break
      }
  }
  
  println "Your secuence is "+type+" and the answer is: "+sec


  break  

  case 12:

  int num = 1, stop = 8,  p
  
  while(num < stop){
  
    num2 = num
    num++  
    
    p = 0
    
    while(num2>p){
      print num2
      p++
    }
    
    println ""
  }
  
  print "ldots"

  break
  
case 13:

	int num = 2, check = 2

	while(num < 1000){
	
		while(check <= 9){
			if(num%check == 0 && num > check){
				break
			} else if(check == 9){
				print " "+num
			}
			
			check++
		}
		
		check = 2
		num++
	
	}
	
	break
	
case 14:

	int num = 2, check = 2, quantity = 0

	while(quantity < 1000){
	
		while(check <= 9){
			if(num%check == 0 && num > check){
				break
			} else if(check == 9){
				print " "+num
				quantity++
			}
			
			check++
		}
		
		check = 2
		
		num++
	
	}
 
	println "This is the quantity of printed items: "+quantity


	break
 
 case 15:
 
 
	int random, num, atemp
	String str
	
	atemp  = 0
	random = Math.abs(1000 * Math.random())
	print "| to end loop number is "+random+"|Please guess my number: "
	
	str = System.console().readLine()
	num = Integer.parseInt(str)
	
	while(num != random){
	
		if(num < random){
			println  "No! My number is higher"
		} 
		if(num > random){
			println  "No! My number is lower"
		}
		
		atemp++
	
		print "Please try again: "
		str = System.console().readLine()
		num = Integer.parseInt(str)
	}
	
	atemp++
	
	println "CORRECT"
	println " You have used "+atemp+" attemptss"
	
 
	break
  
default:
println "This task was not completed"  
    break
}

