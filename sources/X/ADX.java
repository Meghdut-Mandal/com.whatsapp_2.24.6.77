package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;

public final class ADX implements NewsletterMetadataFields {
    public final NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BHu() {
        NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State state = (NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State) this.A00.A03(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State.class, "state");
        if (state != null) {
            return new AD9(state);
        }
        return null;
    }

    public ADX(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange xwa2NotifyNewsletterOnStateChange) {
        this.A00 = xwa2NotifyNewsletterOnStateChange;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BIH() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata BJA() {
        return null;
    }
}
