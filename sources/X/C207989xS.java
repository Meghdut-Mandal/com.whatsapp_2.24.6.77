package X;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.whatsapp.R;

/* renamed from: X.9xS  reason: invalid class name and case insensitive filesystem */
public final class C207989xS implements C22849Awy {
    public static C207989xS A00;

    public /* bridge */ /* synthetic */ CharSequence BmT(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.A00)) {
            return editTextPreference.A05.getString(R.string.f12nameremoved);
        }
        return editTextPreference.A00;
    }
}
