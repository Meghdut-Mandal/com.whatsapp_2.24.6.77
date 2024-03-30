package X;

import java.util.Objects;

/* renamed from: X.0uK  reason: invalid class name and case insensitive filesystem */
public final class C19070uK extends C19060uJ {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C19060uJ)) {
                return false;
            }
            C19070uK r4 = (C19070uK) ((C19060uJ) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.A00);
        sb.append(", version=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C19070uK(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.A00 = str;
        Objects.requireNonNull(str2, "Null version");
        this.A01 = str2;
    }
}
