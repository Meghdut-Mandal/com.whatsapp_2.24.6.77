package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Map;

/* renamed from: X.1PE  reason: invalid class name */
public final class AnonymousClass1PE {
    public final AnonymousClass16D A00;
    public final C230416y A01;
    public final AnonymousClass12O A02;
    public final C19770wU A03;

    public AnonymousClass1PE(AnonymousClass16D r2, C230416y r3, AnonymousClass12O r4, C19770wU r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void A00(C223313w r2, PhoneUserJid phoneUserJid) {
        AnonymousClass00C.A0D(r2, 0);
        A01(C000300d.A03(new AnonymousClass011(r2, phoneUserJid)));
    }

    public final void A02(Map map) {
        this.A03.Bp6(new C35761jD(this, map, 17), "PrivacyPhoneNumberHidingHelper/updateLidPhoneMappingAndDisplayName");
    }

    public final void A01(Map map) {
        if (!map.isEmpty()) {
            this.A03.Bp6(new C35761jD(this, map, 16), "PrivacyPhoneNumberHidingHelper/updateLidPhoneMapping");
        }
    }
}
