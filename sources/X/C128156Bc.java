package X;

/* renamed from: X.6Bc  reason: invalid class name and case insensitive filesystem */
public class C128156Bc {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C128156Bc r5 = (C128156Bc) obj;
            if (!this.A02.equals(r5.A02) || !C1901797e.A00(this.A01, r5.A01) || !C1901797e.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public C128156Bc(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A02;
        A1Q[1] = this.A01;
        return C90484aE.A0D(this.A00, A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Bullet{text='");
        char A002 = C90484aE.A00(this.A02, A0u);
        A0u.append(", iconLightUrl='");
        A0u.append(this.A01);
        A0u.append(A002);
        A0u.append(", iconDarkUrl='");
        A0u.append(this.A00);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
