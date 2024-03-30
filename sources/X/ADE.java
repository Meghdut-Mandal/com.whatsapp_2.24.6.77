package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

public final class ADE implements NewsletterMetadataFields.ThreadMetadata.Name {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name A00;

    public String BIF() {
        return this.A00.A07("text");
    }

    public String getId() {
        return C36411kG.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00.A00);
    }

    public ADE(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name name) {
        this.A00 = name;
    }
}
