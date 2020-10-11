#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    int vetor[4] = {1, 2, 3, 4};
    int *Ptr;

    Ptr = vetor;

    printf("Elemento na terceira posicao: %i \n", Ptr[2]);
    printf("Elemento na terceira posicao: %i \n", *(Ptr+2));

    return 0;
}
