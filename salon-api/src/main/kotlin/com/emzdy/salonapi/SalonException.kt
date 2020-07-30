package com.emzdy.salonapi

class SalonException : RuntimeException {

    private val serialVersionUID = 7718828512143293558L
    private val code : Int?

    constructor(code: Int?) : super() {
        this.code = code
    }

    constructor(message: String?, cause: Throwable?, code: Int?) : super(message, cause) {
        this.code = code
    }

    constructor(message: String?, code: Int?) : super(message) {
        this.code = code
    }

    constructor(cause: Throwable?, code: Int?) : super(cause) {
        this.code = code
    }

    fun getCode(): Int? {
        return code
    }
}