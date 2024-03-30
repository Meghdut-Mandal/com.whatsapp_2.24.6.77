package X;

import android.os.PowerManager;

/* renamed from: X.5co  reason: invalid class name and case insensitive filesystem */
public abstract class C111765co {
    public static PowerManager.WakeLock A00(PowerManager powerManager, String str, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("com.whatsapp");
        return powerManager.newWakeLock(i, AnonymousClass000.A0p(":", str, A0u));
    }
}
