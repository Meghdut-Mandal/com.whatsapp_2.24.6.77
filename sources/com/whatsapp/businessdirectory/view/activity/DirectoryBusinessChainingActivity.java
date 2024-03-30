package com.whatsapp.businessdirectory.view.activity;

import X.C36381kD;
import X.C36441kJ;
import android.content.Intent;
import android.view.MenuItem;

public class DirectoryBusinessChainingActivity extends BusinessDirectoryActivity {
    public void A3q(boolean z) {
        Intent A0H = C36441kJ.A0H(this, BusinessDirectoryActivity.class);
        A0H.putExtra("arg_launch_consumer_home", true);
        C36381kD.A15(this, A0H);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent A0H = C36441kJ.A0H(this, BusinessDirectoryActivity.class);
        A0H.putExtra("arg_launch_consumer_home", true);
        C36381kD.A15(this, A0H);
        return true;
    }
}
