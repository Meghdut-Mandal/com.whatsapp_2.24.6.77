package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.7y7  reason: invalid class name and case insensitive filesystem */
public final class C167487y7 extends AnonymousClass08X {
    public final C001600r A00;
    public final AnonymousClass08S A01;
    public final AnonymousClass08S A02;
    public final C001700s A03;
    public final C195419Uf A04;
    public final C195399Ud A05;
    public final C199899gC A06;
    public final AnonymousClass9UB A07;
    public final C19600wD A08;
    public final UserJid A09;
    public final C61223Ba A0A;
    public final AnonymousClass9ZJ A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167487y7(Application application, C195419Uf r12, AnonymousClass9ZJ r13, C195399Ud r14, AnonymousClass9UB r15, C19600wD r16, UserJid userJid, C61223Ba r18, C206819u1 r19) {
        super(application);
        C36421kH.A1J(r12, 3, application);
        C19600wD r1 = r16;
        C36321k7.A10(r14, r1);
        UserJid userJid2 = userJid;
        this.A09 = userJid2;
        this.A04 = r12;
        this.A0A = r18;
        this.A05 = r14;
        this.A08 = r1;
        this.A0B = r13;
        this.A07 = r15;
        AnonymousClass08S r5 = new AnonymousClass08S();
        this.A02 = r5;
        AnonymousClass08S r6 = new AnonymousClass08S();
        this.A01 = r6;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        String valueOf = String.valueOf(C36441kJ.A05(this.A00.getResources(), R.dimen.f7nameremoved));
        ArrayList A0I = AnonymousClass001.A0I();
        C206819u1 r7 = r19;
        for (C206579td r0 : r7.A02) {
            for (C206509tW r02 : r0.A01) {
                A0I.add(r02.A00);
            }
        }
        C199899gC r3 = new C199899gC(userJid2, valueOf, valueOf, A0I);
        this.A06 = r3;
        r6.A0F(A0S, new BA6(new C22350AlD(this), 49));
        r5.A0F(A0S, new BA7(new C22466An5(this, r7), 0));
        r14.A00(A0S, r3);
        this.A00 = r5;
    }

    public final void A0S() {
        this.A07.A01(this.A09, AnonymousClass96V.A00(), new C22351AlE(this));
    }
}
