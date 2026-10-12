abstract class CafeDom(
    val DenishBlueberryPrice: Double,
    val CroissantPrice: Double,
    val ChocolateCroissantPrice: Double,
    val PizzaPrice: Double,
    val CheeseBallsPrice: Double,
    val LatteWhiteChocolatePrice: Double,
    val EspressoPrice: Double,
    val LattePrice: Double,
    val CaramelMochaccinoPrice: Double
){
    var DenishBlueberryCount = 0
    var CroissantCount = 0
    var ChocolateCroissantCount = 0
    var PizzaCount = 0
    var CheeseBallsCount = 0
    var LatteWhiteChocolateCount = 0
    var EspressoCount = 0
    var LatteCount = 0
    var CaramelMochaccinoCount = 0
    var ChecksCount = 0
    var GlassesCount = 0
    var ChocolateBallsCount = 0
    var CaramelBallsCount = 0

    abstract fun DenishBlueberrySale()
    abstract fun CroissantSale()
    abstract fun ChocolateCroissantSale()
    abstract fun PizzaSale()
    abstract fun CheeseBallsSale()
    abstract fun LatteWhiteChocolateSale()
    abstract fun EspressoSale()
    abstract fun CaramelMochaccinoSale()
    abstract fun LatteSale()

    fun showStatistics( ){
        println("Продано денишей с голубикой: $DenishBlueberryCount")
        println("Продано круассанов: $CroissantCount")
        println("Продано шоколадных круассанов: $ChocolateCroissantCount")
        println("Продано слоек-пицц: $PizzaCount")
        println("Продано сырных шариков: $CheeseBallsCount")
        println("Продано латте: $LatteCount")
        println("Продано латте белый шоколад: $LatteWhiteChocolateCount")
        println("Продано карамельных макачино: $CaramelMochaccinoCount")
        println("Продано експрессо: $EspressoCount")
        println("Показано чеков: $ChecksCount")
        println("Продано калекционных стаканов: $GlassesCount")


        val money = DenishBlueberryCount * DenishBlueberryPrice + CroissantCount * CroissantPrice +
        ChocolateCroissantCount * ChocolateCroissantPrice + PizzaCount * PizzaPrice +
        CheeseBallsCount * CheeseBallsPrice + EspressoCount * EspressoPrice + LatteWhiteChocolateCount *
        LatteWhiteChocolatePrice + LatteCount * LattePrice + CaramelMochaccinoCount * CaramelMochaccinoPrice +
        ChecksCount * -50 + GlassesCount * 200 + ChocolateBallsCount * 150 + CaramelBallsCount * 150
        println("Всего заработано денег:$money")
    }
}