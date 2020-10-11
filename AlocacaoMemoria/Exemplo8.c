#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    int *p = 0x4DC;
    printf ("Ponteiro armazenando o endereco %d\n", p);

    p++;
    printf ("Somando 4 bytes no endereco armazenado %d\n", p);

    p = p + 15;
    printf ("Somando 60 bytes no endereco armazenado %d\n", p);

    p = p - 3;
    printf ("Subtraindo 15 bytes no endereco armazenado %d\n", p);

    return 0;
}
