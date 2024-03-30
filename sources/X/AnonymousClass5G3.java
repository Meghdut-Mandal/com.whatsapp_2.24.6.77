package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;

/* renamed from: X.5G3  reason: invalid class name */
public final class AnonymousClass5G3 extends AnonymousClass6F2 {
    public long A00;
    public String A01;
    public boolean A02 = true;
    public boolean A03;
    public final AnonymousClass60Y A04;
    public final AnonymousClass17Y A05;
    public final C19630wG A06;
    public final AnonymousClass6TL A07;
    public final C1256960x A08;
    public final AnonymousClass1KT A09;
    public final C117235lv A0A;
    public final C20810yC A0B;
    public final C19770wU A0C;
    public final AnonymousClass6TM A0D;
    public final AnonymousClass67S A0E;
    public final List A0F = AnonymousClass001.A0I();
    public final List A0G = AnonymousClass001.A0I();
    public final Set A0H;
    public final C19600wD A0I;
    public final AnonymousClass6OE A0J;
    public final AnonymousClass1KZ A0K;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5G3(X.AnonymousClass60Y r7, X.AnonymousClass17Y r8, X.C19600wD r9, X.AnonymousClass6OE r10, X.C19630wG r11, X.AnonymousClass1KZ r12, X.AnonymousClass6TL r13, X.C1256960x r14, X.AnonymousClass1KT r15, X.C117235lv r16, X.C20810yC r17, X.C105705Fs r18, X.C19770wU r19, X.AnonymousClass6TM r20, X.AnonymousClass67S r21, java.util.Set r22) {
        /*
            r6 = this;
            r1 = 1
            r4 = r17
            X.AnonymousClass00C.A0D(r4, r1)
            X.C36321k7.A12(r8, r11, r9)
            r3 = r18
            X.C36321k7.A10(r7, r3)
            r2 = r19
            X.C36391kE.A1U(r13, r2)
            r0 = 12
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 15
            r5 = r22
            X.AnonymousClass00C.A0D(r5, r0)
            r6.<init>(r3)
            r6.A0B = r4
            r6.A05 = r8
            r6.A06 = r11
            r6.A0I = r9
            r0 = r21
            r6.A0E = r0
            r6.A04 = r7
            r6.A0J = r10
            r6.A07 = r13
            r6.A0C = r2
            r6.A09 = r15
            r6.A0K = r12
            r6.A08 = r14
            r0 = r16
            r6.A0A = r0
            r6.A0H = r5
            r0 = r20
            r6.A0D = r0
            r6.A02 = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r6.A0G = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r6.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5G3.<init>(X.60Y, X.17Y, X.0wD, X.6OE, X.0wG, X.1KZ, X.6TL, X.60x, X.1KT, X.5lv, X.0yC, X.5Fs, X.0wU, X.6TM, X.67S, java.util.Set):void");
    }

    public static final void A02(C159627jf r5, AnonymousClass5G3 r6, String str, String str2, Map map, Map map2, boolean z) {
        Object obj;
        Map map3;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        Map map4;
        C19630wG r1 = r6.A06;
        String A0v = C36371kC.A0v(r1, R.string.f12nameremoved);
        if (!r6.A0I.A09()) {
            A0v = C36371kC.A0v(r1, R.string.f12nameremoved);
            str = "extensions-data-exchange-no-network";
        }
        String str5 = null;
        if (z || !((str3 = r6.A01) == null || str3.length() == 0)) {
            Object obj4 = map.get("data");
            if (!(obj4 instanceof Map) || (map3 = (Map) obj4) == null) {
                obj = null;
            } else {
                obj = map3.get("error_message");
            }
            if ((obj instanceof String) && obj != null) {
                str = "extensions-error-from-layout";
            }
            r6.A05.Bp3(new AnonymousClass737(r5, r6, map, 26));
        } else {
            C52122ov r12 = C52122ov.A02;
            if (!(map.get(r12.key) instanceof C128176Bf)) {
                String str6 = r12.key;
                Object obj5 = map.get(C108355Te.ERROR.key);
                if (!(obj5 instanceof Map) || (map4 = (Map) obj5) == null) {
                    obj3 = null;
                } else {
                    obj3 = map4.get(C108355Te.ERROR_MESSAGE.key);
                }
                if ((obj3 instanceof String) && (str4 = (String) obj3) != null) {
                    A0v = str4;
                }
                map = C36391kE.A11(str6, C128176Bf.A00(A0v));
            }
            C1498172w.A00(r6.A05, r5, map, 26);
        }
        if (map2 != null) {
            obj2 = map2.get("extension_id");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str5 = (String) obj2) != null) {
            AnonymousClass1KT r52 = r6.A09;
            int hashCode = str5.hashCode();
            List list = r6.A0G;
            List list2 = r6.A0F;
            C36321k7.A0x(list, list2);
            if (C36401kF.A1a(list)) {
                r52.A0A(list, hashCode, "bypassed_error_types");
            }
            if (C36401kF.A1a(list2)) {
                r52.A0A(list2, hashCode, "bypassed_error_messages");
            }
            r52.A02(hashCode, "forward_network_request_count", r6.A00);
        }
        if (str != null) {
            if (str5 != null) {
                AnonymousClass1KT r2 = r6.A09;
                int hashCode2 = str5.hashCode();
                r2.A0B(hashCode2, str, str2);
                r2.A0C(hashCode2, 3);
            }
            r6.A0D.A03(str, str2, map2);
        }
    }

    public static final void A00(C128786Dp r33, C159627jf r34, AnonymousClass5G3 r35, Map map) {
        int i;
        String str;
        Number number;
        SecretKey A0l = C90494aF.A0l();
        byte[] bArr = new byte[16];
        C90504aG.A1Q(bArr);
        AnonymousClass00C.A0B(A0l);
        AnonymousClass00C.A0D(A0l, 1);
        C128786Dp r8 = r33;
        Map map2 = r8.A05;
        Object obj = map2.get("extension_id");
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        String A0Z = C90464aC.A0Z("message_id", map2);
        String A0Z2 = C90464aC.A0Z("session_id", map2);
        String A0Z3 = C90464aC.A0Z("business_jid", map2);
        Object obj2 = map2.get("flow_json_version");
        if (!(obj2 instanceof Integer) || (number = (Number) obj2) == null) {
            i = 0;
        } else {
            i = number.intValue();
        }
        int hashCode = str2.hashCode();
        String A0Z4 = C90464aC.A0Z("extension_status", map2);
        AnonymousClass5G3 r5 = r35;
        AnonymousClass1KT r4 = r5.A09;
        r4.A09(A0Z4, hashCode);
        Map map3 = map;
        C159627jf r21 = r34;
        C146016ut r19 = new C146016ut(r8, r21, r5, A0Z, A0Z2, C90464aC.A0Z("current_screen", map3), str2, A0Z3, map2, map3, A0l, bArr, hashCode, i);
        Object obj3 = map3.get("action_payload");
        AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Object obj4 = ((Map) obj3).get("business_payload");
        AnonymousClass00C.A0E(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map map4 = (Map) obj4;
        Object obj5 = map4.get("screen");
        if (!(obj5 instanceof String) || (str = (String) obj5) == null) {
            str = "UNKNOWN";
        }
        r4.A03(hashCode, "source_screen_id", str);
        String A0m = C90484aE.A0m("flow_message_version", map2);
        String A0m2 = C90484aE.A0m("extension_id", map2);
        String A0m3 = C90484aE.A0m("business_jid", map2);
        Object A0n = C90514aH.A0n("user_locale", "null cannot be cast to non-null type kotlin.String", map2);
        Object A0n2 = C90514aH.A0n("flow_token", "null cannot be cast to non-null type kotlin.String", map2);
        String A0c = C90474aD.A0c("version", map2);
        C145346tk A002 = r5.A04.A00(r19, A0m, A0m2, new C155107Uu(r21, r5, map2));
        C222813r r0 = UserJid.Companion;
        UserJid A012 = C222813r.A01(A0m3);
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.putAll(map4);
        if (!r5.A0B.A0E(5374) || "100".equalsIgnoreCase(A0c)) {
            A1G.put("user_locale", A0n);
        }
        A1G.put("flow_token", A0n2);
        A1G.put("version", C110835bJ.A00(A0c));
        if (!"100".equalsIgnoreCase(A0c)) {
            byte[] bArr2 = new byte[16];
            int i2 = 0;
            do {
                bArr2[i2] = (byte) (~bArr[i2]);
                i2++;
            } while (i2 < 16);
            bArr = bArr2;
        }
        r5.A01 = C90474aD.A0c("screen", map4);
        AnonymousClass67S r2 = r5.A0E;
        AnonymousClass67S r18 = r2;
        r18.A01(A002, A012, C90474aD.A0k(A1G), A0m, A0m2, A0l, bArr, r5.A03, true, !r5.A02);
    }

    public static final void A01(C159627jf r7, AnonymousClass5G3 r8, String str, String str2, Map map, Map map2) {
        Object obj;
        String str3;
        LinkedHashMap A062 = C000400e.A06(map);
        Object obj2 = A062.get("action_payload");
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        LinkedHashMap A063 = C000400e.A06((Map) obj2);
        Object obj3 = A063.get("business_payload");
        AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        LinkedHashMap A064 = C000400e.A06((Map) obj3);
        AnonymousClass011[] r1 = new AnonymousClass011[2];
        C90464aC.A1E("error", str, r1);
        C90464aC.A1F("error_message", str2, r1);
        A064.put("data", C000400e.A07(r1));
        A063.put("business_payload", A064);
        A062.put("action_payload", A063);
        Iterator it = r8.A0H.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C1267265f r2 = (C1267265f) obj;
            if (r2 instanceof AnonymousClass5OL) {
                str3 = "navigate";
            } else if (r2 instanceof AnonymousClass5OK) {
                str3 = "error_propagation_action";
            } else if (r2 instanceof AnonymousClass5OI) {
                str3 = "data_exchange_DUMMY";
            } else {
                str3 = "complete";
            }
            if (AnonymousClass00C.A0J(str3, "error_propagation_action")) {
                break;
            }
        }
        C1267265f r3 = (C1267265f) obj;
        if (r3 != null) {
            r3.A00(new AnonymousClass718(r7, r8, map2), AnonymousClass6TM.A01(A062, map2));
        }
    }
}
