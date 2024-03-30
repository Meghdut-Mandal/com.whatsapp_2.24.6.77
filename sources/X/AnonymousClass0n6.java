package X;

/* renamed from: X.0n6  reason: invalid class name */
public final class AnonymousClass0n6 extends AnonymousClass03P implements C005702n {
    public final String A00;
    public final Throwable A01;

    private final void A00() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Module with the Main dispatcher had failed to initialize");
            String str2 = this.A00;
            if (str2 == null || (str = AnonymousClass000.A0p(". ", str2, AnonymousClass000.A0u())) == null) {
                str = "";
            }
            throw new IllegalStateException(AnonymousClass000.A0q(str, A0u), th);
        }
        throw AnonymousClass001.A09("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public AnonymousClass0n6(String str, Throwable th) {
        this.A01 = th;
        this.A00 = str;
    }

    public C005502l A01(int i) {
        A00();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public /* bridge */ /* synthetic */ void A03(Runnable runnable, C005102h r4) {
        A00();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean A04(C005102h r3) {
        A00();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass03l BL6(Runnable runnable, C005102h r4, long j) {
        A00();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public /* bridge */ /* synthetic */ void BpP(AnonymousClass0AP r3, long j) {
        A00();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Dispatchers.Main[missing");
        Throwable th = this.A01;
        if (th != null) {
            str = AnonymousClass000.A0l(th, ", cause=", AnonymousClass000.A0u());
        } else {
            str = "";
        }
        A0u.append(str);
        return AnonymousClass000.A0t(A0u, ']');
    }

    public AnonymousClass03P A05() {
        return this;
    }
}
