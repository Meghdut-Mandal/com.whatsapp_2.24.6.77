package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Nh  reason: invalid class name and case insensitive filesystem */
public class C107265Nh extends AnonymousClass72O {
    public Map A00;
    public final long A01;
    public final DeviceJid A02;
    public final C106255Iy A03;
    public final C135006by A04;
    public final boolean A05;
    public final boolean A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public volatile int A0A;
    public volatile long A0B;
    public volatile C63083Ir A0C;
    public volatile GroupJid A0D;
    public volatile C108555Tz A0E;
    public volatile AnonymousClass5Ng A0F;
    public volatile AnonymousClass661 A0G;
    public volatile String A0H;
    public volatile boolean A0I;
    public volatile boolean A0J;
    public volatile boolean A0K;
    public final transient List A0L;

    public synchronized ArrayList A0C() {
        return C90494aF.A0g(this.A00);
    }

    public synchronized HashSet A0D() {
        return C90524aI.A0k(this.A00.keySet());
    }

    public synchronized List A0E() {
        return this.A0L;
    }

    public synchronized void A0F(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            A03();
        }
    }

    public synchronized void A0G(int i) {
        if (this.A08 != i) {
            this.A08 = i;
            A03();
        }
    }

    public synchronized void A0H(int i) {
        if (this.A0A != i) {
            this.A0A = i;
            A03();
        }
    }

    public synchronized void A0I(C63083Ir r2) {
        if (!C1901797e.A00(this.A0C, r2)) {
            this.A0C = r2;
            A03();
        }
    }

    public synchronized void A0J(GroupJid groupJid) {
        if (!C1901797e.A00(this.A0D, groupJid)) {
            this.A0D = groupJid;
            A03();
        }
    }

    public synchronized void A0K(UserJid userJid, int i) {
        C107255Nf r1 = (C107255Nf) this.A00.get(userJid);
        if (r1 != null) {
            synchronized (r1) {
                if (r1.A01 != i) {
                    r1.A01 = i;
                    r1.A03();
                }
            }
        } else {
            C107255Nf r2 = new C107255Nf(userJid, i, -1);
            this.A00.put(r2.A00, r2);
            A03();
        }
    }

    public synchronized void A0L(AnonymousClass5Ng r2) {
        this.A0F = r2;
        this.A0I = true;
        A03();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C107265Nh r7 = (C107265Nh) obj;
            if (A02() != r7.A02() || !this.A04.equals(r7.A04) || this.A01 != r7.A01 || this.A0K != r7.A0K || this.A09 != r7.A09 || this.A0B != r7.A0B || this.A07 != r7.A07 || A0B() != r7.A0B() || this.A06 != r7.A06 || this.A05 != r7.A05 || !C1901797e.A00(this.A0D, r7.A0D) || this.A0J != r7.A0J) {
                return false;
            }
            A01(this);
            int i = this.A0A;
            A01(r7);
            if (i != r7.A0A || !this.A00.equals(r7.A00) || !C1901797e.A00(this.A02, r7.A02) || !C1901797e.A00(this.A0H, r7.A0H) || !C1901797e.A00(this.A0C, r7.A0C) || this.A08 != r7.A08 || !C1901797e.A00(this.A0G, r7.A0G)) {
                return false;
            }
        }
        return true;
    }

    public C107265Nh(C63083Ir r5, DeviceJid deviceJid, GroupJid groupJid, C106255Iy r8, C135006by r9, C108555Tz r10, AnonymousClass5Ng r11, AnonymousClass661 r12, String str, Collection collection, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(j);
        this.A00 = C36431kI.A1G();
        this.A0L = AnonymousClass001.A0I();
        this.A04 = r9;
        this.A03 = r8;
        this.A01 = j2;
        this.A0K = z;
        this.A09 = i;
        this.A07 = i2;
        this.A0E = r10;
        this.A0B = j3;
        this.A06 = z2;
        this.A05 = z3;
        this.A0D = groupJid;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C107255Nf r2 = (C107255Nf) it.next();
            this.A00.put(r2.A00, r2);
        }
        this.A0J = z4;
        this.A02 = deviceJid;
        this.A0H = str;
        this.A0A = i3;
        this.A0F = r11;
        this.A0C = r5;
        this.A08 = i4;
        this.A0G = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r3.A07 == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C107265Nh r3) {
        /*
            int r1 = r3.A0A
            r0 = 2
            if (r1 != r0) goto L_0x0047
            boolean r0 = r3.A0M()
            if (r0 == 0) goto L_0x0011
            X.6by r0 = r3.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x001c
        L_0x0011:
            boolean r0 = r3.A0N()
            if (r0 != 0) goto L_0x001c
            int r0 = r3.A07
            r2 = 0
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallLog/validateOfferSilenceReasonInvariants A 1:1 call silenced for privacy reasons should be a missed call. isGroupCall="
            r1.append(r0)
            boolean r0 = r3.A0M()
            r1.append(r0)
            java.lang.String r0 = " isFromMe="
            r1.append(r0)
            X.6by r0 = r3.A04
            boolean r0 = r0.A03
            r1.append(r0)
            java.lang.String r0 = " callResult="
            r1.append(r0)
            int r0 = r3.A07
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.C18740tg.A0D(r2, r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107265Nh.A01(X.5Nh):void");
    }

    public int A08(UserJid userJid) {
        C107255Nf r0 = (C107255Nf) this.A00.get(userJid);
        if (r0 != null) {
            return r0.A01;
        }
        return 2;
    }

    public C135006by A09() {
        C135006by r0 = this.A04;
        UserJid userJid = r0.A01;
        boolean z = r0.A03;
        return new C135006by(r0.A00, userJid, r0.A02, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3.A0D == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C108555Tz A0B() {
        /*
            r3 = this;
            X.5Tz r1 = r3.A0E
            boolean r0 = r1 instanceof X.AnonymousClass5Ne
            if (r0 != 0) goto L_0x0035
            boolean r0 = r1 instanceof X.C107245Nd
            if (r0 == 0) goto L_0x002b
            X.6by r0 = r3.A04
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0015
            com.whatsapp.jid.GroupJid r0 = r3.A0D
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallLog/getNotificationSilenceReason Invalid call log for "
            r1.append(r0)
            X.5Tz r0 = r3.A0E
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            X.C18740tg.A0D(r2, r0)
            X.5Tz r0 = r3.A0E
            return r0
        L_0x002b:
            boolean r0 = r1 instanceof X.C107235Nc
            if (r0 != 0) goto L_0x0035
            boolean r0 = r1 instanceof X.C107225Nb
            if (r0 != 0) goto L_0x0035
            r2 = 1
            goto L_0x0016
        L_0x0035:
            X.6by r0 = r3.A04
            boolean r0 = r0.A03
            r2 = r0 ^ 1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107265Nh.A0B():X.5Tz");
    }

    public boolean A0M() {
        if (this.A00.size() < 2 && this.A0C == null && this.A0D == null) {
            return false;
        }
        return true;
    }

    public boolean A0N() {
        if (this.A04.A03 || this.A07 != 2) {
            return false;
        }
        return true;
    }

    public boolean A0R() {
        if (this.A04.A03 || this.A07 == 5 || this.A07 == 6) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[20];
        C90474aD.A1S(objArr, A02());
        objArr[1] = this.A04;
        C36361kB.A1W(objArr, this.A01);
        objArr[3] = Boolean.valueOf(this.A0K);
        C36341k9.A1U(objArr, this.A09);
        objArr[5] = Long.valueOf(this.A0B);
        C36381kD.A1T(objArr, this.A07);
        objArr[7] = A0B();
        objArr[8] = Boolean.valueOf(this.A06);
        objArr[9] = Boolean.valueOf(this.A05);
        objArr[10] = this.A00;
        objArr[11] = this.A0D;
        objArr[12] = Boolean.valueOf(this.A0J);
        objArr[13] = this.A02;
        objArr[14] = this.A0H;
        objArr[15] = this.A0F;
        objArr[16] = this.A0C;
        objArr[17] = Integer.valueOf(this.A08);
        A01(this);
        objArr[18] = Integer.valueOf(this.A0A);
        return AnonymousClass000.A0M(this.A0G, objArr, 19);
    }

    public static Iterator A00(C107265Nh r0) {
        return r0.A0C().iterator();
    }

    public boolean A05() {
        if (!super.A05()) {
            Iterator A0z = AnonymousClass000.A0z(this.A00);
            while (A0z.hasNext()) {
                if (((AnonymousClass72O) A0z.next()).A05()) {
                }
            }
            return false;
        }
        return true;
    }

    public int A06() {
        Iterator A002 = A00(this);
        int i = 0;
        while (A002.hasNext()) {
            C107255Nf r2 = (C107255Nf) A002.next();
            if (r2.A01 == 5 || r2.A01 == 100) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A0F == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.C19730wQ r5) {
        /*
            r4 = this;
            boolean r0 = r4.A0M()
            if (r0 == 0) goto L_0x000b
            X.5Ng r1 = r4.A0F
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r3 = -1
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r2 = A00(r4)
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.next()
            X.5Nf r0 = (X.C107255Nf) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            boolean r0 = r5.A0M(r1)
            if (r0 == 0) goto L_0x0013
            int r0 = r4.A08(r1)
            return r0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107265Nh.A07(X.0wQ):int");
    }

    /* renamed from: A0A */
    public C107265Nh clone() {
        C107265Nh r5 = (C107265Nh) super.clone();
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator A0y = AnonymousClass000.A0y(this.A00);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            A1G.put(((UserJid) A11.getKey()).clone(), ((AnonymousClass72O) A11.getValue()).clone());
        }
        r5.A00 = A1G;
        return r5;
    }

    public boolean A0O() {
        A01(this);
        boolean A1S = AnonymousClass000.A1S(this.A0A, 2);
        if (!A0N() || !A1S) {
            return false;
        }
        return true;
    }

    public boolean A0P() {
        if (!A0N() || A0B() != C108555Tz.A05) {
            return false;
        }
        return true;
    }

    public boolean A0Q() {
        if (!A0N()) {
            return false;
        }
        if (A0B() == C108555Tz.A03 || A0B() == C108555Tz.A02) {
            return true;
        }
        return false;
    }

    public boolean A0S(C19730wQ r5) {
        if (A0M() && this.A0F != null) {
            Iterator A002 = A00(this);
            while (A002.hasNext()) {
                UserJid userJid = ((C107255Nf) A002.next()).A00;
                if (r5.A0M(userJid)) {
                    return A0T(userJid);
                }
            }
        }
        return false;
    }

    public boolean A0T(UserJid userJid) {
        int A082 = A08(userJid);
        if (A082 == 5 || A082 == 100) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallLog[rowId=");
        A0u.append(A02());
        A0u.append(", key=");
        A0u.append(this.A04);
        A0u.append(", timestamp=");
        A0u.append(this.A01);
        A0u.append(", videoCall=");
        A0u.append(this.A0K);
        A0u.append(", duration=");
        A0u.append(this.A09);
        A0u.append(", bytesTransferred=");
        A0u.append(this.A0B);
        A0u.append(", callResult=");
        A0u.append(this.A07);
        A0u.append(", notificationSilenceReason=");
        A0u.append(A0B());
        A0u.append(", isLegacy=");
        A0u.append(this.A06);
        A0u.append(", fromMissedCall=");
        A0u.append(this.A05);
        A0u.append(", groupJid=");
        A0u.append(this.A0D);
        A0u.append(", isJoinableGroupCall=");
        A0u.append(this.A0J);
        A0u.append(", participants.size=");
        C90504aG.A1N(A0u, this.A00);
        A0u.append(", callCreatorDeviceJid=");
        A0u.append(this.A02);
        A0u.append(", callRandomId=");
        A0u.append(this.A0H);
        A0u.append(", offerSilenceReason=");
        A01(this);
        A0u.append(this.A0A);
        A0u.append(", joinableData=");
        A0u.append(this.A0F);
        A0u.append(", callLinkData=");
        A0u.append(this.A0C);
        A0u.append(", callType=");
        A0u.append(this.A08);
        A0u.append(", scheduledData=");
        A0u.append(this.A0G);
        return C90474aD.A0g(A0u);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C107265Nh(DeviceJid deviceJid, C135006by r27, List list, long j, boolean z) {
        this((C63083Ir) null, deviceJid, (GroupJid) null, (C106255Iy) null, r27, C108555Tz.NONE, (AnonymousClass5Ng) null, (AnonymousClass661) null, (String) null, list == null ? Collections.emptyList() : list, 0, 0, 0, 0, -1, j, 0, z, false, false, false);
    }
}
