package X;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: X.9vJ  reason: invalid class name and case insensitive filesystem */
public class C207499vJ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CheckBoxPreference A00;

    public C207499vJ(CheckBoxPreference checkBoxPreference) {
        this.A00 = checkBoxPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBoxPreference checkBoxPreference = this.A00;
        C165607th.A1B(checkBoxPreference, checkBoxPreference, z);
    }
}
