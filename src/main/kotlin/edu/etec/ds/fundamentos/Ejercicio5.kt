package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var suma = 0
    for (i in 1..n) suma += i
    return suma
}

fun contarPares(inicio: Int, fin: Int): Int {
    var c = 0
    for (i in inicio..fin) {
        if (i % 2 == 0) c++
    }
    return c
}

fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    for (i in 2..n) {
        val aux = a + b
        a = b
        b = aux
    }
    return b
}

fun factorial(n: Int): Int {
    var r = 1
    for (i in 1..n) r *= i
    return r
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var max = numeros[0]
    for (n in numeros) {
        if (n > max) max = n
    }
    return max
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var min = numeros[0]
    for (n in numeros) {
        if (n < min) min = n
    }
    return min
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (n in numeros) suma += n
    return suma
}

fun inverter(texto: String): String {
    return texto.reversed()
}

fun contarVocales(texto: String): Int {
    var c = 0
    for (letra in texto) {
        if (letra.lowercaseChar() in "aeiou") c++
    }
    return c
}

fun esPalindromo(texto: String): Boolean {
    val t = texto.replace(" ", "").lowercase()
    return t == t.reversed()
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val lista = mutableListOf<Int>()
    for (i in 1..10) lista.add(numero * i)
    return lista
}