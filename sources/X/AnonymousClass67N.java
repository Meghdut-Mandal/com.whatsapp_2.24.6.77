package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.67N  reason: invalid class name */
public final class AnonymousClass67N {
    public final AnonymousClass1EP A00;
    public final AnonymousClass1A1 A01;
    public final AnonymousClass185 A02;
    public final AnonymousClass004 A03;

    public final int A00(AnonymousClass11F r4, String str, boolean z) {
        AnonymousClass3L0 A012;
        if (z || !(r4 instanceof UserJid)) {
            C222913s r0 = PhoneUserJid.Companion;
            PhoneUserJid A002 = C222913s.A00(str);
            AnonymousClass185 r1 = this.A02;
            A012 = r1.A01(A002);
            if (A012 == null) {
                ((AnonymousClass65C) this.A03.get()).A00(A002).get();
                A012 = r1.A01(A002);
            }
        } else {
            A012 = this.A02.A01((UserJid) r4);
        }
        return C110465ai.A00(A012);
    }

    public AnonymousClass67N(AnonymousClass185 r1, AnonymousClass1EP r2, AnonymousClass1A1 r3, AnonymousClass004 r4) {
        C36321k7.A18(r1, r4, r2, r3);
        this.A02 = r1;
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final String A01(C64933Qa r4, Integer num) {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("cta", "catalog_message");
        String str = r4.A01;
        AnonymousClass00C.A07(str);
        String A0b = C90464aC.A0b(str);
        AnonymousClass00C.A08(A0b);
        A1B.put("catalog_message_id", A0b);
        Object obj = num;
        if (num == null) {
            obj = JSONObject.NULL;
        }
        A1B.put("is_template", obj);
        return C36381kD.A0y(A1B);
    }
}
