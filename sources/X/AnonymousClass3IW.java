package X;

/* renamed from: X.3IW  reason: invalid class name */
public class AnonymousClass3IW {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3IW)) {
            return false;
        }
        AnonymousClass3IW r4 = (AnonymousClass3IW) obj;
        return this.A00 == r4.A00 && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return ((this.A01.hashCode() + 31) * 31) + this.A00;
    }

    public AnonymousClass3IW(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FileDownloadToken{reportType=");
        A0u.append(this.A00);
        A0u.append(", fileHash='");
        A0u.append(this.A01);
        A0u.append('\'');
        return AnonymousClass000.A0s(A0u);
    }
}
