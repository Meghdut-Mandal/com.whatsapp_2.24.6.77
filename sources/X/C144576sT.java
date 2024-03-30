package X;

import java.util.Collections;

/* renamed from: X.6sT  reason: invalid class name and case insensitive filesystem */
public class C144576sT implements C20010ws {
    public final C19730wQ A00;
    public final AnonymousClass196 A01;
    public final AnonymousClass1AE A02;
    public final C20810yC A03;
    public final C19770wU A04;

    public void A00() {
        AnonymousClass53x r0;
        AnonymousClass196 r2 = this.A01;
        if (r2.A0S() && this.A03.A0E(7279) && (r0 = (AnonymousClass53x) this.A02.A00("setting_chatLock")) != null) {
            r2.A0M(Collections.singletonList(r0.A0I()));
            r2.A0G();
        }
    }

    public void A01() {
        AnonymousClass8YA r0;
        AnonymousClass196 r2 = this.A01;
        if (r2.A0S() && (r0 = (AnonymousClass8YA) this.A02.A00("status_privacy")) != null) {
            r2.A0M(C90484aE.A0r(r0.A0I()));
            r2.A0G();
        }
    }

    public void A02() {
        AnonymousClass1LZ A002;
        if (!this.A00.A0L() && (A002 = this.A02.A00("time_format")) != null) {
            this.A04.Boy(new C80263v7(this, A002, 42));
        }
    }

    public void BaC() {
        if (!this.A00.A0L()) {
            A02();
            AnonymousClass53y r2 = (AnonymousClass53y) this.A02.A00("setting_locale");
            if (r2 != null) {
                this.A04.Boy(new C106845Lo(this, r2));
            }
        }
    }

    public C144576sT(C19730wQ r1, AnonymousClass196 r2, C20810yC r3, AnonymousClass1AE r4, C19770wU r5) {
        this.A03 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r4;
    }
}
