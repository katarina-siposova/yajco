package yajco.annotation;

import yajco.annotation.processor.MapsTo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@MapsTo("yajco.model.pattern.impl.MixedRepetition")
public @interface MixedRepetition {

}
