package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2kR  reason: invalid class name and case insensitive filesystem */
public class C50242kR extends C132446Tt {
    public static final List A08 = Arrays.asList(new String[]{"644728732639272", "369730359717478"});
    public C87584Pj A00;
    public final int A01;
    public final C29411Wn A02;
    public final AnonymousClass1KK A03;
    public final AnonymousClass1NG A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass1FI A06;
    public final AnonymousClass17X A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C207109uZ A072;
        int i = this.A01;
        ArrayList A14 = C36441kJ.A14(i);
        if (!C36431kI.A1Y(this)) {
            AnonymousClass1FI r2 = this.A06;
            if (r2.A06()) {
                this.A02.A03();
            }
            Iterator it = r2.A02(C71753hH.A00, false, false).iterator();
            while (it.hasNext()) {
                AnonymousClass11F A0a = C36401kF.A0a(it);
                if (!(A0a instanceof C177528dw)) {
                    AnonymousClass16D r5 = this.A05;
                    AnonymousClass141 A082 = r5.A08(A0a);
                    if (A082 != null && A082.A0C() && !C36331k8.A1Y(this.A04, A082)) {
                        AnonymousClass11F r1 = A082.A0H;
                        if (!(r1 instanceof C177638e7) && !(r1 instanceof C177538dx) && AnonymousClass143.A0E(r1) && ((!A082.A0G() || this.A07.A0C((GroupJid) C36381kD.A0e(A082, GroupJid.class))) && (A072 = this.A03.A07((UserJid) A082.A0H)) != null)) {
                            List list = A072.A0O;
                            if (!list.isEmpty() || !A082.A0N()) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (A08.contains(((C134986bw) it2.next()).A00)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            A14.add(r5.A08(A0a));
                        }
                    }
                    if (A14.size() >= i) {
                        break;
                    }
                }
            }
        }
        return new AnonymousClass315(A14);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass315 r2 = (AnonymousClass315) obj;
        if (C36431kI.A1Y(this)) {
            this.A00 = null;
            return;
        }
        C87584Pj r0 = this.A00;
        if (r0 != null) {
            r0.BUV(r2);
        }
    }

    public C50242kR(C29411Wn r1, AnonymousClass1KK r2, AnonymousClass1NG r3, AnonymousClass16D r4, C87584Pj r5, AnonymousClass1FI r6, AnonymousClass17X r7, int i) {
        this.A01 = i;
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = r1;
        this.A06 = r6;
        this.A03 = r2;
        this.A07 = r7;
        this.A00 = r5;
    }
}
