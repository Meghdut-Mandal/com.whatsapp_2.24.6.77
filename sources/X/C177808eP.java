package X;

/* renamed from: X.8eP  reason: invalid class name and case insensitive filesystem */
public class C177808eP extends C201579ju {
    public int A00 = 1;
    public long A01;
    public boolean A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C177808eP(X.C19700wN r18, X.C19970wo r19, X.AnonymousClass11g r20, X.C20810yC r21, X.C21010yW r22, X.AnonymousClass19L r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.String r26, int r27, long r28, long r30, boolean r32, boolean r33, boolean r34) {
        /*
            r17 = this;
            r0 = 1
            r12 = 0
            r13 = r28
            r11 = r26
            r6 = r21
            r5 = r20
            r4 = r19
            r2 = r17
            r15 = r30
            r3 = r18
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
            r1 = r27
            r2.A03 = r1
            r1 = r34
            r2.A05 = r1
            r1 = r32
            r2.A04 = r1
            r1 = r33
            r2.A06 = r1
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177808eP.<init>(X.0wN, X.0wo, X.11g, X.0yC, X.0yW, X.19L, java.lang.Integer, java.lang.Integer, java.lang.String, int, long, long, boolean, boolean, boolean):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoggableMessageStanza");
        A0u.append("(");
        A0u.append(super.toString());
        A0u.append("; messageType=");
        A0u.append(this.A03);
        A0u.append("; hasSenderKeyDistributionMessage=");
        A0u.append(this.A05);
        A0u.append("; ephemeral=");
        A0u.append(this.A04);
        A0u.append("; revoke=");
        A0u.append(this.A06);
        A0u.append("; decryptionSuccess=");
        A0u.append(this.A02);
        A0u.append("; mediaType=");
        A0u.append(this.A00);
        A0u.append("; decryptQueueSize=");
        A0u.append(this.A01);
        return C90474aD.A0f(A0u);
    }
}
