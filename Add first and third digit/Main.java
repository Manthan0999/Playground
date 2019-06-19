#include<stdio.h>
int main()
{
int a;
  scanf("%d",&a);
  int firstdigit= a/100;
  int lastdigit=a%10;
 printf("%d",firstdigit+lastdigit);
  return 0;
}