#include<stdio.h>
int main()
{
  //fill the code
  int arr[10]={0},l=0,max=0;
  scanf("%d",&max);
  for(int i=0;i<max;i++){
    scanf("%d",&arr[i]);
    if(arr[i]>l)
      l=arr[i];
  }
  printf("%d",l);
  return 0;
}