package X;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.6F5  reason: invalid class name */
public abstract class AnonymousClass6F5 {
    public final int A00;
    public final Bundle A01;
    public final TaskCompletionSource A02 = new TaskCompletionSource();
    public final int A03;

    public void A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        A02(bundle2);
    }

    public final void A01(C108735Ur r6) {
        if (C90494aF.A1a("MessengerIpcClient")) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(r6);
            StringBuilder A0i = C90464aC.A0i(valueOf2, C90474aD.A05(valueOf) + 14);
            A0i.append("Failing ");
            A0i.append(valueOf);
            C90464aC.A1G(" with ", valueOf2, "MessengerIpcClient", A0i);
        }
        this.A02.setException(r6);
    }

    public final void A02(Object obj) {
        if (C90494aF.A1a("MessengerIpcClient")) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder A0i = C90464aC.A0i(valueOf2, C90474aD.A05(valueOf) + 16);
            A0i.append("Finishing ");
            A0i.append(valueOf);
            C90464aC.A1G(" with ", valueOf2, "MessengerIpcClient", A0i);
        }
        this.A02.setResult(obj);
    }

    public String toString() {
        boolean z;
        int i = this.A00;
        int i2 = this.A03;
        if (this instanceof C99444tN) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder A0h = C90524aI.A0h(55);
        A0h.append("Request { what=");
        A0h.append(i);
        A0h.append(" id=");
        A0h.append(i2);
        A0h.append(" oneWay=");
        A0h.append(z);
        return AnonymousClass000.A0q("}", A0h);
    }

    public AnonymousClass6F5(Bundle bundle, int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }
}
