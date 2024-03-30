package com.whatsapp.payments;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass1EU;
import X.AnonymousClass1EZ;
import X.C164977sg;
import X.C19770wU;
import X.C24601Db;
import X.C36371kC;
import X.C79593ty;
import X.C81123wV;
import java.util.Objects;

public class CheckFirstTransaction implements AnonymousClass01Y {
    public final C79593ty A00 = new C79593ty();
    public final AnonymousClass1EU A01;
    public final AnonymousClass1EZ A02;
    public final C24601Db A03;
    public final C19770wU A04;

    public CheckFirstTransaction(AnonymousClass1EZ r2, C24601Db r3, AnonymousClass1EU r4, C19770wU r5) {
        this.A04 = r5;
        this.A01 = r4;
        this.A03 = r3;
        this.A02 = r2;
    }

    public void BhM(AnonymousClass05R r5, AnonymousClass012 r6) {
        C79593ty r1;
        int ordinal = r5.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            if (!this.A02.A0D()) {
                r1 = this.A00;
            } else {
                C24601Db r2 = this.A03;
                if (r2.A03().contains("payment_is_first_send")) {
                    boolean A1U = C36371kC.A1U(r2.A03(), "payment_is_first_send");
                    if (Boolean.valueOf(A1U) != null && !A1U) {
                        r1 = this.A00;
                        z = false;
                    }
                }
                this.A04.Boy(new C81123wV((Object) this, 46));
                C79593ty r3 = this.A00;
                C24601Db r22 = this.A03;
                Objects.requireNonNull(r22);
                r3.A0A(new C164977sg(r22, 15));
            }
            r1.A0C(Boolean.valueOf(z));
            C79593ty r32 = this.A00;
            C24601Db r222 = this.A03;
            Objects.requireNonNull(r222);
            r32.A0A(new C164977sg(r222, 15));
        } else if (ordinal == 5) {
            this.A00.A0E();
        }
    }
}
