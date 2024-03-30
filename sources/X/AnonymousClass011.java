package X;

import java.io.Serializable;

/* renamed from: X.011  reason: invalid class name */
public final class AnonymousClass011 implements Serializable {
    public final Object first;
    public final Object second;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass011) {
                AnonymousClass011 r5 = (AnonymousClass011) obj;
                if (!AnonymousClass00C.A0J(this.first, r5.first) || !AnonymousClass00C.A0J(this.second, r5.second)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.first;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass011(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }
}
