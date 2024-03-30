package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;

public class TaskTracker {
    public static final TaskTracker TRACKER_CRYPTO = new TaskTracker(5, "Crypto");
    public static final TaskTracker TRACKER_DATABASE = new TaskTracker(2, "Database");
    public static final TaskTracker TRACKER_DATABASE_READ_ONLY = new TaskTracker(6, "DatabaseReadOnly");
    public static final TaskTracker TRACKER_MAIN = new TaskTracker(1, "Main");
    public static final TaskTracker TRACKER_NETWORK = new TaskTracker(3, "Network");
    public static final TaskTracker TRACKER_UTILITY = new TaskTracker(4, "Utility");
    public static volatile boolean sInitialized;
    public final int mExecutionContext;
    public NativeHolder mNativeHolder;
    public final String mQueueName;

    public static native NativeHolder[] initNativeHolders(int[] iArr, String[] strArr);

    private native long nativeGetLong(int i);

    private native String nativeGetString(int i);

    private native int nativeGetTaskCount();

    public TaskTracker(int i, String str) {
        this.mExecutionContext = i;
        this.mQueueName = str;
    }
}
