fun main(){
    println("oi")

    val contaTaynara = Conta("Taynara", 1611)
    contaTaynara.deposita(1000.00)

    val contaLucas = Conta("Lucas", 1803)
    contaLucas.deposita(1500.00)


    contaTaynara.deposita( 1500.0)

    println("Saldo conta Taynara deposito 1500 ${contaTaynara.saldo}")

    contaTaynara.saca(100.0)
    println("Saldo conta Taynara saque 100 ${contaTaynara.saldo}")

    contaLucas.transfere(contaTaynara, 400.0)
    println("Saldo conta Taynara ${contaTaynara.saldo}")
    println("Saldo conta Lucas ${contaLucas.saldo}")

}

class Conta (
    val titular:String,
    val numero: Int
    ){
      var saldo = 0.0
        private set

//    constructor(titular:String, numero: Int){
//        this.titular =  titular
//        this.numero = numero
//    }

    fun deposita ( valor: Double){
        this.saldo += valor
    }

    fun saca ( valor: Double){
        if(saldo >= valor){
            this.saldo -= valor
        }
    }

    fun  transfere (contaDestino: Conta, valor: Double): Boolean{
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.saldo += valor
            return true
        }
            return false

    }

}