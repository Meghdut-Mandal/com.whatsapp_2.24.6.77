package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AVy  reason: case insensitive filesystem */
public final class C21678AVy implements Runnable {
    public C193039Jp A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C195419Uf A02;
    public final /* synthetic */ C207269up A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C21678AVy(C195419Uf r1, C207269up r2, UserJid userJid, String str, String str2, String str3, long j) {
        this.A01 = j;
        this.A02 = r1;
        this.A04 = userJid;
        this.A03 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
    }

    public void run() {
        AnonymousClass9Y1 r10;
        C195209Sx r8;
        C134736bW r7;
        long j;
        C134546bD r0;
        List list;
        List list2;
        long j2 = this.A01;
        Boolean A0m = C36371kC.A0m();
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        C195419Uf r6 = this.A02;
        AnonymousClass6VE r5 = r6.A06;
        UserJid userJid = this.A04;
        if (i == 0) {
            C207269up r102 = this.A03;
            String str = r102.A0F;
            r5.A07(userJid, str);
            C129356Gp.A01(r6.A05, r5, userJid);
            AnonymousClass9Y1 r72 = r6.A07;
            C195209Sx r52 = new C195209Sx();
            C193039Jp r3 = this.A00;
            if (r3 == null) {
                throw C36331k8.A0d("sessionSnapShot");
            }
            C193039Jp.A00(r52, r3, r72);
            C36401kF.A1F(r52, 30);
            C36411kG.A1G(r52, 54);
            if (r102.A0B == null) {
                A0m = null;
            }
            r52.A01(A0m);
            r52.A0G = str;
            r52.A00 = userJid;
            r52.A08 = Long.valueOf(j2);
            r52.A0C = this.A06;
            r52.A0H = this.A07;
            r52.A0B = this.A05;
            r72.A03(r52);
        } else {
            C207269up r14 = this.A03;
            String str2 = r14.A0F;
            AnonymousClass6B4 A032 = r5.A03(userJid, str2);
            if (A032 == null) {
                A032 = new AnonymousClass6B4(r14, 1, 1);
                r10 = r6.A07;
                r8 = new C195209Sx();
                C193039Jp r02 = this.A00;
                if (r02 == null) {
                    throw C36331k8.A0d("sessionSnapShot");
                }
                C193039Jp.A00(r8, r02, r10);
                C36401kF.A1F(r8, 28);
                C36411kG.A1G(r8, 49);
                r8.A0G = str2;
                r7 = r14.A0B;
                if (r7 == null) {
                    A0m = null;
                }
                r8.A01(A0m);
                r8.A00 = userJid;
                j2 = A032.A00;
            } else {
                A032.A00 = j2;
                r10 = r6.A07;
                r8 = new C195209Sx();
                C193039Jp r73 = this.A00;
                if (r73 == null) {
                    throw C36331k8.A0d("sessionSnapShot");
                }
                C193039Jp.A00(r8, r73, r10);
                C36401kF.A1F(r8, 29);
                C36411kG.A1G(r8, 53);
                r7 = r14.A0B;
                if (r7 == null) {
                    A0m = null;
                }
                r8.A01(A0m);
                r8.A0G = str2;
                r8.A00 = userJid;
            }
            r8.A08 = Long.valueOf(j2);
            r8.A0C = this.A06;
            r8.A0H = this.A07;
            r8.A0B = this.A05;
            r10.A03(r8);
            if (r7 != null) {
                C134546bD r03 = r7.A00;
                if (r03 == null || (list2 = r03.A00) == null || list2.isEmpty()) {
                    j = A032.A01;
                } else {
                    ArrayList A15 = C36441kJ.A15((Collection) r5.A04(r6.A08).get());
                    AnonymousClass03Y.A0E(A15, new C22346Al9(r14), true);
                    A15.add(A032);
                    j = C129356Gp.A00(r14, A15);
                }
            } else {
                j = A032.A00;
            }
            A032.A01 = j;
            r5.A05(A032, userJid);
            if (!(r7 == null || (r0 = r7.A00) == null || (list = r0.A00) == null || list.isEmpty())) {
                ArrayList<C134656bO> A0I = AnonymousClass001.A0I();
                for (Object next : list) {
                    if (!AnonymousClass00C.A0J(((C134656bO) next).A00, str2)) {
                        A0I.add(next);
                    }
                }
                ArrayList A0z = C36351kA.A0z(A0I);
                for (C134656bO r04 : A0I) {
                    A0z.add(r04.A00);
                }
                UserJid userJid2 = r6.A08;
                ArrayList A152 = C36441kJ.A15((Collection) r5.A04(userJid2).get());
                ArrayList A0I2 = AnonymousClass001.A0I();
                Iterator it = A152.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (A0z.contains(((AnonymousClass6B4) next2).A02.A0F)) {
                        A0I2.add(next2);
                    }
                }
                ArrayList A0z2 = C36351kA.A0z(A0I2);
                Iterator it2 = A0I2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass6B4 A0M = C165617ti.A0M(it2);
                    A0M.A01 = A032.A01;
                    A0z2.add(A0M);
                }
                Iterator it3 = A0z2.iterator();
                while (it3.hasNext()) {
                    AnonymousClass6B4 A0M2 = C165617ti.A0M(it3);
                    AnonymousClass00C.A0B(A0M2);
                    r5.A05(A0M2, userJid2);
                }
            }
        }
        r6.A00();
    }
}
