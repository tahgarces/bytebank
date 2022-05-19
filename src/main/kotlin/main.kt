fun main(){
    println("oi")

    val contaTaynara = Conta()
    contaTaynara.titular = "Taynara"
    contaTaynara.numero = 1644
    contaTaynara.setSaldo(1000.0)

    val contaLucas = Conta()
    contaLucas.titular = "Lucas"
    contaLucas.numero = 1803
    contaLucas.setSaldo(1500.0)


    contaTaynara.deposita( 1500.0)

    println("Saldo conta Taynara deposito 1500 ${contaTaynara.getSaldo()}")

    contaTaynara.saca(100.0)
    println("Saldo conta Taynara saque 100 ${contaTaynara.getSaldo()}")

    contaLucas.transfere(contaTaynara, 400.0)
    println("Saldo conta Taynara ${contaTaynara.getSaldo()}")
    println("Saldo conta Lucas ${contaLucas.getSaldo()}")

}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0


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

    fun getSaldo() : Double {
        return saldo
    }

    fun setSaldo(valor : Double) {
        if (valor > 0) {
            saldo = valor
        }
    }
}