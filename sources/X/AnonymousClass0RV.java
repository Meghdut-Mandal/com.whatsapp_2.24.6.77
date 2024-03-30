package X;

/* renamed from: X.0RV  reason: invalid class name */
public abstract class AnonymousClass0RV {
    public static final C10880fN A00;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('(');
        A0u.append("(\\p{Digit}+)");
        A0u.append("(\\.)?(");
        A0u.append("(\\p{Digit}+)");
        A0u.append("?)(");
        A0u.append("[eE][+-]?(\\p{Digit}+)");
        A0u.append(")?)|(\\.(");
        A0u.append("(\\p{Digit}+)");
        A0u.append(")(");
        A0u.append("[eE][+-]?(\\p{Digit}+)");
        A0u.append(")?)|((");
        A0u.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        A0u.append(")[pP][+-]?");
        A0u.append("(\\p{Digit}+)");
        String A0t = AnonymousClass000.A0t(A0u, ')');
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        A0u2.append(A0t);
        A00 = new C10880fN(AnonymousClass000.A0q(")[fFdD]?))[\\x00-\\x20]*", A0u2));
    }
}
