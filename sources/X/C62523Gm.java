package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.3Gm  reason: invalid class name and case insensitive filesystem */
public class C62523Gm {
    public final int A00;
    public final int A01;
    public final AnonymousClass141 A02;
    public final UserJid A03;
    public final String A04;
    public final int A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62523Gm r5 = (C62523Gm) obj;
            if (this.A00 != r5.A00 || this.A05 != r5.A05 || !C1901797e.A00(this.A02, r5.A02) || !C1901797e.A00(this.A03, r5.A03) || !C1901797e.A00(this.A04, r5.A04) || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        C36331k8.A1V(objArr, this.A00);
        C36341k9.A1T(objArr, this.A05);
        objArr[4] = this.A04;
        C36371kC.A1S(objArr, this.A01);
        return Arrays.hashCode(objArr);
    }

    public C62523Gm(AnonymousClass141 r1, UserJid userJid, String str, int i, int i2, int i3) {
        this.A02 = r1;
        this.A03 = userJid;
        this.A00 = i;
        this.A05 = i2;
        this.A04 = str;
        this.A01 = i3;
    }
}
