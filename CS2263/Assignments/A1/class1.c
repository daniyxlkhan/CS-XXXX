#include <stdio.h>

int main() {
    int i = 0, j, a[5];
    printf("Enter some integer, followed by ^D on blank line: ");
    while (scanf("%d", &a[i]) == 1) {
        i++;
    }
    for (j = 0; j < i; j++) {
        printf("%d", a[j]);
    }
    printf("\n");
    return 0;
}