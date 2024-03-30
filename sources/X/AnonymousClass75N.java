package X;

import android.os.Process;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* renamed from: X.75N  reason: invalid class name */
public class AnonymousClass75N implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("************ LOCATION OF ERROR ************\n\n");
        A0u.append("NPCI Common Library");
        A0u.append("\n");
        Log.e("Exception!!!", AnonymousClass000.A0p(C90494aF.A0c(stringWriter, "\n************ CAUSE OF ERROR ************\n\n", A0u), "\n", A0u));
        Process.killProcess(Process.myPid());
    }
}
