#include<stdio.h>
#include<stdlib.h>
int main()
{
  //Type your code here
  int num=0,s1=0,s2=0,array[10]={0};
  int n1 = 0,n2 = 0;
  scanf("%d",&num);
  for(int i=0;i<num;i++){
    scanf("%d",&array[i]);
  }
  scanf("%d %d",&s1,&s2);
  for(int i=0;i<num;i++){
    if(array[i] == s1){
      n1 = 1;
      s1 = i;
    }
    if(array[i] == s2){
      n2 = 1;
      s2 = i;
    }
  }
  if(n1)
    printf("%d\n",s1);
  else
    printf("-1\n");
  if(n2)
    printf("%d\n",s2);
  else
    printf("-1\n");
  return 0;
}