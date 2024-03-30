package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.4ka  reason: invalid class name and case insensitive filesystem */
public class C95324ka extends AnonymousClass08K {
    public final int A00;
    public final C115835jW A01;
    public final String A02;

    public AnonymousClass04R A02(AnonymousClass08M r16, Class cls, String str) {
        C115835jW r0 = this.A01;
        int i = this.A00;
        String str2 = this.A02;
        C32591ds r2 = r0.A00;
        C18800tq r1 = r2.A02;
        C20810yC A0V = C36341k9.A0V(r1);
        Application A002 = AnonymousClass1JT.A00(r1.AfJ);
        AnonymousClass17Y A0M = C36351kA.A0M(r1);
        C18830tt r12 = r1.A00;
        return new C95384kj(A002, r16, (C115845jX) r2.A01.A08.get(), (C1254960a) r12.A1e.get(), A0M, (C1255760k) r12.A0W.get(), C18830tt.A2J(r12), C27111My.A0U(r2.A00), A0V, (AnonymousClass6OF) r12.A0V.get(), str2, i);
    }

    public C95324ka(Bundle bundle, AnonymousClass017 r2, C115835jW r3, String str, int i) {
        super(bundle, r2);
        this.A01 = r3;
        this.A00 = i;
        this.A02 = str;
    }
}
