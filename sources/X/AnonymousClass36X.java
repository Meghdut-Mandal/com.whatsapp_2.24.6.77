package X;

import android.os.Environment;
import com.whatsapp.util.Log;

/* renamed from: X.36X  reason: invalid class name */
public class AnonymousClass36X {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass005 A02;

    public AnonymousClass36X(AnonymousClass179 r5, C20830yE r6, C20060wx r7) {
        String A0p;
        this.A02 = C36431kI.A0x(new C81903xp(r5, this, r6, r7));
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = false;
            return;
        }
        if ("mounted_ro".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = true;
            A0p = "media-state-manager/main/media/read-only";
        } else {
            this.A00 = true;
            this.A01 = false;
            A0p = AnonymousClass000.A0p("media-state-manager/main/media/unavailable ", externalStorageState, AnonymousClass000.A0u());
        }
        Log.i(A0p);
    }
}
