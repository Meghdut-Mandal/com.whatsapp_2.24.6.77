package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.4b0  reason: invalid class name and case insensitive filesystem */
public final class C90864b0 extends BroadcastReceiver {
    public final /* synthetic */ C142706pJ A00;

    public void onReceive(Context context, Intent intent) {
        String A0l;
        AnonymousClass00C.A0D(intent, 1);
        C142706pJ r2 = this.A00;
        if (!C19550w8.A02()) {
            A0l = "BackgroundRestrictionManager; received event on unsupported OS version.";
        } else if (!"android.net.conn.RESTRICT_BACKGROUND_CHANGED".equals(intent.getAction())) {
            A0l = AnonymousClass000.A0l(intent, "BackgroundRestrictionManager; received unsupported intent: ", AnonymousClass000.A0u());
        } else {
            for (C144366s4 r3 : (Iterable) C36411kG.A0v(r2.A00)) {
                if (r3.A01.A04()) {
                    r3.A02.execute(new C1497172m(r3, 42));
                }
            }
            return;
        }
        Log.w(A0l);
    }

    public C90864b0(C142706pJ r1) {
        this.A00 = r1;
    }
}
