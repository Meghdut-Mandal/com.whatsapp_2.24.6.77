package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.6Ou  reason: invalid class name and case insensitive filesystem */
public class C131376Ou {
    public static final Map A01 = AnonymousClass001.A0J();
    public static final Map A02 = new WeakHashMap();
    public static final Map A03 = new WeakHashMap();
    public AnonymousClass6EW A00;

    public synchronized AnonymousClass6EW A00() {
        AnonymousClass6EW r0;
        r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass6EW();
            this.A00 = r0;
        }
        return r0;
    }

    public synchronized AnonymousClass6EW A01(Context context) {
        AnonymousClass6EW r0;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A03;
        r0 = (AnonymousClass6EW) map.get(context);
        if (r0 == null) {
            r0 = new AnonymousClass6EW();
            map.put(context, r0);
        }
        return r0;
    }

    public synchronized AnonymousClass6EW A02(String str) {
        AnonymousClass6EW r0;
        Map map = A02;
        r0 = (AnonymousClass6EW) map.get(str);
        if (r0 == null) {
            r0 = new AnonymousClass6EW();
            map.put(str, r0);
        }
        return r0;
    }
}
