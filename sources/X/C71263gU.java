package X;

import com.whatsapp.util.Log;

/* renamed from: X.3gU  reason: invalid class name and case insensitive filesystem */
public class C71263gU implements C30631aW {
    public final C27261Nn A00;
    public final AnonymousClass1DM A01;
    public final AnonymousClass185 A02;
    public final AnonymousClass1O6 A03;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        AnonymousClass1M0 A04;
        AnonymousClass1M0 A042;
        AnonymousClass185 r1 = this.A02;
        Log.i("VerifiedNameManager/deleteStaleUnconfirmedVerifiedNameCerts");
        C18740tg.A00();
        synchronized (r1.A06) {
            C229516p r2 = r1.A01;
            int A043 = r1.A00.A04(C21100yf.A1q);
            try {
                A042 = r2.A00.A04();
                String[] A1S = C36441kJ.A1S();
                A1S[0] = "0";
                C36351kA.A1V(A1S, 1, C36391kE.A0B(System.currentTimeMillis()) - ((long) A043));
                C229416o.A02(A042, "wa_vnames", "identity_unconfirmed_since > ? AND identity_unconfirmed_since < ?", A1S);
                A042.close();
            } catch (IllegalArgumentException e) {
                C18740tg.A08("contact-mgr-db/unable to delete stale vnames", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        C27271No r0 = this.A00.A00;
        C224214g A0g = C36361kB.A0g();
        try {
            A04 = r0.A00.A04();
            String[] A1R = C36441kJ.A1R();
            C36351kA.A1V(A1R, 0, System.currentTimeMillis() - 604800000);
            C229416o.A02(A04, "wa_last_entry_point", "entry_point_time <= ?", A1R);
            A04.close();
            A0g.A00();
        } catch (IllegalArgumentException e2) {
            C18740tg.A08("deleteOldChatEntryPointLogs/unable to delete old chat entry points ", e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        AnonymousClass1DM r6 = this.A01;
        long A06 = r6.A06();
        long A05 = r6.A05();
        C229716r r10 = r6.A03.A00;
        AnonymousClass1M0 A044 = r10.A04();
        try {
            String[] A1R2 = C36441kJ.A1R();
            C36351kA.A1V(A1R2, 0, A06);
            C229416o.A02(A044, "wa_trusted_contacts", "incoming_tc_token_timestamp< ?", A1R2);
            A044.close();
            A044 = r10.A04();
            String[] A1R3 = C36441kJ.A1R();
            C36351kA.A1V(A1R3, 0, A05);
            long A022 = C229416o.A02(A044, "wa_trusted_contacts_send", "sent_tc_token_timestamp< ?", A1R3);
            A044.close();
            if (A022 > 0) {
                AnonymousClass1DM.A03(r6).clear();
            }
            C36341k9.A0u(AnonymousClass1O6.A00(this.A03).edit().remove("last_picture_full_sync").remove("last_business_full_sync").remove("last_devices_full_sync").remove("last_payment_full_sync").remove("last_disappearing_mode_full_sync").remove("last_lid_full_sync").remove("picture_full_sync_wait").remove("business_full_sync_wait").remove("devices_full_sync_wait").remove("payment_full_sync_wait").remove("disappearing_mode_full_sync_wait"), "contact_lid_sync_wait");
            return;
        } catch (Throwable th3) {
            th.addSuppressed(th3);
            throw th;
        }
        throw th;
        throw th;
    }

    public C71263gU(C27261Nn r1, AnonymousClass1DM r2, AnonymousClass185 r3, AnonymousClass1O6 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }
}
