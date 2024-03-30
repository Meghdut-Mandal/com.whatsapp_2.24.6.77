package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

public final class ADP implements NewsletterMetadataFields.ThreadMetadata.Settings {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes BGS() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes reactionCodes = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes) this.A00.A03(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes.class, "reaction_codes");
        if (reactionCodes != null) {
            return new ADN(reactionCodes);
        }
        return null;
    }

    public ADP(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings settings) {
        this.A00 = settings;
    }
}
