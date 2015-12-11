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

        //load data
        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);

        course_count = settings.getInt("Course_Count", -1);
        if(course_count == -1) {
            course_count = 1;
            return;
        }

        if(course_count < 1)
            course_count = 1;

        if(course_count >= 1)
        {
            TextView grid_course_name = (TextView) findViewById(R.id.r1_c1);
            TextView grid_course_weight = (TextView) findViewById(R.id.r1_c2);
            TextView grid_is_major = (TextView) findViewById(R.id.r1_c3);

            grid_course_name.setText(settings.getString("grid_0_name", "n/a"));
            grid_course_weight.setText(settings.getString("grid_0_weight", "n/a"));
            grid_is_major.setText(settings.getString("grid_0_major", "n/a"));

            grid_course_name.setVisibility(View.VISIBLE);
            grid_course_weight.setVisibility(View.VISIBLE);
            grid_is_major.setVisibility(View.VISIBLE);
        }
        if(course_count >= 2)
        {
            TextView grid_course_name_2 = (TextView) findViewById(R.id.r2_c1);
            TextView grid_course_weight_2 = (TextView) findViewById(R.id.r2_c2);
            TextView grid_is_major_2 = (TextView) findViewById(R.id.r2_c3);

            grid_course_name_2.setText(settings.getString("grid_2_name", "n/a"));
            grid_course_weight_2.setText(settings.getString("grid_2_weight", "n/a"));
            grid_is_major_2.setText(settings.getString("grid_2_major", "n/a"));

            grid_course_name_2.setVisibility(View.VISIBLE);
            grid_course_weight_2.setVisibility(View.VISIBLE);
            grid_is_major_2.setVisibility(View.VISIBLE);
        }
        if(course_count >= 3)
        {
            TextView grid_course_name_3 = (TextView) findViewById(R.id.r3_c1);
            TextView grid_course_weight_3 = (TextView) findViewById(R.id.r3_c2);
            TextView grid_is_major_3 = (TextView) findViewById(R.id.r3_c3);

            grid_course_name_3.setText(settings.getString("grid_3_name", "n/a"));
            grid_course_weight_3.setText(settings.getString("grid_3_weight", "n/a"));
            grid_is_major_3.setText(settings.getString("grid_3_major", "n/a"));

            grid_course_name_3.setVisibility(View.VISIBLE);
            grid_course_weight_3.setVisibility(View.VISIBLE);
            grid_is_major_3.setVisibility(View.VISIBLE);
        }
        if(course_count >= 4)
        {
            TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
            TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
            TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);

            grid_course_name_4.setText(settings.getString("grid_4_name", "n/a"));
            grid_course_weight_4.setText(settings.getString("grid_4_weight", "n/a"));
            grid_is_major_4.setText(settings.getString("grid_4_major", "n/a"));

            grid_course_name_4.setVisibility(View.VISIBLE);
            grid_course_weight_4.setVisibility(View.VISIBLE);
            grid_is_major_4.setVisibility(View.VISIBLE);
        }
        if(course_count >= 5) {
            TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
            TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
            TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

            grid_course_name_5.setText(settings.getString("grid_5_name", "n/a"));
            grid_course_weight_5.setText(settings.getString("grid_5_weight", "n/a"));
            grid_is_major_5.setText(settings.getString("grid_5_major", "n/a"));

            grid_course_name_5.setVisibility(View.VISIBLE);
            grid_course_weight_5.setVisibility(View.VISIBLE);
            grid_is_major_5.setVisibility(View.VISIBLE);
        }

        Toast.makeText(getApplicationContext(), "Data loaded", Toast.LENGTH_SHORT).show();

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
                if(grid_course_name.getText() != "") {
                    course_count++;
                    send_course_info(view);
                    return;
                }
                grid_course_name.setText(course_name_str);
                grid_course_weight.setText(credit_hours_str);
                CheckBox check = (CheckBox)findViewById(R.id.major_course_check_box);
                if (!check.isChecked()) {
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
                if(grid_course_name_2.getText() != "") {
                    course_count++;
                    send_course_info(view);
                    return;
                }
                grid_course_name_2.setText(course_name_str);
                grid_course_weight_2.setText(credit_hours_str);
                check = (CheckBox)findViewById(R.id.major_course_check_box);
                if (!check.isChecked()) {
                    grid_is_major_2.setText(not_major);
                } else {
                    grid_is_major_2.setText(is_major);
                }
                grid_course_name_2.setVisibility(View.VISIBLE);
                grid_course_weight_2.setVisibility(View.VISIBLE);
                grid_is_major_2.setVisibility(View.VISIBLE);
                break;

            case 3:
                if(grid_course_name_3.getText() != "") {
                    course_count++;
                    send_course_info(view);
                    return;
                }
                grid_course_name_3.setText(course_name_str);
                grid_course_weight_3.setText(credit_hours_str);
                check = (CheckBox)findViewById(R.id.major_course_check_box);
                if (!check.isChecked()) {
                    grid_is_major_3.setText(not_major);
                } else {
                    grid_is_major_3.setText(is_major);
                }
                grid_course_name_3.setVisibility(View.VISIBLE);
                grid_course_weight_3.setVisibility(View.VISIBLE);
                grid_is_major_3.setVisibility(View.VISIBLE);
                break;

            case 4:
                if(grid_course_name_4.getText() != "") {
                    course_count++;
                    send_course_info(view);
                    return;
                }
                grid_course_name_4.setText(course_name_str);
                grid_course_weight_4.setText(credit_hours_str);
                check = (CheckBox)findViewById(R.id.major_course_check_box);
                if (!check.isChecked()) {
                    grid_is_major_4.setText(not_major);
                } else {
                    grid_is_major_4.setText(is_major);
                }
                grid_course_name_4.setVisibility(View.VISIBLE);
                grid_course_weight_4.setVisibility(View.VISIBLE);
                grid_is_major_4.setVisibility(View.VISIBLE);
                break;

            case 5:
                if(grid_course_name_5.getText() != "") {
                    course_count++;
                    send_course_info(view);
                    return;
                }
                grid_course_name_5.setText(course_name_str);
                grid_course_weight_5.setText(credit_hours_str);
                check = (CheckBox)findViewById(R.id.major_course_check_box);
                if (!check.isChecked()) {
                } else {
                    grid_is_major_5.setText(is_major);
                }
                grid_course_name_5.setVisibility(View.VISIBLE);
                grid_course_weight_5.setVisibility(View.VISIBLE);
                grid_is_major_5.setVisibility(View.VISIBLE);
                break;
        }
        course_count++;
        if(course_count > 5)
            course_count = 5;
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
        if(course_count == 1)
        {
            grid_course_name.setVisibility(View.INVISIBLE);
            grid_course_weight.setVisibility(View.INVISIBLE);
            grid_is_major.setVisibility(View.INVISIBLE);
        }
        if(course_count == 2)
        {
            grid_course_name_2.setVisibility(View.INVISIBLE);
            grid_course_weight_2.setVisibility(View.INVISIBLE);
            grid_is_major_2.setVisibility(View.INVISIBLE);
        }
        if(course_count == 3)
        {
            grid_course_name_3.setVisibility(View.INVISIBLE);
            grid_course_weight_3.setVisibility(View.INVISIBLE);
            grid_is_major_3.setVisibility(View.INVISIBLE);
        }
        if(course_count == 4)
        {
            grid_course_name_4.setVisibility(View.INVISIBLE);
            grid_course_weight_4.setVisibility(View.INVISIBLE);
            grid_is_major_4.setVisibility(View.INVISIBLE);
        }
        if(course_count == 5)
        {
            grid_course_name_5.setVisibility(View.INVISIBLE);
            grid_course_weight_5.setVisibility(View.INVISIBLE);
            grid_is_major_5.setVisibility(View.INVISIBLE);
        }


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
        if(course_count < 1)
            course_count = 1;

        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putInt("Course_Count", course_count);
        editor.apply();
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

        if(course_count == 2)
        {
            grid_course_name_2.setVisibility(View.INVISIBLE);
            grid_course_weight_2.setVisibility(View.INVISIBLE);
            grid_is_major_2.setVisibility(View.INVISIBLE);
        }
        if(course_count == 3)
        {
            grid_course_name_3.setVisibility(View.INVISIBLE);
            grid_course_weight_3.setVisibility(View.INVISIBLE);
            grid_is_major_3.setVisibility(View.INVISIBLE);
        }
        if(course_count == 4)
        {
            grid_course_name_4.setVisibility(View.INVISIBLE);
            grid_course_weight_4.setVisibility(View.INVISIBLE);
            grid_is_major_4.setVisibility(View.INVISIBLE);
        }
        if(course_count == 5)
        {
            grid_course_name_5.setVisibility(View.INVISIBLE);
            grid_course_weight_5.setVisibility(View.INVISIBLE);
            grid_is_major_5.setVisibility(View.INVISIBLE);
        }


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

        if(course_count < 1)
            course_count = 1;

        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putInt("Course_Count", course_count);
        editor.apply();
    }

    public void remove_row_3(View view) {

        //Toast.makeText(getApplicationContext(), "Remove 3 working", Toast.LENGTH_SHORT).show();

        TextView grid_course_name_3 = (TextView) findViewById(R.id.r3_c1);
        TextView grid_course_weight_3 = (TextView) findViewById(R.id.r3_c2);
        TextView grid_is_major_3 = (TextView) findViewById(R.id.r3_c3);
        TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
        TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
        TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

        if(course_count == 3)
        {
            grid_course_name_3.setVisibility(View.INVISIBLE);
            grid_course_weight_3.setVisibility(View.INVISIBLE);
            grid_is_major_3.setVisibility(View.INVISIBLE);
        }
        if(course_count == 4)
        {
            grid_course_name_4.setVisibility(View.INVISIBLE);
            grid_course_weight_4.setVisibility(View.INVISIBLE);
            grid_is_major_4.setVisibility(View.INVISIBLE);
        }
        if(course_count == 5)
        {
            grid_course_name_5.setVisibility(View.INVISIBLE);
            grid_course_weight_5.setVisibility(View.INVISIBLE);
            grid_is_major_5.setVisibility(View.INVISIBLE);
        }

        /* Reconfiguring TextViews to display objects below if delete command is given. */
        grid_course_name_3.setText(grid_course_name_4.getText());
        grid_course_weight_3.setText(grid_course_weight_4.getText());
        grid_is_major_3.setText(grid_is_major_4.getText());
        grid_course_name_4.setText(grid_course_name_5.getText());
        grid_course_weight_4.setText(grid_course_weight_5.getText());
        grid_is_major_4.setText(grid_is_major_5.getText());

        course_count--;

        if(course_count < 1)
            course_count = 1;

        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putInt("Course_Count", course_count);
        editor.apply();
    }

    public void remove_row_4(View view) {
        TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
        TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
        TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);
        TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
        TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
        TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

        if(course_count == 4)
        {
            grid_course_name_4.setVisibility(View.INVISIBLE);
            grid_course_weight_4.setVisibility(View.INVISIBLE);
            grid_is_major_4.setVisibility(View.INVISIBLE);
        }
        if(course_count == 5)
        {
            grid_course_name_5.setVisibility(View.INVISIBLE);
            grid_course_weight_5.setVisibility(View.INVISIBLE);
            grid_is_major_5.setVisibility(View.INVISIBLE);
        }

        /* Moves text from fifth location to fourth */
        grid_course_name_4.setText(grid_course_name_5.getText());
        grid_course_weight_4.setText(grid_course_weight_5.getText());
        grid_is_major_4.setText(grid_is_major_5.getText());

        course_count--;

        if(course_count < 1)
            course_count = 1;

        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putInt("Course_Count", course_count);
        editor.apply();
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

        if(course_count < 1)
            course_count = 1;

        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putInt("Course_Count", course_count);
        editor.apply();
    }

    public void save_course_data(View view) {
        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putInt("Course_Count", course_count);

        if(course_count >= 1)
        {
            TextView grid_course_name = (TextView) findViewById(R.id.r1_c1);
            TextView grid_course_weight = (TextView) findViewById(R.id.r1_c2);
            TextView grid_is_major = (TextView) findViewById(R.id.r1_c3);

            editor.putString("grid_0_name", grid_course_name.getText().toString());
            editor.putString("grid_0_weight", grid_course_weight.getText().toString());
            editor.putString("grid_0_major", grid_is_major.getText().toString());
        }
        if(course_count >= 2)
        {
            TextView grid_course_name_2 = (TextView) findViewById(R.id.r2_c1);
            TextView grid_course_weight_2 = (TextView) findViewById(R.id.r2_c2);
            TextView grid_is_major_2 = (TextView) findViewById(R.id.r2_c3);

            editor.putString("grid_2_name", grid_course_name_2.getText().toString());
            editor.putString("grid_2_weight", grid_course_weight_2.getText().toString());
            editor.putString("grid_2_major", grid_is_major_2.getText().toString());
        }
        if(course_count >= 3)
        {
            TextView grid_course_name_3 = (TextView) findViewById(R.id.r3_c1);
            TextView grid_course_weight_3 = (TextView) findViewById(R.id.r3_c2);
            TextView grid_is_major_3 = (TextView) findViewById(R.id.r3_c3);

            editor.putString("grid_3_name", grid_course_name_3.getText().toString());
            editor.putString("grid_3_weight", grid_course_weight_3.getText().toString());
            editor.putString("grid_3_major", grid_is_major_3.getText().toString());
        }
        if(course_count >= 4)
        {
            TextView grid_course_name_4 = (TextView) findViewById(R.id.r4_c1);
            TextView grid_course_weight_4 = (TextView) findViewById(R.id.r4_c2);
            TextView grid_is_major_4 = (TextView) findViewById(R.id.r4_c3);

            editor.putString("grid_4_name", grid_course_name_4.getText().toString());
            editor.putString("grid_4_weight", grid_course_weight_4.getText().toString());
            editor.putString("grid_4_major", grid_is_major_4.getText().toString());
        }
        if(course_count >= 5)
        {
            TextView grid_course_name_5 = (TextView) findViewById(R.id.r5_c1);
            TextView grid_course_weight_5 = (TextView) findViewById(R.id.r5_c2);
            TextView grid_is_major_5 = (TextView) findViewById(R.id.r5_c3);

            editor.putString("grid_5_name", grid_course_name_5.getText().toString());
            editor.putString("grid_5_weight", grid_course_weight_5.getText().toString());
            editor.putString("grid_5_major", grid_is_major_5.getText().toString());
        }

        editor.apply();

        Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_SHORT).show();

    }
}



