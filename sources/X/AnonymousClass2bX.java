package X;

/* renamed from: X.2bX  reason: invalid class name */
public class AnonymousClass2bX extends AnonymousClass3T1 implements AnonymousClass4RU, AnonymousClass4RV {
    public String A00;
    public String A01;
    public AnonymousClass363 A02;

    public AnonymousClass2bX(C64933Qa r8, AnonymousClass2bX r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A02 = 0;
        this.A00 = r9.A00;
        this.A01 = r9.A1X();
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B31(C64933Qa r7, long j) {
        return new AnonymousClass2bX(r7, this, j, false);
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r7) {
        return new AnonymousClass2bX(r7, this, this.A0I, true);
    }

    public void A16(String str) {
        synchronized (this.A1M) {
            super.A16(str);
            this.A01 = str;
        }
    }

    public String A1X() {
        String str;
        synchronized (this.A1M) {
            str = this.A01;
        }
        return str;
    }

    public void A1Y(String str) {
        synchronized (this.A1M) {
            this.A01 = str;
            this.A02 = null;
            super.A16(str);
        }
    }

    public AnonymousClass2bX(C64933Qa r2, long j) {
        super(r2, 4, j);
        this.A02 = 0;
    }
}
