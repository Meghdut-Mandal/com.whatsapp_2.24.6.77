package X;

import android.content.Context;
import android.util.Log;
import java.lang.ref.Reference;
import java.util.Collections;

/* renamed from: X.7qq  reason: invalid class name and case insensitive filesystem */
public class C163837qq implements C160217ke {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C163837qq(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bf6(C121065sX r5) {
        C158697hv r1;
        C111855cx r0;
        if (this.A03 != 0) {
            AnonymousClass00C.A0D(r5, 0);
            Context A0G = C36441kJ.A0G((Reference) this.A00);
            if (A0G != null) {
                C131756Qk.A01(A0G, r5, AnonymousClass6MO.A01, (AnonymousClass65A) this.A02, C000400e.A0D());
                r1 = (C158697hv) this.A01;
                r0 = C107345Ns.A00;
            } else {
                r1 = (C158697hv) this.A01;
                r0 = C107335Nr.A00;
            }
            r1.BU1(r0);
            return;
        }
        C131756Qk.A01((Context) this.A02, r5, AnonymousClass6MO.A01, ((C119185pN) this.A00).A00, Collections.emptyMap());
    }

    public void BfE(C122855vX r5) {
        C115145iP r2;
        AnonymousClass7fG r0;
        if (this.A03 != 0) {
            AnonymousClass00C.A0D(r5, 0);
            if (r5.A00 == 5) {
                Log.e("AsyncActionLauncher", "should launch as an async action");
            }
            ((C158697hv) this.A01).BU1(new C107315Np(r5));
            return;
        }
        AnonymousClass6S1 r3 = new AnonymousClass6S1(new C115155iQ(true), 1);
        if (r5.A00 == 5) {
            r2 = new C100584vG(r5.A01, r3);
        } else {
            r2 = new C100574vF(r3, r5.A02);
        }
        AnonymousClass6MF r1 = ((C114525hO) this.A01).A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.Bex(r2);
        }
    }

    public void BfG(String str) {
    }
}
