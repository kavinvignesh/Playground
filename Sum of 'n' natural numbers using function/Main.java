#include<stdio.h>
int s(int n){
  int s=0;
  while(n){
    s+=n--;
  }
  return s;
}
int main() {
    // Type your code here
  int n=0;
  scanf("%d",&n);
  printf("%d",s(n));
  	return 0;
}