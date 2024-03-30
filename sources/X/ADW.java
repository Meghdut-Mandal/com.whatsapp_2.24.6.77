package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;

public final class ADW implements NewsletterMetadataFields {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BIH() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata threadMetadata = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata) this.A00.A03(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new ADR(threadMetadata);
        }
        return null;
    }

    public ADW(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate xwa2NotifyNewsletterOwnerOnMetadataUpdate) {
        this.A00 = xwa2NotifyNewsletterOwnerOnMetadataUpdate;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BHu() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata BJA() {
        return null;
    }
}
