package X;

import java.io.Serializable;

/* renamed from: X.0AK  reason: invalid class name */
public final class AnonymousClass0AK implements Serializable {
    public final Object value;

    public static final Throwable A00(Object obj) {
        if (obj instanceof AnonymousClass03N) {
            return ((AnonymousClass03N) obj).exception;
        }
        return null;
    }

    public boolean equals(Object obj) {
        Object obj2 = this.value;
        if (!(obj instanceof AnonymousClass0AK) || !AnonymousClass00C.A0J(obj2, ((AnonymousClass0AK) obj).value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.value;
        if (obj instanceof AnonymousClass03N) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ AnonymousClass0AK(Object obj) {
        this.value = obj;
    }
}
