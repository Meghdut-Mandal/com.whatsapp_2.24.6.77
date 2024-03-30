package X;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: X.10H  reason: invalid class name */
public class AnonymousClass10H extends AnonymousClass10F {
    public int A00;
    public Context A01;
    public AnonymousClass10G A02;

    public String toString() {
        return this.A02.toString();
    }

    public AnonymousClass10H(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            Log.w("SoLoader", sb.toString());
            this.A01 = context;
            applicationContext = context;
        }
        this.A00 = i;
        this.A02 = new AnonymousClass10G(new File(applicationContext.getApplicationInfo().nativeLibraryDir), new String[0], i);
    }
}
