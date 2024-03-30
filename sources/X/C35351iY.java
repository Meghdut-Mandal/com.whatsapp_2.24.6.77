package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1iY  reason: invalid class name and case insensitive filesystem */
public class C35351iY implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C35351iY(AnonymousClass1F4 r2, Runnable runnable, Collection collection) {
        this.A04 = 10;
        this.A03 = true;
        this.A00 = r2;
        this.A01 = collection;
        this.A02 = runnable;
    }

    public final void run() {
        C1495671s B1k;
        Set emptySet;
        switch (this.A04) {
            case 0:
                AnonymousClass1KK r0 = (AnonymousClass1KK) this.A00;
                UserJid userJid = (UserJid) this.A01;
                boolean z = this.A03;
                C207109uZ A07 = r0.A07(userJid);
                r0.A04.A03((C23021B0r) this.A02, A07, userJid, z);
                return;
            case 1:
                AnonymousClass1NG r02 = (AnonymousClass1NG) this.A00;
                r02.A02.A0F(((Context) this.A01).getString(R.string.f12nameremoved, new Object[]{r02.A08.A0H((AnonymousClass141) this.A02)}), 1);
                return;
            case 2:
                AnonymousClass1O7 r3 = (AnonymousClass1O7) this.A00;
                boolean z2 = this.A03;
                AnonymousClass141 r2 = (AnonymousClass141) this.A01;
                AnonymousClass11F r1 = (AnonymousClass11F) this.A02;
                if (!z2) {
                    r3.A03.A04(r2);
                }
                AnonymousClass16I r03 = r3.A02;
                r03.A01(r1);
                r03.A00(r1);
                return;
            case 3:
                boolean z3 = this.A03;
                ((C24731Do) ((C220712t) this.A00).A01.get()).A01.A02((AnonymousClass11F) this.A01, (Integer) null, (String) null, (String) null, ((Number) this.A02).intValue(), z3 ^ true ? 1 : 0, false);
                return;
            case 4:
                C220712t r5 = (C220712t) this.A00;
                boolean z4 = this.A03;
                AnonymousClass11F r4 = (AnonymousClass11F) this.A01;
                C65073Qp r32 = (C65073Qp) this.A02;
                if (z4) {
                    emptySet = ((C24731Do) r5.A01.get()).A04.A08(r4, false);
                } else {
                    emptySet = Collections.emptySet();
                }
                AnonymousClass005 r12 = r5.A01;
                ((C24731Do) r12.get()).A0C.A0H(r32);
                ((C24731Do) r12.get()).A04.A0Q(emptySet);
                AnonymousClass1DP r33 = ((C24731Do) r12.get()).A0B;
                r33.A00.A00(new C35681j5(r33, r4, 44));
                return;
            case 5:
                C20310xM r42 = (C20310xM) this.A00;
                boolean z5 = this.A03;
                Collection collection = (Collection) this.A01;
                AnonymousClass11F r22 = (AnonymousClass11F) this.A02;
                AnonymousClass16J r13 = r42.A0Z;
                if (z5) {
                    r13.A08(collection, (Map) null);
                } else {
                    r13.A00(r22);
                }
                r42.A0G.A02(r22, false);
                return;
            case 6:
                C232317r r7 = (C232317r) this.A00;
                AnonymousClass144 r6 = (AnonymousClass144) this.A01;
                AnonymousClass6PM r52 = (AnonymousClass6PM) this.A02;
                boolean z6 = this.A03;
                AnonymousClass1M0 A05 = r7.A06.A05();
                try {
                    B1k = A05.B1k();
                    C232317r.A09(r7, r6, r7.A05.A07(r52.A03));
                    if (z6) {
                        r7.A0H(r52, r6);
                    }
                    B1k.A00();
                    B1k.close();
                    A05.close();
                    return;
                } catch (Throwable th) {
                    try {
                        A05.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 9:
                AnonymousClass1H5.A04((C131636Pw) this.A01, (AnonymousClass1H5) this.A00, (C24111Bd) this.A02, this.A03);
                return;
            case 10:
                AnonymousClass1F4 r43 = (AnonymousClass1F4) this.A00;
                r43.A03.Bp1(new C35631j0(this.A01, r43, this.A02, 18));
                return;
            default:
                C25281Fr r53 = (C25281Fr) this.A00;
                AnonymousClass144 r44 = (AnonymousClass144) this.A01;
                boolean z7 = this.A03;
                r53.A07.A0I((AnonymousClass6X6) this.A02);
                C19730wQ r04 = r53.A00;
                r04.A0G();
                C223413x r05 = r04.A02;
                C18740tg.A06(r05);
                if (r53.A04.A0A.A07(new AnonymousClass6EU(C133256Xm.A02(r05), r44.getRawString()), false)) {
                    r53.A01.A0K(r44, 4);
                }
                if (z7) {
                    ((C1264664c) r53.A0B.get()).A00();
                    return;
                }
                return;
        }
        throw th;
    }

    public C35351iY(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = z;
        this.A02 = obj3;
    }

    public C35351iY(Activity activity, AnonymousClass1NG r3, AnonymousClass141 r4) {
        this.A04 = 1;
        this.A03 = true;
        this.A00 = r3;
        this.A01 = activity;
        this.A02 = r4;
    }
}
