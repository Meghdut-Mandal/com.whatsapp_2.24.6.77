package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.14b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C223814b implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C21020yX A02;

    public /* synthetic */ C223814b(Context context, C21020yX r2, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A00 = i;
    }

    public final void run() {
        int i;
        C21020yX r0 = this.A02;
        Context context = this.A01;
        int i2 = this.A00;
        C20900yL r12 = r0.A0M;
        r12.A04();
        File file = new File(context.getFilesDir(), "wam.wam");
        C19760wT r8 = r0.A0G;
        AnonymousClass1C9 r7 = new AnonymousClass1C9(r8, (C19420v0) null, (C20810yC) null, (C20870yI) null, r12, file, 3, i2, 0, false);
        r0.A01 = r7;
        C20930yO r2 = r0.A0L;
        C20870yI r1 = r0.A0K;
        r0.A08 = new AnonymousClass1E5(r8, r1, r2, r7);
        r0.A0P.countDown();
        AnonymousClass1C9 r72 = new AnonymousClass1C9(r8, (C19420v0) null, (C20810yC) null, (C20870yI) null, r12, new File(context.getFilesDir(), "wamrealtime.wam"), 8, i2, 1, false);
        r0.A04 = r72;
        r0.A07 = new AnonymousClass1E5(r8, r1, r2, r72);
        r0.A0S.countDown();
        C20810yC r5 = r0.A0I;
        C21000yV r6 = C21000yV.A02;
        if (C20800yB.A01(r6, r5, 3271)) {
            i = C20800yB.A00(r6, r5, 4290);
        } else {
            i = 2;
        }
        File file2 = new File(context.getFilesDir(), "wamdit3.wam");
        C19420v0 r9 = r0.A0H;
        C20810yC r10 = r5;
        C20870yI r11 = r1;
        AnonymousClass1C9 r73 = new AnonymousClass1C9(r8, r9, r10, r11, r12, file2, i, i2, 2, true);
        r0.A03 = r73;
        r0.A06 = new AnonymousClass1E5(r8, r1, r2, r73);
        r0.A0R.countDown();
        AnonymousClass1C9 r74 = new AnonymousClass1C9(r8, r9, r10, r11, r12, new File(context.getFilesDir(), "wamditrt3.wam"), i, i2, 3, true);
        r0.A02 = r74;
        r0.A05 = new AnonymousClass1E5(r8, r1, r2, r74);
        r0.A0Q.countDown();
    }
}
