package X;

import android.os.ConditionVariable;

/* renamed from: X.3O7  reason: invalid class name */
public final class AnonymousClass3O7 {
    public String A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1NX A02;
    public final AnonymousClass1DW A03;
    public final AnonymousClass1AW A04;
    public final AnonymousClass1EO A05;
    public final C28381Sl A06;
    public final AnonymousClass1EM A07;

    public static final synchronized String A00(AnonymousClass3O7 r2) {
        String A0l;
        synchronized (r2) {
            ConditionVariable conditionVariable = C18740tg.A00;
            A0l = C36361kB.A0l();
            r2.A00 = A0l;
            AnonymousClass00C.A0E(A0l, "null cannot be cast to non-null type kotlin.String");
        }
        return A0l;
    }

    public AnonymousClass3O7(AnonymousClass1DT r2, AnonymousClass1NX r3, AnonymousClass1DW r4, AnonymousClass1AW r5, AnonymousClass1EO r6, C28381Sl r7, AnonymousClass1EM r8) {
        C36321k7.A11(r3, r4, r8);
        AnonymousClass00C.A0D(r2, 5);
        C36321k7.A10(r5, r6);
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
    }
}
