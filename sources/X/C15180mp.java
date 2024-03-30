package X;

/* renamed from: X.0mp  reason: invalid class name and case insensitive filesystem */
public final class C15180mp extends C15210ms {
    public final C006302t A00;

    public void A04(Throwable th) {
        this.A00.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A04((Throwable) obj);
        return AnonymousClass0AJ.A00;
    }

    public C15180mp(C006302t r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InvokeOnCancel[");
        AnonymousClass000.A1C(this.A00, A0u);
        A0u.append('@');
        AnonymousClass000.A1B(this, A0u);
        return AnonymousClass000.A0t(A0u, ']');
    }
}
