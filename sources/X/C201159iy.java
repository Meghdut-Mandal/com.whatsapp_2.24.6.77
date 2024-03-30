package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9iy  reason: invalid class name and case insensitive filesystem */
public final class C201159iy {
    public final AnonymousClass164 A00;
    public final C20350xQ A01;
    public final C20360xR A02;
    public final C191779Eh A03;

    public final AnonymousClass9W8 A01(List list, int i, int i2) {
        AnonymousClass9W8 r6;
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        List<AnonymousClass3QD> list2 = list;
        int i3 = i;
        int i4 = i2;
        if (i <= 0) {
            C191779Eh r3 = this.A03;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((AnonymousClass3QD) it.next()).A03) {
                        if (r3.A00.A0E(6350)) {
                            if (i == 0) {
                                this.A02.A01 = true;
                            }
                        }
                    }
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            C36371kC.A1R("GroupInfoBatchProcessor/processGroupInfo/legacy - \n              |processing ", A0u, list2);
            str = "\n";
            str2 = "";
            AnonymousClass098.A05(AnonymousClass091.A02(AnonymousClass000.A0r(" groups, round=", A0u, i3)), str, str2, false);
            ArrayList A0J = C36321k7.A0J(list2);
            for (AnonymousClass3QD r0 : list2) {
                A00(this, r0);
                A0J.add(r0.A01);
            }
            Set A0f = C007103b.A0f(A0J);
            this.A01.A0m(A0f, i4);
            C004702c r02 = C004702c.A00;
            r6 = new AnonymousClass9W8(A0f, r02, r02);
            sb = AnonymousClass000.A0u();
            str3 = "GroupInfoBatchProcessor/processGroupInfo/legacy - \n              |completed syncing of ";
            sb.append(str3);
            sb.append(r6.A01.size());
            AnonymousClass098.A05(AnonymousClass091.A02(AnonymousClass000.A0r(" groups, round=", sb, i3)), str, str2, false);
            return r6;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36371kC.A1R("GroupInfoBatchProcessor/processGroupInfo/threshold pipeline - \n              |processing ", A0u2, list2);
        str = "\n";
        str2 = "";
        AnonymousClass098.A05(AnonymousClass091.A02(AnonymousClass000.A0r(" groups, round=", A0u2, i3)), str, str2, false);
        LinkedHashSet A17 = C36441kJ.A17();
        ArrayList A0I = AnonymousClass001.A0I();
        for (AnonymousClass3QD r62 : list2) {
            if (r62.A03) {
                A0I.add(r62);
            } else {
                A00(this, r62);
                A17.add(r62.A01);
            }
        }
        if (i == 0) {
            if (C36411kG.A1a(A0I)) {
                ArrayList A0z = C36351kA.A0z(A0I);
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3QD r9 = (AnonymousClass3QD) it2.next();
                    C90494aF.A1F(r9.A01.getRawString(), Integer.valueOf(C90484aE.A0B(r9.A02)), A0z);
                }
                ArrayList A0z2 = C36351kA.A0z(A17);
                Iterator it3 = A17.iterator();
                while (it3.hasNext()) {
                    C90464aC.A1U(A0z2, it3);
                }
                this.A00.A01(new C22729Aun((Integer) null, A0z, C007103b.A0f(A0z2), 1, i4));
            } else {
                this.A01.A0m(A17, i4);
            }
        }
        ArrayList A0z3 = C36351kA.A0z(A0I);
        Iterator it4 = A0I.iterator();
        while (it4.hasNext()) {
            A0z3.add(((AnonymousClass3QD) it4.next()).A01);
        }
        r6 = new AnonymousClass9W8(A17, C004702c.A00, C007103b.A0f(A0z3));
        sb = AnonymousClass000.A0u();
        str3 = "GroupInfoBatchProcessor/processGroupInfo/threshold pipeline - \n              |completed syncing of ";
        sb.append(str3);
        sb.append(r6.A01.size());
        AnonymousClass098.A05(AnonymousClass091.A02(AnonymousClass000.A0r(" groups, round=", sb, i3)), str, str2, false);
        return r6;
    }

    public static final void A00(C201159iy r49, AnonymousClass3QD r50) {
        AnonymousClass3QD r8 = r50;
        C199999gO r7 = r8.A00;
        if (r7 != null) {
            C20350xQ r502 = r49.A01;
            AnonymousClass147 r492 = r8.A01;
            UserJid userJid = r7.A0B;
            long j = r7.A05;
            String str = r7.A0G;
            long j2 = r7.A06;
            long j3 = r7.A04;
            Integer num = r8.A02;
            AnonymousClass3QL r27 = r7.A0D;
            boolean z = r7.A0L;
            boolean z2 = r7.A0T;
            boolean z3 = r7.A0J;
            boolean z4 = r7.A0S;
            boolean z5 = r7.A0R;
            AnonymousClass3G4 r20 = r7.A0E;
            int i = r7.A01;
            AnonymousClass3S5 r16 = r7.A07;
            int i2 = r7.A02;
            AnonymousClass147 r17 = r7.A08;
            Map map = r7.A0H;
            boolean z6 = r7.A0O;
            boolean z7 = r7.A0P;
            int i3 = r7.A00;
            String str2 = r7.A0F;
            int i4 = r7.A03;
            C20350xQ r14 = r502;
            AnonymousClass3S5 r15 = r16;
            AnonymousClass147 r162 = r492;
            UserJid userJid2 = userJid;
            AnonymousClass3QL r19 = r27;
            Integer num2 = num;
            String str3 = str;
            String str4 = str2;
            int i5 = i3;
            int i6 = i4;
            r14.A0W(r15, r162, r17, userJid2, r19, r20, num2, str3, str4, map, i, i2, i5, i6, j, j2, j3, z, z2, z3, z4, z5, z6, z7, r7.A0M, r7.A0Q, r7.A0I, r7.A0N, r7.A0K);
            return;
        }
        throw AnonymousClass001.A09("Expected group data info but got null");
    }

    public C201159iy(AnonymousClass164 r1, C20360xR r2, C20350xQ r3, C191779Eh r4) {
        C36321k7.A18(r1, r3, r2, r4);
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
        this.A03 = r4;
    }
}
