package X;

import com.whatsapp.registration.EULA;
import com.whatsapp.settings.Settings;

/* renamed from: X.4Xr  reason: invalid class name and case insensitive filesystem */
public class C89734Xr implements C20010ws {
    public Object A00;
    public final int A01;

    public C89734Xr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BaC() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            Settings settings = (Settings) obj;
            settings.A18 = true;
            AnonymousClass1WR r2 = settings.A0F;
            r2.A01 = false;
            r2.A00 = null;
            r2.A04.A1j((String) null, (String) null);
            return;
        }
        ((EULA) obj).A0d = true;
    }
}
