package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AVm implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public AVm(Object obj, Object obj2, Object obj3, String str, int i, long j) {
        this.A05 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = j;
        this.A04 = str;
    }

    public final void run() {
        C29161Vo r6;
        C202009kr r5;
        String str;
        JSONArray A0u;
        String str2;
        JSONArray A0u2;
        int i = this.A05;
        Object obj = this.A01;
        if (i != 0) {
            C64783Pk r2 = (C64783Pk) obj;
            C64933Qa r1 = (C64933Qa) this.A03;
            long j = this.A00;
            String str3 = this.A04;
            if (((AnonymousClass3L0) this.A02).A01()) {
                str2 = "ent";
            } else {
                str2 = "smb";
            }
            C29151Vn r0 = r2.A0O;
            AnonymousClass11F r7 = r1.A00;
            int A002 = r0.A02.A00(r7.user, r1.A01, str3, j);
            r6 = r0.A01.A01;
            r5 = r6.A00();
            try {
                if (!TextUtils.isEmpty(r5.A0C)) {
                    A0u2 = new JSONArray(r5.A0C);
                } else {
                    A0u2 = C90524aI.A0u();
                }
                JSONObject A003 = C29171Vp.A00(r7.user, A0u2);
                A003.put("business_owner_jid", r7.user);
                A003.put("biz_platform", str2);
                A003.put("messages_viewed_count", A002);
                A0u2.put(A003);
                r5.A0C = A0u2.toString();
            } catch (JSONException unused) {
                Log.e("PaymentDailyUsageSync/onQrCodeReceived Error building json payload.");
                r5.A0C = C90524aI.A0u().toString();
                r6.A01(r5);
                return;
            }
        } else {
            A8P a8p = (A8P) obj;
            C64933Qa r12 = (C64933Qa) this.A03;
            long j2 = this.A00;
            String str4 = this.A04;
            if (((AnonymousClass3L0) this.A02).A01()) {
                str = "ent";
            } else {
                str = "smb";
            }
            C29151Vn r02 = a8p.A09;
            AnonymousClass11F r72 = r12.A00;
            int A004 = r02.A03.A00(r72.user, r12.A01, str4, j2);
            r6 = r02.A01.A01;
            r5 = r6.A00();
            if (!TextUtils.isEmpty(r5.A0C)) {
                A0u = new JSONArray(r5.A0C);
            } else {
                A0u = C90524aI.A0u();
            }
            JSONObject A005 = C29171Vp.A00(r72.user, A0u);
            A005.put("business_owner_jid", r72.user);
            A005.put("biz_platform", str);
            A005.put("vpa_messages_viewed_count", A004);
            A0u.put(A005);
            r5.A0C = A0u.toString();
        }
        r6.A01(r5);
    }
}
