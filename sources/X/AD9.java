package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

public final class AD9 implements NewsletterMetadataFields.State {
    public final NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State A00;

    public GraphQLXWA2NewsletterStateType BIc() {
        return (GraphQLXWA2NewsletterStateType) this.A00.A06(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public AD9(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State state) {
        this.A00 = state;
    }
}
