package X;

import java.util.Collection;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.9WF  reason: invalid class name */
public final class AnonymousClass9WF {
    public final Map A00 = C36431kI.A1G();
    public final Stack A01 = new Stack();
    public final Stack A02 = new Stack();

    public final boolean A01(String str) {
        AnonymousClass00C.A0D(str, 0);
        Stack<C195679Vn> stack = this.A01;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            for (C195679Vn r0 : stack) {
                if (AnonymousClass00C.A0J(r0.A01, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A02(String str) {
        AnonymousClass00C.A0D(str, 0);
        Stack<C195679Vn> stack = this.A02;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            for (C195679Vn r0 : stack) {
                if (AnonymousClass00C.A0J(r0.A01, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C195679Vn A00() {
        Object peek;
        Stack stack = this.A02;
        if (C36411kG.A1a(stack)) {
            peek = stack.peek();
        } else {
            peek = this.A01.peek();
        }
        AnonymousClass00C.A08(peek);
        return (C195679Vn) peek;
    }
}
