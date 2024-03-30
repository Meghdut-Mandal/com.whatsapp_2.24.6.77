package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.Interpolator;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Ti  reason: invalid class name and case insensitive filesystem */
public abstract class C65753Ti {
    public static final Interpolator A00 = C017907q.A00(0.85f, 0.0f, 0.15f, 1.0f);
    public static final Interpolator A01 = C017907q.A00(0.83f, 0.0f, 0.17f, 1.0f);
    public static final C594934d A02 = new C594934d(false, false);
    public static final String[] A03 = {"👍"};

    public static C80143uv A00(C80143uv r11) {
        C80143uv r2 = r11;
        String str = r11.A05;
        if (TextUtils.isEmpty(str)) {
            return r2;
        }
        C18740tg.A06(str);
        if (AnonymousClass3TC.A03(str)) {
            return r2;
        }
        return new C80143uv(r11.A03, r11.A04, AnonymousClass3PG.A00, r11.A01, r11.A02, r11.A00);
    }

    public static String A01(Context context, C18820ts r2, int i) {
        if (i > 999) {
            return context.getString(R.string.f12nameremoved);
        }
        return r2.A0M().format((long) i);
    }

    public static String A02(String str) {
        C18740tg.A06(str);
        return C63873Lt.A01(AnonymousClass3UO.A07(new AnonymousClass1XQ(str).A00));
    }

    public static String A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C18740tg.A06(str);
        if (!AnonymousClass3TC.A03(str)) {
            return AnonymousClass3PG.A00;
        }
        return str;
    }

    public static ArrayList A04(C88944Uq r8, int i, boolean z) {
        long longValue;
        Iterator B8O = r8.B8O();
        LinkedHashMap A1G = C36431kI.A1G();
        LinkedHashMap A1G2 = C36431kI.A1G();
        while (B8O.hasNext()) {
            AnonymousClass28g r6 = (AnonymousClass28g) B8O.next();
            String str = r6.A02;
            String A022 = A02(str);
            if (z && r6.A01) {
                A1G2.put(A022, str);
            }
            Number A10 = C36441kJ.A10(A022, A1G);
            if (A10 == null) {
                longValue = 0;
            } else {
                longValue = A10.longValue();
            }
            C36421kH.A1K(A022, A1G, longValue + r6.A00);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        if (A1G2.size() > 0) {
            Iterator A0y = AnonymousClass000.A0y(A1G2);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A0I.add(A11.getValue());
                A1G.remove(A11.getKey());
                i--;
            }
        }
        int min = Math.min(i, A1G.size());
        ArrayList A15 = C36441kJ.A15(A1G.entrySet());
        Collections.sort(A15, C81723xT.A00);
        for (int i2 = 0; i2 < min; i2++) {
            A0I.add(((Map.Entry) A15.get(i2)).getKey());
        }
        return A0I;
    }
}
