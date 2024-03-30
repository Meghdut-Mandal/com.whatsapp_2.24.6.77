package X;

/* renamed from: X.1uS  reason: invalid class name and case insensitive filesystem */
public final class C39991uS extends AnonymousClass04R {
    public static final C52612ps A0C = C52612ps.SEVEN_DAYS;
    public C52612ps A00 = A0C;
    public AnonymousClass3T1 A01;
    public final AnonymousClass17Y A02;
    public final C20810yC A03;
    public final C1264564b A04;
    public final AnonymousClass3PQ A05;
    public final C34831hi A06;
    public final C19770wU A07;
    public final C19970wo A08;
    public final AnonymousClass3T1 A09;
    public final C64933Qa A0A;
    public final AnonymousClass1A1 A0B;

    public static final synchronized AnonymousClass3T1 A01(C39991uS r2) {
        AnonymousClass3T1 r0;
        synchronized (r2) {
            r0 = r2.A01;
            if (r0 == null) {
                r0 = r2.A0B.A03(r2.A0A);
            }
            r2.A01 = r0;
        }
        return r0;
    }

    public final boolean A0S(AnonymousClass3T1 r10) {
        Long l;
        long A002 = C19970wo.A00(this.A08);
        C52612ps r6 = C52612ps.THIRTY_DAYS;
        for (C52612ps r2 : C52612ps.values()) {
            if (!r2.debugMenuOnlyField && r2.A00() > r6.A00()) {
                r6 = r2;
            }
        }
        long A072 = A002 + C36371kC.A07(r6.A00());
        if (r10 == null || (l = r10.A0g) == null || l.longValue() >= A072) {
            return false;
        }
        return true;
    }

    public C39991uS(AnonymousClass17Y r2, C19970wo r3, C20810yC r4, C1264564b r5, AnonymousClass3PQ r6, AnonymousClass3T1 r7, C64933Qa r8, AnonymousClass1A1 r9, C19770wU r10) {
        C36321k7.A1B(r3, r4, r2, r10, r9);
        C36321k7.A10(r5, r6);
        this.A08 = r3;
        this.A03 = r4;
        this.A02 = r2;
        this.A07 = r10;
        this.A0B = r9;
        this.A04 = r5;
        this.A05 = r6;
        this.A0A = r8;
        this.A09 = r7;
        this.A01 = r7;
        this.A06 = C36441kJ.A0s(C36381kD.A0j());
    }
}
