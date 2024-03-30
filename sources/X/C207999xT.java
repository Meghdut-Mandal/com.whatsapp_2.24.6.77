package X;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.whatsapp.R;

/* renamed from: X.9xT  reason: invalid class name and case insensitive filesystem */
public final class C207999xT implements C22849Awy {
    public static C207999xT A00;

    public /* bridge */ /* synthetic */ CharSequence BmT(Preference preference) {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        ListPreference listPreference = (ListPreference) preference;
        int A0S = listPreference.A0S(listPreference.A00);
        if (A0S < 0 || (charSequenceArr2 = listPreference.A01) == null) {
            charSequence = null;
        } else {
            charSequence = charSequenceArr2[A0S];
        }
        if (TextUtils.isEmpty(charSequence)) {
            return listPreference.A05.getString(R.string.f12nameremoved);
        }
        int A0S2 = listPreference.A0S(listPreference.A00);
        if (A0S2 < 0 || (charSequenceArr = listPreference.A01) == null) {
            return null;
        }
        return charSequenceArr[A0S2];
    }
}
