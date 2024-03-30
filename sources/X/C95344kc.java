package X;

import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.4kc  reason: invalid class name and case insensitive filesystem */
public final class C95344kc extends AnonymousClass08K {
    public C135016bz A00;
    public String A01;
    public final Bundle A02;
    public final C115735jM A03;
    public final AnonymousClass6QG A04;
    public final C132426To A05;
    public final C134986bw A06;
    public final ArrayList A07;

    public AnonymousClass04R A02(AnonymousClass08M r38, Class cls, String str) {
        AnonymousClass08M r15 = r38;
        AnonymousClass00C.A0D(r15, 2);
        C115735jM r0 = this.A03;
        String str2 = this.A01;
        Bundle bundle = this.A02;
        C135016bz r10 = this.A00;
        AnonymousClass6QG r9 = this.A04;
        C134986bw r8 = this.A06;
        C132426To r7 = this.A05;
        ArrayList arrayList = this.A07;
        C27121Mz r1 = r0.A00;
        C18800tq r2 = r1.A01;
        AnonymousClass17Y A0M = C36351kA.A0M(r2);
        C19770wU A0Z = C36341k9.A0Z(r2);
        C19630wG A0W = C36351kA.A0W(r2);
        Application A002 = AnonymousClass1JT.A00(r2.AfJ);
        C18820ts A0T = C36341k9.A0T(r2);
        C27111My r12 = r1.A00;
        C145896uh A0Y = C27111My.A0Y(r12);
        C18830tt r02 = r2.A00;
        AnonymousClass1QW A0N = C90494aF.A0N(r02);
        C20830yE A0X = C36351kA.A0X(r2);
        C142616pA A0J = C90494aF.A0J(r02);
        C142606p9 A0O = C90494aF.A0O(r02);
        C135016bz r20 = r10;
        AnonymousClass6QG r21 = r9;
        C129006Eo r23 = (C129006Eo) r02.A3l.get();
        C130846Mq r24 = (C130846Mq) r02.A1N.get();
        AnonymousClass7g3 r25 = (AnonymousClass7g3) r12.A2I.get();
        C142646pD r19 = (C142646pD) r02.A1S.get();
        return new C95404kp(A002, bundle, r15, (AnonymousClass60b) r02.A1f.get(), A0M, A0J, r19, r20, r21, A0Y, r23, r24, r25, (AnonymousClass7gA) r12.A2H.get(), r7, r8, A0W, A0X, A0T, A0N, A0O, A0Z, str2, arrayList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95344kc(Bundle bundle, Bundle bundle2, AnonymousClass017 r4, C115735jM r5, C135016bz r6, AnonymousClass6QG r7, C132426To r8, C134986bw r9, String str, ArrayList arrayList) {
        super(bundle, r4);
        C36331k8.A1H(bundle2, r6);
        AnonymousClass00C.A0D(r9, 7);
        this.A01 = str;
        this.A02 = bundle2;
        this.A00 = r6;
        this.A04 = r7;
        this.A06 = r9;
        this.A05 = r8;
        this.A07 = arrayList;
        this.A03 = r5;
    }
}
