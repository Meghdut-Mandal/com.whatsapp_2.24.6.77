package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C15640nk;
import X.C165567td;
import X.C165597tg;
import java.util.Objects;

public class TabContents {
    public C15640nk mTemplate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabContents)) {
            return false;
        }
        return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
    }

    public int hashCode() {
        return C165597tg.A06(this.mTemplate, AnonymousClass001.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[template: ");
        return C165567td.A0X(this.mTemplate, A0u);
    }
}
