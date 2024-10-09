package com.exceptionHandling;

import java.io.IOException;

class M{
void method()throws IOException{
throw new IOException("exception occurred");
}
}
public class Testthrows1 {
public static void main(String args[]) throws IOException{
M m=new M();
m.method();
System.out.println("normal flow...");
}
}