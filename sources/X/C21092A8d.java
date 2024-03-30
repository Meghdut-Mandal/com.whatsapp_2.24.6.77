package X;

/* renamed from: X.A8d  reason: case insensitive filesystem */
public class C21092A8d implements C160387kv {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C201009id A01;
    public final /* synthetic */ C21094A8f A02;
    public final /* synthetic */ C194449Pt A03;
    public final /* synthetic */ String A04;

    public void BRc(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            C201009id r4 = this.A01;
            r4.A0I.A06("authenticateBiometric/onAuthenticationSucceeded/success");
            C21094A8f a8f = this.A02;
            a8f.BRc(bArr);
            C201009id.A01(r4, a8f, this.A03.A01(C198799eD.A00(false, bArr2, "AUTH", (String) null, (byte[]) null, new Object[0], this.A00)), this.A04);
            return;
        }
        this.A01.A0I.A05("authenticateBiometric/onAuthenticationSucceeded/null signature");
        this.A02.BRZ();
    }

    public C21092A8d(C201009id r1, C21094A8f a8f, C194449Pt r3, String str, long j) {
        this.A01 = r1;
        this.A02 = a8f;
        this.A04 = str;
        this.A03 = r3;
        this.A00 = j;
    }

    public void BRY(int i, CharSequence charSequence) {
        C24611Dc r2 = this.A01.A0I;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("authenticateBiometric/onAuthenticationError/error: ");
        r2.A05(AnonymousClass000.A0q(charSequence.toString(), A0u));
        this.A02.BRY(i, charSequence);
    }

    public void BRZ() {
        this.A01.A0I.A05("authenticateBiometric/onAuthenticationFailed");
        this.A02.BRZ();
    }

    public void BRb(int i, CharSequence charSequence) {
        C24611Dc r2 = this.A01.A0I;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("authenticateBiometric/onAuthenticationHelp/help: ");
        r2.A05(AnonymousClass000.A0q(charSequence.toString(), A0u));
        this.A02.BRb(i, charSequence);
    }
}
