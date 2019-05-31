#include<stdio.h>
#include<string.h>/*
void subrev(char *start,char *end){
  char temp;
  while(start<end){
    temp = *start;
    *start++ = *end;
    *end-- = temp;
  }
}
void reverse(char *s){
  
  char *temp = s;
  char *strstring = s;
  while(*temp){
    if(*temp == '\0')
      subrev(strstring,temp-1);
    else if(*temp == ' '){
      subrev(strstring,temp-1);
      strstring = temp+1;
    }
    temp++;
  }
  subrev(s,temp-1);
}
int main()
{
  // Type your code here
  char s[100]="\0";
  scanf("%[^\n]%*c",s);
  char *t = s;
  reverse(s);
  return 0;
}*/

void reverse(char* begin, char* end); 
  
/*Function to reverse words*/
void reverseWords(char* s) 
{ 
    char* word_begin = s; 
    char* temp = s; /* temp is for word boundry */
  
    /*STEP 1 of the above algorithm */
    while (*temp) { 
        temp++; 
        if (*temp == '\0') { 
            reverse(word_begin, temp - 1); 
        } 
        else if (*temp == ' ') { 
            reverse(word_begin, temp - 1); 
            word_begin = temp + 1; 
        } 
    } /* End of while */
  
    /*STEP 2 of the above algorithm */
    reverse(s, temp - 1); 
} 
  
/* UTILITY FUNCTIONS */
/*Function to reverse any sequence starting with pointer 
  begin and ending with pointer end  */
void reverse(char* begin, char* end) 
{ 
    char temp; 
    while (begin < end) { 
        temp = *begin; 
        *begin++ = *end; 
        *end-- = temp; 
    } 
} 
  
/* Driver function to test above functions */
int main() 
{ 
    char s[100] = "\0";
  	gets(s);
    char* temp = s; 
    reverseWords(s); 
    printf("%s", s); 
    getchar(); 
    return 0; 
} 