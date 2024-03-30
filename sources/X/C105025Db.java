package X;

import java.util.List;

/* renamed from: X.5Db  reason: invalid class name and case insensitive filesystem */
public abstract class C105025Db extends C46422Xj {
    public final AnonymousClass7h8 A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C105025Db r5 = (C105025Db) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C105025Db(AnonymousClass7h8 r1, AnonymousClass4RC r2, List list, int i) {
        super(r2, i);
        this.A01 = list;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        return AnonymousClass000.A0L(this.A01, A0M);
    }
}
