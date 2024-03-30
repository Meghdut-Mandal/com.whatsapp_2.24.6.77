package X;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6Rl  reason: invalid class name and case insensitive filesystem */
public class C131956Rl {
    public static int A00 = 270;
    public static boolean A01;
    public static Boolean A02;

    public static boolean A00() {
        boolean booleanValue;
        synchronized (C131956Rl.class) {
            Boolean bool = A02;
            if (bool == null) {
                try {
                    Boolean bool2 = (Boolean) Class.forName("com.facebook.endtoend.EndToEnd").getMethod("isRunningEndToEndTest", new Class[0]).invoke((Object) null, new Object[0]);
                    if (bool2 == null || !bool2.booleanValue()) {
                        bool = false;
                    } else {
                        boolean A1W = C90484aE.A1W("/sdcard/e2e/media/fineYoungGentleman.jpg");
                        AnonymousClass6YR.A03(bool2, "OpticE2EConfig", "is e2e test: %s");
                        bool = Boolean.valueOf(A1W);
                        AnonymousClass6YR.A03(bool, "OpticE2EConfig", "static frame file exists: %s");
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException e) {
                    if (!A01) {
                        Log.i("OpticE2EConfig", "Failed to access test", e);
                    }
                    bool = false;
                }
                A02 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public static byte[] A01() {
        try {
            File A0S = C90524aI.A0S("/sdcard/e2e/media/fineYoungGentleman.jpg");
            FileInputStream A0U = C90524aI.A0U(A0S);
            byte[] bArr = new byte[((int) A0S.length())];
            A0U.read(bArr);
            return bArr;
        } catch (IOException e) {
            throw AnonymousClass001.A0B(e);
        }
    }
}
