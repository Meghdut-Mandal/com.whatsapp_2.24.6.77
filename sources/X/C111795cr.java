package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.5cr  reason: invalid class name and case insensitive filesystem */
public abstract class C111795cr {
    public static boolean A01(Context context, Intent intent) {
        try {
            AnonymousClass00F.A08(context, intent);
            return true;
        } catch (IllegalStateException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to start foreground service ");
            Log.w(AnonymousClass000.A0o(intent.getComponent(), A0u), e);
            return false;
        }
    }

    public static void A00(Context context, AnonymousClass6FS r4) {
        r4.A06(10);
        Intent A14 = AnonymousClass190.A14(context, "action_backup");
        A14.putExtra("backup_mode", "user_initiated");
        A01(context, A14);
    }
}
