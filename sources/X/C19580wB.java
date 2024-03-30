package X;

import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.0wB  reason: invalid class name and case insensitive filesystem */
public abstract class C19580wB {
    public final C19660wJ observers;

    public void checkThread() {
    }

    public void resetDynamicObserversForTest() {
        synchronized (this.observers) {
            this.observers.A00.clear();
        }
    }

    public C19580wB(AnonymousClass005 r2) {
        this.observers = new C19660wJ(r2);
    }

    public Iterable getObservers() {
        C19660wJ r0;
        checkThread();
        synchronized (this.observers) {
            r0 = this.observers;
        }
        return r0;
    }

    public void registerObserver(Object obj) {
        C18740tg.A06(obj);
        synchronized (this.observers) {
            C19660wJ r0 = this.observers;
            C18740tg.A06(obj);
            if (r0.A00.contains(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Observer ");
                sb.append(obj);
                sb.append(" is already registered.");
                String obj2 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getClass().getSimpleName());
                sb2.append(":");
                sb2.append(obj2);
                Log.e(sb2.toString());
            } else {
                C19660wJ r02 = this.observers;
                C18740tg.A06(obj);
                r02.A00.add(obj);
            }
        }
    }

    public void unregisterObserver(Object obj) {
        C18740tg.A06(obj);
        synchronized (this.observers) {
            C19660wJ r0 = this.observers;
            C18740tg.A06(obj);
            if (!r0.A00.remove(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(":Observer ");
                sb.append(obj);
                sb.append(" was not registered.");
                Log.e(sb.toString());
            }
        }
    }

    public C19580wB() {
        this(new C18910u1(Collections.emptySet(), (AnonymousClass004) null));
    }
}
