package org.test.bookpubstarter.dbcount;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by lam on 12/07/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(DbCountAutoConfiguration.class)
@Documented
public @interface EnableDbCounting {
}
