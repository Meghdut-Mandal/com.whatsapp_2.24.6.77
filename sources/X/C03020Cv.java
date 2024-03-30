package X;

/* renamed from: X.0Cv  reason: invalid class name and case insensitive filesystem */
public abstract class C03020Cv extends C03000Ct implements C03010Cu, AnonymousClass00Q {
    public final int arity;
    public final int flags;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C03020Cv) {
                C03020Cv r4 = (C03020Cv) obj;
                if (!this.name.equals(r4.name) || !this.signature.equals(r4.signature) || this.flags != r4.flags || this.arity != r4.arity || !AnonymousClass00C.A0J(this.receiver, r4.receiver) || !AnonymousClass00C.A0J(getOwner(), r4.getOwner())) {
                    return false;
                }
            } else if (obj instanceof C03010Cu) {
                return obj.equals(compute());
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03020Cv(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public C03010Cu getReflected() {
        return (C03010Cu) super.getReflected();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + this.name.hashCode()) * 31) + this.signature.hashCode();
    }

    public boolean isExternal() {
        ((C03010Cu) super.getReflected()).isExternal();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isInfix() {
        ((C03010Cu) super.getReflected()).isInfix();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isInline() {
        ((C03010Cu) super.getReflected()).isInline();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isOperator() {
        ((C03010Cu) super.getReflected()).isOperator();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isSuspend() {
        ((C03010Cu) super.getReflected()).isSuspend();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public String toString() {
        AnonymousClass0Cs compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        String str = this.name;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("function ");
        sb.append(str);
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public AnonymousClass0Cs computeReflected() {
        return this;
    }

    public int getArity() {
        return this.arity;
    }
}
