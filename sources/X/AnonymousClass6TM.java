package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6TM  reason: invalid class name */
public final class AnonymousClass6TM {
    public final C20310xM A00;
    public final AnonymousClass1A1 A01;
    public final C19770wU A02;
    public final C19600wD A03;
    public final AnonymousClass185 A04;
    public final AnonymousClass6OE A05;
    public final C19630wG A06;
    public final AnonymousClass6NP A07;

    public static final LinkedHashMap A00(String str, String str2) {
        AnonymousClass011[] r2 = new AnonymousClass011[2];
        C90464aC.A1E("screen", str2, r2);
        C90464aC.A1F(C108355Te.ERROR.key, C36391kE.A11(C108355Te.ERROR_MESSAGE.key, str), r2);
        return C000400e.A07(r2);
    }

    public static final LinkedHashMap A01(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        C90484aE.A1I("message_id", linkedHashMap, map2);
        C90484aE.A1I("session_id", linkedHashMap, map2);
        C90484aE.A1I("extension_id", linkedHashMap, map2);
        C90484aE.A1I("is_draft", linkedHashMap, map2);
        C90484aE.A1I("business_jid", linkedHashMap, map2);
        C90484aE.A1I("flow_token", linkedHashMap, map2);
        C90484aE.A1I("user_locale", linkedHashMap, map2);
        C90484aE.A1I("flow_message_version", linkedHashMap, map2);
        return linkedHashMap;
    }

    public final String A02() {
        C19630wG r2 = this.A06;
        boolean A09 = this.A03.A09();
        int i = R.string.f12nameremoved;
        if (!A09) {
            i = R.string.f12nameremoved;
        }
        return C36371kC.A0v(r2, i);
    }

    public final void A03(String str, String str2, Map map) {
        Object obj;
        String str3;
        Object obj2;
        String str4;
        Object obj3;
        String str5;
        Object obj4;
        String str6;
        Map map2 = map;
        if (map == null) {
            Log.e("logPrivateStatsError() -- Phoenix InitialStateMachineInput is NULL!");
        }
        AnonymousClass6OE r6 = this.A05;
        if (map != null) {
            obj = map2.get("extension_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        C222813r r2 = UserJid.Companion;
        if (map != null) {
            obj2 = map2.get("business_jid");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str4 = (String) obj2;
        } else {
            str4 = null;
        }
        UserJid A022 = r2.A02(str4);
        if (map != null) {
            obj3 = map2.get("message_id");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str5 = (String) obj3;
        } else {
            str5 = null;
        }
        if (map != null) {
            obj4 = map2.get("session_id");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str6 = (String) obj4;
        } else {
            str6 = null;
        }
        r6.A02(this.A04, this.A07, A022, (Boolean) null, "galaxy_message", str3, str5, str6, str, str2);
    }

    public AnonymousClass6TM(C19600wD r2, AnonymousClass185 r3, AnonymousClass6OE r4, C19630wG r5, C20310xM r6, AnonymousClass6NP r7, AnonymousClass1A1 r8, C19770wU r9) {
        C36321k7.A1B(r5, r2, r9, r6, r8);
        C36361kB.A1J(r3, 7, r7);
        this.A06 = r5;
        this.A03 = r2;
        this.A02 = r9;
        this.A00 = r6;
        this.A01 = r8;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = r7;
    }
}
