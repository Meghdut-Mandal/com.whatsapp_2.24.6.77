package X;

import java.io.File;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: X.A2c  reason: case insensitive filesystem */
public class C20988A2c implements B5Y {
    public final C20989A2d A00;
    public final AnonymousClass896 A01;

    public synchronized void B0T(String str) {
        this.A01.B0T(str);
    }

    public NavigableSet B0R(B2F b2f, String str) {
        return this.A01.B0R(b2f, str);
    }

    public void B38(File file) {
        this.A01.B38(file);
    }

    public void B39(C21664AUg aUg, byte[] bArr) {
        this.A00.B39(aUg, bArr);
    }

    public long B97() {
        return this.A01.B97();
    }

    public NavigableSet B9B(String str) {
        return this.A01.B9B(str);
    }

    public Set BDP() {
        return this.A01.BDP();
    }

    public long BIR(String str) {
        return this.A01.BIR(str);
    }

    public boolean BLH(String str, long j, long j2) {
        return this.A01.BLH(str, j, j2);
    }

    public boolean BLI(String str, long j, long j2) {
        return this.A01.BLI(str, j, j2);
    }

    public boolean BMG(String str) {
        return this.A01.BMG(str);
    }

    public byte[] Bmu(C21664AUg aUg) {
        return this.A00.Bmu(aUg);
    }

    public void BnP(C21664AUg aUg) {
        this.A01.BnP(aUg);
        if (aUg.A02) {
            synchronized (this.A00) {
            }
        }
    }

    public void Bnn(B2F b2f, String str) {
        this.A01.Bnn(b2f, str);
    }

    public void Bny(C21664AUg aUg) {
        this.A01.Bny(aUg);
        if (aUg.A02) {
            this.A00.Bny(aUg);
        }
    }

    public void Bnz(C21664AUg aUg, String str) {
        this.A01.Bnz(aUg, str);
        if (aUg.A02) {
            this.A00.Bnz(aUg, str);
        }
    }

    public void BsX(String str, long j) {
        this.A01.BsX(str, j);
    }

    public File BuU(String str, long j, long j2) {
        return this.A01.BuU(str, j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r5 = r8.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C21664AUg Buj(java.lang.Integer r9, java.lang.String r10, long r11) {
        /*
            r8 = this;
            X.896 r0 = r8.A01
            X.AUg r6 = r0.Buj(r9, r10, r11)
            if (r6 == 0) goto L_0x002b
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x002b
            X.A2d r5 = r8.A00
            X.AUg r7 = r5.Buj(r9, r10, r11)
            if (r7 == 0) goto L_0x002b
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x002c
            long r3 = r6.A05
            long r1 = r7.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            long r3 = r6.A04
            long r1 = r7.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            r0 = 1
            r6.A02 = r0
        L_0x002b:
            return r6
        L_0x002c:
            monitor-enter(r5)
            monitor-exit(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20988A2c.Buj(java.lang.Integer, java.lang.String, long):X.AUg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r13 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C21664AUg Buk(java.lang.Integer r21, java.lang.String r22, long r23, long r25) {
        /*
            r20 = this;
            r1 = r20
            X.896 r6 = r1.A01
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r25
            X.AUg r6 = r6.Buk(r7, r8, r9, r11)
            if (r6 == 0) goto L_0x003b
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x003b
            X.A2d r13 = r1.A00
            r14 = r7
            r15 = r8
            r16 = r9
            r18 = r11
            X.AUg r5 = r13.Buk(r14, r15, r16, r18)
            if (r5 == 0) goto L_0x003b
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x003c
            long r3 = r6.A05
            long r1 = r5.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            long r3 = r6.A04
            long r1 = r5.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            r0 = 1
            r6.A02 = r0
        L_0x003b:
            return r6
        L_0x003c:
            monitor-enter(r13)
            monitor-exit(r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20988A2c.Buk(java.lang.Integer, java.lang.String, long, long):X.AUg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r5 = r8.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C21664AUg Bul(java.lang.Integer r9, java.lang.String r10, long r11) {
        /*
            r8 = this;
            X.896 r0 = r8.A01
            X.AUg r6 = r0.Bul(r9, r10, r11)
            if (r6 == 0) goto L_0x002b
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x002b
            X.A2d r5 = r8.A00
            X.AUg r7 = r5.Bul(r9, r10, r11)
            if (r7 == 0) goto L_0x002b
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x002c
            long r3 = r6.A05
            long r1 = r7.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            long r3 = r6.A04
            long r1 = r7.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            r0 = 1
            r6.A02 = r0
        L_0x002b:
            return r6
        L_0x002c:
            monitor-enter(r5)
            monitor-exit(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20988A2c.Bul(java.lang.Integer, java.lang.String, long):X.AUg");
    }

    public C20988A2c(C20989A2d a2d, AnonymousClass896 r2) {
        this.A01 = r2;
        this.A00 = a2d;
    }
}
