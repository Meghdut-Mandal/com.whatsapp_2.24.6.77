package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: X.0Xn  reason: invalid class name and case insensitive filesystem */
public abstract class C07400Xn {
    public static Map A00 = AnonymousClass001.A0J();
    public static Map A01 = AnonymousClass001.A0J();

    public static void A01(Object obj, Constructor constructor) {
        try {
            constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw AnonymousClass001.A0B(e);
        } catch (InstantiationException e2) {
            throw AnonymousClass001.A0B(e2);
        } catch (InvocationTargetException e3) {
            throw AnonymousClass001.A0B(e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r0.booleanValue() != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.Class r10) {
        /*
            java.util.Map r5 = A01
            java.lang.Object r0 = r5.get(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000f
            int r0 = r0.intValue()
            return r0
        L_0x000f:
            java.lang.String r0 = r10.getCanonicalName()
            r6 = 1
            if (r0 == 0) goto L_0x0090
            java.lang.Package r0 = r10.getPackage()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r7 = r10.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r4 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
        L_0x0024:
            boolean r3 = r4.isEmpty()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            if (r3 != 0) goto L_0x0034
            int r0 = r4.length()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            int r0 = r0 + 1
            java.lang.String r7 = r7.substring(r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
        L_0x0034:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r2 = "."
            java.lang.String r0 = "_"
            java.lang.String r0 = r7.replace(r2, r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            goto L_0x004d
        L_0x004a:
            java.lang.String r4 = ""
            goto L_0x0024
        L_0x004d:
            if (r3 != 0) goto L_0x0057
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r4)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r1 = X.AnonymousClass000.A0p(r2, r1, r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
        L_0x0057:
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            r0 = 0
            r1[r0] = r10     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            boolean r0 = r2.isAccessible()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            if (r0 != 0) goto L_0x006d
            r2.setAccessible(r6)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
        L_0x006d:
            java.util.Map r1 = A00
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.put(r10, r0)
            goto L_0x0111
        L_0x0078:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x007e:
            X.0YV r9 = X.AnonymousClass0YV.A02
            java.util.Map r8 = r9.A01
            java.lang.Object r0 = r8.get(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ba
        L_0x0090:
            r1 = 1
        L_0x0091:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r10, r0)
            return r1
        L_0x0099:
            java.lang.reflect.Method[] r7 = r10.getDeclaredMethods()     // Catch:{ NoClassDefFoundError -> 0x0114 }
            int r4 = r7.length
            r3 = 0
            r2 = 0
        L_0x00a0:
            if (r2 >= r4) goto L_0x00b3
            r1 = r7[r2]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r0 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L_0x00b0
            X.AnonymousClass0YV.A00(r9, r10, r7)
            goto L_0x0090
        L_0x00b0:
            int r2 = r2 + 1
            goto L_0x00a0
        L_0x00b3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r8.put(r10, r0)
        L_0x00ba:
            java.lang.Class r1 = r10.getSuperclass()
            r7 = 0
            if (r1 == 0) goto L_0x00dc
            java.lang.Class<X.00N> r0 = X.AnonymousClass00N.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00dc
            int r0 = A00(r1)
            if (r0 == r6) goto L_0x0090
            java.util.Map r0 = A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
        L_0x00dc:
            java.lang.Class[] r4 = r10.getInterfaces()
            int r3 = r4.length
            r2 = 0
        L_0x00e2:
            if (r2 >= r3) goto L_0x010a
            r1 = r4[r2]
            if (r1 == 0) goto L_0x0107
            java.lang.Class<X.00N> r0 = X.AnonymousClass00N.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0107
            int r0 = A00(r1)
            if (r0 == r6) goto L_0x0090
            if (r7 != 0) goto L_0x00fc
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
        L_0x00fc:
            java.util.Map r0 = A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.addAll(r0)
        L_0x0107:
            int r2 = r2 + 1
            goto L_0x00e2
        L_0x010a:
            if (r7 == 0) goto L_0x0090
            java.util.Map r0 = A00
            r0.put(r10, r7)
        L_0x0111:
            r1 = 2
            goto L_0x0091
        L_0x0114:
            r2 = move-exception
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07400Xn.A00(java.lang.Class):int");
    }
}
