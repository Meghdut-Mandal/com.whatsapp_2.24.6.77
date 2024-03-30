package X;

import android.content.Context;

/* renamed from: X.8oF  reason: invalid class name and case insensitive filesystem */
public final class C181918oF extends C200259gz {
    public final C195739Vt A00;
    public final C196049Xl A01;
    public final AnonymousClass1AW A02;
    public final C20810yC A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C181918oF(C20810yC r2, C207219uk r3, C195739Vt r4, C196049Xl r5, AnonymousClass9IS r6, AnonymousClass1AW r7) {
        super(r3, r6);
        AnonymousClass00C.A0D(r2, 3);
        this.A03 = r2;
        this.A02 = r7;
        this.A00 = r4;
        this.A01 = r5;
    }

    public String A0E(Context context) {
        AnonymousClass00C.A0D(context, 0);
        if (!this.A03.A0E(4668)) {
            return null;
        }
        return super.A0E(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2.A02 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A09() {
        /*
            r7 = this;
            java.lang.String r5 = ""
            java.lang.String r1 = super.A09()
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 != 0) goto L_0x0097
            java.lang.StringBuilder r4 = X.C90524aI.A0i(r1)
            X.9uk r2 = r7.A02
            int r1 = r2.A00
            r0 = 7
            if (r1 != r0) goto L_0x001c
            X.9tU r1 = r2.A02
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0093
            X.9tU r1 = r2.A02
            if (r1 == 0) goto L_0x0091
            java.util.List r0 = r1.A00
        L_0x0025:
            if (r0 == 0) goto L_0x0093
            if (r1 == 0) goto L_0x008e
            java.util.List r0 = r1.A00
        L_0x002b:
            java.util.Iterator r6 = r0.iterator()
        L_0x002f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r2 = r6.next()
            X.9uk r2 = (X.C207219uk) r2
            X.1AW r0 = r7.A02
            X.9gz r0 = r0.A00(r2)
            java.lang.String r1 = r0.A09()
            java.lang.String r0 = "\n"
            X.C200259gz.A02(r1, r0, r4)
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x002f
            X.9uX r0 = r2.A04
            if (r0 == 0) goto L_0x002f
            java.util.List r0 = r0.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x005a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            X.9tc r0 = (X.C206569tc) r0
            X.9uL r0 = r0.A01
            java.lang.String r2 = r0.A01
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x005a
            org.json.JSONObject r1 = X.C36441kJ.A1C(r2)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r0 = "display_text"
            java.lang.String r1 = r1.optString(r0, r5)     // Catch:{ JSONException -> 0x007e }
            X.AnonymousClass00C.A08(r1)     // Catch:{ JSONException -> 0x007e }
            goto L_0x0088
        L_0x007e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CarouselMessageCustomizer/getEmailExportText: Failed to create json object from button params json = "
            X.C36321k7.A1P(r0, r2, r1)
            r1 = r5
        L_0x0088:
            java.lang.String r0 = "\n "
            X.C200259gz.A02(r1, r0, r4)
            goto L_0x005a
        L_0x008e:
            X.09w r0 = X.C023409w.A00
            goto L_0x002b
        L_0x0091:
            r0 = 0
            goto L_0x0025
        L_0x0093:
            java.lang.String r1 = r4.toString()
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181918oF.A09():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.C196159Xy r13, X.AnonymousClass3T1 r14) {
        /*
            r12 = this;
            X.C36321k7.A0w(r13, r14)
            super.A0F(r13, r14)
            boolean r0 = X.C203369nr.A09(r14)
            if (r0 == 0) goto L_0x0122
            X.2bZ r14 = (X.AnonymousClass2bZ) r14
            java.util.List r6 = r14.A1X()
            X.8NL r3 = r13.A00
            X.8NN r4 = X.C170918Hz.A02(r3)
            X.8Hz r2 = r4.A00
            X.8SV r2 = (X.AnonymousClass8SV) r2
            int r1 = r2.interactiveMessageCase_
            r0 = 7
            if (r1 != r0) goto L_0x010e
            java.lang.Object r0 = r2.interactiveMessage_
            X.8Hz r0 = (X.C170918Hz) r0
        L_0x0025:
            X.8NN r5 = r0.A0q()
            if (r6 == 0) goto L_0x0112
            java.util.Iterator r11 = r6.iterator()
        L_0x002f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0112
            X.3T1 r8 = X.C36391kE.A0l(r11)
            boolean r2 = r8 instanceof X.C23043B1o
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CarouselMessageCustomizer/buildCardMessage: message type is not supported "
            java.lang.String r0 = X.AnonymousClass000.A0l(r8, r0, r1)
            X.C18740tg.A0E(r2, r0)
            X.8NL r0 = X.C170918Hz.A0D()
            X.AnonymousClass00C.A08(r0)
            X.9Si r1 = X.C1899396e.A00(r0)
            r0 = 1
            r1.A02 = r0
            X.9Xy r7 = r1.A00()
            X.1AW r1 = r12.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.InteractiveMessage"
            X.AnonymousClass00C.A0E(r8, r0)
            r0 = r8
            X.B1o r0 = (X.C23043B1o) r0
            X.9gz r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x006d
            r0.A0F(r7, r8)
        L_0x006d:
            X.8NL r0 = r7.A00
            X.8NN r10 = X.C170918Hz.A02(r0)
            X.8SN r0 = X.C170918Hz.A0G(r10)
            X.8NN r6 = r0.A0q()
            X.8ND r6 = (X.AnonymousClass8ND) r6
            boolean r0 = r8 instanceof X.C46872bo
            if (r0 == 0) goto L_0x00e5
            X.9Vt r9 = r12.A00
            X.2bt r8 = (X.C46922bt) r8
            X.8Hz r2 = r6.A00
            X.8SN r2 = (X.AnonymousClass8SN) r2
            int r1 = r2.mediaCase_
            r0 = 4
            if (r1 != r0) goto L_0x00e2
            java.lang.Object r0 = r2.media_
            X.8Hz r0 = (X.C170918Hz) r0
        L_0x0092:
            X.8NN r0 = r0.A0q()
            X.8NJ r0 = (X.AnonymousClass8NJ) r0
            X.8NJ r0 = r9.A00(r7, r0, r8)
            if (r0 == 0) goto L_0x00a5
            X.8SN r1 = X.C170918Hz.A0H(r6, r0)
            r0 = 4
        L_0x00a3:
            r1.mediaCase_ = r0
        L_0x00a5:
            r6.A0U()
        L_0x00a8:
            X.8Hz r1 = X.C90524aI.A0H(r10)
            X.8SV r1 = (X.AnonymousClass8SV) r1
            X.8Hz r0 = r6.A0R()
            X.8SN r0 = (X.AnonymousClass8SN) r0
            r0.getClass()
            r1.header_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.8Hz r6 = X.C90524aI.A0H(r5)
            X.8P4 r6 = (X.AnonymousClass8P4) r6
            X.8Hz r2 = r10.A0R()
            int r0 = X.AnonymousClass8P4.CARDS_FIELD_NUMBER
            r2.getClass()
            X.B6c r1 = r6.cards_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00dd
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r6.cards_ = r1
        L_0x00dd:
            r1.add(r2)
            goto L_0x002f
        L_0x00e2:
            X.8SF r0 = X.AnonymousClass8SF.DEFAULT_INSTANCE
            goto L_0x0092
        L_0x00e5:
            boolean r0 = r8 instanceof X.C181778o1
            if (r0 == 0) goto L_0x00a8
            X.8Hz r2 = r6.A00
            X.8SN r2 = (X.AnonymousClass8SN) r2
            int r1 = r2.mediaCase_
            r0 = 7
            if (r1 != r0) goto L_0x010b
            java.lang.Object r0 = r2.media_
            X.8Hz r0 = (X.C170918Hz) r0
        L_0x00f6:
            X.8NN r1 = r0.A0q()
            X.8NH r1 = (X.AnonymousClass8NH) r1
            X.9Xl r0 = r12.A01
            X.2bu r8 = (X.C46932bu) r8
            r0.A02(r7, r1, r8)
            if (r1 == 0) goto L_0x00a5
            X.8SN r1 = X.C170918Hz.A0H(r6, r1)
            r0 = 7
            goto L_0x00a3
        L_0x010b:
            X.8SE r0 = X.AnonymousClass8SE.DEFAULT_INSTANCE
            goto L_0x00f6
        L_0x010e:
            X.8P4 r0 = X.AnonymousClass8P4.DEFAULT_INSTANCE
            goto L_0x0025
        L_0x0112:
            X.8SV r1 = X.C200259gz.A00(r4, r5)
            r0 = 7
            r1.interactiveMessageCase_ = r0
            X.8Hz r0 = r4.A0R()
            X.8SV r0 = (X.AnonymousClass8SV) r0
            r3.A0a(r0)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181918oF.A0F(X.9Xy, X.3T1):void");
    }
}
