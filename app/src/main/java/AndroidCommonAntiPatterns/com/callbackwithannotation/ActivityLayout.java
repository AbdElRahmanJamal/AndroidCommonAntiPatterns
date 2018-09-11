package AndroidCommonAntiPatterns.com.callbackwithannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //annotation that will be accessible by our code at Run-time
@Target(ElementType.TYPE) //annotation used only above classes
public @interface ActivityLayout {
  int getLayoutID();
}
