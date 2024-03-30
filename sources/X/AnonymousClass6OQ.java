package X;

import org.json.JSONObject;

/* renamed from: X.6OQ  reason: invalid class name */
public class AnonymousClass6OQ {
    public final long A00;
    public final AnonymousClass6P0 A01;
    public final C135086c7 A02;
    public final C135086c7 A03;
    public final C135086c7 A04;
    public final C135086c7 A05;
    public final C135086c7 A06;
    public final Long A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6OQ) {
                AnonymousClass6OQ r6 = (AnonymousClass6OQ) obj;
                Object obj2 = this.A04.A00;
                C18740tg.A06(obj2);
                Object obj3 = r6.A04.A00;
                C18740tg.A06(obj3);
                if (C1901797e.A00(obj2, obj3)) {
                    Object obj4 = this.A05.A00;
                    C18740tg.A06(obj4);
                    Object obj5 = r6.A05.A00;
                    C18740tg.A06(obj5);
                    if (C1901797e.A00(obj4, obj5)) {
                        Object obj6 = this.A02.A00;
                        C18740tg.A06(obj6);
                        Object obj7 = r6.A02.A00;
                        C18740tg.A06(obj7);
                        if (!C1901797e.A00(obj6, obj7) || !C1901797e.A00(Long.valueOf(this.A00), Long.valueOf(r6.A00)) || !C1901797e.A00(this.A07, r6.A07) || !C1901797e.A00(this.A01, r6.A01) || !C1901797e.A00(this.A03, r6.A03) || !C1901797e.A00(this.A06, r6.A06)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static String A00(AnonymousClass6OQ r0) {
        Object obj = r0.A05.A00;
        C18740tg.A06(obj);
        AnonymousClass00C.A08(obj);
        return (String) obj;
    }

    public static void A01(AnonymousClass6OQ r10, C160057kO r11, Object obj, JSONObject jSONObject) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = r10.A05.A00;
        C18740tg.A06(obj2);
        String string = new JSONObject(jSONObject.getString("data")).getString("access_token");
        long j = r10.A00;
        Long l = r10.A07;
        String str = r10.A08;
        r11.Bi5(new AnonymousClass6OQ(r10.A01, l, (String) obj2, string, str, longValue, j));
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        Object obj = this.A04.A00;
        C18740tg.A06(obj);
        objArr[0] = obj;
        Object obj2 = this.A05.A00;
        C18740tg.A06(obj2);
        objArr[1] = obj2;
        objArr[2] = this.A02;
        objArr[3] = Long.valueOf(this.A00);
        objArr[4] = this.A07;
        objArr[5] = this.A01;
        objArr[6] = this.A03;
        return AnonymousClass000.A0M(this.A06, objArr, 7);
    }

    public AnonymousClass6OQ(C134886bl r6, C134886bl r7, AnonymousClass6P0 r8, Long l, String str, String str2, String str3, long j, long j2) {
        Class<Long> cls = Long.class;
        this.A04 = new C135086c7(C146356vT.A00(), cls, Long.valueOf(j), "WaFbid");
        this.A05 = new C135086c7(C146356vT.A00(), String.class, str, "WaFbPassword");
        this.A02 = new C135086c7(C146356vT.A00(), cls, str2, "WaFbAccessToken");
        this.A00 = j2;
        this.A07 = l;
        this.A01 = r8;
        this.A08 = str3;
        C135086c7 r3 = null;
        if (r6 != null) {
            this.A03 = new C135086c7(C146356vT.A00(), C134886bl.class, r6, "WaFbCurrentUserSessionCookie");
        } else {
            this.A03 = null;
        }
        this.A06 = r7 != null ? new C135086c7(C146356vT.A00(), C134886bl.class, r7, "WaFbCurrentUserSessionCookie") : r3;
    }

    public AnonymousClass6OQ(AnonymousClass6P0 r6, Long l, String str, String str2, String str3, long j, long j2) {
        Class<Long> cls = Long.class;
        this.A04 = new C135086c7(C146356vT.A00(), cls, Long.valueOf(j), "WaFbid");
        this.A05 = new C135086c7(C146356vT.A00(), String.class, str, "WaFbPassword");
        this.A02 = new C135086c7(C146356vT.A00(), cls, str2, "WaFbAccessToken");
        this.A00 = j2;
        this.A07 = l;
        this.A01 = r6;
        this.A08 = str3;
        this.A03 = null;
        this.A06 = null;
    }
}
