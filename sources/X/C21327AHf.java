package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AHf  reason: case insensitive filesystem */
public final class C21327AHf implements C159667jj {
    public final AnonymousClass16D A00;
    public final AnonymousClass1FF A01;
    public final AnonymousClass1EU A02;
    public final AnonymousClass6PS A03;
    public final C29131Vl A04;

    public Class B7I() {
        return AnonymousClass91M.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        Object obj2;
        Object obj3;
        Boolean bool;
        C207249un r5;
        Object obj4;
        Object obj5;
        Number number;
        Object obj6;
        long A09;
        AnonymousClass16U r0;
        Object obj7;
        String str;
        Object obj8;
        String str2;
        Object obj9;
        String str3;
        Object obj10;
        String obj11;
        AnonymousClass91M r8 = (AnonymousClass91M) enumR;
        AnonymousClass00C.A0D(r8, 1);
        switch (r8.ordinal()) {
            case 0:
                if (map != null) {
                    obj2 = map.get("scenario");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                if (map != null) {
                    obj3 = map.get("is_debit");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof Boolean) {
                    bool = (Boolean) obj3;
                } else {
                    bool = null;
                }
                if (obj2 == null || bool == null) {
                    return null;
                }
                boolean equals = "P2P".equals(obj2);
                if (equals && bool.booleanValue()) {
                    return C165617ti.A0O(this.A02).A06();
                }
                if (!equals || bool.booleanValue()) {
                    boolean equals2 = "P2M".equals(obj2);
                    if (equals2 && bool.booleanValue()) {
                        Iterator it = C165577te.A0o(this.A02).iterator();
                        while (it.hasNext()) {
                            C207249un A0S = C165607th.A0S(it);
                            if (A0S.A03 == 2) {
                                return A0S;
                            }
                        }
                        return null;
                    } else if (!equals2 || bool.booleanValue()) {
                        return null;
                    } else {
                        AnonymousClass16S A0O = C165617ti.A0O(this.A02);
                        synchronized (A0O) {
                            Iterator it2 = A0O.A0A().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    r5 = C165607th.A0S(it2);
                                    if (r5.A02 == 2) {
                                    }
                                } else {
                                    r5 = null;
                                }
                            }
                        }
                        return r5;
                    }
                } else {
                    Iterator it3 = C165577te.A0o(this.A02).iterator();
                    while (it3.hasNext()) {
                        C207249un A0S2 = C165607th.A0S(it3);
                        if (A0S2.A00 == 2) {
                            return A0S2;
                        }
                    }
                    return null;
                }
            case 1:
                if (map != null) {
                    obj9 = map.get("credential_id");
                } else {
                    obj9 = null;
                }
                if (!(obj9 instanceof String) || (str3 = (String) obj9) == null) {
                    return null;
                }
                return AnonymousClass16S.A01(str3, C165577te.A0o(this.A02));
            case 2:
                return C165577te.A0o(this.A02);
            case 3:
                C222813r r2 = UserJid.Companion;
                if (map != null) {
                    obj8 = map.get("jid");
                } else {
                    obj8 = null;
                }
                if (obj8 instanceof String) {
                    str2 = (String) obj8;
                } else {
                    str2 = null;
                }
                UserJid A022 = r2.A02(str2);
                if (A022 != null) {
                    return this.A00.A0D(A022);
                }
                return null;
            case 4:
                if (map != null) {
                    obj7 = map.get("message_id");
                } else {
                    obj7 = null;
                }
                if (!(obj7 instanceof String) || (str = (String) obj7) == null) {
                    return null;
                }
                return this.A01.A01(str);
            case 5:
                return new AnonymousClass6JQ(this.A04.A01());
            case 6:
                if (map != null) {
                    obj10 = map.get("code");
                } else {
                    obj10 = null;
                }
                if (!(obj10 instanceof Integer) || obj10 == null || (obj11 = obj10.toString()) == null) {
                    return null;
                }
                AnonymousClass6PS r1 = this.A03;
                if (AnonymousClass6PS.A00(r1)) {
                    return r1.A00.get(obj11);
                }
                return null;
            case 7:
                if (map != null) {
                    obj4 = map.get("currency_code");
                } else {
                    obj4 = null;
                }
                if (!(obj4 instanceof String)) {
                    obj4 = null;
                }
                if (map != null) {
                    obj5 = map.get("offset");
                } else {
                    obj5 = null;
                }
                if (!(obj5 instanceof Integer) || (number = (Number) obj5) == null) {
                    return null;
                }
                int intValue = number.intValue();
                if (map != null) {
                    obj6 = map.get("value");
                } else {
                    obj6 = null;
                }
                if (obj6 instanceof Integer) {
                    A09 = (long) AnonymousClass000.A0I(obj6);
                } else if (!(obj6 instanceof Long)) {
                    return null;
                } else {
                    A09 = C36431kI.A09(obj6);
                }
                C199449fK r12 = new C199449fK();
                r12.A01 = A09;
                r12.A00 = intValue;
                if (AnonymousClass00C.A0J(obj4, "INR")) {
                    r0 = AnonymousClass16W.A05;
                } else if (!AnonymousClass00C.A0J(obj4, "BRL")) {
                    return null;
                } else {
                    r0 = AnonymousClass16W.A04;
                }
                r12.A02 = r0;
                return r12.A01();
            case 8:
                AnonymousClass1EY A023 = this.A02.A02("p2p_context");
                AnonymousClass00C.A08(A023);
                return A023;
            default:
                throw C36441kJ.A18();
        }
    }

    public C21327AHf(AnonymousClass16D r1, AnonymousClass1FF r2, AnonymousClass1EU r3, AnonymousClass6PS r4, C29131Vl r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
