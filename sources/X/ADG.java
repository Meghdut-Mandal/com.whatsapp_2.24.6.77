package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

public final class ADG implements NewsletterMetadataFields.ThreadMetadata.Picture {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image A00;

    public String BB9() {
        return this.A00.A07("direct_path");
    }

    public GraphQLXWA2PictureType BId() {
        return AnonymousClass9Y8.A01(this.A00);
    }

    public String getId() {
        return AnonymousClass9Y8.A02(this.A00);
    }

    public ADG(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image image) {
        this.A00 = image;
    }

    public /* bridge */ /* synthetic */ String BIk() {
        return null;
    }
}
