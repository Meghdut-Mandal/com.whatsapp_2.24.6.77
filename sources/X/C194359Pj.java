package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.9Pj  reason: invalid class name and case insensitive filesystem */
public class C194359Pj {
    public final C000100b A00;

    public String A00(C177538dx r8, UserJid userJid, UserJid userJid2, C80103un r11, byte[] bArr) {
        int i = r11.expiration;
        return (String) JniBridge.jvidispatchOOOOOOO(0, userJid.getRawString(), userJid2.getRawString(), (Object) null, new C192029Fk((NativeHolder) JniBridge.jvidispatchOII((long) i, C36391kE.A0B(r11.ephemeralSettingTimestamp))).A00, bArr, r8.getRawString());
    }

    public C194359Pj(C000100b r1) {
        this.A00 = r1;
    }
}
