package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.0e6  reason: invalid class name and case insensitive filesystem */
public final class C10350e6 implements C17600rg, C17610rh, C17620ri {
    public int A00 = 0;
    public AnonymousClass0L0 A01 = null;
    public boolean A02;
    public final int A03;
    public final C17590rf A04;
    public final AnonymousClass0US A05;
    public final AnonymousClass0WT A06;
    public final List A07 = AnonymousClass001.A0I();
    public final Map A08 = AnonymousClass001.A0J();
    public final Queue A09 = new LinkedList();
    public final AnonymousClass0N2 A0A;
    public final Set A0B = new HashSet();
    public final /* synthetic */ C07720Za A0C;

    public C10350e6(C07590Yl r13, C07720Za r14) {
        this.A0C = r14;
        Handler handler = r14.A06;
        Looper looper = handler.getLooper();
        AnonymousClass0TD A032 = r13.A03();
        C000000a r11 = A032.A00;
        AnonymousClass0TT r6 = new AnonymousClass0TT(A032.A01, A032.A02, A032.A03, (Map) null, r11);
        AnonymousClass0JC r1 = r13.A04.A00;
        AnonymousClass006.A01(r1);
        C17590rf A002 = r1.A00(r13.A01, looper, this, this, r6, r13.A03);
        String str = r13.A08;
        if (str != null && (A002 instanceof C07560Yg)) {
            ((C07560Yg) A002).A0R = str;
        }
        this.A04 = A002;
        this.A05 = r13.A06;
        this.A06 = new AnonymousClass0WT();
        this.A03 = r13.A00;
        if (A002.BoS()) {
            Context context = r14.A05;
            AnonymousClass0TD A033 = r13.A03();
            C000000a r112 = A033.A00;
            this.A0A = new AnonymousClass0N2(context, handler, new AnonymousClass0TT(A033.A01, A033.A02, A033.A03, (Map) null, r112));
        }
    }

    public final void Bxm(AnonymousClass0L0 r2, C06190Sq r3, boolean z) {
        throw null;
    }

    public final void onConnectionFailed(AnonymousClass0L0 r2) {
        A0B(r2, (Exception) null);
    }

    private final void A00(AnonymousClass0L0 r4) {
        Set set = this.A0B;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            if (AnonymousClass0QM.A00(r4, AnonymousClass0L0.A04)) {
                C07560Yg r1 = (C07560Yg) this.A04;
                if (!r1.isConnected() || r1.A0A == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
            }
            throw AnonymousClass001.A0A("zac");
        }
        set.clear();
    }

    public static final void A01(Status status, C10350e6 r3) {
        AnonymousClass006.A00(r3.A0C.A06);
        r3.A02(status, (Exception) null, false);
    }

    private final void A02(Status status, Exception exc, boolean z) {
        AnonymousClass006.A00(this.A0C.A06);
        boolean z2 = false;
        boolean z3 = true;
        if (status != null) {
            z3 = false;
        }
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                AnonymousClass0XC r2 = (AnonymousClass0XC) it.next();
                if (!z || r2.A00 == 2) {
                    if (status != null) {
                        r2.A01(status);
                    } else {
                        r2.A04(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw AnonymousClass001.A08("Status XOR exception should be null");
    }

    public static final void A03(C10350e6 r6) {
        Queue queue = r6.A09;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AnonymousClass0XC r1 = (AnonymousClass0XC) arrayList.get(i);
            if (r6.A04.isConnected()) {
                if (r6.A08(r1)) {
                    queue.remove(r1);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static final void A04(C10350e6 r4) {
        Handler handler = r4.A0C.A06;
        AnonymousClass006.A00(handler);
        r4.A01 = null;
        r4.A00(AnonymousClass0L0.A04);
        if (r4.A02) {
            AnonymousClass0US r1 = r4.A05;
            handler.removeMessages(11, r1);
            handler.removeMessages(9, r1);
            r4.A02 = false;
        }
        Iterator A0z = AnonymousClass000.A0z(r4.A08);
        while (A0z.hasNext()) {
            C06240Sv r0 = ((C06230Su) A0z.next()).A00;
            try {
                r0.A02.A02.B04(r4.A04, new TaskCompletionSource());
            } catch (DeadObjectException unused) {
                r4.onConnectionSuspended(3);
                r4.A04.B5Y("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                A0z.remove();
            }
        }
        A03(r4);
        A05(r4);
    }

    public static final void A05(C10350e6 r5) {
        C07720Za r4 = r5.A0C;
        Handler handler = r4.A06;
        AnonymousClass0US r1 = r5.A05;
        handler.removeMessages(12, r1);
        handler.sendMessageDelayed(handler.obtainMessage(12, r1), r4.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0068 A[LOOP:0: B:7:0x0062->B:9:0x0068, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C10350e6 r7, int r8) {
        /*
            X.0Za r5 = r7.A0C
            android.os.Handler r4 = r5.A06
            X.AnonymousClass006.A00(r4)
            r0 = 0
            r7.A01 = r0
            r0 = 1
            r7.A02 = r0
            X.0WT r6 = r7.A06
            X.0rf r0 = r7.A04
            X.0Yg r0 = (X.C07560Yg) r0
            java.lang.String r2 = r0.A0S
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r3 = 1
            if (r8 != r3) goto L_0x0074
            java.lang.String r0 = " due to service disconnection."
        L_0x0021:
            r1.append(r0)
        L_0x0024:
            if (r2 == 0) goto L_0x002e
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L_0x002e:
            r2 = 20
            java.lang.String r1 = r1.toString()
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            X.AnonymousClass0WT.A00(r0, r6, r3)
            X.0US r3 = r7.A05
            r0 = 9
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.0Wm r0 = r5.A08
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A08
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r0)
        L_0x0062:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r1.next()
            X.0Su r0 = (X.C06230Su) r0
            java.lang.Runnable r0 = r0.A02
            r0.run()
            goto L_0x0062
        L_0x0074:
            r0 = 3
            if (r8 != r0) goto L_0x0024
            java.lang.String r0 = " due to dead object exception."
            goto L_0x0021
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10350e6.A06(X.0e6, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A07(X.AnonymousClass0L0 r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C07720Za.A0I
            monitor-enter(r4)
            X.0Za r2 = r5.A0C     // Catch:{ all -> 0x003d }
            X.0JX r0 = r2.A01     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003a
            java.util.Set r1 = r2.A0A     // Catch:{ all -> 0x003d }
            X.0US r0 = r5.A05     // Catch:{ all -> 0x003d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003a
            X.0JX r3 = r2.A01     // Catch:{ all -> 0x003d }
            int r0 = r5.A03     // Catch:{ all -> 0x003d }
            X.0Sf r2 = new X.0Sf     // Catch:{ all -> 0x003d }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicReference r1 = r3.A04     // Catch:{ all -> 0x003d }
        L_0x001e:
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0031
            android.os.Handler r1 = r3.A00     // Catch:{ all -> 0x003d }
            X.0gY r0 = new X.0gY     // Catch:{ all -> 0x003d }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x003d }
            r1.post(r0)     // Catch:{ all -> 0x003d }
        L_0x002f:
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            goto L_0x0038
        L_0x0031:
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001e
            goto L_0x002f
        L_0x0038:
            r0 = 1
            return r0
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            r0 = 0
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10350e6.A07(X.0L0):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r7 = (X.C04160Jm) r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(X.AnonymousClass0XC r20) {
        /*
            r19 = this;
            r12 = r20
            boolean r0 = r12 instanceof X.C04160Jm
            r6 = 1
            r5 = r19
            if (r0 == 0) goto L_0x0104
            r7 = r12
            X.0Jm r7 = (X.C04160Jm) r7
            X.0Ky[] r11 = r7.A06(r5)
            if (r11 == 0) goto L_0x0104
            int r10 = r11.length
            if (r10 == 0) goto L_0x0104
            X.0rf r9 = r5.A04
            r0 = r9
            X.0Yg r0 = (X.C07560Yg) r0
            X.0Kx r0 = r0.A0Q
            if (r0 != 0) goto L_0x0046
            r14 = 0
        L_0x001f:
            r8 = 0
            if (r14 != 0) goto L_0x0024
            X.0Ky[] r14 = new X.C04520Ky[r8]
        L_0x0024:
            int r13 = r14.length
            X.008 r4 = new X.008
            r4.<init>((int) r13)
            r3 = 0
        L_0x002b:
            if (r3 >= r13) goto L_0x004b
            r15 = r14[r3]
            java.lang.String r2 = r15.A02
            long r0 = r15.A01
            r17 = -1
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 != 0) goto L_0x003c
            int r0 = r15.A00
            long r0 = (long) r0
        L_0x003c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r2, r0)
            int r3 = r3 + 1
            goto L_0x002b
        L_0x0046:
            X.0Ky[] r14 = r0.A03
            goto L_0x001f
        L_0x0049:
            if (r8 >= r10) goto L_0x0104
        L_0x004b:
            r3 = r11[r8]
            java.lang.String r0 = r3.A02
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x006d
            long r15 = r0.longValue()
            long r1 = r3.A01
            r13 = -1
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            int r0 = r3.A00
            long r1 = (long) r0
        L_0x0066:
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006d
            int r8 = r8 + 1
            goto L_0x0049
        L_0x006d:
            java.lang.String r4 = X.AnonymousClass000.A0k(r9)
            java.lang.String r10 = r3.A02
            long r1 = r3.A01
            r8 = -1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            int r0 = r3.A00
            long r1 = (long) r0
        L_0x007e:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0v(r4)
            java.lang.String r0 = " could not execute call because it requires feature ("
            r4.append(r0)
            r4.append(r10)
            java.lang.String r0 = ", "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ")."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r4)
            java.lang.String r0 = "GoogleApiManager"
            android.util.Log.w(r0, r1)
            X.0Za r4 = r5.A0C
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x00fb
            boolean r0 = r7.A05(r5)
            if (r0 == 0) goto L_0x00fb
            X.0US r0 = r5.A05
            r6 = 0
            X.0Uf r7 = new X.0Uf
            r7.<init>(r3, r0)
            java.util.List r2 = r5.A07
            int r0 = r2.indexOf(r7)
            r1 = 15
            if (r0 < 0) goto L_0x00cf
            java.lang.Object r0 = r2.get(r0)
            android.os.Handler r3 = r4.A06
            r3.removeMessages(r1, r0)
            android.os.Message r2 = android.os.Message.obtain(r3, r1, r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.sendMessageDelayed(r2, r0)
        L_0x00cd:
            r0 = 0
            return r0
        L_0x00cf:
            r2.add(r7)
            android.os.Handler r3 = r4.A06
            android.os.Message r2 = android.os.Message.obtain(r3, r1, r7)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.sendMessageDelayed(r2, r0)
            r0 = 16
            android.os.Message r2 = android.os.Message.obtain(r3, r0, r7)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r3.sendMessageDelayed(r2, r0)
            r0 = 2
            X.0L0 r1 = new X.0L0
            r1.<init>(r0, r6)
            boolean r0 = r5.A07(r1)
            if (r0 != 0) goto L_0x00cd
            int r0 = r5.A03
            r4.A09(r1, r0)
            goto L_0x00cd
        L_0x00fb:
            X.0je r0 = new X.0je
            r0.<init>(r3)
            r7.A04(r0)
            return r6
        L_0x0104:
            X.0WT r2 = r5.A06
            X.0rf r1 = r5.A04
            boolean r0 = r1.BoS()
            r12.A02(r2, r0)
            r12.A03(r5)     // Catch:{ DeadObjectException -> 0x0113 }
            goto L_0x011c
        L_0x0113:
            r5.onConnectionSuspended(r6)
            java.lang.String r0 = "DeadObjectException thrown while running ApiCallRunner."
            r1.B5Y(r0)
            return r6
        L_0x011c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10350e6.A08(X.0XC):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.0re, X.0rf] */
    public final void A09() {
        C07720Za r5 = this.A0C;
        AnonymousClass006.A00(r5.A06);
        C17590rf r4 = this.A04;
        if (!r4.isConnected() && !r4.BLT()) {
            try {
                int A002 = r5.A08.A00(r5.A05, r4);
                if (A002 != 0) {
                    AnonymousClass0L0 r52 = new AnonymousClass0L0(A002, (PendingIntent) null);
                    String A0k = AnonymousClass000.A0k(r4);
                    String obj = r52.toString();
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("The service for ");
                    A0u.append(A0k);
                    A0u.append(" is not available: ");
                    A0u.append(obj);
                    AnonymousClass000.A1A(A0u, "GoogleApiManager");
                    A0B(r52, (Exception) null);
                    return;
                }
                C10400eB r3 = new C10400eB(r4, this.A05, r5);
                if (r4.BoS()) {
                    AnonymousClass0N2 r8 = this.A0A;
                    AnonymousClass006.A01(r8);
                    C17580re r0 = r8.A01;
                    if (r0 != null) {
                        r0.B5X();
                    }
                    AnonymousClass0TT r10 = r8.A05;
                    r10.A00 = Integer.valueOf(System.identityHashCode(r8));
                    AnonymousClass0JC r53 = r8.A04;
                    Context context = r8.A02;
                    Handler handler = r8.A03;
                    r8.A01 = r53.A00(context, handler.getLooper(), r8, r8, r10, r10.A01);
                    r8.A00 = r3;
                    Set set = r8.A06;
                    if (set == null || set.isEmpty()) {
                        handler.post(new C11310g4(r8));
                    } else {
                        C07560Yg r1 = (C07560Yg) r8.A01;
                        r1.B3T(new C10380e9(r1));
                    }
                }
                try {
                    r4.B3T(r3);
                } catch (SecurityException e) {
                    A0B(new AnonymousClass0L0(10), e);
                }
            } catch (IllegalStateException e2) {
                A0B(new AnonymousClass0L0(10), e2);
            }
        }
    }

    public final void A0A() {
        AnonymousClass006.A00(this.A0C.A06);
        Status status = C07720Za.A0G;
        A01(status, this);
        AnonymousClass0WT.A00(status, this.A06, false);
        for (AnonymousClass0UL r2 : (AnonymousClass0UL[]) this.A08.keySet().toArray(new AnonymousClass0UL[0])) {
            A0C(new C04140Jk(r2, new TaskCompletionSource()));
        }
        A00(new AnonymousClass0L0(4));
        if (this.A04.isConnected()) {
            AnonymousClass0SP r22 = new AnonymousClass0SP(this);
            r22.A00.A0C.A06.post(new C11300g3(r22));
        }
    }

    public final void A0B(AnonymousClass0L0 r9, Exception exc) {
        Status A002;
        C17580re r0;
        C07720Za r5 = this.A0C;
        Handler handler = r5.A06;
        AnonymousClass006.A00(handler);
        AnonymousClass0N2 r02 = this.A0A;
        if (!(r02 == null || (r0 = r02.A01) == null)) {
            r0.B5X();
        }
        AnonymousClass006.A00(handler);
        this.A01 = null;
        r5.A08.A01.clear();
        A00(r9);
        if ((this.A04 instanceof AnonymousClass0Jt) && r9.A01 != 24) {
            r5.A03 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        int i = r9.A01;
        if (i == 4) {
            A002 = C07720Za.A0H;
        } else {
            Queue queue = this.A09;
            if (queue.isEmpty()) {
                this.A01 = r9;
                return;
            } else if (exc != null) {
                AnonymousClass006.A00(handler);
                A02((Status) null, exc, false);
                return;
            } else {
                boolean z = r5.A0E;
                AnonymousClass0US r1 = this.A05;
                if (z) {
                    A02(C07720Za.A00(r9, r1), (Exception) null, true);
                    if (!queue.isEmpty() && !A07(r9) && !r5.A09(r9, this.A03)) {
                        if (i == 18) {
                            this.A02 = true;
                        }
                        if (this.A02) {
                            handler.sendMessageDelayed(Message.obtain(handler, 9, r1), 5000);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                A002 = C07720Za.A00(r9, r1);
            }
        }
        A01(A002, this);
    }

    public final void A0C(AnonymousClass0XC r3) {
        AnonymousClass006.A00(this.A0C.A06);
        if (!this.A04.isConnected()) {
            this.A09.add(r3);
            AnonymousClass0L0 r1 = this.A01;
            if (r1 == null || !r1.A00()) {
                A09();
            } else {
                A0B(r1, (Exception) null);
            }
        } else if (A08(r3)) {
            A05(this);
        } else {
            this.A09.add(r3);
        }
    }

    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A04(this);
        } else {
            handler.post(new C11290g2(this));
        }
    }

    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A06(this, i);
        } else {
            handler.post(new C11540gU(this, i));
        }
    }
}
