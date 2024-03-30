package androidx.car.app.model;

import X.AnonymousClass000;
import X.C36441kJ;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class DateTimeWithZone {
    public final long mTimeSinceEpochMillis = 0;
    public final int mZoneOffsetSeconds = 0;
    public final String mZoneShortName = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    static {
        TimeUnit.HOURS.toSeconds(1);
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = Long.valueOf(this.mTimeSinceEpochMillis);
        AnonymousClass000.A1K(A1Q, this.mZoneOffsetSeconds);
        A1Q[2] = this.mZoneShortName;
        return Objects.hash(A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[time since epoch (ms): ");
        long j = this.mTimeSinceEpochMillis;
        A0u.append(j);
        A0u.append("( ");
        A0u.append(new Date(j));
        A0u.append(")  zone offset (s): ");
        A0u.append(this.mZoneOffsetSeconds);
        A0u.append(", zone: ");
        A0u.append(this.mZoneShortName);
        return AnonymousClass000.A0q("]", A0u);
    }
}
