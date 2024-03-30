package X;

import com.whatsapp.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7Yn  reason: invalid class name and case insensitive filesystem */
public final class C156067Yn extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C159767jt $callback;
    public final /* synthetic */ String $currentScreen;
    public final /* synthetic */ Map $input;
    public final /* synthetic */ AnonymousClass5OJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156067Yn(C159767jt r2, AnonymousClass5OJ r3, String str, Map map) {
        super(2);
        this.$input = map;
        this.$callback = r2;
        this.this$0 = r3;
        this.$currentScreen = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String A02;
        Map map;
        Object obj3;
        String str = (String) obj2;
        if (AnonymousClass000.A1X(obj)) {
            Object obj4 = this.$input.get("flow_token");
            C90494aF.A10(obj4);
            Object obj5 = this.$input.get("action_payload");
            AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Object obj6 = ((Map) obj5).get("business_payload");
            Map map2 = null;
            if (obj6 instanceof Map) {
                map = (Map) obj6;
            } else {
                map = null;
            }
            if (map != null) {
                obj3 = map.get("data");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Map) {
                map2 = (Map) obj3;
            }
            LinkedHashMap A08 = C000400e.A08(C36441kJ.A19("flow_token", obj4));
            if (map2 != null) {
                A08.putAll(map2);
            }
            AnonymousClass011[] r3 = new AnonymousClass011[3];
            C36341k9.A1J("data", C36391kE.A11("extension_message_response", C36391kE.A11("params", A08)), r3, 0);
            C36341k9.A1J("data_channel_navigation", false, r3, 1);
            C36341k9.A1J("screen", "SUCCESS", r3, 2);
            LinkedHashMap A07 = C000400e.A07(r3);
            C159767jt r2 = this.$callback;
            if (r2 != null) {
                AnonymousClass718 r22 = (AnonymousClass718) r2;
                C1498172w.A00(r22.A02.A05, r22, A07, 27);
            }
        } else {
            boolean A0J = AnonymousClass00C.A0J(str, "extensions-integrity-check-failed");
            AnonymousClass5OJ r0 = this.this$0;
            if (A0J) {
                A02 = r0.A00.A01(R.string.f12nameremoved);
            } else {
                A02 = r0.A03.A02();
            }
            AnonymousClass00C.A0B(A02);
            C159767jt r1 = this.$callback;
            if (r1 != null) {
                if (str == null) {
                    str = "";
                }
                r1.B0A(str, A02, AnonymousClass6TM.A00(A02, this.$currentScreen));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
