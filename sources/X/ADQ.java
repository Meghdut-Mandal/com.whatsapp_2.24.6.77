package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;

public final class ADQ implements NewsletterMetadataFields.ThreadMetadata {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata A00;

    public NewsletterMetadataFields.ThreadMetadata.Settings BHP() {
        return null;
    }

    public String BAQ() {
        return this.A00.A07("creation_time");
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Description BB0() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description description = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description) this.A00.A03(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description.class, "description");
        if (description != null) {
            return new ADA(description);
        }
        return null;
    }

    public String BCD() {
        return this.A00.A07("handle");
    }

    public String BCr() {
        return this.A00.A07("invite");
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Name BEQ() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name name = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name) this.A00.A03(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (name != null) {
            return new ADD(name);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Picture BFu() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image image = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image) this.A00.A03(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image.class, "image");
        if (image != null) {
            return new ADG(image);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Preview BG9() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview preview = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview) this.A00.A03(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview.class, "preview");
        if (preview != null) {
            return new ADJ(preview);
        }
        return null;
    }

    public String BI0() {
        return this.A00.A07("subscribers_count");
    }

    public GraphQLXWA2NewsletterVerifyState BIy() {
        return (GraphQLXWA2NewsletterVerifyState) this.A00.A06(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
    }

    public GraphQLXWA2NewsletterVerifySource BIz() {
        return (GraphQLXWA2NewsletterVerifySource) this.A00.A06(GraphQLXWA2NewsletterVerifySource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification_source");
    }

    public ADQ(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata threadMetadata) {
        this.A00 = threadMetadata;
    }
}
