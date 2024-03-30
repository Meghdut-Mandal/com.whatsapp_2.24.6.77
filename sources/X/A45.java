package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

public final class A45 implements C22894Axp {
    public final Location BDR(AnonymousClass0XK r6) {
        String str;
        boolean z = true;
        AnonymousClass006.A07(AnonymousClass000.A1V(r6), "GoogleApiClient parameter is required.");
        AnonymousClass8BW r4 = (AnonymousClass8BW) r6.A04(AnonymousClass9B2.A00);
        if (r4 == null) {
            z = false;
        }
        AnonymousClass006.A08(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        Context A02 = r6.A02();
        if (Build.VERSION.SDK_INT >= 30 && A02 != null) {
            try {
                str = (String) AnonymousClass000.A0h(Context.class, A02, "getAttributionTag");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            return r4.A0G(str);
        }
        str = null;
        try {
            return r4.A0G(str);
        } catch (Exception unused2) {
            return null;
        }
    }
}
