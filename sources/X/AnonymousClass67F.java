package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.67F  reason: invalid class name */
public class AnonymousClass67F {
    public final WeakReference A00;
    public final List A01 = AnonymousClass001.A0I();
    public final Application.ActivityLifecycleCallbacks A02;
    public volatile boolean A03;

    public void A00() {
        int i;
        Runnable[] runnableArr;
        List list = this.A01;
        synchronized (list) {
            this.A03 = true;
        }
        Context A0G = C36441kJ.A0G(this.A00);
        if (A0G != null) {
            ((Application) A0G.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A02);
        }
        synchronized (list) {
            runnableArr = (Runnable[]) list.toArray(new Runnable[0]);
        }
        for (Runnable run : runnableArr) {
            run.run();
        }
        synchronized (list) {
            list.removeAll(Arrays.asList(runnableArr));
        }
    }

    public void A01(Runnable runnable) {
        if (runnable != null) {
            List list = this.A01;
            synchronized (list) {
                if (this.A03) {
                    AnonymousClass6RS.A01("BloksContextBindManager", "Subscription added after destroy");
                } else {
                    list.add(runnable);
                    runnable = null;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public AnonymousClass67F(Context context) {
        C133436Ym r2 = new C133436Ym(this);
        this.A02 = r2;
        Context context2 = context;
        while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        this.A00 = AnonymousClass001.A0F(context2);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r2);
    }
}
