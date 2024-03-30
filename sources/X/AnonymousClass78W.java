package X;

/* renamed from: X.78W  reason: invalid class name */
public class AnonymousClass78W extends RuntimeException {
    public final String lispyStackTrace;
    public final String minsStackTrace;

    public AnonymousClass78W(String str, String str2, Throwable th) {
        super(th.getMessage(), th);
        this.lispyStackTrace = str;
        this.minsStackTrace = str2;
    }

    public AnonymousClass78W(String str) {
        super(str);
        this.lispyStackTrace = null;
        this.minsStackTrace = null;
    }

    public AnonymousClass78W(Throwable th) {
        super(th);
        this.lispyStackTrace = null;
        this.minsStackTrace = null;
    }
}
