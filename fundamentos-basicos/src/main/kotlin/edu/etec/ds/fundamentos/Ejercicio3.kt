package edu.etec.ds.fundamentos

fun saludar(): String {
    return "Hola, bienvenido!"
}

fun saludarConNombre(nombre: String): String {
    return "Hola, $nombre!"
}

fun saludarPersona(nombre: String, apellido: String): String {
    return "Hola, $nombre $apellido!"
}

fun saludarConDefault(nombre: String = "Usuario"): String {
    return "Hola, $nombre!"
}

fun crearSaludo(titulo: String, nombre: String): String {
    return "Hola, $titulo $nombre"
}

fun funcionSinRetorno(): Unit {
    println("Esta función no retorna nada")
}

fun cuadrado(numero: Int): Int {
    return numero * numero
}

fun contarCaracteres(texto: String): Int {
    return texto.length
}

fun String.cuentaCaracteres(): Int {
    return this.length
}

infix fun Int.esMayorQue(otro: Int): Boolean {
    return this > otro
}

fun sumarTodos(vararg numeros: Int): Int {
    return numeros.sum()
}

fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}