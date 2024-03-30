package X;

import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: X.7rL  reason: invalid class name and case insensitive filesystem */
public class C164147rL implements AnonymousClass4P8 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C164147rL(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public boolean BQk(Intent intent, int i, int i2) {
        Integer num;
        Integer num2;
        int i3 = this.A03;
        AnonymousClass155 r0 = (AnonymousClass155) this.A02;
        if (i3 != 0) {
            r0.A3a(this);
            if (i != 1) {
                return false;
            }
            C119145pJ r1 = (C119145pJ) this.A01;
            if (i2 == -1) {
                num = C023109s.A00;
            } else if (i2 != 0) {
                num = C023109s.A0C;
            } else {
                num = C023109s.A01;
            }
            int intValue = num.intValue();
            AnonymousClass63O r2 = r1.A00;
            if (intValue != 0) {
                File file = r1.A01;
                if (intValue != 1) {
                    num2 = C023109s.A0G;
                } else {
                    num2 = C023109s.A0C;
                }
                r2.A00(num2);
                file.delete();
            } else {
                String A0y = C36381kD.A0y(Uri.fromFile(r1.A01));
                C160377ku r3 = r2.A03;
                if (r3 != null) {
                    AnonymousClass6JI.A00(r2.A02, new AnonymousClass6MO(C36341k9.A0m(A0y, C36411kG.A1b(r2.A01), 1)), r3);
                }
            }
        } else {
            r0.A3a(this);
            boolean z = false;
            if (i != 30) {
                return false;
            }
            C158067fk r12 = (C158067fk) this.A01;
            if (i2 == -1) {
                z = true;
            }
            r12.BfK(z);
        }
        return true;
    }
}
