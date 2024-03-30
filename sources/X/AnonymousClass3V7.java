package X;

import android.content.DialogInterface;

/* renamed from: X.3V7  reason: invalid class name */
public class AnonymousClass3V7 implements DialogInterface.OnClickListener {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();

    public void onClick(DialogInterface dialogInterface, int i) {
        C001700s r0;
        if (i == -3) {
            r0 = this.A01;
        } else if (i == -2) {
            r0 = this.A00;
        } else if (i == -1) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.A0C(dialogInterface);
    }
}
