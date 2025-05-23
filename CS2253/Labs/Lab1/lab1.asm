.data

prompt1:     .asciiz "Enter first number: "       # Message to prompt user for the first number

prompt2:     .asciiz "Enter second number: "      # Message to prompt user for the second number

result_add:  .asciiz "Addition result: "          # Message before displaying addition result

result_sub:  .asciiz "Subtraction result: "       # Message before displaying subtraction result

result_mul:  .asciiz "Multiplication result: "    # Message before displaying multiplication result

result_div:  .asciiz "Division result: "          # Message before displaying division result



.text

.globl main



main:

    # ---- Read first number from user ----

    li $v0, 4                 # syscall code for print_string

    la $a0, prompt1           # load address of prompt1 into $a0

    syscall                   # print prompt1 message



    li $v0, 5                 # syscall code for read_int

    syscall                   # read an integer from user input

    move $t0, $v0             # store input in $t0 (first number)



    # ---- Read second number from user ----

    li $v0, 4                 # syscall code for print_string

    la $a0, prompt2           # load address of prompt2 into $a0

    syscall                   # print prompt2 message



    li $v0, 5                 # syscall code for read_int

    syscall                   # read an integer from user input

    move $t1, $v0             # store input in $t1 (second number)



    # ---- Addition: 

    add $t2, $t0, $t1

    li $v0, 4                 # syscall code for print_string

    la $a0, result_add        # load message "Addition result: "

    syscall                   # print it

    li $v0, 1                 # syscall code for print_int

    move $a0, $t2             # move sum into $a0

    syscall                   # print result



    # ---- Subtraction: diff = $t0 - $t1 ----
	
    sub $t3, $t1, $t0

    li $v0, 4

    la $a0, result_sub     # print "Subtraction result: "

    syscall

    li $v0, 1

    move $a0, $t2             # print result

    syscall



    # ---- Multiplication: prod = $t0 * $t1 ----

    mul $t4, $t1, $t0

    li $v0, 4

    la $a0, result_mul       # print "Multiplication result: "

    syscall

    li $v0, 1

    move $a0, $t2

    syscall



    # ---- Division (safe only if $t1 ≠ 0) ----

do_division:

    div $t4, $t1, $t0

    mflo $t2                  # move quotient from LO to $t2

    li $v0, 4
    
    la $a0, result_div      # print "Division result: "

    syscall

    li $v0, 1

    move $a0, $t2             # print quotient

    syscall



exit:

    li $v0, 10                # syscall code to exit the program

    syscall

