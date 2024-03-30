package X;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: X.9Ov  reason: invalid class name and case insensitive filesystem */
public final class C194259Ov {
    public final String[] A00() {
        String str;
        ArrayList A0I = AnonymousClass001.A0I();
        int i = Build.VERSION.SDK_INT;
        if (29 <= i) {
            if (i < 31) {
                str = "android.permission.BLUETOOTH";
            } else if (i < 10001) {
                str = "android.permission.BLUETOOTH_CONNECT";
            }
            A0I.add(str);
            if (i == 34 && AnonymousClass9AL.A00 != 4) {
                A0I.add("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE");
            }
            return C36371kC.A1b(A0I, 0);
        }
        C200159gk r3 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Build version ");
        A0u.append(i);
        r3.A04("sup:PermissionsProvider", AnonymousClass000.A0q(" not supported!", A0u), (Throwable) null);
        A0I.add("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE");
        return C36371kC.A1b(A0I, 0);
    }
}
