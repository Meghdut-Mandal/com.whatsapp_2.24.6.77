package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

public final class ADJ implements NewsletterMetadataFields.ThreadMetadata.Preview {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview A00;

    public String BB9() {
        return this.A00.A07("direct_path");
    }

    public GraphQLXWA2PictureType BId() {
        return AnonymousClass9Y8.A01(this.A00);
    }

    public String getId() {
        return AnonymousClass9Y8.A02(this.A00);
    }

    public ADJ(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview preview) {
        this.A00 = preview;
    }

    public /* bridge */ /* synthetic */ String BIk() {
        return null;
    }
}
