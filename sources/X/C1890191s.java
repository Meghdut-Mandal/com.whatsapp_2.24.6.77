package X;

/* renamed from: X.91s  reason: invalid class name and case insensitive filesystem */
public class C1890191s extends Exception {
    public Throwable _underlyingException;

    public C1890191s(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    public Throwable getCause() {
        return this._underlyingException;
    }

    public static C1890191s A00(String str, Throwable th) {
        return new C1890191s(str, th);
    }
}
