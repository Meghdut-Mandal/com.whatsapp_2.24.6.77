package X;

import android.content.Context;
import com.whatsapp.jid.PhoneUserJid;
import java.util.List;

/* renamed from: X.1hr  reason: invalid class name and case insensitive filesystem */
public final class C34921hr {
    public final AnonymousClass17Y A00;
    public final C19730wQ A01;
    public final AnonymousClass005 A02;

    public C34921hr(AnonymousClass17Y r2, C19730wQ r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public void A00(Context context, C52092os r14) {
        AnonymousClass33N r6;
        C132666Ut r3 = (C132666Ut) this.A02.get();
        AnonymousClass01L r4 = (AnonymousClass01L) C24801Dv.A01(context, AnonymousClass01L.class);
        C19730wQ r0 = this.A01;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        String rawString = phoneUserJid.getRawString();
        AnonymousClass4YV r5 = new AnonymousClass4YV(this, 0);
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass00C.A0D(rawString, 2);
        if (r14 != null) {
            r6 = new AnonymousClass33N();
            String str = r14.description;
            AnonymousClass00C.A0D(str, 1);
            r6.A00.put("deeplink_destination", str);
        } else {
            r6 = null;
        }
        r3.A02(r4, r5, r6, "com.bloks.www.fxcal.settings.async", "wa_settings", "debug", rawString, (List) null);
    }
}
