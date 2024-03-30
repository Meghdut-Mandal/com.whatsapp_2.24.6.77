package X;

/* renamed from: X.0mM  reason: invalid class name and case insensitive filesystem */
public class C14890mM extends C14950mS implements C17910sH, C17960sM {
    public C14890mM(Class cls, String str, String str2) {
        super(cls, C03000Ct.NO_RECEIVER, str, str2);
    }

    public C17900sG BC9() {
        ((C17910sH) getReflected()).BC9();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public Object get(Object obj) {
        BC9();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public Object invoke(Object obj) {
        get(obj);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass0Cs computeReflected() {
        return this;
    }
}
