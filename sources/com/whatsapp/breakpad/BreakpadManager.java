package com.whatsapp.breakpad;

import X.AnonymousClass11Y;
import X.C18740tg;
import X.C18750th;
import X.C21870zw;
import android.content.Context;
import android.os.Build;
import java.io.File;

public class BreakpadManager {
    public static File A00;

    public static native boolean setUpBreakpad(String str, String str2, String str3, String str4, int i, String str5);

    public static synchronized void A00(Context context) {
        synchronized (BreakpadManager.class) {
            boolean z = false;
            if (A00 == null) {
                z = true;
            }
            C18740tg.A0D(z, "breakpad/initialized more than once");
            File A002 = AnonymousClass11Y.A00(context);
            Boolean bool = C18750th.A03;
            setUpBreakpad(A002.getAbsolutePath(), context.getPackageCodePath(), new File(context.getFilesDir(), "decompressed/libs.spo").getAbsolutePath(), C21870zw.A00, 1536000, Build.FINGERPRINT);
            A00 = A002;
        }
    }
}
