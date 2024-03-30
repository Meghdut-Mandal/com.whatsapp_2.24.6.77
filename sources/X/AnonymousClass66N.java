package X;

import java.util.HashMap;

/* renamed from: X.66N  reason: invalid class name */
public class AnonymousClass66N {
    public final C131636Pw A00;
    public final HashMap A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass66N)) {
            return false;
        }
        AnonymousClass66N r4 = (AnonymousClass66N) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (159 + this.A00.hashCode()) * 53);
    }

    public AnonymousClass66N(C131636Pw r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }
}
