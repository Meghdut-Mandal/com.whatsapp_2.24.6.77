package X;

import android.content.DialogInterface;

/* renamed from: X.9pU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204119pU implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C204119pU(AnonymousClass155 r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z = this.A01;
        AnonymousClass155 r0 = this.A00;
        if (z) {
            r0.finish();
        }
    }
}
