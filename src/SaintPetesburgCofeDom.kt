class SaintPetesburgCofeDom (
    DenishBlueberryPrice: Double,
    CroissantPrice: Double,
    ChocolateCroissantPrice: Double,
    PizzaPrice: Double,
    CheeseBallsPrice: Double,
    LatteWhiteChocolatePrice: Double,
    EspressoPrice: Double,
    LattePrice: Double,
    CaramelMochaccinoPrice: Double
) : CafeDom(DenishBlueberryPrice, CroissantPrice,
ChocolateCroissantPrice, PizzaPrice,
CheeseBallsPrice,LatteWhiteChocolatePrice,
EspressoPrice, LattePrice, CaramelMochaccinoPrice), Glass {
    override fun glassSale() {
           println("Вы хотите коллекционный стакан?")
           println("1.Да\n2.Нет")
        if (readln() == "1") {GlassesCount++
        println("С вас 200 рублей")}
    }

    override fun DenishBlueberrySale() {
        DenishBlueberryCount++
        println("Спасибо за покупку дениша с голубикой в Санкт-Петербурге!")
    }
    override fun CroissantSale() {
        CroissantCount++
        println("Спасибо за покупку круассана в Санкт-Петербурге!")
    }
    override fun ChocolateCroissantSale() {
        ChocolateCroissantCount++
        println("Спасибо за покупку шоколадного круассана в Санкт-Петербурге!")
    }
    override fun PizzaSale() {
        PizzaCount++
        println("Спасибо за покупку слойки-пиццы в Санкт-Петербурге!")
    }
    override fun CheeseBallsSale() {
        CheeseBallsCount++
        println("Спасибо за покупку сырных шариков в Санкт-Петербурге!")
    }
    override fun LatteWhiteChocolateSale() {
        LatteWhiteChocolateCount++
        println("Спасибо за покупку латте белый шоколад в Санкт-Петербурге!")
    }
    override fun EspressoSale() {
        EspressoCount++
        println("Спасибо за покупку экпрессо в Санкт-Петербурге!")
    }
    override fun CaramelMochaccinoSale() {
        CaramelMochaccinoCount++
        println("Спасибо за покупку карамельного мокачино в Санкт-Петербурге!")
    }
    override fun LatteSale() {
        LatteCount++
        println("Спасибо за покупку латте в Санкт-Петербурге!")
    }
}