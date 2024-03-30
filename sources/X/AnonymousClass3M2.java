package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.3M2  reason: invalid class name */
public abstract class AnonymousClass3M2 {
    public static boolean A01(Context context, Intent intent) {
        if (!intent.hasExtra("authentication_token")) {
            return false;
        }
        try {
            Intent A0D = C36431kI.A0D();
            C36421kH.A0o(A0D, context.getPackageName(), "FakeClass");
            return C65743Th.A00(context.getApplicationContext(), 0, A0D, 0).equals((PendingIntent) intent.getParcelableExtra("authentication_token"));
        } catch (Exception e) {
            Log.e("conversation/unable to verify intent", e);
            return false;
        }
    }

    public static void A00(Context context, Intent intent) {
        intent.setPackage(context.getPackageName());
        Intent A0D = C36431kI.A0D();
        C36421kH.A0o(A0D, context.getPackageName(), "FakeClass");
        intent.putExtra("authentication_token", C65743Th.A00(context.getApplicationContext(), 0, A0D, 0));
    }
}
