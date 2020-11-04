object Speed {
    enum class MembershipFunction {
        FAST, // Быстрая скорость
        MEDIUM, // Средняя скорость
        SLOW, // Медленная скорость
    }

    // Функция принадлежности для скорости
    fun calculate(speed: Int, membership: MembershipFunction): Double {
        when (membership) {
            MembershipFunction.FAST -> {
                if (speed <= 15.0) {
                    return 0.2
                }

                if (speed < 30.0) {
                    return (30.0 - speed) / 5.0
                }

                return 1.0
            }
            MembershipFunction.MEDIUM -> {
                if (speed <= 10.0) {
                    return 1.0
                }

                if (speed < 15.0) {
                    return (15.0 - speed) / 5.0
                }

                return 0.1
            }
            MembershipFunction.SLOW -> {
                if (speed <= 5.0) {
                    return 1.0
                }

                if (speed < 10.0) {
                    return (10.0 - speed) / 5.0
                }

                return 0.1
            }
        }
    }
}
