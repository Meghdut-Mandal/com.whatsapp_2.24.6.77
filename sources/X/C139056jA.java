package X;

/* renamed from: X.6jA  reason: invalid class name and case insensitive filesystem */
public class C139056jA implements AnonymousClass7eF {
    public final /* synthetic */ AnonymousClass6SR A00;
    public final /* synthetic */ AnonymousClass7eF A01;
    public final /* synthetic */ C161027m0 A02;

    public C139056jA(AnonymousClass6SR r1, AnonymousClass7eF r2, C161027m0 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void Bef(int i) {
        C161027m0 r1;
        String str;
        C161027m0 r12;
        String str2;
        String str3 = "Bloks Request Error.";
        try {
            this.A01.Bef(i);
            AnonymousClass6SR r0 = this.A00;
            Object obj = r0.A0A.get();
            if (obj != null) {
                AnonymousClass6S1 r15 = (AnonymousClass6S1) obj;
                int i2 = r15.A00;
                switch (i) {
                    case 1:
                        r12 = this.A02;
                        str2 = AnonymousClass6SR.A00("initial_render_start", i2);
                        break;
                    case 2:
                        r12 = this.A02;
                        str2 = AnonymousClass6SR.A00("initial_render_end", i2);
                        break;
                    case 3:
                        C161027m0 r3 = this.A02;
                        r3.BPK(AnonymousClass6SR.A00("initial_render_data_end", i2));
                        if (r0.A00 == null) {
                            r3.B2A(0, "bloks_query", true, r0.A07.now());
                        }
                        C139046j9 r2 = r0.A05;
                        if (r2.A04 == null || r2.A0A) {
                            r3.Bv4("initial_content_step");
                            return;
                        }
                        return;
                    case 5:
                        C115145iP r13 = (C115145iP) r0.A0B.get();
                        if (r13 instanceof C100574vF) {
                            str3 = ((C100574vF) r13).A00.getMessage();
                        }
                        this.A02.B79(str3);
                        return;
                    case 6:
                        r12 = this.A02;
                        str2 = AnonymousClass6SR.A00("render_start", i2);
                        break;
                    case 7:
                        r12 = this.A02;
                        str2 = AnonymousClass6SR.A00("render_end", i2);
                        break;
                    case 9:
                        C161027m0 r32 = this.A02;
                        r32.BPK(AnonymousClass6SR.A00("render_data_end", i2));
                        AnonymousClass6SR.A01(r0, r32, r15);
                        return;
                    case 11:
                        r12 = this.A02;
                        str2 = AnonymousClass6SR.A00("render_load_action_start", i2);
                        break;
                    case 12:
                        r12 = this.A02;
                        str2 = AnonymousClass6SR.A00("stream_on_load_actions_start", i2);
                        break;
                    case 13:
                        r12 = this.A02;
                        str2 = AnonymousClass6SR.A00("stream_on_load_actions_end", i2);
                        break;
                    default:
                        return;
                }
                r12.BPK(str2);
                return;
            }
            throw AnonymousClass001.A08("Fetch summary is missing.");
        } catch (Throwable th) {
            AnonymousClass6SR r22 = this.A00;
            Object obj2 = r22.A0A.get();
            if (obj2 != null) {
                AnonymousClass6S1 r152 = (AnonymousClass6S1) obj2;
                int i3 = r152.A00;
                switch (i) {
                    case 1:
                        r1 = this.A02;
                        str = AnonymousClass6SR.A00("initial_render_start", i3);
                        break;
                    case 2:
                        r1 = this.A02;
                        str = AnonymousClass6SR.A00("initial_render_end", i3);
                        break;
                    case 3:
                        C161027m0 r33 = this.A02;
                        r33.BPK(AnonymousClass6SR.A00("initial_render_data_end", i3));
                        if (r22.A00 == null) {
                            r33.B2A(0, "bloks_query", true, r22.A07.now());
                        }
                        C139046j9 r23 = r22.A05;
                        if (r23.A04 == null || r23.A0A) {
                            r33.Bv4("initial_content_step");
                            throw th;
                        }
                        throw th;
                    case 5:
                        C115145iP r14 = (C115145iP) r22.A0B.get();
                        if (r14 instanceof C100574vF) {
                            str3 = ((C100574vF) r14).A00.getMessage();
                        }
                        this.A02.B79(str3);
                        throw th;
                    case 6:
                        r1 = this.A02;
                        str = AnonymousClass6SR.A00("render_start", i3);
                        break;
                    case 7:
                        r1 = this.A02;
                        str = AnonymousClass6SR.A00("render_end", i3);
                        break;
                    case 9:
                        C161027m0 r16 = this.A02;
                        r16.BPK(AnonymousClass6SR.A00("render_data_end", i3));
                        AnonymousClass6SR.A01(r22, r16, r152);
                        throw th;
                    case 11:
                        r1 = this.A02;
                        str = AnonymousClass6SR.A00("render_load_action_start", i3);
                        break;
                    case 12:
                        r1 = this.A02;
                        str = AnonymousClass6SR.A00("stream_on_load_actions_start", i3);
                        break;
                    case 13:
                        r1 = this.A02;
                        str = AnonymousClass6SR.A00("stream_on_load_actions_end", i3);
                        break;
                    default:
                        throw th;
                }
                r1.BPK(str);
                throw th;
            }
            throw AnonymousClass001.A08("Fetch summary is missing.");
        }
    }
}
