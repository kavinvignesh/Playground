#include<stdio.h>
int main()
{
  //Type your code here
  int size=0,array[100]={0},nz[100]={0},nzp=0;
  scanf("%d",&size);
  for(int i=0;i<size;i++){
    scanf("%d",&array[i]);
    if(array[i]!=0){
      nz[nzp] = array[i];
      nzp++;
    } 
   }
   for(int i=0;i<size;i++){
     printf("%d ",nz[i]);
   }
  return 0;
}