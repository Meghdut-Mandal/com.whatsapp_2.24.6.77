package X;

/* renamed from: X.0My  reason: invalid class name and case insensitive filesystem */
public final class C05030My extends C10930fS {
    public final String A00;

    public C05030My(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        C10930fS r5 = (C10930fS) obj;
        int A02 = r5.A02();
        if (3 != A02) {
            length = 3;
        } else {
            String str = this.A00;
            length = str.length();
            String str2 = ((C05030My) r5).A00;
            A02 = str2.length();
            if (length == A02) {
                return str.compareTo(str2);
            }
        }
        return length - A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C05030My) obj).A00);
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("\"");
        return AnonymousClass000.A0p(str, "\"", A0u);
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, 3);
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public final int A02() {
        return 3;
    }
}
