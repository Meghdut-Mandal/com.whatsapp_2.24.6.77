package X;

import java.io.File;

/* renamed from: X.74D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74D implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass6YP A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass74D(AnonymousClass6YP r1, File file, File file2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r1;
        this.A03 = file;
        this.A04 = file2;
        this.A00 = j;
        this.A05 = z;
        this.A01 = j2;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
    }

    public final void run() {
        this.A02.A0N(this.A03, this.A04, this.A00, this.A01, this.A05, this.A06, this.A07, this.A08);
    }
}
