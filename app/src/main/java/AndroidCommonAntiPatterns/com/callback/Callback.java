package AndroidCommonAntiPatterns.com.callback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import java.util.HashMap;
import java.util.Map;
//response for handle setting the content View for us :

public class Callback implements Application.ActivityLifecycleCallbacks {
  private final Map<Activity, Unbinder> unbinders = new HashMap<>();

  @Override public void onActivityCreated(Activity activity, Bundle bundle) {
    if (activity instanceof ActivityLayout) {
      activity.setContentView(layoutId(activity));
    }
    unbinders.put(activity, ButterKnife.bind(activity));
  }

  private int layoutId(Activity activity) {
    return ((ActivityLayout) activity).getLayoutID();
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
