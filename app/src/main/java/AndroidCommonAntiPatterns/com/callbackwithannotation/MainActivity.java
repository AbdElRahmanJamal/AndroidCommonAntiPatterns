package AndroidCommonAntiPatterns.com.callbackwithannotation;

import AndroidCommonAntiPatterns.com.R;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.BindView;

//Declare the annotation above our Activities instead of implementing the old interface
@ActivityLayout(getLayoutID = R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
  @BindView(R.id.textView) TextView textView;
  @BindView(R.id.textView1) TextView textView1;
  @BindView(R.id.textView2) TextView textView2;

  @Override protected void onResume() {
    super.onResume();
    textView.setText("Text one");
    textView1.setText("Text Two");
    textView2.setText("Text Three");
  }
}
