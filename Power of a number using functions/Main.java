#include<stdio.h>
int pw(int b,int e){
  int n=1;
  while(e){
    n*=b;
    e--;
  }
  return n;
}
int main(){
    // Type your code here
  int b=0,e=0;
  scanf("%d %d",&b,&e);
  printf("%d",pw(b,e));
  	return 0;
}