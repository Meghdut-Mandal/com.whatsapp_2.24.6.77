package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: X.9hv  reason: invalid class name and case insensitive filesystem */
public abstract class C200669hv {
    public static boolean A00;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00f6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.net.SSLSessionCache r12, java.lang.String r13, javax.net.ssl.SSLContext r14, int r15) {
        /*
            java.lang.String r2 = "sslParameters"
            boolean r0 = A00
            if (r0 != 0) goto L_0x0148
            if (r12 == 0) goto L_0x0148
            r3 = 1
            java.lang.Class r1 = r12.getClass()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0076 }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r5 = r0.get(r12)     // Catch:{ Exception -> 0x0076 }
            java.lang.Class r6 = r5.getClass()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = "getSessionData"
            r7 = 2
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0076 }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r9 = 0
            r1[r9] = r11     // Catch:{ Exception -> 0x0076 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0076 }
            java.lang.reflect.Method r1 = X.AnonymousClass001.A0G(r6, r0, r4, r1, r3)     // Catch:{ Exception -> 0x0076 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r10 = X.C165617ti.A0X(r13, r0, r9, r15)     // Catch:{ Exception -> 0x0076 }
            r0[r3] = r10     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r8 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x0076 }
            byte[] r8 = (byte[]) r8     // Catch:{ Exception -> 0x0076 }
            if (r8 == 0) goto L_0x0086
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0076 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x0076 }
            java.lang.Class r6 = r0.getSuperclass()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = "toSession"
            r5 = 3
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0076 }
            java.lang.Class<byte[]> r0 = byte[].class
            r1[r9] = r0     // Catch:{ Exception -> 0x0076 }
            r1[r3] = r11     // Catch:{ Exception -> 0x0076 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0076 }
            r1[r7] = r0     // Catch:{ Exception -> 0x0076 }
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r4, r1)     // Catch:{ Exception -> 0x0076 }
            r4.setAccessible(r3)     // Catch:{ Exception -> 0x0076 }
            javax.net.ssl.SSLSessionContext r1 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0076 }
            java.lang.Object[] r0 = X.C36431kI.A1a(r8, r13, r5)     // Catch:{ Exception -> 0x0076 }
            r0[r7] = r10     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r0 = r4.invoke(r1, r0)     // Catch:{ Exception -> 0x0076 }
            javax.net.ssl.SSLSession r0 = (javax.net.ssl.SSLSession) r0     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0086
            A02(r0)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0086
        L_0x0076:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SSLSessionCacheHack:"
            java.lang.String r0 = X.C90494aF.A0c(r4, r0, r1)
            X.C36321k7.A1a(r1, r0)
            A00 = r3
        L_0x0086:
            java.lang.Class r1 = r12.getClass()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0138 }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0138 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0138 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "getSession"
            r7 = 2
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0138 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r6 = 0
            r1[r6] = r10     // Catch:{ Exception -> 0x0138 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0138 }
            java.lang.reflect.Method r4 = X.AnonymousClass001.A0G(r5, r0, r4, r1, r3)     // Catch:{ Exception -> 0x0138 }
            javax.net.ssl.SSLSessionContext r1 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0138 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0138 }
            java.lang.Integer r9 = X.C165617ti.A0X(r13, r0, r6, r15)     // Catch:{ Exception -> 0x0138 }
            r0[r3] = r9     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r1 = r4.invoke(r1, r0)     // Catch:{ Exception -> 0x0138 }
            javax.net.ssl.SSLSession r1 = (javax.net.ssl.SSLSession) r1     // Catch:{ Exception -> 0x0138 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0138 }
            r0.getSessionTimeout()     // Catch:{ Exception -> 0x0138 }
            if (r1 == 0) goto L_0x00c9
            A02(r1)     // Catch:{ Exception -> 0x0138 }
        L_0x00c9:
            java.lang.Class r1 = r14.getClass()     // Catch:{ NoSuchFieldException -> 0x00d4 }
            java.lang.String r0 = "contextSpi"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x00d4 }
            goto L_0x00de
        L_0x00d4:
            java.lang.Class r1 = r14.getClass()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r0 = "spiImpl"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0138 }
        L_0x00de:
            if (r0 == 0) goto L_0x0135
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r1 = r0.get(r14)     // Catch:{ Exception -> 0x0138 }
            if (r1 == 0) goto L_0x0148
            java.lang.Class r0 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x00f6 }
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ NoSuchFieldException -> 0x00f6 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x00f6 }
            goto L_0x00fe
        L_0x00f6:
            java.lang.Class r0 = r1.getClass()     // Catch:{ Exception -> 0x0138 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0138 }
        L_0x00fe:
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r8 = r0.get(r1)     // Catch:{ Exception -> 0x0138 }
            java.lang.Class r5 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x0135 }
            java.lang.String r2 = "getCachedClientSession"
            r4 = 3
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0135 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ NoSuchMethodException -> 0x0135 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x0135 }
            r1[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0135 }
            r1[r3] = r10     // Catch:{ NoSuchMethodException -> 0x0135 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0135 }
            r1[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0135 }
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0135 }
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0138 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0138 }
            r1[r6] = r0     // Catch:{ Exception -> 0x0138 }
            r1[r3] = r13     // Catch:{ Exception -> 0x0138 }
            r1[r7] = r9     // Catch:{ Exception -> 0x0138 }
            r2.invoke(r8, r1)     // Catch:{ Exception -> 0x0138 }
            return
        L_0x0135:
            A00 = r3     // Catch:{ Exception -> 0x0138 }
            return
        L_0x0138:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SSLSessionCacheHack:"
            java.lang.String r0 = X.C90494aF.A0c(r2, r0, r1)
            X.C36341k9.A1O(r1, r0)
            A00 = r3
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200669hv.A00(android.net.SSLSessionCache, java.lang.String, javax.net.ssl.SSLContext, int):void");
    }

    public static void A01(SSLSessionCache sSLSessionCache, SSLContext sSLContext) {
        String A0q;
        if (sSLContext.getClientSessionContext() == null) {
            A0q = "SSLSessionCacheHack/session context is null";
        } else if (!C90484aE.A0k(sSLContext.getClientSessionContext()).equals("ClientSessionContext")) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SSLSessionCacheHack/session context does not match, class=");
            A0q = AnonymousClass000.A0q(AnonymousClass000.A0k(sSLContext.getClientSessionContext()), A0u);
        } else {
            try {
                Field declaredField = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(sSLSessionCache);
                AnonymousClass001.A0G(sSLContext.getClientSessionContext().getClass(), Class.forName("com.android.org.conscrypt.SSLClientSessionCache"), "setPersistentCache", new Class[1], 0).invoke(sSLContext.getClientSessionContext(), new Object[]{obj});
                return;
            } catch (ClassNotFoundException e) {
                e.toString();
                return;
            } catch (Exception e2) {
                C36321k7.A1Z(AnonymousClass000.A0v("SSLSessionCacheHack:"), e2.toString());
                return;
            }
        }
        Log.w(A0q);
    }

    public static void A02(SSLSession sSLSession) {
        long j;
        try {
            j = (long) sSLSession.getPeerCertificates().length;
        } catch (SSLPeerUnverifiedException e) {
            Log.e((Throwable) e);
            j = -1;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("age=");
        A0u.append(C36391kE.A0B(System.currentTimeMillis() - sSLSession.getCreationTime()));
        A0u.append(", creation=");
        A0u.append(sSLSession.getCreationTime());
        A0u.append(", protocol=");
        A0u.append(sSLSession.getProtocol());
        A0u.append(", valid=");
        A0u.append(sSLSession.isValid());
        A0u.append(", peerCertificateCount=");
        A0u.append(j);
        A0u.toString();
    }
}
