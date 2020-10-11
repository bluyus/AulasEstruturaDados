#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    int a, b;
    int *ptr, *ptr1;

    ptr = &a;
    ptr1 = &b;

    if (ptr == ptr1)
    {
        printf ("Ponteiros iguais\n");
    }
    else
    {
        printf ("Ponteiros diferentes\n");
    }

    return 0;
}
