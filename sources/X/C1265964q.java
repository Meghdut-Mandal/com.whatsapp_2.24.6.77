package X;

import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.64q  reason: invalid class name and case insensitive filesystem */
public final class C1265964q {
    public Long A00;
    public final AnonymousClass1UP A01;
    public final AnonymousClass1UM A02;
    public final WfalManager A03;
    public final C19420v0 A04;
    public final C20810yC A05;
    public final AnonymousClass1GQ A06;
    public final C28781Ua A07;

    public final void A00(int i, long j) {
        Long l = this.A00;
        if (l != null) {
            this.A01.flowEndFail(l.longValue(), "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
        }
        AnonymousClass1UP r5 = this.A01;
        long A0A = C90474aD.A0A(0, 453118619);
        r5.B7S(new AnonymousClass66V(C36331k8.A0h(Integer.valueOf(i)), false), A0A);
        r5.flowAnnotate(A0A, "status_session_id", j);
        AnonymousClass1UM r4 = this.A02;
        AnonymousClass1US r2 = AnonymousClass1US.STATUS_LOGGING;
        r5.flowAnnotate(A0A, "is_fb_auto_crossposting_enabled_start", C36341k9.A1Z(r4.A01(r2)));
        r5.flowAnnotate(A0A, "is_fb_account_linked", r4.A06(r2));
        r5.flowAnnotate(A0A, "is_waffle_v2_enabled", this.A07.A00());
        r5.flowAnnotate(A0A, "is_waffle_v3_enabled", false);
        r5.flowAnnotate(A0A, "is_channels_enabled", AnonymousClass1GQ.A01(this.A06, 3877));
        if (this.A05.A0E(6084)) {
            r5.flowAnnotate(A0A, "encrypted_rid", this.A04.A0b());
        }
        this.A00 = Long.valueOf(A0A);
    }

    public C1265964q(WfalManager wfalManager, C19420v0 r2, C20810yC r3, AnonymousClass1GQ r4, AnonymousClass1UP r5, AnonymousClass1UM r6, C28781Ua r7) {
        C36321k7.A1B(r6, r7, r5, r4, wfalManager);
        C36321k7.A10(r3, r2);
        this.A02 = r6;
        this.A07 = r7;
        this.A01 = r5;
        this.A06 = r4;
        this.A03 = wfalManager;
        this.A05 = r3;
        this.A04 = r2;
    }
}
