package X;

/* renamed from: X.3KZ  reason: invalid class name */
public final class AnonymousClass3KZ {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final C20810yC A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r7.A0E(5292) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r8 == 2) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r7.A0E(5317) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3KZ(X.C20810yC r7, int r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r6 = this;
            r2 = 1
            r6.<init>()
            r6.A0F = r7
            r6.A02 = r9
            r6.A01 = r10
            r6.A00 = r8
            r6.A03 = r11
            r6.A0E = r12
            r6.A07 = r13
            r6.A04 = r14
            r4 = 2
            r3 = 0
            if (r8 == r2) goto L_0x001b
            r5 = 0
            if (r8 != r4) goto L_0x001c
        L_0x001b:
            r5 = 1
        L_0x001c:
            r6.A05 = r5
            if (r5 == 0) goto L_0x0029
            r0 = 5317(0x14c5, float:7.451E-42)
            boolean r1 = r7.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r6.A06 = r0
            if (r5 == 0) goto L_0x0037
            r0 = 5292(0x14ac, float:7.416E-42)
            boolean r1 = r7.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r6.A08 = r0
            r0 = 6091(0x17cb, float:8.535E-42)
            boolean r0 = r7.A0E(r0)
            r6.A0D = r0
            r0 = 6089(0x17c9, float:8.533E-42)
            boolean r0 = r7.A0E(r0)
            r6.A0C = r0
            r1 = 7397(0x1ce5, float:1.0365E-41)
            int r0 = r7.A07(r1)
            boolean r0 = X.AnonymousClass000.A1S(r0, r2)
            r6.A0A = r0
            int r0 = r7.A07(r1)
            if (r0 != r4) goto L_0x005d
            r3 = 1
        L_0x005d:
            r6.A0B = r3
            r0 = 7527(0x1d67, float:1.0548E-41)
            boolean r0 = r7.A0E(r0)
            r6.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3KZ.<init>(X.0yC, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KZ) {
                AnonymousClass3KZ r5 = (AnonymousClass3KZ) obj;
                if (!(AnonymousClass00C.A0J(this.A0F, r5.A0F) && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A0E == r5.A0E && this.A07 == r5.A07 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((C36391kE.A0A(this.A0F) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + this.A00) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A0E ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PushToRecordConfig(abProps=");
        A0u.append(this.A0F);
        A0u.append(", canSendVoiceMessages=");
        A0u.append(this.A02);
        A0u.append(", canSendPushToVideoMessages=");
        A0u.append(this.A01);
        A0u.append(", conversationEntryActionButtonTapAction=");
        A0u.append(this.A00);
        A0u.append(", isCameraButtonEntryEnabled=");
        A0u.append(this.A03);
        A0u.append(", recorderModeMenuHasTitle=");
        A0u.append(this.A0E);
        A0u.append(", isConversationEntryActionButtonRecorderModeChangedTooltipEnabled=");
        A0u.append(this.A07);
        A0u.append(", isCameraButtonInstantLock=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
