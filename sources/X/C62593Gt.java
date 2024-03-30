package X;

import java.util.Collection;

/* renamed from: X.3Gt  reason: invalid class name and case insensitive filesystem */
public class C62593Gt {
    public final C23931Ak A00;
    public final C600336f A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Collection A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62593Gt r5 = (C62593Gt) obj;
            if (!C1901797e.A00(this.A03, r5.A03) || !C1901797e.A00(this.A02, r5.A02) || !C1901797e.A00(this.A00, r5.A00) || !C1901797e.A00(this.A01, r5.A01) || this.A06 != r5.A06 || !C1901797e.A00(this.A04, r5.A04) || this.A05 != r5.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A03;
        objArr[1] = this.A02;
        objArr[2] = this.A00;
        objArr[3] = null;
        objArr[4] = this.A01;
        objArr[5] = Boolean.valueOf(this.A06);
        objArr[6] = this.A04;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A05), objArr, 7);
    }

    public C62593Gt(C23931Ak r1, C600336f r2, Boolean bool, Boolean bool2, Collection collection, boolean z, boolean z2) {
        this.A03 = bool;
        this.A02 = bool2;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = z;
        this.A04 = collection;
        this.A05 = z2;
    }
}
