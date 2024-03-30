package X;

/* renamed from: X.6uE  reason: invalid class name and case insensitive filesystem */
public class C145606uE implements C159447jN {
    public final int A00;
    public final int A01;
    public final C19420v0 A02;
    public final AnonymousClass004 A03;
    public final C19760wT A04;
    public final AnonymousClass005 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if ((r7 - r4.A05.A05[r4.A02].A04) > r2) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bpg(X.AnonymousClass1C9 r10, boolean r11) {
        /*
            r9 = this;
            X.005 r0 = r9.A05
            java.lang.Object r0 = r0.get()
            X.0xI r0 = (X.C20270xI) r0
            X.005 r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.19J r0 = (X.AnonymousClass19J) r0
            int r1 = r0.A04
            r0 = 2
            if (r1 != r0) goto L_0x00f8
            int r1 = r10.A03
            r0 = 1
            if (r1 != r0) goto L_0x00ae
            boolean r0 = r10.A07()
            if (r0 != 0) goto L_0x002b
            X.1CJ r0 = r10.A04
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x002b
            r10.A04()
        L_0x002b:
            X.1CJ r4 = r10.A04
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0116
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x003a
            r10.A03()
        L_0x003a:
            android.util.SparseArray r7 = r4.A00()
            X.004 r0 = r9.A03
            java.lang.Object r6 = r0.get()
            X.5q8 r6 = (X.C119605q8) r6
            int r0 = r7.size()
            java.util.ArrayList r3 = X.C36441kJ.A14(r0)
            r5 = 0
        L_0x004f:
            int r0 = r7.size()
            if (r5 >= r0) goto L_0x0100
            java.util.Set r0 = r6.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x005b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            X.61u r0 = (X.C1259061u) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x005b
            r2 = 1
        L_0x006e:
            X.0xI r8 = r6.A00
            X.005 r0 = r8.A03
            java.lang.Object r1 = r0.get()
            X.19A r1 = (X.AnonymousClass19A) r1
            X.19J r0 = r1.A01
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0100
            X.1cZ r0 = r1.A0D
            if (r0 == 0) goto L_0x0100
            if (r2 != 0) goto L_0x0100
            int r2 = r7.keyAt(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WamSender/sending/buffer:"
            X.C36321k7.A1T(r0, r1, r2)
            java.lang.Object r0 = r7.get(r2)
            byte[] r0 = (byte[]) r0
            boolean r0 = r8.A01(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = "WamSender/send/buffer:"
            X.C36321k7.A1T(r0, r1, r2)
            X.AnonymousClass000.A1F(r3, r2)
            int r5 = r5 + 1
            goto L_0x004f
        L_0x00ac:
            r2 = 0
            goto L_0x006e
        L_0x00ae:
            if (r1 != 0) goto L_0x002b
            X.1CJ r4 = r10.A04
            boolean r0 = r4.A07()
            if (r0 != 0) goto L_0x002b
            boolean r0 = r10.A07()
            if (r0 != 0) goto L_0x002b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r7 = r2.toSeconds(r0)
            X.0v0 r6 = r9.A02
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r6)
            java.lang.String r5 = "wam_is_current_buffer_real_time"
            boolean r0 = X.C36371kC.A1U(r0, r5)
            if (r0 == 0) goto L_0x00f5
            int r0 = r9.A00
        L_0x00d8:
            long r2 = (long) r0
            if (r11 != 0) goto L_0x00ec
            X.1CT r4 = r4.A00
            X.1CC r0 = r4.A05
            X.1CD[] r1 = r0.A05
            int r0 = r4.A02
            r0 = r1[r0]
            long r0 = r0.A04
            long r7 = r7 - r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
        L_0x00ec:
            r10.A04()
            r0 = 0
            X.C36331k8.A18(r6, r5, r0)
            goto L_0x002b
        L_0x00f5:
            int r0 = r9.A01
            goto L_0x00d8
        L_0x00f8:
            java.lang.String r0 = "WamSender/send/mh-disconnected"
            goto L_0x0113
        L_0x00fb:
            java.lang.String r0 = "WamSender/fail/buffer:"
            X.C36321k7.A1T(r0, r1, r2)
        L_0x0100:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "WamSender/send: successfully sent data; dropping the buffer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A05(r3)
            r10.A03()
            java.lang.String r0 = "WamSender/sendack: dropped rotated buffer"
        L_0x0113:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0116:
            return
        L_0x0117:
            java.lang.String r0 = "WamSender/send: failed to send data"
            goto L_0x0113
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145606uE.Bpg(X.1C9, boolean):void");
    }

    public void Bpi(AnonymousClass1C9 r2, int i, boolean z, boolean z2) {
        throw AnonymousClass001.A0E("fieldstatssender/send should not call send method with dithered info");
    }

    public C145606uE(C19760wT r3, C19420v0 r4, C20810yC r5, AnonymousClass005 r6, AnonymousClass004 r7) {
        this.A03 = r7;
        this.A05 = r6;
        this.A02 = r4;
        this.A04 = r3;
        this.A01 = r5.A07(7018);
        this.A00 = Math.min(300, r5.A07(7018));
    }
}
