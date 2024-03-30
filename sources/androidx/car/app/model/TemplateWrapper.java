package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C15640nk;
import X.C165567td;
import java.util.List;

public final class TemplateWrapper {
    public String mId = "";
    public C15640nk mTemplate = null;
    public List mTemplateInfoForScreenStack = AnonymousClass001.A0I();

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[template: ");
        A0u.append(this.mTemplate);
        A0u.append(", ID: ");
        return C165567td.A0Y(this.mId, A0u);
    }
}
