package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.A1s  reason: case insensitive filesystem */
public class C20978A1s implements C159047ii {
    public final C194839Rl A00 = new C194839Rl();
    public final C194839Rl A01 = new C194839Rl();
    public final C194839Rl A02 = new C194839Rl();
    public volatile String A03 = null;

    private C114785hp A00() {
        C114785hp r13 = new C114785hp();
        String str = this.A03;
        r13.A00 = str;
        C194839Rl r1 = this.A00;
        double[] A012 = r1.A01.A01();
        double[] A013 = r1.A03.A01();
        long j = (long) A012[2];
        int i = ((int) A012[3]) + ((int) A013[3]);
        float f = (float) A012[1];
        float f2 = (float) A013[0];
        float f3 = (float) A013[1];
        C194839Rl r12 = this.A02;
        double[] A014 = r12.A01.A01();
        double[] A015 = r12.A03.A01();
        long j2 = (long) A014[2];
        int i2 = ((int) A014[3]) + ((int) A015[3]);
        float f4 = (float) A014[0];
        float f5 = (float) A014[1];
        float f6 = (float) A015[0];
        float f7 = (float) A015[1];
        double[] A016 = this.A01.A02.A01();
        long j3 = (long) A016[2];
        float f8 = (float) A016[0];
        float f9 = (float) A016[1];
        Object[] objArr = new Object[17];
        AnonymousClass000.A1I(objArr, (float) A012[0], 0);
        AnonymousClass000.A1I(objArr, f, 1);
        AnonymousClass000.A1I(objArr, f2, 2);
        AnonymousClass000.A1I(objArr, f3, 3);
        C165607th.A1T(objArr, j);
        objArr[5] = Integer.valueOf(i);
        objArr[6] = Float.valueOf(f4);
        objArr[7] = Float.valueOf(f5);
        objArr[8] = Float.valueOf(f6);
        objArr[9] = Float.valueOf(f7);
        objArr[11] = C165617ti.A0X(Long.valueOf(j2), objArr, 10, i2);
        objArr[12] = Float.valueOf(f8);
        objArr[13] = Float.valueOf(f9);
        objArr[14] = Long.valueOf(j3);
        objArr[15] = str;
        objArr[16] = false;
        if (AnonymousClass6YR.A01.BMH(4)) {
            AnonymousClass6YR.A06("PerformanceLoggerManagerImpl", StringFormatUtil.formatStrLocaleSafe("AVG Render Time [ms]: %.2f +/- %.2f, AVG Gap Time [ms]: %.2f +/- %.2f, Frame count: %d, Out of Order %d [=0 is valid]\nGPU: AVG Render Time [ms]: %.2f +/- %.2f, AVG Gap Time [ms]: %.2f +/- %.2f, Frame count: %d, Out of Order %d [=0 is valid]\nDELAY: AVG Delay Render Time [ms]: %.2f +/- %.2f, Frame count: %d\nEffect Id: %s, Is Recording: %b", objArr));
        }
        return r13;
    }

    public C114785hp B6L() {
        C114785hp A002 = A00();
        this.A00.A00();
        this.A02.A00();
        this.A01.A00();
        this.A03 = null;
        return A002;
    }

    public C114785hp B6M(String str) {
        C114785hp A002 = A00();
        this.A00.A00();
        this.A02.A00();
        this.A01.A00();
        this.A03 = str;
        return A002;
    }
}
