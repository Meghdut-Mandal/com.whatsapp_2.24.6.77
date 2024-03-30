package X;

/* renamed from: X.61c  reason: invalid class name and case insensitive filesystem */
public final class C1257461c {
    public final String A00;
    public final boolean A01;

    public C1257461c(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        String str = this.A00;
        boolean z = this.A01;
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str) + 7);
        A0h.append("{");
        A0h.append(str);
        return C36371kC.A0z("}", A0h, z);
    }
}
