#include <stdio.h>
int main() {
    // Type your code here
  	int n = 0;
  	scanf("%d",&n);
  	for(int i=n;i>0;i--){
      for(int j=i;j>0;j--)
        printf("%d",j);
      printf("\n");
    }
	return 0;
}