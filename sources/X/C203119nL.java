package X;

import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.9nL  reason: invalid class name and case insensitive filesystem */
public final class C203119nL {
    public static final ThreadLocal A09 = new C1511078g();
    public static volatile C203119nL A0A;
    public C166087v0 A00;
    public final SparseArray A01;
    public final MmapBufferManager A02;
    public final File A03;
    public final AtomicInteger A04 = C90484aE.A0v();
    public final AtomicReference A05;
    public final AtomicReferenceArray A06 = new AtomicReferenceArray(2);
    public final A2W A07;
    public final C23065B2p A08;

    public static C207229ul A00(C203119nL r6, int i, long j) {
        if (r6.A04.get() != 0) {
            int i2 = 0;
            do {
                C207229ul r3 = (C207229ul) r6.A06.get(i2);
                if (!(r3 == null || (r3.A01 & i) == 0)) {
                    long j2 = r3.A05;
                    if (r3.A0B == null && j2 == j) {
                        return r3;
                    }
                }
                i2++;
            } while (i2 < 2);
        }
        return null;
    }

    public static void A03(C203119nL r11, int i, int i2, int i3, long j) {
        C207229ul A002 = A00(r11, i, j);
        if (A002 != null) {
            r11.A04(A002);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("STOP PROFILO_TRACEID: ");
            long j2 = A002.A06;
            A0u.append(AnonymousClass6I8.A00(j2));
            AnonymousClass000.A1A(A0u, "Profilo/TraceControl");
            synchronized (r11) {
                A02(r11);
                if (i2 != 0) {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 61, 0, 0, 0, 0, j2);
                    r11.A00.A02(A002);
                } else {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 37, 0, 0, 0, 0, j2);
                    r11.A00.A01(new C207229ul(A002, i3));
                }
            }
        }
    }

    private void A04(C207229ul r6) {
        AtomicInteger atomicInteger;
        int i;
        int i2 = 0;
        while (i2 < 2) {
            if (!this.A06.compareAndSet(i2, r6, (Object) null)) {
                i2++;
            } else {
                do {
                    atomicInteger = this.A04;
                    i = atomicInteger.get();
                } while (!atomicInteger.compareAndSet(i, (1 << i2) ^ i));
                return;
            }
        }
        Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
    }

    public static C207229ul A01(C203119nL r6, long j) {
        if (r6.A04.get() != 0) {
            int i = 0;
            do {
                C207229ul r3 = (C207229ul) r6.A06.get(i);
                if (r3 != null && r3.A06 == j) {
                    return r3;
                }
                i++;
            } while (i < 2);
        }
        return null;
    }

    public static void A02(C203119nL r4) {
        C192179Fz r2;
        HandlerThread handlerThread;
        if (r4.A00 == null) {
            A2W a2w = r4.A07;
            synchronized (C192179Fz.class) {
                r2 = C192179Fz.A01;
                if (r2 == null) {
                    r2 = new C192179Fz();
                    C192179Fz.A01 = r2;
                }
            }
            synchronized (r2) {
                if (r2.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    r2.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = r2.A00;
            }
            r4.A00 = new C166087v0(handlerThread.getLooper(), a2w, r4.A08);
        }
    }

    public C203119nL(SparseArray sparseArray, C192319Gn r4, A2W a2w, C23065B2p b2p, MmapBufferManager mmapBufferManager, File file) {
        this.A01 = sparseArray;
        this.A05 = new AtomicReference(r4);
        this.A02 = mmapBufferManager;
        this.A03 = file;
        this.A08 = b2p;
        this.A07 = a2w;
    }

    public void A05(long j, int i) {
        C207229ul A012 = A01(this, j);
        if (A012 != null && A012.A06 == j) {
            A04(A012);
            synchronized (this) {
                A02(this);
                this.A00.A01(new C207229ul(A012, i));
            }
        }
    }
}
