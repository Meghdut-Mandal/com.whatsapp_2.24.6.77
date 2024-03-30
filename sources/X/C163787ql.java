package X;

import android.content.Context;
import android.util.Log;
import java.util.Collections;

/* renamed from: X.7ql  reason: invalid class name and case insensitive filesystem */
public class C163787ql implements C160217ke {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C163787ql(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A03 = obj4;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void Bf6(C121065sX r10) {
        C121065sX r4 = r10;
        if (this.A04 != 0) {
            ((C120305rI) this.A00).A01.A00(new AnonymousClass73N(r4, this.A01, this.A03, this.A02, 15));
            return;
        }
        C131756Qk.A01((Context) this.A01, r10, AnonymousClass6MO.A01, (AnonymousClass65A) this.A03, Collections.emptyMap());
        ((AnonymousClass7fP) this.A02).B5t(true);
    }

    public void BfE(C122855vX r6) {
        if (this.A04 != 0) {
            ((C120305rI) this.A00).A01.A00(new C1501874h(this.A01, ((C158077fl) this.A02).B7y(), 5));
            return;
        }
        if (r6.A00 == 5) {
            Log.e("", "should launch as an async action");
        }
        ((AnonymousClass7fP) this.A02).B5t(false);
    }

    public void BfG(String str) {
    }
}
