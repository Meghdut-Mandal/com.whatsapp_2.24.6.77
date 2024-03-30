package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;

public final class ADC implements NewsletterMetadataFields.ThreadMetadata.Description {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description A00;

    public String BIF() {
        return this.A00.A07("text");
    }

    public String getId() {
        return C36411kG.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00.A00);
    }

    public ADC(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description description) {
        this.A00 = description;
    }
}
