package net.snakefangox.rapidregister.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class to have it's fields registered.
 * Every field that is not marked with {@link Exclude}
 * will attempt to be registered.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RegisterContents {
}