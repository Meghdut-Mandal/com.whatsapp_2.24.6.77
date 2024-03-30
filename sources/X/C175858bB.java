package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.8bB  reason: invalid class name and case insensitive filesystem */
public abstract class C175858bB extends C175898bF {
    public int A00;
    public int A01;
    public int A02 = 8;
    public int A03 = 0;
    public int A04 = -1;
    public long A05;
    public long A06 = -1;
    public C135086c7 A07;
    public C135086c7 A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    @Deprecated
    public String A0F = "ACTIVE";
    public String A0G;
    public String A0H;
    public String A0I = "ACTIVE";
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    @Deprecated
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    @Deprecated
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;

    public static String A01(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -891611359:
                    str2 = "ENABLED";
                    break;
                case 930084620:
                    str2 = "REQUIRES_VERIFICATION";
                    break;
                case 1053567612:
                    str2 = "DISABLED";
                    break;
            }
            if (str.equals(str2)) {
                return str;
            }
        }
        return null;
    }

    public static Intent A00(Context context, C175858bB r5, Object obj) {
        Intent intent = new Intent(context, BrazilPayBloksActivity.class);
        C1025050g.A01(intent, "referral_screen", "payment_method_details");
        HashMap hashMap = new HashMap();
        hashMap.put("credential_id", obj);
        hashMap.put("last4", r5.A0J);
        intent.putExtra("screen_params", hashMap);
        intent.putExtra("screen_name", "brpay_p_add_cvv_card");
        return intent;
    }

    public String A0A() {
        if (!this.A0Y || !"ACTIVE".equals(this.A0I)) {
            return "DISABLED";
        }
        String str = this.A0F;
        if (str == null || "ACTIVE".equals(str)) {
            return "ENABLED";
        }
        return "REQUIRES_VERIFICATION";
    }
}
