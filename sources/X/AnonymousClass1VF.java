package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.1VF  reason: invalid class name */
public class AnonymousClass1VF {
    public final C19630wG A00;
    public final AnonymousClass1VH A01;

    public void A00(String str) {
        int i = Build.VERSION.SDK_INT;
        Uri parse = Uri.parse("content://com.whatsapp.provider.instrumentation");
        Context context = this.A00.A00;
        if (i >= 26) {
            context.revokeUriPermission(str, parse, 3);
        } else {
            context.revokeUriPermission(parse, 3);
        }
    }

    public AnonymousClass1VF(C19630wG r1, AnonymousClass1VH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
