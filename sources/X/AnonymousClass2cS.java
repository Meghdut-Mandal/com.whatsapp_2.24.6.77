package X;

import java.util.Set;

/* renamed from: X.2cS  reason: invalid class name */
public class AnonymousClass2cS extends C181758nz {
    public int A00;
    public AnonymousClass147 A01;
    public String A02 = "";
    public final Set A03 = C36441kJ.A17();

    public String A0c() {
        AnonymousClass147 r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        return r0.getRawString();
    }

    public void A16(String str) {
        synchronized (this.A1M) {
            this.A02 = str;
        }
    }

    public String A1a() {
        String str;
        synchronized (this.A1M) {
            str = this.A02;
        }
        return str;
    }

    public AnonymousClass2cS(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }

    public String A0b() {
        return A1a();
    }
}
