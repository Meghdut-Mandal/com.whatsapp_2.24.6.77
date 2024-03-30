package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1KP  reason: invalid class name */
public final class AnonymousClass1KP {
    public final AnonymousClass1KL A00;
    public final C20810yC A01;
    public final C19730wQ A02;

    public AnonymousClass1KP(C19730wQ r2, AnonymousClass1KL r3, C20810yC r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A02 = r2;
        this.A01 = r4;
        this.A00 = r3;
    }

    public static final boolean A00(AnonymousClass1KP r3, C207109uZ r4, String str, boolean z) {
        if (!z) {
            return false;
        }
        AnonymousClass1KL r1 = r3.A00;
        if ((r1.A00() & 128) <= 0 || r4 == null || !r4.A0X) {
            return false;
        }
        if ((r1.A00() & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) > 0) {
            return r4.A0R.contains(new C206469tS(str));
        }
        return true;
    }

    public final boolean A03(C207109uZ r6, UserJid userJid) {
        if (!this.A02.A0M(userJid)) {
            AnonymousClass1KL r1 = this.A00;
            return (r1.A00() & 128) <= 0 || r6 == null || !r6.A0X || (r1.A00() & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) <= 0 || r6.A0R.contains(new C206469tS("collections"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r0 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C207109uZ r4) {
        /*
            r3 = this;
            X.0yC r2 = r3.A01
            r0 = 1678(0x68e, float:2.351E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0015
            r0 = 1096(0x448, float:1.536E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            java.lang.String r0 = "search"
            boolean r0 = A00(r3, r4, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KP.A01(X.9uZ):boolean");
    }

    public final boolean A02(C207109uZ r4) {
        return A00(this, r4, "variants", C20800yB.A01(C21000yV.A02, this.A01, 3837));
    }
}
