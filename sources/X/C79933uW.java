package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3uW  reason: invalid class name and case insensitive filesystem */
public final class C79933uW implements B0B {
    public AnonymousClass1CR A00;
    public final AnonymousClass1NG A01;
    public final C19970wo A02;
    public final AnonymousClass1HT A03;
    public final AnonymousClass16E A04;

    public boolean B1C(C193229Kn r19, C16540pP r20, C87374On r21) {
        AnonymousClass3JN r0;
        Long l;
        Long l2;
        Integer valueOf;
        C193229Kn r8 = r19;
        C16540pP r7 = r20;
        boolean A1a = C36331k8.A1a(r21, r8);
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = this.A03.A03((UserJid) null).iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            UserJid A0L = A0l.A0L();
            long A002 = C19970wo.A00(this.A02);
            Map map = r8.A01;
            String A1A = C36431kI.A1A("first", map);
            if (A1A != null) {
                l = Long.valueOf(Long.parseLong(A1A) * ((long) 60000));
            } else {
                l = null;
            }
            String A1A2 = C36431kI.A1A("second", map);
            if (A1A2 != null) {
                l2 = Long.valueOf(Long.parseLong(A1A2) * ((long) 60000));
            } else {
                l2 = null;
            }
            C222713q r02 = AnonymousClass11F.A00;
            AnonymousClass11F A003 = C222713q.A00(A0L);
            if (A0L != null && A0L != C223613z.A00 && !this.A01.A0O(A0L) && this.A04.A0J(A0l)) {
                if (!((A003 != null && this.A00.A0l(A003)) || l == null || l2 == null)) {
                    long j = A0l.A0I;
                    if (j >= A002 - l2.longValue() || j <= A002 - l.longValue()) {
                        if (A1G.containsKey(A0L)) {
                            Number A10 = C36441kJ.A10(A0L, A1G);
                            if (A10 != null) {
                                valueOf = Integer.valueOf(A10.intValue() + 1);
                            }
                            i++;
                        } else {
                            valueOf = Integer.valueOf(A1a ? 1 : 0);
                        }
                        A1G.put(A0L, valueOf);
                        i++;
                    }
                }
            }
        }
        if ((r7 instanceof C79853uO) && (r0 = ((C79853uO) r7).A00) != null) {
            r0.A01 = A1G;
        }
        return AnonymousClass000.A1R(i);
    }

    public C79933uW(AnonymousClass1NG r1, C19970wo r2, AnonymousClass1HT r3, AnonymousClass16E r4, AnonymousClass1CR r5) {
        C36321k7.A1B(r2, r4, r1, r5, r3);
        this.A02 = r2;
        this.A04 = r4;
        this.A01 = r1;
        this.A00 = r5;
        this.A03 = r3;
    }
}
