package X;

import android.content.DialogInterface;

/* renamed from: X.7pu  reason: invalid class name and case insensitive filesystem */
public class C163257pu implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C163257pu(C1271967i r1, C100674vP r2, C140456lc r3, C142326oh r4, int i) {
        this.A04 = i;
        this.A00 = r4;
        this.A01 = r3;
        this.A02 = r1;
        this.A03 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C140456lc r0 = (C140456lc) this.A01;
        Object obj = this.A02;
        C100674vP r3 = (C100674vP) this.A03;
        C160377ku A0E = C140456lc.A0E(r0);
        if (A0E != null) {
            C1273868b A032 = C1273868b.A03(r0);
            A032.A0A(obj, 1);
            C1273868b.A07(r3, A032, A0E);
        }
    }
}
