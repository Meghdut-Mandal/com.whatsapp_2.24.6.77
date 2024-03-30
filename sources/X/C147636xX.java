package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6xX  reason: invalid class name and case insensitive filesystem */
public final class C147636xX implements C159657ji {
    public final Activity A00;
    public final List A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Activity A03;
    public final /* synthetic */ AnonymousClass54H A04;
    public final /* synthetic */ C206969uL A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ HashMap A08;

    public C147636xX(Activity activity, AnonymousClass54H r4, C206969uL r5, Object obj, String str, String str2, HashMap hashMap, long j) {
        this.A03 = activity;
        this.A04 = r4;
        this.A06 = str;
        this.A02 = j;
        this.A05 = r5;
        this.A07 = str2;
        this.A08 = hashMap;
        List A0m = C90524aI.A0m(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        AnonymousClass00C.A0D(A0m, 2);
        this.A00 = activity;
        this.A01 = A0m;
    }

    public void BXS(AnonymousClass6PH r2, Map map) {
        Log.e("AddressCaptureAction: FDS onFailure");
    }

    public void BiH(Map map) {
        String str;
        HashMap hashMap;
        Map map2 = map;
        if (map != null) {
            Activity activity = this.A03;
            AnonymousClass00C.A0E(activity, "null cannot be cast to non-null type com.whatsapp.conversation.ConversationInterface");
            AnonymousClass11F A0N = C36421kH.A0N(C90494aF.A0a((C88834Uf) activity));
            String str2 = "address_message";
            Object obj = null;
            if (map2.get(str2) instanceof String) {
                str = C36431kI.A1A(str2, map2);
                str2 = "params";
                if (!(map2.get(str2) instanceof HashMap)) {
                    hashMap = null;
                }
                hashMap = (HashMap) map2.get(str2);
            } else {
                str = C36431kI.A1A("body", map2);
                hashMap = (HashMap) map2.get(str2);
            }
            if (A0N != null && str != null && hashMap != null) {
                if (this.A01.contains("address_message_validate")) {
                    AbstractMap abstractMap = (AbstractMap) hashMap.get("values");
                    if (abstractMap != null) {
                        obj = abstractMap.get("in_pin_code");
                    }
                    AnonymousClass54H r6 = this.A04;
                    r6.A00.A01(new C142586p7(activity, r6, A0N, this.A05, this.A06, str, this.A07, hashMap, this.A08, this.A02), (String) obj, A0N.getRawString());
                    return;
                }
                this.A04.A0H(activity, A0N, this.A06, str, hashMap, this.A02);
            }
        }
    }
}
