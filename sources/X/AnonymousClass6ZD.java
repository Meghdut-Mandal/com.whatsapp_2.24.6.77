package X;

import android.content.DialogInterface;

/* renamed from: X.6ZD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZD implements DialogInterface.OnShowListener {
    public final /* synthetic */ AnonymousClass0FM A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass6ZD(AnonymousClass0FM r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AnonymousClass0FM r0 = this.A00;
        r0.A00.A0H.setContentDescription(this.A01);
    }
}
