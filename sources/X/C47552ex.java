package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.2ex  reason: invalid class name and case insensitive filesystem */
public final class C47552ex extends C47522eu {
    public float A00;
    public int A01;
    public int A02 = 3;
    public int A03;
    public int A04;

    public C47552ex(C24801Dv r3, C20690y0 r4, AnonymousClass17Y r5, C21060yb r6, C19970wo r7, C19630wG r8, C18820ts r9, AnonymousClass1H2 r10, C20810yC r11, AnonymousClass6KH r12, AnonymousClass2XH r13, AnonymousClass1SU r14, NewsletterLinkLauncher newsletterLinkLauncher, AnonymousClass3T1 r16, AnonymousClass3G7 r17, AnonymousClass3S6 r18, AnonymousClass1HA r19, AnonymousClass1SV r20, C19770wU r21, AnonymousClass3OH r22) {
        super(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, newsletterLinkLauncher, r16, r17, r18, r19, r20, r21, r22);
        this.A09.setId(R.id.status_playback_gif);
    }

    public void A0G() {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        super.A0G();
        C65083Qq r2 = this.A02;
        if (r2 != null) {
            r2.A05 = new C89774Xv(this, 1);
        }
    }

    public static final int A08(C47552ex r3, long j) {
        if (r3.A02 instanceof C50362kd) {
            return 1;
        }
        if (j == 0) {
            return 3;
        }
        return (int) Math.max(3, ((long) 6000) / j);
    }

    public long A0A() {
        int i = this.A02;
        if (i > 0) {
            return (long) (i * this.A03);
        }
        long A0A = super.A0A();
        return A0A * ((long) A08(this, A0A));
    }

    public void A0H() {
        C65083Qq r1 = this.A02;
        if (r1 != null) {
            r1.A05 = null;
        }
        super.A0H();
    }
}
