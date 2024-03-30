package X;

/* renamed from: X.72N  reason: invalid class name */
public class AnonymousClass72N implements Cloneable {
    public boolean A00 = true;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass72N) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 ? 1 : 0) * true) - 2032180703;
    }

    public AnonymousClass72N A00() {
        try {
            return (AnonymousClass72N) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
