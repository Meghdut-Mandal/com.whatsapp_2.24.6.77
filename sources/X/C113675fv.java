package X;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.5fv  reason: invalid class name and case insensitive filesystem */
public abstract class C113675fv {
    public static volatile String A00;
    public static volatile boolean A01;

    public static String A00() {
        String str;
        FileInputStream A0U;
        if (!A01) {
            try {
                str = "robolectric";
                if (!str.equals(Build.FINGERPRINT)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = Application.getProcessName();
                    } else {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            A0U = C90524aI.A0U(C90524aI.A0S("/proc/self/cmdline"));
                            byte[] bArr = new byte[512];
                            int read = A0U.read(bArr);
                            if (read != -1) {
                                str = new String(bArr, 0, read).trim();
                                A0U.close();
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            } else {
                                throw new EOFException();
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                }
            } catch (IOException unused) {
                str = null;
            }
            A00 = str;
            A01 = true;
        }
        return A00;
    }
}
