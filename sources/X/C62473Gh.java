package X;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.3Gh  reason: invalid class name and case insensitive filesystem */
public class C62473Gh {
    public boolean A00;
    public final AnonymousClass191 A01;
    public final AnonymousClass16J A02;
    public final HashMap A03 = AnonymousClass001.A0J();
    public final AnonymousClass17Y A04;

    public void A02() {
        this.A00 = true;
        AnonymousClass17Y r2 = this.A04;
        r2.A02.post(C80233v4.A00(this, 40));
    }

    public static C62473Gh A00(AnonymousClass17Y r2, C62473Gh r3, AnonymousClass16J r4, Object obj, int i) {
        return new C62473Gh(r2, new AnonymousClass4Y1(obj, i), r3, r4);
    }

    public Collection A01() {
        HashMap hashMap = this.A03;
        if (hashMap.size() == 0) {
            return C36441kJ.A16();
        }
        return hashMap.values();
    }

    public C62473Gh(AnonymousClass17Y r3, AnonymousClass4Q3 r4, C62473Gh r5, AnonymousClass16J r6) {
        if (r5 != null) {
            r5.A02();
        }
        this.A04 = r3;
        this.A02 = r6;
        this.A00 = false;
        C90384a4 r0 = new C90384a4(r4, this, 0);
        this.A01 = r0;
        r6.registerObserver(r0);
    }
}
