package X;

/* renamed from: X.1UZ  reason: invalid class name */
public class AnonymousClass1UZ implements AnonymousClass0z8 {
    public long A00 = -1;
    public int A01 = -1;
    public final AnonymousClass1UP A02;
    public final C28781Ua A03;
    public final C19420v0 A04;
    public final C20810yC A05;
    public final C19770wU A06;

    public AnonymousClass1UZ(C19420v0 r3, C20810yC r4, AnonymousClass1UP r5, C19770wU r6, C28781Ua r7) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r3, 5);
        this.A02 = r5;
        this.A03 = r7;
        this.A06 = r6;
        this.A05 = r4;
        this.A04 = r3;
    }

    public void A02(Object obj, String str) {
        AnonymousClass1UP r3;
        long j;
        String obj2;
        AnonymousClass00C.A0D(obj, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/annotateUserFlow: marker=");
        sb.append(AnonymousClass1EG.A00(this.A01));
        sb.append(", key=");
        String str2 = str;
        sb.append(str);
        sb.append(", value=");
        sb.append(obj);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (!this.A03.A00()) {
            return;
        }
        if (obj instanceof Long) {
            this.A02.flowAnnotate(this.A00, str2, ((Number) obj).longValue());
        } else if (obj instanceof Double) {
            this.A02.flowAnnotate(this.A00, str2, ((Number) obj).doubleValue());
        } else if (obj instanceof Integer) {
            this.A02.flowAnnotate(this.A00, str, ((Number) obj).intValue());
        } else {
            if (obj instanceof String) {
                r3 = this.A02;
                j = this.A00;
                obj2 = (String) obj;
            } else {
                boolean z = obj instanceof Boolean;
                r3 = this.A02;
                j = this.A00;
                if (z) {
                    r3.flowAnnotate(j, str, ((Boolean) obj).booleanValue());
                    return;
                }
                obj2 = obj.toString();
            }
            r3.flowAnnotate(j, str, obj2);
        }
    }

    public void A05(String str, String str2) {
        AnonymousClass00C.A0D(str2, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/failUserFlowWithPoint: marker=");
        sb.append(AnonymousClass1EG.A00(this.A01));
        sb.append(", point=");
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (this.A03.A00()) {
            this.A02.flowEndFail(this.A00, str, str2);
            A00();
        }
    }

    public void BRC() {
    }

    private final void A00() {
        if (this.A03.A00()) {
            this.A00 = -1;
            this.A01 = -1;
        }
    }

    public void A01() {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/logFlowSuccess: marker=");
        sb.append(AnonymousClass1EG.A00(this.A01));
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (this.A03.A00()) {
            this.A02.flowEndSuccess(this.A00);
            A00();
        }
    }

    public void A03(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/cancelUserFlowWithPoint: marker=");
        sb.append(AnonymousClass1EG.A00(this.A01));
        sb.append(", point=");
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (this.A03.A00()) {
            A04(str);
            this.A02.flowCancelAtPoint(this.A00, str, "user_cancelled");
            A00();
        }
    }

    public void A04(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/logPoint: marker=");
        sb.append(AnonymousClass1EG.A00(this.A01));
        sb.append(", point=");
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (this.A03.A00()) {
            this.A02.flowMarkPoint(this.A00, str);
        }
    }

    public void A06(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLoggerImpl/startUserFlowWithPoint: marker=");
        sb.append(AnonymousClass1EG.A00(i));
        sb.append(", point=");
        sb.append(str2);
        AnonymousClass00C.A0D(sb.toString(), 0);
        C28781Ua r1 = this.A03;
        if (r1.A00()) {
            if (r1.A00()) {
                long j = this.A00;
                if (j != -1) {
                    AnonymousClass1UP r5 = this.A02;
                    r5.flowMarkPoint(j, "FLOW_START_BEFORE_PREVIOUS_ENDED");
                    r5.flowEndFail(this.A00, "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
                }
            }
            AnonymousClass1UP r52 = this.A02;
            long j2 = ((long) i) | (((long) 0) << 32);
            this.A00 = j2;
            this.A01 = i;
            r52.B7S(new AnonymousClass66V(str, false), j2);
            r52.flowMarkPoint(this.A00, str2);
            if (C20800yB.A01(C21000yV.A02, this.A05, 6084)) {
                String A0b = this.A04.A0b();
                AnonymousClass00C.A08(A0b);
                A02(A0b, "encrypted_rid");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Current flow is:");
            sb2.append(this.A00);
            sb2.append(", ");
            sb2.append(this);
            AnonymousClass00C.A0D(sb2.toString(), 0);
        }
    }

    public void onAppBackgrounded() {
        this.A06.Boz(new C35751jC(this, 20), "xfam_flow_on_app_bg");
    }
}
