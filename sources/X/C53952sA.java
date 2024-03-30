package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.2sA  reason: invalid class name and case insensitive filesystem */
public abstract class C53952sA {
    public static final Intent A00(AnonymousClass3BR r2) {
        Bundle bundle = r2.A04;
        if (bundle != null) {
            return (Intent) bundle.getParcelable("sms_invite_intent", Intent.class);
        }
        return null;
    }
}
