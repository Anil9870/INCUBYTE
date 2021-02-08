package com.incubyte.dev;

public class Calculator {
	 public Calculator(){
	 }
     public int Add(String numbers){
    	 int result = 0;
    	 //Assuming the string has only 2 numbers
    	 //If length is zero, its an empty string
    	 if(numbers.length()==0){
    		 return 0;
    	 }else if(numbers.indexOf(',')==-1){
    		 //we have only one number
    		 return Integer.parseInt(numbers);
    	 }else{
    		 //Both the numbers are present
    		 int first = Integer.parseInt( numbers.substring(0, numbers.indexOf(',')));
        	 int second =Integer.parseInt( numbers.substring(numbers.indexOf(',')+1));
        	 return first+second;
    	 }
    	 
     }
     public int AddV2(String numbers){
    	 int result = 0;
    	 int pointer = 0;
    	 //Handling base cases
    	 if(numbers.length()==0){
    		 return 0;
    	 }else if(numbers.indexOf(',')==-1){
    		 return Integer.parseInt(numbers);
    	 }else{
    		 for(int i=0;i<numbers.length();i++){
        		 //If the char is ',' then add the number before to result
        		 if(numbers.charAt(i)==','){
        			 result  = result + Integer.parseInt(numbers.substring(pointer,i));
        			 pointer = i+1;
        		 }
        	 }
        	 //Handling the final number 
        	 if(pointer!=0)
        		 result  = result + Integer.parseInt(numbers.substring(pointer));
        	 return result;
    	 }
    	 
     }
     
     public int AddV3(String numbers){
    	 int result = 0;
    	 int pointer = 0;
    	 //Handling base cases
    	 if(numbers.length()==0){
    		 return 0;
    	 }else if(numbers.indexOf(',')==-1 && numbers.indexOf('\n')==-1){
    		 return Integer.parseInt(numbers);
    	 }else{
    		 for(int i=0;i<numbers.length();i++){
        		 //If the char is ',' then add the number before to result
        		 if(numbers.charAt(i)==','||numbers.charAt(i)=='\n'){
        			 result  = result + Integer.parseInt(numbers.substring(pointer,i));
        			 pointer = i+1;
        		 }
        	 }
        	 //Handling the final number 
        	 if(pointer!=0)
        		 result  = result + Integer.parseInt(numbers.substring(pointer));
        	 return result;
    	 }
    	 
     }
     
     public int AddV4(String numbers){
    	 //if the input has no new delimiter then we use AddV3
    	 if(numbers.length()!=0 && numbers.charAt(0)=='/'){
    		 //custom delimiter
    		 int result = 0;
        	 int pointer = 4;
        	 char delimiter = numbers.charAt(2);
        	 for(int i=4;i<numbers.length();i++){
        		 //If the char is ',' then add the number before to result
        		 if(numbers.charAt(i)==delimiter){
        			 result  = result + Integer.parseInt(numbers.substring(pointer,i));
        			 pointer = i+1;
        		 }
        	 }
        	 //Handling the final number 
        	 if(pointer!=0)
        		 result  = result + Integer.parseInt(numbers.substring(pointer));
        	 return result;
    	 }else{
    		 return this.AddV3(numbers);
    	 }
    	 
     }
     
  
}
