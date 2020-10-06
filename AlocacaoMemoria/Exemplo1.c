#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    char *ptr;

    ptr = malloc(1);

    printf("Informe um char: ");
    scanf("%1s", ptr);

    printf("O char que foi inserido: %s\n", ptr);

    return 0;
}
