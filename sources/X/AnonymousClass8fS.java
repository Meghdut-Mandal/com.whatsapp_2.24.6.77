package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterMetadataInput;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8fS  reason: invalid class name */
public final class AnonymousClass8fS extends C68993cn {
    public AnonymousClass4TM A00;
    public final C26141Ja A01;
    public final AnonymousClass1ZL A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public /* bridge */ /* synthetic */ void A02(AnonymousClass9Y8 r7) {
        AnonymousClass9Y8 A032;
        AnonymousClass00C.A0D(r7, 0);
        if (!this.A01 && (A032 = r7.A03(NewsletterCreateResponseImpl.Xwa2NewsletterCreate.class, "xwa2_newsletter_create")) != null) {
            NewsletterMetadataFieldsImpl newsletterMetadataFieldsImpl = new NewsletterMetadataFieldsImpl(A032.A00);
            C65313Ro r0 = C28981Uw.A03;
            C28981Uw A002 = C65313Ro.A00(AnonymousClass9Y8.A02(newsletterMetadataFieldsImpl));
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass1ZL r1 = this.A02;
            A0I.add(r1.A0B(newsletterMetadataFieldsImpl, A002, false));
            this.A01.A0A(A0I);
            r1.A0G(A0I);
            AnonymousClass4TM r02 = this.A00;
            if (r02 != null) {
                r02.Bbg(A002);
            }
        }
    }

    public boolean A04(C201259jD r3) {
        AnonymousClass00C.A0D(r3, 0);
        Log.e("CreateNewsletterGraphqlJob/onFailure error");
        if (!this.A01) {
            C165587tf.A19(r3, this.A00);
        }
        return false;
    }

    public AnonymousClass9JF A00() {
        XWA2NewsletterMetadataInput xWA2NewsletterMetadataInput = new XWA2NewsletterMetadataInput();
        xWA2NewsletterMetadataInput.A07("description", this.A03);
        xWA2NewsletterMetadataInput.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A04);
        byte[] bArr = this.A05;
        if (bArr != null) {
            xWA2NewsletterMetadataInput.A07("picture", Base64.encodeToString(bArr, 0));
        }
        NewsletterCreateMutationImpl$Builder newsletterCreateMutationImpl$Builder = new NewsletterCreateMutationImpl$Builder();
        AnonymousClass9VA r3 = newsletterCreateMutationImpl$Builder.A00;
        r3.A00(xWA2NewsletterMetadataInput, "newsletter_input");
        newsletterCreateMutationImpl$Builder.A01 = true;
        boolean z = false;
        if (bArr == null || bArr.length == 0) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(!z);
        r3.A01("fetch_image", valueOf);
        r3.A01("fetch_preview", valueOf);
        C20740y5.A06(newsletterCreateMutationImpl$Builder.A01);
        return new AnonymousClass9JF(r3, NewsletterCreateResponseImpl.class, "NewsletterCreate");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fS(C26141Ja r1, C27591Ow r2, AnonymousClass4TM r3, AnonymousClass4OL r4, AnonymousClass1ZL r5, C19770wU r6, String str, String str2, byte[] bArr) {
        super(r2, r4, r6);
        C36321k7.A18(r6, r2, r4, r1);
        this.A01 = r1;
        this.A02 = r5;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = bArr;
        this.A00 = r3;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
