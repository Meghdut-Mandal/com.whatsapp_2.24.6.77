package X;

/* renamed from: X.0dJ  reason: invalid class name and case insensitive filesystem */
public class C09880dJ implements AnonymousClass04S {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass08S A01;

    public C09880dJ(AnonymousClass08S r2) {
        this.A01 = r2;
    }

    public void BTH(Object obj) {
        AnonymousClass08S r2 = this.A01;
        Object A04 = r2.A04();
        if (!this.A00) {
            if (A04 == null) {
                if (obj == null) {
                    return;
                }
            } else if (A04.equals(obj)) {
                return;
            }
        }
        this.A00 = false;
        r2.A0D(obj);
    }
}
