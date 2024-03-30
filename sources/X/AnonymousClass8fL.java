package X;

import android.content.Context;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterMetadataInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterReactionCodesInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSettingsInput;
import com.whatsapp.util.Log;

/* renamed from: X.8fL  reason: invalid class name */
public final class AnonymousClass8fL extends C22726Aue {
    public transient AnonymousClass16D A00;
    public transient AnonymousClass16K A01;
    public transient C26141Ja A02;
    public transient C30131Zi A03;
    public transient AnonymousClass1ZL A04;
    public transient C220412q A05;
    public transient C27591Ow A06;
    public AnonymousClass4TM callback;
    public final String description;
    public final String name;
    public final C28981Uw newsletterJid;
    public final C52392pM newsletterReactionSettings;
    public final byte[] picture;
    public final boolean updateDescription;
    public final boolean updateName;
    public final boolean updatePicture;
    public final boolean updateReactionSetting;

    public boolean A0D(Exception exc) {
        return false;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public AnonymousClass8fL(C52392pM r2, C28981Uw r3, AnonymousClass4TM r4, String str, String str2, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r3;
        this.name = str;
        this.description = str2;
        this.picture = bArr;
        this.newsletterReactionSettings = r2;
        this.updateName = z;
        this.updateDescription = z2;
        this.updatePicture = z3;
        this.updateReactionSetting = z4;
        this.callback = r4;
    }

    public void A09() {
        AnonymousClass4TM r1;
        Log.i("UpdateNewsletterGraphqlJob/onAdded");
        C27591Ow r0 = this.A06;
        if (r0 == null) {
            throw C36331k8.A0d("mexGraphqlClient");
        } else if (!r0.A03.A0I() && (r1 = this.callback) != null) {
            r1.onError(new C178228fO());
        }
    }

    public void A0A() {
        if (!this.isCancelled) {
            Log.i("UpdateNewsletterGraphqlJob/onCanceled");
        }
    }

    public void A0B() {
        C52392pM r1;
        String str;
        if (!this.isCancelled) {
            Log.i("UpdateNewsletterGraphqlJob/onRun");
            XWA2NewsletterMetadataInput xWA2NewsletterMetadataInput = new XWA2NewsletterMetadataInput();
            if (this.updateDescription) {
                String str2 = this.description;
                if (str2 == null || str2.length() == 0) {
                    str2 = "";
                }
                xWA2NewsletterMetadataInput.A07("description", str2);
            }
            String str3 = null;
            if (this.updateName) {
                String str4 = this.name;
                if (!(str4 == null || str4.length() == 0)) {
                    str3 = str4;
                }
                xWA2NewsletterMetadataInput.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
            }
            if (this.updatePicture) {
                byte[] bArr = this.picture;
                if (bArr == null || bArr.length == 0) {
                    xWA2NewsletterMetadataInput.A07("picture", "");
                } else {
                    xWA2NewsletterMetadataInput.A07("picture", Base64.encodeToString(bArr, 0));
                }
            }
            if (this.updateReactionSetting && (r1 = this.newsletterReactionSettings) != null) {
                XWA2NewsletterReactionCodesInput xWA2NewsletterReactionCodesInput = new XWA2NewsletterReactionCodesInput();
                if (this.A04 == null) {
                    throw C36331k8.A0d("newsletterGraphqlUtil");
                }
                int ordinal = r1.ordinal();
                if (ordinal == 1) {
                    str = "ALL";
                } else if (ordinal == 0) {
                    str = "BASIC";
                } else if (ordinal == 2) {
                    str = "NONE";
                } else if (ordinal == 3) {
                    str = "BLOCKLIST";
                } else {
                    throw C36441kJ.A18();
                }
                xWA2NewsletterReactionCodesInput.A07("value", str);
                XWA2NewsletterSettingsInput xWA2NewsletterSettingsInput = new XWA2NewsletterSettingsInput();
                xWA2NewsletterSettingsInput.A05(xWA2NewsletterReactionCodesInput, "reaction_codes");
                xWA2NewsletterMetadataInput.A05(xWA2NewsletterSettingsInput, "settings");
            }
            NewsletterMetadataUpdateMutationImpl$Builder newsletterMetadataUpdateMutationImpl$Builder = new NewsletterMetadataUpdateMutationImpl$Builder();
            String rawString = this.newsletterJid.getRawString();
            AnonymousClass9VA r3 = newsletterMetadataUpdateMutationImpl$Builder.A00;
            newsletterMetadataUpdateMutationImpl$Builder.A01 = C36341k9.A1Y(r3, "newsletter_id", rawString);
            r3.A00(xWA2NewsletterMetadataInput, "updates");
            newsletterMetadataUpdateMutationImpl$Builder.A02 = true;
            r3.A01("fetch_state", true);
            C20740y5.A06(newsletterMetadataUpdateMutationImpl$Builder.A01);
            C20740y5.A06(newsletterMetadataUpdateMutationImpl$Builder.A02);
            AnonymousClass9JF r12 = new AnonymousClass9JF(r3, NewsletterMetadataUpdateResponseImpl.class, "NewsletterMetadataUpdate");
            C27591Ow r0 = this.A06;
            if (r0 == null) {
                throw C36331k8.A0d("mexGraphqlClient");
            }
            r0.A01(r12).A02(new C22425AmQ(this));
        }
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A05 = C36351kA.A0a(A0P);
        this.A00 = C36341k9.A0R(A0P);
        this.A02 = (C26141Ja) A0P.A5m.get();
        this.A06 = C36391kE.A0g(A0P);
        this.A03 = C36431kI.A0m(A0P);
        this.A01 = (AnonymousClass16K) A0P.A2C.get();
        this.A04 = A0P.Azc();
    }
}
