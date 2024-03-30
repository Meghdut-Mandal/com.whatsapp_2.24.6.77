package com.facebook.wearable.applinks;

import X.C23180B8o;
import android.os.Parcel;
import android.os.Parcelable;

public enum AppLinkDeviceHardwareState implements Parcelable {
    HINGE_OPEN(0),
    HINGE_CLOSED(1),
    IN_DEEP_SLEEP(2),
    OUT_OF_DEEP_SLEEP(3),
    STREAMING_ACTIVE(4),
    STREAMING_INACTIVE(5);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int value;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = C23180B8o.A00(3);
    }

    /* access modifiers changed from: public */
    AppLinkDeviceHardwareState(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
