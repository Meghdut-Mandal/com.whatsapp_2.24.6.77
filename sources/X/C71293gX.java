package X;

import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.3gX  reason: invalid class name and case insensitive filesystem */
public final class C71293gX implements C30631aW {
    public final C19970wo A00;
    public final C19420v0 A01;
    public final C20810yC A02;
    public final AnonymousClass37L A03;
    public final AnonymousClass12U A04;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        StringBuilder A0u;
        String str;
        AnonymousClass005 r5 = this.A01.A00;
        if (C36391kE.A0H(r5).getInt("autoconf_cf_type", -1) != 1) {
            A0u = AnonymousClass000.A0u();
            A0u.append("AutoConfConfidencePingMidnightDailyCron");
            str = "/onDailyCronNoMessageStore/confidence framework not enabled, skip ping";
        } else if (!this.A04.A03()) {
            A0u = AnonymousClass000.A0u();
            A0u.append("AutoConfConfidencePingMidnightDailyCron");
            str = "/onDailyCronNoMessageStore/registration not verified, skip ping";
        } else {
            boolean z = C36391kE.A0H(r5).getBoolean("resend_confidence_ping", true);
            A0u = AnonymousClass000.A0u();
            if (!z) {
                A0u.append("AutoConfConfidencePingMidnightDailyCron");
                str = "/onDailyCronNoMessageStore/ping not allowed due to previous failure, skip ping";
            } else {
                A0u.append("AutoConfConfidencePingMidnightDailyCron");
                C36321k7.A1a(A0u, "/onDailyCronNoMessageStore/start auth challenge request");
                int A07 = this.A02.A07(7241);
                if (A07 != 1) {
                    long A08 = C36371kC.A08(C36391kE.A0H(r5), "autoconf_cf_last_ping");
                    if (A08 > 0) {
                        if (Math.abs((A08 + (((long) A07) * 86400000)) - C19970wo.A00(this.A00)) > 7200000) {
                            return;
                        }
                    }
                }
                C36341k9.A0w(C36391kE.A0H(r5).edit(), "autoconf_cf_last_ping", C19970wo.A00(this.A00));
                AnonymousClass37L r2 = this.A03;
                Log.i("AutoConfConfidencePingManager/requestChallenge");
                C75443nF r4 = new C75443nF(r2.A01);
                byte[] A032 = r2.A02.A03((String) null);
                if (A032 == null) {
                    Log.e("AutoConfConfidencePingManager/requestChallenge/failed to query clientStartMessage from FEO2 client");
                    return;
                }
                Log.i("AutoConfConfidencePingManager/requestChallenge/successfully queried clientStartMessage, request confidence challenge");
                String A13 = C36441kJ.A13(A032);
                C36361kB.A1I(A13);
                r4.A00 = r2;
                AnonymousClass9VA r3 = new GetAutoConfConfidenceChallengeMutationImpl$Builder().A00;
                r3.A02("clientStartMessage", A13);
                r4.A01.A00(new AnonymousClass9JF(r3, GetAutoConfConfidenceChallengeResponseImpl.class, "GetAutoConfConfidenceChallenge"), r4).A00();
                return;
            }
        }
        C36321k7.A1a(A0u, str);
    }

    public C71293gX(C19970wo r1, C19420v0 r2, C20810yC r3, AnonymousClass12U r4, AnonymousClass37L r5) {
        C36321k7.A18(r1, r3, r2, r4);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r4;
        this.A03 = r5;
    }
}
