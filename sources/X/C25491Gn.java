package X;

import android.net.Uri;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1Gn  reason: invalid class name and case insensitive filesystem */
public class C25491Gn extends AnonymousClass1GW {
    public final C21060yb A00;
    public final C24051Aw A01;

    public int A00(Uri uri) {
        C21050ya A0O = this.A00.A0O();
        String A0M = AnonymousClass1GW.A0M(uri, A0O);
        try {
            if ("image/gif".equals(A0M)) {
                C24051Aw r0 = this.A01;
                try {
                    C21656ATx.A02(uri, r0, A0O);
                    if (!C21656ATx.A02(uri, r0, A0O).A02) {
                        return 1;
                    }
                    return 13;
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            Log.e("Media file cannot be read", e);
        }
        int A05 = AnonymousClass1GW.A05(A0M);
        if (A05 == 0) {
            return 9;
        }
        return A05;
    }

    public C25491Gn(C21060yb r3, C24051Aw r4) {
        this.A00 = r3;
        this.A01 = r4;
        r4.A02.add("com.whatsapp.provider.MigrationContentProvider");
    }

    public int A01(AnonymousClass6QO r4) {
        Integer A09 = r4.A09();
        if (A09 == null) {
            int A002 = A00(r4.A0J);
            A09 = Integer.valueOf(A002);
            if (A002 == 3 && GifHelper.A01(r4.A08())) {
                A09 = 13;
            }
        }
        return A09.intValue();
    }
}
