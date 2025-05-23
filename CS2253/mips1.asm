.data

msg_result: .asciiz "Result: "

.text
.globl main

main:
    li $t0, 10          # Load 10 into $t0 (pseudo for ori/addi)
    li $t1, 10          # Load 10 into $t1
    add $t0, $t0, $t1   # $t0 = $t0 + $t1 → 20

    li $v0, 4           # syscall 4: print string
    la $a0, msg_result
    syscall

    li $v0, 1           # syscall 1: print int
    move $a0, $t0       # move $t0 into $a0 for printing
    syscall

    li $v0, 10          # syscall 10: exit
    syscall
