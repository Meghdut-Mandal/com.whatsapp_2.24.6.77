package X;

import com.whatsapp.R;
import java.util.Arrays;

/* renamed from: X.1hl  reason: invalid class name and case insensitive filesystem */
public class C34861hl implements C34841hj {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public int BD8() {
        return 0;
    }

    public AnonymousClass11F BDC() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.A00), Boolean.valueOf(this.A02), this.A01});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C34861hl)) {
            return false;
        }
        C34861hl r4 = (C34861hl) obj;
        if (this.A00 == r4.A00 && this.A02 == r4.A02 && C1901797e.A00(this.A01, r4.A01)) {
            return true;
        }
        return false;
    }

    public C34861hl(String str) {
        this.A00 = R.string.f12nameremoved;
        this.A01 = str;
        this.A02 = true;
    }

    public /* synthetic */ AnonymousClass72P B9E() {
        return null;
    }

    public /* synthetic */ int BH3() {
        return -1;
    }

    public C34861hl(int i) {
        this.A00 = i;
        this.A01 = "";
        this.A02 = false;
    }
}
