package X;

import java.io.File;

/* renamed from: X.3vw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80773vw implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass6YP A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ File A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C80773vw(AnonymousClass6YP r1, File file, File file2, long j, long j2, long j3, boolean z) {
        this.A03 = r1;
        this.A04 = file;
        this.A05 = file2;
        this.A00 = j;
        this.A01 = j2;
        this.A06 = z;
        this.A02 = j3;
    }

    public final void run() {
        this.A03.A0M(this.A04, this.A05, this.A00, this.A01, this.A02, this.A06);
    }
}
