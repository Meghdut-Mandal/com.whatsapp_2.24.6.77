package androidx.lifecycle;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass0WR;
import X.AnonymousClass0YV;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Deprecated
public class ReflectiveGenericLifecycleObserver implements AnonymousClass01Y {
    public final AnonymousClass0WR A00;
    public final Object A01;

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        AnonymousClass0WR r0 = this.A00;
        Object obj = this.A01;
        Map map = r0.A01;
        AnonymousClass0WR.A00(r4, r5, obj, (List) map.get(r4));
        AnonymousClass0WR.A00(r4, r5, obj, (List) map.get(AnonymousClass05R.ON_ANY));
    }

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.A01 = obj;
        AnonymousClass0YV r2 = AnonymousClass0YV.A02;
        Class<?> cls = obj.getClass();
        AnonymousClass0WR r0 = (AnonymousClass0WR) r2.A00.get(cls);
        this.A00 = r0 == null ? AnonymousClass0YV.A00(r2, cls, (Method[]) null) : r0;
    }
}
