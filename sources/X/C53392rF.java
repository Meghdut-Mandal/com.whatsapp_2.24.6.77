package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.2rF  reason: invalid class name and case insensitive filesystem */
public class C53392rF implements AnonymousClass1IX {
    public Object A00;
    public Object A01;
    public final int A02;

    public C53392rF(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Bis() {
        if (this.A02 != 0) {
            Log.i("sync-manager/doPreCompanionLogoutTask onSyncdFailed");
            ((C79593ty) this.A01).A0C(C36381kD.A0j());
            return;
        }
        ((AnonymousClass196) this.A00).A08.unregisterObserver(this);
    }

    public void Bit() {
        if (this.A02 != 0) {
            Log.i("sync-manager/doPreCompanionLogoutTask onSyncdSuccess");
            ((C79593ty) this.A01).A0C(C36371kC.A0m());
            return;
        }
        AnonymousClass196 r2 = (AnonymousClass196) this.A00;
        r2.A08.unregisterObserver(this);
        HashMap A022 = r2.A0Q.A02();
        AnonymousClass1AB r22 = r2.A0E;
        boolean equals = A022.equals(this.A01);
        C44322Nb r1 = new C44322Nb();
        r1.A00 = Boolean.valueOf(equals);
        r22.A06.Bly(r1);
    }
}
