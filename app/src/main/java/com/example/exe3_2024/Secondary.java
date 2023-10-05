package com.example.exe3_2024;
/**
 * @author		Yiftah David yd2058@bs.amalnet.k12.il
 * @version	    1.2
 * @since		5/10/2024
 * this app applies the options menu in order to change background colors, screen1 has R,G,B and screen2 has R,G,B,W
 */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Secondary extends AppCompatActivity {
    String title;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        ll = findViewById(R.id.llt);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**
         * creates the options menu visually
         * <p>
         *
         * @param	menu Description	refers to the Menu object for this screen.
         * @return	Description			returns a super action of this activity.
         */
        menu.add(0,0,4,"White");
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        /**
         * reacts to option selections in the options menu.
         * <p>
         *
         * @param	item Description	refers to the item selected by the user.
         * @return	Description			returns a super action of this activity.
         */
        title  = item.getTitle().toString();
        if(title.equals("Red")){ll.setBackgroundColor(0xFFFF2020);}
        else if (title.equals("Green")) {ll.setBackgroundColor(0xFF20FF20);}
        else if (title.equals("Blue")) {ll.setBackgroundColor(0xFF2020FF);}
        else if (title=="White") {ll.setBackgroundColor(0xFFFFFFFF);}
        return super.onOptionsItemSelected(item);
    }
    public void next(View view) {
        /**
         * when the return button is pressed this action will send them to the previous screen
         * <p>
         *
         * @param	view Description	refers to this activity.
         */
        finish();
    }
}