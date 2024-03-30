package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass000;
import X.C198449da;
import X.C36361kB;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class MmapBufferManager {
    public static final MmapBufferManager $redex_init_class = null;
    public final C198449da mFileHelper;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native Buffer nativeAllocateBuffer(int i);

    private native Buffer nativeAllocateBuffer(int i, String str);

    private native boolean nativeDeallocateBuffer(Buffer buffer);

    public synchronized boolean deallocateBuffer(Buffer buffer) {
        return nativeDeallocateBuffer(buffer);
    }

    static {
        SoLoader.A06("profilo_mmapbuf");
    }

    public Buffer allocateBuffer(int i, boolean z) {
        if (!z) {
            return nativeAllocateBuffer(i);
        }
        String A0l = C36361kB.A0l();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C198449da.A00(A0l));
        String A01 = this.mFileHelper.A01(AnonymousClass000.A0q(".buff", A0u));
        if (A01 == null) {
            return null;
        }
        return nativeAllocateBuffer(i, A01);
    }

    public MmapBufferManager(File file) {
        this.mFileHelper = new C198449da(file);
    }
}
