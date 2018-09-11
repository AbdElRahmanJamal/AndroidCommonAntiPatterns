package AndroidCommonAntiPatterns.com.callback;

import AndroidCommonAntiPatterns.com.R;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;

public class ActivityOne extends AppCompatActivity implements ActivityLayout {
  @BindView(R.id.first_text) TextView textView;
  @BindView(R.id.btn_first) Button button;
  @Override public int getLayoutID() {
    return R.layout.activity_one;
  }
  @Override protected void onResume() {
    super.onResume();
    textView.setText("Hello users this is first callback layout");
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
        startActivity(intent);
      }
    });
  }
}
