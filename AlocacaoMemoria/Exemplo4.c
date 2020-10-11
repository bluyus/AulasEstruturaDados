#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    int *vetor;

    vetor = malloc(1000 * sizeof(int));

    for (int i = 0; i <= 999; i++)
    {
      //scanf("%d", vetor[i]);
      printf("Posicao %i \n", i);
    }

    vetor = realloc(vetor, 2000 * sizeof(int));

    for (int i = 1000; i <= 1999; i++)
    {
      //scanf("%d", vetor[i]);
      printf("Posicao %i \n", i);
    }

    return 0;
}

