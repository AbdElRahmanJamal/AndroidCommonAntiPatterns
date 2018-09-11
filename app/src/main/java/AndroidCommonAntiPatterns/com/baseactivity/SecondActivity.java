package AndroidCommonAntiPatterns.com.baseactivity;

import AndroidCommonAntiPatterns.com.R;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;

public class SecondActivity extends BaseActivity {
  @BindView(R.id.second_txt) TextView textView;
  @BindView(R.id.btn_second) Button button;

  @Override public int getLayoutID() {
    return R.layout.second_activity;
  }

  @Override protected void onResume() {
    super.onResume();
    textView.setText("Hello users this is second layout");
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
        startActivity(intent);
      }
    });
  }
}
