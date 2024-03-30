package X;

import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.14l  reason: invalid class name and case insensitive filesystem */
public abstract class C224714l {
    public static void A01() {
        try {
            int i = Log.level;
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                StringBuilder sb = new StringBuilder("\n");
                Thread thread = (Thread) next.getKey();
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                sb.append("name=");
                sb.append(thread.getName());
                sb.append(" state=");
                sb.append(thread.getState());
                sb.append(" tid=");
                sb.append(thread.getId());
                sb.append(10);
                String A00 = C18930u3.A00();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("### begin stack trace ");
                sb2.append(A00);
                sb2.append("\n");
                sb.append(sb2.toString());
                for (StackTraceElement obj : stackTraceElementArr) {
                    sb.append("    at ");
                    sb.append(obj.toString());
                    sb.append(10);
                }
                sb.append("### end stack trace");
                sb.append(10);
                Log.log(3, sb.toString());
            }
        } catch (Throwable th) {
            Log.e("ThreadUtils/logAllStackTraces exception", th);
        }
    }

    public static String A00(Throwable th) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement obj : th.getStackTrace()) {
            sb.append(obj.toString());
            sb.append("\n");
            i++;
            if (i == 15) {
                break;
            }
        }
        return sb.toString();
    }

    public static boolean A02() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
