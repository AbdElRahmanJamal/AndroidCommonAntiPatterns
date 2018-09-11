package AndroidCommonAntiPatterns.com.callbackwithannotation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import java.util.HashMap;
import java.util.Map;

public class CallbackWithAnnotation implements Application.ActivityLifecycleCallbacks {
  private final Map<Activity, Unbinder> unbinders = new HashMap<>();

  @Override public void onActivityCreated(Activity activity, Bundle bundle) {
    if (activity.getClass()
        .getAnnotation(AndroidCommonAntiPatterns.com.callbackwithannotation.ActivityLayout.class) instanceof AndroidCommonAntiPatterns.com.callbackwithannotation.ActivityLayout) {
      activity.setContentView(layoutID(activity));
    }
    unbinders.put(activity, ButterKnife.bind(activity));
  }

  private int layoutID(Activity activity) {
    return activity.getClass()
        .getAnnotation(AndroidCommonAntiPatterns.com.callbackwithannotation.ActivityLayout.class)
        .getLayoutID();
  }

  @Override public void onActivityStarted(Activity activity) {

  }

  @Override public void onActivityResumed(Activity activity) {

  }

  @Override public void onActivityPaused(Activity activity) {

  }

  @Override public void onActivityStopped(Activity activity) {

  }

  @Override public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

  }

  @Override public void onActivityDestroyed(Activity activity) {
    unbinders.remove(activity).unbind();
  }
}
