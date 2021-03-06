package com.bloggingit.odata.edm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * Annotation for a EDM/CSDL ComplexType element.
 * <br>
 * EdmComplexType holds a set of related information like EdmPrimitiveType
 * properties and EdmComplexType properties.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EdmComplexType {

    /**
     * Define the name for the ComplexType. If not set a default value has to be
     * generated by the EDM provider.
     *
     * @return name for the ComplexType
     */
    String name() default "";

    /**
     * Define the namespace for the ComplexType. If not set a default value has
     * to be generated by the EDM provider.
     *
     * @return namespace for the ComplexType
     */
    String namespace() default "";
}
