package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.96p  reason: invalid class name and case insensitive filesystem */
public abstract class C1900296p {
    public static void A00(Bundle bundle, Jid jid, String str) {
        if (!bundle.containsKey(str)) {
            bundle.putString(str, AnonymousClass143.A03(jid));
            return;
        }
        throw AnonymousClass000.A0c(" already used", AnonymousClass000.A0v(str));
    }
}
