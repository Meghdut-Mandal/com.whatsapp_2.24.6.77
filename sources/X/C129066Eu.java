package X;

import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Eu  reason: invalid class name and case insensitive filesystem */
public class C129066Eu {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Bitmap A07;
    public Pair A08;
    public C61243Bc A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final AnonymousClass141 A0a;
    public final UserJid A0b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C129066Eu)) {
            return false;
        }
        C129066Eu r5 = (C129066Eu) obj;
        if (A00(this, r5)) {
            AnonymousClass141 r1 = r5.A0a;
            AnonymousClass141 r2 = this.A0a;
            return r1.equals(r2) && r1.A0B() == r2.A0B() && C1901797e.A00(r5.A08, this.A08) && r5.A0J == this.A0J && r5.A0F == this.A0F && r5.A0B == this.A0B && r5.A0K == this.A0K && r5.A0G == this.A0G && r5.A02 == this.A02 && r5.A0C == this.A0C && r5.A01 == this.A01 && r5.A0U == this.A0U && r5.A0O == this.A0O && r5.A0N == this.A0N && C1901797e.A00(r5.A09, this.A09) && r5.A0R == this.A0R && r5.A0V == this.A0V && r5.A0A == this.A0A && r5.A03 == this.A03 && C1901797e.A00(r5.A07, this.A07) && r5.A0P == this.A0P && r5.A0Q == this.A0Q && r5.A0E == this.A0E && r5.A0Y == this.A0Y && r5.A0M == this.A0M && r5.A05 == this.A05 && r5.A0Z == this.A0Z && r5.A0D == this.A0D && r5.A0L == this.A0L && r5.A0W == this.A0W && r5.A0T == this.A0T && r5.A0S == this.A0S && r5.A06 == this.A06 && r5.A0I == this.A0I && r5.A0H == this.A0H && r5.A0X == this.A0X && r5.A04 == this.A04 && r5.A00 == this.A00;
        }
    }

    public static boolean A00(C129066Eu r1, C129066Eu r2) {
        return r1.A0b.equals(r2.A0b);
    }

    public boolean A01() {
        Pair pair = this.A08;
        if (C36381kD.A04(pair) != -1 || C36381kD.A03(pair) == -1) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((C36351kA.A05(this.A08, C36351kA.A05(this.A0a, (217 + this.A0b.hashCode()) * 31)) + (this.A0J ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31) + (this.A0G ? 1 : 0)) * 31) + this.A02) * 31) + (this.A0C ? 1 : 0)) * 31) + this.A01) * 31) + (this.A0U ? 1 : 0)) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A09)) * 31) + (this.A0R ? 1 : 0)) * 31) + (this.A0V ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + this.A03) * 31) + AnonymousClass000.A0H(this.A07)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0Y ? 1 : 0)) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0Z ? 1 : 0)) * 31) + this.A05) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0L ? 1 : 0)) * 31) + (this.A0W ? 1 : 0)) * 31) + (this.A0T ? 1 : 0)) * 31) + (this.A0S ? 1 : 0)) * 31) + this.A06) * 31) + (this.A0I ? 1 : 0)) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0X ? 1 : 0)) * 31) + this.A04) * 31) + AnonymousClass000.A0H(Float.valueOf(this.A00));
    }

    public final String toString() {
        return this.A0b.toString();
    }

    public C129066Eu(AnonymousClass141 r2, UserJid userJid) {
        this.A0b = userJid;
        this.A0a = r2;
    }
}
