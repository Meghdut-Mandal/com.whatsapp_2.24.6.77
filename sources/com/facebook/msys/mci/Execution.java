package com.facebook.msys.mci;

import X.AV7;
import X.AVe;
import X.AnonymousClass00h;
import X.AnonymousClass14P;
import X.AnonymousClass72f;
import X.C000600g;
import android.os.Looper;
import com.facebook.simplejni.NativeHolder;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class Execution {
    public static final int INVALID_THREAD_PRIORITY = Integer.MIN_VALUE;
    public static volatile boolean sInitialized;
    public static final ConcurrentHashMap sThreadIds = new ConcurrentHashMap();
    public static final ThreadLocal sThreadLocalExecutionContext = new AnonymousClass14P();
    public static final AtomicInteger sThreadPriority = new AtomicInteger(Integer.MIN_VALUE);
    public static final ConcurrentHashMap sThreadPriorityMap = new ConcurrentHashMap();
    public static Executor sUiThreadSchedulingExecutor;

    public static void executeAfter(AnonymousClass72f r1, int i, long j) {
        executeAfterWithPriority(r1, i, 0, j);
    }

    public static void executeAfterWithPriorityInternal(AnonymousClass72f r6, int i, int i2, long j) {
        if (!nativeScheduleTask(r6, i, i2, ((double) j) / 1000.0d, r6.toString())) {
            StringBuilder sb = new StringBuilder();
            sb.append("UNKNOWN execution context ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }

    public static void executeAsync(AnonymousClass72f r1, int i) {
        executeAsyncWithPriority(r1, i, 0);
    }

    public static boolean isMCPEnabledForExecution() {
        return false;
    }

    public static native int nativeGetExecutionContext();

    public static native void nativeInitialize();

    public static native void nativeResetExecutorsTestingOnly();

    public static native boolean nativeScheduleTask(Runnable runnable, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(int i);

    public static native void setLoggingThresholds(double d, double d2);

    public static void assertInitialized(String str) {
        if (!sInitialized) {
            StringBuilder sb = new StringBuilder();
            sb.append("Execution was called by ");
            sb.append(str);
            sb.append(" but was not initialized before being used");
            throw new RuntimeException(sb.toString());
        }
    }

    public static int getExecutionContext() {
        if (sInitialized) {
            return ((Number) sThreadLocalExecutionContext.get()).intValue();
        }
        return 0;
    }

    public static synchronized boolean initialize(Executor executor) {
        boolean z;
        synchronized (Execution.class) {
            Method method = C000600g.A03;
            AnonymousClass00h.A01("Execution.initialize");
            try {
                if (sInitialized) {
                    z = false;
                } else {
                    sUiThreadSchedulingExecutor = executor;
                    nativeInitialize();
                    synchronized (TaskTracker.class) {
                        int i = 0;
                        if (!TaskTracker.sInitialized) {
                            TaskTracker[] taskTrackerArr = {TaskTracker.TRACKER_MAIN, TaskTracker.TRACKER_DATABASE, TaskTracker.TRACKER_NETWORK, TaskTracker.TRACKER_UTILITY, TaskTracker.TRACKER_CRYPTO, TaskTracker.TRACKER_DATABASE_READ_ONLY};
                            int[] iArr = new int[6];
                            String[] strArr = new String[6];
                            int i2 = 0;
                            do {
                                iArr[i2] = taskTrackerArr[i2].mExecutionContext;
                                strArr[i2] = taskTrackerArr[i2].mQueueName;
                                i2++;
                            } while (i2 < 6);
                            NativeHolder[] initNativeHolders = TaskTracker.initNativeHolders(iArr, strArr);
                            do {
                                taskTrackerArr[i].mNativeHolder = initNativeHolders[i];
                                i++;
                            } while (i < 6);
                            TaskTracker.sInitialized = true;
                        }
                    }
                    z = true;
                    sInitialized = true;
                }
                AnonymousClass00h.A00();
            } catch (Throwable th) {
                AnonymousClass00h.A00();
                throw th;
            }
        }
        return z;
    }

    public static void resetExecutorsForTestingOnly() {
        sThreadIds.clear();
        sThreadPriorityMap.clear();
        nativeResetExecutorsTestingOnly();
    }

    public static boolean setInitializedForTestingOnly(boolean z) {
        boolean z2 = sInitialized;
        sInitialized = z;
        return z2;
    }

    public static void setThreadPriorities(Map map) {
        sThreadPriorityMap.clear();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                setThreadPriority(((Number) entry.getKey()).intValue(), (Integer) entry.getValue());
            }
        }
    }

    public static void setThreadPriority(int i, Integer num) {
        ConcurrentHashMap concurrentHashMap = sThreadPriorityMap;
        Integer valueOf = Integer.valueOf(i);
        concurrentHashMap.put(valueOf, num);
        sThreadIds.get(valueOf);
    }

    public static Executor setUiThreadSchedulingExecutorForTestingOnly(Executor executor) {
        Executor executor2 = sUiThreadSchedulingExecutor;
        sUiThreadSchedulingExecutor = executor;
        return executor2;
    }

    public static void startExecutorThread(int i, String str) {
        AV7 av7 = new AV7(i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Context");
        new Thread(av7, sb.toString()).start();
    }

    public static boolean callingThreadMatchesExecutionContext(int i) {
        if (getExecutionContext() == i) {
            return true;
        }
        return false;
    }

    public static void ensureNotOnDatabaseThread() {
        if (getExecutionContext() == 2) {
            throw new IllegalStateException("The task can not run on Database thread");
        }
    }

    public static void ensureNotOnMsysThread() {
        if (isOnMsysThread()) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
    }

    public static void executeAfterWithPriority(AnonymousClass72f r2, int i, int i2, long j) {
        assertInitialized(r2.toString());
        if (sUiThreadSchedulingExecutor == null || Looper.myLooper() != Looper.getMainLooper()) {
            executeAfterWithPriorityInternal(r2, i, i2, j);
        } else {
            sUiThreadSchedulingExecutor.execute(new AVe(r2, i, i2, j));
        }
    }

    public static void executeAsyncWithPriority(AnonymousClass72f r2, int i, int i2) {
        assertInitialized(r2.toString());
        executeAfterWithPriority(r2, i, i2, 0);
    }

    public static void executePossiblySync(AnonymousClass72f r1, int i) {
        assertInitialized(r1.toString());
        if (callingThreadMatchesExecutionContext(i)) {
            r1.run();
        } else {
            executeAsyncWithPriority(r1, i, 0);
        }
    }

    public static boolean isOnMsysMainContext() {
        if (getExecutionContext() != 1) {
            return false;
        }
        return true;
    }

    public static boolean isOnMsysThread() {
        if (getExecutionContext() != 0) {
            return true;
        }
        return false;
    }

    public static synchronized boolean initialize() {
        boolean initialize;
        synchronized (Execution.class) {
            initialize = initialize((Executor) null);
        }
        return initialize;
    }

    public static void setThreadPriorities(Integer num) {
        sThreadPriority.set(num.intValue());
    }
}
