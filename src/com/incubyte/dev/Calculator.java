package com.incubyte.dev;

public class Calculator {
	 public Calculator(){
	 }
     public int AddUtil(String numbers) throws NegativeNumber{
    	 int result = 0;
    	 int pointer = 0;
    	 int temp = 0;
    	 //Handling base cases
    	 if(numbers.length()==0){
    		 return 0;
    	 }else if(numbers.indexOf(',')==-1 && numbers.indexOf('\n')==-1){
    		 if(Integer.parseInt(numbers)<1000)
    		 return Integer.parseInt(numbers);
    		 else
    			 return 0;
    	 }else{
    		 for(int i=0;i<numbers.length();i++){
        		 //If the char is ',' then add the number before to result
        		 if(numbers.charAt(i)==','||numbers.charAt(i)=='\n'){
        			 temp = Integer.parseInt(numbers.substring(pointer,i));
        			 if(temp < 0)
        				 throw new NegativeNumber("negatives not allowed - "+ temp);
        			 if(temp<1000)
        			 result  = result + temp;
        			 pointer = i+1;
        		 }
        	 }
        	 //Handling the final number 
        	 if(pointer!=0){
        		 temp = Integer.parseInt(numbers.substring(pointer));
    			 if(temp < 0)
    				 throw new NegativeNumber("negatives not allowed - "+ temp);
    			 if(temp<1000)
        		 result  = result + temp;
        	 }
        	 return result;
    	 }
    	 
     }
     
     public int AddV6(String numbers) throws NegativeNumber{
    	 //if the input has no new delimiter then we use AddV3
    	 if(numbers.length()!=0 && numbers.charAt(0)=='/'){
    		 //custom delimiter
    		 int result = 0;
        	 int pointer = 4;
        	 int temp = 0;
        	 char delimiter = numbers.charAt(2);
        	 for(int i=4;i<numbers.length();i++){
        		 //If the char is ',' then add the number before to result
        		 if(numbers.charAt(i)==delimiter){
        			 temp = Integer.parseInt(numbers.substring(pointer,i));
        			 if(temp < 0)
        				 throw new NegativeNumber("negatives not allowed - "+ temp);
        			 if(temp<1000)
        			 result  = result + temp;
        			 pointer = i+1;
        		 }
        	 }
        	 //Handling the final number 
        	 if(pointer!=0){
        		 temp = Integer.parseInt(numbers.substring(pointer));
    			 if(temp < 0)
    				 throw new NegativeNumber("negatives not allowed - "+ temp);
    			 if(temp<1000)
        		 result  = result + temp;
        	 }
        	 return result;
    	 }else{
    		 try {
    			 return this.AddUtil(numbers);
			} catch (Exception e) {
				throw e;
			}
    		 
    	 }
    	 
     }
     
 
  
}
