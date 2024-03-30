package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3Ob  reason: invalid class name and case insensitive filesystem */
public class C64463Ob {
    public final C20810yC A00;

    public C64463Ob(C20810yC r1) {
        this.A00 = r1;
    }

    public static Matcher A00(C64463Ob r1, String str) {
        if (!TextUtils.isEmpty(str)) {
            String A09 = r1.A00.A09(265);
            if (!TextUtils.isEmpty(A09)) {
                try {
                    C18740tg.A06(A09);
                    Pattern compile = Pattern.compile(C36441kJ.A1C(A09).getJSONArray("url").getJSONObject(0).getString("regex"));
                    C18740tg.A06(str);
                    return compile.matcher(str);
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    throw new C52892qL((Throwable) e);
                }
            } else {
                throw new C52892qL("SHOPS_STOREFRONT_URLS_CONFIG_CODE was null/empty");
            }
        } else {
            throw new C52892qL("Shop url was null");
        }
    }

    public boolean A01(String str) {
        try {
            return A00(this, str).matches();
        } catch (C52892qL e) {
            Log.e((Throwable) e);
            return false;
        }
    }
}
