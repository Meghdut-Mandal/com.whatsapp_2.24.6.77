package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.6Yq  reason: invalid class name and case insensitive filesystem */
public final class C133476Yq implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ C114395hB A01;

    public C133476Yq(Configuration configuration, C114395hB r2) {
        this.A00 = configuration;
        this.A01 = r2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.A00;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator A10 = C36371kC.A10(this.A01.A00);
        while (A10.hasNext()) {
            AnonymousClass69G r0 = (AnonymousClass69G) ((Reference) C36351kA.A0u(A10)).get();
            if (r0 == null || Configuration.needNewResources(updateFrom, r0.A00)) {
                A10.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    public void onLowMemory() {
        this.A01.A00.clear();
    }

    public void onTrimMemory(int i) {
        this.A01.A00.clear();
    }
}
