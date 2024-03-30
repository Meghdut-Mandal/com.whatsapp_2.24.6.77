package X;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.01f  reason: invalid class name and case insensitive filesystem */
public class C003001f {
    public AnonymousClass01Y A00;
    public AnonymousClass01P A01;

    public C003001f(AnonymousClass01P r5, AnonymousClass00N r6) {
        AnonymousClass01Y r62;
        AnonymousClass01Y r1;
        boolean z = r6 instanceof C003101g;
        if (r6 instanceof AnonymousClass01Y) {
            if (z) {
                r1 = new FullLifecycleObserverAdapter((C003101g) r6, (AnonymousClass01Y) r6);
            } else {
                r62 = (AnonymousClass01Y) r6;
                r1 = r62;
            }
        } else if (z) {
            r1 = new FullLifecycleObserverAdapter((C003101g) r6, (AnonymousClass01Y) null);
        } else {
            Class<?> cls = r6.getClass();
            if (C07400Xn.A00(cls) == 2) {
                List list = (List) C07400Xn.A00.get(cls);
                if (list.size() == 1) {
                    C07400Xn.A01(r6, (Constructor) list.get(0));
                    r1 = new SingleGeneratedAdapterObserver();
                } else {
                    C15780ny[] r12 = new C15780ny[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        C07400Xn.A01(r6, (Constructor) list.get(i));
                        r12[i] = null;
                    }
                    r62 = new CompositeGeneratedAdaptersObserver(r12);
                    r1 = r62;
                }
            } else {
                r1 = new ReflectiveGenericLifecycleObserver(r6);
            }
        }
        this.A00 = r1;
        this.A01 = r5;
    }

    public void A00(AnonymousClass05R r4, AnonymousClass012 r5) {
        AnonymousClass01P A012 = r4.A01();
        AnonymousClass01P r1 = this.A01;
        if (A012.compareTo(r1) < 0) {
            r1 = A012;
        }
        this.A01 = r1;
        this.A00.BhM(r4, r5);
        this.A01 = A012;
    }
}
