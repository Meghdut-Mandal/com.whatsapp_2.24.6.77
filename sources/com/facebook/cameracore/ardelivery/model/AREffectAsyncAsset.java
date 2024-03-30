package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6GV;
import X.C163937r0;
import X.C23931Ak;
import X.C36351kA;
import X.C36381kD;
import X.C36421kH;
import X.C36431kI;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class AREffectAsyncAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(9);
    public final String mCacheKey;
    public final ARRequestAsset$CompressionMethod mCompressionMethod;
    public final String mId;
    public final boolean mIsLoggingDisabled;
    public final List mStringIdentifiers;
    public final String mUri;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AREffectAsyncAsset)) {
            return false;
        }
        AREffectAsyncAsset aREffectAsyncAsset = (AREffectAsyncAsset) obj;
        return this.mId.equals(aREffectAsyncAsset.mId) && this.mCacheKey.equals(aREffectAsyncAsset.mCacheKey) && this.mStringIdentifiers.equals(aREffectAsyncAsset.mStringIdentifiers) && this.mUri.equals(aREffectAsyncAsset.mUri) && this.mCompressionMethod == aREffectAsyncAsset.mCompressionMethod && this.mIsLoggingDisabled == aREffectAsyncAsset.mIsLoggingDisabled;
    }

    public int getCompressionMethodForNative() {
        return ARRequestAsset$CompressionMethod.toXplatCompressionType(this.mCompressionMethod).mCppValue;
    }

    public String[] getFileNamesForNative() {
        return C36431kI.A1b(this.mStringIdentifiers);
    }

    public C23931Ak getStringIdentifiers() {
        return C23931Ak.copyOf((Collection) this.mStringIdentifiers);
    }

    public int hashCode() {
        int A04 = C36421kH.A04(this.mId);
        return C36351kA.A05(this.mCompressionMethod, C36381kD.A08(this.mUri, (C36381kD.A08(this.mCacheKey, A04) + this.mStringIdentifiers.hashCode()) * 31)) + (this.mIsLoggingDisabled ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mCacheKey);
        parcel.writeStringList(this.mStringIdentifiers);
        parcel.writeString(this.mUri);
        parcel.writeSerializable(this.mCompressionMethod);
        parcel.writeByte(this.mIsLoggingDisabled ? (byte) 1 : 0);
    }

    public AREffectAsyncAsset(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.mId = readString;
        String readString2 = parcel.readString();
        Objects.requireNonNull(readString2);
        this.mCacheKey = readString2;
        ArrayList A0I = AnonymousClass001.A0I();
        this.mStringIdentifiers = A0I;
        parcel.readStringList(A0I);
        String readString3 = parcel.readString();
        Objects.requireNonNull(readString3);
        this.mUri = readString3;
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable);
        this.mCompressionMethod = (ARRequestAsset$CompressionMethod) readSerializable;
        this.mIsLoggingDisabled = AnonymousClass000.A1P(parcel.readByte());
    }

    public String getCacheKey() {
        return this.mCacheKey;
    }

    public ARRequestAsset$CompressionMethod getCompressionMethod() {
        return this.mCompressionMethod;
    }

    public String getId() {
        return this.mId;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean isLoggingDisabled() {
        return this.mIsLoggingDisabled;
    }

    public AREffectAsyncAsset(String str, String str2, List list, String str3, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, boolean z) {
        AnonymousClass6GV.A00(str, "async asset id cannot be null");
        this.mId = str;
        AnonymousClass6GV.A00(str2, "async asset cache key cannot be null");
        this.mCacheKey = str2;
        this.mStringIdentifiers = list;
        this.mUri = str3;
        this.mCompressionMethod = aRRequestAsset$CompressionMethod;
        this.mIsLoggingDisabled = z;
    }
}
