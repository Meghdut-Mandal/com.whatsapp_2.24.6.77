package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;

public final class ADU implements NewsletterMetadataFields {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BHu() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State state = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State) this.A00.A03(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State.class, "state");
        if (state != null) {
            return new AD8(state);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BIH() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata threadMetadata = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata) this.A00.A03(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new ADQ(threadMetadata);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata BJA() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata viewerMetadata = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata) this.A00.A03(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata.class, "viewer_metadata");
        if (viewerMetadata != null) {
            return new ADT(viewerMetadata);
        }
        return null;
    }

    public ADU(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin xwa2NotifyNewsletterOnJoin) {
        this.A00 = xwa2NotifyNewsletterOnJoin;
    }
}
