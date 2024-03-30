package X;

import java.io.File;

/* renamed from: X.73x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500873x implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6YP A01;
    public final /* synthetic */ AnonymousClass6Q9 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C1500873x(AnonymousClass6YP r1, AnonymousClass6Q9 r2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
        this.A00 = j;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = z4;
    }

    public final void run() {
        AnonymousClass6YP r2 = this.A01;
        AnonymousClass6Q9 r0 = this.A02;
        boolean z = this.A03;
        long j = this.A00;
        boolean z2 = this.A04;
        boolean z3 = this.A05;
        boolean z4 = this.A06;
        AnonymousClass6YP.A0B(r2, r0, j, z);
        File A032 = r0.A03();
        r2.A0h.A0H(new AnonymousClass74D(r2, A032, (File) r0.A0A.getValue(), A032.length(), j, z, z2, z3, z4));
    }
}
