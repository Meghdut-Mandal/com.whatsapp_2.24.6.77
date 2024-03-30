package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8an  reason: invalid class name and case insensitive filesystem */
public abstract class C175628an extends C129086Ew {
    public void A04(List list, Set set) {
        String str;
        StringBuilder A0u;
        C36321k7.A0w(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9XS r1 = (AnonymousClass9XS) it.next();
            Long l = r1.A07;
            C64933Qa r6 = r1.A05;
            byte[] bArr = r1.A08;
            byte[] bArr2 = r1.A09;
            int i = r1.A01;
            if ((bArr2 == null && bArr == null) || l == null) {
                Log.w("TemporaryPlaceholderOrphanResolver/processOrphanBatch/some required fields are null for the orphan message");
            } else {
                C175618am r5 = (C175618am) this;
                if (i == 6 && bArr2 != null) {
                    AnonymousClass8QE r12 = (AnonymousClass8QE) C170918Hz.A08(AnonymousClass8QE.DEFAULT_INSTANCE, bArr2);
                    if ((r12.bitField0_ & 4) != 0) {
                        C172468Ny r0 = r12.callLogMessageInfo_;
                        C172468Ny r13 = r0;
                        if (r0 == null) {
                            r0 = C172468Ny.DEFAULT_INSTANCE;
                        }
                        if ((r0.bitField0_ & 1) != 0) {
                            if (r13 == null) {
                                r13 = C172468Ny.DEFAULT_INSTANCE;
                            }
                            long j = r13.callLogRowId_;
                            C107265Nh A06 = r5.A00.A06(j);
                            if (A06 == null) {
                                A0u = AnonymousClass000.A0u();
                                A0u.append("MessageCallLogOrphanResolver/processOrphan/no existing call log for row id: ");
                                A0u.append(j);
                            } else {
                                C106265Iz r2 = new C106265Iz((AnonymousClass1HQ) null, r6, A06);
                                int A00 = C198119cw.A00((C117005lY) null, r5.A02, r2, true);
                                if (A00 == 1) {
                                    AnonymousClass3T1 A03 = r5.A03.A03(r6);
                                    if (A03 == null) {
                                        A0u = AnonymousClass000.A0u();
                                        A0u.append("MessageCallLogOrphanResolver/processOrphan/the current fmessage for key: ");
                                        A0u.append(r6);
                                        A0u.append(".id is null");
                                    } else {
                                        r2.A1O = A03.A1O;
                                        r5.A01.A0n(r2, 17);
                                    }
                                } else if (A00 != 5) {
                                }
                                set.add(l);
                            }
                            str = A0u.toString();
                            Log.e(str);
                        }
                    }
                    str = "MessageCallLogOrphanResolver/processOrphan/stanza data is invalid";
                    Log.e(str);
                }
            }
        }
    }
}
