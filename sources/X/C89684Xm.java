package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.4Xm  reason: invalid class name and case insensitive filesystem */
public class C89684Xm implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89684Xm(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A02 != 0) {
            C33421fI r4 = (C33421fI) this.A00;
            r4.A05.Boy(new C35681j5(this.A01, r4, 15));
            return;
        }
        AnonymousClass1RU.A02((Context) this.A01, C36441kJ.A0I("android.settings.INTERNAL_STORAGE_SETTINGS"), (AnonymousClass1RU) this.A00);
    }
}
