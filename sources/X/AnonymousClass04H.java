package X;

import java.util.HashMap;
import java.util.Objects;

/* renamed from: X.04H  reason: invalid class name */
public class AnonymousClass04H {
    public final AnonymousClass04G A00;
    public final AnonymousClass04J A01;
    public final AnonymousClass04K A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass04H(X.AnonymousClass04G r3, X.AnonymousClass016 r4) {
        /*
            r2 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            X.04J r1 = r4.BJ7()
            X.AnonymousClass00C.A08(r1)
            boolean r0 = r4 instanceof X.AnonymousClass015
            if (r0 == 0) goto L_0x0019
            X.015 r4 = (X.AnonymousClass015) r4
            X.04K r0 = r4.BAv()
        L_0x0015:
            r2.<init>(r3, r1, r0)
            return
        L_0x0019:
            X.04M r0 = X.AnonymousClass04M.A00
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04H.<init>(X.04G, X.016):void");
    }

    public AnonymousClass04R A01(Class cls, String str) {
        AnonymousClass04R r1;
        AnonymousClass08J r12;
        AnonymousClass00C.A0D(str, 0);
        HashMap hashMap = this.A01.A00;
        AnonymousClass04R r2 = (AnonymousClass04R) hashMap.get(str);
        if (cls.isInstance(r2)) {
            AnonymousClass04G r13 = this.A00;
            if ((r13 instanceof AnonymousClass08J) && (r12 = (AnonymousClass08J) r13) != null) {
                AnonymousClass00C.A08(r2);
                r12.A01(r2);
            }
            Objects.requireNonNull(r2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return r2;
        }
        AnonymousClass04L r22 = new AnonymousClass04L(this.A02);
        r22.A00.put(AnonymousClass04N.A01, str);
        try {
            r1 = this.A00.B46(r22, cls);
        } catch (AbstractMethodError unused) {
            r1 = this.A00.B3o(cls);
        }
        AnonymousClass04R r0 = (AnonymousClass04R) hashMap.put(str, r1);
        if (r0 != null) {
            r0.A0R();
        }
        return r1;
    }

    public AnonymousClass04R A00(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return A01(cls, sb.toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public AnonymousClass04H(AnonymousClass04G r2, AnonymousClass04J r3, AnonymousClass04K r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass04H(X.AnonymousClass016 r4) {
        /*
            r3 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            X.04J r2 = r4.BJ7()
            X.AnonymousClass00C.A08(r2)
            boolean r0 = r4 instanceof X.AnonymousClass015
            if (r0 == 0) goto L_0x0020
            X.015 r4 = (X.AnonymousClass015) r4
            X.04G r1 = r4.BAw()
            X.AnonymousClass00C.A08(r1)
            X.04K r0 = r4.BAv()
        L_0x001c:
            r3.<init>(r1, r2, r0)
            return
        L_0x0020:
            X.04N r1 = X.AnonymousClass04N.A00
            if (r1 != 0) goto L_0x002b
            X.04N r1 = new X.04N
            r1.<init>()
            X.AnonymousClass04N.A00 = r1
        L_0x002b:
            X.04M r0 = X.AnonymousClass04M.A00
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04H.<init>(X.016):void");
    }
}
