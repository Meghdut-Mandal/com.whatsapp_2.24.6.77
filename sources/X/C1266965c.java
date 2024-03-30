package X;

import java.io.PrintStream;

/* renamed from: X.65c  reason: invalid class name and case insensitive filesystem */
public abstract class C1266965c {
    public void A01(Integer num, String str, String str2) {
        PrintStream printStream = System.err;
        StringBuilder A0u = AnonymousClass000.A0u();
        C90494aF.A1M(A0u, AnonymousClass5FQ.A00(num));
        A0u.append(str);
        printStream.println(AnonymousClass000.A0p(" : ", str2, A0u));
    }

    public void A02(Integer num, String str, String str2, Throwable th) {
        PrintStream printStream = System.err;
        StringBuilder A0u = AnonymousClass000.A0u();
        C90494aF.A1M(A0u, AnonymousClass5FQ.A00(num));
        A0u.append(str);
        printStream.println(AnonymousClass000.A0p(" : ", str2, A0u));
        if (th != null) {
            th.printStackTrace(printStream);
        }
    }
}
