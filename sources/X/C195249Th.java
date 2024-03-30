package X;

/* renamed from: X.9Th  reason: invalid class name and case insensitive filesystem */
public class C195249Th {
    public final int A00;
    public final CharSequence A01;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj instanceof C195249Th) {
            C195249Th r5 = (C195249Th) obj;
            if (this.A00 == r5.A00) {
                CharSequence charSequence = r5.A01;
                CharSequence charSequence2 = this.A01;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                    return true;
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C195249Th(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }

    public int hashCode() {
        String str;
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        return AnonymousClass000.A0L(str, A0M);
    }
}
