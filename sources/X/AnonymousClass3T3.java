package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.3T3  reason: invalid class name */
public abstract class AnonymousClass3T3 {
    public static void A00(Vibrator vibrator, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(30, i));
            } else {
                vibrator.vibrate(30);
            }
        } catch (Exception e) {
            Log.w("vibrationutils/vibrate-failed", e);
        }
    }

    public static void A01(View view, C21060yb r2) {
        if (C19550w8.A07()) {
            view.performHapticFeedback(16);
        } else {
            A03(r2);
        }
    }

    public static void A02(View view, C21060yb r2) {
        if (C19550w8.A07()) {
            view.performHapticFeedback(17);
        } else {
            A03(r2);
        }
    }

    public static void A03(C21060yb r1) {
        Vibrator A0H = r1.A0H();
        if (A0H != null) {
            A00(A0H, 48);
        }
    }

    public static void A04(C21060yb r1) {
        Vibrator A0H = r1.A0H();
        if (A0H != null) {
            A00(A0H, 80);
        }
    }
}
