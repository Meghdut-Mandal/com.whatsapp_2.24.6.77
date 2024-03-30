package X;

import android.util.Base64;
import java.io.IOException;

/* renamed from: X.0Ly  reason: invalid class name and case insensitive filesystem */
public final class C04770Ly extends AnonymousClass0Y9 {
    public final /* synthetic */ C06940Vr A00;

    public final Object A03(Object obj) {
        try {
            return AnonymousClass0M7.A00(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            AnonymousClass0Y9.A01(obj, "Invalid byte[] value for ", this.A01, AnonymousClass000.A0u());
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C04770Ly(AnonymousClass0WY r2, C06940Vr r3, Object obj) {
        super(r2, obj, "getTokenRefactor__blocked_packages");
        this.A00 = r3;
    }
}
