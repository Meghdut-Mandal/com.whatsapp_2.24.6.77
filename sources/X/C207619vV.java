package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9vV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207619vV implements AnonymousClass08V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1O1 A01;
    public final /* synthetic */ C108515Tu A02;
    public final /* synthetic */ C1041758o A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C207619vV(AnonymousClass1O1 r1, C108515Tu r2, C1041758o r3, Collection collection, List list, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = collection;
        this.A05 = list;
        this.A03 = r3;
        this.A06 = z;
        this.A07 = z2;
    }

    public final Object apply(Object obj) {
        AnonymousClass3IL r0;
        AnonymousClass1O1 r10 = this.A01;
        C108515Tu r11 = this.A02;
        int i = this.A00;
        Collection collection = this.A04;
        List list = this.A05;
        C1041758o r9 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A07;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass9NY A022 = r10.A0B.A02("sync/sync_delta/", list, Collections.emptyList());
        if (A022 == null) {
            r9.A09 = 2L;
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            HashSet A0C = r10.A0C.A0C();
            HashSet A16 = C36441kJ.A16();
            HashSet A162 = C36441kJ.A16();
            HashSet A09 = r10.A05.A0X.A09("SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION");
            Iterator it = A022.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it);
                if (!C202329lb.A03(A0f, A0C, true) && ((r0 = A0f.A0F) == null || !A09.contains(r0.A01))) {
                    AnonymousClass9jB r2 = new AnonymousClass9jB(A0f);
                    boolean A0D = r10.A0G.A0D();
                    r2.A0C = true;
                    r2.A0L = true;
                    r2.A0B = true;
                    Map map = r10.A0K;
                    UserJid userJid = r2.A0P;
                    AnonymousClass9jB.A02(r10, r2, userJid, map);
                    r2.A0E = true;
                    r2.A0I = A0D;
                    AnonymousClass141 r13 = r2.A0O;
                    C18740tg.A06(r13);
                    r2.A01 = C165607th.A06(r13, r11);
                    AnonymousClass9jB.A03(r10, r2, z, z2);
                    r2.A02 = AnonymousClass9jB.A00(r2, r10.A0E, userJid);
                    if (A0D) {
                        AnonymousClass9jB.A01(r10, r2, userJid);
                    }
                    AnonymousClass9jB.A04(r2, A0I);
                }
            }
            List list2 = A022.A00;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                A16.add(AnonymousClass1O1.A02(C36391kE.A0f(it2)));
            }
            Iterator it3 = A022.A04.iterator();
            while (it3.hasNext()) {
                AnonymousClass141 A0f2 = C36391kE.A0f(it3);
                if (!C202329lb.A03(A0f2, A0C, true) && !A16.contains(AnonymousClass1O1.A02(A0f2))) {
                    AnonymousClass3IL r1 = A0f2.A0F;
                    if (r1 == null || !A09.contains(r1.A01)) {
                        AnonymousClass9jB r12 = new AnonymousClass9jB(A0f2);
                        r12.A0C = true;
                        r12.A0D = true;
                        AnonymousClass9jB.A04(r12, A0I);
                        if (AnonymousClass1O1.A06(A0f2, A0C)) {
                            AnonymousClass9jB r14 = new AnonymousClass9jB(A0f2);
                            r14.A0L = true;
                            r14.A0B = true;
                            r14.A0G = true;
                            r14.A0K = true;
                            if (r10.A0F.A0E(4921)) {
                                r14.A0M = true;
                            }
                            Map map2 = r10.A0K;
                            UserJid userJid2 = r14.A0P;
                            AnonymousClass9jB.A02(r10, r14, userJid2, map2);
                            A162.add(userJid2);
                            AnonymousClass9jB.A04(r14, A0I);
                        }
                    }
                }
            }
            if (collection != null) {
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    AnonymousClass141 A0f3 = C36391kE.A0f(it4);
                    if (!A162.contains(A0f3.A06(UserJid.class)) && !C202329lb.A04(A0f3.A0H)) {
                        boolean A0D2 = r10.A0G.A0D();
                        AnonymousClass9jB r5 = new AnonymousClass9jB(A0f3);
                        r5.A0L = true;
                        r5.A0B = true;
                        r5.A0G = true;
                        r5.A0K = true;
                        r5.A0E = true;
                        r5.A01 = C165607th.A06(A0f3, r11);
                        r5.A0I = A0D2;
                        AnonymousClass9jB.A03(r10, r5, z, z2);
                        Map map3 = r10.A0K;
                        UserJid userJid3 = r5.A0P;
                        AnonymousClass9jB.A02(r10, r5, userJid3, map3);
                        r5.A02 = AnonymousClass9jB.A00(r5, r10.A0E, userJid3);
                        if (A0D2) {
                            AnonymousClass9jB.A01(r10, r5, userJid3);
                        }
                        AnonymousClass9jB.A04(r5, A0I);
                    }
                }
            }
            A0I.size();
            r9.A0F = C36441kJ.A0y(A0I.size());
            HashSet hashSet = new HashSet(A0I.size());
            if (!A0I.isEmpty()) {
                Iterator it5 = A0I.iterator();
                while (it5.hasNext()) {
                    UserJid userJid4 = ((C194179Ok) it5.next()).A07;
                    if (userJid4 != null) {
                        hashSet.add(userJid4);
                    }
                }
                if (AnonymousClass1O1.A04(r10, r9, str, C198869eK.A01(r11, AnonymousClass1O1.A01(r10), "sync_sid_delta", A0I, i))) {
                    C18740tg.A06(r10.A00);
                    AnonymousClass1O1.A03(r10, (Collection) null, list2, r10.A0N);
                    boolean A052 = AnonymousClass1O1.A05(r10, list2, A022.A03, A022.A06);
                    C192519Hh r02 = r10.A00;
                    C27491Ok.A01(r02, r9);
                    r10.A07.A01(r02.A00, r9, A0I, r10.A0L, r10.A0M, elapsedRealtime);
                    int i2 = 3;
                    if (A052) {
                        i2 = 2;
                    }
                    return new C131626Pu(hashSet, i2);
                }
            } else if (AnonymousClass1O1.A05(r10, list2, A022.A03, A022.A06)) {
                return C131626Pu.A07;
            } else {
                return C131626Pu.A08;
            }
        }
        return C131626Pu.A03;
    }
}
