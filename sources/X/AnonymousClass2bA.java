package X;

import java.io.File;

/* renamed from: X.2bA  reason: invalid class name */
public final class AnonymousClass2bA extends AnonymousClass1P2 {
    public final AnonymousClass16K A00;
    public final boolean A01;

    public int A01() {
        return 2;
    }

    public boolean A09(int i, boolean z) {
        return false;
    }

    public boolean A0A(AnonymousClass141 r3) {
        File A012;
        if (this.A01 || ((A012 = this.A00.A01(r3)) != null && A012.exists())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2bA(C19460v5 r2, C20690y0 r3, AnonymousClass17Y r4, C19730wQ r5, AnonymousClass16K r6, C21060yb r7, C18820ts r8, C20810yC r9, AnonymousClass1BF r10, AnonymousClass13J r11, C19770wU r12, boolean z) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        C36321k7.A1B(r9, r4, r5, r12, r3);
        C36321k7.A1C(r2, r8, r11, r7, r10);
        AnonymousClass00C.A0D(r6, 11);
        this.A00 = r6;
        this.A01 = z;
    }
}
