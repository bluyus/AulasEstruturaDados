#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    char *ptr;

    ptr = 0;

    ptr = malloc(1);

    printf("Informe um char: ");
    scanf("%1s", ptr);

    printf("O char que foi inserido: %s\n", ptr);

    free(ptr);

    return 0;
}
