package X;

import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.3Ri  reason: invalid class name and case insensitive filesystem */
public final class C65253Ri {
    public AnonymousClass3I2 A00;
    public Set A01 = C36441kJ.A16();
    public final C24521Ct A02 = new AnonymousClass4YE(this, 5);
    public final C24381Cf A03;
    public final C34831hi A04;
    public final C34831hi A05;
    public final C006302t A06;

    public C65253Ri(C24381Cf r5, C006302t r6) {
        AnonymousClass00C.A0D(r5, 1);
        this.A03 = r5;
        this.A06 = r6;
        AnonymousClass3I2 r0 = new AnonymousClass3I2(C36441kJ.A16(), new C53082qk(this, 5));
        this.A00 = r0;
        C34831hi A0s = C36441kJ.A0s(r0);
        this.A05 = A0s;
        this.A04 = A0s;
    }

    public static final void A00(C65253Ri r3) {
        if (!r3.A00.A00.isEmpty()) {
            AnonymousClass3I2 r1 = new AnonymousClass3I2(C36441kJ.A17(), r3.A00.A01);
            r3.A00 = r1;
            r3.A05.A0C(r1);
        }
    }

    public static final void A01(C65253Ri r3, GroupJid groupJid) {
        Set set = r3.A00.A00;
        if (set.contains(groupJid)) {
            set.remove(groupJid);
        } else {
            set.add(groupJid);
        }
        AnonymousClass3I2 r1 = new AnonymousClass3I2(set, r3.A00.A01);
        r3.A00 = r1;
        r3.A05.A0C(r1);
    }
}
