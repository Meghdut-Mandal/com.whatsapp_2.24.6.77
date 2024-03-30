package androidx.compose.runtime;

import X.C005102h;
import X.C161517n2;
import X.C161547n5;

public final class ProduceStateScopeImpl implements C161547n5, C161517n2 {
    public final C005102h A00;
    public final /* synthetic */ C161547n5 A01;

    public Object getValue() {
        return this.A01.getValue();
    }

    public void setValue(Object obj) {
        this.A01.setValue(obj);
    }

    public ProduceStateScopeImpl(C161547n5 r1, C005102h r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public C005102h BAE() {
        return this.A00;
    }
}
