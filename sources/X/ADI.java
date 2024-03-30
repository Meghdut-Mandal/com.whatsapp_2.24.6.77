package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

public final class ADI implements NewsletterMetadataFields.ThreadMetadata.Picture {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture A00;

    public String BB9() {
        return this.A00.A07("direct_path");
    }

    public GraphQLXWA2PictureType BId() {
        return AnonymousClass9Y8.A01(this.A00);
    }

    public String getId() {
        return AnonymousClass9Y8.A02(this.A00);
    }

    public ADI(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture picture) {
        this.A00 = picture;
    }

    public /* bridge */ /* synthetic */ String BIk() {
        return null;
    }
}
