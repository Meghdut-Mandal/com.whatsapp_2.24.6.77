package X;

/* renamed from: X.0Mv  reason: invalid class name and case insensitive filesystem */
public final class C05000Mv extends C10930fS {
    public final boolean A00;

    public C05000Mv(boolean z) {
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C05000Mv) obj).A00);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C10930fS r5 = (C10930fS) obj;
        int A02 = r5.A02();
        if (7 != A02) {
            return 7 - A02;
        }
        C05000Mv r52 = (C05000Mv) r5;
        int i = 20;
        int i2 = 21;
        if (true != this.A00) {
            i2 = 20;
        }
        if (true == r52.A00) {
            i = 21;
        }
        return i2 - i;
    }

    public final String toString() {
        return Boolean.toString(this.A00);
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, 7);
        return AnonymousClass000.A0L(Boolean.valueOf(this.A00), A0M);
    }

    public final int A02() {
        return 7;
    }
}
