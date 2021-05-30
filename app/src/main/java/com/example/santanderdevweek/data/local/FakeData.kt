package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getlocalData() : Conta{
        val cliente = Cliente("Claison")
        val cartao = Cartao("4171")
        return Conta(
                "565874-4",
                "0554-7",
                "R$ 2.800,00",
                "R$ 5.550,00",
                cliente,
                cartao
        )
    }
}