package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0ZP  reason: invalid class name */
public class AnonymousClass0ZP implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment A00;

    public AnonymousClass0ZP(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.A02;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
