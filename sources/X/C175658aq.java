package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8aq  reason: invalid class name and case insensitive filesystem */
public final class C175658aq extends C129086Ew {
    public final C20520xh A00;
    public final C26191Jf A01;
    public final AnonymousClass1A1 A02;
    public final C29571Xd A03;
    public final C25301Ft A04;

    public C175658aq(C29571Xd r2, C25301Ft r3, C20520xh r4, C26191Jf r5, AnonymousClass1A1 r6) {
        AnonymousClass00C.A0D(r6, 1);
        C36321k7.A17(r3, r2, r4, 2);
        this.A02 = r6;
        this.A04 = r3;
        this.A01 = r5;
        this.A03 = r2;
        this.A00 = r4;
    }

    public String A00() {
        return "MessageOrphanSecretEncMessageResolver";
    }

    public ArrayList A02(C64933Qa r7, int i, long j) {
        AnonymousClass00C.A0D(r7, 0);
        return this.A04.A03(r7, 5, i, j);
    }

    public ArrayList A01(int i, long j) {
        return this.A04.A02(5, i, j);
    }

    public void A04(List list, Set set) {
        String str;
        C36321k7.A0w(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9XS r4 = (AnonymousClass9XS) it.next();
            Long l = r4.A07;
            C64933Qa r5 = r4.A06;
            C64933Qa r7 = r4.A05;
            byte[] bArr = r4.A08;
            long j = r4.A02;
            C222713q r0 = AnonymousClass11F.A00;
            AnonymousClass11F A002 = C222713q.A00(r4.A04);
            if (r5 == null || bArr == null || l == null) {
                str = "MessageOrphanSecretEncMessageResolver/resolveOrphanMessages/some required fields are null for the orphan message";
            } else {
                if (this.A02.A03(this.A01.A01(r5)) == null) {
                    str = "MessageOrphanSecretEncMessageResolver/getProcessedFMessage/parent message not found";
                } else {
                    try {
                        AnonymousClass8SX A003 = C200429hO.A00(AnonymousClass8SX.A0i(bArr));
                        AnonymousClass00C.A0B(A003);
                        try {
                            AnonymousClass9T0 A004 = C1899296d.A00(A003, r7, j);
                            A004.A04 = A002;
                            AnonymousClass3T1 A005 = this.A00.A00(A004.A00());
                            if (!A005.A1J.A02) {
                                A005.A0q(A002);
                            }
                            A005.A1Q = -1;
                            if (A005.A1I != 92 || !A005.A1T(C132986Wc.A0F)) {
                                Log.e("MessageOrphanSecretEncMessageResolver/resolveOrphanMessages unknown secret enc message. skipping");
                            } else {
                                set.add(l);
                                this.A03.A03(A005);
                            }
                        } catch (C181818o5 unused) {
                        } catch (C28531Ta e) {
                            Log.e("MessageOrphanSecretEncMessageResolver/getProcessedFMessage/BadMessage:", e);
                        }
                    } catch (AnonymousClass186 e2) {
                        Log.w("MessageOrphanSecretEncMessageResolver/getProcessedFMessage/cannot convert raw byte to E2E message/", e2);
                    }
                }
            }
            Log.w(str);
        }
    }
}
