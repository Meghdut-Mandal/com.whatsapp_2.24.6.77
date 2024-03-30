package X;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.0v3  reason: invalid class name and case insensitive filesystem */
public final class C19440v3 {
    public static C19440v3 A04;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public String A02 = null;
    public final Queue A03 = new ArrayDeque();

    public static synchronized C19440v3 A00() {
        C19440v3 r0;
        synchronized (C19440v3.class) {
            r0 = A04;
            if (r0 == null) {
                r0 = new C19440v3();
                A04 = r0;
            }
        }
        return r0;
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            boolean z = false;
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            this.A00 = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.A00.booleanValue();
    }
}
