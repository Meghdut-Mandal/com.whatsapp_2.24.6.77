package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6uq  reason: invalid class name and case insensitive filesystem */
public final class C145986uq implements C160087kR {
    public final /* synthetic */ C128936Ee A00;
    public final /* synthetic */ C134876bk A01;
    public final /* synthetic */ AnonymousClass639 A02;
    public final /* synthetic */ C130286Km A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public void B2J(C123815x8 r14) {
        AnonymousClass00C.A0D(r14, 0);
        if (r14.A00 != 0) {
            C130286Km r5 = this.A03;
            AnonymousClass6MQ r3 = r5.A01;
            AnonymousClass66O r2 = r14.A04;
            AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
            C128936Ee r9 = this.A00;
            C134876bk r6 = this.A01;
            String str = this.A04;
            List list = this.A05;
            AnonymousClass639 r8 = this.A02;
            AVr aVr = new AVr(r5, r6, list, r8, r9, str, 4);
            r3.A00(r9, new C164587s3(r8, 2), (AnonymousClass2V1) r2, aVr);
            return;
        }
        C128386Cb r10 = (C128386Cb) r14.A03.A00;
        if (r10 == null) {
            this.A02.A00(2, (Integer) null);
            return;
        }
        AnonymousClass639 r7 = this.A02;
        AnonymousClass600 r4 = AnonymousClass6SO.A07;
        C128256Bn r92 = r7.A01;
        Map map = r92.A02;
        AnonymousClass6SO r82 = r7.A02;
        AnonymousClass1UJ r32 = r82.A02;
        C36321k7.A0w(map, r32);
        C134876bk r22 = (C134876bk) C131886Rd.A00(new AnonymousClass7ON(r32, map), 2);
        List list2 = r10.A03;
        if (C36401kF.A1a(list2)) {
            AnonymousClass6SO.A00(r22, r92, r82, list2);
        }
        List list3 = r10.A00;
        if (C36401kF.A1a(list3)) {
            AnonymousClass6SO.A00(r22, r92, r82, list3);
        }
        List list4 = r10.A01;
        if (C36401kF.A1a(list4)) {
            AnonymousClass6SO.A00(r22, r92, r82, list4);
        }
        List list5 = r10.A02;
        if (C36401kF.A1a(list5)) {
            AnonymousClass6Y4.A06(r82.A00, r82.A03, r82.A05, r4.A00(r22, r32, list5), 4);
        }
        if (C36401kF.A1a(list3) || C36401kF.A1a(list4)) {
            r7.A00.A00(-3, (Integer) null);
            return;
        }
        AnonymousClass62K r23 = r7.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/Crosspost success for session: ");
        C90464aC.A1R(A0u, r23.A01);
        AnonymousClass6EF r33 = r23.A00;
        if (r33 instanceof C107595Qc) {
            C107595Qc r34 = (C107595Qc) r33;
            C64583Oo r24 = (C64583Oo) C36411kG.A0v(r34.A00.A04);
            List list6 = r34.A03;
            boolean z = r34.A04;
            int i = 10;
            if (z) {
                i = 9;
            }
            r24.A01((Boolean) null, Integer.valueOf(i), (Integer) null, (Integer) null, r34.A02, list6, 1, z);
        } else if (r33 instanceof C107615Qe) {
            C107615Qe r35 = (C107615Qe) r33;
            C35011i0 r25 = r35.A02;
            ((C64583Oo) C36411kG.A0v(r25.A09)).A01((Boolean) null, r35.A03, (Integer) null, (Integer) null, r35.A04, r35.A05, 1, true);
            AnonymousClass1UZ r1 = (AnonymousClass1UZ) r25.A0G.get();
            AnonymousClass6EF.A00(r25, r1);
            r1.A04("FINISH_CROSSPOST");
            r1.A01();
        } else {
            C107605Qd r36 = (C107605Qd) r33;
            C35011i0 r12 = r36.A01;
            ((C64583Oo) C36411kG.A0v(r12.A09)).A01((Boolean) null, r36.A02, (Integer) null, (Integer) null, r36.A03, r36.A05, 1, false);
            AnonymousClass1UZ r26 = (AnonymousClass1UZ) r12.A0G.get();
            r26.A02(true, "is_account_linked");
            r26.A04("FINISH_CROSSPOST");
            r26.A01();
        }
    }

    public void BWk(Exception exc) {
        int i;
        Integer num;
        AnonymousClass00C.A0D(exc, 0);
        boolean z = exc instanceof AnonymousClass5V0;
        AnonymousClass639 r2 = this.A02;
        if (z) {
            C132286Sy r0 = ((AnonymousClass5V0) exc).error;
            i = r0.A01;
            num = Integer.valueOf(r0.A02);
        } else {
            i = 2;
            num = null;
        }
        r2.A00(i, num);
    }

    public C145986uq(C128936Ee r1, C134876bk r2, AnonymousClass639 r3, C130286Km r4, String str, List list) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = list;
    }

    public void BVL(IOException iOException) {
        AnonymousClass639 r5 = this.A02;
        AnonymousClass1UT.A01("XFamilyCrosspostRequestManager/generateCrosspostGraphqlCallback delivery failure", (Throwable) null);
        AnonymousClass66L r4 = (AnonymousClass66L) r5.A02.A06.get();
        C128256Bn r0 = r5.A01;
        String str = r0.A01;
        C23931Ak r02 = r0.A00;
        ArrayList A0J = C36321k7.A0J(r02);
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        AnonymousClass00C.A0D(A0J, 1);
        C90494aF.A1G(str, A0J, r4.A01);
        AnonymousClass62K r42 = r5.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/Crosspost delivery failure for session: ");
        String str2 = r42.A01;
        r42.A00.A01((Integer) null, (Integer) null, str2, C90464aC.A1Z(str2, A0u));
    }
}
