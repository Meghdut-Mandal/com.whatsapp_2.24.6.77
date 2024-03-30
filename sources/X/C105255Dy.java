package X;

/* renamed from: X.5Dy  reason: invalid class name and case insensitive filesystem */
public class C105255Dy extends AnonymousClass5EQ {
    public final C33541fX A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.A01;
        String str2 = ((C105255Dy) obj).A01;
        if (str == null) {
            return str2 == null;
        }
        if (str.equals(str2)) {
            return true;
        }
    }

    public C105255Dy(C33541fX r2, String str) {
        super(26);
        this.A00 = r2;
        this.A01 = str;
    }
}
