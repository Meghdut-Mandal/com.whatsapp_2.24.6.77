package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Objects;

/* renamed from: X.21q  reason: invalid class name */
public final class AnonymousClass21q extends C33991gH {
    public final AnonymousClass1Sk A00;
    public final AnonymousClass11F A01;
    public final C19730wQ A02;
    public final C20230xE A03;
    public final C220412q A04;
    public final AnonymousClass17X A05;
    public final C80163ux A06;
    public final AnonymousClass005 A07;

    public void onClick(View view) {
        AnonymousClass147 A012;
        AnonymousClass11F r2 = this.A06.A00;
        if (!this.A02.A0M(r2)) {
            C225314u A0S = C36381kD.A0S(view.getContext());
            if (C197029b1.A00(r2)) {
                AnonymousClass4WY r3 = new AnonymousClass4WY(r2, A0S, this, 1);
                AnonymousClass00C.A0D(A0S, 0);
                AnonymousClass1K6.A00(A0S, r3, ((AnonymousClass1K4) ((AnonymousClass1K3) this.A07.get())).A04, C51412nm.INVOKE, C36371kC.A0o());
            } else if (r2 instanceof UserJid) {
                A0S.startActivity(C36431kI.A0E(A0S, (UserJid) r2, C36401kF.A0k()));
            } else if (r2 instanceof AnonymousClass147) {
                AnonymousClass11F r1 = this.A01;
                if (AnonymousClass143.A0G(r1) && (A012 = C65533Sl.A01(r1)) != null) {
                    AnonymousClass1Sk r9 = this.A00;
                    int BEP = r9.A01.BEP(A012);
                    int A052 = r9.A03.A05(A012);
                    Integer A013 = AnonymousClass1Sk.A01(BEP);
                    long A014 = (long) C36401kF.A01(r9.A04, A012);
                    Integer A015 = C28381Sl.A01(A052);
                    if (!(A013 == null || A015 == null)) {
                        AnonymousClass2RK r12 = new AnonymousClass2RK();
                        r12.A05 = C36431kI.A1E(r9.A00.A00);
                        r12.A00 = 14;
                        r12.A01 = 1;
                        r12.A03 = A013;
                        r12.A04 = Long.valueOf(A014);
                        r12.A02 = A015;
                        r9.A05.Bly(r12);
                    }
                }
                GroupJid groupJid = (GroupJid) r2;
                C220412q r13 = this.A04;
                if (!r13.A0M(groupJid) || !this.A05.A0C(groupJid)) {
                    AnonymousClass147 A016 = C65533Sl.A01(groupJid);
                    if (A016 != null) {
                        C20230xE r22 = this.A03;
                        Objects.requireNonNull(A0S);
                        r22.Bl4(A016, new C89504Wu(A0S, 3), (String) null, 9);
                    }
                } else if (C63833Lp.A00(r13.A05(groupJid))) {
                    this.A03.Bl2(A0S, groupJid, 9);
                } else {
                    new AnonymousClass190();
                    C05290Pd.A00(A0S, C36361kB.A08(A0S, groupJid, 0), (Bundle) null);
                }
            }
        }
    }

    public AnonymousClass21q(Context context, C19730wQ r2, C20230xE r3, AnonymousClass1Sk r4, C220412q r5, AnonymousClass17X r6, C80163ux r7, AnonymousClass11F r8, AnonymousClass005 r9, int i) {
        super(context, i);
        this.A02 = r2;
        this.A04 = r5;
        this.A07 = r9;
        this.A00 = r4;
        this.A03 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r8;
    }
}
