package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8ae  reason: invalid class name and case insensitive filesystem */
public final class C175538ae extends AnonymousClass16R {
    public final C20810yC A00;
    public final C197929cc A01;
    public final AnonymousClass1I2 A02;
    public final AnonymousClass1IJ A03;
    public final C201149ix A04;

    public C175538ae(C197929cc r2, AnonymousClass1I2 r3, AnonymousClass1IJ r4, C201149ix r5, C20810yC r6) {
        AnonymousClass00C.A0D(r6, 1);
        C36321k7.A17(r2, r3, r4, 3);
        this.A00 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass9TX r7, com.whatsapp.jid.UserJid r8) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r8)
            if (r0 == 0) goto L_0x006d
            X.9cc r3 = r6.A01
            X.1IJ r5 = r6.A03
            X.8aW r2 = r5.A09(r8)
            X.8aV r2 = (X.C175448aV) r2
            if (r2 == 0) goto L_0x006e
            X.9YF r0 = r2.A02
            X.9Su r1 = r0.A00()
            r0 = 0
            r1.A01 = r0
            X.9YF r4 = r1.A00()
            X.9Qe r0 = r3.A00
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x006e
            X.8aS r3 = r2.A01
            long r1 = java.lang.System.currentTimeMillis()
            X.8aV r0 = new X.8aV
            r0.<init>(r3, r4, r1)
            r5.A0B(r0)
            X.8aT r2 = new X.8aT
            r2.<init>(r0)
        L_0x003e:
            boolean r0 = r2 instanceof X.C175428aT
            if (r0 == 0) goto L_0x006d
            X.0yC r1 = r6.A00
            r0 = 7136(0x1be0, float:1.0E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x006d
            X.9ix r3 = r6.A04
            X.8aT r2 = (X.C175428aT) r2
            X.8aV r2 = r2.A00
            X.9YF r1 = r2.A02
            boolean r0 = r1.A04
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006d
            r0 = 12
            X.C201149ix.A00(r2, r3, r0)
            X.9Su r1 = r1.A00()
            r0 = 1
            r1.A04 = r0
            X.9YF r0 = r1.A00()
            X.C201149ix.A01(r3, r0, r2)
        L_0x006d:
            return
        L_0x006e:
            X.8aY r2 = X.C175478aY.A00
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175538ae.A01(X.9TX, com.whatsapp.jid.UserJid):void");
    }

    public void A02(UserJid userJid) {
        Object obj;
        AnonymousClass00C.A0D(userJid, 0);
        UserJid A0b = C36401kF.A0b(userJid);
        if (A0b != null) {
            AnonymousClass1I2 r3 = this.A02;
            C175418aS r2 = (C175418aS) r3.A05.A01(A0b);
            if (r2 == null || !r3.A00.A00(r2)) {
                r2 = null;
            }
            C197929cc r6 = this.A01;
            AnonymousClass1IJ r5 = this.A03;
            AnonymousClass96Q A002 = C197929cc.A00(r2, r5, userJid);
            if (A002 instanceof C175438aU) {
                AnonymousClass011 r0 = ((C175438aU) A002).A00;
                AnonymousClass9YF r1 = (AnonymousClass9YF) r0.second;
                AnonymousClass00C.A0D(r1, 0);
                C195179Su A003 = r1.A00();
                A003.A01 = true;
                C175448aV r12 = new C175448aV((C175418aS) r0.first, A003.A00(), System.currentTimeMillis());
                if (r6.A00.A00(r12)) {
                    r5.A0B(r12);
                    obj = new C175428aT(r12);
                }
                obj = C175478aY.A00;
            } else {
                if (!(A002 instanceof C175488aZ)) {
                    throw C36441kJ.A18();
                }
                obj = C175478aY.A00;
            }
            if ((obj instanceof C175428aT) && this.A00.A0E(7136)) {
                C201149ix r32 = this.A04;
                C175448aV r22 = ((C175428aT) obj).A00;
                AnonymousClass9YF r13 = r22.A02;
                if (!r13.A07) {
                    C201149ix.A00(r22, r32, 11);
                    C195179Su A004 = r13.A00();
                    A004.A08 = true;
                    C201149ix.A01(r32, A004.A00(), r22);
                }
            }
        }
    }

    public void A03(UserJid userJid, long j) {
        Object obj;
        C201149ix r2;
        C195179Su A002;
        AnonymousClass00C.A0D(userJid, 0);
        C20810yC r6 = this.A00;
        long A07 = (long) r6.A07(7444);
        if (C36401kF.A0b(userJid) != null) {
            C197929cc r1 = this.A01;
            C175448aV r22 = (C175448aV) this.A03.A09(userJid);
            if (r22 == null || !r1.A00.A00(r22)) {
                obj = C175478aY.A00;
            } else {
                obj = new C175428aT(r22);
            }
            if (obj instanceof C175428aT) {
                C175448aV r5 = ((C175428aT) obj).A00;
                AnonymousClass9YF r12 = r5.A02;
                boolean z = r12.A01;
                boolean A0E = r6.A0E(7136);
                if (z) {
                    if (A0E) {
                        r2 = this.A04;
                        if (j >= A07 && !r12.A08) {
                            C201149ix.A00(r5, r2, 13);
                            A002 = r12.A00();
                            A002.A09 = true;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (A0E) {
                    r2 = this.A04;
                    if (j >= A07 && !r12.A05) {
                        C201149ix.A00(r5, r2, 14);
                        A002 = r12.A00();
                        A002.A05 = true;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                C201149ix.A01(r2, A002.A00(), r5);
            }
        }
    }

    public void A00() {
        long j;
        long j2;
        C197929cc r8 = this.A01;
        AnonymousClass1IJ r3 = this.A03;
        List A0A = r3.A0A();
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : A0A) {
            C175448aV r2 = (C175448aV) next;
            boolean A0E = r8.A01.A0E(7612);
            long currentTimeMillis = System.currentTimeMillis();
            if (A0E) {
                j = currentTimeMillis - r2.A01.A01;
                j2 = C175448aV.A03;
            } else {
                j = currentTimeMillis - r2.A00;
                j2 = C175448aV.A04;
            }
            if (j > j2) {
                A0I.add(next);
            }
        }
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            r3.A0C(((C175448aV) it.next()).A01.A00);
        }
    }

    public void A05(AnonymousClass3T1 r7) {
        Object obj;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r7.A1J.A00);
        if (A002 != null) {
            C197929cc r02 = this.A01;
            AnonymousClass1IJ r5 = this.A03;
            C175448aV r3 = (C175448aV) r5.A09(A002);
            if (r3 == null || !r02.A00.A00(r3)) {
                obj = C175478aY.A00;
            } else {
                AnonymousClass9YF r03 = r3.A02;
                C195179Su A003 = r03.A00();
                int i = r03.A00;
                if (r03.A02) {
                    i++;
                }
                A003.A00 = i;
                A003.A02 = false;
                C175448aV r04 = new C175448aV(r3.A01, A003.A00(), System.currentTimeMillis());
                r5.A0B(r04);
                obj = new C175428aT(r04);
            }
            if ((obj instanceof C175428aT) && this.A00.A0E(7136)) {
                this.A04.A02(((C175428aT) obj).A00, r7.A1I);
            }
        }
    }

    public void A06(AnonymousClass3T1 r8) {
        Object obj;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r8.A1J.A00);
        if (A002 != null) {
            AnonymousClass1I2 r3 = this.A02;
            C175418aS r2 = (C175418aS) r3.A05.A01(A002);
            if (r2 == null || !r3.A00.A00(r2)) {
                r2 = null;
            }
            C197929cc r6 = this.A01;
            AnonymousClass1IJ r5 = this.A03;
            AnonymousClass96Q A003 = C197929cc.A00(r2, r5, A002);
            if (A003 instanceof C175438aU) {
                AnonymousClass011 r02 = ((C175438aU) A003).A00;
                AnonymousClass9YF r1 = (AnonymousClass9YF) r02.second;
                AnonymousClass00C.A0D(r1, 0);
                C195179Su A004 = r1.A00();
                A004.A02 = true;
                C175448aV r12 = new C175448aV((C175418aS) r02.first, A004.A00(), System.currentTimeMillis());
                if (r6.A00.A00(r12)) {
                    r5.A0B(r12);
                    obj = new C175428aT(r12);
                }
                obj = C175478aY.A00;
            } else {
                if (!(A003 instanceof C175488aZ)) {
                    throw C36441kJ.A18();
                }
                obj = C175478aY.A00;
            }
            if ((obj instanceof C175428aT) && this.A00.A0E(7136)) {
                this.A04.A02(((C175428aT) obj).A00, r8.A1I);
            }
        }
    }
}
