package X;

/* renamed from: X.03q  reason: invalid class name and case insensitive filesystem */
public abstract class C008503q extends C008403p implements AnonymousClass03l, C007903j {
    public C007503f A00;

    public C15470nO BDY() {
        return null;
    }

    public boolean BL7() {
        return true;
    }

    public final C007503f A06() {
        C007503f r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("job");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[job@");
        sb.append(Integer.toHexString(System.identityHashCode(A06())));
        sb.append(']');
        return sb.toString();
    }

    public void dispose() {
        A06().A0o(this);
    }
}
