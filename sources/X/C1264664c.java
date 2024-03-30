package X;

import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.64c  reason: invalid class name and case insensitive filesystem */
public final class C1264664c {
    public String A00;
    public final C19730wQ A01;
    public final C19970wo A02;
    public final C20310xM A03;
    public final C232317r A04;
    public final C20810yC A05;
    public final C237919w A06;

    public final void A00() {
        HashSet A0H;
        C232317r r0 = this.A04;
        C177528dw r6 = C177528dw.A00;
        AnonymousClass6X6 A0C = r0.A0C(r6);
        if (A0C.A00 != 0) {
            A0H = A0C.A0G();
        } else {
            A0H = A0C.A0H();
        }
        int size = A0H.size() - 1;
        C20810yC r7 = this.A05;
        if (size >= r7.A07(7957)) {
            HashSet A0I = A0C.A0I(this.A01, false);
            String A0D = A0C.A0D();
            AnonymousClass00C.A08(A0D);
            if (C14960mT.A00((((double) A0I.size()) / ((double) size)) * ((double) 100)) >= r7.A07(2860) && !A0D.equals(this.A00) && r7.A0E(7927)) {
                Log.i("DistributeSenderKeyRequester/sending invisible message to status participants");
                this.A00 = A0D;
                this.A03.A0h(new AnonymousClass5J0(this.A06.A02(r6, true), C19970wo.A00(this.A02)));
            }
        }
    }

    public C1264664c(C19730wQ r2, C19970wo r3, C20310xM r4, C232317r r5, C20810yC r6, C237919w r7) {
        C36321k7.A1B(r3, r6, r2, r7, r4);
        AnonymousClass00C.A0D(r5, 6);
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
    }
}
