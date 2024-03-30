package androidx.preference;

import X.AnonymousClass001;
import X.C36381kD;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText A00;
    public CharSequence A01;

    public void A1Q(Bundle bundle) {
        CharSequence charSequence;
        super.A1Q(bundle);
        if (bundle == null) {
            charSequence = ((EditTextPreference) A1h()).A00;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.A01 = charSequence;
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A01);
    }

    public void A1i(View view) {
        super.A1i(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.A00 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.A00.setText(this.A01);
            EditText editText2 = this.A00;
            editText2.setSelection(C36381kD.A06(editText2));
            A1h();
            return;
        }
        throw AnonymousClass001.A09("Dialog view must contain an EditText with id @android:id/edit");
    }
}
