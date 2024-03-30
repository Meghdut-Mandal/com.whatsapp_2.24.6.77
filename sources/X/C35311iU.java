package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1iU  reason: invalid class name and case insensitive filesystem */
public class C35311iU implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public C35311iU(C20760y7 r2, C236419g r3, boolean z) {
        this.A04 = 2;
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = z;
        this.A03 = false;
    }

    public final void run() {
        ArrayList arrayList;
        Set A0C;
        AnonymousClass11F A0J;
        long j;
        boolean z;
        boolean A0n;
        StringBuilder sb;
        String str;
        Set A0C2;
        switch (this.A04) {
            case 0:
                AnonymousClass1XY r4 = (AnonymousClass1XY) this.A00;
                AnonymousClass3SC r6 = (AnonymousClass3SC) this.A01;
                boolean z2 = this.A02;
                boolean z3 = this.A03;
                byte[] bArr = null;
                for (AnonymousClass3T1 r1 : C007103b.A0Y(r6.A02)) {
                    r4.A07.A02(r1);
                    if (bArr == null && r1.A0V() != null) {
                        bArr = r1.A0V().A02();
                    }
                }
                r4.A0A.A07((AnonymousClass4R0) null, new AnonymousClass3Ot(z2, r6.A05(), r6.A04()), (AnonymousClass2bU) null, r6, bArr, z3, false, false, false);
                return;
            case 1:
                AnonymousClass1X4 r62 = (AnonymousClass1X4) this.A00;
                List<AnonymousClass3T1> list = (List) this.A01;
                boolean z4 = this.A02;
                boolean z5 = this.A03;
                AnonymousClass196 r2 = r62.A0D;
                AnonymousClass8Y8 r12 = (AnonymousClass8Y8) r2.A0T.A00("deleteMessageForMe");
                if (r12 == null) {
                    A0C = Collections.emptySet();
                } else {
                    if (!list.isEmpty()) {
                        long A002 = C19970wo.A00(r12.A00);
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (AnonymousClass3T1 r11 : list) {
                            C64933Qa r42 = r11.A1J;
                            AnonymousClass11F r13 = r42.A00;
                            if (AnonymousClass143.A0G(r13) || (r13 instanceof C177618e5)) {
                                A0J = r11.A0J();
                            } else {
                                A0J = null;
                            }
                            if (r42.A02) {
                                if (r11.A0D == 0) {
                                    j = 0;
                                } else {
                                    j = r11.A0H;
                                    if (j > 0) {
                                    }
                                }
                                arrayList2.add(new C176118bb((C201539jo) null, A0J, C66013Ui.A0B(r11), (String) null, A002, j, z4, false));
                            }
                            j = r11.A0I;
                            arrayList2.add(new C176118bb((C201539jo) null, A0J, C66013Ui.A0B(r11), (String) null, A002, j, z4, false));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = Collections.emptyList();
                    }
                    A0C = r2.A0C(arrayList);
                }
                C20310xM r10 = r62.A0X;
                if (z5) {
                    AnonymousClass11F A05 = C66013Ui.A05(list);
                    if (A05 != null) {
                        String str2 = "action_singular_delete";
                        AnonymousClass1FD r5 = r10.A0N;
                        AnonymousClass3B8 A012 = AnonymousClass1FD.A01(r5, r5.A00.A08(A05));
                        if (A012 != null) {
                            List list2 = A012.A09;
                            if (list2 != null) {
                                r10.A0x(A012, new C71913hX(r10), true);
                            }
                            C25201Fj r8 = r10.A0J;
                            ((AnonymousClass6VR) r8.A02.get()).A0A(String.valueOf(A05.hashCode()));
                            if (r10.A0I.A0R(A012.A07)) {
                                str2 = "action_delete";
                            } else if (list2 == null || A012.A04 != Long.MIN_VALUE) {
                                str2 = "action_clear";
                            }
                            z = A012.A0C;
                        } else {
                            z = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (AnonymousClass3T1 r0 : list) {
                            arrayList3.add(Long.valueOf(r0.A1N));
                        }
                        boolean z6 = false;
                        if (z4 && true) {
                            z6 = true;
                        }
                        C20310xM.A03(r10, A05, str2, arrayList3, z6, z);
                        C65073Qp A09 = r10.A0I.A09(A05, false);
                        if (A09 != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (A09.A0N == ((AnonymousClass3T1) it.next()).A1N) {
                                        r10.A0a(A05);
                                    }
                                }
                            }
                        }
                        r10.A0T.A01.post(new C35351iY(r10, list, A05, 5, true));
                    }
                } else {
                    r10.A0v(list, z4 ? 1 : 0);
                }
                r2.A0Q(A0C);
                return;
            case 2:
                C236419g r3 = (C236419g) this.A00;
                C20760y7 r22 = (C20760y7) this.A01;
                r3.A0I.A0A(r22, this.A02);
                r3.A0O.removeAll(r22);
                if (!r3.A09.A0L()) {
                    C19460v5 r14 = r3.A05;
                    if (r14.A05()) {
                        r14.A02();
                        throw new NullPointerException("logoutAgentDeviceJids");
                    }
                }
                C236419g.A03(r22, r3);
                return;
            case 3:
                boolean z7 = this.A02;
                boolean z8 = this.A03;
                ((AnonymousClass1TL) this.A00).A00.A0G((C64933Qa) this.A01, z7, z8);
                return;
            default:
                C28311Sd r43 = (C28311Sd) this.A00;
                UserJid userJid = (UserJid) this.A01;
                boolean z9 = this.A02;
                boolean z10 = this.A03;
                AnonymousClass1CR r02 = r43.A01;
                if (z9) {
                    A0n = r02.A0o(userJid);
                    sb = new StringBuilder();
                    str = "StatusViewingSettings/mute-user-status returned ";
                } else {
                    A0n = r02.A0n(userJid);
                    sb = new StringBuilder();
                    str = "StatusViewingSettings/cancel-mute-user-status returned ";
                }
                sb.append(str);
                sb.append(A0n);
                Log.i(sb.toString());
                if (z10) {
                    AnonymousClass196 r23 = r43.A00;
                    AnonymousClass8Y7 r03 = (AnonymousClass8Y7) r23.A0T.A00("userStatusMute");
                    if (r03 == null) {
                        A0C2 = Collections.emptySet();
                    } else {
                        long A003 = C19970wo.A00(r03.A00);
                        AnonymousClass00C.A0D(userJid, 1);
                        A0C2 = r23.A0C(Collections.singletonList(new C176008bQ((C201539jo) null, userJid, (String) null, A003, z9, false)));
                    }
                    if (A0n) {
                        r23.A0Q(A0C2);
                        return;
                    } else {
                        r23.A0P(A0C2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public C35311iU(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
        this.A03 = z2;
    }
}
