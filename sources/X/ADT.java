package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;

public final class ADT implements NewsletterMetadataFields.ViewerMetadata {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata A00;

    public GraphQLXWA2NewsletterMuteSetting BEO() {
        return (GraphQLXWA2NewsletterMuteSetting) this.A00.A06(GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "mute");
    }

    public GraphQLXWA2NewsletterRole BGr() {
        return (GraphQLXWA2NewsletterRole) this.A00.A06(GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
    }

    public ADT(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata viewerMetadata) {
        this.A00 = viewerMetadata;
    }
}
