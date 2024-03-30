package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.0VY  reason: invalid class name */
public abstract class AnonymousClass0VY {
    public static final void A01(Throwable th, Throwable th2) {
        AnonymousClass00C.A0D(th, 0);
        AnonymousClass00C.A0D(th2, 1);
        if (th != th2) {
            AnonymousClass0RS.A00.A00(th, th2);
        }
    }

    public static final String A00(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String obj = stringWriter.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }
}
