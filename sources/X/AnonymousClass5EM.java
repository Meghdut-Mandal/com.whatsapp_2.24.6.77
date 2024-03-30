package X;

/* renamed from: X.5EM  reason: invalid class name */
public class AnonymousClass5EM extends AnonymousClass5EQ {
    public final int A00;

    public AnonymousClass5EM(int i) {
        super(1);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.A00 == ((AnonymousClass5EM) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass5EM() {
        this(0);
    }
}
