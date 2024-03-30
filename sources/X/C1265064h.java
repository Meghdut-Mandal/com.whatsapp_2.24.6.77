package X;

import android.content.Context;

/* renamed from: X.64h  reason: invalid class name and case insensitive filesystem */
public class C1265064h {
    public final C116105jx A00;
    public final C158987iZ A01;
    public final C100114uU A02;
    public final C132126Sg A03;
    public final C97584pw A04;
    public final C100564vE A05;
    public final AnonymousClass6T8 A06;
    public final C121935tx A07;

    public void A00(Context context, AnonymousClass7fJ r19, AnonymousClass65A r20) {
        C132126Sg r11 = this.A03;
        C97584pw r6 = this.A04;
        C100564vE r9 = this.A05;
        Context context2 = context;
        C124715yg r4 = new C124715yg(context2, r6, this.A02, AnonymousClass6IJ.A00, r9, r19, r11, this.A06);
        C1258361l r1 = new C1258361l(r20, this);
        r4.A05 = r1;
        C158987iZ r62 = this.A01;
        r4.A01 = r62;
        Context context3 = r4.A00;
        AnonymousClass7fJ r13 = r4.A03;
        AnonymousClass5Z2 r10 = new AnonymousClass5Z2();
        AnonymousClass5ZD r12 = r4.A02;
        C132126Sg r14 = r4.A04;
        AnonymousClass65V r7 = r4.A06;
        AnonymousClass6WH r112 = r4.A09;
        AnonymousClass6NR r42 = new AnonymousClass6NR(context3, r62, r7, r4.A07, r4.A08, r10, r112, r12, r13, r14, r4.A0A, r1);
        synchronized (AnonymousClass6NR.class) {
            AnonymousClass6NR.A0C = r42;
        }
        synchronized (C110095a7.class) {
        }
        C140366lT r0 = new C140366lT(this.A07, false);
        AnonymousClass6RL.A00 = r0;
        AnonymousClass6RS.A00 = r0;
    }

    public C1265064h(C158987iZ r1, C116105jx r2, C100114uU r3, C132126Sg r4, C97584pw r5, C100564vE r6, AnonymousClass6T8 r7, C121935tx r8) {
        this.A01 = r1;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r2;
        this.A06 = r7;
    }
}
