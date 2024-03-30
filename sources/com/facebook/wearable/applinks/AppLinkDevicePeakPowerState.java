package com.facebook.wearable.applinks;

import X.C23180B8o;
import android.os.Parcel;
import android.os.Parcelable;

public enum AppLinkDevicePeakPowerState implements Parcelable {
    NORMAL(0),
    THROTTLE_LEVEL_1(1),
    THROTTLE_LEVEL_2(2),
    THROTTLE_LEVEL_3(3),
    SHUTDOWN(4),
    UNKNOWN(5);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int value;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = C23180B8o.A00(4);
    }

    /* access modifiers changed from: public */
    AppLinkDevicePeakPowerState(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
