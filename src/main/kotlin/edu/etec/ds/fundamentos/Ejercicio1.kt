package edu.etec.ds.fundamentos
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun suma(a: Int, b: Int): Int {
    return a+b
}

fun resta(a: Int, b: Int): Int {
    return a-b

}

fun multiplicacion(a: Int, b: Int): Int {
    return a*b
}

fun division(a: Int, b: Int): Int {
    return a / b
}

fun modulo(a: Int, b: Int): Int {
    return a % b
}

fun esMayorQue(a: Int, b: Int): Boolean {
    return a > b
}

fun esMenorQue(a: Int, b: Int): Boolean {
    return a < b
}

fun sonIguales(a: Int, b: Int): Boolean {
    return a==b
}

fun esPar(numero: Int): Boolean {
    return  numero % 2 == 0
}

fun esImpar(numero: Int): Boolean {
    return numero % 2 == 1



}

fun valorAbsoluto(numero: Int): Int {
    return abs(numero)



}

fun maximo(a: Int, b: Int): Int {
    return max(a,b)
}

fun minimo(a: Int, b: Int): Int {
    return min(a,b)
}