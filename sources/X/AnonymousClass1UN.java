package X;

/* renamed from: X.1UN  reason: invalid class name */
public abstract class AnonymousClass1UN implements AnonymousClass0z8 {
    public int A00 = -1;
    public long A01 = -1;
    public final AnonymousClass1UP A02;
    public final C19420v0 A03;
    public final C20810yC A04;

    public void A01(Object obj, String str) {
        AnonymousClass1UP r3;
        long j;
        String obj2;
        AnonymousClass00C.A0D(obj, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/annotateUserFlow: marker=");
        sb.append(AnonymousClass1EG.A00(this.A00));
        sb.append(", key=");
        String str2 = str;
        sb.append(str);
        sb.append(", value=");
        sb.append(obj);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (!A06()) {
            return;
        }
        if (obj instanceof Long) {
            this.A02.flowAnnotate(this.A01, str2, ((Number) obj).longValue());
        } else if (obj instanceof Double) {
            this.A02.flowAnnotate(this.A01, str2, ((Number) obj).doubleValue());
        } else if (obj instanceof Integer) {
            this.A02.flowAnnotate(this.A01, str, ((Number) obj).intValue());
        } else {
            if (obj instanceof String) {
                r3 = this.A02;
                j = this.A01;
                obj2 = (String) obj;
            } else {
                boolean z = obj instanceof Boolean;
                r3 = this.A02;
                j = this.A01;
                if (z) {
                    r3.flowAnnotate(j, str, ((Boolean) obj).booleanValue());
                    return;
                }
                obj2 = obj.toString();
            }
            r3.flowAnnotate(j, str, obj2);
        }
    }

    public void A05(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/startUserFlowWithPoint: marker=");
        sb.append(AnonymousClass1EG.A00(i));
        sb.append(", point=");
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (A06()) {
            if (A06()) {
                long j = this.A01;
                if (j != -1) {
                    AnonymousClass1UP r6 = this.A02;
                    r6.flowMarkPoint(j, "FLOW_START_BEFORE_PREVIOUS_ENDED");
                    r6.flowEndFail(this.A01, "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
                }
            }
            AnonymousClass1UP r62 = this.A02;
            long j2 = ((long) i) | (((long) 0) << 32);
            this.A01 = j2;
            this.A00 = i;
            r62.B7S(new AnonymousClass66V((String) null, false), j2);
            r62.flowMarkPoint(this.A01, str);
            if (C20800yB.A01(C21000yV.A02, this.A04, 6084)) {
                String A0b = this.A03.A0b();
                AnonymousClass00C.A08(A0b);
                A01(A0b, "encrypted_rid");
            }
        }
    }

    public void BRC() {
    }

    public void A00() {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/logFlowSuccess: marker=");
        sb.append(AnonymousClass1EG.A00(this.A00));
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (A06()) {
            this.A02.flowEndSuccess(this.A01);
            if (A06()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/cancelUserFlowWithPoint: marker=");
        sb.append(AnonymousClass1EG.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (A06()) {
            A04(str);
            this.A02.flowCancelAtPoint(this.A01, str, "user_cancelled");
            if (A06()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A03(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/failUserFlowWithPoint: marker=");
        sb.append(AnonymousClass1EG.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (A06()) {
            this.A02.flowEndFail(this.A01, str, (String) null);
            if (A06()) {
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public void A04(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyUserFlowLogger/logPoint: marker=");
        sb.append(AnonymousClass1EG.A00(this.A00));
        sb.append(", point=");
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (A06()) {
            this.A02.flowMarkPoint(this.A01, str);
        }
    }

    public boolean A06() {
        if (this instanceof C35001hz) {
            if (C20800yB.A01(C21000yV.A02, ((C35001hz) this).A00, 3989)) {
                return true;
            }
            return false;
        } else if (this instanceof AnonymousClass1UO) {
            return false;
        }
        return true;
    }

    public void onAppBackgrounded() {
        A04("BACKGROUND_APP");
    }

    public AnonymousClass1UN(C19420v0 r3, C20810yC r4, AnonymousClass1UP r5) {
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r3;
    }
}
