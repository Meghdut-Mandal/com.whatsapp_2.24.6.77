package X;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;
import java.util.Set;

/* renamed from: X.9pY  reason: invalid class name and case insensitive filesystem */
public class C204159pY implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat A00;

    public C204159pY(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.A00 = multiSelectListPreferenceDialogFragmentCompat;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        boolean remove;
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.A00;
        boolean z2 = multiSelectListPreferenceDialogFragmentCompat.A01;
        Set set = multiSelectListPreferenceDialogFragmentCompat.A00;
        String charSequence = multiSelectListPreferenceDialogFragmentCompat.A03[i].toString();
        if (z) {
            remove = set.add(charSequence);
        } else {
            remove = set.remove(charSequence);
        }
        multiSelectListPreferenceDialogFragmentCompat.A01 = remove | z2;
    }
}
