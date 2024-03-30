package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C22741AvC;
import java.util.List;
import java.util.Objects;

public final class Alert {
    public final List mActions;
    public final C22741AvC mCallbackDelegate;
    public final long mDuration;
    public final CarIcon mIcon;
    public final int mId = 0;
    public final CarText mSubtitle;
    public final CarText mTitle;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
        }
        return true;
    }

    public Alert() {
        Objects.requireNonNull("");
        this.mTitle = new CarText((CharSequence) "");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = AnonymousClass001.A0I();
        this.mDuration = 0;
        this.mCallbackDelegate = null;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, this.mId);
        return Objects.hash(A0L);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[id: ");
        A0u.append(this.mId);
        A0u.append(", title: ");
        A0u.append(this.mTitle);
        A0u.append(", icon: ");
        return C165567td.A0X(this.mIcon, A0u);
    }
}
