package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: X.9vK  reason: invalid class name and case insensitive filesystem */
public class C207509vK implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreference A00;

    public C207509vK(SwitchPreference switchPreference) {
        this.A00 = switchPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreference switchPreference = this.A00;
        C165607th.A1B(switchPreference, switchPreference, z);
    }
}
