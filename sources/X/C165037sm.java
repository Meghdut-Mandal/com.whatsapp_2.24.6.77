package X;

import com.whatsapp.util.Log;

/* renamed from: X.7sm  reason: invalid class name and case insensitive filesystem */
public class C165037sm implements C160057kO {
    public Object A00;
    public final int A01;

    public C165037sm(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVK() {
        switch (this.A01) {
            case 0:
                ((C023509x) this.A00).resumeWith(new C106075Ig(C90524aI.A0X("onDeliveryFailure")));
                return;
            case 1:
                Log.e("WaffleClientCacheRefreshExecutor/ping:onDeliveryFailure");
                return;
            default:
                return;
        }
    }

    public void BWk(Exception exc) {
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(exc, 0);
                ((C023509x) this.A00).resumeWith(new C106075Ig(exc));
                return;
            case 1:
                AnonymousClass00C.A0D(exc, 0);
                Log.e("WaffleClientCacheRefreshExecutor/ping:onError", exc);
                return;
            default:
                return;
        }
    }

    public void Bi5(AnonymousClass6OQ r5) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                ((C1262963i) this.A00).A01.A09();
                return;
            default:
                if (r5 != null) {
                    C124035xU r1 = (C124035xU) this.A00;
                    r1.A01.A07(r5);
                    C1262963i r3 = r1.A03;
                    if (r3.A00.A00(C113435fX.A00) == null) {
                        r3.A03.A01();
                        return;
                    } else {
                        r3.A02.A00(new C165037sm(r3, 1));
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
