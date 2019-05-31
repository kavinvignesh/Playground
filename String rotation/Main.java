#include<stdio.h>
#include<string.h>
int  Rotation_check(char *str1, char *str2)
{
  //Type your code here
}
int main()
{
  char st1[20], st2[20],temp;
  int l=0;
  //Type your code here
  gets(st1);
  gets(st2);
  l = strlen(st2);
  for(int i=0;i<l;i++){
    temp = st2[l-1];
    for(int j=l-1;j>0;j--){
      st2[j] = st2[j-1];
    }
    st2[0] = temp;
    if(strcmp(st2,st1)==0){
      printf("Yes");
      return 0;
    }
  }
  printf("No");
  return 0;
}