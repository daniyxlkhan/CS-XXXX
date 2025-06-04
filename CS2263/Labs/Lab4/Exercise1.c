#include <stdio.h>

int areDistinct(int *arr, int len);

#define MAX_SIZE 1000

int main(int argc, char **argv) {
    FILE *fptr = fopen(argv[1], "r");
    if (fptr == NULL) {
        printf("Could not open file.\n");
        return 1;
    }

    int arr[MAX_SIZE];
    int i = 0;
    while (fscanf(fptr, "%d", &arr[i]) == 1 && i < MAX_SIZE) {
        i++;
    }
    fclose(fptr);

    if (areDistinct(arr, i)) {
        printf("The given file has distinct numbers.\n");
    } else {
        printf("The given file does not have distinct numbers.\n");
    }

    return 0;
}

int areDistinct(int *arr, int len) {
    int ind1, ind2;

    for (ind1 = 0; ind1 < len; ind1++) {
        for (ind2 = ind1 + 1; ind2 < len; ind2++) {
            if (arr[ind1] == arr[ind2]) {
                // found two elements with the same value
                return 0;
            }
        }
    }

    // have not found two elements of the same value
    return 1;
}