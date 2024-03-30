package X;

import java.util.List;

/* renamed from: X.5y6  reason: invalid class name and case insensitive filesystem */
public class C124385y6 {
    public final C98504rX A00;
    public final C98484rV A01;
    public final C98494rW A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    public C124385y6(C124605yU r3) {
        String str = r3.A03;
        if (str != null) {
            this.A03 = str;
            C98494rW r1 = r3.A02;
            this.A06 = r3.A07;
            this.A07 = r3.A08;
            this.A02 = r1;
            this.A00 = r3.A00;
            this.A01 = r3.A01;
            this.A05 = r3.A06;
            this.A04 = r3.A05;
            return;
        }
        throw AnonymousClass001.A09("Cache name must not be null");
    }
}
