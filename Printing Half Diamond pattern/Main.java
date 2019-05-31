#include <stdio.h>
int main() {
  	int n=0;
  	scanf("%d",&n);
  	for(int i=0;i<n;i++){
      for(int j=i;j<n-1;j++){
        printf(" ");
      }
      for(int j1=0;j1<=i+i;j1++){
          	printf("*");
      }
      printf("\n");
    }
	return 0;
}