package X;

import android.os.Handler;

/* renamed from: X.93s  reason: invalid class name and case insensitive filesystem */
public abstract class C1894193s {
    public static final Handler A00(B3B b3b) {
        String str;
        Handler handler = (Handler) b3b.BA0(B4H.A0D);
        if (handler != null) {
            return handler;
        }
        C22876AxX B9z = b3b.B9z(C23111B5q.A00);
        AnonymousClass00C.A08(B9z);
        C23111B5q b5q = (C23111B5q) B9z;
        if (C36341k9.A1Z(b3b.BA0(B4H.A0F))) {
            str = "Lite-Urgent-SurfacePipe-Thread";
            AnonymousClass88X.A00().A00(str, -8);
        } else {
            str = "Lite-SurfacePipe-Thread";
        }
        Handler BCG = b5q.BCG(str);
        AnonymousClass00C.A08(BCG);
        return BCG;
    }
}
