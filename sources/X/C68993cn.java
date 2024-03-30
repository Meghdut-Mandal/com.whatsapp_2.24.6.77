package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSimilarQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSimilarResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribedResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterCreateVerifiedInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSimilarInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterUpdateVerificationInput;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3cn  reason: invalid class name and case insensitive filesystem */
public abstract class C68993cn implements AnonymousClass4PA {
    public C177268dW A00;
    public boolean A01;
    public C19770wU A02;
    public final C27591Ow A03;
    public final AnonymousClass4OL A04;

    public boolean A03() {
        return false;
    }

    public void cancel() {
        this.A01 = true;
        C177268dW r0 = this.A00;
        if (r0 != null) {
            r0.cancel(true);
        }
    }

    public AnonymousClass9JF A00() {
        AnonymousClass9VA A0d;
        Class cls;
        String str;
        GraphQLXWA2NewsletterVerifyState graphQLXWA2NewsletterVerifyState;
        if (this instanceof AnonymousClass2YH) {
            AnonymousClass2YH r4 = (AnonymousClass2YH) this;
            if (r4.A01.ordinal() == 1) {
                graphQLXWA2NewsletterVerifyState = GraphQLXWA2NewsletterVerifyState.VERIFIED;
            } else {
                graphQLXWA2NewsletterVerifyState = GraphQLXWA2NewsletterVerifyState.UNVERIFIED;
            }
            String obj = graphQLXWA2NewsletterVerifyState.toString();
            AnonymousClass00C.A0B(obj);
            NewsletterUpdateVerificationMutationImpl$Builder newsletterUpdateVerificationMutationImpl$Builder = new NewsletterUpdateVerificationMutationImpl$Builder();
            String rawString = r4.A02.getRawString();
            A0d = newsletterUpdateVerificationMutationImpl$Builder.A00;
            newsletterUpdateVerificationMutationImpl$Builder.A01 = C36341k9.A1Y(A0d, "jid", rawString);
            XWA2NewsletterUpdateVerificationInput xWA2NewsletterUpdateVerificationInput = new XWA2NewsletterUpdateVerificationInput();
            xWA2NewsletterUpdateVerificationInput.A07("updated_verification", obj);
            A0d.A00(xWA2NewsletterUpdateVerificationInput, "update_verification_input");
            newsletterUpdateVerificationMutationImpl$Builder.A02 = true;
            C20740y5.A06(newsletterUpdateVerificationMutationImpl$Builder.A01);
            C20740y5.A06(newsletterUpdateVerificationMutationImpl$Builder.A02);
            cls = NewsletterUpdateVerificationResponseImpl.class;
            str = "NewsletterUpdateVerification";
        } else if (this instanceof AnonymousClass2YI) {
            AnonymousClass2YI r42 = (AnonymousClass2YI) this;
            List A11 = C36371kC.A11(r42.A04.A00());
            XWA2NewsletterSimilarInput xWA2NewsletterSimilarInput = new XWA2NewsletterSimilarInput();
            xWA2NewsletterSimilarInput.A07("newsletter_id", r42.A03.getRawString());
            xWA2NewsletterSimilarInput.A06("limit", Integer.valueOf(r42.A01));
            xWA2NewsletterSimilarInput.A08("country_codes", A11);
            A0d = new NewsletterSimilarQueryImpl$Builder().A00;
            A0d.A00(xWA2NewsletterSimilarInput, "input");
            cls = NewsletterSimilarResponseImpl.class;
            str = "NewsletterSimilar";
        } else if (this instanceof AnonymousClass2YE) {
            NewsletterCreateVerifiedMutationImpl$Builder newsletterCreateVerifiedMutationImpl$Builder = new NewsletterCreateVerifiedMutationImpl$Builder();
            XWA2NewsletterCreateVerifiedInput xWA2NewsletterCreateVerifiedInput = new XWA2NewsletterCreateVerifiedInput();
            xWA2NewsletterCreateVerifiedInput.A07("description", ((AnonymousClass2YE) this).A03);
            A0d = newsletterCreateVerifiedMutationImpl$Builder.A00;
            A0d.A00(xWA2NewsletterCreateVerifiedInput, "newsletter_input");
            cls = NewsletterCreateVerifiedResponseImpl.class;
            str = "NewsletterCreateVerified";
        } else if (this instanceof AnonymousClass2YG) {
            AnonymousClass2YG r3 = (AnonymousClass2YG) this;
            NewsletterAdminInviteMutationImpl$Builder newsletterAdminInviteMutationImpl$Builder = new NewsletterAdminInviteMutationImpl$Builder();
            String rawString2 = r3.A01.getRawString();
            A0d = newsletterAdminInviteMutationImpl$Builder.A00;
            newsletterAdminInviteMutationImpl$Builder.A01 = C36341k9.A1Y(A0d, "newsletter_id", rawString2);
            newsletterAdminInviteMutationImpl$Builder.A02 = C36341k9.A1Y(A0d, "user_id", r3.A03.A0E(r3.A02).getRawString());
            C20740y5.A06(newsletterAdminInviteMutationImpl$Builder.A01);
            C20740y5.A06(newsletterAdminInviteMutationImpl$Builder.A02);
            cls = NewsletterAdminInviteResponseImpl.class;
            str = "NewsletterAdminInvite";
        } else {
            A0d = C36441kJ.A0d();
            cls = NewsletterSubscribedResponseImpl.class;
            str = "NewsletterSubscribed";
        }
        return new AnonymousClass9JF(A0d, cls, str);
    }

    public void A01() {
        if (!this.A01) {
            boolean A032 = A03();
            C19770wU r3 = this.A02;
            if (A032) {
                String simpleName = getClass().getSimpleName();
                AnonymousClass00C.A08(simpleName);
                r3.Boz(new C81123wV((Object) this, 6), simpleName);
                return;
            }
            r3.Boy(new C81123wV((Object) this, 7));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02be, code lost:
        X.AnonymousClass00C.A0D(r4, 0);
        r4.A09 = X.C52382pL.GUEST;
        r9.add(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass9Y8 r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass2YH
            if (r0 == 0) goto L_0x007d
            r5 = r11
            X.2YH r5 = (X.AnonymousClass2YH) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0079
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationResponseImpl$Xwa2NewsletterUpdateVerification> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationResponseImpl.Xwa2NewsletterUpdateVerification.class
            java.lang.String r0 = "xwa2_newsletter_update_verification"
            X.9Y8 r0 = r12.A03(r1, r0)
            if (r0 == 0) goto L_0x0079
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r1.<init>(r0)
            X.3Ro r0 = X.C28981Uw.A03
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A07(r0)
            X.1Uw r4 = X.C65313Ro.A00(r0)
            X.1ZT r7 = r5.A03
            X.2p1 r2 = r5.A01
            r1 = 1
            int r0 = r2.ordinal()
            if (r0 != r1) goto L_0x007a
            X.2oe r6 = X.C51952oe.VERIFY
        L_0x0039:
            X.1Ja r8 = r7.A02
            X.12q r0 = r8.A02
            X.3Qp r3 = X.C36371kC.A0W(r0, r4)
            X.2La r3 = (X.C44072La) r3
            if (r3 == 0) goto L_0x0068
            r3.A0F = r2
            android.content.ContentValues r2 = X.C36441kJ.A0E()
            X.2p1 r0 = r3.A0F
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "verified"
            r2.put(r0, r1)
            X.2pA r0 = r3.A0C
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "verification_source"
            r2.put(r0, r1)
            X.C26141Ja.A01(r2, r3, r8)
        L_0x0068:
            X.1ZL r0 = r7.A08
            r0.A0F(r4)
            X.1ZX r0 = r7.A03
            r0.A00(r4, r6)
            X.4TM r0 = r5.A00
            if (r0 == 0) goto L_0x0079
            r0.Bbg(r4)
        L_0x0079:
            return
        L_0x007a:
            X.2oe r6 = X.C51952oe.UNVERIFY
            goto L_0x0039
        L_0x007d:
            boolean r0 = r11 instanceof X.AnonymousClass2YI
            if (r0 == 0) goto L_0x011f
            r4 = r11
            X.2YI r4 = (X.AnonymousClass2YI) r4
            r5 = 0
            X.AnonymousClass00C.A0D(r12, r5)
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0079
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSimilarResponseImpl$Xwa2NewslettersSimilar> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSimilarResponseImpl.Xwa2NewslettersSimilar.class
            java.lang.String r0 = "xwa2_newsletters_similar"
            X.9Y8 r2 = r12.A03(r1, r0)
            if (r2 == 0) goto L_0x0079
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSimilarResponseImpl$Xwa2NewslettersSimilar$Result> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSimilarResponseImpl.Xwa2NewslettersSimilar.Result.class
            java.lang.String r0 = "result"
            X.1Ak r0 = r2.A04(r1, r0)
            if (r0 == 0) goto L_0x0079
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r0.iterator()
        L_0x00a8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r3.next()
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r2 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r2.<init>(r0)
            X.3Ro r0 = X.C28981Uw.A03
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.A07(r0)
            X.1Uw r1 = X.C65313Ro.A00(r0)
            X.1ZL r0 = r4.A05
            X.2La r0 = r0.A0B(r2, r1, r5)
            r7.add(r0)
            goto L_0x00a8
        L_0x00d1:
            java.util.Iterator r3 = r7.iterator()
        L_0x00d5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r2 = r3.next()
            X.2La r2 = (X.C44072La) r2
            X.12q r1 = r4.A02
            X.1Uw r0 = r2.A0J()
            r1.A0I(r2, r0)
            goto L_0x00d5
        L_0x00eb:
            X.3N6 r6 = r4.A00
            if (r6 == 0) goto L_0x0079
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r5 = r6.A00
            java.util.ArrayList r4 = X.C36321k7.A0J(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x00f9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02e1
            java.lang.Object r2 = r3.next()
            X.2La r2 = (X.C44072La) r2
            X.16D r1 = r5.A04
            X.11F r0 = r2.A06()
            X.141 r1 = r1.A0D(r0)
            X.141 r0 = r1.A04()
            if (r0 == 0) goto L_0x0116
            r1 = r0
        L_0x0116:
            X.3JI r0 = new X.3JI
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00f9
        L_0x011f:
            boolean r0 = r11 instanceof X.AnonymousClass2YE
            if (r0 == 0) goto L_0x0166
            r5 = r11
            X.2YE r5 = (X.AnonymousClass2YE) r5
            r6 = 0
            X.AnonymousClass00C.A0D(r12, r6)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0079
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedResponseImpl$Xwa2NewsletterCreateVerified> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedResponseImpl.Xwa2NewsletterCreateVerified.class
            java.lang.String r0 = "xwa2_newsletter_create_verified"
            X.9Y8 r0 = r12.A03(r1, r0)
            if (r0 == 0) goto L_0x0079
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r4 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r4.<init>(r0)
            X.3Ro r0 = X.C28981Uw.A03
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.A07(r0)
            X.1Uw r3 = X.C65313Ro.A00(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.1ZL r1 = r5.A02
            X.2La r0 = r1.A0B(r4, r3, r6)
            r2.add(r0)
            X.1Ja r0 = r5.A01
            r0.A0A(r2)
            r1.A0G(r2)
            X.4TM r0 = r5.A00
            r0.Bbg(r3)
            return
        L_0x0166:
            boolean r0 = r11 instanceof X.AnonymousClass2YG
            if (r0 == 0) goto L_0x01eb
            r5 = r11
            X.2YG r5 = (X.AnonymousClass2YG) r5
            r6 = 0
            X.AnonymousClass00C.A0D(r12, r6)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0079
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl$Xwa2NewsletterAdminInviteCreate> r7 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl.Xwa2NewsletterAdminInviteCreate.class
            java.lang.String r4 = "xwa2_newsletter_admin_invite_create"
            X.9Y8 r2 = r12.A03(r7, r4)
            r3 = 0
            if (r2 == 0) goto L_0x0192
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl$Xwa2NewsletterAdminInviteCreate$State> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl.Xwa2NewsletterAdminInviteCreate.State.class
            java.lang.String r0 = "state"
            X.9Y8 r2 = r2.A03(r1, r0)
            if (r2 == 0) goto L_0x0192
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "type"
            java.lang.Enum r3 = r2.A06(r1, r0)
        L_0x0192:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.ACTIVE
            if (r3 == r0) goto L_0x01ae
            X.354 r2 = r5.A00
            if (r2 == 0) goto L_0x0079
            java.lang.String r1 = "Channel is not active"
            X.8fP r0 = new X.8fP
            r0.<init>(r1, r6)
        L_0x01a1:
            X.02t r4 = r2.A01
            com.whatsapp.jid.UserJid r0 = r2.A00
            X.2YQ r3 = new X.2YQ
            r3.<init>(r0)
        L_0x01aa:
            r4.invoke(r3)
            return
        L_0x01ae:
            X.9Y8 r0 = r12.A03(r7, r4)
            if (r0 == 0) goto L_0x01df
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "invite_expiration_time"
            java.lang.String r0 = r1.optString(r0)
            if (r0 == 0) goto L_0x01df
            java.lang.Long r0 = X.AnonymousClass097.A04(r0)
            if (r0 == 0) goto L_0x01df
            long r1 = r0.longValue()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L_0x01df
            X.354 r0 = r5.A00
            if (r0 == 0) goto L_0x0079
            X.02t r4 = r0.A01
            com.whatsapp.jid.UserJid r0 = r0.A00
            X.2YR r3 = new X.2YR
            r3.<init>(r0, r1)
            goto L_0x01aa
        L_0x01df:
            X.354 r2 = r5.A00
            if (r2 == 0) goto L_0x0079
            java.lang.String r1 = "Expiration timestamp is null"
            X.8fQ r0 = new X.8fQ
            r0.<init>(r1)
            goto L_0x01a1
        L_0x01eb:
            r6 = r11
            X.2YF r6 = (X.AnonymousClass2YF) r6
            r2 = 0
            X.AnonymousClass00C.A0D(r12, r2)
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0079
            X.0v0 r0 = r6.A00
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r0)
            java.lang.String r1 = "newsletter_subscriptions_fetched"
            r0 = 1
            X.C36331k8.A0w(r3, r1, r0)
            X.1Ja r8 = r6.A01
            java.util.List r10 = r8.A04()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribedResponseImpl$Xwa2NewsletterSubscribed> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribedResponseImpl.Xwa2NewsletterSubscribed.class
            java.lang.String r0 = "xwa2_newsletter_subscribed"
            X.1Ak r0 = r12.A04(r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0289
            java.util.Iterator r9 = r0.iterator()
        L_0x021b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0289
            java.lang.Object r0 = r9.next()
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r3.<init>(r0)
            X.3Ro r0 = X.C28981Uw.A03
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.A07(r0)
            X.1Uw r4 = X.C65313Ro.A00(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r3.BHu()
            if (r0 == 0) goto L_0x0287
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r0.BIc()
        L_0x0244:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.DELETED
            if (r1 != r0) goto L_0x0277
            java.util.Iterator r3 = r10.iterator()
        L_0x024c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0275
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.3Qp r0 = (X.C65073Qp) r0
            X.11F r0 = r0.A06()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 == 0) goto L_0x024c
        L_0x0263:
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x021b
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x0271
            X.2pL r0 = X.C52382pL.GUEST
            r1.A09 = r0
        L_0x0271:
            r0 = 1
            r1.A0N = r0
            goto L_0x021b
        L_0x0275:
            r1 = r5
            goto L_0x0263
        L_0x0277:
            X.1ZL r0 = r6.A03
            X.2La r1 = r0.A0B(r3, r4, r2)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0283
            r1.A0P = r2
        L_0x0283:
            r7.add(r1)
            goto L_0x021b
        L_0x0287:
            r1 = r5
            goto L_0x0244
        L_0x0289:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = r10.iterator()
        L_0x0291:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02ca
            java.lang.Object r4 = r10.next()
            X.2La r4 = (X.C44072La) r4
            java.util.Iterator r3 = r7.iterator()
        L_0x02a1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3Qp r0 = (X.C65073Qp) r0
            X.11F r1 = r0.A06()
            X.11F r0 = r4.A06()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x02a1
            if (r2 != 0) goto L_0x0291
        L_0x02be:
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.2pL r0 = X.C52382pL.GUEST
            r4.A09 = r0
            r9.add(r4)
            goto L_0x0291
        L_0x02ca:
            r7.addAll(r9)
            r8.A0A(r7)
            X.1ZL r0 = r6.A03
            r0.A0G(r7)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0079
            X.1C4 r1 = r6.A02
            java.lang.String r0 = "newsletter_metadata"
            r1.A03(r0, r5)
            return
        L_0x02e1:
            X.AnonymousClass3N6.A00(r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68993cn.A02(X.9Y8):void");
    }

    public boolean A04(C201259jD r7) {
        AnonymousClass354 r0;
        boolean z;
        AnonymousClass3N6 r1;
        C51952oe r3;
        if (this instanceof AnonymousClass2YH) {
            AnonymousClass2YH r5 = (AnonymousClass2YH) this;
            AnonymousClass00C.A0D(r7, 0);
            Log.e("NewsletterUpdateVerifiedStatusGraphqlHandler/onFailure error");
            if (!r5.A01) {
                if (r5.A01.ordinal() == 1) {
                    r3 = C51952oe.VERIFY;
                } else {
                    r3 = C51952oe.UNVERIFY;
                }
                AnonymousClass1ZT r02 = r5.A03;
                r02.A03.A01(r5.A02, r3, C1900696t.A00(r7));
                AnonymousClass4TM r12 = r5.A00;
                if (r12 != null) {
                    r12.onError(C1900696t.A00(r7));
                }
            }
            return false;
        }
        if (this instanceof AnonymousClass2YI) {
            AnonymousClass2YI r13 = (AnonymousClass2YI) this;
            z = false;
            AnonymousClass00C.A0D(r7, 0);
            if (!r13.A01 && (r1 = r13.A00) != null) {
                C1900696t.A00(r7);
                AnonymousClass3N6.A00(r1, C023409w.A00);
            }
        } else if (this instanceof AnonymousClass2YE) {
            AnonymousClass2YE r14 = (AnonymousClass2YE) this;
            z = false;
            AnonymousClass00C.A0D(r7, 0);
            Log.e("NewsletterCreateVerifiedGraphqlHandler/onFailure error");
            if (!r14.A01) {
                r14.A00.onError(C1900696t.A00(r7));
                return false;
            }
        } else if (this instanceof AnonymousClass2YG) {
            AnonymousClass2YG r15 = (AnonymousClass2YG) this;
            AnonymousClass00C.A0D(r7, 0);
            if (!r15.A01 && (r0 = r15.A00) != null) {
                C1900696t.A00(r7);
                r0.A01.invoke(new AnonymousClass2YQ(r0.A00));
            }
            return false;
        } else {
            C36321k7.A1J(r7, "GetAllSubscribedNewslettersGraphqlHandler/error ", C36401kF.A0t(r7, 0));
            return false;
        }
        return z;
    }

    public C68993cn(C27591Ow r1, AnonymousClass4OL r2, C19770wU r3) {
        this.A02 = r3;
        this.A03 = r1;
        this.A04 = r2;
    }
}
