#include <stdio.h>
#include <string.h>

void reverseArray (int *arr, int len);

int main() {
    char src[] = "UNB Computer Science";
    char *found = strstr(src, "Computer");

    if (found) {
        printf("Found at %li\n", found - src);
    } else {
        printf("Not found\n");
    }

    return 0;
}

void reverseArray(int *arr, int len) {
    int start = 0;
    int end = len - 1;
    while(start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}