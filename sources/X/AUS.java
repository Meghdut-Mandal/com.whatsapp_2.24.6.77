package X;

import android.util.Pair;
import java.io.Serializable;
import java.util.Locale;

public class AUS implements Serializable {
    public static final long serialVersionUID = -4973307892907888099L;
    public final String mAssetUrl;
    public final String mCacheName;
    public final long mCachedRangeEnd;
    public final long mCachedRangeStart;
    public final String mEvictionReason;
    public final boolean mIsSecondPhasePrefetch;
    public final String mKey;
    public final long mLength;
    public final long mNewLength;
    public final long mNewPosition;
    public final C188228zF mOperation;
    public final long mPosition;
    public final String mPrefetchModule;
    public final String mPrefetchTag;
    public final String mRequestType;
    public final long mRequestedRangeEnd;
    public final long mRequestedRangeStart;
    public final String mSourceModule;
    public final long mTimestamp;

    public String toString() {
        Locale locale;
        Object[] objArr;
        String str;
        C188228zF r1 = this.mOperation;
        switch (r1.ordinal()) {
            case 0:
            case 1:
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[7];
                objArr2[0] = this.mSourceModule;
                objArr2[1] = this.mRequestType;
                objArr2[2] = r1.name();
                objArr2[3] = this.mPrefetchTag;
                objArr2[4] = this.mKey;
                long j = this.mPosition;
                AnonymousClass000.A1M(objArr2, 5, j);
                AnonymousClass000.A1M(objArr2, 6, j + this.mLength);
                return String.format(locale2, "[%s][%s][%s][%s] - %s [%d, %d] - [%s]", objArr2);
            case 2:
                long j2 = this.mPosition;
                long j3 = this.mNewPosition;
                if (j2 == j3) {
                    long j4 = this.mLength;
                    if (j4 == this.mNewLength) {
                        locale = Locale.US;
                        objArr = new Object[3];
                        objArr[0] = this.mKey;
                        AnonymousClass000.A1M(objArr, 1, j2);
                        AnonymousClass000.A1M(objArr, 2, j2 + j4);
                        str = "[SPAN HIT] - %s [%d, %d]";
                        break;
                    }
                }
                locale = Locale.US;
                objArr = new Object[5];
                objArr[0] = this.mKey;
                AnonymousClass000.A1M(objArr, 1, j2);
                AnonymousClass000.A1M(objArr, 2, j2 + this.mLength);
                AnonymousClass000.A1M(objArr, 3, j3);
                AnonymousClass000.A1M(objArr, 4, j3 + this.mNewLength);
                str = "[SPAN_TOUCHED] - %s [%d, %d],[%d,%d]";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                locale = Locale.US;
                objArr = new Object[]{this.mRequestType, r1, Pair.create(Long.valueOf(this.mRequestedRangeStart), Long.valueOf(this.mRequestedRangeEnd)), Pair.create(Long.valueOf(this.mCachedRangeStart), Long.valueOf(this.mCachedRangeEnd))};
                str = "[%s][%s] Requested %s, cached %s";
                break;
            default:
                return "Unknown. Err-roar";
        }
        return String.format(locale, str, objArr);
    }

    public AUS(Pair pair, C188228zF r6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, boolean z) {
        long A09;
        this.mOperation = r6;
        this.mCacheName = str;
        this.mSourceModule = str2;
        this.mRequestType = str3;
        this.mKey = str4;
        this.mRequestedRangeStart = j;
        this.mRequestedRangeEnd = j2;
        long j3 = -1;
        if (pair == null) {
            A09 = -1;
        } else {
            A09 = C36431kI.A09(pair.first);
        }
        this.mCachedRangeStart = A09;
        this.mCachedRangeEnd = pair != null ? C36431kI.A09(pair.second) : j3;
        this.mPosition = 0;
        this.mLength = 0;
        this.mNewPosition = 0;
        this.mNewLength = 0;
        this.mEvictionReason = null;
        this.mTimestamp = System.currentTimeMillis();
        this.mAssetUrl = str5;
        this.mPrefetchTag = str6;
        this.mPrefetchModule = str7;
        this.mIsSecondPhasePrefetch = z;
    }

    public AUS(C188228zF r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, long j2, long j3, long j4, boolean z) {
        this.mOperation = r3;
        this.mCacheName = str;
        this.mSourceModule = str2;
        this.mRequestType = str3;
        this.mKey = str4;
        this.mPosition = j;
        this.mLength = j2;
        this.mNewPosition = j3;
        this.mNewLength = j4;
        this.mEvictionReason = str6;
        this.mRequestedRangeStart = 0;
        this.mRequestedRangeEnd = 0;
        this.mCachedRangeStart = 0;
        this.mCachedRangeEnd = 0;
        this.mTimestamp = System.currentTimeMillis();
        this.mAssetUrl = str5;
        this.mPrefetchTag = str7;
        this.mPrefetchModule = str8;
        this.mIsSecondPhasePrefetch = z;
    }
}
