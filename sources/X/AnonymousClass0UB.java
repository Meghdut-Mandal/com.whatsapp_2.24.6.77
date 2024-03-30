package X;

/* renamed from: X.0UB  reason: invalid class name */
public final class AnonymousClass0UB {
    public int A00 = -1;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final C019408g A05;
    public final C019408g A06;
    public final /* synthetic */ C15200mr A07;

    public AnonymousClass0UB(Object obj, Object obj2, Object obj3, C019408g r5, C019408g r6, C15200mr r7) {
        this.A07 = r7;
        this.A03 = obj;
        this.A06 = r5;
        this.A05 = r6;
        this.A04 = obj2;
        this.A02 = obj3;
    }

    public final void A00() {
        AnonymousClass03l r4;
        Object obj = this.A01;
        C15200mr r3 = this.A07;
        if (obj instanceof C15460nN) {
            ((C15460nN) obj).A06((Throwable) null, r3.A04, this.A00);
        } else if ((obj instanceof AnonymousClass03l) && (r4 = (AnonymousClass03l) obj) != null) {
            r4.dispose();
        }
    }
}
