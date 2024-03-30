package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.LongSparseArray;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.7v0  reason: invalid class name and case insensitive filesystem */
public class C166087v0 extends Handler {
    public final C191419Cw A00 = new C191419Cw();
    public final A2W A01;
    public final C23065B2p A02;
    public final HashSet A03 = C36441kJ.A16();
    public final Random A04 = new Random();

    public synchronized void A01(C207229ul r4) {
        HashSet hashSet = this.A03;
        Long valueOf = Long.valueOf(r4.A06);
        if (hashSet.contains(valueOf)) {
            AnonymousClass000.A14(this, r4, 3);
            hashSet.remove(valueOf);
        }
    }

    public synchronized void A02(C207229ul r4) {
        HashSet hashSet = this.A03;
        Long valueOf = Long.valueOf(r4.A06);
        if (hashSet.contains(valueOf)) {
            AnonymousClass000.A14(this, r4, 2);
            hashSet.remove(valueOf);
        }
    }

    public static void A00(C207229ul r9) {
        BufferLogger.writeStandardEntry(r9.A09, 6, 98, 0, 0, r9.A08.A00("trace_config.logger_priority", 5), 0, r9.A06);
    }

    public void handleMessage(Message message) {
        LongSparseArray longSparseArray;
        int i;
        C201689k7[] r4;
        C201689k7[] r5;
        int tracingProviders;
        int tracingProviders2;
        AnonymousClass9JR r3;
        C201689k7[] r7;
        C201689k7[] r6;
        int i2;
        C201689k7[] r62;
        Message message2 = message;
        int i3 = message2.what;
        if (i3 != 7) {
            C207229ul r0 = (C207229ul) message2.obj;
            switch (i3) {
                case 0:
                    long j = r0.A06;
                    C203119nL r32 = C203119nL.A0A;
                    C207229ul A012 = C203119nL.A01(r32, j);
                    if (A012 != null) {
                        BufferLogger.writeStandardEntry(A012.A09, 6, 41, 0, 0, 0, 0, A012.A06);
                        r32.A05(j, 4);
                        return;
                    }
                    return;
                case 1:
                    if ((r0.A03 & 2) == 0) {
                        r0.A0G.start();
                        A00(r0);
                    }
                    A2W a2w = this.A01;
                    if (a2w != null) {
                        synchronized (a2w) {
                            r62 = a2w.A02;
                        }
                        for (C201689k7 r33 : r62) {
                            if ((r0.A02 & r33.getSupportedProviders()) != 0) {
                                r33.A01().addBuffer(r0.A09);
                                r33.A02();
                                C201689k7.A00(r33, r0);
                                r33.onTraceStarted(r0, a2w);
                            }
                        }
                        A2V a2v = a2w.A05;
                        a2v.Bdn(r0);
                        a2v.BjJ(r0);
                        return;
                    }
                    return;
                case 2:
                    synchronized (this) {
                        removeMessages(0, r0);
                        int i4 = r0.A03;
                        if ((i4 & 2) != 0) {
                            if (r0.A0G != null) {
                                r0.A0G.start();
                                A00(r0);
                                NativeTraceWriter nativeTraceWriter = r0.A0G.A01;
                                Buffer buffer = r0.A09;
                                long j2 = r0.A06;
                                BufferLogger.writeAndWakeupTraceWriter(nativeTraceWriter, buffer, j2, 40, 0, i4, j2);
                            } else {
                                throw AnonymousClass001.A09("Trace stopped but never started");
                            }
                        }
                        sendMessageDelayed(obtainMessage(4, r0), (long) r0.A08.A00("trace_config.post_trace_extension_ms", 0));
                    }
                    return;
                case 3:
                    synchronized (this) {
                        removeMessages(0, r0);
                    }
                    A2W a2w2 = this.A01;
                    if (a2w2 != null) {
                        synchronized (a2w2) {
                            r7 = a2w2.A02;
                            r6 = a2w2.A03;
                        }
                        a2w2.A05.BjG(r0);
                        int i5 = r0.A02;
                        synchronized (TraceEvents.class) {
                            TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i5);
                        }
                        synchronized (a2w2.A06) {
                            for (C201689k7 A032 : r6) {
                                A032.A03(r0, a2w2);
                            }
                        }
                        for (C201689k7 A033 : r7) {
                            A033.A03(r0, a2w2);
                        }
                        return;
                    }
                    return;
                case 4:
                    A2W a2w3 = this.A01;
                    if (a2w3 != null) {
                        synchronized (a2w3) {
                            r4 = a2w3.A02;
                            r5 = a2w3.A03;
                        }
                        BufferLogger.writeStandardEntry(r0.A09, 6, 52, 0, 0, 8126470, 0, 0);
                        int i6 = 0;
                        for (C201689k7 r2 : r4) {
                            if (r2.A01 == null || r2.A02) {
                                tracingProviders2 = r2.getTracingProviders();
                            } else {
                                tracingProviders2 = 0;
                            }
                            i6 |= tracingProviders2;
                        }
                        for (C201689k7 r22 : r5) {
                            if (r22.A01 == null || r22.A02) {
                                tracingProviders = r22.getTracingProviders();
                            } else {
                                tracingProviders = 0;
                            }
                            i6 |= tracingProviders;
                        }
                        int i7 = r0.A02;
                        synchronized (TraceEvents.class) {
                            TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i7);
                        }
                        synchronized (a2w3.A06) {
                            for (C201689k7 A034 : r5) {
                                A034.A03(r0, a2w3);
                            }
                        }
                        for (C201689k7 A035 : r4) {
                            A035.A03(r0, a2w3);
                        }
                        A2V a2v2 = a2w3.A05;
                        a2v2.Bdo(r0, i6);
                        a2v2.BjK(r0);
                    }
                    BufferLogger.writeStandardEntry(r0.A09, 6, 38, 0, 0, 0, 0, r0.A06);
                    return;
                case 5:
                    long j3 = (long) message2.arg1;
                    C191419Cw r63 = this.A00;
                    long j4 = r0.A06;
                    synchronized (r63) {
                        AnonymousClass9LP r02 = (AnonymousClass9LP) r63.A00.get(j4);
                        if (!(r02 == null || (r3 = r02.A01) == null || j3 <= r3.A00)) {
                            r3.A00 = j3;
                        }
                    }
                    return;
                case 6:
                    C191419Cw r23 = this.A00;
                    long j5 = r0.A06;
                    synchronized (r23) {
                        longSparseArray = r23.A00;
                        AnonymousClass9LP r9 = (AnonymousClass9LP) longSparseArray.get(j5);
                        if (r9 != null) {
                            AnonymousClass9LO r8 = r9.A00;
                            if (r8 != null) {
                                HashSet hashSet = r8.A02;
                                synchronized (hashSet) {
                                    if (!r8.A01.B6s(hashSet, r8.A03)) {
                                        i = r8.A00;
                                        if (i != 1) {
                                        }
                                    }
                                }
                            }
                            AnonymousClass9JR r12 = r9.A01;
                            if (r12 != null) {
                                int i8 = 0;
                                i = 0;
                                int i9 = -1;
                                while (true) {
                                    int[] iArr = r12.A01;
                                    if (i8 < iArr.length) {
                                        if (r12.A00 > ((long) iArr[i8]) && iArr[i8] > i9) {
                                            i9 = iArr[i8];
                                            i = r12.A02[i8];
                                        }
                                        i8++;
                                    }
                                }
                            }
                        }
                        i = 1;
                    }
                    if (i == 0 || this.A04.nextInt(i) != 0) {
                        BufferLogger.writeStandardEntry(r0.A09, 6, 37, 0, 0, 0, 0, r0.A06);
                        A01(new C207229ul(r0, 6));
                    } else {
                        Buffer buffer2 = r0.A09;
                        BufferLogger.writeStandardEntry(buffer2, 6, 99, 0, 0, 0, 0, (long) i);
                        BufferLogger.writeStandardEntry(buffer2, 6, 61, 0, 0, 0, 0, r0.A06);
                        A02(r0);
                    }
                    synchronized (r23) {
                        longSparseArray.delete(r0.A06);
                    }
                    return;
                case 7:
                    break;
                default:
                    return;
            }
        }
        throw AnonymousClass001.A0A("mTraceContext");
    }

    public C166087v0(Looper looper, A2W a2w, C23065B2p b2p) {
        super(looper);
        this.A01 = a2w;
        this.A02 = b2p;
    }
}
