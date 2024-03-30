package X;

import com.whatsapp.jobqueue.job.SendEngagedReceiptJob;

/* renamed from: X.3DP  reason: invalid class name */
public class AnonymousClass3DP {
    public final AnonymousClass164 A00;
    public final AnonymousClass35V A01;

    public final void A00(AnonymousClass3T1 r13, String str, String str2) {
        boolean z;
        int i;
        String str3 = str2;
        C36321k7.A0v(r13, 0, str2);
        AnonymousClass35V r2 = this.A01;
        C20810yC r1 = r2.A01;
        if (r1.A0E(2849)) {
            z = r2.A00.A2L();
        } else {
            z = true;
        }
        boolean A1S = AnonymousClass000.A1S(r13.A0A & 524288, 524288);
        if (!r1.A0E(2848) && z && A1S) {
            String str4 = str;
            switch (str.hashCode()) {
                case -1435389390:
                    if (str.equals("media-image")) {
                        i = 3527;
                        break;
                    } else {
                        return;
                    }
                case -1423499950:
                    if (str.equals("media-video")) {
                        i = 3529;
                        break;
                    } else {
                        return;
                    }
                case -903583990:
                    if (str.equals("quick-reply")) {
                        i = 3524;
                        break;
                    } else {
                        return;
                    }
                case -862592005:
                    if (str.equals("cta-call")) {
                        i = 3526;
                        break;
                    } else {
                        return;
                    }
                case 1080570930:
                    if (str.equals("cta-url")) {
                        i = 3525;
                        break;
                    } else {
                        return;
                    }
                case 2139281359:
                    if (str.equals("media-doc")) {
                        i = 3528;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            if (r1.A0E(i)) {
                AnonymousClass164 r22 = this.A00;
                C64933Qa r12 = r13.A1J;
                AnonymousClass11F r0 = r12.A00;
                C18740tg.A06(r0);
                String rawString = r0.getRawString();
                String str5 = r12.A01;
                AnonymousClass00C.A07(str5);
                r22.A01(new SendEngagedReceiptJob(rawString, str5, str4, str3, r13.A0I, r13.A1Q));
            }
        }
    }

    public AnonymousClass3DP(AnonymousClass164 r1, AnonymousClass35V r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
