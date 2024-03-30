package X;

import java.io.IOException;

/* renamed from: X.AsO  reason: case insensitive filesystem */
public abstract class C22658AsO extends AnonymousClass121 implements C219411z, B0J {
    public final int A00;
    public final C219411z A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if ((r3 instanceof X.C16580pk) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22658AsO(X.C219411z r3, int r4, boolean r5) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "'obj' cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            r2.A00 = r4
            if (r5 != 0) goto L_0x0011
            boolean r1 = r3 instanceof X.C16580pk
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r2.A02 = r0
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22658AsO.<init>(X.11z, int, boolean):void");
    }

    public AnonymousClass121 A0B() {
        boolean z = this.A02;
        return new C22681Asl(this.A01, this.A00, z);
    }

    public AnonymousClass121 BDb() {
        return this;
    }

    public static AnonymousClass121 A01(C22658AsO asO) {
        return asO.A01.Bve();
    }

    public static C22658AsO A02(Object obj) {
        if (obj == null || (obj instanceof C22658AsO)) {
            return (C22658AsO) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A02(AnonymousClass121.A00((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A08(C36331k8.A0i("failed to construct tagged object from byte[]: ", AnonymousClass000.A0u(), e));
            }
        } else {
            throw C165567td.A0N(obj, "unknown object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public AnonymousClass121 A0C() {
        if ((this instanceof C22680Ask) || (this instanceof C22681Asl)) {
            return this;
        }
        boolean z = this.A02;
        return new C22680Ask(this.A01, this.A00, z);
    }

    public boolean A0F(AnonymousClass121 r4) {
        if (!(r4 instanceof C22658AsO)) {
            return false;
        }
        C22658AsO asO = (C22658AsO) r4;
        if (this.A00 != asO.A00 || this.A02 != asO.A02) {
            return false;
        }
        AnonymousClass121 A012 = A01(this);
        AnonymousClass121 A013 = A01(asO);
        if (A012 == A013 || A012.A0F(A013)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 240;
        if (this.A02) {
            i2 = 15;
        }
        return (i ^ i2) ^ A01(this).hashCode();
    }

    public String toString() {
        StringBuilder A0p = C90484aE.A0p();
        A0p.append(this.A00);
        A0p.append("]");
        return AnonymousClass000.A0o(this.A01, A0p);
    }
}
