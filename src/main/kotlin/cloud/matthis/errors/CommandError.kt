package cloud.matthis.errors

class CommandError(message: String, cause: Throwable) : Error(message, cause)