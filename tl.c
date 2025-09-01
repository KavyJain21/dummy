#include <stdio.h>
int main ()
{
    int a ;
    printf("1.red\n2.orange\n3.green");
    scanf("%d",&a);
    switch(a)

    {
    case 1 : printf("STOP");
    break;
    case 2 : printf("WAIT");
    break;
    case 3 : printf("RUN");
    break;
    default : printf("INVALID");
    }
}