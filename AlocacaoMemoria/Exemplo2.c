#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    typedef struct {
        int dia, mes, ano;
    } data;

    data *d;
    d = malloc(sizeof(data));
    d->dia = 31;
    d->mes = 12;
    d->ano = 2020;

    printf("Dia: %i\n", d->dia);
    printf("Mes: %i\n", d->mes);
    printf("Ano: %i\n", d->ano);

    return 0;
}
