package BigBash;
import java.lang.*;
import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
 public class BigBash{
 public String RevSentenceWords(String newstr){
int i,j,k;
int l;
String s=newstr;
String word="",nc="",cc="";
int m=newstr.length();
    for( i=0;i<m;i++){
        for(j=i;s.charAt(j)!=' ';j++){
            nc=nc+s.charAt(j);
        }
        l=nc.length();
        for(k=l-1;k>=0;k--)
    {
        cc=cc+nc.charAt(k);
    }
        word=word+cc+" ";
        nc="";
        i=j;
    }
return word;
}
 public Boolean palindrome(int s){
    int k=s;
int r,d,c;
r=0;
while(s>0){
    d=s%10;
    r=r*10+d;
    s=s/10;
}
if(r==k){
    return true;
}
else{
    return false;
}
}
public Boolean Even(int i){
    if(i%2==0){
        return true;
    }
    else{
        return false;
    }
}
public Boolean Odd(int i){
    if(i%2!=0){
        return true;
    }
    else{
        return false;
    }
}
public String  Neon(int x){
int s=x,i,j,k,r,sum=0;
s=s*s;
i=s;
while(i>0){
    r=i%10;
    sum=sum+r;
    i=i/10;
}
if(x==sum){
    return "Neon";
}
else{
    return "Non-Neon";
}
}
public Boolean unique(String s){
int l=s.length();
char c,x;

for (int i = 0; i < s.length(); i++) 
            for (int j = i + 1; j < s.length(); j++) 
                if (s.charAt(i) == s.charAt(j)) 
                    return false; 
return true;
}
public int reverseInteger(int s){
int x,sum=0,y,j,z,m;
x=s;
while(x>0){
    m=x%10;
    sum=sum*10+m;
    x=x/10;
}
return sum;
}
public String  Acronym(String s){
int l=0,f=0;
String m=s;
l=m.length();
String k="";
String[] arr =m.split(" ");
f=arr.length;
for(int i=0;i<f;i++){
k=k+arr[i].charAt(0);
}
return k;
}
public int[] Sort(int s[]){
    int k = s.length;
int i,j,temp;
for(i=0;i<k;i++){
    for(j=i+1;j<k;j++){
        if(s[i]>s[j]){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
return s;
}
public int MinArray(int anArray[]){
    int minValue = anArray[0];
      int arrayLength = anArray.length;
      for (int i = 1; i <= arrayLength - 1; i++) {
         int value = anArray[i];
         if (value < minValue) {
            minValue = value;
         }
      }
      return minValue;
   }
public int MaxArray(int anArray[]){
        int maxValue = anArray[0];
        int arrayLength = anArray.length;
        for (int i = 1; i <= arrayLength - 1; i++) {
           int value = anArray[i];
           if (value > maxValue) {
              maxValue = value;
           }
        }
 return maxValue;
}
 public int[] circularArrayRotation(int[] a, int k, int[] queries) {
    k = k % a.length;
    int[] result = new int[queries.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = a[(queries[i] - k + a.length) % a.length];
    }
    return result;
  }
  public int[] LeftRotateArray(int arr[],int d){
int n=arr.length;
int brr[]=new int[1000];
for(int i=0;i<n;i++){
    brr[(n-d+i)%n]=arr[i];
}
return brr;
  }
public int[] RightRotateArray(int arr[],int d){
    int i, last;
int SIZE=arr.length;
    for(int j=0;j<d;j++){
    last = arr[SIZE - 1];

    for(i=SIZE-1; i>0; i--)
    {
       
        arr[i] = arr[i - 1];
    }   
    arr[0] = last; 
}
return arr;
}
public int Frequency(String s,char c){
    int l=s.length();
    int i,j,k,m,flag=0;
    for(i=0;i<l;i++){
        if(s.charAt(i)==c){
            flag++;
        }
    }
    if(flag>0)
    return flag;
    else
    return 0;
}
public char GetChar(int x){
    char c=(char)x;
    return c;
    
    }
    public int GetAscii(char x){
        int c=x;
        return c;
        
    }   
public int[] MergeArray(int s[],int p[]){
int l=s.length;
int n=p.length;
int b[]=new int[100];
int i;
for(  i=0;i<l;i++){
    b[i]=s[i];
}
for(int j=0;j<n;j++){
    b[i+j]=p[j];
}
return b;
}
public String[] SortString(String s[]){
int i,j,k;
String c;
int l=s.length;
for(i=0;i<l;i++){
    for(j=i+1;j<l;j++){
        if(s[i].compareTo(s[j])>0){
            c=s[i];
            s[i]=s[j];
            s[j]=c;
        }
    }
}
return s;
}
public Boolean IsPowerofTwo(int x)
{
   //checks whether a number is zero or not
   if (x == 0)
      return false;

   //true till x is not equal to 1
   while( x != 1)
   {
      //checks whether a number is divisible by 2
      if(x % 2 != 0)
         return false;
         x /= 2;
   }
   return true;
}
public Boolean IsPowerofThree(int x)
{
   //checks whether a number is zero or not
   if (x == 0)
      return false;

   //true till x is not equal to 1
   while( x != 1)
   {
      //checks whether a number is divisible by 2
      if(x % 3 != 0)
         return false;
         x /= 3;
   }
   return true;
}
public Boolean IsPowerof(int x,int y)
{
   //checks whether a number is zero or not
   if (x == 0)
      return false;

   //true till x is not equal to 1
   while( x != 1)
   {
      //checks whether a number is divisible by 2
      if(x % y != 0)
         return false;
         x /= y;
   }
   return true;
}
public Boolean Isprime(int y){
int count=0,i=0;
for(i=1;i<=y;i++){
    if(y%i==0){
        count++;
    }
}
if(count==2)
 return true;

else
 return false;
}
public Boolean Armstrong(int x){
    int a,num,s=0;
    num=x;
    while(x>0){
        a=x%10;
        s=s+a*a*a;
        x=x/10;
    }
    if(num==s)
      return true;
       else 
       return false;
}
public int gcd(int x,int y){
int gcd=0;
int p=x*y;
for(int i=1;i<p;i++){

    if(x%i==0&&y%i==0)
        gcd=i;
}
return gcd;
}
public long Factorial(int x){
long fact=1;
if(x==1)
 return x;
 else
   for(int i=1;i<=x;i++){
       fact=fact*i;
   }
   return fact;
}
public int Lcm(int x,int y){
    int gcd=0;
    int p=x*y;
    for(int i=1;i<p;i++){
    
        if(x%i==0&&y%i==0)
            gcd=i;
    }
int lcm=p/gcd;
return lcm;
}
public String PigLatin(String s){
int x,y;
String str1="",str2="";
char b;
b=0;
x=s.length();
for(y=0;y<x;y++){
    b=(s.charAt(y));
    if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
        break;
    }
}
str1=s.substring(y,x);
str2=s.substring(0,y);
return str1+str2+"ay";
}
public String FilePath(String s,String y){
int a=s.lastIndexOf('/');
String path=s.substring(0,(a+1));
String str2=s.substring(a+1);
int b=str2.lastIndexOf('.');
String file=str2.substring(0,b );
String ext=str2.substring(b+1);
if(y.compareTo("file")==0)
  return file;
else if(y.compareTo("extension")==0)
  return ext;
else if(y.compareTo("path")==0)
  return path;
else
  return file;
}
}













