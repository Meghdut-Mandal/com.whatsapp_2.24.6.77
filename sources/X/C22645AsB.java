package X;

import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: X.AsB  reason: case insensitive filesystem */
public class C22645AsB extends C22659AsP {
    public final C22659AsP[] A00;

    public int A0A() {
        Enumeration A0H = A0H();
        int i = 0;
        while (A0H.hasMoreElements()) {
            i += ((C219411z) A0H.nextElement()).Bve().A0A();
        }
        return i + 2 + 2;
    }

    public boolean A0E() {
        return true;
    }

    public Enumeration A0H() {
        return new B97(this, this.A00 == null ? 2 : 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22645AsB(X.C22659AsP[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r2 = X.C90524aI.A0Q()
            r1 = 0
        L_0x0005:
            int r0 = r4.length
            if (r1 == r0) goto L_0x0022
            r0 = r4[r1]     // Catch:{ IOException -> 0x0012 }
            byte[] r0 = r0.A00     // Catch:{ IOException -> 0x0012 }
            r2.write(r0)     // Catch:{ IOException -> 0x0012 }
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0012:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exception converting octets "
            java.lang.String r0 = X.C90494aF.A0c(r2, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x0022:
            byte[] r0 = r2.toByteArray()
            r3.<init>(r0)
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22645AsB.<init>(X.AsP[]):void");
    }

    public void A0D(C200179gm r5, boolean z) {
        Enumeration A0H = A0H();
        if (z) {
            r5.A00.write(36);
        }
        OutputStream outputStream = r5.A00;
        outputStream.write(128);
        while (A0H.hasMoreElements()) {
            r5.A03(((C219411z) A0H.nextElement()).Bve(), true);
        }
        outputStream.write(0);
        outputStream.write(0);
    }

    public C22645AsB(byte[] bArr) {
        super(bArr);
        this.A00 = null;
    }
}
