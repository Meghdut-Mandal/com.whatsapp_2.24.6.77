package X;

import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* renamed from: X.6IU  reason: invalid class name */
public abstract class AnonymousClass6IU {
    public static final String[] A00 = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    public static boolean A00() {
        String str;
        char c;
        InputStream inputStream;
        String[] strArr = null;
        try {
            Process exec = Runtime.getRuntime().exec("mount");
            if (exec != null) {
                try {
                    inputStream = exec.getInputStream();
                    if (inputStream == null) {
                        exec.destroy();
                    } else {
                        String[] split = new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                        inputStream.close();
                        exec.destroy();
                        strArr = split;
                    }
                } catch (IOException | NoSuchElementException unused) {
                    exec.destroy();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable unused2) {
        }
        if (strArr == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        for (String split2 : strArr) {
            String[] split3 = split2.split(" ");
            int i2 = 23;
            int length = split3.length;
            if (i <= 23) {
                if (length >= 4) {
                    str = split3[1];
                    c = 3;
                }
            } else if (length >= 6) {
                str = split3[2];
                c = 5;
            }
            String str2 = split3[c];
            String[] strArr2 = A00;
            int i3 = 0;
            do {
                if (str.equalsIgnoreCase(strArr2[i3])) {
                    if (i > i2) {
                        str2 = str2.replace("(", "").replace(")", "");
                    }
                    String[] split4 = str2.split(",");
                    int length2 = split4.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            break;
                        } else if (split4[i4].equalsIgnoreCase("rw")) {
                            z = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                i3++;
                i2 = 23;
            } while (i3 < 7);
        }
        return z;
        throw th;
    }
}
