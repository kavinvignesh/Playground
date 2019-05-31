// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
#include<string.h>
int main()
{
  // Enter your code here
  int array[26]={0},l=0,offset=0;
  char str[100]="\0",ch;
  gets(str);
  l = strlen(str);
  
  for(int i=0;i<l;i++){
    if(str[i]>='A' && str[i]<='Z'){
      offset = str[i] - 'A';
      array[offset]++;
    }
    else if(str[i]>='a' && str[i]<='z'){
      offset = str[i] - 'a';
      array[offset]++;
    }
    
    
  }
  
    for(int i=0;i<26;i++){
      if(array[i]==0){
        ch = i+'a';
        printf("%c ",ch);
      }
    }
   return 0;
}