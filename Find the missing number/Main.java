#include<stdio.h>
int main()
{
  //Type your code here
  int n=0,arr[100]={0},arr1[100]={0};
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
    arr1[arr[i]]++;
  }
  for(int i=1;i<=n;i++){
    if(arr1[i]==0)
      printf("%d",i);
  }
  return 0;
}