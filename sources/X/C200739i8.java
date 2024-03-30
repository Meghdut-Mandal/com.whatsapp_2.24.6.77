package X;

import android.util.Pair;
import java.util.Stack;

/* renamed from: X.9i8  reason: invalid class name and case insensitive filesystem */
public abstract class C200739i8 {
    public static final C198669e0 A00;
    public static final C198669e0 A01;
    public static final C198669e0 A02;

    static {
        C198669e0 r3 = new C198669e0("({[", ")}]");
        A02 = r3;
        C198669e0 r2 = new C198669e0("*~_", "*~_");
        A00 = r2;
        C198669e0[] r1 = new C198669e0[2];
        C36331k8.A1N(r3, r2, r1);
        A01 = new C198669e0(r1);
    }

    public static boolean A01(Pair pair, CharSequence charSequence) {
        C198669e0 r5 = A02;
        Stack stack = new Stack();
        for (int A04 = C36381kD.A04(pair); A04 < C36381kD.A03(pair); A04++) {
            char charAt = charSequence.charAt(A04);
            String valueOf = String.valueOf(charAt);
            if ("({[".contains(valueOf)) {
                stack.push(Character.valueOf(charAt));
            } else if (!")}]".contains(valueOf)) {
                continue;
            } else if (stack.empty() || !r5.A00(((Character) stack.peek()).charValue(), charAt)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static Pair A00(Pair pair, C198669e0 r6, CharSequence charSequence) {
        char c;
        Object valueOf;
        Object obj;
        int A04 = C36381kD.A04(pair);
        char c2 = 0;
        if (A04 != 0) {
            c = charSequence.charAt(A04 - 1);
        } else {
            c = 0;
        }
        if (C36381kD.A03(pair) != charSequence.length()) {
            c2 = charSequence.charAt(C36381kD.A03(pair));
        }
        char charAt = charSequence.charAt(C36381kD.A04(pair));
        char charAt2 = charSequence.charAt(C36381kD.A03(pair) - 1);
        if (!r6.A00(c, c2)) {
            if (r6.A00(c, charAt2)) {
                valueOf = pair.first;
            } else if (r6.A00(charAt, c2)) {
                valueOf = Integer.valueOf(C36381kD.A04(pair) + 1);
                obj = pair.second;
                return C36441kJ.A0Q(valueOf, obj);
            } else if (r6.A00(charAt, charAt2)) {
                valueOf = Integer.valueOf(C36381kD.A04(pair) + 1);
            }
            obj = Integer.valueOf(C36381kD.A03(pair) - 1);
            return C36441kJ.A0Q(valueOf, obj);
        }
        return pair;
    }
}
