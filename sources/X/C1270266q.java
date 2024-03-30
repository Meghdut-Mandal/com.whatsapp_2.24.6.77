package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.66q  reason: invalid class name and case insensitive filesystem */
public class C1270266q {
    public final Collection A00;
    public final Map A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1270266q r5 = (C1270266q) obj;
            if (!Arrays.equals(this.A02, r5.A02) || !this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C1270266q(Collection collection, Map map, byte[] bArr) {
        this.A02 = bArr;
        this.A00 = collection;
        this.A01 = map;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A02;
        A1Q[1] = this.A01;
        return C90484aE.A0D(this.A00, A1Q);
    }
}
