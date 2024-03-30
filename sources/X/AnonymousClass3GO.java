package X;

import java.util.Map;

/* renamed from: X.3GO  reason: invalid class name */
public final class AnonymousClass3GO {
    public final AnonymousClass173 A00;
    public final Map A01 = AnonymousClass001.A0J();
    public final C20810yC A02;

    public final void A00(int i, String str, String str2) {
        AnonymousClass00C.A0D(str2, 2);
        Map map = this.A01;
        C21700zf r2 = (C21700zf) map.get(str);
        if (r2 == null) {
            C21710zg r1 = new C21710zg(i);
            r1.A04 = true;
            r2 = this.A00.A01(r1, str);
            map.put(str, r2);
        }
        AnonymousClass00C.A0B(r2);
        r2.A0D(str2, -1);
    }

    public final void A01(C64933Qa r6, String str, boolean z) {
        String obj;
        Map map = this.A01;
        C21700zf r3 = (C21700zf) map.get(str);
        if (r3 != null) {
            if (!(!this.A02.A0E(6837) || r6 == null || (obj = Integer.valueOf(r6.hashCode()).toString()) == null)) {
                r3.A0A("hashed_message_key", obj, true);
            }
            short s = 3;
            if (z) {
                s = 2;
            }
            r3.A0C(s);
            map.remove(str);
        }
    }

    public AnonymousClass3GO(AnonymousClass173 r2, C20810yC r3) {
        C36321k7.A0x(r2, r3);
        this.A00 = r2;
        this.A02 = r3;
    }
}
