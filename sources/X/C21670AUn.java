package X;

/* renamed from: X.AUn  reason: case insensitive filesystem */
public abstract class C21670AUn implements Comparable {
    public static final C21670AUn A01 = new C173748Sw();
    public Object A00;

    public Object A01() {
        if (this instanceof C173758Sx) {
            return "$";
        }
        if (this instanceof C173778Sz) {
            return ((C173778Sz) this).A00;
        }
        if (this instanceof C173768Sy) {
            return C201749kK.A00(((C173768Sy) this).A00, "&&", "");
        }
        if (this instanceof AnonymousClass8T0) {
            return Integer.valueOf(((AnonymousClass8T0) this).A00);
        }
        return null;
    }

    public C21670AUn(Object obj) {
        this.A00 = obj;
    }

    /* renamed from: A00 */
    public int compareTo(C21670AUn aUn) {
        return -A01().toString().compareTo(aUn.A01().toString());
    }
}
