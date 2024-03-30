package X;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.9i4  reason: invalid class name and case insensitive filesystem */
public abstract class C200699i4 {
    public static int A00;
    public static C1693388r A01;

    public static void A00(Context context, int i) {
        long abs;
        int[] iArr;
        StringBuilder sb;
        int length;
        Buffer buffer;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int A002;
        boolean z;
        boolean z2;
        C201689k7[] r14;
        ArrayList A15;
        int i5;
        int i6;
        Boolean bool;
        IllegalStateException th;
        C192319Gn r7;
        IllegalStateException th2;
        int i7 = A00;
        if (i7 == 0) {
            Context context2 = context;
            try {
                AnonymousClass10B.A00(context2);
                SparseArray sparseArray = new SparseArray(1);
                sparseArray.put(C197679cB.A02, new C197679cB());
                C1693388r r1 = new C1693388r();
                A01 = r1;
                A2W a2w = new A2W(context2, new C196549a2(), C36441kJ.A0w(context2.getCacheDir(), "profilo"), new C201689k7[]{r1, new SystemCounterThread(), new ThreadMetadataProvider(), new StackFrameThread(context2), new C1693288q()});
                if (A2W.A09.compareAndSet((Object) null, a2w)) {
                    synchronized (a2w) {
                        try {
                            r7 = C196549a2.A00;
                        } catch (Throwable th3) {
                            while (true) {
                                th = th3;
                                break;
                            }
                        }
                    }
                    synchronized (a2w) {
                        try {
                            C198929eQ r2 = a2w.A00;
                            File file = r2.A06;
                            MmapBufferManager mmapBufferManager = MmapBufferManager.$redex_init_class;
                            MmapBufferManager mmapBufferManager2 = new MmapBufferManager(r2.A03);
                            a2w.A01 = mmapBufferManager2;
                            if (C203119nL.A0A == null) {
                                synchronized (C203119nL.class) {
                                    try {
                                        if (C203119nL.A0A == null) {
                                            C203119nL.A0A = new C203119nL(sparseArray, r7, a2w, a2w, mmapBufferManager2, file);
                                        } else {
                                            throw AnonymousClass001.A09("TraceControl already initialized");
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                    }
                                }
                                SoLoader.A06("profilo");
                                if (!r7.equals(a2w.A08)) {
                                    a2w.A08 = r7;
                                    C203119nL r0 = C203119nL.A0A;
                                    if (r0 != null) {
                                        AtomicReference atomicReference = r0.A05;
                                        if (!atomicReference.compareAndSet(atomicReference.get(), r7)) {
                                            Log.d("Profilo/TraceControl", "Tried to update the config and failed due to CAS");
                                        }
                                    } else {
                                        th2 = AnonymousClass001.A09("Performing config change before TraceControl has been initialized");
                                    }
                                }
                                r2.A01 = TimeUnit.DAYS.toSeconds(1) * 1000;
                                r2.A00 = 10;
                                a2w.A05.A00.add(new A2U());
                            } else {
                                th2 = AnonymousClass001.A09("TraceControl already initialized");
                            }
                            throw th2;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    A00 = 2;
                } else {
                    th = AnonymousClass001.A09("Orchestrator already initialized");
                    throw th;
                }
            } catch (IOException e) {
                com.whatsapp.util.Log.e("profilo/SoLoader initialization failed", e);
                A00 = 1;
                return;
            }
        } else if (i7 == 1) {
            return;
        }
        C203119nL r4 = C203119nL.A0A;
        if (r4 != null) {
            int i8 = C197679cB.A02;
            long j3 = (long) i;
            AtomicInteger atomicInteger = r4.A04;
            int i9 = atomicInteger.get() | 1;
            int i10 = (1 << 2) - 1;
            if (((~i9) & (i9 + 1) & i10) != 0) {
                C197679cB r9 = (C197679cB) r4.A01.get(i8);
                if (r9 == null) {
                    throw AnonymousClass000.A0d("Unregistered controller for id = ", AnonymousClass000.A0u(), i8);
                } else if (C203119nL.A00(r4, i8, j3) == null) {
                    C192319Gn r8 = (C192319Gn) r4.A05.get();
                    ArrayList arrayList = r9.A00;
                    AnonymousClass9VO r3 = ProvidersRegistry.A00;
                    int A003 = r3.A00(arrayList);
                    if (A003 != 0) {
                        do {
                            abs = Math.abs(((Random) C203119nL.A09.get()).nextLong());
                        } while (abs <= 0);
                        String A004 = AnonymousClass6I8.A00(abs);
                        Log.w("Profilo/TraceControl", AnonymousClass000.A0p("START PROFILO_TRACEID: ", A004, AnonymousClass000.A0u()));
                        TreeMap treeMap = new TreeMap();
                        int i11 = 31;
                        if (r9.A01) {
                            i11 = 13;
                        }
                        treeMap.put("provider.native_stack_trace.unwinder_thread_pri", C36381kD.A0o("provider.stack_trace.cpu_sampling_rate_ms", Integer.valueOf(i11), treeMap));
                        treeMap.put("provider.native_stack_trace.unwinder_queue_size", 512);
                        TreeMap treeMap2 = new TreeMap();
                        treeMap2.put("provider.native_stack_trace.unwind_dex_frames", C36371kC.A0m());
                        C206999uO r6 = new C206999uO(treeMap, treeMap2);
                        int A005 = r6.A00("trace_config.buffers", 1);
                        TreeMap treeMap3 = r8.A00.intParams;
                        int i12 = 5000;
                        if (treeMap3 != null && treeMap3.containsKey("system_config.buffer_size")) {
                            i12 = treeMap3.get("system_config.buffer_size");
                        }
                        int A0I = AnonymousClass000.A0I(i12);
                        boolean z3 = false;
                        TreeMap treeMap4 = r6.A00;
                        if (!(treeMap4 == null || (bool = (Boolean) treeMap4.get("trace_config.mmap_buffer")) == null)) {
                            z3 = bool.booleanValue();
                        }
                        TreeMap treeMap5 = r6.A01;
                        if (treeMap5 == null) {
                            iArr = null;
                        } else {
                            iArr = (int[]) treeMap5.get("trace_config.buffer_sizes");
                        }
                        Buffer[] bufferArr = new Buffer[A005];
                        for (int i13 = 0; i13 < A005; i13++) {
                            MmapBufferManager mmapBufferManager3 = r4.A02;
                            if (iArr == null || i13 >= iArr.length) {
                                i6 = A0I;
                            } else {
                                i6 = iArr[i13];
                            }
                            bufferArr[i13] = mmapBufferManager3.allocateBuffer(i6, z3);
                        }
                        Buffer buffer2 = bufferArr[0];
                        File file2 = r4.A03;
                        NativeTraceWriter nativeTraceWriter = NativeTraceWriter.$redex_init_class;
                        C207229ul r20 = new C207229ul(r8, r6, buffer2, C36441kJ.A0w(file2, A004.replaceAll("[^a-zA-Z0-9\\-_.]", "_")), r9, A004, bufferArr, i8, A003, abs, j3);
                        Buffer[] bufferArr2 = r20.A0F;
                        int i14 = 0;
                        if (bufferArr2 == null || (length = bufferArr2.length) == 0 || (buffer = r20.A09) == null) {
                            sb = AnonymousClass000.A0u();
                            sb.append("No buffer was allocated for trace ");
                            sb.append(r20.A0D);
                            sb.append(", failing startTrace");
                        } else {
                            do {
                                i2 = atomicInteger.get();
                                int i15 = i2 | 1;
                                i3 = (~i15) & (i15 + 1) & i10;
                                if (i3 == 0) {
                                    Log.d("Profilo/TraceControl", "Tried to start a trace and failed because no free slots were left");
                                    return;
                                }
                            } while (!atomicInteger.compareAndSet(i2, i2 | i3));
                            AtomicReferenceArray atomicReferenceArray = r4.A06;
                            int i16 = -1;
                            while (i3 != 0) {
                                i16++;
                                i3 >>= 1;
                            }
                            if (!atomicReferenceArray.compareAndSet(i16, (Object) null, r20)) {
                                throw C90514aH.A0s("ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY");
                            }
                            do {
                                Buffer buffer3 = bufferArr2[i14];
                                i4 = r20.A02;
                                j = r20.A05;
                                j2 = r20.A06;
                                buffer3.updateHeader(i4, j, j2, 0);
                                i14++;
                            } while (i14 < length);
                            int i17 = r20.A03;
                            int i18 = i17 & 3;
                            if (i18 != 0) {
                                A002 = Integer.MAX_VALUE;
                            } else {
                                A002 = r20.A08.A00("trace_config.trace_timeout_ms", 30000);
                            }
                            synchronized (r4) {
                                C203119nL.A02(r4);
                                if (C203119nL.A01(r4, j2) != null) {
                                    C166087v0 r92 = r4.A00;
                                    synchronized (r92) {
                                        C191419Cw r142 = r92.A00;
                                        synchronized (r142) {
                                            try {
                                                AnonymousClass9LP r15 = new AnonymousClass9LP(r20);
                                                if (r15.A02) {
                                                    z2 = false;
                                                } else {
                                                    if (r15.A03) {
                                                        r142.A00.put(j2, r15);
                                                    }
                                                    z2 = true;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                throw th;
                                            }
                                        }
                                        z = false;
                                        if (z2) {
                                            try {
                                                C21840AbI abI = new C21840AbI(new A2X(r92, r20), r20.A0A.getCanonicalPath(), r20.A0E, bufferArr2, j2);
                                                r20.A0G = abI;
                                                if ((i17 & 2) == 0) {
                                                    NativeTraceWriter nativeTraceWriter2 = abI.A01;
                                                    if (i18 != 0) {
                                                        i5 = Integer.MAX_VALUE;
                                                    } else {
                                                        i5 = r20.A08.A00("trace_config.trace_timeout_ms", 30000);
                                                    }
                                                    BufferLogger.writeAndWakeupTraceWriter(nativeTraceWriter2, buffer, j2, 39, i5, i17, j2);
                                                }
                                                C36391kE.A1W(r92.A03, j2);
                                                A2W a2w2 = r92.A01;
                                                if (a2w2 != null) {
                                                    Class<TraceEvents> cls = TraceEvents.class;
                                                    synchronized (cls) {
                                                        try {
                                                            ArrayList arrayList2 = r3.A01;
                                                            int A006 = r3.A00(arrayList2);
                                                            if (A006 != TraceEvents.sLastNameRefreshProvidersState) {
                                                                TraceEvents.sLastNameRefreshProvidersState = A006;
                                                                synchronized (arrayList2) {
                                                                    A15 = C36441kJ.A15(arrayList2);
                                                                }
                                                                int size = A15.size();
                                                                int[] iArr2 = new int[size];
                                                                String[] strArr = new String[size];
                                                                int i19 = 0;
                                                                Iterator it = A15.iterator();
                                                                while (it.hasNext()) {
                                                                    String A0C = AnonymousClass001.A0C(it);
                                                                    strArr[i19] = A0C;
                                                                    iArr2[i19] = r3.A01(A0C);
                                                                    i19++;
                                                                }
                                                                TraceEvents.nativeRefreshProviderNames(iArr2, strArr);
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            throw th;
                                                        }
                                                    }
                                                    synchronized (cls) {
                                                        TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i4);
                                                    }
                                                    synchronized (a2w2) {
                                                        try {
                                                            r14 = a2w2.A03;
                                                        } catch (Throwable th8) {
                                                            while (true) {
                                                                th = th8;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    synchronized (a2w2.A06) {
                                                        try {
                                                            for (C201689k7 r12 : r14) {
                                                                if ((i4 & r12.getSupportedProviders()) != 0) {
                                                                    r12.A01().addBuffer(buffer);
                                                                    r12.A02();
                                                                    C201689k7.A00(r12, r20);
                                                                    r12.onTraceStarted(r20, a2w2);
                                                                }
                                                            }
                                                        } catch (Throwable th9) {
                                                            while (true) {
                                                                th = th9;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                AnonymousClass000.A14(r92, r20, 1);
                                                r92.sendMessageDelayed(r92.obtainMessage(0, r20), (long) A002);
                                            } catch (IOException e2) {
                                                StringBuilder A0u = AnonymousClass000.A0u();
                                                A0u.append("Could not get canonical path of trace directory ");
                                                th = new IllegalArgumentException(AnonymousClass000.A0o(r20.A0A, A0u), e2);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                                z = true;
                            }
                            if (!z) {
                                sb = AnonymousClass000.A0u();
                                sb.append("Failed to start trace ");
                                sb.append(r20.A0D);
                                sb.append(" due to malformed config for context ");
                                sb.append(j);
                            } else {
                                return;
                            }
                        }
                        Log.e("Profilo/TraceControl", sb.toString());
                    }
                }
            }
        }
    }

    static {
        Boolean bool = C18750th.A03;
    }
}
