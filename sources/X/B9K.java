package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class B9K implements AnonymousClass08V {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;

    public B9K(AnonymousClass1O1 r2, C108515Tu r3, C1041758o r4, List list, List list2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0F = i2;
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A06 = z5;
        this.A07 = z6;
        this.A08 = z7;
        this.A09 = z8;
        this.A0A = z9;
        this.A00 = i;
        this.A03 = list;
        this.A04 = list2;
        this.A05 = r4;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A0F != 0) {
            AnonymousClass1O1 r15 = (AnonymousClass1O1) this.A01;
            C108515Tu r14 = (C108515Tu) this.A02;
            boolean z = this.A0B;
            boolean z2 = this.A0C;
            boolean z3 = this.A0D;
            boolean z4 = this.A0E;
            boolean z5 = this.A06;
            boolean z6 = this.A07;
            boolean z7 = this.A08;
            boolean z8 = this.A09;
            boolean z9 = this.A0A;
            int i = this.A00;
            List list = (List) this.A03;
            List list2 = (List) this.A04;
            C1041758o r7 = (C1041758o) this.A05;
            String str = (String) obj2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C18740tg.A09("", list);
            ArrayList A0I = AnonymousClass001.A0I();
            try {
                ArrayList A012 = C202329lb.A01(r15.A0A, MessageDigest.getInstance("MD5"), list, list2);
                HashSet hashSet = new HashSet(A012.size());
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 A0f = C36391kE.A0f(it);
                    AnonymousClass9jB r2 = new AnonymousClass9jB(A0f);
                    r2.A0L = z;
                    r2.A0J = z2;
                    r2.A0B = z3;
                    r2.A0G = true;
                    r2.A0E = z4;
                    r2.A01 = C165607th.A06(A0f, r14);
                    r2.A0I = z5;
                    r2.A0F = z6;
                    r2.A0H = z7;
                    r2.A0N = z8;
                    r2.A0M = z9;
                    if (z4) {
                        r2.A02 = AnonymousClass9jB.A00(r2, r15.A0E, r2.A0P);
                    }
                    C165577te.A14(r15, r2, z5 ? 1 : 0);
                    Map map = r15.A0K;
                    UserJid userJid = r2.A0P;
                    AnonymousClass9jB.A02(r15, r2, userJid, map);
                    AnonymousClass9jB.A04(r2, A0I);
                    if (userJid != null) {
                        hashSet.add(userJid);
                    }
                }
                A0I.size();
                if (!C165577te.A1Y(r7, A0I)) {
                    if (AnonymousClass1O1.A04(r15, r7, str, C198869eK.A01(r14, AnonymousClass1O1.A01(r15), "sync_sid_notification_sidelist", A0I, i))) {
                        C192519Hh.A00(r15, r7, A0I, elapsedRealtime);
                        return new C131626Pu(hashSet, 3);
                    }
                    return C131626Pu.A03;
                }
            } catch (NoSuchAlgorithmException e) {
                throw C90524aI.A0Y(e);
            }
        } else {
            AnonymousClass1O1 r12 = (AnonymousClass1O1) this.A01;
            C108515Tu r152 = (C108515Tu) this.A02;
            boolean z10 = this.A0B;
            boolean z11 = this.A0C;
            boolean z12 = this.A0D;
            boolean z13 = this.A0E;
            boolean z14 = this.A06;
            boolean z15 = this.A07;
            boolean z16 = this.A08;
            boolean z17 = this.A09;
            boolean z18 = this.A0A;
            int i2 = this.A00;
            List list3 = (List) this.A03;
            C1041758o r8 = (C1041758o) this.A05;
            String str2 = (String) obj2;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            C18740tg.A09("", list3);
            ArrayList A0I2 = AnonymousClass001.A0I();
            AnonymousClass9NY A022 = r12.A0B.A02("sync/sync_notification/", (List) this.A04, list3);
            if (A022 != null) {
                HashSet A0C2 = r12.A0C.A0C();
                List list4 = A022.A02;
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    AnonymousClass141 A0f2 = C36391kE.A0f(it2);
                    if (!C202329lb.A03(A0f2, A0C2, false)) {
                        AnonymousClass9jB r22 = new AnonymousClass9jB(A0f2);
                        r22.A0C = true;
                        r22.A0L = z10;
                        r22.A0J = z11;
                        r22.A0B = z12;
                        r22.A0E = z13;
                        r22.A01 = C165607th.A06(A0f2, r152);
                        r22.A0I = z14;
                        r22.A0F = z15;
                        r22.A0H = z16;
                        r22.A0N = z17;
                        r22.A0M = z18;
                        if (z13) {
                            r22.A02 = AnonymousClass9jB.A00(r22, r12.A0E, r22.A0P);
                        }
                        C165577te.A14(r12, r22, z14 ? 1 : 0);
                        AnonymousClass9jB.A02(r12, r22, r22.A0P, r12.A0K);
                        AnonymousClass9jB.A04(r22, A0I2);
                    }
                }
                A0I2.size();
                if (!C165577te.A1Y(r8, A0I2)) {
                    if (AnonymousClass1O1.A04(r12, r8, str2, AnonymousClass1O1.A01(r12).A05(new C198869eK(r152, A0I2, i2, false), C202329lb.A00("sync_sid_notification_contact"), 64000))) {
                        AnonymousClass1O1.A03(r12, AnonymousClass001.A0I(), list4, r12.A0N);
                        if (!list4.isEmpty()) {
                            r12.A05.A0O(list4, false);
                        }
                        C192519Hh.A00(r12, r8, A0I2, elapsedRealtime2);
                        return C131626Pu.A07;
                    }
                }
            }
            return C131626Pu.A03;
        }
        return C131626Pu.A08;
    }
}
