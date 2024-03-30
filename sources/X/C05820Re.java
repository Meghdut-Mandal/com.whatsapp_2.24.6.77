package X;

/* renamed from: X.0Re  reason: invalid class name and case insensitive filesystem */
public abstract class C05820Re {
    public static final StackTraceElement A00;

    static {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("_COROUTINE");
        A0u.append('.');
        A00 = new StackTraceElement(AnonymousClass000.A0q("_BOUNDARY", A0u), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Class.forName("X.09z").getCanonicalName();
        } catch (Throwable th) {
            new AnonymousClass03N(th);
        }
        try {
            Class.forName("X.0Re").getCanonicalName();
        } catch (Throwable th2) {
            new AnonymousClass03N(th2);
        }
    }
}
