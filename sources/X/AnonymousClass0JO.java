package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0JO  reason: invalid class name */
public final class AnonymousClass0JO extends AnonymousClass0XK implements C17230qw {
    public C03080Dc A00;
    public Set A01 = new HashSet();
    public C17350r9 A02 = null;
    public Integer A03 = null;
    public final Context A04;
    public final Looper A05;
    public final C02610Bd A06;
    public final AnonymousClass0JC A07;
    public final AnonymousClass0WV A08;
    public final AnonymousClass0TT A09;
    public final ArrayList A0A;
    public final Map A0B;
    public final Map A0C;
    public final Queue A0D = new LinkedList();
    public final Lock A0E;
    public final int A0F;
    public final AnonymousClass0SO A0G = new AnonymousClass0SO();
    public final AnonymousClass0MH A0H;
    public final C16870qE A0I;
    public final AnonymousClass0ZZ A0J;
    public volatile boolean A0K;

    public final Context A02() {
        return this.A04;
    }

    public final Looper A03() {
        return this.A05;
    }

    public final void Bxr(int i, boolean z) {
        AtomicInteger atomicInteger;
        if (i == 1) {
            if (!this.A0K) {
                this.A0K = true;
                if (this.A00 == null) {
                    try {
                        this.A00 = this.A06.A04(this.A04.getApplicationContext(), new C04100Jg(this));
                    } catch (SecurityException unused) {
                    }
                }
                AnonymousClass0MH r3 = this.A0H;
                r3.sendMessageDelayed(r3.obtainMessage(1), 120000);
                r3.sendMessageDelayed(r3.obtainMessage(2), 5000);
            }
            i = 1;
        }
        for (BasePendingResult A072 : (BasePendingResult[]) this.A08.A01.toArray(new BasePendingResult[0])) {
            A072.A07(AnonymousClass0WV.A02);
        }
        AnonymousClass0ZZ r6 = this.A0J;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            handler.removeMessages(1);
            synchronized (r6.A03) {
                r6.A00 = true;
                ArrayList arrayList = r6.A05;
                ArrayList arrayList2 = new ArrayList(arrayList);
                atomicInteger = r6.A07;
                int i2 = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C17610rh r1 = (C17610rh) it.next();
                    if (!r6.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(r1)) {
                        r1.onConnectionSuspended(i);
                    }
                }
                r6.A04.clear();
                r6.A00 = false;
            }
            r6.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                A00(this);
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("onUnintentionalDisconnection must only be called on the Handler thread");
    }

    public static final void A00(AnonymousClass0JO r2) {
        r2.A0J.A08 = true;
        C17350r9 r0 = r2.A02;
        AnonymousClass006.A01(r0);
        r0.By2();
    }

    public static /* bridge */ /* synthetic */ void A01(AnonymousClass0JO r2) {
        Lock lock = r2.A0E;
        lock.lock();
        try {
            if (r2.A0K) {
                A00(r2);
            }
        } finally {
            lock.unlock();
        }
    }

    public final C17590rf A04(AnonymousClass0QI r3) {
        C17590rf r1 = (C17590rf) this.A0B.get(r3);
        AnonymousClass006.A02(r1, "Appropriate Api was not requested.");
        return r1;
    }

    public final AnonymousClass0JS A05(AnonymousClass0JS r5) {
        C06190Sq r2 = r5.A01;
        boolean containsKey = this.A0B.containsKey(r5.A00);
        String str = r2.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GoogleApiClient is not configured to use ");
        A0u.append(str);
        AnonymousClass006.A07(containsKey, AnonymousClass000.A0q(" required for this call.", A0u));
        Lock lock = this.A0E;
        lock.lock();
        try {
            C17350r9 r0 = this.A02;
            if (r0 == null) {
                this.A0D.add(r5);
            } else {
                r0.Bxu(r5);
            }
            return r5;
        } finally {
            lock.unlock();
        }
    }

    public final AnonymousClass0JS A06(AnonymousClass0JS r6) {
        C06190Sq r2 = r6.A01;
        boolean containsKey = this.A0B.containsKey(r6.A00);
        String str = r2.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GoogleApiClient is not configured to use ");
        A0u.append(str);
        AnonymousClass006.A07(containsKey, AnonymousClass000.A0q(" required for this call.", A0u));
        Lock lock = this.A0E;
        lock.lock();
        try {
            C17350r9 r1 = this.A02;
            if (r1 != null) {
                if (this.A0K) {
                    Queue queue = this.A0D;
                    queue.add(r6);
                    while (!queue.isEmpty()) {
                        AnonymousClass0JS r22 = (AnonymousClass0JS) queue.remove();
                        AnonymousClass0WV r12 = this.A08;
                        r12.A01.add(r22);
                        r22.A08.set(r12.A00);
                        r22.A0B(Status.A07);
                    }
                } else {
                    r6 = r1.Bxx(r6);
                }
                return r6;
            }
            throw AnonymousClass001.A09("GoogleApiClient is not connected yet.");
        } finally {
            lock.unlock();
        }
    }

    public final void A07() {
        C17350r9 r0 = this.A02;
        if (r0 != null) {
            r0.By5();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v30, types: [X.0r9] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.0e5] */
    /* JADX WARNING: type inference failed for: r15v3, types: [X.0e4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079 A[Catch:{ all -> 0x0217, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083 A[Catch:{ all -> 0x0217, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2 A[Catch:{ all -> 0x0217, all -> 0x0224 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r30 = this;
            r14 = r30
            java.util.concurrent.locks.Lock r0 = r14.A0E
            r29 = r0
            r29.lock()
            int r0 = r14.A0F     // Catch:{ all -> 0x0224 }
            r4 = 2
            r3 = 0
            r1 = 1
            if (r0 < 0) goto L_0x0017
            java.lang.Integer r0 = r14.A03     // Catch:{ all -> 0x0224 }
            boolean r2 = X.AnonymousClass000.A1V(r0)
            goto L_0x004c
        L_0x0017:
            java.lang.Integer r0 = r14.A03     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x003f
            java.util.Map r0 = r14.A0B     // Catch:{ all -> 0x0224 }
            java.util.Iterator r5 = X.AnonymousClass000.A0z(r0)     // Catch:{ all -> 0x0224 }
            r2 = 0
        L_0x0022:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0224 }
            X.0rf r0 = (X.C17590rf) r0     // Catch:{ all -> 0x0224 }
            boolean r0 = r0.BoS()     // Catch:{ all -> 0x0224 }
            r2 = r2 | r0
            goto L_0x0022
        L_0x0034:
            r0 = 3
            if (r2 == 0) goto L_0x0038
            r0 = 1
        L_0x0038:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0224 }
            r14.A03 = r0     // Catch:{ all -> 0x0224 }
            goto L_0x0051
        L_0x003f:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0224 }
            if (r0 != r4) goto L_0x0051
            java.lang.String r0 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0224 }
        L_0x004b:
            throw r0     // Catch:{ all -> 0x0224 }
        L_0x004c:
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            X.AnonymousClass006.A08(r2, r0)     // Catch:{ all -> 0x0224 }
        L_0x0051:
            java.lang.Integer r0 = r14.A03     // Catch:{ all -> 0x0224 }
            X.AnonymousClass006.A01(r0)     // Catch:{ all -> 0x0224 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0224 }
            r29.lock()     // Catch:{ all -> 0x0224 }
            r0 = 3
            if (r2 == r0) goto L_0x0066
            if (r2 == r1) goto L_0x0066
            if (r2 == r4) goto L_0x0067
            r4 = r2
            goto L_0x0068
        L_0x0066:
            r4 = r2
        L_0x0067:
            r3 = 1
        L_0x0068:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "Illegal sign-in mode: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r2, r4)     // Catch:{ all -> 0x0217 }
            X.AnonymousClass006.A07(r3, r0)     // Catch:{ all -> 0x0217 }
            java.lang.Integer r0 = r14.A03     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x00a2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0217 }
            r14.A03 = r0     // Catch:{ all -> 0x0217 }
        L_0x007f:
            X.0r9 r0 = r14.A02     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x01d9
            java.util.Map r5 = r14.A0B     // Catch:{ all -> 0x0217 }
            java.util.Iterator r6 = X.AnonymousClass000.A0z(r5)     // Catch:{ all -> 0x0217 }
            r4 = 0
            r3 = 0
        L_0x008b:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0217 }
            X.0rf r2 = (X.C17590rf) r2     // Catch:{ all -> 0x0217 }
            boolean r0 = r2.BoS()     // Catch:{ all -> 0x0217 }
            r4 = r4 | r0
            boolean r0 = r2.BmV()     // Catch:{ all -> 0x0217 }
            r3 = r3 | r0
            goto L_0x008b
        L_0x00a2:
            int r3 = r0.intValue()     // Catch:{ all -> 0x0217 }
            if (r3 == r4) goto L_0x007f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "Cannot use sign-in mode: "
            r2.append(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x01dd
        L_0x00b3:
            java.lang.Integer r0 = r14.A03     // Catch:{ all -> 0x0217 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0217 }
            if (r2 == r1) goto L_0x0184
            r0 = 2
            if (r2 != r0) goto L_0x0190
            if (r4 == 0) goto L_0x0190
            android.content.Context r0 = r14.A04     // Catch:{ all -> 0x0217 }
            r16 = r0
            android.os.Looper r15 = r14.A05     // Catch:{ all -> 0x0217 }
            X.0Bd r13 = r14.A06     // Catch:{ all -> 0x0217 }
            X.0TT r12 = r14.A09     // Catch:{ all -> 0x0217 }
            java.util.Map r2 = r14.A0C     // Catch:{ all -> 0x0217 }
            X.0JC r11 = r14.A07     // Catch:{ all -> 0x0217 }
            java.util.ArrayList r10 = r14.A0A     // Catch:{ all -> 0x0217 }
            X.008 r9 = new X.008     // Catch:{ all -> 0x0217 }
            r9.<init>()     // Catch:{ all -> 0x0217 }
            X.008 r8 = new X.008     // Catch:{ all -> 0x0217 }
            r8.<init>()     // Catch:{ all -> 0x0217 }
            java.util.Iterator r6 = X.AnonymousClass000.A0y(r5)     // Catch:{ all -> 0x0217 }
            r20 = 0
        L_0x00e0:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x010a
            java.util.Map$Entry r5 = X.AnonymousClass000.A11(r6)     // Catch:{ all -> 0x0217 }
            java.lang.Object r4 = r5.getValue()     // Catch:{ all -> 0x0217 }
            X.0rf r4 = (X.C17590rf) r4     // Catch:{ all -> 0x0217 }
            boolean r0 = r4.BmV()     // Catch:{ all -> 0x0217 }
            if (r1 != r0) goto L_0x00f8
            r20 = r4
        L_0x00f8:
            boolean r3 = r4.BoS()     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x0217 }
            if (r3 == 0) goto L_0x0106
            r9.put(r0, r4)     // Catch:{ all -> 0x0217 }
            goto L_0x00e0
        L_0x0106:
            r8.put(r0, r4)     // Catch:{ all -> 0x0217 }
            goto L_0x00e0
        L_0x010a:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0217 }
            r1 = r0 ^ 1
            java.lang.String r0 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            X.AnonymousClass006.A08(r1, r0)     // Catch:{ all -> 0x0217 }
            X.008 r7 = new X.008     // Catch:{ all -> 0x0217 }
            r7.<init>()     // Catch:{ all -> 0x0217 }
            X.008 r6 = new X.008     // Catch:{ all -> 0x0217 }
            r6.<init>()     // Catch:{ all -> 0x0217 }
            java.util.Iterator r4 = X.AnonymousClass000.A10(r2)     // Catch:{ all -> 0x0217 }
        L_0x0123:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0217 }
            X.0Sq r1 = (X.C06190Sq) r1     // Catch:{ all -> 0x0217 }
            X.0QI r3 = r1.A01     // Catch:{ all -> 0x0217 }
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x013f
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0217 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0123
        L_0x013f:
            boolean r0 = r8.containsKey(r3)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0210
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0217 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0123
        L_0x014d:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0217 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0217 }
            int r3 = r10.size()     // Catch:{ all -> 0x0217 }
            r2 = 0
        L_0x015a:
            if (r2 >= r3) goto L_0x01bb
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x0217 }
            X.0dl r1 = (X.C10140dl) r1     // Catch:{ all -> 0x0217 }
            X.0Sq r0 = r1.A01     // Catch:{ all -> 0x0217 }
            boolean r0 = r7.containsKey(r0)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x016e
            r5.add(r1)     // Catch:{ all -> 0x0217 }
            goto L_0x0179
        L_0x016e:
            X.0Sq r0 = r1.A01     // Catch:{ all -> 0x0217 }
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x017c
            r4.add(r1)     // Catch:{ all -> 0x0217 }
        L_0x0179:
            int r2 = r2 + 1
            goto L_0x015a
        L_0x017c:
            java.lang.String r0 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0216
        L_0x0184:
            if (r4 == 0) goto L_0x01b4
            if (r3 == 0) goto L_0x0190
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0216
        L_0x0190:
            android.content.Context r8 = r14.A04     // Catch:{ all -> 0x0217 }
            android.os.Looper r7 = r14.A05     // Catch:{ all -> 0x0217 }
            X.0Bd r6 = r14.A06     // Catch:{ all -> 0x0217 }
            X.0TT r4 = r14.A09     // Catch:{ all -> 0x0217 }
            java.util.Map r3 = r14.A0C     // Catch:{ all -> 0x0217 }
            X.0JC r2 = r14.A07     // Catch:{ all -> 0x0217 }
            java.util.ArrayList r1 = r14.A0A     // Catch:{ all -> 0x0217 }
            X.0e5 r0 = new X.0e5     // Catch:{ all -> 0x0217 }
            r9 = r0
            r10 = r8
            r11 = r7
            r12 = r6
            r13 = r2
            r15 = r14
            r16 = r4
            r17 = r1
            r18 = r5
            r19 = r3
            r20 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0217 }
            goto L_0x01d7
        L_0x01b4:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0216
        L_0x01bb:
            X.0e4 r0 = new X.0e4     // Catch:{ all -> 0x0217 }
            r24 = r4
            r25 = r9
            r26 = r8
            r27 = r7
            r28 = r6
            r21 = r14
            r22 = r12
            r23 = r5
            r17 = r15
            r18 = r13
            r19 = r11
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0217 }
        L_0x01d7:
            r14.A02 = r0     // Catch:{ all -> 0x0217 }
        L_0x01d9:
            A00(r14)     // Catch:{ all -> 0x0217 }
            goto L_0x021d
        L_0x01dd:
            if (r4 == r1) goto L_0x01eb
            r0 = 2
            if (r4 == r0) goto L_0x01e8
            r0 = 3
            if (r4 == r0) goto L_0x01ee
            java.lang.String r0 = "UNKNOWN"
            goto L_0x01f0
        L_0x01e8:
            java.lang.String r0 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01f0
        L_0x01eb:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x01f0
        L_0x01ee:
            java.lang.String r0 = "SIGN_IN_MODE_NONE"
        L_0x01f0:
            r2.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = ". Mode was already set to "
            r2.append(r0)     // Catch:{ all -> 0x0217 }
            if (r3 == r1) goto L_0x0206
            r0 = 2
            if (r3 == r0) goto L_0x0203
            r0 = 3
            if (r3 == r0) goto L_0x0209
            java.lang.String r0 = "UNKNOWN"
            goto L_0x020b
        L_0x0203:
            java.lang.String r0 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x020b
        L_0x0206:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x020b
        L_0x0209:
            java.lang.String r0 = "SIGN_IN_MODE_NONE"
        L_0x020b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r2)     // Catch:{ all -> 0x0217 }
            goto L_0x0216
        L_0x0210:
            java.lang.String r0 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0217 }
        L_0x0216:
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x0217:
            r0 = move-exception
            r29.unlock()     // Catch:{ all -> 0x0224 }
            goto L_0x004b
        L_0x021d:
            r29.unlock()     // Catch:{ all -> 0x0224 }
            r29.unlock()
            return
        L_0x0224:
            r0 = move-exception
            r29.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JO.A08():void");
    }

    public final void A09() {
        boolean z;
        Lock lock = this.A0E;
        lock.lock();
        try {
            Set set = this.A08.A01;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.A08.set((Object) null);
                synchronized (basePendingResult.A05) {
                    if (((AnonymousClass0XK) basePendingResult.A06.get()) == null || !basePendingResult.A02) {
                        basePendingResult.A04();
                    }
                    z = basePendingResult.A01;
                }
                if (z) {
                    set.remove(basePendingResult);
                }
            }
            C17350r9 r0 = this.A02;
            if (r0 != null) {
                r0.By3();
            }
            Set<C06200Sr> set2 = this.A0G.A00;
            for (C06200Sr r1 : set2) {
                r1.A02 = null;
                r1.A01 = null;
            }
            set2.clear();
            Queue<AnonymousClass0JS> queue = this.A0D;
            for (AnonymousClass0JS r2 : queue) {
                r2.A08.set((Object) null);
                r2.A04();
            }
            queue.clear();
            if (this.A02 != null) {
                A0D();
                AnonymousClass0ZZ r12 = this.A0J;
                r12.A08 = false;
                r12.A07.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    public final boolean A0A() {
        C17350r9 r0 = this.A02;
        if (r0 == null || !r0.By6()) {
            return false;
        }
        return true;
    }

    public final boolean A0B(C15910oD r3) {
        C17350r9 r0 = this.A02;
        if (r0 == null || !r0.By7(r3)) {
            return false;
        }
        return true;
    }

    public final String A0C() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append("").append("mContext=").println(this.A04);
        printWriter.append("").append("mResuming=").print(this.A0K);
        printWriter.append(" mWorkQueue.size()=").print(this.A0D.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A08.A01.size());
        C17350r9 r0 = this.A02;
        if (r0 != null) {
            r0.By4("", (FileDescriptor) null, printWriter, (String[]) null);
        }
        return stringWriter.toString();
    }

    public final boolean A0D() {
        boolean z = false;
        if (this.A0K) {
            this.A0K = false;
            AnonymousClass0MH r1 = this.A0H;
            r1.removeMessages(2);
            z = true;
            r1.removeMessages(1);
            C03080Dc r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                this.A00 = null;
            }
        }
        return z;
    }

    public final void Bxl(AnonymousClass0L0 r9) {
        AtomicInteger atomicInteger;
        Context context = this.A04;
        int i = r9.A01;
        boolean z = C02620Be.A00;
        if (i != 18 && (i != 1 || !C02620Be.A03(context))) {
            A0D();
        }
        if (!this.A0K) {
            AnonymousClass0ZZ r7 = this.A0J;
            Handler handler = r7.A01;
            if (Looper.myLooper() == handler.getLooper()) {
                handler.removeMessages(1);
                synchronized (r7.A03) {
                    ArrayList arrayList = r7.A06;
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    atomicInteger = r7.A07;
                    int i2 = atomicInteger.get();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C17620ri r1 = (C17620ri) it.next();
                        if (!r7.A08 || atomicInteger.get() != i2) {
                            break;
                        } else if (arrayList.contains(r1)) {
                            r1.onConnectionFailed(r9);
                        }
                    }
                }
                r7.A08 = false;
                atomicInteger.incrementAndGet();
                return;
            }
            throw AnonymousClass001.A09("onConnectionFailure must only be called on the Handler thread");
        }
    }

    public final void Bxo(Bundle bundle) {
        IllegalStateException illegalStateException;
        while (true) {
            Queue queue = this.A0D;
            if (queue.isEmpty()) {
                break;
            }
            A06((AnonymousClass0JS) queue.remove());
        }
        AnonymousClass0ZZ r6 = this.A0J;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            synchronized (r6.A03) {
                if (!r6.A00) {
                    handler.removeMessages(1);
                    r6.A00 = true;
                    ArrayList arrayList = r6.A04;
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(r6.A05);
                        AtomicInteger atomicInteger = r6.A07;
                        int i = atomicInteger.get();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C17610rh r1 = (C17610rh) it.next();
                            if (!r6.A08 || !r6.A02.isConnected() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(r1)) {
                                r1.onConnected(bundle);
                            }
                        }
                        arrayList.clear();
                        r6.A00 = false;
                    } else {
                        illegalStateException = new IllegalStateException();
                    }
                } else {
                    illegalStateException = new IllegalStateException();
                }
                throw illegalStateException;
            }
            return;
        }
        throw AnonymousClass001.A09("onConnectionSuccess must only be called on the Handler thread");
    }

    public AnonymousClass0JO(Context context, Looper looper, C02610Bd r10, AnonymousClass0JC r11, AnonymousClass0TT r12, ArrayList arrayList, List list, List list2, Map map, Map map2, Lock lock) {
        C10450eG r1 = new C10450eG(this);
        this.A0I = r1;
        this.A04 = context;
        this.A0E = lock;
        this.A0J = new AnonymousClass0ZZ(looper, r1);
        this.A05 = looper;
        this.A0H = new AnonymousClass0MH(looper, this);
        this.A06 = r10;
        this.A0F = -1;
        this.A0C = map;
        this.A0B = map2;
        this.A0A = arrayList;
        this.A08 = new AnonymousClass0WV();
        for (Object next : list) {
            AnonymousClass0ZZ r5 = this.A0J;
            AnonymousClass006.A01(next);
            synchronized (r5.A03) {
                ArrayList arrayList2 = r5.A05;
                if (arrayList2.contains(next)) {
                    String valueOf = String.valueOf(next);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("registerConnectionCallbacks(): listener ");
                    A0u.append(valueOf);
                    A0u.append(" is already registered");
                    AnonymousClass000.A1A(A0u, "GmsClientEvents");
                } else {
                    arrayList2.add(next);
                }
            }
            if (r5.A02.isConnected()) {
                AnonymousClass000.A14(r5.A01, next, 1);
            }
        }
        for (Object next2 : list2) {
            AnonymousClass0ZZ r0 = this.A0J;
            AnonymousClass006.A01(next2);
            synchronized (r0.A03) {
                ArrayList arrayList3 = r0.A06;
                if (arrayList3.contains(next2)) {
                    String valueOf2 = String.valueOf(next2);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("registerConnectionFailedListener(): listener ");
                    A0u2.append(valueOf2);
                    A0u2.append(" is already registered");
                    AnonymousClass000.A1A(A0u2, "GmsClientEvents");
                } else {
                    arrayList3.add(next2);
                }
            }
        }
        this.A09 = r12;
        this.A07 = r11;
    }
}
