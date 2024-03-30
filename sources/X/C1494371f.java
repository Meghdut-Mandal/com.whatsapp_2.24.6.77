package X;

/* renamed from: X.71f  reason: invalid class name and case insensitive filesystem */
public final class C1494371f implements C160227kf {
    public final /* synthetic */ C158077fl A00;
    public final /* synthetic */ C158077fl A01;
    public final /* synthetic */ AnonymousClass5PC A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ boolean A04;

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C120395rR r4 = (C120395rR) obj;
        AnonymousClass00C.A0D(r4, 0);
        if (r4.A01) {
            this.A02.A00.Bp3(new AnonymousClass755(this.A03, this.A01, r4, 23, this.A04));
            return;
        }
        A00(this.A04);
    }

    public C1494371f(C158077fl r1, C158077fl r2, AnonymousClass5PC r3, Object obj, boolean z) {
        this.A02 = r3;
        this.A04 = z;
        this.A03 = obj;
        this.A01 = r1;
        this.A00 = r2;
    }

    private final void A00(boolean z) {
        this.A02.A00.Bp3(new AnonymousClass752(this.A03, this.A00, 32, z));
    }

    public void BVK() {
        AnonymousClass3TI.A00("LinkActionIqHelper/Iq delivery fail");
        A00(this.A04);
    }

    public void BWl(Exception exc, Integer num) {
        StringBuilder A0i = C36341k9.A0i(exc);
        A0i.append("LinkActionIqHelper/Iq sent error with code ");
        A0i.append(num);
        AnonymousClass3TI.A02(AnonymousClass000.A0t(A0i, ' '), exc);
        A00(this.A04);
    }
}
