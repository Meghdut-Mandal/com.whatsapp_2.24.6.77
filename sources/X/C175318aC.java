package X;

import com.whatsapp.jid.GroupJid;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8aC  reason: invalid class name and case insensitive filesystem */
public class C175318aC extends C81843xi {
    public final AnonymousClass11F A00;
    public final Collection A01;
    public final boolean A02;
    public final /* synthetic */ C175228a3 A03;

    public C175318aC(C175228a3 r1, AnonymousClass11F r2, Collection collection, boolean z) {
        this.A03 = r1;
        this.A00 = r2;
        this.A02 = z;
        this.A01 = collection;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        AnonymousClass3T1 A05;
        List A0I;
        AnonymousClass35M r12;
        AnonymousClass141 A0D;
        GroupJid groupJid;
        C175228a3 r3 = this.A03;
        AnonymousClass1LV r1 = r3.A08;
        AnonymousClass11F r7 = this.A00;
        boolean A0G = r1.A0G(r7);
        C02680Bk r6 = this.A00;
        r6.A04();
        AnonymousClass141 r9 = null;
        if (A0G) {
            A0I = C165597tg.A0r(r1, C65533Sl.A01(r7));
            if (A0I.size() == 1) {
                AnonymousClass3QK r0 = (AnonymousClass3QK) A0I.get(0);
                if (r0 == null || (groupJid = r0.A02) == null) {
                    A05 = null;
                } else if (C175228a3.A09(r3, groupJid)) {
                    A05 = C201679k6.A0J(r3, groupJid);
                } else {
                    A05 = r3.A0F.A05(groupJid);
                }
            } else {
                A05 = null;
            }
        } else {
            A05 = r3.A0F.A05(r7);
            A0I = AnonymousClass001.A0I();
        }
        r6.A04();
        AnonymousClass3LI A0d = C36361kB.A0d(r7, r3.A0K);
        r6.A04();
        if (!this.A02 || A05 == null) {
            r12 = null;
        } else {
            r12 = r3.A0G.A0D(A05.A1J.A00);
            if (r12 != null) {
                AnonymousClass2bM r8 = r12.A01;
                if (r8.A0L() != null) {
                    r9 = r3.A04.A0D(r8.A0L());
                }
            }
        }
        r6.A04();
        AnonymousClass16D r5 = r3.A04;
        AnonymousClass141 A0D2 = r5.A0D(r7);
        AnonymousClass11F A002 = AnonymousClass3TZ.A00(r3.A02, r3.A07, A0D2, A05);
        if (A002 == null) {
            A0D = null;
        } else {
            A0D = r5.A0D(A002);
        }
        r6.A04();
        r6.A04();
        return new AnonymousClass9OK(A0D2, r9, A0D, A05, r12, A0d, r3.A03, true, r3.A05.A0I(A0D2), A0I, r5.A0M(this.A01));
    }
}
