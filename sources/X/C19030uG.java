package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0uG  reason: invalid class name and case insensitive filesystem */
public class C19030uG {
    public int A00;
    public int A01;
    public C19040uH A02;
    public Set A03;
    public final Set A04;
    public final Set A05 = new HashSet();

    public C19020uF A00() {
        boolean z = false;
        if (this.A02 != null) {
            z = true;
        }
        AnonymousClass006.A08(z, "Missing required property: factory.");
        return new C19020uF(this.A02, new HashSet(this.A04), new HashSet(this.A05), this.A03, this.A00, this.A01);
    }

    public void A01(C19090uM r3) {
        AnonymousClass006.A07(!this.A04.contains(r3.A01), "Components are not allowed to depend on interfaces they themselves provide.");
        this.A05.add(r3);
    }

    public C19030uG(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.A04 = hashSet;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = new HashSet();
        hashSet.add(cls);
        for (Class A022 : clsArr) {
            AnonymousClass006.A02(A022, "Null interface");
        }
        Collections.addAll(this.A04, clsArr);
    }
}
