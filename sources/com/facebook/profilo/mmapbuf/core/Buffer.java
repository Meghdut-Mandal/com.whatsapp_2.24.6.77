package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass000;
import X.C198449da;
import X.C36361kB;
import X.C90524aI;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class Buffer {
    public static final String LOG_TAG = "Prflo/Buffer";
    public final HybridData mHybridData;

    private native void nativeUpdateId(String str);

    public synchronized String generateMemoryMappingFilePath() {
        String str;
        if (!AnonymousClass000.A1V(getFilePath())) {
            str = null;
        } else {
            str = getMemoryMappingFilePath();
            if (str == null) {
                C198449da r2 = new C198449da(getBufferContainingFolder());
                String A0l = C36361kB.A0l();
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(C198449da.A00(A0l));
                str = r2.A01(AnonymousClass000.A0q(".maps", A0u));
                if (str != null) {
                    updateMemoryMappingFilePath(str);
                }
            }
        }
        return str;
    }

    public native synchronized String getFilePath();

    public native synchronized String getMemoryMappingFilePath();

    public native synchronized void updateFilePath(String str);

    public native synchronized void updateHeader(int i, long j, long j2, long j3);

    public synchronized void updateId(String str) {
        if (AnonymousClass000.A1V(getFilePath())) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C198449da.A00(str));
            String A01 = new C198449da(getBufferContainingFolder()).A01(AnonymousClass000.A0q(".buff", A0u));
            if (A01 != null) {
                try {
                    nativeUpdateId(str);
                    updateFilePath(A01);
                } catch (Exception e) {
                    Log.e(LOG_TAG, "Id update failed", e);
                }
            }
        }
        return;
    }

    public native synchronized void updateMemoryMappingFilePath(String str);

    static {
        SoLoader.A06("profilo_mmapbuf");
    }

    public Buffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private File getBufferContainingFolder() {
        return C90524aI.A0S(getFilePath()).getParentFile();
    }

    public boolean isFileBacked() {
        return AnonymousClass000.A1V(getFilePath());
    }
}
