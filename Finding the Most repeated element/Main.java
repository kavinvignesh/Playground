#include<stdio.h>
int main()
{
  //Type your code here
  int n=0,arr[10]={0},arr1[10]={0},max=0,mid=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
    arr1[arr[i]]++;
    if(max<arr1[arr[i]]){
      max=arr1[arr[i]];
      mid = arr[i];
    }
  }

  printf("%d",mid);
  return 0;
}