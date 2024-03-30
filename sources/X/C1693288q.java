package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.provider.atrace.Atrace;

/* renamed from: X.88q  reason: invalid class name and case insensitive filesystem */
public final class C1693288q extends C201689k7 {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C1693288q() {
        super("profilo_atrace");
    }

    public void disable() {
        Atrace.restoreSystrace(A01());
    }

    public void enable() {
        Atrace.enableSystrace(A01());
    }

    public int getSupportedProviders() {
        return A00;
    }

    public int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
