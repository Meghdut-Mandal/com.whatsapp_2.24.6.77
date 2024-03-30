package androidx.preference;

import X.AnonymousClass001;
import X.B83;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog$Builder;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    public void A1j(AlertDialog$Builder alertDialog$Builder) {
        alertDialog$Builder.A0U(new B83(this, 1), this.A01, this.A00);
        alertDialog$Builder.A0S((DialogInterface.OnClickListener) null, (CharSequence) null);
    }

    public void A1k(boolean z) {
        int i;
        if (z && (i = this.A00) >= 0) {
            String charSequence = this.A02[i].toString();
            ListPreference listPreference = (ListPreference) A1h();
            listPreference.A0R(charSequence);
            listPreference.A0T(charSequence);
        }
    }

    public void A1Q(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A1Q(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) A1h();
            if (listPreference.A01 == null || listPreference.A02 == null) {
                throw AnonymousClass001.A09("ListPreference requires an entries array and an entryValues array.");
            }
            this.A00 = listPreference.A0S(listPreference.A00);
            this.A01 = listPreference.A01;
            charSequenceArray = listPreference.A02;
        } else {
            this.A00 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.A01 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            charSequenceArray = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
        this.A02 = charSequenceArray;
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.A00);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A01);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A02);
    }
}
