#include<stdio.h>
int main()
{
  //Type your code here
  int a,b;
  scanf("%d",&a);
  b = a/10;
  a = a%10;
  printf("%d",a+b);
  return 0;
}