package X;

import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.3Eo  reason: invalid class name and case insensitive filesystem */
public final class C62053Eo {
    public int A00;
    public int A01;
    public C607339d A02 = C50702lO.A00;
    public CharSequence A03;
    public String A04;
    public boolean A05;

    public static void A00(WDSBanner wDSBanner, C62053Eo r2, CharSequence charSequence) {
        r2.A03 = charSequence;
        wDSBanner.setState(r2.A01());
    }

    public final AnonymousClass3A8 A01() {
        return new AnonymousClass3A8(this.A02, this.A03, this.A04, this.A01, this.A00, this.A05);
    }
}
