package androidx.car.app.model;

import X.AnonymousClass001;
import java.util.Objects;

public final class TemplateInfo {
    public final Class mTemplateClass = null;
    public final String mTemplateId = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && Objects.equals(this.mTemplateId, templateInfo.mTemplateId);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mTemplateClass;
        A0M[1] = this.mTemplateId;
        return Objects.hash(A0M);
    }
}
