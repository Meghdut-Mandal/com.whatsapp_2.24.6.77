package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.1bu  reason: invalid class name and case insensitive filesystem */
public final class C31491bu {
    public final C19970wo A00;
    public final C19890wg A01;
    public final C31501bv A02;

    public C31491bu(C19970wo r2, C19890wg r3, C31501bv r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final C592333d A00(C592233c r21, C188408zX r22, String str, int i, int i2) {
        String str2;
        String str3;
        String str4;
        Object obj;
        C19970wo r4 = this.A00;
        String num = Integer.toString(i);
        AnonymousClass00C.A08(num);
        SharedPreferences A002 = this.A01.A00("com.whatsapp.psa.qp_surface");
        AnonymousClass00C.A08(A002);
        C202109l3 r2 = new C202109l3(A002, r4, num);
        C188408zX r0 = C188408zX.IMPRESSION;
        C188408zX r3 = r22;
        String str5 = str;
        if (r3 == r0 && System.currentTimeMillis() - r2.A04(r0, str5) <= ((long) i2)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("nux_id", String.valueOf(i));
        C592233c r1 = r21;
        if (!(r21 == null || (obj = r1.A00.get("INSTANCE_LOG_DATA")) == null)) {
            linkedHashMap.put("instance_log_data", obj);
        }
        String obj2 = new JSONObject(linkedHashMap).toString();
        AnonymousClass00C.A08(obj2);
        C31501bv r6 = this.A02;
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            str2 = "impression";
        } else if (ordinal == 1) {
            str2 = "primary_click";
        } else if (ordinal != 2) {
            str2 = "dismiss";
            if (!(ordinal == 3 || ordinal == 4)) {
                throw new C13180jS();
            }
        } else {
            str2 = "secondary_click";
        }
        AnonymousClass19A r13 = r6.A00;
        String A09 = r13.A09();
        ArrayList arrayList = C50692lK.A00;
        C50692lK r7 = new C50692lK(Long.valueOf(currentTimeMillis), A09, str5, obj2, str2);
        C10810fG r5 = new C10810fG();
        r5.element = new C592333d();
        C203399nx r15 = r7.A00;
        AnonymousClass00C.A08(r15);
        r13.A0K(new AnonymousClass3TH(r5, 3), r15, A09, 376, 0);
        C592333d r42 = (C592333d) r5.element;
        if (r42.A00 == 0) {
            r42 = null;
        }
        if (r3 == r0) {
            C202109l3.A02(r2, str5, "impressionCount", "lastImpressionTime", "lastImpressionForSurface");
        } else if (ordinal != 0) {
            if (ordinal == 1) {
                str3 = "primaryActionCount";
                str4 = "primaryActionTime";
            } else if (ordinal != 2) {
                C202109l3.A02(r2, str5, "dismissActionCount", "dismissActionTime", "lastDismissForSurface");
                return r42;
            } else {
                str3 = "secondaryActionCount";
                str4 = "secondaryActionTime";
            }
            C202109l3.A02(r2, str5, str3, str4, (String) null);
            return r42;
        } else {
            C202109l3.A02(r2, str5, "impressionCount", "lastImpressionTime", (String) null);
        }
        String A003 = C202109l3.A00(r2, "lastQPForImpressionForSurface");
        SharedPreferences sharedPreferences = r2.A00;
        sharedPreferences.edit().putString(A003, str5).apply();
        sharedPreferences.edit().putLong(C202109l3.A01(str5, "eligibilityDurationAfterFirstImpression"), System.currentTimeMillis()).apply();
        return r42;
    }
}
