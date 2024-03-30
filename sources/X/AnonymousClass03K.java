package X;

/* renamed from: X.03K  reason: invalid class name */
public abstract class AnonymousClass03K {
    public static final AnonymousClass03P A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|29|30) */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000d }
            if (r0 == 0) goto L_0x000d
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
        L_0x000d:
            r2 = 0
            if (r1 == 0) goto L_0x0075
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r5 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            boolean r0 = X.AnonymousClass03M.A00     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x001f
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ all -> 0x00c3 }
            java.util.List r3 = A01(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x008b
        L_0x001f:
            r0 = 2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x006c }
            r3.<init>(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r4 = 0
            r7 = 1
            r6 = 0
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0049 }
            java.lang.Class r1 = java.lang.Class.forName(r1, r7, r0)     // Catch:{ ClassNotFoundException -> 0x0049 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0049 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0049 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0049 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0049 }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ ClassNotFoundException -> 0x0049 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x0049 }
            if (r0 == 0) goto L_0x0049
            r3.add(r0)     // Catch:{ all -> 0x006c }
        L_0x0049:
            java.lang.String r1 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.Class r1 = java.lang.Class.forName(r1, r7, r0)     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ ClassNotFoundException -> 0x0066 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x0066 }
            r4 = r0
        L_0x0066:
            if (r4 == 0) goto L_0x008b
            r3.add(r4)     // Catch:{ all -> 0x006c }
            goto L_0x008b
        L_0x006c:
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ all -> 0x00c3 }
            java.util.List r3 = A01(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x008b
        L_0x0075:
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r1 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ all -> 0x00c3 }
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c3 }
            X.0iY r0 = X.C15080mf.A05(r0)     // Catch:{ all -> 0x00c3 }
            java.util.List r3 = X.C15060md.A00(r0)     // Catch:{ all -> 0x00c3 }
        L_0x008b:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x009f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x00a4
        L_0x009f:
            kotlinx.coroutines.android.AndroidDispatcherFactory r2 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r2     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00bc
            goto L_0x00ae
        L_0x00a4:
            r1.next()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x009f
        L_0x00ae:
            X.03P r2 = r2.createDispatcher(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x00ca
        L_0x00b3:
            r1 = move-exception
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            X.0n6 r2 = new X.0n6     // Catch:{ all -> 0x00c3 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x00ca
        L_0x00bc:
            r0 = 0
            X.0n6 r2 = new X.0n6     // Catch:{ all -> 0x00c3 }
            r2.<init>(r0, r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x00ca
        L_0x00c3:
            r1 = move-exception
            r0 = 0
            X.0n6 r2 = new X.0n6
            r2.<init>(r0, r1)
        L_0x00ca:
            A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03K.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r0 <= 0) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r4.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.io.BufferedReader r5) {
        /*
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
        L_0x0005:
            java.lang.String r2 = r5.readLine()
            if (r2 != 0) goto L_0x0010
            java.util.List r0 = X.C007103b.A0Y(r4)
            return r0
        L_0x0010:
            java.lang.String r0 = "#"
            r3 = 0
            int r1 = X.AnonymousClass099.A0C(r2, r0, r3, r3)
            r0 = -1
            if (r1 == r0) goto L_0x0021
            java.lang.String r2 = r2.substring(r3, r1)
            X.AnonymousClass00C.A08(r2)
        L_0x0021:
            java.lang.CharSequence r0 = X.AnonymousClass099.A0D(r2)
            java.lang.String r2 = r0.toString()
        L_0x0029:
            int r0 = r2.length()
            if (r3 >= r0) goto L_0x0057
            char r1 = r2.charAt(r3)
            r0 = 46
            if (r1 == r0) goto L_0x0054
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L_0x0054
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Illegal service provider class name: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0057:
            if (r0 <= 0) goto L_0x0005
            r4.add(r2)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03K.A00(java.io.BufferedReader):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.AnonymousClass0VY.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b5, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(java.lang.ClassLoader r8) {
        /*
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r4 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r1.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "META-INF/services/"
            r1.append(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0127 }
            r1.append(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0127 }
            java.util.Enumeration r0 = r8.getResources(r0)     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ all -> 0x0127 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0127 }
            r5.<init>()     // Catch:{ all -> 0x0127 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0127 }
        L_0x002b:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0127 }
            java.net.URL r1 = (java.net.URL) r1     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "jar"
            r6 = 0
            boolean r0 = X.AnonymousClass098.A07(r3, r0, r6)     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "jar:file:"
            java.lang.String r2 = X.AnonymousClass099.A0I(r3, r0, r3)     // Catch:{ all -> 0x0127 }
            r0 = 33
            int r1 = X.AnonymousClass099.A09(r2, r0, r6, r6)     // Catch:{ all -> 0x0127 }
            r0 = -1
            if (r1 == r0) goto L_0x005a
            java.lang.String r2 = r2.substring(r6, r1)     // Catch:{ all -> 0x0127 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x0127 }
        L_0x005a:
            java.lang.String r0 = "!/"
            java.lang.String r1 = X.AnonymousClass099.A0I(r3, r0, r3)     // Catch:{ all -> 0x0127 }
            java.util.jar.JarFile r3 = new java.util.jar.JarFile     // Catch:{ all -> 0x0127 }
            r3.<init>(r2, r6)     // Catch:{ all -> 0x0127 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a7 }
            java.io.InputStream r2 = r3.getInputStream(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a7 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00a7 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x00a7 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a7 }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x00a0 }
            r2.close()     // Catch:{ all -> 0x00a7 }
            r3.close()     // Catch:{ all -> 0x009e }
            goto L_0x009a
        L_0x0085:
            java.io.InputStream r1 = r1.openStream()     // Catch:{ all -> 0x0127 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0127 }
            r0.<init>(r1)     // Catch:{ all -> 0x0127 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0127 }
            r2.<init>(r0)     // Catch:{ all -> 0x0127 }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x00b3 }
            r2.close()     // Catch:{ all -> 0x0127 }
        L_0x009a:
            X.AnonymousClass03Y.A0B(r0, r5)     // Catch:{ all -> 0x0127 }
            goto L_0x002b
        L_0x009e:
            r2 = move-exception
            goto L_0x00b2
        L_0x00a0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00ae }
            goto L_0x0126
        L_0x00ae:
            r0 = move-exception
            X.AnonymousClass0VY.A01(r2, r0)     // Catch:{ all -> 0x0127 }
        L_0x00b2:
            throw r2     // Catch:{ all -> 0x0127 }
        L_0x00b3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0126
        L_0x00ba:
            java.util.Set r1 = X.C007103b.A0f(r5)     // Catch:{ all -> 0x0127 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0127 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0100
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0127 }
            r6.<init>(r0)     // Catch:{ all -> 0x0127 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0127 }
        L_0x00d5:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0127 }
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r8)     // Catch:{ all -> 0x0127 }
            boolean r0 = r4.isAssignableFrom(r2)     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0108
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0127 }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r0)     // Catch:{ all -> 0x0127 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0127 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0127 }
            java.lang.Object r0 = r4.cast(r0)     // Catch:{ all -> 0x0127 }
            r6.add(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x00d5
        L_0x0100:
            java.lang.String r0 = "No providers were loaded with FastServiceLoader"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0127 }
            r1.<init>(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0126
        L_0x0108:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r1.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "Expected service of class "
            r1.append(r0)     // Catch:{ all -> 0x0127 }
            r1.append(r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = ", but found "
            r1.append(r0)     // Catch:{ all -> 0x0127 }
            r1.append(r2)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0127 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0127 }
            r1.<init>(r0)     // Catch:{ all -> 0x0127 }
        L_0x0126:
            throw r1     // Catch:{ all -> 0x0127 }
        L_0x0127:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r4, r8)
            java.util.List r6 = X.C007103b.A0Y(r0)
        L_0x012f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03K.A01(java.lang.ClassLoader):java.util.List");
    }
}
