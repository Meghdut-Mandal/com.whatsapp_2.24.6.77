package X;

import com.facebook.profilo.core.ProvidersRegistry;

/* renamed from: X.88r  reason: invalid class name and case insensitive filesystem */
public final class C1693388r extends C201689k7 {
    public static final int A00 = ProvidersRegistry.A00.A02("qpl");

    public C1693388r() {
        super((String) null);
    }

    public void disable() {
    }

    public void enable() {
    }

    public int getTracingProviders() {
        C207229ul r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.A02 & A00;
    }

    public int getSupportedProviders() {
        return A00;
    }
}
