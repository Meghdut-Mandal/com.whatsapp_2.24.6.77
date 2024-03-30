package X;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.623  reason: invalid class name */
public class AnonymousClass623 {
    public final C19700wN A00;
    public final Application A01;

    public void A00() {
        if (Build.VERSION.SDK_INT == 21) {
            try {
                Class.forName("android.media.session.MediaSessionLegacyHelper").getDeclaredMethod("getHelper", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.A01});
            } catch (InvocationTargetException e) {
                e = e.getTargetException();
                Log.e("MediaSessionLegacyHelperLeakFix/applyFix", e);
                this.A00.A0D("MediaSessionLegacyHelperLeakFix", e.getMessage(), e);
            } catch (Exception e2) {
                e = e2;
                Log.e("MediaSessionLegacyHelperLeakFix/applyFix", e);
                this.A00.A0D("MediaSessionLegacyHelperLeakFix", e.getMessage(), e);
            }
        }
    }

    public AnonymousClass623(Application application, C19700wN r2) {
        this.A00 = r2;
        this.A01 = application;
    }
}
