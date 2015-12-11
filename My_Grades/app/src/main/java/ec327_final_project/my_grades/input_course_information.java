package ec327_final_project.my_grades;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
 /* Deceleration of TextView variables referencing the grid output. */




public class input_course_information extends AppCompatActivity {


    private String file = "ec_327_save_data";
    static int course_count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_course_information);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void send_course_info(View view) {

         /* Deceleration of TextView variables referencing the grid output. */
        TextView grid_course_name = (TextView) findViewById(R.id.r1_c1);
        TextView grid_course_weight = (TextView) findViewById(R.id.r1_c2);
        TextView grid_is_major = (TextView) findViewById(R.id.r1_c3);
        TextView grid_course_name_2 = (TextView) findViewById(R.id.r2_c1);
        TextView grid_course_weight_2 = (TextView) findViewById(R.id.r2_c2);
        TextView grid_is_major_2 = (TextView) findViewById(R.id.r2_c3);
        TextView grid_course_name_3 = (TextView) findViewById(R.id.r3_c1);
        TextView grid_course_weight_3 = (TextView) findViewById(R.id.r3_c2);
        TextView grid_is_major_3 = (TextView) findViewById(R.id.r3_c3);
        TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
        TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
        TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

        EditText course_name = (EditText) findViewById(R.id.course_name_input);
        EditText credit_hours = (EditText) findViewById(R.id.course_hours_input);

        String course_name_str = course_name.getText().toString();
        String credit_hours_str = credit_hours.getText().toString();
        String is_major = "Yes";
        String not_major = "No";

        switch (course_count) {
            case 1:
                grid_course_name.setText(course_name_str);
                grid_course_weight.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major.setText(not_major);
                } else {
                    grid_is_major.setText(is_major);
                }

                /* Turning on visibilities */
                grid_course_name.setVisibility(View.VISIBLE);
                grid_course_weight.setVisibility(View.VISIBLE);
                grid_is_major.setVisibility(View.VISIBLE);
                break;

            case 2:

                grid_course_name_2.setText(course_name_str);
                grid_course_weight_2.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major_2.setText(not_major);
                } else {
                    grid_is_major_2.setText(is_major);
                }
                grid_course_name_2.setVisibility(View.VISIBLE);
                grid_course_weight_2.setVisibility(View.VISIBLE);
                grid_is_major_2.setVisibility(View.VISIBLE);
                break;

            case 3:

                grid_course_name_3.setText(course_name_str);
                grid_course_weight_3.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major_3.setText(not_major);
                } else {
                    grid_is_major_3.setText(is_major);
                }
                grid_course_name_3.setVisibility(View.VISIBLE);
                grid_course_weight_3.setVisibility(View.VISIBLE);
                grid_is_major_3.setVisibility(View.VISIBLE);
                break;

            case 4:
                grid_course_name_4.setText(course_name_str);
                grid_course_weight_4.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major_4.setText(not_major);
                } else {
                    grid_is_major_4.setText(is_major);
                }
                grid_course_name_4.setVisibility(View.VISIBLE);
                grid_course_weight_4.setVisibility(View.VISIBLE);
                grid_is_major_4.setVisibility(View.VISIBLE);
                break;

            case 5:

                grid_course_name_5.setText(course_name_str);
                grid_course_weight_5.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major_5.setText(not_major);
                } else {
                    grid_is_major_5.setText(is_major);
                }
                grid_course_name_5.setVisibility(View.VISIBLE);
                grid_course_weight_5.setVisibility(View.VISIBLE);
                grid_is_major_5.setVisibility(View.VISIBLE);
                break;
        }
        course_count++;
    }

/* Removal of content from display */


    public void remove_row_1(View view) {
        TextView grid_course_name = (TextView) findViewById(R.id.r1_c1);
        TextView grid_course_weight = (TextView) findViewById(R.id.r1_c2);
        TextView grid_is_major = (TextView) findViewById(R.id.r1_c3);
        TextView grid_course_name_2 = (TextView) findViewById(R.id.r2_c1);
        TextView grid_course_weight_2 = (TextView) findViewById(R.id.r2_c2);
        TextView grid_is_major_2 = (TextView) findViewById(R.id.r2_c3);
        TextView grid_course_name_3 = (TextView) findViewById(R.id.r3_c1);
        TextView grid_course_weight_3 = (TextView) findViewById(R.id.r3_c2);
        TextView grid_is_major_3 = (TextView) findViewById(R.id.r3_c3);
        TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
        TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
        TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

        /* Reconfiguring display to show object below following delete. */

        grid_course_name.setText(grid_course_name_2.getText());
        grid_course_weight.setText(grid_course_weight_2.getText());
        grid_is_major.setText(grid_is_major_2.getText());
        grid_course_name_2.setText(grid_course_name_3.getText());
        grid_course_weight_2.setText(grid_course_weight_2.getText());
        grid_is_major_2.setText(grid_is_major_3.getText());
        grid_course_name_3.setText(grid_course_name_4.getText());
        grid_course_weight_3.setText(grid_course_weight_4.getText());
        grid_is_major_3.setText(grid_is_major_4.getText());
        grid_course_name_4.setText(grid_course_name_5.getText());
        grid_course_weight_4.setText(grid_course_weight_5.getText());
        grid_is_major_4.setText(grid_is_major_5.getText());
        course_count--;

    }

    public void remove_row_2(View view) {
        TextView grid_course_name_2 = (TextView) findViewById(R.id.r2_c1);
        TextView grid_course_weight_2 = (TextView) findViewById(R.id.r2_c2);
        TextView grid_is_major_2 = (TextView) findViewById(R.id.r2_c3);
        TextView grid_course_name_3 = (TextView) findViewById(R.id.r3_c1);
        TextView grid_course_weight_3 = (TextView) findViewById(R.id.r3_c2);
        TextView grid_is_major_3 = (TextView) findViewById(R.id.r3_c3);
        TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
        TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
        TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

        /* Reconfiguring displays to show object below. */
        grid_course_name_2.setText(grid_course_name_3.getText());
        grid_course_weight_2.setText(grid_course_weight_2.getText());
        grid_is_major_2.setText(grid_is_major_3.getText());
        grid_course_name_3.setText(grid_course_name_4.getText());
        grid_course_weight_3.setText(grid_course_weight_4.getText());
        grid_is_major_3.setText(grid_is_major_4.getText());
        grid_course_name_4.setText(grid_course_name_5.getText());
        grid_course_weight_4.setText(grid_course_weight_5.getText());
        grid_is_major_4.setText(grid_is_major_5.getText());
        course_count--;
    }

    public void remove_row_3(View view) {
        TextView grid_course_name_3 = (TextView) findViewById(R.id.r3_c1);
        TextView grid_course_weight_3 = (TextView) findViewById(R.id.r3_c2);
        TextView grid_is_major_3 = (TextView) findViewById(R.id.r3_c3);
        TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
        TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
        TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

        /* Reconfiguring TextViews to display objects below if delete command is given. */
        grid_course_name_3.setText(grid_course_name_4.getText());
        grid_course_weight_3.setText(grid_course_weight_4.getText());
        grid_is_major_3.setText(grid_is_major_4.getText());
        grid_course_name_4.setText(grid_course_name_5.getText());
        grid_course_weight_4.setText(grid_course_weight_5.getText());
        grid_is_major_4.setText(grid_is_major_5.getText());

        course_count--;
    }

    public void remove_row_4(View view) {
        TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
        TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
        TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

        /* Moves text from fifth location to fourth */
        grid_course_name_4.setText(grid_course_name_5.getText());
        grid_course_weight_4.setText(grid_course_weight_5.getText());
        grid_is_major_4.setText(grid_is_major_5.getText());
        course_count--;
    }

    public void remove_row_5(View view) {
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);
        grid_course_name_5.setText("");
        grid_course_weight_5.setText("");
        grid_is_major_5.setText("");
        grid_course_name_5.setVisibility(View.INVISIBLE);
        grid_course_weight_5.setVisibility(View.INVISIBLE);
        grid_is_major_5.setVisibility(View.INVISIBLE);
        course_count--;
    }

    public void save_course_data(View view) {
        


    }
}



