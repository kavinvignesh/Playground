#include<stdio.h>
int main()
{
  //Type your code here
  int n=0,k=0,ar[100]={0},ar1[100]={0};
  scanf("%d %d",&n,&k);
  for(int i=0;i<n;i++){
    scanf("%d",&ar[i]);
    ar1[ar[i]]++;
  }
  for(int i=1;i<=k;i++){
    printf("%d %d\n",i,ar1[i]);
  }
  return 0;
}