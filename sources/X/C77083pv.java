package X;

/* renamed from: X.3pv  reason: invalid class name and case insensitive filesystem */
public class C77083pv implements AnonymousClass4RT {
    public final /* synthetic */ C40051uf A00;

    public C77083pv(C40051uf r1) {
        this.A00 = r1;
    }

    public void onError(Throwable th) {
        int i;
        C40051uf r5 = this.A00;
        C36341k9.A19(r5.A0q, false);
        if (th instanceof C52862qI) {
            i = ((C52862qI) th).errorCode;
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        int intValue = valueOf.intValue();
        if (intValue == 406) {
            r5.A0i.A05(false);
        } else if (intValue == 409) {
            r5.A0d.A0E(r5.A0h, (String) null, 3);
        }
        r5.A0D.A0C(valueOf);
    }
}
