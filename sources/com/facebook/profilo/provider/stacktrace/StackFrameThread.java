package com.facebook.profilo.provider.stacktrace;

import X.A2W;
import X.AnonymousClass001;
import X.AnonymousClass9VO;
import X.C201689k7;
import X.C207229ul;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class StackFrameThread extends C201689k7 {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public C207229ul mSavedTraceContext;
    public int mSystemClockTimeIntervalMs = -1;

    public static native int nativeCpuClockResolutionMicros();

    static {
        AnonymousClass9VO r1 = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = r1.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = r1.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = r1.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.mContext = applicationContext;
        } else {
            this.mContext = context;
        }
    }

    public void disable() {
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            return;
        }
        this.mSavedTraceContext = null;
        this.mEnabled = false;
        synchronized (CPUProfiler.class) {
            if (CPUProfiler.sInitialized) {
                CPUProfiler.nativeStopProfiling();
            }
        }
        Thread thread = this.mProfilerThread;
        if (thread != null) {
            try {
                thread.join();
                this.mProfilerThread = null;
            } catch (InterruptedException e) {
                throw AnonymousClass001.A0B(e);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d7  */
    public void enable() {
        /*
            r19 = this;
            r0 = r19
            X.9ul r1 = r0.A00
            int r5 = r1.A02
            int r4 = PROVIDER_STACK_FRAME
            int r2 = PROVIDER_WALL_TIME_STACK_TRACE
            r4 = r4 | r2
            r4 = r4 & r5
            r3 = 0
            if (r4 == 0) goto L_0x0011
            r3 = 32753(0x7ff1, float:4.5897E-41)
        L_0x0011:
            int r2 = PROVIDER_NATIVE_STACK_TRACE
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0018
            r3 = r3 | 4
        L_0x0018:
            if (r3 == 0) goto L_0x0025
            java.lang.Thread r2 = r0.mProfilerThread
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = "Duplicate attempt to enable sampling profiler."
            android.util.Log.e(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            X.9uO r2 = r1.A08
            java.lang.String r3 = "provider.stack_trace.time_source"
            java.util.TreeMap r2 = r2.A03
            if (r2 == 0) goto L_0x0043
            java.lang.String r3 = X.C90504aG.A0l(r3, r2)
            if (r3 == 0) goto L_0x0043
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = X.C165617ti.A0Z(r3)     // Catch:{ IllegalArgumentException -> 0x0046 }
            X.8yN r12 = X.C187688yN.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0046 }
            goto L_0x0052
        L_0x0043:
            X.8yN r12 = X.C187688yN.NONE
            goto L_0x0052
        L_0x0046:
            r4 = move-exception
            java.lang.String r3 = r4.getMessage()
            java.lang.String r2 = "StackFrameThread"
            android.util.Log.e(r2, r3, r4)
            X.8yN r12 = X.C187688yN.NONE
        L_0x0052:
            X.9uO r9 = r1.A08
            java.lang.String r2 = "provider.stack_trace.cpu_sampling_rate_ms"
            r7 = 0
            int r3 = r9.A00(r2, r7)
            java.lang.String r2 = "provider.stack_trace.thread_detect_interval_ms"
            int r8 = r9.A00(r2, r7)
            int r5 = r1.A02
            java.lang.String r2 = "provider.native_stack_trace.unwind_dex_frames"
            r15 = 0
            java.util.TreeMap r6 = r9.A00
            if (r6 == 0) goto L_0x0076
            java.lang.Object r2 = r6.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0076
            boolean r15 = r2.booleanValue()
        L_0x0076:
            r4 = 5
            java.lang.String r2 = "provider.native_stack_trace.unwinder_thread_pri"
            int r16 = r9.A00(r2, r4)
            r4 = 256(0x100, float:3.59E-43)
            java.lang.String r2 = "provider.native_stack_trace.unwinder_queue_size"
            int r17 = r9.A00(r2, r4)
            java.lang.String r2 = "provider.native_stack_trace.log_partial_stacks"
            r18 = 0
            if (r6 == 0) goto L_0x0097
            java.lang.Object r2 = r6.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0097
            boolean r18 = r2.booleanValue()
        L_0x0097:
            monitor-enter(r0)
            android.content.Context r13 = r0.mContext     // Catch:{ Exception -> 0x0126 }
            com.facebook.profilo.logger.MultiBufferLogger r14 = r0.A01()     // Catch:{ Exception -> 0x0126 }
            boolean r2 = com.facebook.profilo.provider.stacktrace.CPUProfiler.init(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0126 }
            if (r2 == 0) goto L_0x0130
            r10 = 23
            if (r3 > 0) goto L_0x00aa
            r3 = 23
        L_0x00aa:
            if (r8 <= 0) goto L_0x00ad
            r10 = r8
        L_0x00ad:
            int r11 = PROVIDER_WALL_TIME_STACK_TRACE     // Catch:{ all -> 0x0137 }
            r6 = r5 & r11
            r4 = 1
            r2 = 3
            if (r6 != 0) goto L_0x00c6
            int r6 = r12.ordinal()     // Catch:{ all -> 0x0137 }
            if (r6 == r2) goto L_0x00c8
            if (r6 == r4) goto L_0x00c6
            if (r6 == r7) goto L_0x00c3
            r2 = 2
            r9 = 0
            if (r6 != r2) goto L_0x00c4
        L_0x00c3:
            r9 = 1
        L_0x00c4:
            r8 = 0
            goto L_0x00ca
        L_0x00c6:
            r9 = 0
            goto L_0x00c9
        L_0x00c8:
            r9 = 1
        L_0x00c9:
            r8 = 1
        L_0x00ca:
            int r2 = PROVIDER_STACK_FRAME     // Catch:{ all -> 0x0137 }
            r2 = r2 | r11
            r2 = r2 & r5
            if (r2 == 0) goto L_0x00d2
            r7 = 32753(0x7ff1, float:4.5897E-41)
        L_0x00d2:
            int r2 = PROVIDER_NATIVE_STACK_TRACE     // Catch:{ all -> 0x0137 }
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00d9
            r7 = r7 | 4
        L_0x00d9:
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r6 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r6)     // Catch:{ all -> 0x0137 }
            r5 = 0
            if (r9 != 0) goto L_0x00e2
            if (r8 != 0) goto L_0x00e2
            goto L_0x00f4
        L_0x00e2:
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x0134 }
            com.facebook.profilo.provider.stacktrace.StackTraceWhitelist.nativeAddToWhitelist(r2)     // Catch:{ all -> 0x0134 }
            boolean r2 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00f4
            boolean r2 = com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r7, r3, r10, r9, r8)     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00f4
            r5 = 1
        L_0x00f4:
            monitor-exit(r6)     // Catch:{ all -> 0x0137 }
            if (r5 == 0) goto L_0x0130
            com.facebook.profilo.logger.MultiBufferLogger r5 = r0.A01()     // Catch:{ all -> 0x0137 }
            r6 = 6
            r7 = 52
            r8 = 0
            r11 = 8126495(0x7c001f, float:1.1387645E-38)
            long r13 = (long) r3     // Catch:{ all -> 0x0137 }
            r10 = 0
            r12 = 0
            r5.writeStandardEntry(r6, r7, r8, r10, r11, r12, r13)     // Catch:{ all -> 0x0137 }
            r0.mEnabled = r4     // Catch:{ all -> 0x0137 }
            boolean r2 = r0.mEnabled     // Catch:{ all -> 0x0137 }
            monitor-exit(r0)
            if (r2 == 0) goto L_0x0025
            r0.mSavedTraceContext = r1
            r1 = 10
            X.72q r3 = new X.72q
            r3.<init>(r0, r1)
            java.lang.String r2 = "Prflo:Profiler"
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r3, r2)
            r0.mProfilerThread = r1
            r1.start()
            return
        L_0x0126:
            r3 = move-exception
            java.lang.String r2 = "StackFrameThread"
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x0132 }
            android.util.Log.e(r2, r1, r3)     // Catch:{ all -> 0x0132 }
        L_0x0130:
            monitor-exit(r0)
            return
        L_0x0132:
            r1 = move-exception
            goto L_0x0136
        L_0x0134:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0137 }
        L_0x0136:
            throw r1     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((r2 & r1) != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTracingProviders() {
        /*
            r4 = this;
            X.9ul r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            int r2 = r1.A02
            int r1 = PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L_0x0017
            int r1 = PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r3 | r1
        L_0x0018:
            int r0 = PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    public void onTraceEnded(C207229ul r5, A2W a2w) {
        int i;
        int i2 = r5.A02;
        int i3 = PROVIDER_STACK_FRAME;
        int i4 = PROVIDER_WALL_TIME_STACK_TRACE;
        if (((i3 | i4) & i2) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int i5 = (PROVIDER_STACK_FRAME | i4) & i2;
            int i6 = 0;
            if (i5 != 0) {
                i6 = 32753;
            }
            if ((PROVIDER_NATIVE_STACK_TRACE & i2) != 0) {
                i6 |= 4;
            }
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(i6 & i));
        }
        if ((i2 & getSupportedProviders()) != 0) {
            logAnnotation("provider.stack_trace.cpu_timer_res_us", Integer.toString(nativeCpuClockResolutionMicros()));
        }
    }

    public void onTraceStarted(C207229ul r2, A2W a2w) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }

    private void logAnnotation(String str, String str2) {
        MultiBufferLogger A01 = A01();
        A01.writeBytesEntry(0, 57, A01.writeBytesEntry(0, 56, A01.writeStandardEntry(6, 52, 0, 0, 0, 0, 0), str), str2);
    }
}
