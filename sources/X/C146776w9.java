package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.6w9  reason: invalid class name and case insensitive filesystem */
public class C146776w9 implements C161307mX {
    public final int A00;

    public boolean B2L() {
        return false;
    }

    public int BHQ() {
        return 1;
    }

    public C129196Ft B4v(Context context, C18820ts r4, boolean z) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass5Cd();
            case 1:
                return new AnonymousClass5Ce();
            case 2:
                return new AnonymousClass5Cf();
            case 3:
                return new AnonymousClass5Ck();
            case 4:
                return new AnonymousClass5Cg();
            case 5:
                return new AnonymousClass5Ch();
            case 6:
                return new AnonymousClass5CY(context, r4, z);
            case 7:
                return new C104965Cn(context, r4, z);
            default:
                C36321k7.A0x(context, r4);
                return new AnonymousClass5Co(context, r4, C36361kB.A0m(context, R.string.f12nameremoved), z);
        }
    }

    public AnonymousClass1XQ[] BBU() {
        int i;
        AnonymousClass1XQ[] r2 = new AnonymousClass1XQ[1];
        int[] iArr = new int[1];
        switch (this.A00) {
            case 0:
                i = 8599;
                break;
            case 1:
                i = 11093;
                break;
            case 2:
                i = 128306;
                break;
            case 3:
                i = 128173;
                break;
            case 4:
            case 5:
                i = 128172;
                break;
            case 8:
                i = 128205;
                break;
            default:
                i = 128346;
                break;
        }
        iArr[0] = i;
        r2[0] = new AnonymousClass1XQ(iArr);
        return r2;
    }

    public boolean BoQ() {
        int i = this.A00;
        if (i == 7 || i == 8) {
            return true;
        }
        return false;
    }

    public C146776w9(int i) {
        this.A00 = i;
    }

    public String BIB() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("custom:");
        return C36381kD.A10(A0u, this.A00);
    }
}
