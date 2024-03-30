package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8ao  reason: invalid class name and case insensitive filesystem */
public final class C175638ao extends C129086Ew {
    public final C20520xh A00;
    public final C26191Jf A01;
    public final AnonymousClass1A1 A02;
    public final C20310xM A03;
    public final C25301Ft A04;

    public C175638ao(C20310xM r2, C25301Ft r3, C20520xh r4, C26191Jf r5, AnonymousClass1A1 r6) {
        AnonymousClass00C.A0D(r6, 1);
        C36321k7.A17(r3, r2, r4, 2);
        this.A02 = r6;
        this.A04 = r3;
        this.A01 = r5;
        this.A03 = r2;
        this.A00 = r4;
    }

    public String A00() {
        return "MessageOrphanCommentResolver";
    }

    public ArrayList A02(C64933Qa r7, int i, long j) {
        AnonymousClass00C.A0D(r7, 0);
        return this.A04.A03(r7, 3, i, j);
    }

    public ArrayList A01(int i, long j) {
        return this.A04.A02(3, i, j);
    }

    public void A04(List list, Set set) {
        String str;
        C36321k7.A0w(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9XS r2 = (AnonymousClass9XS) it.next();
            Long l = r2.A07;
            C64933Qa r8 = r2.A06;
            C222813r r0 = UserJid.Companion;
            UserJid A002 = C222813r.A00(r2.A03);
            C64933Qa r9 = r2.A05;
            byte[] bArr = r2.A08;
            long j = r2.A02;
            AnonymousClass11F A003 = C222713q.A00(r2.A04);
            if (r8 == null || bArr == null || l == null) {
                str = "MessageOrphanCommentResolver/resolveOrphanMessages/some required fields are null for the orphan message";
            } else {
                try {
                    AnonymousClass8SX A004 = C200429hO.A00(AnonymousClass8SX.A0i(bArr));
                    AnonymousClass00C.A0B(A004);
                    AnonymousClass3T1 A032 = this.A02.A03(this.A01.A01(r8));
                    if (A032 == null) {
                        str = "MessageOrphanCommentResolver/getProcessedFMessage/parent message not found";
                    } else {
                        try {
                            AnonymousClass9T0 A005 = C1899296d.A00(A004, r9, j);
                            A005.A04 = A003;
                            A005.A07 = r8.A01;
                            A005.A05 = A002;
                            AnonymousClass3T1 A006 = this.A00.A00(A005.A00());
                            if (A006.A0P() == null) {
                                A006.A0j(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                                A006.A0u(new AnonymousClass2bB(C195759Vv.A00(A032), A032.A1N));
                            }
                            A006.A0q(A003);
                            if (A006.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
                                set.add(l);
                                this.A03.A0h(A006);
                            }
                        } catch (C28541Tb e) {
                            Log.e("MessageOrphanCommentResolver/getProcessedFMessage/BadMessage:", e);
                        }
                    }
                } catch (AnonymousClass186 e2) {
                    Log.w("MessageOrphanCommentResolver/getProcessedFMessage/cannot convert raw byte to E2E message/", e2);
                }
            }
            Log.w(str);
        }
    }
}
