#include<stdio.h>
int rec(int n){
  if(n==0){
    return 1;
  }
  else{
    return n*rec(n-1);
  }
}
int main()
{
	//Try out your code here
  	int n=0;
  scanf("%d",&n);
  n = rec(n);
  printf("%d",n);
	return 0;
}