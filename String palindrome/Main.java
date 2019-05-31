#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100]={"\0"};
  int l=0,i=0,s=0;
  gets(str);
  l = (strlen(str)-1);
  while(i<l){
    if(str[i]!=str[l]){
      printf("%s is not a palindrome",str);
      return 0;
    }
    i++;
    l--;
  }
  printf("%s is a palindrome",str);
  return 0;
}