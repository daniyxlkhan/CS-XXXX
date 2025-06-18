/* ex1_realloc.c */
#include <stdio.h>
#include <stdlib.h>

void dummy_frame() {
    return;
}

int main(int argc, char **argv) {
    int i;
    int *a;

    a = (int *)malloc(5 * sizeof(int));
    if (a == NULL) {
        fprintf(stderr, "Initial malloc failed.\n");
        return EXIT_FAILURE;
    }

    printf("Original array (5 elements):\n");
    for (i = 0; i < 5; i++) {
        a[i] = i + 1;
        printf("a[%d] = %d, address = %p\n", i, a[i], (void *)&a[i]);
    }

    int *temp = (int *)realloc(a, 8 * sizeof(int));
    if (temp == NULL) {
        fprintf(stderr, "Realloc failed.\n");
        free(a);  // Free original memory if realloc fails
        return EXIT_FAILURE;
    }
    a = temp;


    for (i = 5; i < 8; i++) {
        a[i] = (i + 1) * 10; 
    }

    printf("Expanded array (8 elements):\n");
    for (i = 0; i < 8; i++) {
        printf("a[%d] = %d, address = %p\n", i, a[i], (void *)&a[i]);
    }

    dummy_frame();
    free(a);
    return EXIT_SUCCESS;
}




// There are 2 frames


// main()'s stack frame lies above dummy_frame()'s (since stack grows downward).

// So the boundaries for main() are roughly from:

//     0x7fffffffdeb0 (top of main frame)

//     up to the return address it saved (0x7fffffffdfb8)



// main() was called from frame at: 0x7fffffffdeb0

// This means main()’s frame likely lies between 0x7fffffffdeb0 and a higher address like 0x7ffffffff000.


// No — the addresses of the array elements are not within the stack frame of main().
// They are located in the heap, as they were allocated using malloc().


// as the address changed, the array was moved in memory



