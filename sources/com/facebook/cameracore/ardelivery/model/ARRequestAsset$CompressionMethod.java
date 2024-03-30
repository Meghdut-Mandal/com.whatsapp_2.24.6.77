package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass5RP;
import X.C90464aC;
import java.util.Locale;

public enum ARRequestAsset$CompressionMethod {
    NONE("NONE"),
    ZIP("ZIP"),
    TAR_BROTLI("TAR_BROTLI");
    
    public String mMethod;

    public static ARRequestAsset$CompressionMethod fromJson(String str) {
        return valueOf(str.toUpperCase(Locale.US));
    }

    public static ARRequestAsset$CompressionMethod fromString(String str) {
        return valueOf(str.toUpperCase(Locale.US));
    }

    /* access modifiers changed from: public */
    ARRequestAsset$CompressionMethod(String str) {
        this.mMethod = str;
    }

    public static ARRequestAsset$CompressionMethod fromCompressionType(AnonymousClass5RP r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return NONE;
        }
        if (ordinal == 1) {
            return ZIP;
        }
        if (ordinal == 2) {
            return TAR_BROTLI;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("unsupported compression method for CompressionType : ");
        throw AnonymousClass000.A0c(r2.name(), A0u);
    }

    public static ARRequestAsset$CompressionMethod fromCompressionTypeCppValue(int i) {
        for (AnonymousClass5RP r1 : AnonymousClass5RP.values()) {
            if (r1.mCppValue == i) {
                return fromCompressionType(r1);
            }
        }
        throw AnonymousClass000.A0d("Unsupported compression type : ", AnonymousClass000.A0u(), i);
    }

    public static String toJson(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        return aRRequestAsset$CompressionMethod.getCompressionMethod();
    }

    public static AnonymousClass5RP toXplatCompressionType(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        int ordinal = aRRequestAsset$CompressionMethod.ordinal();
        if (ordinal == 0) {
            return AnonymousClass5RP.None;
        }
        if (ordinal == 1) {
            return AnonymousClass5RP.Zip;
        }
        if (ordinal == 2) {
            return AnonymousClass5RP.TarBrotli;
        }
        throw C90464aC.A0P(aRRequestAsset$CompressionMethod, "Unsupported compression method : ", AnonymousClass000.A0u());
    }

    public String getCompressionMethod() {
        return this.mMethod;
    }
}
