#include <stdio.h>
int main ()
{
    int day;
    printf("ENTER A DAY");
    scanf("%d",&day);
    switch(day)

    {
    case 1: printf("Monday");
    break;
    case 2: printf("Tuesday");
    break;
    case3: printf("Wednesday");
    break;
    case4 : printf("Thursay");
    break;
    case 5 : printf("Friday");
    break;
    case6 : printf("Saturday");
    break;
    case 7:printf("Sunday");
    break;
    default : printf("INVALID");
    }

    return 0;

    }
