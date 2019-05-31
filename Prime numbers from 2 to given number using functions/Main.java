#include<stdio.h>
void prime(int n){
  int f=0;
  for(int i=2;i<=n;i++){
    for(int j=2;j<=i/2;j++){
      if(i%j==0)
        f++;
    }
    if(f==0)
      printf("%d\n",i);
    f=0;
  }
}
int main(){
    // Type your code here
  int n=0;
  scanf("%d",&n);
  prime(n);
    return 0;
}