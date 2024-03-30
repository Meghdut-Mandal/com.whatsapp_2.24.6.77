package X;

import androidx.compose.ui.node.ForceUpdateElement;

/* renamed from: X.6Hr  reason: invalid class name and case insensitive filesystem */
public abstract class C129596Hr {
    public static final C94084hc A00;

    static {
        C94084hc r1 = new C94084hc();
        r1.A00 = -1;
        A00 = r1;
    }

    public static final int A00(C161637nE r2, C161637nE r3) {
        if (AnonymousClass00C.A0J(r2, r3)) {
            return 2;
        }
        Class<?> cls = r2.getClass();
        Class<?> cls2 = r3.getClass();
        if (cls == cls2) {
            return 1;
        }
        if (!(r2 instanceof ForceUpdateElement) || ((ForceUpdateElement) r2).A00.getClass() != cls2) {
            return 0;
        }
        return 1;
    }
}
