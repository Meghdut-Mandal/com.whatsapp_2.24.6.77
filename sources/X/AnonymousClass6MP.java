package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.6MP  reason: invalid class name */
public class AnonymousClass6MP {
    public static final Map A01 = new WeakHashMap();
    public final AnonymousClass004 A00;

    public synchronized AnonymousClass6JY A00(Context context) {
        AnonymousClass6JY r0;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A01;
        r0 = (AnonymousClass6JY) map.get(context);
        if (r0 == null) {
            r0 = (AnonymousClass6JY) this.A00.get();
            map.put(context, r0);
        }
        return r0;
    }

    public AnonymousClass6MP(AnonymousClass004 r1) {
        this.A00 = r1;
    }
}
