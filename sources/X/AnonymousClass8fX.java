package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput;

/* renamed from: X.8fX  reason: invalid class name */
public final class AnonymousClass8fX extends C68993cn {
    public AnonymousClass4TM A00;
    public AnonymousClass4TM A01;
    public final C220412q A02;
    public final C26141Ja A03;
    public final C28981Uw A04;
    public final AnonymousClass1ZK A05;
    public final C30131Zi A06;
    public final C198239d8 A07;
    public final AnonymousClass1ZL A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final C220412q A0C;
    public final C26141Ja A0D;
    public final C28981Uw A0E;
    public final String A0F;
    public final boolean A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8fX(X.C220412q r24, X.C26141Ja r25, X.C27591Ow r26, X.C28981Uw r27, X.AnonymousClass4TM r28, X.AnonymousClass4OL r29, X.AnonymousClass1ZK r30, X.C30131Zi r31, X.AnonymousClass1ZL r32, X.C19770wU r33, java.lang.String r34, boolean r35, boolean r36) {
        /*
            r23 = this;
            r12 = 1
            r8 = r26
            r5 = r31
            r4 = r33
            X.C36321k7.A16(r4, r8, r5, r12)
            r0 = 5
            r7 = r29
            X.AnonymousClass00C.A0D(r7, r0)
            r3 = r24
            r2 = r25
            r6 = r30
            X.C36321k7.A13(r6, r3, r2)
            r1 = r27
            if (r27 == 0) goto L_0x0067
            java.lang.String r0 = "JID"
        L_0x001f:
            r11 = 0
            X.9d8 r10 = new X.9d8
            r14 = 1
            r15 = 1
            r16 = 1
            r17 = 1
            r18 = 1
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 1
            r13 = r36
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r23
            r9.<init>(r8, r7, r4)
            r9.A02 = r3
            r9.A03 = r2
            r9.A06 = r5
            r4 = r32
            r9.A08 = r4
            r9.A05 = r6
            r4 = r34
            r9.A0A = r4
            r9.A04 = r1
            r9.A09 = r0
            r9.A07 = r10
            r9.A0B = r13
            r5 = r28
            r9.A00 = r5
            r9.A0C = r3
            r9.A0D = r2
            r9.A0F = r4
            r9.A0E = r1
            r0 = r35
            r9.A0G = r0
            r9.A01 = r5
            return
        L_0x0067:
            java.lang.String r0 = "INVITE"
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8fX.<init>(X.12q, X.1Ja, X.1Ow, X.1Uw, X.4TM, X.4OL, X.1ZK, X.1Zi, X.1ZL, X.0wU, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r1 != 3) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.AnonymousClass9Y8 r9) {
        /*
            r8 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r9, r6)
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0061
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl$Xwa2Newsletter> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.Xwa2Newsletter.class
            java.lang.String r0 = "xwa2_newsletter"
            X.9Y8 r0 = r9.A03(r1, r0)
            if (r0 == 0) goto L_0x0061
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r4 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r4.<init>(r0)
            X.1ZL r5 = r8.A08
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r4.BHu()
            r7 = 0
            if (r0 == 0) goto L_0x00ad
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r0.BIc()
        L_0x0026:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.SUSPENDED
            if (r1 == r0) goto L_0x0062
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.DELETED
            if (r1 == r0) goto L_0x0062
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.GEOSUSPENDED
            if (r1 == r0) goto L_0x0062
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.NON_EXISTING
            if (r1 == r0) goto L_0x0062
            X.3Ro r0 = X.C28981Uw.A03
            java.lang.String r0 = X.AnonymousClass9Y8.A02(r4)
            X.1Uw r3 = X.C65313Ro.A00(r0)
            X.2La r2 = r5.A0B(r4, r3, r6)
            r0 = 1
            X.2La[] r0 = new X.C44072La[r0]
            r0[r6] = r2
            java.util.ArrayList r1 = X.AnonymousClass03T.A02(r0)
            X.1Ja r0 = r8.A03
            r0.A0A(r1)
            r5.A0G(r1)
            X.1ZK r0 = r8.A05
            r0.A00(r2)
            X.4TM r0 = r8.A00
            if (r0 == 0) goto L_0x0061
            r0.Bbg(r3)
        L_0x0061:
            return
        L_0x0062:
            X.1Uw r3 = r8.A04
            if (r3 == 0) goto L_0x007c
            X.1Ja r2 = r8.A03
            X.1Zi r0 = r8.A06
            X.9UD r1 = new X.9UD
            r1.<init>(r2, r3, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r4.BHu()
            if (r0 == 0) goto L_0x0079
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r7 = r0.BIc()
        L_0x0079:
            r1.A01(r7)
        L_0x007c:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r4.BHu()
            if (r0 == 0) goto L_0x0094
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = r0.BIc()
            if (r0 == 0) goto L_0x0094
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x00aa
            r0 = 3
            r3 = 451(0x1c3, float:6.32E-43)
            if (r1 == r0) goto L_0x0095
        L_0x0094:
            r3 = 0
        L_0x0095:
            X.4TM r2 = r8.A00
            if (r2 == 0) goto L_0x0061
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r4.BHu()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.8fP r0 = new X.8fP
            r0.<init>(r1, r3)
            r2.onError(r0)
            return
        L_0x00aa:
            r3 = 423(0x1a7, float:5.93E-43)
            goto L_0x0095
        L_0x00ad:
            r1 = r7
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8fX.A02(X.9Y8):void");
    }

    public boolean A04(C201259jD r7) {
        AnonymousClass00C.A0D(r7, 0);
        if (!this.A01) {
            C36321k7.A1K(r7, "BaseMetadataNewsletterGraphqlJob/onFailure error = ", AnonymousClass000.A0u());
            int B9n = r7.A00().B9n();
            C28981Uw r3 = this.A04;
            if (r3 != null) {
                new AnonymousClass9UD(this.A03, r3, this.A06).A00(B9n);
            }
            C165587tf.A19(r7, this.A00);
        }
        return false;
    }

    public AnonymousClass9JF A00() {
        NewsletterMetadataQueryImpl$Builder A0C2;
        XWA2NewsletterInput xWA2NewsletterInput = new XWA2NewsletterInput();
        C28981Uw r2 = this.A04;
        if (r2 == null) {
            String str = this.A0A;
            C18740tg.A06(str);
            xWA2NewsletterInput.A07("key", str);
            C26141Ja r0 = this.A03;
            AnonymousClass00C.A0B(str);
            C44072La A032 = r0.A03(str);
            if (A032 != null) {
                C54802ta.A00(A032.A09, xWA2NewsletterInput);
            }
        } else {
            xWA2NewsletterInput.A07("key", r2.getRawString());
            C44072La r22 = (C44072La) C36371kC.A0W(this.A02, r2);
            if (r22 != null) {
                C54802ta.A00(r22.A09, xWA2NewsletterInput);
            }
            if (!this.A0B) {
                A0C2 = this.A08.A0C(r22, xWA2NewsletterInput, this.A07);
                C20740y5.A06(A0C2.A01);
                AnonymousClass9JF r23 = new AnonymousClass9JF(A0C2.A00, NewsletterMetadataResponseImpl.class, "NewsletterMetadata");
                xWA2NewsletterInput.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A09);
                return r23;
            }
        }
        A0C2 = this.A08.A0D(xWA2NewsletterInput, this.A07);
        C20740y5.A06(A0C2.A01);
        AnonymousClass9JF r232 = new AnonymousClass9JF(A0C2.A00, NewsletterMetadataResponseImpl.class, "NewsletterMetadata");
        xWA2NewsletterInput.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A09);
        return r232;
    }

    public void A01() {
        C44072La A032;
        if (!this.A01) {
            if (this.A0G) {
                C28981Uw r1 = this.A0E;
                if (r1 != null) {
                    A032 = (C44072La) C36371kC.A0W(this.A0C, r1);
                } else {
                    C26141Ja r12 = this.A0D;
                    String str = this.A0F;
                    if (str == null) {
                        str = "";
                    }
                    A032 = r12.A03(str);
                }
                if (A032 != null) {
                    AnonymousClass4TM r13 = this.A01;
                    if (r13 != null) {
                        r13.Bbg(A032.A0J());
                    }
                    A032.A0J().getRawString();
                    return;
                }
            }
            super.A01();
        }
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
        this.A01 = null;
    }
}
