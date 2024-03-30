package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0e4  reason: invalid class name and case insensitive filesystem */
public final class C10330e4 implements C17350r9 {
    public int A00 = 0;
    public Bundle A01;
    public AnonymousClass0L0 A02 = null;
    public AnonymousClass0L0 A03 = null;
    public boolean A04 = false;
    public final Context A05;
    public final C17590rf A06;
    public final AnonymousClass0JO A07;
    public final C10340e5 A08;
    public final C10340e5 A09;
    public final Map A0A;
    public final Lock A0B;
    public final Looper A0C;
    public final Set A0D = Collections.newSetFromMap(new WeakHashMap());

    public final void By2() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A08.By2();
        this.A09.By2();
    }

    public final void By3() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A08.By3();
        this.A09.By3();
        A00();
    }

    private final void A00() {
        Set<C15910oD> set = this.A0D;
        for (C15910oD r0 : set) {
            ((C03750Ho) r0).A00.release();
        }
        set.clear();
    }

    private final void A01(AnonymousClass0L0 r4) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A07.Bxl(r4);
        }
        A00();
        this.A00 = 0;
    }

    public static /* bridge */ /* synthetic */ void A02(C10330e4 r4) {
        AnonymousClass0L0 r2 = r4.A02;
        if (r2 != null) {
            int i = r2.A01;
            AnonymousClass0L0 r3 = r4.A03;
            if (i == 0) {
                if (r3 != null) {
                    int i2 = r3.A01;
                    if (AnonymousClass000.A1Q(i2) || i2 == 4) {
                        int i3 = r4.A00;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                                r4.A00 = 0;
                            }
                            AnonymousClass0JO r1 = r4.A07;
                            AnonymousClass006.A01(r1);
                            r1.Bxo(r4.A01);
                        }
                        r4.A00();
                        r4.A00 = 0;
                    } else if (r4.A00 == 1) {
                        r4.A00();
                    } else {
                        r4.A01(r3);
                        r4.A08.By3();
                    }
                }
            } else if (r3 != null) {
                int i4 = r3.A01;
                C10340e5 r0 = r4.A09;
                if (i4 == 0) {
                    r0.By3();
                    r2 = r4.A02;
                    AnonymousClass006.A01(r2);
                } else if (r0.A00 < r4.A08.A00) {
                    r2 = r3;
                }
                r4.A01(r2);
            }
        }
    }

    public final AnonymousClass0JS Bxu(AnonymousClass0JS r10) {
        PendingIntent activity;
        Object obj = this.A0A.get(r10.A00);
        AnonymousClass006.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C10340e5 r2 = this.A09;
        if (obj.equals(r2)) {
            AnonymousClass0L0 r0 = this.A03;
            if (r0 != null && r0.A01 == 4) {
                C17590rf r1 = this.A06;
                if (r1 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r1.BHZ(), AnonymousClass0RP.A00 | 134217728);
                }
                r10.A0B(new Status(activity, (AnonymousClass0L0) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r2 = this.A08;
        }
        r2.Bxu(r10);
        return r10;
    }

    public final AnonymousClass0JS Bxx(AnonymousClass0JS r10) {
        PendingIntent activity;
        Object obj = this.A0A.get(r10.A00);
        AnonymousClass006.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C10340e5 r2 = this.A09;
        if (obj.equals(r2)) {
            AnonymousClass0L0 r0 = this.A03;
            if (r0 != null && r0.A01 == 4) {
                C17590rf r1 = this.A06;
                if (r1 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r1.BHZ(), AnonymousClass0RP.A00 | 134217728);
                }
                r10.A0B(new Status(activity, (AnonymousClass0L0) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r2 = this.A08;
        }
        return r2.Bxx(r10);
    }

    public final void By4(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("").append("authClient").println(":");
        this.A09.By4(String.valueOf("").concat("  "), (FileDescriptor) null, printWriter, (String[]) null);
        printWriter.append("").append("anonClient").println(":");
        this.A08.By4(String.valueOf("").concat("  "), (FileDescriptor) null, printWriter, (String[]) null);
    }

    public final void By5() {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            boolean A1S = AnonymousClass000.A1S(this.A00, 2);
            lock.unlock();
            this.A09.By3();
            this.A03 = new AnonymousClass0L0(4);
            if (A1S) {
                new AnonymousClass0E7(this.A0C).post(new C11320g5(this));
            } else {
                A00();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5.A00 == 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean By6() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r4 = r5.A0B
            r4.lock()
            X.0e5 r0 = r5.A08     // Catch:{ all -> 0x002a }
            X.0r8 r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C10280dz     // Catch:{ all -> 0x002a }
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            X.0e5 r0 = r5.A09     // Catch:{ all -> 0x002a }
            X.0r8 r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C10280dz     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0025
            X.0L0 r0 = r5.A03     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0021
            int r1 = r0.A01     // Catch:{ all -> 0x002a }
            r0 = 4
            if (r1 != r0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r0 = r5.A00     // Catch:{ all -> 0x002a }
            if (r0 != r2) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r4.unlock()
            return r3
        L_0x002a:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10330e4.By6():boolean");
    }

    public final boolean By7(C15910oD r5) {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            if (AnonymousClass000.A1S(this.A00, 2) || By6()) {
                C10340e5 r2 = this.A09;
                if (!(r2.A0E instanceof C10280dz)) {
                    this.A0D.add(r5);
                    if (this.A00 == 0) {
                        this.A00 = 1;
                    }
                    this.A03 = null;
                    r2.By2();
                    return true;
                }
            }
            lock.unlock();
            return false;
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    public C10330e4(Context context, Looper looper, C02600Bc r29, AnonymousClass0JC r30, C17590rf r31, AnonymousClass0JO r32, AnonymousClass0TT r33, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Map map3, Map map4, Lock lock) {
        Context context2 = context;
        this.A05 = context2;
        AnonymousClass0JO r9 = r32;
        this.A07 = r9;
        Lock lock2 = lock;
        this.A0B = lock2;
        Looper looper2 = looper;
        this.A0C = looper2;
        this.A06 = r31;
        C02600Bc r7 = r29;
        Map map5 = map2;
        this.A08 = new C10340e5(context2, looper2, r7, (AnonymousClass0JC) null, r9, new C10310e2(this), (AnonymousClass0TT) null, arrayList2, map5, map4, lock2);
        Map map6 = map;
        this.A09 = new C10340e5(context2, looper2, r7, r30, r9, new C10320e3(this), r33, arrayList, map6, map3, lock2);
        AnonymousClass008 r4 = new AnonymousClass008();
        Iterator A10 = AnonymousClass000.A10(map5);
        while (A10.hasNext()) {
            r4.put(A10.next(), this.A08);
        }
        Iterator A102 = AnonymousClass000.A10(map6);
        while (A102.hasNext()) {
            r4.put(A102.next(), this.A09);
        }
        this.A0A = Collections.unmodifiableMap(r4);
    }
}
