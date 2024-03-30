package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.0fv  reason: invalid class name and case insensitive filesystem */
public class C11220fv implements Runnable {
    public final /* synthetic */ DialogFragment A00;

    public C11220fv(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void run() {
        DialogFragment dialogFragment = this.A00;
        dialogFragment.A04.onDismiss(dialogFragment.A02);
    }
}
