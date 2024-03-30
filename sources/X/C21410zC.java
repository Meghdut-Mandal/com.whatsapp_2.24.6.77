package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: X.0zC  reason: invalid class name and case insensitive filesystem */
public abstract class C21410zC {
    public static volatile C21350z4 A00;

    public static String A00(Context context, Throwable th) {
        File file;
        FileOutputStream fileOutputStream;
        boolean z;
        String str = C21870zw.A00;
        try {
            if (C18760tj.A02(context)) {
                File filesDir = context.getFilesDir();
                String A01 = C18760tj.A01(context);
                C18740tg.A06(A01);
                StringBuilder sb = new StringBuilder();
                sb.append("crash_sentinel_");
                sb.append(A01);
                file = new File(filesDir, sb.toString());
            } else {
                file = new File(context.getFilesDir(), "crash_sentinel");
            }
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            Throwable th2 = th;
            while (true) {
                if (!(th2 instanceof OutOfMemoryError)) {
                    th2 = th2.getCause();
                    if (th2 == null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            Throwable th3 = th;
            while (th3.getCause() != null) {
                th3 = th3.getCause();
            }
            String obj = th3.toString();
            Objects.requireNonNull("2.24.6.77");
            int i = Log.level;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            C123775x4 r4 = new C123775x4(obj, "2.24.6.77", stringWriter.toString(), str, 581200649, z);
            fileOutputStream.write(new JSONObject().put("isOom", r4.A05).put("deepestThrowable", r4.A01).put("versionName", "2.24.6.77").put("mobileBuildId", 581200649).put("stacktrace", r4.A03).put("sessionId", r4.A02).toString().getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            try {
                Log.e("Unable to create crash sentinel file", e);
            } catch (Throwable th4) {
                if (A00 != null) {
                    A00.A01();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th.addSuppressed(th5);
        }
        if (A00 != null) {
            A00.A01();
        }
        return str;
        throw th;
    }
}
