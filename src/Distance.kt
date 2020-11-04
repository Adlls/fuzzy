object Distance {
    enum class MembershipFunction {
        FARAWAY, // Далеко
        NEARLY, // Близко
        VERY_CLOSE, // очень близко
    }

    // Функция принадлежности для расстояния
    fun calculate(distance: Int, membership: MembershipFunction): Double {
        when (membership) {
            MembershipFunction.FARAWAY -> {
                if (distance <= 200.0) {
                    return 1.0
                }

                if (distance < 1000.0) {
                    return (1000.0 - distance) / 800.0
                }

                return 0.0
            }
            MembershipFunction.NEARLY -> {
                if (distance <= 80.0) {
                    return 1.0
                }

                if (distance < 140.0) {
                    return (140.0 - distance) / 60.0
                }
                return 0.01
            }
            MembershipFunction.VERY_CLOSE -> {
                if (distance <= 30.0) {
                    return 1.0
                }

                if (distance < 80.0) {
                    return (80.0 - distance) / 50.0
                }
                return 0.01
            }
        }
    }
}
