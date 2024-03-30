package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0ZR  reason: invalid class name */
public class AnonymousClass0ZR implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment A00;

    public AnonymousClass0ZR(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.A02;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
