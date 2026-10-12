class MoscowCofeDom (
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
    EspressoPrice, LattePrice, CaramelMochaccinoPrice), Toping, Glass, CheckPhoto {
    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            ChecksCount++
            println("Вам будет скидка 50 рублей с покупки")}
    }
    override fun glassSale() {
        println("Вы хотите коллекционный стакан?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            GlassesCount++
            println("С вас 200 рублей")}
    }
    override fun TopingSale(){
        println("Вы хотите коллекционный добавить шоколадные или карамельные джус боллы?")
        println("1. Шоколадные\n2. Карамельные\n3.Без джус боллов")
        when (readln()){
        "1" -> {
            ChocolateBallsCount++
            println("С вас 150 рублей")}
        "2" -> {
            CaramelBallsCount++
            println("С вас 150 рублей")}
        "3" -> println("Джус боллы не были добавлены")
    }}

    override fun DenishBlueberrySale() {
        DenishBlueberryCount++
        println("Спасибо за покупку дениша с голубикой в Москве!")
    }
    override fun CroissantSale() {
        CroissantCount++
        println("Спасибо за покупку круассана в Москве!")
    }
    override fun ChocolateCroissantSale() {
        ChocolateCroissantCount++
        println("Спасибо за покупку шоколадного круассана в Москве!")
    }
    override fun PizzaSale() {
        PizzaCount++
        println("Спасибо за покупку слойки-пиццы в Москве!")
    }
    override fun CheeseBallsSale() {
        CheeseBallsCount++
        println("Спасибо за покупку сырных шариков в Москве!")
    }
    override fun LatteWhiteChocolateSale() {
        LatteWhiteChocolateCount++
        println("Спасибо за покупку латте белый шоколад в Москве!")
    }
    override fun EspressoSale() {
        EspressoCount++
        println("Спасибо за покупку экпрессо в Москве!")
    }
    override fun CaramelMochaccinoSale() {
        CaramelMochaccinoCount++
        println("Спасибо за покупку карамельного мокачино в Москве!")
    }
    override fun LatteSale() {
        LatteCount++
        println("Спасибо за покупку латте в Москве!")
    }
}