package X;

/* renamed from: X.0jv  reason: invalid class name and case insensitive filesystem */
public final class C13470jv extends C12340ht {
    public int A00;
    public int A01;
    public final /* synthetic */ C13510jz A02;

    public C13470jv(C13510jz r2) {
        this.A02 = r2;
        this.A00 = r2.size();
        this.A01 = r2.A01;
    }

    public void A00() {
        int i = this.A00;
        if (i == 0) {
            this.A01 = AnonymousClass0Ng.Done;
            return;
        }
        C13510jz r2 = this.A02;
        Object[] objArr = r2.A03;
        int i2 = this.A01;
        this.A00 = objArr[i2];
        this.A01 = AnonymousClass0Ng.Ready;
        this.A01 = (i2 + 1) % r2.A02;
        this.A00 = i - 1;
    }
}
