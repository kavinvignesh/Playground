#include<stdio.h>
int main()
{
  //Type your code here
  int r=0,c=0;
  scanf("%d %d",&r,&c);
  int m[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      scanf("%d",&m[i][j]);
    }
  }
  int t[c][r];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      t[j][i] = m[i][j];
    }
   }
  for(int i=0;i<c;i++){
    for(int j=0;j<r;j++){
      printf("%d ",t[i][j]);
    }
    printf("\n");
   }
  return 0;
}