package X;

/* renamed from: X.5VA  reason: invalid class name */
public class AnonymousClass5VA extends Exception {
    public final Exception innerException;

    public String toString() {
        return this.innerException.toString();
    }

    public AnonymousClass5VA(Exception exc) {
        this.innerException = exc;
    }
}
