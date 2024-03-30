package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.3R4  reason: invalid class name */
public abstract class AnonymousClass3R4 {
    public static int A00(Context context) {
        int i;
        int i2;
        Point BAC;
        try {
            if (context instanceof C32531dl) {
                context = A03((C32531dl) context);
            }
            if ((context instanceof AnonymousClass159) && (BAC = ((AnonymousClass159) context).BAC()) != null) {
                i = BAC.x;
                i2 = BAC.y;
                return Math.min(i, i2);
            }
        } catch (NullPointerException e) {
            Log.e("ConversationRowWidths/getMaxRowWidth/null view while getting row width", e);
        }
        DisplayMetrics A0X = AnonymousClass000.A0X(context);
        i = A0X.widthPixels;
        i2 = A0X.heightPixels;
        return Math.min(i, i2);
    }

    public static int A01(Context context, int i) {
        C18740tg.A0B(AnonymousClass000.A1P(i));
        int A00 = A00(context);
        C18740tg.A0B(AnonymousClass000.A1P(i));
        return Math.round((((float) A00) * ((float) i)) / 100.0f);
    }

    public static int A02(View view) {
        return A01(view.getContext(), 72);
    }

    public static Context A03(C32531dl r1) {
        Context baseContext = r1.getBaseContext();
        if (baseContext instanceof Activity) {
            return baseContext;
        }
        if (baseContext instanceof C32531dl) {
            return A03((C32531dl) baseContext);
        }
        return null;
    }
}
