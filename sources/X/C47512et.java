package X;

import android.content.Context;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.2et  reason: invalid class name and case insensitive filesystem */
public final class C47512et extends AnonymousClass3LJ {
    public AnonymousClass3ES A00;
    public boolean A01;
    public boolean A02;
    public final C20810yC A03;
    public final AnonymousClass1D1 A04;
    public final PhotoView A05;
    public final C46882bp A06;
    public final C63413Jy A07;
    public final AnonymousClass1SV A08;
    public final AnonymousClass2XH A09;
    public final NewsletterLinkLauncher A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47512et(X.C24801Dv r14, X.AnonymousClass17Y r15, X.C21060yb r16, X.C19970wo r17, X.C18820ts r18, X.C20810yC r19, X.AnonymousClass2XH r20, X.AnonymousClass1SU r21, X.AnonymousClass1D1 r22, com.whatsapp.newsletter.NewsletterLinkLauncher r23, X.AnonymousClass3T1 r24, X.AnonymousClass3G7 r25, X.AnonymousClass1SV r26) {
        /*
            r13 = this;
            r2 = r24
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r18
            r11 = r21
            r12 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = r19
            r13.A03 = r0
            r0 = r22
            r13.A04 = r0
            r0 = r20
            r13.A09 = r0
            r0 = r26
            r13.A08 = r0
            r0 = r23
            r13.A0A = r0
            X.2bp r2 = (X.C46882bp) r2
            r13.A06 = r2
            java.lang.String r1 = r2.A1a()
            X.11F r0 = r2.A0J()
            boolean r0 = r0 instanceof X.C177638e7
            if (r0 == 0) goto L_0x005d
            r4 = 6750(0x1a5e, double:3.335E-320)
        L_0x0036:
            X.3Jy r0 = new X.3Jy
            r1 = r17
            r0.<init>(r1, r4)
            r13.A07 = r0
            android.content.Context r0 = r13.A0B()
            X.2XX r1 = new X.2XX
            r1.<init>(r0, r13, r12)
            r0 = 0
            r1.A01 = r0
            r0 = 1
            r1.A0O = r0
            r0 = 0
            r1.A0N = r0
            r1.setIsLongpressEnabled(r0)
            r0 = 2131434280(0x7f0b1b28, float:1.849037E38)
            r1.setId(r0)
            r13.A05 = r1
            return
        L_0x005d:
            X.3Qa r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0085
            int r1 = X.C63883Lu.A00(r1)
            r0 = 89
            if (r1 < r0) goto L_0x007a
            java.lang.Integer r0 = X.C36361kB.A0i()
        L_0x006f:
            long r4 = X.C36431kI.A09(r0)
            r2 = 4500(0x1194, double:2.2233E-320)
            r0 = 3000(0xbb8, double:1.482E-320)
            long r4 = r4 * r0
            long r4 = r4 + r2
            goto L_0x0036
        L_0x007a:
            int r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x006f
        L_0x0085:
            r4 = 4500(0x1194, double:2.2233E-320)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47512et.<init>(X.1Dv, X.17Y, X.0yb, X.0wo, X.0ts, X.0yC, X.2XH, X.1SU, X.1D1, com.whatsapp.newsletter.NewsletterLinkLauncher, X.3T1, X.3G7, X.1SV):void");
    }

    public static final void A00(Context context, InteractiveAnnotation interactiveAnnotation, C47512et r11) {
        C28711Ts r7;
        Object obj = interactiveAnnotation.data;
        AnonymousClass00C.A07(obj);
        Context context2 = context;
        if (obj instanceof SerializableLocation) {
            SerializableLocation serializableLocation = (SerializableLocation) obj;
            r11.A09.A08(context2, serializableLocation.name, (String) null, serializableLocation.latitude, serializableLocation.longitude);
        } else if (obj instanceof C63393Jw) {
            C63393Jw r3 = (C63393Jw) obj;
            C52332pG r0 = r3.A02;
            boolean z = interactiveAnnotation.skipConfirmation;
            if (r0 != null) {
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    r7 = C28711Ts.FORWARDED_MESSAGE;
                } else if (ordinal == 1) {
                    r7 = C28711Ts.STATUS_POST_TOOLTIP;
                } else if (ordinal != 2) {
                    return;
                } else {
                    if (z) {
                        r7 = C28711Ts.STATUS_LINK_BUTTON;
                    } else {
                        r7 = C28711Ts.STATUS_LINK_TOOLTIP;
                    }
                }
                r11.A0A.A03(context2, r3.A01, r7, 3, (long) r3.A00);
            }
        }
    }

    public long A0A() {
        return this.A07.A00;
    }

    public void A0G() {
        AnonymousClass3LJ.A09(this.A07, this);
    }

    public void A0H() {
        this.A07.A02();
        this.A02 = false;
    }
}
