package X;

/* renamed from: X.2D0  reason: invalid class name */
public class AnonymousClass2D0 extends C142266ob {
    public final AnonymousClass1KH A00;

    public AnonymousClass2D0(AnonymousClass1KH r7) {
        super("wa.action.bonsai.AcceptDisclaimerV2", "wa.action.bonsai.GetChatJid", "wa.action.bonsai.GetMsgKeyId", "wa.action.bonsai.SubmitFeedback", "wa.action.bot.CloseDisclaimer", "wa.action.bonsai.SubmitNegativeFeedbackMultiple");
        this.A00 = r7;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018f, code lost:
        if (r4.equals("wa.action.bonsai.GetMsgKeyId") == false) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B6u(X.AnonymousClass6MO r17, X.C115215iW r18, X.C124125xd r19) {
        /*
            r16 = this;
            r1 = r19
            X.4vP r1 = (X.C100674vP) r1
            r0 = r18
            java.lang.String r4 = r0.A00
            int r0 = r4.hashCode()
            r3 = -1
            r2 = r16
            switch(r0) {
                case -1780838056: goto L_0x0173;
                case 621219906: goto L_0x017e;
                case 649612623: goto L_0x0189;
                case 1175015327: goto L_0x0193;
                case 1185711293: goto L_0x019e;
                case 1910438231: goto L_0x01a9;
                default: goto L_0x0012;
            }
        L_0x0012:
            r7 = 0
            r4 = r17
            switch(r3) {
                case 0: goto L_0x0019;
                case 1: goto L_0x007a;
                case 2: goto L_0x01c9;
                case 3: goto L_0x0117;
                case 4: goto L_0x01d9;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r7
        L_0x0019:
            r0 = 0
            java.util.List r3 = r4.A00
            int r4 = X.C36351kA.A06(r3, r0)
            r0 = 1
            java.lang.Object r0 = r3.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.1KH r5 = r2.A00
            android.app.Activity r6 = X.C142326oh.A01(r1)
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r4 == r0) goto L_0x004d
            r0 = 3
            if (r4 == r0) goto L_0x004d
            r0 = 4
            if (r4 != r0) goto L_0x0041
            X.1Ha r1 = r5.A04
            X.2nm r0 = X.C51412nm.META_AI_SHORTCUT
            r1.A01(r0)
        L_0x0041:
            if (r6 == 0) goto L_0x0018
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0018
            r6.finish()
            return r7
        L_0x004d:
            if (r1 != 0) goto L_0x0041
            X.1Es r2 = r5.A0A
            java.lang.String r1 = r2.A01()
            java.lang.String r0 = "yes"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0041
            X.1Em r0 = r2.A02
            X.00T r0 = r0.A04
            java.lang.Object r2 = r0.getValue()
            X.3Ke r2 = (X.C63473Ke) r2
            java.lang.String r1 = "no"
            r0 = 0
            r2.A03(r1, r0)
            r3 = 2
            if (r4 != r3) goto L_0x0071
            r3 = 1
        L_0x0071:
            X.1KI r2 = r5.A09
            r1 = 6
            java.lang.Integer r0 = r2.A00
            r2.A00(r0, r1, r3)
            goto L_0x0041
        L_0x007a:
            r0 = 0
            java.util.List r4 = r4.A00
            java.lang.String r1 = X.C36401kF.A0s(r4, r0)
            r0 = 1
            java.lang.Object r3 = r4.get(r0)
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            r0 = 2
            java.lang.String r12 = X.C36401kF.A0s(r4, r0)
            r0 = 3
            java.lang.String r13 = X.C36401kF.A0s(r4, r0)
            X.1KH r10 = r2.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r15 = 1
            X.C36321k7.A0v(r3, r15, r12)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            X.11F r9 = X.C36421kH.A0N(r1)
            if (r9 == 0) goto L_0x0018
            X.1KG r0 = r10.A02
            java.lang.String r1 = "origination_flag"
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x00b3
            r0 = 0
        L_0x00b3:
            int r14 = X.C36381kD.A07(r0)
            X.0yC r1 = r10.A06
            r0 = 6527(0x197f, float:9.146E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0018
            java.util.Iterator r2 = r3.iterator()
        L_0x00c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L_0x00c5
            int r1 = X.AnonymousClass000.A0I(r1)
            if (r1 == r15) goto L_0x0114
            r0 = 2
            if (r1 == r0) goto L_0x0111
            r0 = 4
            if (r1 == r0) goto L_0x010e
            r0 = 8
            if (r1 == r0) goto L_0x010b
            r0 = 16
            if (r1 == r0) goto L_0x0108
            r0 = 32
            if (r1 == r0) goto L_0x0105
            r0 = 64
            if (r1 == r0) goto L_0x0102
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x00ff
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto L_0x00fc
            r0 = 0
        L_0x00f8:
            r11.add(r0)
            goto L_0x00c5
        L_0x00fc:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_NOT_RELEVANT_TO_TEXT
            goto L_0x00f8
        L_0x00ff:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_NOT_VISUALLY_APPEALING
            goto L_0x00f8
        L_0x0102:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_REFUSED
            goto L_0x00f8
        L_0x0105:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_OTHER
            goto L_0x00f8
        L_0x0108:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_SAFE
            goto L_0x00f8
        L_0x010b:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_ACCURATE
            goto L_0x00f8
        L_0x010e:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_INTERESTING
            goto L_0x00f8
        L_0x0111:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_HELPFUL
            goto L_0x00f8
        L_0x0114:
            X.2q7 r0 = X.C52752q7.BOT_FEEDBACK_MULTIPLE_NEGATIVE_GENERIC
            goto L_0x00f8
        L_0x0117:
            r0 = 0
            java.util.List r4 = r4.A00
            java.lang.Object r3 = r4.get(r0)
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            java.lang.Object r0 = r4.get(r0)
            if (r3 == 0) goto L_0x0018
            if (r0 == 0) goto L_0x0018
            X.6JJ r0 = (X.AnonymousClass6JJ) r0
            X.7ku r0 = r0.A00
            X.33w r5 = new X.33w
            r5.<init>()
            r5.A00 = r1
            r5.A01 = r0
            X.1KH r4 = r2.A00
            int r1 = r3.intValue()
            r3 = 1
            if (r1 == 0) goto L_0x014b
            if (r1 == r3) goto L_0x014b
            r2 = 2
            if (r1 == r2) goto L_0x0200
            r0 = 3
            if (r1 == r0) goto L_0x0208
            r0 = 4
            if (r1 == r0) goto L_0x014b
            return r7
        L_0x014b:
            X.1Ha r3 = r4.A04
            X.3dl r2 = new X.3dl
            r2.<init>(r5, r4, r1)
            if (r1 == 0) goto L_0x016f
            r0 = 1
            if (r1 == r0) goto L_0x016b
            r0 = 4
            if (r1 != r0) goto L_0x0018
            r0 = 20240216(0x134d758, double:9.9999954E-317)
        L_0x015d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L_0x0018
            long r0 = r0.longValue()
            X.C25621Ha.A00(r2, r3, r0)
            return r7
        L_0x016b:
            r0 = 20230901(0x134b2f5, double:9.995393E-317)
            goto L_0x015d
        L_0x016f:
            r0 = 20230902(0x134b2f6, double:9.9953937E-317)
            goto L_0x015d
        L_0x0173:
            java.lang.String r0 = "wa.action.bot.CloseDisclaimer"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            r3 = 0
            goto L_0x0012
        L_0x017e:
            java.lang.String r0 = "wa.action.bonsai.SubmitNegativeFeedbackMultiple"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            r3 = 1
            goto L_0x0012
        L_0x0189:
            java.lang.String r0 = "wa.action.bonsai.GetMsgKeyId"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01c9
            goto L_0x0012
        L_0x0193:
            java.lang.String r0 = "wa.action.bonsai.AcceptDisclaimerV2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            r3 = 3
            goto L_0x0012
        L_0x019e:
            java.lang.String r0 = "wa.action.bonsai.SubmitFeedback"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            r3 = 4
            goto L_0x0012
        L_0x01a9:
            java.lang.String r0 = "wa.action.bonsai.GetChatJid"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.1KH r0 = r2.A00
            X.1KG r0 = r0.A02
            java.lang.String r1 = "chat_jid"
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x01c0
            r0 = 0
        L_0x01c0:
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x01d7
            java.lang.String r7 = r0.getRawString()
            return r7
        L_0x01c9:
            X.1KH r0 = r2.A00
            X.1KG r0 = r0.A02
            java.lang.String r1 = "message_key_id"
            java.util.HashMap r0 = r0.A00
            java.lang.Object r7 = r0.get(r1)
            if (r7 != 0) goto L_0x0018
        L_0x01d7:
            r7 = 0
            return r7
        L_0x01d9:
            r0 = 0
            java.util.List r1 = r4.A00
            java.lang.String r5 = X.C36401kF.A0s(r1, r0)
            r0 = 1
            int r4 = X.C36351kA.A06(r1, r0)
            r0 = 2
            java.lang.String r3 = X.C36401kF.A0s(r1, r0)
            r0 = 3
            java.lang.String r1 = X.C36401kF.A0s(r1, r0)
            X.1KH r0 = r2.A00
            r0.A00(r5, r3, r1, r4)
            return r7
        L_0x01f5:
            X.0wU r0 = r10.A08
            X.1iy r8 = new X.1iy
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.Boy(r8)
            return r7
        L_0x0200:
            X.1Es r0 = r4.A0A
            X.3uK r1 = new X.3uK
            r1.<init>(r5, r4, r3)
            goto L_0x020f
        L_0x0208:
            X.1Es r0 = r4.A0A
            X.3uK r1 = new X.3uK
            r1.<init>(r5, r4, r2)
        L_0x020f:
            X.1Em r0 = r0.A02
            X.1Eo r3 = r0.A00
            X.3dq r2 = new X.3dq
            r2.<init>(r1, r0)
            r0 = 20231027(0x134b373, double:9.9954554E-317)
            r3.A00(r2, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2D0.B6u(X.6MO, X.5iW, X.5xd):java.lang.Object");
    }
}
