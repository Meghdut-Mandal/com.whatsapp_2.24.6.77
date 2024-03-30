package androidx.car.app.model;

import X.AnonymousClass000;
import X.C90474aD;

public final class DurationSpan extends CarSpan {
    public final long mDurationSeconds = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.mDurationSeconds);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[seconds: ");
        A0u.append(this.mDurationSeconds);
        return C90474aD.A0g(A0u);
    }
}
