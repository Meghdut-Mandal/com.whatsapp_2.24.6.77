package X;

/* renamed from: X.5E2  reason: invalid class name */
public class AnonymousClass5E2 extends AnonymousClass5EQ {
    public final int A00;
    public final C33541fX A01;
    public final String A02;
    public final String A03;

    public AnonymousClass5E2(C33541fX r5, String str, String str2) {
        super(6);
        Integer[] A002 = C023109s.A00(31);
        int length = A002.length;
        int i = 0;
        while (i < length && !C129406Gu.A00(A002[i]).equals(str)) {
            i++;
        }
        this.A00 = C110175aF.A00(str);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A03.equals(((AnonymousClass5E2) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }
}
