package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Fr  reason: invalid class name and case insensitive filesystem */
public class C25281Fr implements AnonymousClass00M {
    public final C19730wQ A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass185 A03;
    public final AnonymousClass189 A04;
    public final AnonymousClass187 A05;
    public final AnonymousClass12P A06;
    public final C232317r A07;
    public final AnonymousClass16E A08;
    public final C231417i A09;
    public final C19770wU A0A;
    public final AnonymousClass005 A0B;
    public final C19970wo A0C;
    public final AnonymousClass17X A0D;

    public static HashSet A00(C25281Fr r7, ArrayList arrayList, List list, List list2, int i) {
        HashSet hashSet;
        AnonymousClass141 A082;
        if (i == 2 || i == 0) {
            HashSet hashSet2 = new HashSet();
            if (i != 0) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F r1 = (AnonymousClass11F) it.next();
                    C222813r r0 = UserJid.Companion;
                    if (C222813r.A00(r1) != null) {
                        hashSet2.add(r1);
                    } else {
                        AnonymousClass6SZ r02 = GroupJid.Companion;
                        if (!(AnonymousClass6SZ.A00(r1) == null || (A082 = r7.A02.A08(r1)) == null)) {
                            hashSet2.addAll(r7.A01(A082));
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            r7.A02.A0i(arrayList2);
            hashSet = new HashSet(arrayList2.size(), 1.0f);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AnonymousClass141 r2 = (AnonymousClass141) it2.next();
                UserJid userJid = (UserJid) r2.A06(UserJid.class);
                if (userJid != null && !hashSet2.contains(userJid) && !r7.A03.A04(userJid)) {
                    hashSet.add(userJid);
                    arrayList.add(r2);
                }
            }
        } else if (i == 1) {
            hashSet = new HashSet();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AnonymousClass11F r12 = (AnonymousClass11F) it3.next();
                C222813r r03 = UserJid.Companion;
                UserJid A002 = C222813r.A00(r12);
                AnonymousClass16D r4 = r7.A02;
                AnonymousClass141 A083 = r4.A08(r12);
                if (A002 != null) {
                    if (A083 != null) {
                        if (A083.A0F != null && !r7.A03.A04(A002)) {
                            hashSet.add(A002);
                            arrayList.add(A083);
                        }
                    }
                } else if (A083 == null) {
                }
                if (A083.A0G()) {
                    Iterator it4 = r7.A01(A083).iterator();
                    while (it4.hasNext()) {
                        UserJid userJid2 = (UserJid) it4.next();
                        AnonymousClass141 A084 = r4.A08(userJid2);
                        if (!(A084 == null || A084.A0F == null || r7.A03.A04(userJid2))) {
                            hashSet.add(userJid2);
                            arrayList.add(A084);
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
        return hashSet;
    }

    private HashSet A01(AnonymousClass141 r5) {
        HashSet hashSet = new HashSet();
        AnonymousClass11F r1 = r5.A0H;
        C222713q r0 = AnonymousClass11F.A00;
        AnonymousClass144 A002 = AnonymousClass6H4.A00(r1);
        if (A002 != null) {
            C225614x it = this.A0D.A07.A0C(A002).A07().iterator();
            while (it.hasNext()) {
                C19730wQ r02 = this.A00;
                UserJid userJid = ((AnonymousClass6PM) it.next()).A03;
                if (!r02.A0M(userJid)) {
                    hashSet.add(userJid);
                }
            }
        }
        return hashSet;
    }

    public void A02(AnonymousClass3T1 r21, boolean z, boolean z2) {
        Object obj;
        C1495671s B1k;
        int i;
        List list;
        List list2;
        int size;
        AnonymousClass3XT r0;
        AnonymousClass3T1 r3 = r21;
        if (r21 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("status-participant-user-manager/updateParticipantsTableForNewStatus/");
            C64933Qa r1 = r3.A1J;
            sb.append(r1);
            Log.i(sb.toString());
            obj = r1.A00;
        } else {
            Log.i("status-participant-user-manager/updateParticipantsTableForNewStatus");
            obj = C177528dw.A00;
        }
        C18740tg.A0B(obj instanceof C177528dw);
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            B1k = A052.B1k();
            if (!z || r21 == null || (r0 = r3.A0c.A01) == null) {
                AnonymousClass16E r02 = this.A08;
                i = r02.A05();
                list = r02.A0A();
                list2 = r02.A0B();
            } else {
                C18740tg.A06(r0);
                i = r0.A00;
                list = r0.A01;
                list2 = r0.A02;
            }
            C232317r r6 = this.A07;
            C177528dw r9 = C177528dw.A00;
            HashSet A0E = r6.A0E(r9);
            ArrayList arrayList = new ArrayList();
            HashSet A002 = A00(this, arrayList, list, list2, i);
            C19970wo r13 = this.A0C;
            long A003 = C19970wo.A00(r13) + 86400000;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass141 r2 = (AnonymousClass141) it.next();
                if (r2.A0B < A003) {
                    r2.A0B = C19970wo.A00(r13) + 604800000;
                    arrayList2.add(r2);
                }
            }
            this.A02.A0k(arrayList2);
            HashSet hashSet = new HashSet(A0E);
            hashSet.removeAll(A002);
            HashSet hashSet2 = new HashSet(A002);
            hashSet2.removeAll(A0E);
            C19730wQ r15 = this.A00;
            r15.A0G();
            PhoneUserJid phoneUserJid = r15.A03;
            C18740tg.A06(phoneUserJid);
            hashSet.remove(phoneUserJid);
            hashSet2.add(phoneUserJid);
            C18740tg.A06(obj);
            AnonymousClass144 r7 = (AnonymousClass144) obj;
            HashSet hashSet3 = new HashSet(hashSet2.size());
            if (!hashSet2.isEmpty()) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    UserJid userJid = (UserJid) it2.next();
                    HashSet A0B2 = this.A09.A0B(userJid);
                    C18740tg.A0C(!A0B2.isEmpty());
                    HashSet hashSet4 = new HashSet(A0B2.size());
                    Iterator it3 = A0B2.iterator();
                    while (it3.hasNext()) {
                        hashSet4.add(new AnonymousClass6B1((DeviceJid) it3.next(), false, false));
                    }
                    int i2 = 0;
                    if (r15.A0M(userJid)) {
                        i2 = 2;
                    }
                    AnonymousClass6PM r03 = new AnonymousClass6PM(userJid, hashSet4, i2, false);
                    r6.A0H(r03, r7);
                    hashSet3.add(r03);
                }
            }
            if (!hashSet.isEmpty()) {
                r6.A0K(r7, new ArrayList(hashSet));
            }
            AnonymousClass6X6 A0C2 = r6.A0C(r9);
            A0C2.A0K(hashSet3);
            A0C2.A0L(UserJid.userJidsFromChatJids(hashSet));
            boolean z3 = z2;
            if (!hashSet.isEmpty()) {
                if (this.A04.A0X()) {
                    this.A0A.Boy(new C35351iY(this, r9, A0C2, 7, z3));
                } else {
                    this.A05.A00.submit(new C35351iY(this, r9, A0C2, 8, z3));
                }
            } else if (z2) {
                ((C1264664c) this.A0B.get()).A00();
            }
            if (r21 != null) {
                r3.A0s = AnonymousClass6X6.A01(UserJid.userJidsFromChatJids(r6.A0E(r7)));
                if (A002.contains(phoneUserJid)) {
                    size = A002.size() - 1;
                } else {
                    size = A002.size();
                }
                r3.A0B = size;
            }
            hashSet2.size();
            hashSet.size();
            A002.size();
            B1k.A00();
            B1k.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C25281Fr(C19730wQ r1, AnonymousClass1DT r2, AnonymousClass16D r3, AnonymousClass185 r4, C19970wo r5, AnonymousClass189 r6, AnonymousClass187 r7, AnonymousClass17X r8, AnonymousClass12P r9, C232317r r10, AnonymousClass16E r11, C231417i r12, C19770wU r13, AnonymousClass005 r14) {
        this.A0C = r5;
        this.A00 = r1;
        this.A0A = r13;
        this.A08 = r11;
        this.A05 = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r6;
        this.A09 = r12;
        this.A03 = r4;
        this.A06 = r9;
        this.A07 = r10;
        this.A0D = r8;
        this.A0B = r14;
    }
}
