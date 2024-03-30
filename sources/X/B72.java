package X;

import java.util.Map;

public class B72 extends AYB {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B72(C21892AcL acL, int i) {
        super(acL, (B72) null);
        this.A01 = i;
        this.A00 = acL;
    }

    public Object getOutput(int i) {
        switch (this.A01) {
            case 0:
                return ((C21892AcL) this.A00).key(i);
            case 1:
                return getOutput(i);
            default:
                return ((C21892AcL) this.A00).value(i);
        }
    }

    /* renamed from: getOutput  reason: collision with other method in class */
    public Map.Entry m18getOutput(int i) {
        return new AnonymousClass8HQ((C21892AcL) this.A00, i);
    }
}
