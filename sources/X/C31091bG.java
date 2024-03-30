package X;

import android.app.Application;
import android.app.Service;
import java.util.Objects;

/* renamed from: X.1bG  reason: invalid class name and case insensitive filesystem */
public final class C31091bG implements C18700tb {
    public Object A00;
    public final Service A01;

    public Object generatedComponent() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        Service service = this.A01;
        Application application = service.getApplication();
        C31111bI.A00("Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", new Object[]{application.getClass()}, application instanceof C18700tb);
        C31121bJ r0 = new C31121bJ(((C18800tq) C19570wA.A00(C18800tq.class, application)).AfI);
        Objects.requireNonNull(service);
        r0.A00 = service;
        C31141bL r1 = new C31141bL(r0.A01);
        this.A00 = r1;
        return r1;
    }

    public C31091bG(Service service) {
        this.A01 = service;
    }
}
