package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9U7  reason: invalid class name */
public final class AnonymousClass9U7 {
    public final List A00;
    public final Map A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass9U7 r4 = (AnonymousClass9U7) obj;
        return this.A02.equals(r4.A02) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        int hashCode = (this.A02.hashCode() + 31) * 31;
        Long l = -1L;
        int hashCode2 = l.hashCode();
        return ((((((((hashCode + hashCode2) * 31) + hashCode2) * 31) + hashCode2) * 31 * 31 * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public AnonymousClass9U7(AnonymousClass9JT r2) {
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }
}
