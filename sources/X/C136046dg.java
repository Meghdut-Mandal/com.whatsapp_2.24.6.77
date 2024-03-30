package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;

/* renamed from: X.6dg  reason: invalid class name and case insensitive filesystem */
public class C136046dg implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ GoogleDriveNewUserSetupActivity A00;

    public C136046dg(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        this.A00 = googleDriveNewUserSetupActivity;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = this.A00;
        if (googleDriveNewUserSetupActivity.A02.getVisibility() == 0) {
            GoogleDriveNewUserSetupActivity.A0F((RadioButton) null, googleDriveNewUserSetupActivity, String.valueOf(adapterView.getItemAtPosition(i)));
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
