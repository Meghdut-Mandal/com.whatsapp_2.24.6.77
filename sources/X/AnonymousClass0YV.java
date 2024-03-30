package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* renamed from: X.0YV  reason: invalid class name */
public final class AnonymousClass0YV {
    public static AnonymousClass0YV A02 = new AnonymousClass0YV();
    public final Map A00 = AnonymousClass001.A0J();
    public final Map A01 = AnonymousClass001.A0J();

    public static AnonymousClass0WR A00(AnonymousClass0YV r12, Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap A0J = AnonymousClass001.A0J();
        if (superclass != null) {
            AnonymousClass0WR r0 = (AnonymousClass0WR) r12.A00.get(superclass);
            if (r0 == null) {
                r0 = A00(r12, superclass, (Method[]) null);
            }
            A0J.putAll(r0.A00);
        }
        for (Class cls2 : cls.getInterfaces()) {
            AnonymousClass0WR r02 = (AnonymousClass0WR) r12.A00.get(cls2);
            if (r02 == null) {
                r02 = A00(r12, cls2, (Method[]) null);
            }
            Iterator A0y = AnonymousClass000.A0y(r02.A00);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A01((AnonymousClass0UJ) A11.getKey(), (AnonymousClass05R) A11.getValue(), cls, A0J);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(AnonymousClass012.class)) {
                    i = 1;
                } else {
                    throw AnonymousClass001.A08("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AnonymousClass05R value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AnonymousClass05R.class)) {
                        throw AnonymousClass001.A08("invalid parameter type. second arg must be an event");
                    } else if (value == AnonymousClass05R.ON_ANY) {
                        i = 2;
                        if (length > 2) {
                            throw AnonymousClass001.A08("cannot have more than 2 params");
                        }
                    } else {
                        throw AnonymousClass001.A08("Second arg is supported only for ON_ANY value");
                    }
                }
                A01(new AnonymousClass0UJ(method, i), value, cls, A0J);
                z = true;
            }
        }
        AnonymousClass0WR r2 = new AnonymousClass0WR(A0J);
        r12.A00.put(cls, r2);
        r12.A01.put(cls, Boolean.valueOf(z));
        return r2;
    }

    public static void A01(AnonymousClass0UJ r4, AnonymousClass05R r5, Class cls, Map map) {
        Object obj = map.get(r4);
        if (obj == null) {
            map.put(r4, r5);
        } else if (r5 != obj) {
            Method method = r4.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Method ");
            A0u.append(method.getName());
            A0u.append(" in ");
            A0u.append(cls.getName());
            A0u.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A0u.append(obj);
            throw AnonymousClass001.A08(AnonymousClass000.A0l(r5, ", new value ", A0u));
        }
    }
}
