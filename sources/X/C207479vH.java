package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* renamed from: X.9vH  reason: invalid class name and case insensitive filesystem */
public class C207479vH implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ DropDownPreference A00;

    public void onNothingSelected(AdapterView adapterView) {
    }

    public C207479vH(DropDownPreference dropDownPreference) {
        this.A00 = dropDownPreference;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            DropDownPreference dropDownPreference = this.A00;
            String charSequence = dropDownPreference.A02[i].toString();
            if (!charSequence.equals(dropDownPreference.A00)) {
                dropDownPreference.A0R(charSequence);
                dropDownPreference.A0T(charSequence);
            }
        }
    }
}
