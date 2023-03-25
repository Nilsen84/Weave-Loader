package club.maxstats.weave.loader.api.mixin

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class Mixin(val value: KClass<*>)