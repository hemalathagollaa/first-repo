import java.util.*;
class dsa{
  int[]a;
  int m;
  /*int bsearch(int value){
    int low=0,high=m-1,mid;
    mid=(low+high)/2;
    while(low<high){
      if(a[mid]==value){
        System.out.println("element is at:"+mid);
        return mid;
        
      }
      else if(a[mid]>value){
        high=mid-1;
      }else{
        low=mid+1;
      }
    }
    return mid;
  }
  int lsearch(int value){
    for(int i=0;i<m;i++){
    if(a[i]==value){
      System.out.println("element is at:"+i);
      return i;
      
    }
    
    
    }return -1;
  }*/
 void isort(){
  for(int i=1;i<m;i++){
    int j=i-1;
    int temp=a[i];
    while(a[j]>temp){
    
      a[j+1]=a[j];
      j--;
    }a[j+1]=temp;
      for(i=1;i<m;i++){
     System.out.println("elements are:"+a[i]);
  }return 0;
  }
 public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 System.out.println("enter size");

 int m=input.nextInt();
 int a[]=new int[m];
 System.out.println("enter array");

 for(int i=0;i<m;i++){
  a[i]=input.nextInt();
 }
      dsa obj=new dsa();
      obj.a=a;
      obj.m=m;
     obj.isort();

     // obj.bsearch(5);
      //obj.lsearch(2);

 }
 }}
