package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;

public final class ADN implements NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes A00;

    public C23931Ak B8q() {
        return this.A00.A05("blocked_codes");
    }

    public String BBV() {
        return this.A00.A07("enabled_ts_sec");
    }

    public GraphQLXWA2NewsletterReactionCodesSettingValue BIn() {
        GraphQLXWA2NewsletterReactionCodesSettingValue graphQLXWA2NewsletterReactionCodesSettingValue = (GraphQLXWA2NewsletterReactionCodesSettingValue) this.A00.A06(GraphQLXWA2NewsletterReactionCodesSettingValue.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "value");
        AnonymousClass00C.A08(graphQLXWA2NewsletterReactionCodesSettingValue);
        return graphQLXWA2NewsletterReactionCodesSettingValue;
    }

    public ADN(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes reactionCodes) {
        this.A00 = reactionCodes;
    }
}
