package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.6J4  reason: invalid class name */
public abstract class AnonymousClass6J4 {
    public static C133426Yl A00;
    public static final Object A01 = C36441kJ.A11();
    public static final Map A02 = new HashMap(4);
    public static final WeakHashMap A03 = new WeakHashMap();
    public static final ThreadLocal A04 = new ThreadLocal();

    public static final C120915sI A00(Context context, C161287mV r7) {
        C120915sI r1 = null;
        synchronized (A01) {
            Map map = A02;
            Map A15 = C90514aH.A15(context, map);
            if (A15 == null) {
                Context context2 = context;
                while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                    AnonymousClass00C.A08(context2);
                }
                if (!A03.containsKey(context2)) {
                    if (A00 == null) {
                        A00 = new C133426Yl();
                        Context applicationContext = context.getApplicationContext();
                        AnonymousClass00C.A0E(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(A00);
                    }
                    A15 = AnonymousClass001.A0J();
                    map.put(context, A15);
                }
            }
            Class BG1 = r7.BG1();
            r1 = (C120915sI) A15.get(BG1);
            if (r1 == null) {
                r1 = new C120915sI(r7.getClass());
                A15.put(BG1, r1);
            }
        }
        return r1;
    }
}
