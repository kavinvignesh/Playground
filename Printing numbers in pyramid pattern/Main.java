#include <stdio.h>
int main() {
	// Type your code here
  	int n=0,c=1;
  	scanf("%d",&n);
  	for(int i=0;i<n;i++){
      for(int j=i;j<n-1;j++){
        printf(" ");
      }
      for(int j1=0;j1<=i;j1++){
        printf("%d ",c);
        c++;
      }
      printf("\n");
    }
  	
	return 0;
}