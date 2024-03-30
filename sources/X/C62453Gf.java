package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.3Gf  reason: invalid class name and case insensitive filesystem */
public class C62453Gf {
    public final C20760y7 A00;
    public final C203399nx A01;
    public final String A02;
    public final Map A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62453Gf)) {
            return false;
        }
        C62453Gf r4 = (C62453Gf) obj;
        return this.A02.equals(r4.A02) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return (this.A02.hashCode() ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }

    public C62453Gf(C203399nx r2, String str, Map map, Map map2, Set set) {
        this.A02 = str;
        this.A01 = r2;
        C227315o r0 = new C227315o();
        r0.addAll(set);
        this.A00 = r0.build();
        this.A04 = map;
        this.A03 = map2;
    }
}
