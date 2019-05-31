#include <stdio.h>
#include<math.h>
int main() {
  int n=0;
  scanf("%d",&n);
  for(int i=1;i<=round(n/2);i++){
    for(int j=1;j<i;j++)
      printf(" ");
    printf("*");
    for(int j=i;j<=n-i-1;j++){
      printf(" ");
    }
    printf("*");
    printf("\n");
  }
  for(int i=1;i<=round(n/2);i++)
    printf(" ");
  	printf("*\n");
  for(int i=round(n/2);i>0;i--){
    for(int j=i-1;j>0;j--)
      printf(" ");
    printf("*");
    for(int j=i;j<=n-i-1;j++){
      printf(" ");
    }
    printf("*");
    printf("\n");
  }
   return 0;
}
