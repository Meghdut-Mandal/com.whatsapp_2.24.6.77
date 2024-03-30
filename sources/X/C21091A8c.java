package X;

/* renamed from: X.A8c  reason: case insensitive filesystem */
public class C21091A8c implements C160387kv {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9SL A01;
    public final /* synthetic */ C21093A8e A02;

    public void BRc(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            AnonymousClass9SL r2 = this.A01;
            r2.A01.A06("sendWithBiometric/onAuthenticationSucceeded/success");
            this.A02.BRc(C198799eD.A00(false, bArr2, r2.A05, (String) null, (byte[]) null, new Object[0], this.A00));
            return;
        }
        this.A01.A01.A05("sendWithBiometric/onAuthenticationSucceeded/null signature");
        this.A02.BRZ();
    }

    public C21091A8c(AnonymousClass9SL r1, C21093A8e a8e, long j) {
        this.A01 = r1;
        this.A02 = a8e;
        this.A00 = j;
    }

    public void BRY(int i, CharSequence charSequence) {
        C24611Dc r2 = this.A01.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("sendWithBiometric/onAuthenticationError/error: ");
        r2.A05(AnonymousClass000.A0q(charSequence.toString(), A0u));
        this.A02.BRY(i, charSequence);
    }

    public void BRZ() {
        this.A01.A01.A05("sendWithBiometric/onAuthenticationFailed");
        this.A02.BRZ();
    }

    public void BRb(int i, CharSequence charSequence) {
        C24611Dc r2 = this.A01.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("sendWithBiometric/onAuthenticationHelp/help: ");
        r2.A05(AnonymousClass000.A0q(charSequence.toString(), A0u));
        this.A02.BRb(i, charSequence);
    }
}
