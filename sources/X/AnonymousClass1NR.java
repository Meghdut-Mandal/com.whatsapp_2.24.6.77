package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.1NR  reason: invalid class name */
public final class AnonymousClass1NR {
    public final C19890wg A00;

    public AnonymousClass1NR(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final String A00(AnonymousClass9HQ r3) {
        String str;
        JSONObject putOpt = new JSONObject().putOpt("key_brand_id", r3.A01);
        UserJid userJid = r3.A00;
        if (userJid != null) {
            str = userJid.getRawString();
        } else {
            str = null;
        }
        String obj = putOpt.putOpt("key_jid", str).toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }
}
