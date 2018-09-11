package AndroidCommonAntiPatterns.com.callback;

import AndroidCommonAntiPatterns.com.callbackwithannotation.CallbackWithAnnotation;
import android.app.Application;

public class MyApp extends Application {
  @Override public void onCreate() {
    super.onCreate();
    registerActivityLifecycleCallbacks(new CallbackWithAnnotation());
  }
}
