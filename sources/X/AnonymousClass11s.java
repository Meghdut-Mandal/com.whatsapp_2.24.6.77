package X;

import java.security.PrivilegedAction;

/* renamed from: X.11s  reason: invalid class name */
public class AnonymousClass11s implements PrivilegedAction {
    public final /* synthetic */ AnonymousClass11n A00;

    public AnonymousClass11s(AnonymousClass11n r1) {
        this.A00 = r1;
    }

    public Object run() {
        AnonymousClass11n r2 = this.A00;
        AnonymousClass11n.A00("org.spongycastle.jcajce.provider.digest.", r2, AnonymousClass11n.A02);
        AnonymousClass11n.A00("org.spongycastle.jcajce.provider.symmetric.", r2, AnonymousClass11n.A04);
        AnonymousClass11n.A00("org.spongycastle.jcajce.provider.symmetric.", r2, AnonymousClass11n.A03);
        return null;
    }
}
