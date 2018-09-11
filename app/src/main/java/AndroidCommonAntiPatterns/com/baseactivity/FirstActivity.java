package AndroidCommonAntiPatterns.com.baseactivity;

import AndroidCommonAntiPatterns.com.R;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;

public class FirstActivity extends BaseActivity {
  @BindView(R.id.first_text) TextView textView;
  @BindView(R.id.btn_first) Button button;

  @Override public int getLayoutID() {
    return R.layout.first_activity;
  }

  @Override protected void onResume() {
    super.onResume();
    textView.setText("Hello users this is first layout");
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
      }
    });
  }
}
