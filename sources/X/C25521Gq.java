package X;

/* renamed from: X.1Gq  reason: invalid class name and case insensitive filesystem */
public class C25521Gq implements AnonymousClass1EI {
    public final AnonymousClass1GF A00;
    public final C20810yC A01;

    public synchronized void A00(AnonymousClass6Q6 r5) {
        boolean z;
        AnonymousClass2bU r3 = r5.A04;
        synchronized (r5) {
            z = r5.A00;
        }
        if (!z) {
            C120155r3 A002 = this.A00.A00(r3.A1J);
            if (A002 != null) {
                byte[] bArr = A002.A00;
                int[] iArr = A002.A01;
                synchronized (r5) {
                    if (!r5.A00) {
                        r5.A02(bArr, iArr);
                    }
                }
                r5.A05 = AnonymousClass3T2.A01(this.A01, r3);
            }
            r5.A00 = true;
        }
    }

    public boolean BQ5(AnonymousClass3IP r4, AnonymousClass3T1 r5) {
        AnonymousClass6Q6 A1Y;
        boolean z;
        if (!(r5 instanceof AnonymousClass2bU) || (A1Y = ((AnonymousClass2bU) r5).A1Y()) == null) {
            return false;
        }
        synchronized (A1Y) {
            z = A1Y.A00;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public C25521Gq(AnonymousClass1GF r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BON(AnonymousClass3IP r2, AnonymousClass3T1 r3) {
        AnonymousClass6Q6 A1Y;
        if (BQ5(r2, r3) && (r3 instanceof AnonymousClass2bU) && (A1Y = ((AnonymousClass2bU) r3).A1Y()) != null) {
            A00(A1Y);
        }
    }
}
