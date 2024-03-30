package X;

import android.os.SystemClock;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.6xq  reason: invalid class name and case insensitive filesystem */
public class C147826xq implements C236119d {
    public final long A00;
    public final C21390zA A01;
    public final AnonymousClass19J A02;
    public final C19970wo A03;
    public final C21010yW A04;
    public final C000100b A05;

    public void BVN(String str) {
        A00(3);
        JniBridge.jvidispatchIOOO(1, ((JniBridge) this.A05).wajContext.get(), (Object) null, (Object) null);
    }

    public void BWw(C203399nx r4, String str) {
        A00(3);
        JniBridge.jvidispatchIOOO(1, ((JniBridge) this.A05).wajContext.get(), (Object) null, (Object) null);
    }

    public void BiM(C203399nx r5, String str) {
        C203399nx A0d = r5.A0d("sign_credential");
        A0d.A0U("t");
        byte[] bArr = A0d.A0d("signed_credential").A01;
        byte[] bArr2 = A0d.A0d("acs_public_key").A01;
        A00(1);
        JniBridge.jvidispatchIOOO(1, ((JniBridge) this.A05).wajContext.get(), bArr, bArr2);
    }

    public C147826xq(C21390zA r1, AnonymousClass19J r2, C19970wo r3, C21010yW r4, C000100b r5, long j) {
        this.A05 = r5;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = j;
    }

    private void A00(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        AnonymousClass58N r5 = new AnonymousClass58N();
        r5.A04 = Integer.valueOf(i);
        Long valueOf = Long.valueOf(elapsedRealtime);
        r5.A05 = valueOf;
        r5.A07 = valueOf;
        if (this.A01.A00) {
            r5.A02 = 1;
        } else {
            r5.A02 = C36361kB.A0j();
        }
        boolean z = false;
        if (this.A02.A04 == 2) {
            z = true;
        }
        r5.A01 = Boolean.valueOf(z);
        r5.A03 = 1;
        r5.A00 = true;
        this.A04.Bly(r5);
    }
}
