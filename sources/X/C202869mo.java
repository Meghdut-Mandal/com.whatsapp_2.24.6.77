package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9mo  reason: invalid class name and case insensitive filesystem */
public abstract class C202869mo {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02;
    public static final Map A03;
    public static final Map A04;

    public static Integer A00(C20810yC r4, String str) {
        Pair pair;
        Map map;
        Object obj = null;
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            pair = null;
        } else {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                pair = C36441kJ.A0Q(A1C.getString("payment_method"), C165577te.A0b("payment_timestamp", A1C));
            } catch (JSONException e) {
                Log.e("CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json", e);
                pair = null;
            }
        }
        if (pair != null) {
            obj = pair.first;
        }
        if (AnonymousClass000.A1P(C165587tf.A05(r4))) {
            map = A04;
        } else if (A03(r4)) {
            map = A01;
        } else {
            map = A00;
        }
        return (Integer) map.get(obj);
    }

    public static String A01(AnonymousClass8SX r1) {
        if (AnonymousClass000.A1P(r1.bitField1_ & 8)) {
            AnonymousClass8SV r0 = r1.interactiveMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8SV.DEFAULT_INSTANCE;
            }
            C172358Nn r02 = r0.body_;
            if (r02 == null) {
                r02 = C172358Nn.DEFAULT_INSTANCE;
            }
            return r02.text_;
        } else if ((r1.bitField1_ & 1) == 0) {
            return null;
        } else {
            C173308Re r03 = r1.buttonsMessage_;
            if (r03 == null) {
                r03 = C173308Re.DEFAULT_INSTANCE;
            }
            return r03.contentText_;
        }
    }

    public static boolean A03(C20810yC r3) {
        JSONObject A0A = r3.A0A(4252);
        if (!A0A.has("buyer_ed_order_message_content_update_enabled")) {
            return false;
        }
        try {
            if (A0A.getInt("buyer_ed_order_message_content_update_enabled") == 1) {
                return true;
            }
            return false;
        } catch (JSONException e) {
            Log.e("failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#buyer_ed_order_message_content_update_enabled", e);
            return false;
        }
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A02 = A0J;
        HashMap A0J2 = AnonymousClass001.A0J();
        A03 = A0J2;
        HashMap A0J3 = AnonymousClass001.A0J();
        A00 = A0J3;
        HashMap A0J4 = AnonymousClass001.A0J();
        A01 = A0J4;
        HashMap A0J5 = AnonymousClass001.A0J();
        A04 = A0J5;
        Integer valueOf = Integer.valueOf(R.string.f12nameremoved);
        A0J5.put("payment_instruction", valueOf);
        Integer valueOf2 = Integer.valueOf(R.string.f12nameremoved);
        A0J5.put("pix", valueOf2);
        A0J5.put("confirm", Integer.valueOf(R.string.f12nameremoved));
        Integer valueOf3 = Integer.valueOf(R.string.f12nameremoved);
        A0J5.put("captured", valueOf3);
        Integer valueOf4 = Integer.valueOf(R.string.f12nameremoved);
        A0J5.put("pending", valueOf4);
        A0J4.put("payment_instruction", valueOf);
        A0J4.put("pix", valueOf2);
        C36341k9.A1K("confirm", A0J4, R.string.f12nameremoved);
        A0J4.put("captured", valueOf3);
        A0J4.put("pending", valueOf4);
        A0J3.put("payment_instruction", valueOf);
        A0J3.put("pix", valueOf2);
        C36341k9.A1K("confirm", A0J3, R.string.f12nameremoved);
        A0J3.put("captured", valueOf3);
        A0J3.put("pending", valueOf4);
        C36341k9.A1K("pending", A0J, R.string.f12nameremoved);
        A0J.put("processing", Integer.valueOf(R.string.f12nameremoved));
        A0J.put("completed", Integer.valueOf(R.string.f12nameremoved));
        A0J.put("canceled", Integer.valueOf(R.string.f12nameremoved));
        A0J.put("partially_shipped", Integer.valueOf(R.string.f12nameremoved));
        A0J.put("shipped", Integer.valueOf(R.string.f12nameremoved));
        A0J.put("payment_requested", Integer.valueOf(R.string.f12nameremoved));
        A0J.put("preparing_to_ship", Integer.valueOf(R.string.f12nameremoved));
        A0J.put("delivered", Integer.valueOf(R.string.f12nameremoved));
        C36341k9.A1K("pending", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("processing", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("completed", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("canceled", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("partially_shipped", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("shipped", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("payment_requested", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("preparing_to_ship", A0J2, R.string.f12nameremoved);
        C36341k9.A1K("delivered", A0J2, R.string.f12nameremoved);
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C36441kJ.A1C(str).getJSONObject("order").getString("status");
        } catch (JSONException e) {
            Log.e("CheckoutInfoContentParser/getOrderStatusStr failed to parse parameters json", e);
            return null;
        }
    }
}
