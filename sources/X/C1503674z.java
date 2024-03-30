package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.74z  reason: invalid class name and case insensitive filesystem */
public class C1503674z implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public C1503674z(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, C145546u7 r5, PublicKey publicKey, X509Certificate x509Certificate, int i, int i2) {
        this.A07 = i2;
        if (1 - i2 != 0) {
            AnonymousClass00C.A0D(publicKey, 3);
        } else {
            AnonymousClass00C.A0D(publicKey, 3);
            C36341k9.A1F(r3, r4);
        }
        this.A05 = r5;
        this.A02 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r3;
        this.A03 = r4;
        this.A06 = r2;
    }

    public final void run() {
        switch (this.A07) {
            case 0:
                C107265Nh r1 = (C107265Nh) this.A01;
                AnonymousClass1ND r9 = (AnonymousClass1ND) this.A02;
                Context context = (Context) this.A03;
                int i = this.A00;
                AnonymousClass3KV r6 = (AnonymousClass3KV) this.A04;
                if (r1 != null) {
                    ((AnonymousClass1NE) r9).BNr(context, r1, i, false);
                    return;
                } else if (r6 == null || r6.A03 < System.currentTimeMillis() - 86400000) {
                    Activity A002 = C24801Dv.A00(context);
                    boolean z = A002 instanceof C225314u;
                    C18740tg.A0D(z, "Activity should be instance of DialogActivity");
                    if (z) {
                        ((C225314u) A002).Btl(VoipErrorDialogFragment.A05(new AnonymousClass3FU(), 30), (String) null);
                        return;
                    }
                    return;
                } else {
                    r9.Bug(context, r6, i);
                    return;
                }
            case 1:
                AnonymousClass6OQ r0 = (AnonymousClass6OQ) this.A06;
                C135086c7 r3 = r0.A04;
                AnonymousClass00C.A08(r3);
                C160057kO r12 = (C160057kO) this.A01;
                String A003 = AnonymousClass6OQ.A00(r0);
                PublicKey publicKey = (PublicKey) this.A04;
                int i2 = this.A00;
                C145546u7.A05(r12, (C128936Ee) this.A03, r3, (C145546u7) this.A05, A003, publicKey, (X509Certificate) this.A02, i2);
                return;
            case 2:
                AnonymousClass6OQ r2 = (AnonymousClass6OQ) this.A06;
                PublicKey publicKey2 = (PublicKey) this.A04;
                Integer valueOf = Integer.valueOf(this.A00);
                ((C145546u7) this.A05).BlY(r2, (C160057kO) this.A01, (C128936Ee) this.A03, valueOf, publicKey2, (X509Certificate) this.A02);
                return;
            case 3:
                AnonymousClass6OQ r02 = (AnonymousClass6OQ) this.A06;
                PublicKey publicKey3 = (PublicKey) this.A04;
                int i3 = this.A00;
                C145546u7.A03(r02, (C160057kO) this.A01, (C128936Ee) this.A03, (C145546u7) this.A05, publicKey3, (X509Certificate) this.A02, i3);
                return;
            default:
                AnonymousClass6OQ r22 = (AnonymousClass6OQ) this.A06;
                PublicKey publicKey4 = (PublicKey) this.A04;
                Integer valueOf2 = Integer.valueOf(this.A00);
                ((C145546u7) this.A05).BlZ(r22, (C160057kO) this.A01, (C128936Ee) this.A03, valueOf2, publicKey4, (X509Certificate) this.A02);
                return;
        }
    }

    public C1503674z(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, C145546u7 r5, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A07 = 3;
        AnonymousClass00C.A0D(publicKey, 4);
        C36321k7.A10(r3, r4);
        this.A05 = r5;
        this.A06 = r2;
        this.A02 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r3;
        this.A03 = r4;
    }

    public C1503674z(Context context, AnonymousClass1ND r3, C20530xi r4, C19970wo r5, AnonymousClass3KV r6, C107265Nh r7, int i) {
        this.A07 = 0;
        this.A01 = r7;
        this.A02 = r3;
        this.A03 = context;
        this.A00 = i;
        this.A04 = r6;
        this.A05 = r5;
        this.A06 = r4;
    }
}
