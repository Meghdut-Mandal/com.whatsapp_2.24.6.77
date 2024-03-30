package X;

import com.whatsapp.AbstractConsumerAppShell;

/* renamed from: X.0tc  reason: invalid class name and case insensitive filesystem */
public abstract class C18710tc extends AbstractConsumerAppShell implements C18700tb {
    public final C18880ty componentManager = new C18880ty(new C18870tx(this));
    public boolean injected = false;

    public final Object generatedComponent() {
        return this.componentManager.generatedComponent();
    }

    public void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            generatedComponent();
        }
    }

    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    public final C18880ty componentManager() {
        return this.componentManager;
    }
}
