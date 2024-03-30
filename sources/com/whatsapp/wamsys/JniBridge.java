package com.whatsapp.wamsys;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass10R;
import X.AnonymousClass13B;
import X.AnonymousClass13C;
import X.AnonymousClass13D;
import X.AnonymousClass148;
import X.AnonymousClass189;
import X.AnonymousClass19A;
import X.AnonymousClass19J;
import X.AnonymousClass33P;
import X.AnonymousClass33Q;
import X.AnonymousClass33S;
import X.AnonymousClass33U;
import X.AnonymousClass33V;
import X.AnonymousClass33W;
import X.AnonymousClass3LH;
import X.AnonymousClass3NE;
import X.AnonymousClass3NF;
import X.AnonymousClass5u3;
import X.AnonymousClass5u4;
import X.AnonymousClass6EU;
import X.AnonymousClass6EZ;
import X.AnonymousClass9HA;
import X.AnonymousClass9KB;
import X.C000100b;
import X.C100004uJ;
import X.C119005p5;
import X.C170918Hz;
import X.C18740tg;
import X.C18950u5;
import X.C192009Fi;
import X.C192019Fj;
import X.C197269bP;
import X.C197799cO;
import X.C198519dh;
import X.C19970wo;
import X.C20270xI;
import X.C21010yW;
import X.C220912v;
import X.C223313w;
import X.C22934Ayk;
import X.C234618o;
import X.C593633q;
import com.facebook.msys.mcf.MsysError;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.ProtocolJniHelper;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class JniBridge implements C000100b {
    public static AnonymousClass10R DEPENDENCIES;
    public static volatile JniBridge INSTANCE;
    public final AnonymousClass13D jniBridgeExceptionHandler;
    public C220912v jniCallbacksIJniCallbacks;
    public AnonymousClass13C jniCallbacksIJniCallbacksAndroidGpia;
    public AnonymousClass13B jniCallbacksIJniCallbacksAndroidRegistration;
    public final AtomicReference wajContext = new AtomicReference();

    public static long jnidispatchIIOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj6;
            String str = (String) obj;
            Map map = (Map) obj4;
            Map map2 = (Map) obj5;
            AnonymousClass3LH r4 = (AnonymousClass3LH) obj3;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r4.A0B(str, map, map2, i2, i);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019b, code lost:
        INSTANCE.jniBridgeExceptionHandler.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a2, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchO(int r16) {
        /*
            r8 = 0
            r1 = r16
            if (r16 == 0) goto L_0x00bc
            r0 = 1
            if (r1 == r0) goto L_0x0009
            return r8
        L_0x0009:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x019a }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x019a }
            X.005 r0 = r0.A09     // Catch:{ Exception -> 0x019a }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x019a }
            X.640 r3 = (X.AnonymousClass640) r3     // Catch:{ Exception -> 0x019a }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x019a }
            r5.<init>()     // Catch:{ Exception -> 0x019a }
            X.1VS r0 = r3.A02     // Catch:{ Exception -> 0x019a }
            X.3QR r2 = r0.A00()     // Catch:{ Exception -> 0x019a }
            boolean r0 = r0.A02()     // Catch:{ Exception -> 0x019a }
            if (r0 == 0) goto L_0x004d
            if (r2 == 0) goto L_0x004d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019a }
            r1.<init>()     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = X.AnonymousClass6JD.A0O     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = r2.A03     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            int r0 = r2.A01     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = X.AnonymousClass6JD.A0T     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x019a }
            r5.add(r0)     // Catch:{ Exception -> 0x019a }
        L_0x004d:
            X.0yC r2 = r3.A01     // Catch:{ Exception -> 0x019a }
            r1 = 4020(0xfb4, float:5.633E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ Exception -> 0x019a }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ Exception -> 0x019a }
            if (r0 == 0) goto L_0x00bb
            X.1BS r0 = r3.A03     // Catch:{ Exception -> 0x019a }
            X.AnonymousClass1BS.A06(r0)     // Catch:{ Exception -> 0x019a }
            X.5yq r0 = r0.A0B()     // Catch:{ Exception -> 0x019a }
            if (r0 == 0) goto L_0x00bb
            java.util.List r0 = r0.A0A     // Catch:{ Exception -> 0x019a }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x019a }
        L_0x006a:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x019a }
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x019a }
            X.65F r3 = (X.AnonymousClass65F) r3     // Catch:{ Exception -> 0x019a }
            java.util.Set r0 = r3.A0B     // Catch:{ Exception -> 0x019a }
            if (r0 == 0) goto L_0x0080
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x019a }
            if (r0 != 0) goto L_0x006a
        L_0x0080:
            java.lang.String r2 = r3.A05     // Catch:{ Exception -> 0x019a }
            if (r2 == 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019a }
            r1.<init>()     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = X.AnonymousClass6JD.A0O     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            r1.append(r2)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = X.AnonymousClass6JD.A0T     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x019a }
            r5.add(r0)     // Catch:{ Exception -> 0x019a }
        L_0x009d:
            java.lang.String r2 = r3.A01     // Catch:{ Exception -> 0x019a }
            if (r2 == 0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019a }
            r1.<init>()     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = X.AnonymousClass6JD.A0O     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            r1.append(r2)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = X.AnonymousClass6JD.A0T     // Catch:{ Exception -> 0x019a }
            r1.append(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x019a }
            r5.add(r0)     // Catch:{ Exception -> 0x019a }
            goto L_0x006a
        L_0x00bb:
            return r5
        L_0x00bc:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x019a }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x019a }
            X.005 r0 = r0.A0G     // Catch:{ Exception -> 0x019a }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x019a }
            X.9KB r0 = (X.AnonymousClass9KB) r0     // Catch:{ Exception -> 0x019a }
            X.0yI r3 = r0.A00     // Catch:{ Exception -> 0x019a }
            java.util.ArrayList r1 = X.AnonymousClass1M3.A00()     // Catch:{ Exception -> 0x019a }
            monitor-enter(r3)     // Catch:{ Exception -> 0x019a }
            java.util.HashMap r0 = r3.A01     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x00d9
            java.util.HashMap r0 = r3.A04()     // Catch:{ all -> 0x0197 }
            r3.A01 = r0     // Catch:{ all -> 0x0197 }
        L_0x00d9:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0197 }
            r2.<init>()     // Catch:{ all -> 0x0197 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0197 }
        L_0x00e2:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x011d
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0197 }
            X.9K9 r4 = (X.AnonymousClass9K9) r4     // Catch:{ all -> 0x0197 }
            java.util.HashMap r0 = r3.A01     // Catch:{ all -> 0x0197 }
            int r12 = r4.A00     // Catch:{ all -> 0x0197 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0197 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0117
            java.util.HashMap r0 = r3.A01     // Catch:{ all -> 0x0197 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0197 }
            X.9MX r0 = (X.AnonymousClass9MX) r0     // Catch:{ all -> 0x0197 }
            int r13 = r4.A01     // Catch:{ all -> 0x0197 }
            java.lang.String r10 = r4.A02     // Catch:{ all -> 0x0197 }
            long r15 = r0.A02     // Catch:{ all -> 0x0197 }
            int r14 = r0.A00     // Catch:{ all -> 0x0197 }
            java.lang.String r11 = r0.A03     // Catch:{ all -> 0x0197 }
            X.9NB r9 = new X.9NB     // Catch:{ all -> 0x0197 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0197 }
            r2.add(r9)     // Catch:{ all -> 0x0197 }
            goto L_0x00e2
        L_0x0117:
            java.lang.String r0 = "psidstore/getAllRecords ps-id key not exist in memory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0197 }
            goto L_0x00e2
        L_0x011d:
            monitor-exit(r3)     // Catch:{ Exception -> 0x019a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x019a }
            r4.<init>()     // Catch:{ Exception -> 0x019a }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ Exception -> 0x019a }
        L_0x0127:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x019a }
            if (r0 == 0) goto L_0x0196
            java.lang.Object r6 = r7.next()     // Catch:{ Exception -> 0x019a }
            X.9NB r6 = (X.AnonymousClass9NB) r6     // Catch:{ Exception -> 0x019a }
            r0 = 6
            X.011[] r5 = new X.AnonymousClass011[r0]     // Catch:{ Exception -> 0x019a }
            r3 = 0
            int r0 = r6.A01     // Catch:{ Exception -> 0x019a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r1 = "psIdKey"
            X.011 r0 = new X.011     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x019a }
            r5[r3] = r0     // Catch:{ Exception -> 0x019a }
            r3 = 1
            int r0 = r6.A02     // Catch:{ Exception -> 0x019a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r1 = "rotationPeriodDays"
            X.011 r0 = new X.011     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x019a }
            r5[r3] = r0     // Catch:{ Exception -> 0x019a }
            r3 = 2
            java.lang.String r2 = r6.A04     // Catch:{ Exception -> 0x019a }
            java.lang.String r1 = "psIdKeyString"
            X.011 r0 = new X.011     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x019a }
            r5[r3] = r0     // Catch:{ Exception -> 0x019a }
            r3 = 3
            long r0 = r6.A03     // Catch:{ Exception -> 0x019a }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r1 = "lastRotationTimeUtcDay"
            X.011 r0 = new X.011     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x019a }
            r5[r3] = r0     // Catch:{ Exception -> 0x019a }
            r3 = 4
            int r0 = r6.A00     // Catch:{ Exception -> 0x019a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x019a }
            java.lang.String r1 = "beaconEvtNumber"
            X.011 r0 = new X.011     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x019a }
            r5[r3] = r0     // Catch:{ Exception -> 0x019a }
            r3 = 5
            java.lang.String r2 = r6.A05     // Catch:{ Exception -> 0x019a }
            java.lang.String r1 = "uuid"
            X.011 r0 = new X.011     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x019a }
            r5[r3] = r0     // Catch:{ Exception -> 0x019a }
            java.util.LinkedHashMap r0 = X.C000400e.A07(r5)     // Catch:{ Exception -> 0x019a }
            r4.add(r0)     // Catch:{ Exception -> 0x019a }
            goto L_0x0127
        L_0x0196:
            return r4
        L_0x0197:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x019a }
            throw r0     // Catch:{ Exception -> 0x019a }
        L_0x019a:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchO(int):java.lang.Object");
    }

    public static Object jnidispatchOI(long j) {
        try {
            byte[] bArr = new byte[((int) j)];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return bArr;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return null;
        }
    }

    public static Object jnidispatchOIO(int i, long j, Object obj) {
        if (i == 0) {
            int i2 = (int) j;
            byte[] A02 = ((AnonymousClass33V) INSTANCE.jniCallbacksIJniCallbacks.A0E.get()).A00.A0C.A02(i2);
            if (A02 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("no signed prekey available with id ");
                sb.append(i2);
                Log.e(sb.toString());
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("axolotl loaded a signed pre key with id ");
                sb2.append(i2);
                Log.i(sb2.toString());
                C170918Hz.A08(C100004uJ.DEFAULT_INSTANCE, A02);
                return A02;
            } catch (IOException e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("failed to parse signed pre key record during load for id ");
                sb3.append(i2);
                Log.e(sb3.toString(), e);
                return null;
            }
        } else if (i == 1) {
            int i3 = (int) j;
            C234618o r3 = ((AnonymousClass33S) INSTANCE.jniCallbacksIJniCallbacks.A08.get()).A00.A09;
            byte[] A04 = r3.A04(i3);
            if (A04 == null) {
                return null;
            }
            try {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("axolotl found a pre key with id ");
                sb4.append(i3);
                Log.i(sb4.toString());
                AnonymousClass189.A00(A04, i3);
                return A04;
            } catch (IOException e2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("error reading prekey ");
                sb5.append(i3);
                sb5.append("; deleting");
                Log.e(sb5.toString(), e2);
                r3.A02(i3);
                return null;
            }
        } else if (i != 2) {
            return null;
        } else {
            try {
                int i4 = (int) j;
                AnonymousClass33S r0 = (AnonymousClass33S) INSTANCE.jniCallbacksIJniCallbacks.A08.get();
                if (i4 <= 0) {
                    return null;
                }
                ArrayList A01 = r0.A00.A09.A01();
                HashMap hashMap = new HashMap();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    C593633q r2 = (C593633q) it.next();
                    hashMap.put(Integer.valueOf(r2.A00), r2.A01);
                    if (hashMap.size() == i4) {
                        return hashMap;
                    }
                }
                return hashMap;
            } catch (Exception e3) {
                INSTANCE.jniBridgeExceptionHandler.A00(e3);
                return null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        return r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchOIOO(int r6, long r7, java.lang.Object r9, java.lang.Object r10) {
        /*
            r1 = 0
            if (r6 == 0) goto L_0x0078
            r0 = 1
            if (r6 == r0) goto L_0x0056
            r0 = 2
            if (r6 == r0) goto L_0x000a
            return r1
        L_0x000a:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00da }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00da }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00da }
            int r2 = (int) r7     // Catch:{ Exception -> 0x00da }
            X.005 r0 = r0.A0C     // Catch:{ Exception -> 0x00da }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x00da }
            X.9cO r6 = (X.C197799cO) r6     // Catch:{ Exception -> 0x00da }
            X.6EZ r5 = A00(r9, r2)     // Catch:{ Exception -> 0x00da }
            X.18a r4 = r6.A00     // Catch:{ Exception -> 0x00da }
            monitor-enter(r4)     // Catch:{ Exception -> 0x00da }
            X.9eC r0 = r4.A00(r5)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x002c
            byte[] r3 = r0.A00()     // Catch:{ all -> 0x0053 }
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            goto L_0x0050
        L_0x002c:
            X.189 r0 = r6.A01     // Catch:{ all -> 0x0053 }
            X.18e r0 = r0.A0B     // Catch:{ all -> 0x0053 }
            byte[] r2 = r0.A04(r5)     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r2 != 0) goto L_0x0040
            X.9eC r0 = new X.9eC     // Catch:{ all -> 0x0053 }
            r0.<init>()     // Catch:{ all -> 0x0053 }
            r4.A03(r0, r5)     // Catch:{ all -> 0x0053 }
            goto L_0x002a
        L_0x0040:
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x004c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004c }
            X.AnonymousClass189.A02(r0)     // Catch:{ IOException -> 0x004c }
            r4.A03(r0, r5)     // Catch:{ IOException -> 0x004c }
            goto L_0x0051
        L_0x004c:
            X.C197799cO.A00(r5, r6)     // Catch:{ all -> 0x0053 }
            goto L_0x002a
        L_0x0050:
            return r3
        L_0x0051:
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            return r2
        L_0x0053:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ Exception -> 0x00da }
        L_0x0056:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00da }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00da }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00da }
            int r2 = (int) r7     // Catch:{ Exception -> 0x00da }
            X.005 r0 = r0.A07     // Catch:{ Exception -> 0x00da }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00da }
            X.33R r0 = (X.AnonymousClass33R) r0     // Catch:{ Exception -> 0x00da }
            X.6EZ r2 = A00(r9, r2)     // Catch:{ Exception -> 0x00da }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x00da }
            X.3FZ r0 = r0.A0B(r2)     // Catch:{ Exception -> 0x00da }
            if (r0 == 0) goto L_0x00d8
            X.3IG r0 = r0.A00     // Catch:{ Exception -> 0x00da }
            byte[] r0 = r0.A00()     // Catch:{ Exception -> 0x00da }
            return r0
        L_0x0078:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00da }
            int r0 = (int) r7     // Catch:{ Exception -> 0x00da }
            X.33a r10 = (X.C592033a) r10     // Catch:{ Exception -> 0x00da }
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0085;
                case 2: goto L_0x0088;
                case 3: goto L_0x008b;
                case 4: goto L_0x008e;
                case 5: goto L_0x0091;
                case 6: goto L_0x0094;
                case 7: goto L_0x0080;
                case 8: goto L_0x0097;
                case 9: goto L_0x009a;
                default: goto L_0x0080;
            }     // Catch:{ Exception -> 0x00da }
        L_0x0080:
            r0 = 0
            goto L_0x009c
        L_0x0082:
            X.1Gl r0 = X.C25471Gl.A0D     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x0085:
            X.1Gl r0 = X.C25471Gl.A0L     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x0088:
            X.1Gl r0 = X.C25471Gl.A05     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x008b:
            X.1Gl r0 = X.C25471Gl.A0A     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x008e:
            X.1Gl r0 = X.C25471Gl.A0i     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x0091:
            X.1Gl r0 = X.C25471Gl.A04     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x0094:
            X.1Gl r0 = X.C25471Gl.A0d     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x0097:
            X.1Gl r0 = X.C25471Gl.A0M     // Catch:{ Exception -> 0x00da }
            goto L_0x009c
        L_0x009a:
            X.1Gl r0 = X.C25471Gl.A0N     // Catch:{ Exception -> 0x00da }
        L_0x009c:
            X.1DF r3 = r10.A00     // Catch:{ Exception -> 0x00da }
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.A00     // Catch:{ Exception -> 0x00da }
        L_0x00a2:
            r2 = 0
            X.5x5 r4 = r3.A09(r9, r0, r2)     // Catch:{ Exception -> 0x00da }
            if (r4 == 0) goto L_0x00d2
            byte[] r5 = android.util.Base64.decode(r9, r2)     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = r4.A03     // Catch:{ Exception -> 0x00da }
            byte[] r6 = android.util.Base64.decode(r0, r2)     // Catch:{ Exception -> 0x00da }
            int r0 = r4.A00     // Catch:{ Exception -> 0x00da }
            X.1Gl r0 = X.AnonymousClass6Y1.A01(r1, r0, r2)     // Catch:{ Exception -> 0x00da }
            int r8 = X.C111945d6.A00(r0)     // Catch:{ Exception -> 0x00da }
            X.3Qj r0 = r4.A02     // Catch:{ Exception -> 0x00da }
            byte[] r7 = r0.A0a     // Catch:{ Exception -> 0x00da }
            long r9 = r0.A0D     // Catch:{ Exception -> 0x00da }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r2
            java.lang.String r3 = r0.A0J     // Catch:{ Exception -> 0x00da }
            java.lang.String r4 = r4.A04     // Catch:{ Exception -> 0x00da }
            X.3ND r2 = new X.3ND     // Catch:{ Exception -> 0x00da }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00da }
            goto L_0x00d3
        L_0x00d0:
            r0 = -1
            goto L_0x00a2
        L_0x00d2:
            r2 = 0
        L_0x00d3:
            if (r2 == 0) goto L_0x00d8
            com.facebook.simplejni.NativeHolder r0 = r2.A00     // Catch:{ Exception -> 0x00da }
            return r0
        L_0x00d8:
            r0 = 0
            return r0
        L_0x00da:
            r2 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchOIOO(int, long, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static Object jnidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        if (i == 0) {
            AnonymousClass9HA A03 = ((AnonymousClass33U) INSTANCE.jniCallbacksIJniCallbacks.A0B.get()).A00.A0A.A03(new AnonymousClass6EU(A00((String) obj2, (int) j), (String) obj));
            AnonymousClass3NF r4 = null;
            if (A03 != null) {
                try {
                    byte[] bArr = A03.A01;
                    long j2 = A03.A00;
                    new C197269bP(bArr);
                    r4 = new AnonymousClass3NF(bArr, j2);
                } catch (IOException e) {
                    Log.e("SenderKeyStoreImpl/loadSenderKeyImpl", e);
                }
            }
            if (r4 != null) {
                return r4.A00;
            }
            return null;
        } else if (i == 1) {
            C119005p5 A01 = ((AnonymousClass33Q) INSTANCE.jniCallbacksIJniCallbacks.A06.get()).A00.A06.A01(new AnonymousClass6EU(A00((String) obj2, (int) j), (String) obj));
            AnonymousClass3NE r3 = null;
            if (A01 != null) {
                try {
                    byte[] bArr2 = A01.A01;
                    new C198519dh(bArr2);
                    r3 = new AnonymousClass3NE(bArr2, A01.A00);
                } catch (IOException e2) {
                    Log.e("FastRatchetSenderKeyStoreImpl/loadFastRatchetSenderKeyImpl", e2);
                }
            }
            if (r3 != null) {
                return r3.A00;
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            try {
                byte b = (byte) ((int) j);
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).createKeyValue((String) obj, (String) obj2, obj3, b);
            } catch (Exception e3) {
                INSTANCE.jniBridgeExceptionHandler.A00(e3);
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0005, B:41:0x00dc] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchOO(int r7, java.lang.Object r8) {
        /*
            r6 = 0
            switch(r7) {
                case 0: goto L_0x0133;
                case 1: goto L_0x0179;
                case 2: goto L_0x0108;
                case 3: goto L_0x00e5;
                case 4: goto L_0x0005;
                case 5: goto L_0x0097;
                case 6: goto L_0x0086;
                case 7: goto L_0x006f;
                case 8: goto L_0x0058;
                case 9: goto L_0x0047;
                case 10: goto L_0x0036;
                case 11: goto L_0x0025;
                case 12: goto L_0x0166;
                default: goto L_0x0004;
            }
        L_0x0004:
            return r6
        L_0x0005:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A07     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            X.33R r0 = (X.AnonymousClass33R) r0     // Catch:{ Exception -> 0x0197 }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.18l r0 = r0.A07     // Catch:{ Exception -> 0x0197 }
            X.33p r0 = r0.A04()     // Catch:{ Exception -> 0x0197 }
            byte[] r2 = r0.A01     // Catch:{ Exception -> 0x0197 }
            byte[] r1 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.6JS r0 = new X.6JS     // Catch:{ Exception -> 0x0197 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0197 }
            com.facebook.simplejni.NativeHolder r0 = r0.A00     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0025:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = r0.getValueStringFromKeyValue(r8)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0036:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = r0.getKeyFromKeyValue(r8)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0047:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0197 }
            byte[] r0 = r0.getDataFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0058:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.Object[] r0 = r0.getChildrenFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0195
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x006f:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.Object[] r0 = r0.getAttributesFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0195
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0086:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = r0.getTagFromProtocolTreeNode(r8)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0097:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0E     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            X.33V r0 = (X.AnonymousClass33V) r0     // Catch:{ Exception -> 0x0197 }
            X.189 r1 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.18I r0 = r1.A0K     // Catch:{ Exception -> 0x0197 }
            X.79X r3 = r0.A07()     // Catch:{ Exception -> 0x0197 }
            X.18p r0 = r1.A0C     // Catch:{ all -> 0x00d9 }
            byte[] r1 = r0.A01()     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x00d1
            X.4uJ r0 = X.C100004uJ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x00c5 }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ IOException -> 0x00c5 }
            X.4uJ r0 = (X.C100004uJ) r0     // Catch:{ IOException -> 0x00c5 }
            if (r3 == 0) goto L_0x00c0
            r3.close()     // Catch:{ Exception -> 0x0197 }
        L_0x00c0:
            byte[] r0 = r0.A0o()     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x00c5:
            r2 = move-exception
            java.lang.String r0 = "failed to parse the latest signed prekey record"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00d9 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x00d9 }
            r1.<init>(r2)     // Catch:{ all -> 0x00d9 }
            goto L_0x00d8
        L_0x00d1:
            java.lang.String r0 = "no signed prekey record found"
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x00d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r1 = move-exception
            if (r3 == 0) goto L_0x00e4
            r3.close()     // Catch:{ all -> 0x00e0 }
            goto L_0x00e4
        L_0x00e0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0197 }
        L_0x00e4:
            throw r1     // Catch:{ Exception -> 0x0197 }
        L_0x00e5:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            byte[] r8 = (byte[]) r8     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A04     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x0197 }
            X.5oO r2 = (X.C118585oO) r2     // Catch:{ Exception -> 0x0197 }
            boolean r0 = X.C19550w8.A01()     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0195
            if (r8 == 0) goto L_0x0195
            X.134 r1 = r2.A01     // Catch:{ Exception -> 0x0197 }
            X.130 r0 = r2.A00     // Catch:{ Exception -> 0x0197 }
            byte[] r0 = r0.A0J()     // Catch:{ Exception -> 0x0197 }
            byte[] r0 = r1.A06(r8, r0)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0108:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            X.12z r0 = r0.A02     // Catch:{ Exception -> 0x0197 }
            X.130 r0 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.AZA r0 = r0.A0E()     // Catch:{ Exception -> 0x0197 }
            X.AZ7 r0 = r0.A01     // Catch:{ Exception -> 0x0197 }
            byte[] r1 = r0.A01     // Catch:{ Exception -> 0x0197 }
            int r2 = r1.length     // Catch:{ Exception -> 0x0197 }
            r0 = 32
            if (r2 == r0) goto L_0x0132
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197 }
            r1.<init>()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "AuthKeyStoreImpl/the key length is not expected/privateLength="
            r1.append(r0)     // Catch:{ Exception -> 0x0197 }
            r1.append(r2)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0197 }
            r1 = 0
        L_0x0132:
            return r1
        L_0x0133:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0197 }
            X.12w r1 = r0.A03     // Catch:{ Exception -> 0x0197 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0197 }
            r5 = 0
            if (r0 != 0) goto L_0x0165
            X.12x r2 = r1.A00     // Catch:{ UnknownHostException -> 0x0165 }
            r1 = 1
            r0 = 0
            X.6L6 r0 = r2.A02(r8, r1, r0)     // Catch:{ UnknownHostException -> 0x0165 }
            java.net.InetAddress[] r4 = r0.A04     // Catch:{ UnknownHostException -> 0x0165 }
            java.util.Arrays.toString(r4)     // Catch:{ UnknownHostException -> 0x0165 }
            int r3 = r4.length     // Catch:{ UnknownHostException -> 0x0165 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ UnknownHostException -> 0x0165 }
            r2.<init>()     // Catch:{ UnknownHostException -> 0x0165 }
            r1 = 0
        L_0x0156:
            if (r1 >= r3) goto L_0x0164
            r0 = r4[r1]     // Catch:{ UnknownHostException -> 0x0165 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0165 }
            r2.add(r0)     // Catch:{ UnknownHostException -> 0x0165 }
            int r1 = r1 + 1
            goto L_0x0156
        L_0x0164:
            return r2
        L_0x0165:
            return r5
        L_0x0166:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0197 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0197 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0197 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.Object r0 = r0.createNewJid(r8)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0179:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0197 }
            X.13o r0 = com.whatsapp.jid.Jid.Companion     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.jid.Jid r1 = r0.A02(r8)     // Catch:{ Exception -> 0x0197 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ Exception -> 0x0197 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x018e
            java.lang.String r0 = r1.user     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = X.C55212uG.A00(r0)     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x018e:
            boolean r0 = r1 instanceof X.C223313w     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0195
            java.lang.String r0 = r1.user     // Catch:{ Exception -> 0x0197 }
            return r0
        L_0x0195:
            r0 = 0
            return r0
        L_0x0197:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchOO(int, java.lang.Object):java.lang.Object");
    }

    public static native double jvidispatchDIO(int i, long j, Object obj);

    public static native long jvidispatchI(int i);

    public static native long jvidispatchIIDO(int i, long j, double d, Object obj);

    public static native long jvidispatchIIDOOOO(long j, double d, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIDO(long j, long j2, double d, Object obj);

    public static native long jvidispatchIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIIIIIOO(long j, long j2, long j3, long j4, Object obj, Object obj2);

    public static native long jvidispatchIIIIIOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIIO(int i, long j, long j2, long j3, Object obj);

    public static native long jvidispatchIIIIOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIIIIOOOOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public static native long jvidispatchIIIO(int i, long j, long j2, Object obj);

    public static native long jvidispatchIIIOO(int i, long j, long j2, Object obj, Object obj2);

    public static native long jvidispatchIIO(int i, long j, Object obj);

    public static native long jvidispatchIIOO(int i, long j, Object obj, Object obj2);

    public static native long jvidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIIOOOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIO(int i, Object obj);

    public static native long jvidispatchIOO(int i, Object obj, Object obj2);

    public static native long jvidispatchIOOO(int i, Object obj, Object obj2, Object obj3);

    public static native long jvidispatchIOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native long jvidispatchIOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIOOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIOOOOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public static native Object jvidispatchO(int i);

    public static native Object jvidispatchOII(long j, long j2);

    public static native Object jvidispatchOIII(long j, long j2, long j3);

    public static native Object jvidispatchOIIIIIIOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public static native Object jvidispatchOIIIOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIIIOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native Object jvidispatchOIIO(int i, long j, long j2, Object obj);

    public static native Object jvidispatchOIO(int i, long j, Object obj);

    public static native Object jvidispatchOIOO(int i, long j, Object obj, Object obj2);

    public static native Object jvidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOO(int i, Object obj);

    public static native Object jvidispatchOOO(int i, Object obj, Object obj2);

    public static native Object jvidispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native Object jvidispatchOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native Object jvidispatchOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static AnonymousClass6EZ A00(String str, int i) {
        int i2;
        UserJid A02 = UserJid.Companion.A02(str);
        C18740tg.A06(A02);
        String str2 = A02.user;
        if (A02 instanceof C223313w) {
            i2 = 1;
        } else {
            boolean z = A02 instanceof AnonymousClass148;
            i2 = 0;
            if (z) {
                i2 = 2;
            }
        }
        return new AnonymousClass6EZ(str2, i2, i);
    }

    public static C000100b getInstance() {
        if (INSTANCE == null) {
            synchronized (JniBridge.class) {
                if (INSTANCE == null) {
                    AnonymousClass10R r0 = DEPENDENCIES;
                    if (r0 != null) {
                        INSTANCE = new JniBridge((C220912v) r0.A01.get(), (AnonymousClass13B) DEPENDENCIES.A03.get(), (AnonymousClass13C) DEPENDENCIES.A02.get(), (AnonymousClass13D) DEPENDENCIES.A00.get());
                    } else {
                        throw new IllegalStateException("Dependencies are not set. Call setDependencies() first.");
                    }
                }
            }
        }
        return INSTANCE;
    }

    public static long jnidispatchI(int i) {
        if (i == 0) {
            return C19970wo.A00(INSTANCE.jniCallbacksIJniCallbacks.A00) / 1000;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            try {
                AnonymousClass9KB r4 = (AnonymousClass9KB) INSTANCE.jniCallbacksIJniCallbacks.A0G.get();
                if (AnonymousClass00C.A0J(C18740tg.A01, true)) {
                    return 0;
                }
                AnonymousClass005 r42 = r4.A01;
                if (((AnonymousClass19J) ((C20270xI) r42.get()).A05.get()).A04 != 2) {
                    return 0;
                }
                AnonymousClass19A r1 = (AnonymousClass19A) ((C20270xI) r42.get()).A03.get();
                return (!r1.A01.A06 || r1.A0D == null) ? 0 : 1;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        } else if (i == 3) {
            return (long) 2;
        } else {
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        int i;
        Object obj22 = obj18;
        Object obj23 = obj17;
        Object obj24 = obj16;
        Object obj25 = obj20;
        Object obj26 = obj19;
        Object obj27 = obj14;
        Object obj28 = obj10;
        Object obj29 = obj11;
        Object obj30 = obj13;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj21;
            String str = (String) obj;
            int i3 = (int) j2;
            int i4 = (int) j3;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            String str5 = (String) obj5;
            String str6 = (String) obj6;
            int i5 = (int) j4;
            String str7 = (String) obj7;
            String str8 = (String) obj8;
            String str9 = (String) obj9;
            boolean z = false;
            if (0 != j15) {
                z = true;
            }
            String str10 = (String) obj28;
            int i6 = (int) j5;
            String str11 = (String) obj29;
            String str12 = (String) obj30;
            String str13 = (String) obj27;
            Map map = (Map) obj26;
            Map map2 = (Map) obj25;
            int i7 = (int) j6;
            String str14 = (String) obj24;
            String str15 = (String) obj23;
            AnonymousClass3LH r5 = (AnonymousClass3LH) obj22;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A06(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, map, map2, i2, i, i3, i4, i5, i6, i7, j7, j8, j9, j10, j11, j12, j13, z);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj7;
            String str = (String) obj;
            String str2 = (String) obj2;
            int i3 = (int) j2;
            int i4 = (int) j3;
            int i5 = (int) j5;
            int i6 = (int) j6;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            int i7 = (int) j7;
            int i8 = (int) j8;
            String str5 = (String) obj5;
            AnonymousClass3LH r1 = (AnonymousClass3LH) obj6;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j14 = j11;
            long j15 = j10;
            int i9 = i7;
            int i10 = i8;
            int i11 = i4;
            int i12 = i5;
            int i13 = i6;
            int i14 = i2;
            int i15 = i3;
            String str6 = str4;
            String str7 = str5;
            String str8 = str2;
            String str9 = str3;
            AnonymousClass3LH r18 = r1;
            String str10 = str;
            r18.A05(str10, str8, str9, str6, str7, i14, i, i15, i11, i12, i13, i9, i10, j15, j14, j12, j13);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        int i;
        Object obj14 = obj;
        Object obj15 = obj2;
        Object obj16 = obj3;
        Object obj17 = obj4;
        Object obj18 = obj6;
        Object obj19 = obj11;
        Object obj20 = obj10;
        Object obj21 = obj12;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj13;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean z = false;
            if (0 != j10) {
                z = true;
            }
            String str = (String) obj14;
            int i5 = (int) j4;
            String str2 = (String) obj15;
            String str3 = (String) obj16;
            String str4 = (String) obj17;
            boolean z2 = false;
            if (0 != j11) {
                z2 = true;
            }
            String str5 = (String) obj18;
            Map map = (Map) obj19;
            Map map2 = (Map) obj21;
            AnonymousClass3LH r5 = (AnonymousClass3LH) obj20;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            int i6 = i5;
            int i7 = i3;
            int i8 = i4;
            int i9 = i2;
            Map map3 = map2;
            Map map4 = map;
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String str10 = str;
            AnonymousClass3LH r17 = r5;
            r17.A09(str10, str9, str8, str7, str6, map4, map3, i9, i, i7, i8, i6, j6, j7, j8, z, z2);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIO(long j, long j2, long j3, long j4, long j5, Object obj) {
        Object obj2 = obj;
        try {
            C220912v r4 = INSTANCE.jniCallbacksIJniCallbacks;
            C18950u5 r9 = new C18950u5((int) j3, (int) j4, (int) j5, false);
            C21010yW r8 = r4.A01;
            r8.Blu(r9, (byte[]) obj2, (int) j, (int) j2, false);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIOOO(int i, long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3) {
        int i2;
        int i3;
        Object obj4 = obj2;
        Object obj5 = obj;
        Object obj6 = obj3;
        long j6 = j2;
        long j7 = j4;
        if (i == 0) {
            int i4 = (int) j;
            MsysError msysError = (MsysError) obj6;
            String str = (String) obj5;
            int i5 = (int) j6;
            int i6 = (int) j3;
            AnonymousClass3LH r9 = (AnonymousClass3LH) obj4;
            if (msysError != null) {
                i2 = msysError.getCode();
            } else {
                i2 = 0;
            }
            r9.A02(str, i4, i2, i5, i6, j7);
            return 0;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                int i7 = (int) j;
                MsysError msysError2 = (MsysError) obj6;
                String str2 = (String) obj5;
                int i8 = (int) j6;
                boolean z = false;
                if (0 != j5) {
                    z = true;
                }
                AnonymousClass3LH r92 = (AnonymousClass3LH) obj4;
                if (msysError2 != null) {
                    i3 = msysError2.getCode();
                } else {
                    i3 = 0;
                }
                r92.A03(str2, i7, i3, i8, j7, z);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIIIIIIOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj6;
            int i3 = (int) j3;
            Map map = (Map) obj4;
            Map map2 = (Map) obj5;
            AnonymousClass3LH r5 = (AnonymousClass3LH) obj3;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A0D(map, map2, i2, i, i3, j4, j5);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIOOOOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj7;
            int i3 = (int) j2;
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            int i4 = (int) j3;
            Map map = (Map) obj5;
            Map map2 = (Map) obj6;
            AnonymousClass3LH r5 = (AnonymousClass3LH) obj4;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A0A(str, str2, str3, map, map2, i2, i, i3, i4, j4);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIO(int i, long j, long j2, long j3, Object obj) {
        if (i == 0) {
            ((AnonymousClass5u4) obj).A01.A0K(j2);
        } else if (i == 1) {
            try {
                ((AnonymousClass5u3) obj).A01.A0I(j2);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
        return 0;
    }

    public static long jnidispatchIIIOO(long j, long j2, Object obj, Object obj2) {
        try {
            throw new NullPointerException("completionCallback");
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIOOO(long j, long j2, Object obj, Object obj2, Object obj3) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj3;
            String str = (String) obj;
            int i3 = (int) j2;
            AnonymousClass3LH r10 = (AnonymousClass3LH) obj2;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r10.A01(i2, i, str, i3);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIOOOOO(long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj5;
            String str = (String) obj2;
            String str2 = (String) obj3;
            AnonymousClass3LH r4 = (AnonymousClass3LH) obj4;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r4.A04(str, str2, i2, i, j2);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f3, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0139, code lost:
        if (r3.moveToNext() != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0171, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0195, code lost:
        if (r1 == 7) goto L_0x0197;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:39:0x009f, B:43:0x00bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIO(int r15, long r16, java.lang.Object r18) {
        /*
            r0 = r18
            r8 = 0
            r2 = r16
            if (r15 == 0) goto L_0x017b
            r0 = 1
            if (r15 == r0) goto L_0x0178
            r0 = 2
            if (r15 == r0) goto L_0x00f8
            r0 = 3
            if (r15 == r0) goto L_0x00a4
            r0 = 4
            if (r15 == r0) goto L_0x002d
            r0 = 5
            if (r15 != r0) goto L_0x01ac
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x01ad }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x01ad }
            int r1 = (int) r2     // Catch:{ Exception -> 0x01ad }
            X.005 r0 = r0.A08     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01ad }
            X.33S r0 = (X.AnonymousClass33S) r0     // Catch:{ Exception -> 0x01ad }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x01ad }
            X.18o r0 = r0.A09     // Catch:{ Exception -> 0x01ad }
            r0.A02(r1)     // Catch:{ Exception -> 0x01ad }
            goto L_0x0178
        L_0x002d:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x01ad }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x01ad }
            int r4 = (int) r2     // Catch:{ Exception -> 0x01ad }
            X.005 r0 = r0.A08     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01ad }
            X.33S r0 = (X.AnonymousClass33S) r0     // Catch:{ Exception -> 0x01ad }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x01ad }
            X.18o r0 = r0.A09     // Catch:{ Exception -> 0x01ad }
            X.18M r0 = r0.A01     // Catch:{ Exception -> 0x01ad }
            X.1M0 r5 = r0.get()     // Catch:{ Exception -> 0x01ad }
            X.14e r7 = r5.A02     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "SELECT COUNT(*) AS count FROM prekeys WHERE prekey_id = ?"
            r6 = 1
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x009e }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x009e }
            r3 = 0
            r1[r3] = r0     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "SignalPreKeyStore/containsPreKey"
            android.database.Cursor r2 = r7.A09(r2, r0, r1)     // Catch:{ all -> 0x009e }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0092 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0092 }
            if (r0 > 0) goto L_0x006b
            r6 = 0
        L_0x006b:
            r3 = r6
        L_0x006c:
            r2.close()     // Catch:{ all -> 0x009e }
            r5.close()     // Catch:{ Exception -> 0x01ad }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ad }
            r1.<init>()     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = "axolotl has a pre key with id "
            r1.append(r0)     // Catch:{ Exception -> 0x01ad }
            r1.append(r4)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ Exception -> 0x01ad }
            r1.append(r3)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01ad }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01ad }
            if (r3 == 0) goto L_0x01ac
            goto L_0x0178
        L_0x0092:
            r1 = move-exception
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x009e }
        L_0x009d:
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0171 }
            goto L_0x0175
        L_0x00a4:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x01ad }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x01ad }
            int r5 = (int) r2     // Catch:{ Exception -> 0x01ad }
            X.005 r0 = r0.A0E     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01ad }
            X.33V r0 = (X.AnonymousClass33V) r0     // Catch:{ Exception -> 0x01ad }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x01ad }
            X.18p r0 = r0.A0C     // Catch:{ Exception -> 0x01ad }
            X.18M r0 = r0.A01     // Catch:{ Exception -> 0x01ad }
            X.1M0 r4 = r0.A04()     // Catch:{ Exception -> 0x01ad }
            X.14e r7 = r4.A02     // Catch:{ all -> 0x00f3 }
            java.lang.String r6 = "signed_prekeys"
            java.lang.String r3 = "prekey_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00f3 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "SignalSignedPreKeyStore/removeSignedPreKey"
            int r0 = r7.A03(r6, r3, r0, r2)     // Catch:{ all -> 0x00f3 }
            long r2 = (long) r0     // Catch:{ all -> 0x00f3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r1.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x00f3 }
            r1.append(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = " signed pre keys with id "
            r1.append(r0)     // Catch:{ all -> 0x00f3 }
            r1.append(r5)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f3 }
            r4.close()     // Catch:{ Exception -> 0x01ad }
            goto L_0x0178
        L_0x00f3:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0171 }
            goto L_0x0175
        L_0x00f8:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x01ad }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x01ad }
            int r5 = (int) r2     // Catch:{ Exception -> 0x01ad }
            X.005 r0 = r0.A0E     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01ad }
            X.33V r0 = (X.AnonymousClass33V) r0     // Catch:{ Exception -> 0x01ad }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x01ad }
            X.18p r0 = r0.A0C     // Catch:{ Exception -> 0x01ad }
            X.18M r0 = r0.A01     // Catch:{ Exception -> 0x01ad }
            X.1M0 r2 = r0.get()     // Catch:{ Exception -> 0x01ad }
            X.14e r10 = r2.A02     // Catch:{ all -> 0x016c }
            java.lang.String r11 = "signed_prekeys"
            java.lang.String r0 = "record"
            java.lang.String[] r12 = new java.lang.String[]{r0}     // Catch:{ all -> 0x016c }
            java.lang.String r13 = "prekey_id = ?"
            r4 = 1
            java.lang.String[] r14 = new java.lang.String[r4]     // Catch:{ all -> 0x016c }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x016c }
            r0 = 0
            r14[r0] = r1     // Catch:{ all -> 0x016c }
            r15 = 0
            java.lang.String r18 = "SignalSignedPreKeyStore/containsSignedPreKey"
            r17 = r15
            r16 = r15
            android.database.Cursor r3 = r10.A0A(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x016c }
            if (r3 == 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r4 = 0
            goto L_0x013b
        L_0x0135:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x0133
        L_0x013b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0160 }
            r1.<init>()     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "axolotl has a signed pre key with id "
            r1.append(r0)     // Catch:{ all -> 0x0160 }
            r1.append(r5)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ all -> 0x0160 }
            r1.append(r4)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0160 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0160 }
            if (r3 == 0) goto L_0x015c
            r3.close()     // Catch:{ all -> 0x016c }
        L_0x015c:
            r2.close()     // Catch:{ Exception -> 0x01ad }
            goto L_0x0176
        L_0x0160:
            r1 = move-exception
            if (r3 == 0) goto L_0x016b
            r3.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016c }
        L_0x016b:
            throw r1     // Catch:{ all -> 0x016c }
        L_0x016c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0171 }
            goto L_0x0175
        L_0x0171:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x01ad }
        L_0x0175:
            throw r1     // Catch:{ Exception -> 0x01ad }
        L_0x0176:
            if (r4 == 0) goto L_0x01ac
        L_0x0178:
            r8 = 1
            return r8
        L_0x017b:
            int r1 = (int) r2     // Catch:{ Exception -> 0x01ad }
            X.5u3 r0 = (X.AnonymousClass5u3) r0     // Catch:{ Exception -> 0x01ad }
            X.3PM r4 = r0.A00     // Catch:{ Exception -> 0x01ad }
            X.C18740tg.A06(r4)     // Catch:{ Exception -> 0x01ad }
            if (r1 == 0) goto L_0x01a1
            r0 = 11
            if (r1 == r0) goto L_0x019e
            r0 = 4
            if (r1 == r0) goto L_0x019b
            r0 = 5
            if (r1 == r0) goto L_0x0197
            r0 = 6
            if (r1 == r0) goto L_0x0197
            r0 = 7
            r3 = 17
            if (r1 != r0) goto L_0x0199
        L_0x0197:
            r3 = 9
        L_0x0199:
            r2 = 0
            goto L_0x01a3
        L_0x019b:
            r3 = 11
            goto L_0x0199
        L_0x019e:
            r3 = 8
            goto L_0x0199
        L_0x01a1:
            r3 = 0
            r2 = 1
        L_0x01a3:
            r1 = 0
            X.6Wx r0 = new X.6Wx     // Catch:{ Exception -> 0x01ad }
            r0.<init>(r3, r1, r2)     // Catch:{ Exception -> 0x01ad }
            r4.A02(r0)     // Catch:{ Exception -> 0x01ad }
        L_0x01ac:
            return r8
        L_0x01ad:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIO(int, long, java.lang.Object):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOO(int r11, long r12, java.lang.Object r14, java.lang.Object r15) {
        /*
            r9 = 1
            r7 = 0
            switch(r11) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00a8;
                case 2: goto L_0x0076;
                case 3: goto L_0x001f;
                case 4: goto L_0x0008;
                case 5: goto L_0x006e;
                case 6: goto L_0x0112;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r7
        L_0x0008:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0124 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0124 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0124 }
            int r2 = (int) r12     // Catch:{ Exception -> 0x0124 }
            X.005 r0 = r0.A0C     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0124 }
            X.9cO r1 = (X.C197799cO) r1     // Catch:{ Exception -> 0x0124 }
            X.6EZ r0 = A00(r14, r2)     // Catch:{ Exception -> 0x0124 }
            X.C197799cO.A00(r0, r1)     // Catch:{ Exception -> 0x0124 }
            return r9
        L_0x001f:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0124 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0124 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0124 }
            int r1 = (int) r12     // Catch:{ Exception -> 0x0124 }
            X.005 r0 = r0.A0C     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x0124 }
            X.9cO r5 = (X.C197799cO) r5     // Catch:{ Exception -> 0x0124 }
            X.6EZ r4 = A00(r14, r1)     // Catch:{ Exception -> 0x0124 }
            X.18a r3 = r5.A00     // Catch:{ Exception -> 0x0124 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0124 }
            X.9eC r0 = r3.A00(r4)     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.A00     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0067
            r2 = 0
            goto L_0x0067
        L_0x0042:
            X.189 r0 = r5.A01     // Catch:{ all -> 0x006b }
            X.18e r0 = r0.A0B     // Catch:{ all -> 0x006b }
            byte[] r1 = r0.A04(r4)     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0057
            X.9eC r0 = new X.9eC     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r3.A03(r0, r4)     // Catch:{ all -> 0x006b }
        L_0x0054:
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            goto L_0x010f
        L_0x0057:
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x0063 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0063 }
            X.AnonymousClass189.A02(r0)     // Catch:{ IOException -> 0x0063 }
            r3.A03(r0, r4)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            X.C197799cO.A00(r4, r5)     // Catch:{ all -> 0x006b }
            goto L_0x0054
        L_0x0067:
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x010f
            return r9
        L_0x006b:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            goto L_0x0075
        L_0x006e:
            java.lang.String r0 = "socketReceiveHandler"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0124 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0124 }
        L_0x0075:
            throw r1     // Catch:{ Exception -> 0x0124 }
        L_0x0076:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0124 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0124 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x0124 }
            X.005 r0 = r0.A08     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x0124 }
            X.33S r3 = (X.AnonymousClass33S) r3     // Catch:{ Exception -> 0x0124 }
            int r0 = r15.size()     // Catch:{ Exception -> 0x0124 }
            int[] r2 = new int[r0]     // Catch:{ Exception -> 0x0124 }
            r1 = 0
        L_0x008b:
            int r0 = r15.size()     // Catch:{ Exception -> 0x0124 }
            if (r1 >= r0) goto L_0x00a0
            java.lang.Object r0 = r15.get(r1)     // Catch:{ Exception -> 0x0124 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0124 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0124 }
            r2[r1] = r0     // Catch:{ Exception -> 0x0124 }
            int r1 = r1 + 1
            goto L_0x008b
        L_0x00a0:
            X.189 r0 = r3.A00     // Catch:{ Exception -> 0x0124 }
            X.18o r0 = r0.A09     // Catch:{ Exception -> 0x0124 }
            r0.A03(r2)     // Catch:{ Exception -> 0x0124 }
            return r9
        L_0x00a8:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0124 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0124 }
            int r1 = (int) r12     // Catch:{ Exception -> 0x0124 }
            java.util.Map r15 = (java.util.Map) r15     // Catch:{ Exception -> 0x0124 }
            X.005 r0 = r0.A0D     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x0124 }
            X.189 r6 = (X.AnonymousClass189) r6     // Catch:{ Exception -> 0x0124 }
            r0 = 16777214(0xfffffe, float:2.3509884E-38)
            int r1 = r1 % r0
            int r5 = r1 + 1
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0124 }
            r4.<init>()     // Catch:{ Exception -> 0x0124 }
            java.util.Set r0 = r15.entrySet()     // Catch:{ Exception -> 0x0124 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0124 }
        L_0x00ca:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r1 = r3.next()     // Catch:{ Exception -> 0x0124 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ Exception -> 0x0124 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0124 }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0124 }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x0124 }
            X.33q r0 = new X.33q     // Catch:{ Exception -> 0x0124 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0124 }
            r4.add(r0)     // Catch:{ Exception -> 0x0124 }
            goto L_0x00ca
        L_0x00ef:
            r6.A0W(r4, r5)     // Catch:{ Exception -> 0x0124 }
            goto L_0x010f
        L_0x00f3:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0124 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0124 }
            int r2 = (int) r12     // Catch:{ Exception -> 0x0124 }
            byte[] r15 = (byte[]) r15     // Catch:{ Exception -> 0x0124 }
            X.005 r0 = r0.A0E     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0124 }
            X.33V r1 = (X.AnonymousClass33V) r1     // Catch:{ Exception -> 0x0124 }
            if (r15 == 0) goto L_0x010f
            int r0 = r15.length     // Catch:{ Exception -> 0x0124 }
            if (r0 <= 0) goto L_0x010f
            X.189 r0 = r1.A00     // Catch:{ Exception -> 0x0124 }
            X.18p r0 = r0.A0C     // Catch:{ Exception -> 0x0124 }
            r0.A00(r2, r15)     // Catch:{ Exception -> 0x0124 }
            return r9
        L_0x010f:
            r9 = 0
            return r9
        L_0x0112:
            int r1 = (int) r12     // Catch:{ Exception -> 0x0124 }
            com.facebook.msys.mcf.MsysError r15 = (com.facebook.msys.mcf.MsysError) r15     // Catch:{ Exception -> 0x0124 }
            X.3LH r14 = (X.AnonymousClass3LH) r14     // Catch:{ Exception -> 0x0124 }
            if (r15 == 0) goto L_0x0121
            int r0 = r15.getCode()     // Catch:{ Exception -> 0x0124 }
        L_0x011d:
            r14.A00(r1, r0)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0123
        L_0x0121:
            r0 = 0
            goto L_0x011d
        L_0x0123:
            return r7
        L_0x0124:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOO(int, long, java.lang.Object, java.lang.Object):long");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOOO(int r12, long r13, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r4 = r17
            r10 = 1
            r8 = 0
            if (r12 == 0) goto L_0x00d8
            r0 = 1
            if (r12 == r0) goto L_0x00a5
            r0 = 2
            if (r12 == r0) goto L_0x008f
            r0 = 3
            if (r12 == r0) goto L_0x0012
            return r8
        L_0x0012:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00e4 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00e4 }
            int r3 = (int) r13     // Catch:{ Exception -> 0x00e4 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x00e4 }
            X.005 r0 = r0.A0C     // Catch:{ Exception -> 0x00e4 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x00e4 }
            X.9cO r2 = (X.C197799cO) r2     // Catch:{ Exception -> 0x00e4 }
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x0088 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0088 }
            X.189 r1 = r2.A01     // Catch:{ IOException -> 0x0088 }
            X.AnonymousClass189.A02(r0)     // Catch:{ IOException -> 0x0088 }
            X.6EZ r7 = A00(r15, r3)     // Catch:{ Exception -> 0x00e4 }
            X.18M r0 = r2.A02     // Catch:{ Exception -> 0x00e4 }
            X.1M0 r6 = r0.A04()     // Catch:{ Exception -> 0x00e4 }
            X.71s r5 = r6.B1k()     // Catch:{ all -> 0x007e }
            X.18a r3 = r2.A00     // Catch:{ all -> 0x0074 }
            monitor-enter(r3)     // Catch:{ all -> 0x0074 }
            X.18e r0 = r1.A0B     // Catch:{ IOException -> 0x004f }
            r0.A03(r7, r4)     // Catch:{ IOException -> 0x004f }
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x004f }
            r0.<init>(r4)     // Catch:{ IOException -> 0x004f }
            r3.A03(r0, r7)     // Catch:{ IOException -> 0x004f }
            r5.A00()     // Catch:{ IOException -> 0x004f }
            goto L_0x0069
        L_0x004f:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "sessionStoreImpl/saveSession for "
            r1.append(r0)     // Catch:{ all -> 0x0071 }
            r1.append(r7)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = " failed to update"
            r1.append(r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0071 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0071 }
        L_0x0069:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            r5.close()     // Catch:{ all -> 0x007e }
            r6.close()     // Catch:{ Exception -> 0x00e4 }
            return r10
        L_0x0071:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x007e }
        L_0x007d:
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00e4 }
        L_0x0087:
            throw r1     // Catch:{ Exception -> 0x00e4 }
        L_0x0088:
            r1 = move-exception
            java.lang.String r0 = "sessionStoreImpl/invalid-session-record"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00e1
        L_0x008f:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00e4 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00e4 }
            int r1 = (int) r13     // Catch:{ Exception -> 0x00e4 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x00e4 }
            X.005 r0 = r0.A07     // Catch:{ Exception -> 0x00e4 }
            r0.get()     // Catch:{ Exception -> 0x00e4 }
            X.6EZ r0 = A00(r15, r1)     // Catch:{ Exception -> 0x00e4 }
            X.C234318l.A01(r0, r4)     // Catch:{ Exception -> 0x00e4 }
            return r10
        L_0x00a5:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00e4 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00e4 }
            int r1 = (int) r13     // Catch:{ Exception -> 0x00e4 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x00e4 }
            X.005 r0 = r0.A07     // Catch:{ Exception -> 0x00e4 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x00e4 }
            X.33R r3 = (X.AnonymousClass33R) r3     // Catch:{ Exception -> 0x00e4 }
            X.6EZ r2 = A00(r15, r1)     // Catch:{ Exception -> 0x00e4 }
            if (r4 != 0) goto L_0x00c2
            X.189 r0 = r3.A00     // Catch:{ Exception -> 0x00e4 }
            r0.A0R(r2)     // Catch:{ Exception -> 0x00e4 }
            return r10
        L_0x00c2:
            X.3IG r0 = X.C133256Xm.A01(r4)     // Catch:{ 110 -> 0x00d1 }
            X.3FZ r1 = new X.3FZ     // Catch:{ 110 -> 0x00d1 }
            r1.<init>(r0)     // Catch:{ 110 -> 0x00d1 }
            X.189 r0 = r3.A00     // Catch:{ 110 -> 0x00d1 }
            r0.A0Q(r1, r2)     // Catch:{ 110 -> 0x00d1 }
            return r10
        L_0x00d1:
            r1 = move-exception
            java.lang.String r0 = "IdentityKeyStoreImpl/Could not save the identity key."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00e1
        L_0x00d8:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00e4 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00e4 }
            X.005 r0 = r0.A07     // Catch:{ Exception -> 0x00e4 }
            r0.get()     // Catch:{ Exception -> 0x00e4 }
        L_0x00e1:
            r10 = 0
            return r10
        L_0x00e4:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOOO(int, long, java.lang.Object, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        if (i == 0) {
            byte[] bArr = (byte[]) obj4;
            AnonymousClass6EU r2 = new AnonymousClass6EU(A00((String) obj2, (int) j), (String) obj);
            AnonymousClass189 r0 = ((AnonymousClass33U) INSTANCE.jniCallbacksIJniCallbacks.A0B.get()).A00;
            if (bArr == null) {
                r0.A0A.A07(r2, false);
                return 1;
            }
            r0.A0A.A05(r2, bArr);
            return 1;
        } else if (i == 1) {
            byte[] bArr2 = (byte[]) obj4;
            AnonymousClass6EU r1 = new AnonymousClass6EU(A00((String) obj2, (int) j), (String) obj);
            AnonymousClass189 r02 = ((AnonymousClass33Q) INSTANCE.jniCallbacksIJniCallbacks.A06.get()).A00;
            if (bArr2 == null) {
                r02.A0V(r1);
                return 1;
            }
            r02.A06.A03(r1, bArr2);
            return 1;
        } else if (i != 2) {
            return 0;
        } else {
            try {
                int i3 = (int) j;
                MsysError msysError = (MsysError) obj4;
                Map map = (Map) obj2;
                Map map2 = (Map) obj3;
                AnonymousClass3LH r10 = (AnonymousClass3LH) obj;
                if (msysError != null) {
                    i2 = msysError.getCode();
                } else {
                    i2 = 0;
                }
                r10.A0C(map, map2, i3, i2);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r3 == 7) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIOOOOOOOOO(long r17, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r14 = r19
            r9 = r21
            r2 = r23
            r12 = r22
            r13 = r20
            r7 = r27
            r8 = r26
            r10 = r25
            r11 = r24
            r15 = 0
            r0 = r17
            int r3 = (int) r0     // Catch:{ Exception -> 0x009e }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x009e }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x009e }
            byte[] r12 = (byte[]) r12     // Catch:{ Exception -> 0x009e }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x009e }
            byte[] r11 = (byte[]) r11     // Catch:{ Exception -> 0x009e }
            byte[] r10 = (byte[]) r10     // Catch:{ Exception -> 0x009e }
            byte[] r8 = (byte[]) r8     // Catch:{ Exception -> 0x009e }
            byte[] r7 = (byte[]) r7     // Catch:{ Exception -> 0x009e }
            X.5u4 r9 = (X.AnonymousClass5u4) r9     // Catch:{ Exception -> 0x009e }
            X.3PM r0 = r9.A00     // Catch:{ Exception -> 0x009e }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x009e }
            if (r3 == 0) goto L_0x004a
            r0 = 11
            if (r3 == r0) goto L_0x0047
            r0 = 4
            if (r3 == r0) goto L_0x0044
            r0 = 5
            if (r3 == r0) goto L_0x0042
            r0 = 6
            if (r3 == r0) goto L_0x0042
            r0 = 7
            r6 = 23
            if (r3 != r0) goto L_0x004b
        L_0x0042:
            r6 = 3
            goto L_0x004b
        L_0x0044:
            r6 = 17
            goto L_0x004b
        L_0x0047:
            r6 = 19
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            X.5C4 r5 = r9.A01     // Catch:{ Exception -> 0x009e }
            if (r6 != 0) goto L_0x0094
            r4 = 1
            r5.A05 = r4     // Catch:{ Exception -> 0x009e }
            X.6Fj r3 = r5.A0X     // Catch:{ Exception -> 0x009e }
            r3.A08(r14)     // Catch:{ Exception -> 0x009e }
            r3.A0B(r13)     // Catch:{ Exception -> 0x009e }
            r1 = 2
            if (r12 == 0) goto L_0x0064
            java.lang.String r0 = android.util.Base64.encodeToString(r12, r1)     // Catch:{ Exception -> 0x009e }
            r3.A0A(r0)     // Catch:{ Exception -> 0x009e }
        L_0x0064:
            if (r2 == 0) goto L_0x006d
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r1)     // Catch:{ Exception -> 0x009e }
            r3.A09(r0)     // Catch:{ Exception -> 0x009e }
        L_0x006d:
            if (r11 == 0) goto L_0x008c
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x009e }
            X.6Rx r0 = new X.6Rx     // Catch:{ Exception -> 0x009e }
            r0.<init>(r11, r1)     // Catch:{ Exception -> 0x009e }
            if (r8 == 0) goto L_0x008c
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            monitor-enter(r3)     // Catch:{ Exception -> 0x009e }
            r3.A00 = r0     // Catch:{ all -> 0x0088 }
            r3.A0I = r8     // Catch:{ all -> 0x0088 }
            r3.A0K = r7     // Catch:{ all -> 0x0088 }
            r3.A0L = r10     // Catch:{ all -> 0x0088 }
            goto L_0x008b
        L_0x0088:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x009e }
            throw r0     // Catch:{ Exception -> 0x009e }
        L_0x008b:
            monitor-exit(r3)     // Catch:{ Exception -> 0x009e }
        L_0x008c:
            X.6Pj r0 = r5.A0H()     // Catch:{ Exception -> 0x009e }
            X.5z2 r0 = r0.A01     // Catch:{ Exception -> 0x009e }
            r0.A00 = r4     // Catch:{ Exception -> 0x009e }
        L_0x0094:
            X.3PM r1 = r9.A00     // Catch:{ Exception -> 0x009e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x009e }
            r1.A02(r0)     // Catch:{ Exception -> 0x009e }
            return r15
        L_0x009e:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIOOOOOOOOO(long, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        return (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017b, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0181, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0182, code lost:
        INSTANCE.jniBridgeExceptionHandler.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0189, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x000a, B:26:0x0095] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIO(int r15, java.lang.Object r16) {
        /*
            r9 = r16
            r7 = 1
            r4 = 0
            switch(r15) {
                case 1: goto L_0x000a;
                case 2: goto L_0x002f;
                case 3: goto L_0x017e;
                case 4: goto L_0x003b;
                case 5: goto L_0x0051;
                case 6: goto L_0x009e;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00da;
                case 10: goto L_0x0112;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r4
        L_0x000a:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A0F     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.35v r1 = (X.C599335v) r1     // Catch:{ Exception -> 0x0181 }
            X.9nx r9 = (X.C203399nx) r9     // Catch:{ Exception -> 0x0181 }
            r0 = 2
            X.3TH r8 = new X.3TH     // Catch:{ Exception -> 0x0181 }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x0181 }
            X.19A r7 = r1.A00     // Catch:{ Exception -> 0x0181 }
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r10 = r9.A0i(r1, r0)     // Catch:{ Exception -> 0x0181 }
            r11 = 344(0x158, float:4.82E-43)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0F(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0181 }
            return r4
        L_0x002f:
            X.5u4 r9 = (X.AnonymousClass5u4) r9     // Catch:{ Exception -> 0x0181 }
            X.5C4 r0 = r9.A01     // Catch:{ Exception -> 0x0181 }
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ Exception -> 0x0181 }
            boolean r0 = r0.isCancelled()     // Catch:{ Exception -> 0x0181 }
            goto L_0x017b
        L_0x003b:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A07     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.33R r0 = (X.AnonymousClass33R) r0     // Catch:{ Exception -> 0x0181 }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.18l r0 = r0.A07     // Catch:{ Exception -> 0x0181 }
            int r0 = r0.A03()     // Catch:{ Exception -> 0x0181 }
            goto L_0x00d8
        L_0x0051:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A0E     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.33V r0 = (X.AnonymousClass33V) r0     // Catch:{ Exception -> 0x0181 }
            X.189 r1 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.18I r0 = r1.A0K     // Catch:{ Exception -> 0x0181 }
            X.79X r2 = r0.A07()     // Catch:{ Exception -> 0x0181 }
            X.18p r0 = r1.A0C     // Catch:{ all -> 0x0092 }
            byte[] r1 = r0.A01()     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x007f
            X.4uJ r0 = X.C100004uJ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x007d }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ IOException -> 0x007d }
            X.4uJ r0 = (X.C100004uJ) r0     // Catch:{ IOException -> 0x007d }
            if (r2 == 0) goto L_0x007a
            r2.close()     // Catch:{ Exception -> 0x0181 }
        L_0x007a:
            int r0 = r0.id_     // Catch:{ Exception -> 0x0181 }
            goto L_0x00d8
        L_0x007d:
            r1 = move-exception
            goto L_0x0087
        L_0x007f:
            java.lang.String r1 = "no signed prekey record found"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0092 }
            r0.<init>(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0091
        L_0x0087:
            java.lang.String r0 = "failed to parse the latest signed prekey record"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0092 }
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0092 }
            r0.<init>(r1)     // Catch:{ all -> 0x0092 }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0181 }
        L_0x009d:
            throw r1     // Catch:{ Exception -> 0x0181 }
        L_0x009e:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A08     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.33S r0 = (X.AnonymousClass33S) r0     // Catch:{ Exception -> 0x0181 }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.18o r0 = r0.A09     // Catch:{ Exception -> 0x0181 }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x0181 }
            goto L_0x00d8
        L_0x00b3:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A08     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.33S r0 = (X.AnonymousClass33S) r0     // Catch:{ Exception -> 0x0181 }
            X.189 r0 = r0.A00     // Catch:{ Exception -> 0x0181 }
            X.18l r0 = r0.A07     // Catch:{ Exception -> 0x0181 }
            int r0 = r0.A02()     // Catch:{ Exception -> 0x0181 }
            goto L_0x00d8
        L_0x00c8:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A0A     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x0181 }
            byte r0 = r0.getTypeFromKeyValue(r9)     // Catch:{ Exception -> 0x0181 }
        L_0x00d8:
            long r0 = (long) r0     // Catch:{ Exception -> 0x0181 }
            return r0
        L_0x00da:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            byte[] r9 = (byte[]) r9     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A0G     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.9KB r2 = (X.AnonymousClass9KB) r2     // Catch:{ Exception -> 0x0181 }
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)     // Catch:{ Exception -> 0x0181 }
            java.util.Set r0 = r2.A02     // Catch:{ Exception -> 0x0181 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x0181 }
        L_0x00f2:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0181 }
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0181 }
            X.61u r0 = (X.C1259061u) r0     // Catch:{ Exception -> 0x0181 }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x0181 }
            if (r0 == 0) goto L_0x00f2
            goto L_0x017e
        L_0x0105:
            X.005 r0 = r2.A01     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.0xI r0 = (X.C20270xI) r0     // Catch:{ Exception -> 0x0181 }
            boolean r0 = r0.A01(r9)     // Catch:{ Exception -> 0x0181 }
            goto L_0x017b
        L_0x0112:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0181 }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0181 }
            byte[] r9 = (byte[]) r9     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r0.A0G     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.9KB r1 = (X.AnonymousClass9KB) r1     // Catch:{ Exception -> 0x0181 }
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r1.A01     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.0xI r6 = (X.C20270xI) r6     // Catch:{ Exception -> 0x0181 }
            X.005 r3 = r6.A03     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r0 = r3.get()     // Catch:{ Exception -> 0x0181 }
            X.19A r0 = (X.AnonymousClass19A) r0     // Catch:{ Exception -> 0x0181 }
            java.lang.String r1 = r0.A09()     // Catch:{ Exception -> 0x0181 }
            X.1jS r2 = new X.1jS     // Catch:{ Exception -> 0x0181 }
            r2.<init>((java.lang.String) r1, (byte[]) r9)     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r6.A02     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.00b r14 = (X.C000100b) r14     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r6.A04     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r13 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.0yW r13 = (X.C21010yW) r13     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r6.A01     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r10 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.0zA r10 = (X.C21390zA) r10     // Catch:{ Exception -> 0x0181 }
            X.005 r0 = r6.A05     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r11 = r0.get()     // Catch:{ Exception -> 0x0181 }
            X.19J r11 = (X.AnonymousClass19J) r11     // Catch:{ Exception -> 0x0181 }
            X.0wo r12 = r6.A00     // Catch:{ Exception -> 0x0181 }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0181 }
            X.6xq r9 = new X.6xq     // Catch:{ Exception -> 0x0181 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r10 = r3.get()     // Catch:{ Exception -> 0x0181 }
            X.19A r10 = (X.AnonymousClass19A) r10     // Catch:{ Exception -> 0x0181 }
            X.9nx r0 = r2.A00     // Catch:{ Exception -> 0x0181 }
            r14 = 239(0xef, float:3.35E-43)
            r15 = 32000(0x7d00, double:1.581E-319)
            r11 = r9
            r12 = r0
            r13 = r1
            boolean r0 = r10.A0K(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0181 }
        L_0x017b:
            if (r0 == 0) goto L_0x017e
            return r7
        L_0x017e:
            r7 = 0
            return r7
        L_0x0181:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIO(int, java.lang.Object):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIOO(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r1 = r18
            r2 = r17
            r14 = 1
            r12 = 0
            r3 = r16
            if (r16 == 0) goto L_0x00e7
            r0 = 1
            if (r3 == r0) goto L_0x0025
            r0 = 2
            if (r3 == r0) goto L_0x001d
            r0 = 3
            if (r3 != r0) goto L_0x0024
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00de }
            X.4Oq r1 = (X.C87394Oq) r1     // Catch:{ Exception -> 0x00de }
            r1.B7C(r2)     // Catch:{ Exception -> 0x00de }
            return r12
        L_0x001d:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00de }
            X.4Oq r1 = (X.C87394Oq) r1     // Catch:{ Exception -> 0x00de }
            r1.B7C(r2)     // Catch:{ Exception -> 0x00de }
        L_0x0024:
            return r12
        L_0x0025:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x00de }
            X.12v r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x00de }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00de }
            r9 = 0
            X.6EZ r7 = A00(r2, r9)     // Catch:{ Exception -> 0x00de }
            X.005 r0 = r0.A0C     // Catch:{ Exception -> 0x00de }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x00de }
            X.9cO r6 = (X.C197799cO) r6     // Catch:{ Exception -> 0x00de }
            X.18a r4 = r6.A00     // Catch:{ Exception -> 0x00de }
            monitor-enter(r4)     // Catch:{ Exception -> 0x00de }
            X.189 r0 = r6.A01     // Catch:{ all -> 0x00db }
            X.18e r1 = r0.A0B     // Catch:{ all -> 0x00db }
            java.lang.String r0 = X.AnonymousClass6R2.A01(r7)     // Catch:{ all -> 0x00db }
            X.AnonymousClass00C.A0D(r0, r9)     // Catch:{ all -> 0x00db }
            X.6EZ r8 = A00(r0, r9)     // Catch:{ all -> 0x00db }
            X.18M r0 = r1.A02     // Catch:{ all -> 0x00db }
            X.1M0 r5 = r0.A04()     // Catch:{ all -> 0x00db }
            java.lang.Long r11 = X.C233618e.A00(r1, r8)     // Catch:{ all -> 0x00d4 }
            r3 = 1
            r0 = 2
            if (r11 != 0) goto L_0x0084
            java.lang.String r2 = "recipient_id = ? AND recipient_type = ?"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00d4 }
            r1[r9] = r0     // Catch:{ all -> 0x00d4 }
            int r0 = r8.A01     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00d4 }
            r1[r3] = r0     // Catch:{ all -> 0x00d4 }
            X.011 r0 = new X.011     // Catch:{ all -> 0x00d4 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00d4 }
        L_0x006d:
            java.lang.Object r10 = r0.first     // Catch:{ all -> 0x00d4 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00d4 }
            java.lang.Object r9 = r0.second     // Catch:{ all -> 0x00d4 }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x00d4 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = "sessions"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
            r1.<init>()     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "SignalSessionStore/removeAllSessions"
            r1.append(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x009c
        L_0x0084:
            java.lang.String r2 = "recipient_lid_identifier = ? AND recipient_type = ?"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x00d4 }
            r1[r9] = r0     // Catch:{ all -> 0x00d4 }
            int r0 = r8.A01     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00d4 }
            r1[r3] = r0     // Catch:{ all -> 0x00d4 }
            X.011 r0 = new X.011     // Catch:{ all -> 0x00d4 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00d4 }
            goto L_0x006d
        L_0x009c:
            if (r11 == 0) goto L_0x009f
            goto L_0x00a2
        L_0x009f:
            java.lang.String r0 = ""
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r0 = "_lid_identifier"
        L_0x00a4:
            r1.append(r0)     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d4 }
            int r0 = r3.A03(r2, r10, r0, r9)     // Catch:{ all -> 0x00d4 }
            long r2 = (long) r0     // Catch:{ all -> 0x00d4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
            r1.<init>()     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x00d4 }
            r1.append(r2)     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = " sessions with "
            r1.append(r0)     // Catch:{ all -> 0x00d4 }
            r1.append(r8)     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d4 }
            r5.close()     // Catch:{ all -> 0x00db }
            X.C197799cO.A00(r7, r6)     // Catch:{ all -> 0x00db }
            monitor-exit(r4)     // Catch:{ all -> 0x00db }
            return r14
        L_0x00d4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ Exception -> 0x00de }
        L_0x00de:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.13D r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r12
        L_0x00e7:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIOO(int, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIOOO(Object obj, Object obj2, Object obj3) {
        try {
            byte[] bArr = (byte[]) obj3;
            C22934Ayk ayk = (C22934Ayk) obj;
            C18740tg.A0D(((AnonymousClass33P) INSTANCE.jniCallbacksIJniCallbacks.A05.get()).A00.A0J.A00(), "Not running on SignalExecutor thread");
            if (ayk == null) {
                return 0;
            }
            ayk.BJg(bArr);
            return 1;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static Object jnidispatchOOO(Object obj, Object obj2) {
        try {
            Map map = (Map) obj2;
            C197799cO r4 = (C197799cO) INSTANCE.jniCallbacksIJniCallbacks.A0C.get();
            if (map == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                Object obj3 = map.get(num);
                C18740tg.A06(obj3);
                arrayList.add(A00((String) obj3, intValue));
            }
            HashSet A0K = r4.A01.A0K(arrayList);
            HashMap hashMap = new HashMap();
            Iterator it = A0K.iterator();
            while (it.hasNext()) {
                AnonymousClass6EZ r2 = (AnonymousClass6EZ) it.next();
                hashMap.put(Integer.valueOf(r2.A00), r2.A02);
            }
            return hashMap;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static Object jnidispatchOOOOO(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr;
        try {
            String str = (String) obj;
            List list = (List) obj3;
            List list2 = (List) obj4;
            byte[] bArr = (byte[]) obj2;
            ProtocolJniHelper protocolJniHelper = (ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get();
            Object[] objArr2 = null;
            if (list != null) {
                objArr = list.toArray();
            } else {
                objArr = null;
            }
            if (list2 != null) {
                objArr2 = list2.toArray();
            }
            return protocolJniHelper.createProtocolTreeNode(str, objArr, objArr2, bArr);
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static void setDependencies(AnonymousClass10R r3) {
        synchronized (JniBridge.class) {
            if (DEPENDENCIES == null) {
                DEPENDENCIES = r3;
            } else {
                throw new IllegalStateException("JniBridgeDependencies are already set. Can't override them.");
            }
        }
    }

    public byte[] WCIAPIGcmAesCreateEncryptedCiphertext(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        return (byte[]) jvidispatchOIOOOOO(2, (long) 16, this.wajContext.get(), bArr, bArr2, bArr3, bArr4);
    }

    public C192009Fi WCMMessageSecretAPICreateWithSerialized(byte[] bArr) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOO(3, this.wajContext.get(), bArr);
        if (nativeHolder != null) {
            return new C192009Fi(nativeHolder);
        }
        return null;
    }

    public C192019Fj WcmBotMessageSecretAPICreateWithMessageSecret(C192009Fi r4) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOO(8, this.wajContext.get(), r4.A00);
        if (nativeHolder != null) {
            return new C192019Fj(nativeHolder);
        }
        return null;
    }

    public AnonymousClass33W WcmMsmsgSecretAPICreateFromBotMessageSecret(C192019Fj r7, String str, UserJid userJid, UserJid userJid2) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOOOOO(0, str, this.wajContext.get(), r7.A00, userJid.getRawString(), userJid2.getRawString());
        if (nativeHolder != null) {
            return new AnonymousClass33W(nativeHolder);
        }
        return null;
    }

    public JniBridge(C220912v r2, AnonymousClass13B r3, AnonymousClass13C r4, AnonymousClass13D r5) {
        this.jniCallbacksIJniCallbacks = r2;
        this.jniCallbacksIJniCallbacksAndroidRegistration = r3;
        this.jniCallbacksIJniCallbacksAndroidGpia = r4;
        this.jniBridgeExceptionHandler = r5;
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        int i;
        Object obj17 = obj9;
        Object obj18 = obj10;
        Object obj19 = obj8;
        Object obj20 = obj7;
        Object obj21 = obj6;
        Object obj22 = obj5;
        Object obj23 = obj4;
        Object obj24 = obj15;
        Object obj25 = obj2;
        Object obj26 = obj;
        Object obj27 = obj3;
        Object obj28 = obj11;
        Object obj29 = obj12;
        Object obj30 = obj13;
        Object obj31 = obj14;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj16;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean z = false;
            if (0 != j24) {
                z = true;
            }
            String str = (String) obj26;
            int i5 = (int) j4;
            int i6 = (int) j5;
            String str2 = (String) obj25;
            String str3 = (String) obj27;
            String str4 = (String) obj23;
            boolean z2 = false;
            if (0 != j25) {
                z2 = true;
            }
            int i7 = (int) j8;
            String str5 = (String) obj22;
            String str6 = (String) obj21;
            String str7 = (String) obj20;
            int i8 = (int) j9;
            String str8 = (String) obj19;
            boolean z3 = false;
            if (0 != j26) {
                z3 = true;
            }
            String str9 = (String) obj17;
            int i9 = (int) j10;
            int i10 = (int) j11;
            int i11 = (int) j12;
            String str10 = (String) obj18;
            int i12 = (int) j13;
            Map map = (Map) obj31;
            Map map2 = (Map) obj24;
            int i13 = (int) j14;
            String str11 = (String) obj28;
            int i14 = (int) j15;
            String str12 = (String) obj29;
            AnonymousClass3LH r5 = (AnonymousClass3LH) obj30;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j27 = j21;
            long j28 = j20;
            long j29 = j19;
            long j30 = j18;
            long j31 = j17;
            long j32 = j16;
            Map map3 = map;
            Map map4 = map2;
            int i15 = i2;
            int i16 = i3;
            int i17 = i4;
            int i18 = i5;
            int i19 = i6;
            int i20 = i7;
            int i21 = i8;
            int i22 = i9;
            int i23 = i10;
            int i24 = i11;
            int i25 = i12;
            int i26 = i13;
            int i27 = i14;
            AnonymousClass3LH r23 = r5;
            String str13 = str;
            String str14 = str2;
            String str15 = str3;
            String str16 = str4;
            String str17 = str5;
            String str18 = str6;
            String str19 = str7;
            String str20 = str8;
            String str21 = str9;
            String str22 = str10;
            String str23 = str11;
            String str24 = str12;
            r23.A07(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, map3, map4, i15, i, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, j32, j31, j30, j29, j28, j27, j22, j23, z, z2, z3);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        int i;
        Object obj15 = obj;
        Object obj16 = obj2;
        Object obj17 = obj3;
        Object obj18 = obj4;
        Object obj19 = obj5;
        Object obj20 = obj7;
        Object obj21 = obj8;
        Object obj22 = obj9;
        Object obj23 = obj12;
        Object obj24 = obj13;
        Object obj25 = obj11;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj14;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean z = false;
            if (0 != j11) {
                z = true;
            }
            String str = (String) obj15;
            String str2 = (String) obj16;
            String str3 = (String) obj17;
            String str4 = (String) obj18;
            String str5 = (String) obj19;
            String str6 = (String) obj20;
            String str7 = (String) obj21;
            boolean z2 = false;
            if (0 != j12) {
                z2 = true;
            }
            String str8 = (String) obj22;
            int i5 = (int) j4;
            boolean z3 = false;
            if (0 != j13) {
                z3 = true;
            }
            Map map = (Map) obj23;
            Map map2 = (Map) obj24;
            AnonymousClass3LH r2 = (AnonymousClass3LH) obj25;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j14 = j8;
            long j15 = j7;
            int i6 = i3;
            int i7 = i4;
            int i8 = i5;
            String str9 = str8;
            Map map3 = map;
            Map map4 = map2;
            int i9 = i2;
            String str10 = str4;
            String str11 = str5;
            String str12 = str6;
            String str13 = str7;
            AnonymousClass3LH r13 = r2;
            String str14 = str;
            String str15 = str2;
            String str16 = str3;
            r13.A08(str14, str15, str16, str10, str11, str12, str13, str9, map3, map4, i9, i, i6, i7, i8, j15, j14, j9, j10, z, z2, z3);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }
}
