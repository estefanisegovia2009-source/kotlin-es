package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    if(numero > 0){
        return "Positivo"
    }else{
        return "No positivo"
    }
}

fun clasificarNumero(numero: Int): String {
    if(numero > 10){
        return "Mayor a 10"
    }else if(numero < 10){
        return "Menor a 10"
    }else{
        return "Igual a 10"
    }
}

fun evaluarEdad(edad: Int): String{
    if(edad < 18){
        return "Menor de edad"
    }else if(edad <= 65){
        return "Adulto"
    }else{
        return "Adulto mayor"
    }
}
fun obtenerDescuento(monto: Double): Double  {
    if(monto >= 200){
        return 30.0
    }else if(monto >=150){
        return 20.0
    }else if(monto >100){
        return 10.0
    }else{
        return 0.0
    }
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    return when (operador) {
        '+' -> (a + b).toDouble()
        '-' -> (a - b).toDouble()
        '*' -> (a * b).toDouble()
        '/' -> (a.toDouble() / b)
        else -> 0.0
    }
}