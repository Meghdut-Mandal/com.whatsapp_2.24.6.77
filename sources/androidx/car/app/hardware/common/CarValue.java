package androidx.car.app.hardware.common;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C36331k8;
import X.C36421kH;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class CarValue {
    public static final CarValue A00 = new CarValue(2);
    public static final CarValue A01 = new CarValue(2);
    public static final CarValue A02 = new CarValue(0);
    public static final CarValue A03 = new CarValue(0);
    public static final CarValue A04 = new CarValue(0);
    public static final CarValue A05 = new CarValue(0);
    public static final CarValue A06 = new CarValue(0);
    public static final CarValue A07 = new CarValue(0);
    public final List mCarZones;
    public final int mStatus;
    public final long mTimestampMillis;
    public final Object mValue;

    public CarValue(int i) {
        this.mValue = null;
        this.mTimestampMillis = 0;
        this.mStatus = i;
        this.mCarZones = Collections.singletonList(CarZone.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarValue)) {
            return false;
        }
        CarValue carValue = (CarValue) obj;
        return Objects.equals(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus && Objects.equals(this.mCarZones, carValue.mCarZones);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mValue;
        C36421kH.A1P(objArr, this.mTimestampMillis);
        C36331k8.A1V(objArr, this.mStatus);
        return C165597tg.A06(this.mCarZones, objArr, 3);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[value: ");
        A0u.append(this.mValue);
        A0u.append(", timestamp: ");
        A0u.append(this.mTimestampMillis);
        A0u.append(", Status: ");
        A0u.append(this.mStatus);
        A0u.append(", CarZones: ");
        return C165567td.A0X(this.mCarZones, A0u);
    }

    public CarValue() {
        this.mValue = null;
        this.mTimestampMillis = 0;
        this.mStatus = 0;
        this.mCarZones = Collections.emptyList();
    }
}
