package trivera.cdi;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Fisher on 3/15/2017.
 */

@Qualifier
@Retention(RUNTIME)
@Target({TYPE,FIELD,METHOD,PARAMETER})
public @interface Action {
}
