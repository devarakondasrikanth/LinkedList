package com.srikanth.exception;

class JavaException{
   public static void main(String args[]){
  try{
       throw new MyException(2);
       // throw is used to create a new exception and throw it.
  }
 catch(MyException e){
    System.out.println(e) ;
 }
}
}