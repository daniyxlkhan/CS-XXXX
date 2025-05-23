#include <stdio.h>
#include <stdlib.h>

int g1(int a, int b)
{
    int c = (a + b) * b;
    putchar('\n');
    printf("Address of a in g1: %p\n", &a);
    printf("Address of a: %p\n", (void *)&a);
    printf("Address of b in g1: %p\n", &b);
    printf("Address of c in g1: %p\n", &c);
    printf("g1: %d %d %d\n", a, b, c);
    return c;
}

int g2(int a, int b)
{
    int c = g1(a + 3, b - 11);
    putchar('\n');
    printf("Address of a in g2: %p\n", &a);
    printf("Address of b in g2: %p\n", &b);
    printf("Address of c in g2: %p\n", &c);
    printf("g2: %d %d %d\n", a, b, c);
    return c - b;
}

int main(int argc, char **argv)
{
    int a = 5;
    int b = 17;
    int c = g2(a - 1, b * 2);
    putchar('\n');
    printf("Address of a in main: %p\n", &a);
    printf("Address of b in main: %p\n", &b);
    printf("Address of c in main: %p\n", &c);
    printf("main: %d %d %d\n", a, b, c);
    return EXIT_SUCCESS;
}