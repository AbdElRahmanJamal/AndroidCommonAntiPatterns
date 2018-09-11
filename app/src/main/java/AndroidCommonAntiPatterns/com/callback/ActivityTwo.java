package AndroidCommonAntiPatterns.com.callback;

import android.content.Intent;
import AndroidCommonAntiPatterns.com.R;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;

public class ActivityTwo extends AppCompatActivity implements ActivityLayout {
  @BindView(R.id.second_text) TextView textView;
  @BindView(R.id.btn_second) Button button;
  @Override public int getLayoutID() {
    return R.layout.activity_two;
  }

  @Override protected void onResume() {
    super.onResume();
    textView.setText("Hello users this is second callback layout");
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent intent = new Intent(ActivityTwo.this, ActivityOne.class);
        startActivity(intent);
      }
    });
  }
}
