#include<stdio.h>
int main()
{
 int a,lasttwodigit,secondlastdigit;
  scanf("%d",&a);
  lasttwodigit= a%100;
  secondlastdigit= lasttwodigit/10;
  printf("%d",secondlastdigit);
  return 0;
}