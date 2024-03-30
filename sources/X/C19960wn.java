package X;

import java.util.NoSuchElementException;

/* renamed from: X.0wn  reason: invalid class name and case insensitive filesystem */
public final class C19960wn {
    public static final C19960wn A01 = new C19960wn();
    public final Object A00;

    public Object A00() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19960wn)) {
            return false;
        }
        return C1901797e.A00(this.A00, ((C19960wn) obj).A00);
    }

    public int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.A00;
        if (obj == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{obj});
    }

    public C19960wn(Object obj) {
        C18740tg.A06(obj);
        this.A00 = obj;
    }

    public C19960wn() {
        this.A00 = null;
    }
}
