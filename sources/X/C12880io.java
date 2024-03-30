package X;

/* renamed from: X.0io  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12880io implements AnonymousClass03l {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ AnonymousClass03R A01;

    public /* synthetic */ C12880io(Runnable runnable, AnonymousClass03R r2) {
        this.A01 = r2;
        this.A00 = runnable;
    }

    public final void dispose() {
        AnonymousClass03R r0 = this.A01;
        r0.A00.removeCallbacks(this.A00);
    }
}
