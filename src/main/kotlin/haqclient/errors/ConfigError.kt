package haqclient.errors

class ConfigError(message: String, cause: Throwable) : Error(message, cause)