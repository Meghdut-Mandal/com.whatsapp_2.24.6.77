package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

public final class ADV implements NewsletterMetadataFields {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BIH() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata threadMetadata = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata) this.A00.A03(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new ADS(threadMetadata);
        }
        return null;
    }

    public ADV(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate xwa2NotifyNewsletterOnMetadataUpdate) {
        this.A00 = xwa2NotifyNewsletterOnMetadataUpdate;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BHu() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata BJA() {
        return null;
    }
}
