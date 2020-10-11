#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    int *Ptr_a;
    int a = 7;

    // Define a posição de memória de a para "Ptr_a"
    Ptr_a = &a;

    printf("Endereco de a: %i \n", &a);
    printf("Endereco de Ptr_a: %i \n", &Ptr_a);

    printf("O valor de a: %i \n", a);
    printf("O valor de Ptr_a: %i \n", Ptr_a);

    // Ptr_a é um ponteiro que armazena um endereço de memória
    // para buscar o conteúdo do endereço de memora que ele armazena
    printf("O valor que esta no endereco de memoria armazenado no em Ptr_a: %i \n", *Ptr_a);


    printf("Busca a posicao de memoria de *Ptr_a \( que e 7 \): %i \n", &*Ptr_a);
    printf("Busca o conteudo do que esta na posicao de memoria armazenado em &Ptr_a: %i \n", *&Ptr_a);

    return 0;
}
