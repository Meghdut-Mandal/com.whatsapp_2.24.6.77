package X;

import android.app.Application;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.1JU  reason: invalid class name */
public class AnonymousClass1JU {
    public boolean A00 = false;
    public final Application A01;
    public final C19700wN A02;

    public void A00() {
        if (!this.A00 && "samsung".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 24) {
            try {
                Class<?> cls = Class.forName("com.samsung.android.emergencymode.SemEmergencyManager");
                Field declaredField = cls.getDeclaredField("sInstance");
                declaredField.setAccessible(true);
                Object obj = declaredField.get((Object) null);
                Field declaredField2 = cls.getDeclaredField("mContext");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, this.A01);
            } catch (Exception e) {
                this.A00 = true;
                Log.e("SemEmergencyManagerLeakFix/apply", e);
                this.A02.A0D("leak-fix-v2", "SemEmergencyManagerLeakFix", e);
            }
        }
    }

    public AnonymousClass1JU(Application application, C19700wN r3) {
        this.A02 = r3;
        this.A01 = application;
    }
}
