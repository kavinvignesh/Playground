#include <stdio.h>
int main(){
	// Type your code here
  int n=0,m=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      if(m%2 == 0)
        printf("*");
      else
        printf("#");
      m++;
    }
    printf("\n");
  }
  	return 0;
}