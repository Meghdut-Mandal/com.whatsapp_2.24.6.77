package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.6S0  reason: invalid class name */
public class AnonymousClass6S0 {
    public static final Map A02 = Collections.unmodifiableMap(new AnonymousClass5ZP(4));
    public final C130756Mh A00;
    public final C118155nQ A01;

    public static Cursor A00(ContentProviderClient contentProviderClient, C1271567e r6, C160957lr r7) {
        AnonymousClass671 r0 = r6.A03;
        try {
            return contentProviderClient.query(r6.A00, r0.A02, r0.A01, (String[]) null, (String) null);
        } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
            r7.Bgy(e, r6);
            return null;
        }
    }

    public AnonymousClass6S0(Context context) {
        C130756Mh r1 = new C130756Mh(context.getPackageName());
        this.A00 = r1;
        this.A01 = new C118155nQ(r1);
    }
}
