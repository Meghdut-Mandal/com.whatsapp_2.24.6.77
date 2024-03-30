package X;

import android.provider.Settings;
import com.whatsapp.util.Log;

/* renamed from: X.2vP  reason: invalid class name and case insensitive filesystem */
public abstract class C55922vP {
    public static void A00(C21060yb r2) {
        try {
            if (Settings.System.getInt(r2.A0O().A00, "haptic_feedback_enabled") != 0) {
                C36391kE.A1N(r2);
            }
        } catch (Settings.SettingNotFoundException e) {
            Log.e("voicerecorderutils/vibrate", e);
        }
    }
}
