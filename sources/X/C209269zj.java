package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9zj  reason: invalid class name and case insensitive filesystem */
public class C209269zj implements B4Y {
    public final /* synthetic */ C203139nN A00;
    public final /* synthetic */ String A01;

    public List BAq(String str, boolean z, boolean z2) {
        ArrayList A15 = C36441kJ.A15(B4Y.A00.BAq(str, z, false));
        String str2 = this.A01;
        if (str2 == null || str2.equals(str)) {
            Collections.sort(A15, new C23176B8k(this, 3));
            Object[] A0M = AnonymousClass001.A0M();
            C90494aF.A1H(str2, A15, A0M);
            C131916Rh.A01("MediaCodecSelector", "%s dec order (sw first) %s", A0M);
        }
        return A15;
    }

    public C209269zj(C203139nN r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public C202149l7 BFF() {
        return B4Y.A00.BFF();
    }
}
