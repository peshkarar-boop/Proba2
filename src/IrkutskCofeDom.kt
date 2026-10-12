class IrkutskCofeDom (
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
EspressoPrice,LattePrice, CaramelMochaccinoPrice), CheckPhoto{
    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1.Да\n2.Нет")
        if (readln() == "1") {ChecksCount++
            println("Вам будет скидка 50 рубле с покупки")}
    }

    override fun DenishBlueberrySale() {
        DenishBlueberryCount++
        println("Спасибо за покупку дениша с голубикой в Иркутске!")
    }
    override fun CroissantSale() {
        CroissantCount++
        println("Спасибо за покупку круассана в Иркутске!")
    }
    override fun ChocolateCroissantSale() {
        ChocolateCroissantCount++
        println("Спасибо за покупку шоколадного круассана в Иркутске!")
    }
    override fun PizzaSale() {
        PizzaCount++
        println("Спасибо за покупку слойки-пиццы в Иркутске!")
    }
    override fun CheeseBallsSale() {
        CheeseBallsCount++
        println("Спасибо за покупку сырных шариков в Иркутске!")
    }
    override fun LatteWhiteChocolateSale() {
        LatteWhiteChocolateCount++
        println("Спасибо за покупку латте белый шоколад в Иркутске!")
    }
    override fun EspressoSale() {
        EspressoCount++
        println("Спасибо за покупку экпрессо в Иркутске!")
    }
    override fun CaramelMochaccinoSale() {
        CaramelMochaccinoCount++
        println("Спасибо за покупку карамельного мокачино в Иркутске!")
    }
    override fun LatteSale() {
        LatteCount++
        println("Спасибо за покупку латте в Иркутске!")
    }
}