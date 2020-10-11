#include <stdio.h>
#include <stdlib.h>

int main( int argc, const char* argv[] )
{
    typedef struct {
        int dia, mes, ano;
    } data;

    data *d;
    // Tenta alocar 30.000 GB
    d = malloc(30000000000000);

    if (d == NULL)
    {
        printf("Espaco insuficiente\n");
    }
    else
    {
        d->dia = 31;
        d->mes = 12;
        d->ano = 2020;

        printf("Dia: %i\n", d->dia);
        printf("Mes: %i\n", d->mes);
        printf("Ano: %i\n", d->ano);
    }

    return 0;
}
