package X;

/* renamed from: X.1DV  reason: invalid class name */
public final class AnonymousClass1DV {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;

    public AnonymousClass1DV(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 5);
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A04 = r6;
    }

    public int A00(AnonymousClass11F r3) {
        AnonymousClass141 A08;
        if (r3 == null || (A08 = ((AnonymousClass16D) this.A03.get()).A08(r3)) == null) {
            return 0;
        }
        return A08.A00;
    }

    public boolean A02(AnonymousClass11F r5) {
        AnonymousClass141 A08;
        if (r5 == null || (A08 = ((AnonymousClass16D) this.A03.get()).A08(r5)) == null || !A08.A0D()) {
            return false;
        }
        return C20800yB.A01(C21000yV.A02, (C20800yB) this.A00.get(), 4873);
    }

    public boolean A03(AnonymousClass11F r3) {
        AnonymousClass141 A08;
        if (r3 == null || (A08 = ((AnonymousClass16D) this.A03.get()).A08(r3)) == null || !A08.A0E()) {
            return false;
        }
        Object obj = this.A00.get();
        AnonymousClass00C.A08(obj);
        return C55942vR.A00((C20810yC) obj);
    }

    public void A01(AnonymousClass11F r5, boolean z) {
        ((AnonymousClass3CJ) this.A01.get()).A00(((AnonymousClass163) this.A02.get()).A08(r5), z);
        ((AnonymousClass196) this.A04.get()).A0J(new AnonymousClass3I4(Boolean.valueOf(z), r5.getRawString()), C26691Ld.BOT_WELCOME_REQUEST);
    }
}
