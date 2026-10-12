import kotlin.system.exitProcess

fun main() {
    val SaintPetesburgCofeDomPrices = SaintPetesburgCofeDom (
    158.0 ,119.0 ,
    219.0 ,  169.0 ,
     49.0, 299.0,
        182.0, 300.0, 299.0)

    val IrkutskCofeDomPrices = IrkutskCofeDom (
        163.0 ,127.0 ,
        226.0 ,  176.0 ,
        54.0, 320.0,
        192.0, 315.0,324.0)

    val MoscowCofeDomPrices = MoscowCofeDom (
        169.0 ,133.0 ,
        232.0 ,  186.0 ,
        60.0, 326.0,
        198.0, 321.0,330.0)

    var currentCafeDom:CafeDom

    while (true) {
        println("Добрый день! Выберите город")
        println("1. Санкт-Петербург\n2. Москва\n3. Иркутск\n\n0.Выход из программы")

        currentCafeDom = when (readln()) {
            "1" -> SaintPetesburgCofeDomPrices
            "2" -> MoscowCofeDomPrices
            "3" -> IrkutskCofeDomPrices
            "0" -> break
            else -> {
                println("Error!")
                continue
            }
        }

        println("Выберите выпечку")
        println(
            "1. Дениш с голубикой\n2. Круассан\n3. Шоколадный круассан\n" +
                    "4. Слойка-пицца\n5. Сырные шарики\n0.Показать статистику"
        )
    selectFood(currentCafeDom)

        println("Выберите кофе")
        println(
            "1. Латте белый шоколад\n2. Экспрессо\n3. Карамельный мокачино\n" +
                    "4. Латте\n0.Показать статистику"
        )
        selectDrink(currentCafeDom)
    }}

private fun selectFood(currentCafeDom:CafeDom) {when (readln()) {
            "1" -> {currentCafeDom.DenishBlueberrySale()
                }
            "2" -> {currentCafeDom.CroissantSale()
                }
            "3" -> {currentCafeDom.ChocolateCroissantSale()
                }
            "4" -> {currentCafeDom.PizzaSale()
               }
            "5" -> {currentCafeDom.CheeseBallsSale()
                }
            "0" -> {currentCafeDom.showStatistics()
                if (currentCafeDom is CheckPhoto) {
                    val allFood = currentCafeDom.DenishBlueberryCount + currentCafeDom.CroissantCount +
                            currentCafeDom.ChocolateCroissantCount + currentCafeDom.PizzaCount + currentCafeDom.CheeseBallsCount
                    if (allFood > 0) {
                        val checksPercent = (currentCafeDom.ChecksCount.toDouble() / allFood) * 100
                        val notCheckPercent = 100.0 - checksPercent
                        println("Чеков продано в процентном соотношении со всеми покупками: $checksPercent %")
                        println("Чеков НЕ продано в процентном соотношении со всеми покупками: $notCheckPercent %")
                        println("Общая скидка из чеков: ${currentCafeDom.ChecksCount * 50} руб.")
                    }
                }

                if (currentCafeDom is Glass) {
                    val allFood = currentCafeDom.DenishBlueberryCount + currentCafeDom.CroissantCount +
                            currentCafeDom.ChocolateCroissantCount + currentCafeDom.PizzaCount + currentCafeDom.CheeseBallsCount
                    if (allFood > 0) {
                        val glassesPercent = (currentCafeDom.GlassesCount.toDouble() / allFood) * 100
                        val notGlassesPercent = 100.0 - glassesPercent
                        println("Стаканов продано в процентном соотношении со всеми покупками: $glassesPercent %")
                        println("Стаканов НЕ продано в процентном соотношении со всеми покупками: $notGlassesPercent %")
                        println("Всего заработано из коллекционных стаканов: ${currentCafeDom.GlassesCount * 200} руб.")
                    }
                }

                if (currentCafeDom is Toping) {
                    val allFood = currentCafeDom.DenishBlueberryCount + currentCafeDom.CroissantCount +
                            currentCafeDom.ChocolateCroissantCount + currentCafeDom.PizzaCount + currentCafeDom.CheeseBallsCount
                    if (allFood > 0) {
                        val chocoPercent = (currentCafeDom.ChocolateBallsCount.toDouble() / allFood) * 100
                        val notChocoPercent = 100.0 - chocoPercent
                        println("Шоколадных джус боллов продано в процентном соотношении: $chocoPercent %")
                        println("Шоколадных джус боллов НЕ продано в процентном соотношении: $notChocoPercent %")
                        println("Всего заработано за шоколадные джус боллы: ${currentCafeDom.ChocolateBallsCount * 150} руб.")

                        val caramelPercent = (currentCafeDom.CaramelBallsCount.toDouble() / allFood) * 100
                        val notCaramelPercent = 100.0 - caramelPercent
                        println("Карамельных джус боллов продано в процентном соотношении: $caramelPercent %")
                        println("Карамельных джус боллов НЕ продано в процентном соотношении: $notCaramelPercent %")
                        println("Всего заработано за карамельные джус боллы: ${currentCafeDom.CaramelBallsCount * 150} руб.")
                    }
                }
            }
            else -> {
                println("Error!")
                exitProcess(1)
            }
        }
    }

private fun selectDrink(currentCafeDom:CafeDom) {when (readln()) {
    "1" -> {currentCafeDom.LatteWhiteChocolateSale()
        selectAddService(currentCafeDom)}
    "2" -> {currentCafeDom.EspressoSale()
        selectAddService(currentCafeDom)}
    "3" -> {currentCafeDom.CaramelMochaccinoSale()
        selectAddService(currentCafeDom)}
    "4" -> {currentCafeDom.LatteSale()
        selectAddService(currentCafeDom)}
    "0" -> {currentCafeDom.showStatistics()
        if (currentCafeDom is CheckPhoto) {
        val allFood = currentCafeDom.DenishBlueberryCount + currentCafeDom.CroissantCount +
                currentCafeDom.ChocolateCroissantCount + currentCafeDom.PizzaCount + currentCafeDom.CheeseBallsCount
        if (allFood > 0) {
            val checksPercent = (currentCafeDom.ChecksCount.toDouble() / allFood) * 100
            val notCheckPercent = 100.0 - checksPercent
            println("Чеков продано в процентном соотношении со всеми покупками: $checksPercent %")
            println("Чеков НЕ продано в процентном соотношении со всеми покупками: $notCheckPercent %")
            println("Общая скидка из чеков: ${currentCafeDom.ChecksCount * 50} руб.")
        }
    }

        if (currentCafeDom is Glass) {
            val allFood = currentCafeDom.DenishBlueberryCount + currentCafeDom.CroissantCount +
                    currentCafeDom.ChocolateCroissantCount + currentCafeDom.PizzaCount + currentCafeDom.CheeseBallsCount
            if (allFood > 0) {
                val glassesPercent = (currentCafeDom.GlassesCount.toDouble() / allFood) * 100
                val notGlassesPercent = 100.0 - glassesPercent
                println("Стаканов продано в процентном соотношении со всеми покупками: $glassesPercent %")
                println("Стаканов НЕ продано в процентном соотношении со всеми покупками: $notGlassesPercent %")
                println("Всего заработано из коллекционных стаканов: ${currentCafeDom.GlassesCount * 200} руб.")
            }
        }

        if (currentCafeDom is Toping) {
            val allFood = currentCafeDom.DenishBlueberryCount + currentCafeDom.CroissantCount +
                    currentCafeDom.ChocolateCroissantCount + currentCafeDom.PizzaCount + currentCafeDom.CheeseBallsCount
            if (allFood > 0) {
                val chocoPercent = (currentCafeDom.ChocolateBallsCount.toDouble() / allFood) * 100
                val notChocoPercent = 100.0 - chocoPercent
                println("Шоколадных джус боллов продано в процентном соотношении: $chocoPercent %")
                println("Шоколадных джус боллов НЕ продано в процентном соотношении: $notChocoPercent %")
                println("Всего заработано за шоколадные джус боллы: ${currentCafeDom.ChocolateBallsCount * 150} руб.")

                val caramelPercent = (currentCafeDom.CaramelBallsCount.toDouble() / allFood) * 100
                val notCaramelPercent = 100.0 - caramelPercent
                println("Карамельных джус боллов продано в процентном соотношении: $caramelPercent %")
                println("Карамельных джус боллов НЕ продано в процентном соотношении: $notCaramelPercent %")
                println("Всего заработано за карамельные джус боллы: ${currentCafeDom.CaramelBallsCount * 150} руб.")
            }
        }
    }
    else -> {
        println("Error!")
        exitProcess(1)
    }
}
}

fun selectAddService(currentCafeDom: CafeDom) {
        if (currentCafeDom is CheckPhoto) {
            currentCafeDom.showCheckPhoto()
        }
        if (currentCafeDom is Glass) {
            currentCafeDom.glassSale()
        }
        if (currentCafeDom is Toping) {
            currentCafeDom.TopingSale()
        }
}