package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5OL  reason: invalid class name */
public final class AnonymousClass5OL extends C1267265f {
    public final AnonymousClass6TL A00;
    public final C19630wG A01;
    public final C1256960x A02;
    public final AnonymousClass1KT A03;
    public final C117235lv A04;
    public final C19770wU A05;

    public void A00(C159767jt r29, Map map) {
        Map map2;
        List list;
        String str;
        String str2;
        AbstractMap abstractMap;
        Object obj;
        C159767jt r3 = r29;
        HashMap A0J = AnonymousClass001.A0J();
        Map map3 = map;
        Object obj2 = map3.get("action_payload");
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        LinkedHashMap A06 = C000400e.A06((Map) obj2);
        Object obj3 = A06.get("next");
        AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Object obj4 = ((Map) obj3).get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        Object obj5 = A06.get("next");
        AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        boolean A0J2 = AnonymousClass00C.A0J(((Map) obj5).get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "plugin");
        Object obj6 = A06.get("next");
        AnonymousClass00C.A0E(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        boolean A0J3 = AnonymousClass00C.A0J(((Map) obj6).get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "screen");
        String A0a = C90464aC.A0a("extension_id", map3);
        boolean A1X = C36371kC.A1X(map3.get("is_draft"), true);
        String A0c = C90474aD.A0c("message_id", map3);
        String A0c2 = C90474aD.A0c("session_id", map3);
        String A0c3 = C90474aD.A0c("business_jid", map3);
        if (A0J2) {
            C117235lv r10 = this.A04;
            String valueOf = String.valueOf(obj4);
            AnonymousClass00C.A0D(valueOf, 0);
            r10.A00.A01((Boolean) null, C36411kG.A0t(), "plugin", "plugin_start", valueOf, (String) null);
        }
        Object obj7 = A06.get("data");
        if (!(!(obj7 instanceof HashMap) || (abstractMap = (AbstractMap) obj7) == null || (obj = abstractMap.get("external_data")) == null)) {
            A0J.put("external_data", obj);
        }
        if (A0J3) {
            Object obj8 = A06.get("data");
            if (!(obj8 instanceof HashMap)) {
                obj8 = null;
            }
            A0J.put("data", obj8);
        } else {
            A0J.put("action_payload", A06);
        }
        A0J.put("screen", obj4);
        A0J.put("action_name", map3.get("action"));
        Object obj9 = map3.get("current_screen");
        if (obj9 != null) {
            A0J.put("prev_screen_name", obj9);
        }
        if (A0J3) {
            AnonymousClass1KT r8 = this.A03;
            int hashCode = A0a.hashCode();
            r8.A04(hashCode, "data_channel_navigation", false);
            Object obj10 = A06.get("data");
            if (!(obj10 instanceof HashMap) || obj10 == null) {
                obj10 = C000400e.A0D();
            }
            AnonymousClass011[] r7 = new AnonymousClass011[2];
            C36341k9.A1J("screen", obj4, r7, 0);
            C36341k9.A1J("data", obj10, r7, 1);
            LinkedHashMap A07 = C000400e.A07(r7);
            if (!(A0c == null || A0c2 == null)) {
                this.A05.Boy(new C1499773m(this, A07, A0c, A0c2, A0a, A0c3, 0));
            }
            Object obj11 = map3.get("routing_model");
            if (obj11 instanceof Map) {
                map2 = (Map) obj11;
            } else {
                map2 = null;
            }
            String A0c4 = C90474aD.A0c("current_screen", map3);
            Object obj12 = map3.get("entry_screens");
            if (obj12 instanceof List) {
                list = (List) obj12;
            } else {
                list = null;
            }
            C1256960x r11 = this.A02;
            if (obj4 != null) {
                str = obj4.toString();
            } else {
                str = null;
            }
            AnonymousClass5SF A002 = r11.A00(A0c4, str, A0a, list, map2);
            if (A002 != AnonymousClass5SF.VALID) {
                C19630wG r82 = this.A01;
                String A0v = C36371kC.A0v(r82, R.string.f12nameremoved);
                if (A1X && A002 == AnonymousClass5SF.INVALID_ENTRY_SCREEN) {
                    Object[] objArr = new Object[2];
                    if (obj4 == null || (str2 = obj4.toString()) == null) {
                        str2 = "";
                    }
                    objArr[0] = str2;
                    if (list == null) {
                        list = "";
                    }
                    objArr[1] = list;
                    A0v = r82.A02(R.string.f12nameremoved, objArr);
                    AnonymousClass00C.A08(A0v);
                }
                r3.B0A("extensions-invalid-screen-transition-error", (String) null, C36391kE.A11(C52122ov.A02.key, new C128176Bf(A0v, (Map) null, -1)));
                return;
            }
            if (A0c4 == null) {
                A0c4 = "UNKNOWN";
            }
            r8.A03(hashCode, "source_screen_id", A0c4);
            String str3 = (String) obj4;
            if (str3 == null) {
                str3 = "UNKNOWN";
            }
            r8.A03(hashCode, "destination_screen_id", str3);
        }
        AnonymousClass718 r32 = (AnonymousClass718) r3;
        C1498172w.A00(r32.A02.A05, r32, A0J, 27);
    }

    public AnonymousClass5OL(C19630wG r2, AnonymousClass6TL r3, C1256960x r4, AnonymousClass1KT r5, C117235lv r6, C19770wU r7) {
        C36321k7.A0x(r7, r2);
        AnonymousClass00C.A0D(r3, 5);
        this.A05 = r7;
        this.A01 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r3;
        this.A04 = r6;
    }
}
