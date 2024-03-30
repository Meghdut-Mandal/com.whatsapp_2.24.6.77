package X;

/* renamed from: X.7sc  reason: invalid class name and case insensitive filesystem */
public class C164937sc implements C158647hq {
    public Object A00;
    public final int A01;

    public C164937sc(AnonymousClass6YP r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void B2G() {
        switch (this.A01) {
            case 0:
                AnonymousClass6YP.A06((AnonymousClass6YP) this.A00);
                return;
            case 1:
                ((AnonymousClass6YP) this.A00).A02++;
                return;
            case 2:
                ((AnonymousClass6YP) this.A00).A0T(true, false);
                return;
            case 3:
                AnonymousClass6YP r2 = (AnonymousClass6YP) this.A00;
                r2.A08 = C19970wo.A00(r2.A0p);
                return;
            default:
                AnonymousClass6YP r4 = (AnonymousClass6YP) this.A00;
                AnonymousClass6Q9 r0 = r4.A0H;
                if (r0 == null || AnonymousClass6Q9.A00(r0)) {
                    int i = r4.A03 + 1;
                    r4.A03 = i;
                    if (r4.A1C && i == 6) {
                        r4.A12.A0G.setVisibility(4);
                        if (r4.A0r.A0E(1140)) {
                            C19420v0 r22 = r4.A0q;
                            if (!C36371kC.A1U(C36341k9.A0E(r22), "ptt_draft_preview_error_count_reached")) {
                                C36331k8.A18(r22, "ptt_draft_preview_error_count_reached", true);
                                r4.A0f.A0E("voice_visualization_error_count_reached_critical_event_name", (String) null, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
