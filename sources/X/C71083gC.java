package X;

import java.text.Format;
import java.text.SimpleDateFormat;

/* renamed from: X.3gC  reason: invalid class name and case insensitive filesystem */
public class C71083gC implements AnonymousClass4QB {
    public Format BC3(C18820ts r4) {
        try {
            return new SimpleDateFormat("LLLL yyyy", C36401kF.A0x(r4));
        } catch (IllegalArgumentException unused) {
            return new SimpleDateFormat("MMMM yyyy", C36401kF.A0x(r4));
        }
    }
}
