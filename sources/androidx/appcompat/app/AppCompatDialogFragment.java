package androidx.appcompat.app;

import X.AnonymousClass0DT;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public abstract class AppCompatDialogFragment extends DialogFragment {
    public void A1e(int i, Dialog dialog) {
        if (dialog instanceof AnonymousClass0DT) {
            AnonymousClass0DT r3 = (AnonymousClass0DT) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            r3.A02().A0T(1);
            return;
        }
        super.A1e(i, dialog);
    }
}
