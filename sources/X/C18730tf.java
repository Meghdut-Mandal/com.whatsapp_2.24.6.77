package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.lang.Thread;

/* renamed from: X.0tf  reason: invalid class name and case insensitive filesystem */
public class C18730tf implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler A00 = Thread.getDefaultUncaughtExceptionHandler();
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C18690tZ A02;

    public C18730tf(Context context, C18690tZ r3) {
        this.A02 = r3;
        this.A01 = context;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String A002 = C21410zC.A00(this.A01, th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00;
        try {
            Log.e("UNCAUGHT EXCEPTION", th);
            C21350z4 r3 = C21410zC.A00;
            if (r3 != null) {
                Throwable th2 = th;
                while (true) {
                    if (!(th2 instanceof OutOfMemoryError)) {
                        th2 = th2.getCause();
                        if (th2 == null) {
                            break;
                        }
                    } else {
                        C20810yC r1 = r3.A05;
                        C21400zB r2 = r3.A0C;
                        r1.A07(1360);
                        StringBuilder sb = new StringBuilder();
                        sb.append("OOM/WhatsAppWorkers state: ");
                        sb.append(C19780wV.A05.toString());
                        Log.i(sb.toString());
                        if (r2 != null) {
                            r2.A00();
                        }
                        Log.i("OOMHandler/hprof dump not allowed");
                    }
                }
                C21370z6 r22 = r3.A04;
                C21380z9 r12 = r3.A07;
                String A003 = C21380z9.A00(r12, r12.A00);
                SharedPreferences.Editor edit = ((SharedPreferences) r22.A01.getValue()).edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("running_tasks_");
                sb2.append(A002);
                edit.putString(sb2.toString(), A003).commit();
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            Log.flush();
            uncaughtExceptionHandler.uncaughtException(thread, th);
            throw th3;
        }
        Log.flush();
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
