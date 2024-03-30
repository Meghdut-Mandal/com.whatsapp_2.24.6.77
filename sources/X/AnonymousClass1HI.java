package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1HI  reason: invalid class name */
public class AnonymousClass1HI {
    public final HashSet A00 = new HashSet();
    public final HashSet A01 = new HashSet();
    public final AnonymousClass16D A02;
    public final AnonymousClass1DM A03;
    public final AnonymousClass1A3 A04;
    public final C220412q A05;
    public final AnonymousClass17X A06;
    public final C24561Cx A07;
    public final AnonymousClass12O A08;
    public final C20810yC A09;
    public final AnonymousClass1A1 A0A;
    public final AnonymousClass005 A0B;

    public boolean A05(AnonymousClass6CO r6, C99764tv r7, AnonymousClass3T1 r8) {
        if (r8 == null) {
            return false;
        }
        try {
            AnonymousClass8NK A012 = ((C30661aZ) this.A0B.get()).A01(r6, r8);
            AnonymousClass8NN A0p = C172848Pk.DEFAULT_INSTANCE.A0p();
            A0p.A0S();
            C172848Pk r1 = (C172848Pk) A0p.A00;
            AnonymousClass8SU r0 = (AnonymousClass8SU) A012.A0R();
            r0.getClass();
            r1.message_ = r0;
            r1.bitField0_ |= 1;
            long j = r8.A1N;
            A0p.A0S();
            C172848Pk r12 = (C172848Pk) A0p.A00;
            r12.bitField0_ |= 2;
            r12.msgOrderId_ = j;
            C170918Hz A0R = A0p.A0R();
            r7.A0S();
            C100104uT r2 = (C100104uT) r7.A00;
            C100104uT r02 = C100104uT.DEFAULT_INSTANCE;
            A0R.getClass();
            C23122B6c b6c = r2.messages_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r2.messages_ = b6c;
            }
            b6c.add(A0R);
            return true;
        } catch (C25311Fu e) {
            Log.e("HistorySyncUtils/addMessage/invalid message", e);
            return false;
        }
    }

    public C99764tv A00(AnonymousClass11F r12, Map map, Map map2) {
        int i;
        int i2;
        Long l;
        C99764tv r5 = (C99764tv) C100104uT.DEFAULT_INSTANCE.A0p();
        C18740tg.A06(r12);
        String rawString = r12.getRawString();
        r5.A0S();
        C100104uT r1 = (C100104uT) r5.A00;
        rawString.getClass();
        r1.bitField0_ |= 1;
        r1.id_ = rawString;
        C220412q r8 = this.A05;
        C65073Qp A092 = r8.A09(r12, false);
        if (A092 != null) {
            if (A092.A08() != null) {
                r5.A0V(A092.A08());
            }
            synchronized (A092) {
                i = A092.A04;
            }
            boolean z = true;
            boolean z2 = false;
            if (i == 1) {
                z2 = true;
            }
            r5.A0S();
            C100104uT r13 = (C100104uT) r5.A00;
            r13.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            r13.notSpam_ = z2;
            boolean z3 = A092.A0i;
            r5.A0S();
            C100104uT r14 = (C100104uT) r5.A00;
            r14.bitField0_ |= 16384;
            r14.archived_ = z3;
            long max = Math.max(A092.A03() / 1000, 0);
            r5.A0S();
            C100104uT r10 = (C100104uT) r5.A00;
            r10.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r10.conversationTimestamp_ = max;
            int max2 = Math.max(A092.A0b.expiration, 0);
            r5.A0S();
            C100104uT r15 = (C100104uT) r5.A00;
            r15.bitField0_ |= 128;
            r15.ephemeralExpiration_ = max2;
            long max3 = Math.max(A092.A0b.ephemeralSettingTimestamp, 0);
            r5.A0S();
            C100104uT r3 = (C100104uT) r5.A00;
            r3.bitField0_ |= 256;
            r3.ephemeralSettingTimestamp_ = max3;
            synchronized (A092) {
                i2 = A092.A0A;
            }
            int max4 = Math.max(i2, 0);
            r5.A0S();
            C100104uT r16 = (C100104uT) r5.A00;
            r16.bitField0_ |= 16;
            r16.unreadCount_ = max4;
            if (((long) A092.A08) != -1) {
                z = false;
            }
            r5.A0S();
            C100104uT r2 = (C100104uT) r5.A00;
            r2.bitField0_ |= C132986Wc.A0F;
            r2.markedAsUnread_ = z;
            boolean A0N = r8.A0N(r12);
            r5.A0S();
            C100104uT r17 = (C100104uT) r5.A00;
            r17.bitField0_ |= 32;
            r17.readOnly_ = A0N;
            int A012 = r8.A01(r12);
            r5.A0S();
            C100104uT r22 = (C100104uT) r5.A00;
            r22.bitField0_ |= 65536;
            r22.unreadMentionCount_ = A012;
            if (r12 instanceof GroupJid) {
                r5.A0W(this.A06.A04((AnonymousClass144) r12, false));
                boolean z4 = this.A02.A0D(r12).A0r;
                r5.A0S();
                C100104uT r23 = (C100104uT) r5.A00;
                r23.bitField0_ |= 67108864;
                r23.suspended_ = z4;
            } else {
                C192449Ha r6 = (C192449Ha) map.get(r12);
                if (r6 != null) {
                    byte[] bArr = r6.A01;
                    AnonymousClass8I5 A013 = C21674AUx.A01(bArr, 0, bArr.length);
                    r5.A0S();
                    C100104uT r24 = (C100104uT) r5.A00;
                    r24.bitField0_ |= 262144;
                    r24.tcToken_ = A013;
                    long longValue = r6.A00.longValue();
                    r5.A0S();
                    C100104uT r4 = (C100104uT) r5.A00;
                    r4.bitField0_ |= 524288;
                    r4.tcTokenTimestamp_ = longValue;
                }
                C119505pv r0 = (C119505pv) map2.get(r12);
                if (!(r0 == null || (l = r0.A01) == null)) {
                    long longValue2 = l.longValue();
                    r5.A0S();
                    C100104uT r25 = (C100104uT) r5.A00;
                    r25.bitField0_ |= 33554432;
                    r25.tcTokenSenderTimestamp_ = longValue2;
                    return r5;
                }
            }
        }
        return r5;
    }

    public ArrayList A01(Set set) {
        List A0F;
        PhoneUserJid phoneUserJid;
        if (!C20800yB.A01(C21000yV.A02, this.A09, 7392)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass12O r5 = this.A08;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (userJid instanceof C223313w) {
                PhoneUserJid A0A2 = r5.A0A((C223313w) userJid);
                if (A0A2 != null && !linkedHashMap.containsKey(A0A2)) {
                    A0F = r5.A0F(A0A2);
                    phoneUserJid = A0A2;
                }
            } else if ((userJid instanceof PhoneUserJid) && !linkedHashMap.containsKey(userJid)) {
                A0F = r5.A0F((PhoneUserJid) userJid);
                phoneUserJid = userJid;
                if (!(!A0F.isEmpty())) {
                }
            }
            linkedHashMap.put(phoneUserJid, A0F);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            for (Jid rawString : (List) entry.getValue()) {
                AnonymousClass8NN A0p = C99854u4.DEFAULT_INSTANCE.A0p();
                String rawString2 = ((Jid) entry.getKey()).getRawString();
                A0p.A0S();
                C99854u4 r1 = (C99854u4) A0p.A00;
                rawString2.getClass();
                r1.bitField0_ |= 1;
                r1.pnJid_ = rawString2;
                String rawString3 = rawString.getRawString();
                A0p.A0S();
                C99854u4 r12 = (C99854u4) A0p.A00;
                rawString3.getClass();
                r12.bitField0_ |= 2;
                r12.lidJid_ = rawString3;
                arrayList.add(A0p.A0R());
            }
        }
        return arrayList;
    }

    public LinkedHashMap A02(Cursor cursor, AnonymousClass6CO r12, C158297gh r13, List list, long j) {
        HashSet hashSet;
        int i;
        AnonymousClass1DM r0 = this.A03;
        HashMap A092 = r0.A09();
        HashMap A0A2 = r0.A0A();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet2 = new HashSet();
        while (cursor.moveToNext()) {
            AnonymousClass3T1 A002 = this.A0A.A00(cursor);
            if (A002 != null) {
                A04(A002, hashSet2);
                AnonymousClass1A3 r02 = this.A04;
                C64933Qa r8 = A002.A1J;
                r02.A01(r8);
                if (r13 != null) {
                    r13.BdR(A002);
                }
                if (A002.A0I < j) {
                    break;
                }
                AnonymousClass11F r1 = r8.A00;
                if (r1 != null && !(A002 instanceof C106265Iz)) {
                    if (r12.A02 || !C197029b1.A00(r1)) {
                        C99764tv r7 = (C99764tv) linkedHashMap.get(r1);
                        if (r7 == null) {
                            r7 = A00(r1, A092, A0A2);
                            linkedHashMap.put(r1, r7);
                        }
                        boolean A052 = A05(r12, r7, A002);
                        int i2 = r12.A00;
                        if (i2 > 0) {
                            Iterator it = this.A07.A01(Collections.singletonList(A002), i2).iterator();
                            while (it.hasNext()) {
                                A05(r12, r7, (AnonymousClass3T1) it.next());
                            }
                        }
                        if (!A052) {
                            if (A002 instanceof AnonymousClass2bI) {
                                hashSet = this.A00;
                                i = ((AnonymousClass2bI) A002).A00;
                            } else {
                                hashSet = this.A01;
                                i = A002.A1I;
                            }
                            hashSet.add(Integer.valueOf(i));
                        }
                    }
                }
            }
        }
        list.addAll(A01(hashSet2));
        return linkedHashMap;
    }

    public void A03(AnonymousClass144 r8, C99764tv r9) {
        AnonymousClass6PM A082;
        AnonymousClass5UC r0;
        AnonymousClass6X6 A0C = this.A06.A07.A0C(r8);
        C225614x it = C20760y7.copyOf((Collection) A0C.A08.keySet()).iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (!(userJid == null || (A082 = A0C.A08(userJid)) == null)) {
                AnonymousClass8NN A0p = C99914uA.DEFAULT_INSTANCE.A0p();
                String rawString = A082.A03.getRawString();
                A0p.A0S();
                C99914uA r1 = (C99914uA) A0p.A00;
                rawString.getClass();
                r1.bitField0_ |= 1;
                r1.userJid_ = rawString;
                int i = A082.A01;
                if (i != 0) {
                    if (i == 1) {
                        r0 = AnonymousClass5UC.ADMIN;
                    } else if (i != 2) {
                        r0 = null;
                    } else {
                        r0 = AnonymousClass5UC.SUPERADMIN;
                    }
                    A0p.A0S();
                    C99914uA r12 = (C99914uA) A0p.A00;
                    r12.rank_ = r0.value;
                    r12.bitField0_ |= 2;
                }
                r9.A0S();
                C100104uT r3 = (C100104uT) r9.A00;
                C170918Hz A0R = A0p.A0R();
                C100104uT r02 = C100104uT.DEFAULT_INSTANCE;
                A0R.getClass();
                C23122B6c b6c = r3.participant_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    r3.participant_ = b6c;
                }
                b6c.add(A0R);
            }
        }
    }

    public void A04(AnonymousClass3T1 r4, Set set) {
        if (!C20800yB.A01(C21000yV.A02, this.A09, 7392)) {
            return;
        }
        if (r4 instanceof C181758nz) {
            List A0e = r4.A0e();
            if (A0e != null) {
                set.addAll(A0e);
                return;
            }
            return;
        }
        if (r4.A0L() != null) {
            set.add(r4.A0L());
        }
        List<C80163ux> list = r4.A0w;
        if (list != null) {
            for (C80163ux r0 : list) {
                AnonymousClass11F r1 = r0.A00;
                if (r1 instanceof UserJid) {
                    set.add(r1);
                }
            }
        }
    }

    public AnonymousClass1HI(AnonymousClass16D r2, AnonymousClass1DM r3, AnonymousClass1A3 r4, C220412q r5, AnonymousClass17X r6, C24561Cx r7, AnonymousClass12O r8, C20810yC r9, AnonymousClass1A1 r10, AnonymousClass005 r11) {
        this.A09 = r9;
        this.A05 = r5;
        this.A02 = r2;
        this.A08 = r8;
        this.A0A = r10;
        this.A04 = r4;
        this.A07 = r7;
        this.A03 = r3;
        this.A0B = r11;
        this.A06 = r6;
    }
}
