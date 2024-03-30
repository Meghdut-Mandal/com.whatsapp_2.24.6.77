package X;

/* renamed from: X.6ta  reason: invalid class name and case insensitive filesystem */
public final class C145246ta implements C160427kz {
    public final /* synthetic */ C160427kz A00;
    public final /* synthetic */ C26491Kj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C145246ta(C160427kz r1, C26491Kj r2, String str, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = z;
        this.A00 = r1;
    }

    public void BQX() {
        C26491Kj r4 = this.A01;
        C26551Kp r3 = r4.A04;
        int hashCode = this.A02.hashCode();
        r3.A0B(hashCode, "onAbort", "Download aborted");
        r3.A08(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A05(hashCode, 105);
        }
        C160427kz r0 = this.A00;
        if (r0 != null) {
            r0.BQX();
        }
        r4.A0F();
    }

    public void onSuccess() {
        C26491Kj r4 = this.A01;
        C26551Kp r3 = r4.A04;
        int hashCode = this.A02.hashCode();
        r3.A08(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A05(hashCode, 2);
        }
        C160427kz r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess();
        }
        r4.A0F();
    }

    public /* bridge */ /* synthetic */ void BWm(Integer num) {
        int intValue = num.intValue();
        C26491Kj r4 = this.A01;
        C26551Kp r3 = r4.A04;
        int hashCode = this.A02.hashCode();
        r3.A0B(hashCode, AnonymousClass000.A0r("onError ", AnonymousClass000.A0u(), intValue), "Download failed");
        r3.A08(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A05(hashCode, 3);
        }
        C160427kz r1 = this.A00;
        if (r1 != null) {
            r1.BWm(Integer.valueOf(intValue));
        }
        r4.A0F();
    }

    public /* bridge */ /* synthetic */ void BjA(Integer num) {
        int intValue = num.intValue();
        C26491Kj r4 = this.A01;
        C26551Kp r3 = r4.A04;
        int hashCode = this.A02.hashCode();
        r3.A0B(hashCode, AnonymousClass000.A0r("onTimeout ", AnonymousClass000.A0u(), intValue), "Download timed out");
        r3.A08(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            r3.A05(hashCode, 3);
        }
        C160427kz r1 = this.A00;
        if (r1 != null) {
            r1.BjA(Integer.valueOf(intValue));
        }
        r4.A0F();
    }
}
