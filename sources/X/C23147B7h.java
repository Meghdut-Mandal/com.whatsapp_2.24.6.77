package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.B7h  reason: case insensitive filesystem */
public class C23147B7h implements C22960AzC {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23147B7h(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BYY(C202059ky r8, List list) {
        JSONArray A002;
        if (this.A02 != 0) {
            C167737yi r3 = (C167737yi) this.A00;
            C175888bE r6 = (C175888bE) this.A01;
            C167737yi.A02(r3);
            if (r8 == null) {
                JSONArray A003 = C201269jE.A00(list);
                AnonymousClass9O9 r4 = new AnonymousClass9O9(4);
                HashMap A0J = AnonymousClass001.A0J();
                r4.A07 = A0J;
                A0J.put("update", "1");
                HashMap hashMap = r4.A07;
                C18740tg.A06(A003);
                hashMap.put("banks", A003.toString());
                String str = r6.A03;
                if (TextUtils.isEmpty(str)) {
                    str = r3.A0A.A0A.A02();
                }
                r4.A07.put("business_name", str);
                r4.A06 = "brpay_m_payout_info";
                r3.A03.A0D(r4);
                return;
            }
            AnonymousClass9O9 r1 = new AnonymousClass9O9(7);
            r1.A04 = r8;
            r3.A03.A0D(r1);
            return;
        }
        AnonymousClass6C8 r32 = (AnonymousClass6C8) this.A01;
        if (r8 != null || (A002 = C201269jE.A00(list)) == null) {
            r32.A00("on_failure");
            return;
        }
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("banks", A002.toString());
        r32.A01("on_success", A0J2);
    }
}
