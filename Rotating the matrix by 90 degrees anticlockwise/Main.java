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
  for(int i=c-1;i>=0;i--){
    for(int j=0;j<r;j++){
      printf("%d ",m[j][i]);
    }
    printf("\n");
  }
	return 0;
}