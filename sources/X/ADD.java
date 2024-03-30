package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;

public final class ADD implements NewsletterMetadataFields.ThreadMetadata.Name {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name A00;

    public String BIF() {
        return this.A00.A07("text");
    }

    public String getId() {
        return C36411kG.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00.A00);
    }

    public ADD(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name name) {
        this.A00 = name;
    }
}
