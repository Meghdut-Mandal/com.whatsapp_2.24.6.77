package X;

import android.content.Context;
import android.content.Intent;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.754  reason: invalid class name */
public class AnonymousClass754 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public AnonymousClass754(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
    }

    public final void run() {
        switch (this.A07) {
            case 0:
                C70803fk r2 = (C70803fk) this.A00;
                Map map = (Map) this.A01;
                Object obj = this.A02;
                List list = (List) this.A03;
                Collection collection = (Collection) this.A04;
                C132366Tg r6 = (C132366Tg) this.A05;
                AnonymousClass3XT r5 = (AnonymousClass3XT) this.A06;
                r2.A2l.Bnv();
                C225014r r8 = r2.A1U.A00;
                if (r8 instanceof C161947nj) {
                    C75673nc r9 = new C75673nc(r2, map);
                    C19770wU r0 = r2.A5S;
                    AnonymousClass60O r4 = r2.A1L;
                    List singletonList = Collections.singletonList(obj);
                    boolean z = r2.A6F;
                    C36391kE.A1Q(r4.A00(r5, r6, (AnonymousClass6BX) null, (C161947nj) r8, r9, (AnonymousClass3T1) null, 1, 0L, (Long) null, (Long) null, collection, C36441kJ.A16(), C90524aI.A0k(list), singletonList, list, Collections.emptyMap(), 3, 0, -1, z, true, false, true, false, false), r0);
                    return;
                }
                return;
            case 1:
                AnonymousClass6OQ r22 = (AnonymousClass6OQ) this.A06;
                PublicKey publicKey = (PublicKey) this.A04;
                Integer num = (Integer) this.A03;
                ((C145536u3) this.A05).BlZ(r22, (C160057kO) this.A00, (C128936Ee) this.A02, num, publicKey, (X509Certificate) this.A01);
                return;
            case 2:
                PublicKey publicKey2 = (PublicKey) this.A04;
                Integer num2 = (Integer) this.A03;
                ((AnonymousClass6u6) this.A06).BlV((C160057kO) this.A02, (C128936Ee) this.A05, (AnonymousClass6AZ) this.A00, num2, publicKey2, (X509Certificate) this.A01);
                return;
            case 3:
                AnonymousClass6OQ r23 = (AnonymousClass6OQ) this.A06;
                PublicKey publicKey3 = (PublicKey) this.A04;
                Integer num3 = (Integer) this.A03;
                ((AnonymousClass6u6) this.A05).BlZ(r23, (C160057kO) this.A00, (C128936Ee) this.A02, num3, publicKey3, (X509Certificate) this.A01);
                return;
            default:
                C128196Bh r3 = (C128196Bh) this.A01;
                C1493070q.A00((Context) this.A03, (Intent) this.A06, r3, (C159737jq) this.A00, (C10810fG) this.A02, (C10810fG) this.A04, (C10810fG) this.A05);
                return;
        }
    }

    public AnonymousClass754(AnonymousClass6OQ r3, C160057kO r4, C128936Ee r5, AnonymousClass6u6 r6, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A07 = 3;
        AnonymousClass00C.A0D(x509Certificate, 2);
        AnonymousClass00C.A0D(r3, 3);
        C36321k7.A10(r4, r5);
        this.A05 = r6;
        this.A01 = x509Certificate;
        this.A06 = r3;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r4;
        this.A02 = r5;
    }

    public AnonymousClass754(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, C145536u3 r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A07 = 1;
        C36321k7.A0z(x509Certificate, r2);
        C36321k7.A10(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
    }

    public AnonymousClass754(C160057kO r2, C128936Ee r3, AnonymousClass6u6 r4, AnonymousClass6AZ r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A07 = 2;
        AnonymousClass00C.A0D(x509Certificate, 3);
        C36321k7.A10(r2, r3);
        this.A06 = r4;
        this.A00 = r5;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A02 = r2;
        this.A05 = r3;
    }
}
