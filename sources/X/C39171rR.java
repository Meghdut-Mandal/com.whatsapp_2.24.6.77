package X;

import com.whatsapp.util.Log;

/* renamed from: X.1rR  reason: invalid class name and case insensitive filesystem */
public abstract class C39171rR extends AnonymousClass0DY {
    public C17050qd A06() {
        try {
            return super.A06();
        } catch (SecurityException e) {
            if (e.getMessage().contains("Caller no longer running")) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WaJobIntentService/'Caller no longer running' failure for ");
                AnonymousClass000.A1C(this, A0u);
                Log.e(A0u.toString(), e);
                return null;
            }
            throw e;
        }
    }
}
