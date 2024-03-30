package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165597tg;
import X.C22747AvI;
import java.util.Objects;

public final class ClickableSpan extends CarSpan {
    public final C22747AvI mOnClickDelegate = null;

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate));
        if (((ClickableSpan) obj).mOnClickDelegate != null) {
            z = false;
        }
        return C165597tg.A1S(valueOf, z);
    }

    public int hashCode() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.mOnClickDelegate != null) {
            z = false;
        }
        AnonymousClass000.A1N(objArr, 0, z);
        return Objects.hash(objArr);
    }

    public String toString() {
        return "[clickable]";
    }
}
