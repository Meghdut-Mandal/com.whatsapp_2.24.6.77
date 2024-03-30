package androidx.preference;

import X.AnonymousClass001;
import X.C204159pY;
import X.C36441kJ;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog$Builder;
import java.util.Set;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public Set A00 = C36441kJ.A16();
    public boolean A01;
    public CharSequence[] A02;
    public CharSequence[] A03;

    public void A1j(AlertDialog$Builder alertDialog$Builder) {
        int length = this.A03.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.A00.contains(this.A03[i].toString());
        }
        alertDialog$Builder.A0X(new C204159pY(this), this.A02, zArr);
    }

    public void A1k(boolean z) {
        if (z && this.A01) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A1h();
            Set set = this.A00;
            multiSelectListPreference.A0R(set);
            multiSelectListPreference.A0S(set);
        }
        this.A01 = false;
    }

    public void A1Q(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A1Q(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A1h();
            CharSequence[] charSequenceArr = multiSelectListPreference.A01;
            if (charSequenceArr == null || (charSequenceArray = multiSelectListPreference.A02) == null) {
                throw AnonymousClass001.A09("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            Set set = this.A00;
            set.clear();
            set.addAll(multiSelectListPreference.A00);
            this.A01 = false;
            this.A02 = charSequenceArr;
        } else {
            Set set2 = this.A00;
            set2.clear();
            set2.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.A01 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.A02 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            charSequenceArray = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
        this.A03 = charSequenceArray;
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", C36441kJ.A15(this.A00));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A01);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A02);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A03);
    }
}
