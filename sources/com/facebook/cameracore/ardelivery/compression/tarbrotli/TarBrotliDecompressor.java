package com.facebook.cameracore.ardelivery.compression.tarbrotli;

import X.AnonymousClass000;
import X.AnonymousClass7eU;
import X.C129966Je;
import X.C90474aD;
import X.C90524aI;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class TarBrotliDecompressor implements AnonymousClass7eU {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native int unarchiveFile(String str, String str2);

    static {
        SoLoader.A06("tar-brotli-archive-native");
    }

    public C129966Je decompress(String str, String str2) {
        StringBuilder sb;
        try {
            int unarchiveFile = unarchiveFile(str, str2);
            if (unarchiveFile == 0) {
                return new C129966Je(C90524aI.A0S(str2));
            }
            sb = AnonymousClass000.A0u();
            sb.append("Failed to decompress tar brotli, result code=");
            sb.append(unarchiveFile);
            return new C129966Je(sb.toString());
        } catch (EffectsFrameworkException | RuntimeException e) {
            sb = AnonymousClass000.A0u();
            C90474aD.A1K("Failed to decompress tar brotli: ", sb, e);
        }
    }
}
