package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5G5  reason: invalid class name */
public final class AnonymousClass5G5 extends AnonymousClass5G6 implements C162097o1, AnonymousClass0p4 {
    public FcsWebViewFragment A00;
    public List A01 = AnonymousClass001.A0I();
    public final C131376Ou A02;
    public final C19630wG A03;
    public final C110825bI A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5G5(C116145k1 r2, C19630wG r3, C110825bI r4, C105705Fs r5, C131376Ou r6) {
        super(r2, r5);
        AnonymousClass00C.A0D(r6, 1);
        C36321k7.A17(r3, r2, r5, 2);
        this.A02 = r6;
        this.A03 = r3;
        this.A04 = r4;
    }

    public void B1y(boolean z) {
    }

    public AnonymousClass02E BEK(String str, String str2, String str3, Map map, Map map2, int i) {
        Object obj;
        Map map3;
        FcsWebViewFragment fcsWebViewFragment;
        Object obj2;
        String str4;
        String str5;
        String str6;
        HashMap hashMap;
        Map map4;
        Map map5;
        Map map6;
        AnonymousClass00C.A0D(str, 0);
        String str7 = str3;
        Map map7 = map;
        C36321k7.A17(map7, str7, map2, 2);
        Object obj3 = map7.get("additional_params");
        if (!(obj3 instanceof Map) || (map6 = (Map) obj3) == null) {
            obj = null;
        } else {
            obj = map6.get("ext_message_id");
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        boolean A1V = AnonymousClass000.A1V(obj);
        String A0a = C90464aC.A0a("url", map7);
        String A1A = C36431kI.A1A("successURL", map7);
        String A1A2 = C36431kI.A1A("failureURL", map7);
        Object obj4 = map7.get("inputPayload");
        if (obj4 instanceof Map) {
            map3 = (Map) obj4;
        } else {
            map3 = null;
        }
        String A0k = C90474aD.A0k(map3);
        boolean A0J = AnonymousClass00C.A0J(map7.get("request_type"), "POST");
        String str8 = str2;
        if (A1V) {
            Object obj5 = map7.get("data");
            if (!(obj5 instanceof Map) || (map5 = (Map) obj5) == null) {
                obj2 = null;
            } else {
                obj2 = map5.get("screen");
            }
            if (obj2 instanceof String) {
                str4 = (String) obj2;
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            Object obj6 = map7.get("onTransitionAction");
            if (!(obj6 instanceof String) || (str5 = (String) obj6) == null) {
                str5 = "";
            }
            Object obj7 = map7.get("nextScreen");
            if (!(obj7 instanceof String) || (str6 = (String) obj7) == null) {
                str6 = "";
            }
            int A06 = C36421kH.A06(this.A01, 1);
            String A0v = C36371kC.A0v(this.A03, R.string.f12nameremoved);
            Object obj8 = map7.get("outputPayload");
            if (!(obj8 instanceof Map) || (map4 = (Map) obj8) == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map4);
            }
            AnonymousClass00C.A0D(A0a, 0);
            fcsWebViewFragment = new FcsExtensionsWebViewFragment();
            Bundle A0I = C36431kI.A0I("url", A0a);
            A0I.putString("success_url", A1A);
            A0I.putString("failure_url", A1A2);
            A0I.putString("post_data", A0k);
            A0I.putBoolean("use_post_request", A0J);
            A0I.putString("fds_observer_id", str8);
            A0I.putString("fds_manager_id", str7);
            A0I.putInt("callback_index", A06);
            A0I.putString("current_screen", str4);
            A0I.putString("next_action", str5);
            A0I.putString("next_screen", str6);
            A0I.putString("error_message", A0v);
            A0I.putSerializable("callback_url_payload", hashMap);
            fcsWebViewFragment.A17(A0I);
        } else {
            int A07 = C36431kI.A07(this.A01);
            AnonymousClass00C.A0D(A0a, 0);
            fcsWebViewFragment = new FcsWebViewFragment();
            Bundle A0I2 = C36431kI.A0I("url", A0a);
            A0I2.putString("success_url", A1A);
            A0I2.putString("failure_url", A1A2);
            A0I2.putString("post_data", A0k);
            A0I2.putBoolean("use_post_request", true);
            A0I2.putString("fds_observer_id", str8);
            A0I2.putString("fds_manager_id", str7);
            A0I2.putInt("callback_index", A07);
            fcsWebViewFragment.A17(A0I2);
        }
        this.A00 = fcsWebViewFragment;
        AnonymousClass00C.A0B(fcsWebViewFragment);
        return fcsWebViewFragment;
    }

    public void Bku(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
    }

    public void Bl6(C108015Rv r1, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
    }

    public void B7N(Map map) {
        if (map != null) {
            C159627jf r2 = (C159627jf) this.A01.get(C90484aE.A0C(map.get("callback_index"), "null cannot be cast to non-null type kotlin.Int"));
            Object obj = map.get("resource_output");
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map2 = (Map) obj;
            if (C90464aC.A1a(map, "status")) {
                r2.BiH(map2);
            } else {
                r2.BXS(AnonymousClass6PH.A03, map2);
            }
        } else {
            throw C36381kD.A0l();
        }
    }
}
