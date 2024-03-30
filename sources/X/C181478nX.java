package X;

/* renamed from: X.8nX  reason: invalid class name and case insensitive filesystem */
public class C181478nX extends C181758nz {
    public String A00;
    public String A01;

    public C181478nX(C64933Qa r2, long j) {
        super(r2, 1, j);
    }

    public String A0b() {
        String str;
        synchronized (this.A1M) {
            str = this.A00;
        }
        return str;
    }

    public String A0d() {
        String str;
        synchronized (this.A1M) {
            str = this.A00;
        }
        return str;
    }

    public void A17(String str) {
        synchronized (this.A1M) {
            this.A00 = str;
        }
    }

    public void A1a(String str) {
        synchronized (this.A1M) {
            this.A00 = str;
        }
    }

    public void A16(String str) {
        A1a(str);
    }

    public C181478nX(AnonymousClass6X6 r7, C207209uj r8, long j) {
        super(r7, r8, 1, j);
    }
}
