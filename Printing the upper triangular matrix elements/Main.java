#include<stdio.h>
int main()
{
	//Try out your code here
  int r=0,c=0;
  scanf("%d %d",&r,&c);
  int m[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      scanf("%d",&m[i][j]);
    }
  }
  for(int i=0;i<c;i++){
    for(int j=0;j+i<r;j++){
      printf("%d ",m[j][j+i]);
      }
  }
	return 0;
}