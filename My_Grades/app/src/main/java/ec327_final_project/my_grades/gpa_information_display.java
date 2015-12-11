package ec327_final_project.my_grades;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class gpa_information_display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_information_display);

        SharedPreferences settings = getApplicationContext().getSharedPreferences("My_Grades", 0);
        int course_count = settings.getInt("Course_Count", -1);

        String grid = "";
        int grid_weight = 0;
        String grid_major = "";

        String grid2 = "";
        int grid_weight2 = 0;
        String grid_major2 = "";

        String grid3 = "";
        int grid_weight3 = 0;
        String grid_major3 = "";

        String grid4 = "";
        int grid_weight4 = 0;
        String grid_major4 = "";

        String grid5 = "";
        int grid_weight5 = 0;
        String grid_major5 = "";

        double course = 0, course2 = 0, course3 = 0, course4 = 0, course5 = 0;
        if(course_count >= 1)
        {
            grid = settings.getString("grid_0_name", "n/a");
            grid_weight = Integer.parseInt(settings.getString("grid_0_weight", "n/a"));
            grid_major = settings.getString("grid_0_major", "n/a");

            SharedPreferences assignment = getApplicationContext().getSharedPreferences("My_Grades_" + grid, 0);
            int assignment_count = assignment.getInt("Assignment_Count", -1);

            String assgrid = "";
            int assgrid_weight = 0;
            int assgrid_percent = 0;

            String assgrid2 = "";
            int assgrid_weight2 = 0;
            int assgrid_percent2 = 0;

            String assgrid3 = "";
            int assgrid_weight3 = 0;
            int assgrid_percent3 = 0;

            String assgrid4 = "";
            int assgrid_weight4 = 0;
            int assgrid_percent4 = 0;

            String assgrid5 = "";
            int assgrid_weight5 = 0;
            int assgrid_percent5 = 0;

            if(assignment_count >= 1)
            {
                assgrid = assignment.getString("grid_0_name", "n/a");
                assgrid_weight = Integer.parseInt(settings.getString("grid_0_weight", "n/a"));
                assgrid_percent = Integer.parseInt(assignment.getString("grid_0_percent", "n/a"));
            }
            if(assignment_count >= 2)
            {
                assgrid2 = assignment.getString("grid_2_name", "n/a");
                assgrid_weight2 = Integer.parseInt(settings.getString("grid_2_weight", "n/a"));
                assgrid_percent2 = Integer.parseInt(assignment.getString("grid_2_percent", "n/a"));
            }
            if(assignment_count >= 3)
            {
                assgrid3 = assignment.getString("grid_3_name", "n/a");
                assgrid_weight3 = Integer.parseInt(settings.getString("grid_3_weight", "n/a"));
                assgrid_percent3 = Integer.parseInt(assignment.getString("grid_3_percent", "n/a"));
            }
            if(assignment_count >= 4)
            {
                assgrid4 = assignment.getString("grid_4_name", "n/a");
                assgrid_weight4 = Integer.parseInt(settings.getString("grid_4_weight", "n/a"));
                assgrid_percent4 = Integer.parseInt(assignment.getString("grid_4_percent", "n/a"));
            }
            if(assignment_count >= 5)
            {
                assgrid5 = assignment.getString("grid_5_name", "n/a");
                assgrid_weight5 = Integer.parseInt(settings.getString("grid_5_weight", "n/a"));
                assgrid_percent5 = Integer.parseInt(assignment.getString("grid_5_percent", "n/a"));
            }

            if(assgrid_weight > 0)
            {
                course = course + (assgrid_percent/100) * (assgrid_weight);
            }
            if(assgrid_weight2 > 0)
            {
                course = course + (assgrid_percent2/100) * (assgrid_weight2);
            }
            if(assgrid_weight3 > 0)
            {
                course = course + (assgrid_percent3/100) * (assgrid_weight3);
            }
            if(assgrid_weight4 > 0)
            {
                course = course + (assgrid_percent4/100) * (assgrid_weight4);
            }
            if(assgrid_weight5 > 0)
            {
                course = course + (assgrid_percent5/100) * (assgrid_weight5);
            }

        }
        if(course_count >= 2)
        {
            grid2 = settings.getString("grid_2_name", "n/a");
            grid_weight2 = Integer.parseInt(settings.getString("grid_2_weight", "n/a"));
            grid_major2 = settings.getString("grid_2_major", "n/a");

            SharedPreferences assignment = getApplicationContext().getSharedPreferences("My_Grades_" + grid, 0);
            int assignment_count = assignment.getInt("Assignment_Count", -1);

            String assgrid = "";
            int assgrid_weight = 0;
            int assgrid_percent = 0;

            String assgrid2 = "";
            int assgrid_weight2 = 0;
            int assgrid_percent2 = 0;

            String assgrid3 = "";
            int assgrid_weight3 = 0;
            int assgrid_percent3 = 0;

            String assgrid4 = "";
            int assgrid_weight4 = 0;
            int assgrid_percent4 = 0;

            String assgrid5 = "";
            int assgrid_weight5 = 0;
            int assgrid_percent5 = 0;

            if(assignment_count >= 1)
            {
                assgrid = assignment.getString("grid_0_name", "n/a");
                assgrid_weight = Integer.parseInt(settings.getString("grid_0_weight", "n/a"));
                assgrid_percent = Integer.parseInt(assignment.getString("grid_0_percent", "n/a"));
            }
            if(assignment_count >= 2)
            {
                assgrid2 = assignment.getString("grid_2_name", "n/a");
                assgrid_weight2 = Integer.parseInt(settings.getString("grid_2_weight", "n/a"));
                assgrid_percent2 = Integer.parseInt(assignment.getString("grid_2_percent", "n/a"));
            }
            if(assignment_count >= 3)
            {
                assgrid3 = assignment.getString("grid_3_name", "n/a");
                assgrid_weight3 = Integer.parseInt(settings.getString("grid_3_weight", "n/a"));
                assgrid_percent3 = Integer.parseInt(assignment.getString("grid_3_percent", "n/a"));
            }
            if(assignment_count >= 4)
            {
                assgrid4 = assignment.getString("grid_4_name", "n/a");
                assgrid_weight4 = Integer.parseInt(settings.getString("grid_4_weight", "n/a"));
                assgrid_percent4 = Integer.parseInt(assignment.getString("grid_4_percent", "n/a"));
            }
            if(assignment_count >= 5)
            {
                assgrid5 = assignment.getString("grid_5_name", "n/a");
                assgrid_weight5 = Integer.parseInt(settings.getString("grid_5_weight", "n/a"));
                assgrid_percent5 = Integer.parseInt(assignment.getString("grid_5_percent", "n/a"));
            }

            if(assgrid_weight > 0)
            {
                course2 = course2 + (assgrid_percent/100) * (assgrid_weight);
            }
            if(assgrid_weight2 > 0)
            {
                course2 = course2 + (assgrid_percent2/100) * (assgrid_weight2);
            }
            if(assgrid_weight3 > 0)
            {
                course2 = course2 + (assgrid_percent3/100) * (assgrid_weight3);
            }
            if(assgrid_weight4 > 0)
            {
                course2 = course2 + (assgrid_percent4/100) * (assgrid_weight4);
            }
            if(assgrid_weight5 > 0)
            {
                course2 = course2 + (assgrid_percent5/100) * (assgrid_weight5);
            }

        }
        if(course_count >= 3)
        {
            grid3 = settings.getString("grid_3_name", "n/a");
            grid_weight3 = Integer.parseInt(settings.getString("grid_3_weight", "n/a"));
            grid_major3 = settings.getString("grid_3_major", "n/a");

            SharedPreferences assignment = getApplicationContext().getSharedPreferences("My_Grades_" + grid, 0);
            int assignment_count = assignment.getInt("Assignment_Count", -1);

            String assgrid = "";
            int assgrid_weight = 0;
            int assgrid_percent = 0;

            String assgrid2 = "";
            int assgrid_weight2 = 0;
            int assgrid_percent2 = 0;

            String assgrid3 = "";
            int assgrid_weight3 = 0;
            int assgrid_percent3 = 0;

            String assgrid4 = "";
            int assgrid_weight4 = 0;
            int assgrid_percent4 = 0;

            String assgrid5 = "";
            int assgrid_weight5 = 0;
            int assgrid_percent5 = 0;

            if(assignment_count >= 1)
            {
                assgrid = assignment.getString("grid_0_name", "n/a");
                assgrid_weight = Integer.parseInt(settings.getString("grid_0_weight", "n/a"));
                assgrid_percent = Integer.parseInt(assignment.getString("grid_0_percent", "n/a"));
            }
            if(assignment_count >= 2)
            {
                assgrid2 = assignment.getString("grid_2_name", "n/a");
                assgrid_weight2 = Integer.parseInt(settings.getString("grid_2_weight", "n/a"));
                assgrid_percent2 = Integer.parseInt(assignment.getString("grid_2_percent", "n/a"));
            }
            if(assignment_count >= 3)
            {
                assgrid3 = assignment.getString("grid_3_name", "n/a");
                assgrid_weight3 = Integer.parseInt(settings.getString("grid_3_weight", "n/a"));
                assgrid_percent3 = Integer.parseInt(assignment.getString("grid_3_percent", "n/a"));
            }
            if(assignment_count >= 4)
            {
                assgrid4 = assignment.getString("grid_4_name", "n/a");
                assgrid_weight4 = Integer.parseInt(settings.getString("grid_4_weight", "n/a"));
                assgrid_percent4 = Integer.parseInt(assignment.getString("grid_4_percent", "n/a"));
            }
            if(assignment_count >= 5)
            {
                assgrid5 = assignment.getString("grid_5_name", "n/a");
                assgrid_weight5 = Integer.parseInt(settings.getString("grid_5_weight", "n/a"));
                assgrid_percent5 = Integer.parseInt(assignment.getString("grid_5_percent", "n/a"));
            }

            if(assgrid_weight > 0)
            {
                course3 = course3 + (assgrid_percent/100) * (assgrid_weight);
            }
            if(assgrid_weight2 > 0)
            {
                course3 = course3 + (assgrid_percent2/100) * (assgrid_weight2);
            }
            if(assgrid_weight3 > 0)
            {
                course3 = course3 + (assgrid_percent3/100) * (assgrid_weight3);
            }
            if(assgrid_weight4 > 0)
            {
                course3 = course3 + (assgrid_percent4/100) * (assgrid_weight4);
            }
            if(assgrid_weight5 > 0)
            {
                course3 = course3 + (assgrid_percent5/100) * (assgrid_weight5);
            }

        }
        if(course_count >= 4)
        {
            grid4 = settings.getString("grid_4_name", "n/a");
            grid_weight4 = Integer.parseInt(settings.getString("grid_4_weight", "n/a"));
            grid_major4 = settings.getString("grid_4_major", "n/a");

            SharedPreferences assignment = getApplicationContext().getSharedPreferences("My_Grades_" + grid, 0);
            int assignment_count = assignment.getInt("Assignment_Count", -1);

            String assgrid = "";
            int assgrid_weight = 0;
            int assgrid_percent = 0;

            String assgrid2 = "";
            int assgrid_weight2 = 0;
            int assgrid_percent2 = 0;

            String assgrid3 = "";
            int assgrid_weight3 = 0;
            int assgrid_percent3 = 0;

            String assgrid4 = "";
            int assgrid_weight4 = 0;
            int assgrid_percent4 = 0;

            String assgrid5 = "";
            int assgrid_weight5 = 0;
            int assgrid_percent5 = 0;

            if(assignment_count >= 1)
            {
                assgrid = assignment.getString("grid_0_name", "n/a");
                assgrid_weight = Integer.parseInt(settings.getString("grid_0_weight", "n/a"));
                assgrid_percent = Integer.parseInt(assignment.getString("grid_0_percent", "n/a"));
            }
            if(assignment_count >= 2)
            {
                assgrid2 = assignment.getString("grid_2_name", "n/a");
                assgrid_weight2 = Integer.parseInt(settings.getString("grid_2_weight", "n/a"));
                assgrid_percent2 = Integer.parseInt(assignment.getString("grid_2_percent", "n/a"));
            }
            if(assignment_count >= 3)
            {
                assgrid3 = assignment.getString("grid_3_name", "n/a");
                assgrid_weight3 = Integer.parseInt(settings.getString("grid_3_weight", "n/a"));
                assgrid_percent3 = Integer.parseInt(assignment.getString("grid_3_percent", "n/a"));
            }
            if(assignment_count >= 4)
            {
                assgrid4 = assignment.getString("grid_4_name", "n/a");
                assgrid_weight4 = Integer.parseInt(settings.getString("grid_4_weight", "n/a"));
                assgrid_percent4 = Integer.parseInt(assignment.getString("grid_4_percent", "n/a"));
            }
            if(assignment_count >= 5)
            {
                assgrid5 = assignment.getString("grid_5_name", "n/a");
                assgrid_weight5 = Integer.parseInt(settings.getString("grid_5_weight", "n/a"));
                assgrid_percent5 = Integer.parseInt(assignment.getString("grid_5_percent", "n/a"));
            }

            if(assgrid_weight > 0)
            {
                course4 = course4 + (assgrid_percent/100) * (assgrid_weight);
            }
            if(assgrid_weight2 > 0)
            {
                course4 = course4 + (assgrid_percent2/100) * (assgrid_weight2);
            }
            if(assgrid_weight3 > 0)
            {
                course4 = course4 + (assgrid_percent3/100) * (assgrid_weight3);
            }
            if(assgrid_weight4 > 0)
            {
                course4 = course4 + (assgrid_percent4/100) * (assgrid_weight4);
            }
            if(assgrid_weight5 > 0)
            {
                course4 = course4 + (assgrid_percent5/100) * (assgrid_weight5);
            }

        }
        if(course_count >= 5)
        {
            grid5 = settings.getString("grid_5_name", "n/a");
            grid_weight5 = Integer.parseInt(settings.getString("grid_5_weight", "n/a"));
            grid_major5 = settings.getString("grid_5_major", "n/a");

            SharedPreferences assignment = getApplicationContext().getSharedPreferences("My_Grades_" + grid, 0);
            int assignment_count = assignment.getInt("Assignment_Count", -1);

            String assgrid = "";
            int assgrid_weight = 0;
            int assgrid_percent = 0;

            String assgrid2 = "";
            int assgrid_weight2 = 0;
            int assgrid_percent2 = 0;

            String assgrid3 = "";
            int assgrid_weight3 = 0;
            int assgrid_percent3 = 0;

            String assgrid4 = "";
            int assgrid_weight4 = 0;
            int assgrid_percent4 = 0;

            String assgrid5 = "";
            int assgrid_weight5 = 0;
            int assgrid_percent5 = 0;


            if(assignment_count >= 1)
            {
                assgrid = assignment.getString("grid_0_name", "n/a");
                assgrid_weight = Integer.parseInt(settings.getString("grid_0_weight", "n/a"));
                assgrid_percent = Integer.parseInt(assignment.getString("grid_0_percent", "n/a"));
            }
            if(assignment_count >= 2)
            {
                assgrid2 = assignment.getString("grid_2_name", "n/a");
                assgrid_weight2 = Integer.parseInt(settings.getString("grid_2_weight", "n/a"));
                assgrid_percent2 = Integer.parseInt(assignment.getString("grid_2_percent", "n/a"));
            }
            if(assignment_count >= 3)
            {
                assgrid3 = assignment.getString("grid_3_name", "n/a");
                assgrid_weight3 = Integer.parseInt(settings.getString("grid_3_weight", "n/a"));
                assgrid_percent3 = Integer.parseInt(assignment.getString("grid_3_percent", "n/a"));
            }
            if(assignment_count >= 4)
            {
                assgrid4 = assignment.getString("grid_4_name", "n/a");
                assgrid_weight4 = Integer.parseInt(settings.getString("grid_4_weight", "n/a"));
                assgrid_percent4 = Integer.parseInt(assignment.getString("grid_4_percent", "n/a"));
            }
            if(assignment_count >= 5)
            {
                assgrid5 = assignment.getString("grid_5_name", "n/a");
                assgrid_weight5 = Integer.parseInt(settings.getString("grid_5_weight", "n/a"));
                assgrid_percent5 = Integer.parseInt(assignment.getString("grid_5_percent", "n/a"));
            }

            if(assgrid_weight > 0)
            {
                course5 = course5 + (assgrid_percent/100) * (assgrid_weight);
            }
            if(assgrid_weight2 > 0)
            {
                course5 = course5 + (assgrid_percent2/100) * (assgrid_weight2);
            }
            if(assgrid_weight3 > 0)
            {
                course5 = course5 + (assgrid_percent3/100) * (assgrid_weight3);
            }
            if(assgrid_weight4 > 0)
            {
                course5 = course5 + (assgrid_percent4/100) * (assgrid_weight4);
            }
            if(assgrid_weight5 > 0)
            {
                course5 = course5 + (assgrid_percent5/100) * (assgrid_weight5);
            }

        }

        course = (course * 4.0)/100;
        course2 = (course2 * 4.0)/100;
        course3 = (course3 * 4.0)/100;
        course4 = (course4 * 4.0)/100;
        course5 = (course5 * 4.0)/100;

        //double gpa = course
        Toast.makeText(getApplicationContext(), "Calculated data", Toast.LENGTH_SHORT).show();
    }

}
