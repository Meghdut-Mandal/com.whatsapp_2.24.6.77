package X;

/* renamed from: X.69a  reason: invalid class name and case insensitive filesystem */
public final class C1276269a {
    public final int A00;
    public final String A01;

    public C1276269a(int i, String str) {
        AnonymousClass00C.A0D(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1276269a) {
                C1276269a r5 = (C1276269a) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ARDGetScriptingMetadataEntity(revision=");
        A0u.append(this.A00);
        A0u.append(", cdnUri=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
