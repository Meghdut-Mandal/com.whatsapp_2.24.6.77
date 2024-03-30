package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Lk  reason: invalid class name and case insensitive filesystem */
public class C193429Lk {
    public final Pair A00;
    public final C20070wy A01;
    public final C20070wy A02;
    public final UserJid A03;

    public C193429Lk(Pair pair, UserJid userJid, HashMap hashMap, HashMap hashMap2) {
        this.A03 = userJid;
        this.A00 = pair;
        this.A01 = C20070wy.copyOf((Map) hashMap);
        this.A02 = C20070wy.copyOf((Map) hashMap2);
    }
}
