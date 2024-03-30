package com.whatsapp.infra.graphql.generated.newsletter;

import X.AnonymousClass9Y8;
import X.C23931Ak;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;
import org.json.JSONObject;

public final class NewsletterMetadataFieldsImpl extends AnonymousClass9Y8 implements NewsletterMetadataFields {

    public final class State extends AnonymousClass9Y8 implements NewsletterMetadataFields.State {
        public GraphQLXWA2NewsletterStateType BIc() {
            return (GraphQLXWA2NewsletterStateType) A06(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        public State(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public final class ThreadMetadata extends AnonymousClass9Y8 implements NewsletterMetadataFields.ThreadMetadata {

        public final class Description extends AnonymousClass9Y8 implements NewsletterMetadataFields.ThreadMetadata.Description {
            public String BIF() {
                return A07("text");
            }

            public String getId() {
                return this.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Description(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Name extends AnonymousClass9Y8 implements NewsletterMetadataFields.ThreadMetadata.Name {
            public String BIF() {
                return A07("text");
            }

            public String getId() {
                return this.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Name(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Picture extends AnonymousClass9Y8 implements NewsletterMetadataFields.ThreadMetadata.Picture {
            public String BB9() {
                return A07("direct_path");
            }

            public String BIk() {
                return A07("url");
            }

            public GraphQLXWA2PictureType BId() {
                return AnonymousClass9Y8.A01(this);
            }

            public String getId() {
                return AnonymousClass9Y8.A02(this);
            }

            public Picture(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Preview extends AnonymousClass9Y8 implements NewsletterMetadataFields.ThreadMetadata.Preview {
            public String BB9() {
                return A07("direct_path");
            }

            public String BIk() {
                return A07("url");
            }

            public GraphQLXWA2PictureType BId() {
                return AnonymousClass9Y8.A01(this);
            }

            public String getId() {
                return AnonymousClass9Y8.A02(this);
            }

            public Preview(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Settings extends AnonymousClass9Y8 implements NewsletterMetadataFields.ThreadMetadata.Settings {

            public final class ReactionCodes extends AnonymousClass9Y8 implements NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes {
                public C23931Ak B8q() {
                    return A05("blocked_codes");
                }

                public String BBV() {
                    return A07("enabled_ts_sec");
                }

                public GraphQLXWA2NewsletterReactionCodesSettingValue BIn() {
                    return (GraphQLXWA2NewsletterReactionCodesSettingValue) A06(GraphQLXWA2NewsletterReactionCodesSettingValue.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "value");
                }

                public ReactionCodes(JSONObject jSONObject) {
                    super(jSONObject);
                }
            }

            public NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes BGS() {
                return (NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes) A03(ReactionCodes.class, "reaction_codes");
            }

            public Settings(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public String BAQ() {
            return A07("creation_time");
        }

        public NewsletterMetadataFields.ThreadMetadata.Description BB0() {
            return (NewsletterMetadataFields.ThreadMetadata.Description) A03(Description.class, "description");
        }

        public String BCD() {
            return A07("handle");
        }

        public String BCr() {
            return A07("invite");
        }

        public NewsletterMetadataFields.ThreadMetadata.Name BEQ() {
            return (NewsletterMetadataFields.ThreadMetadata.Name) A03(Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }

        public NewsletterMetadataFields.ThreadMetadata.Picture BFu() {
            return (NewsletterMetadataFields.ThreadMetadata.Picture) A03(Picture.class, "picture");
        }

        public NewsletterMetadataFields.ThreadMetadata.Preview BG9() {
            return (NewsletterMetadataFields.ThreadMetadata.Preview) A03(Preview.class, "preview");
        }

        public NewsletterMetadataFields.ThreadMetadata.Settings BHP() {
            return (NewsletterMetadataFields.ThreadMetadata.Settings) A03(Settings.class, "settings");
        }

        public String BI0() {
            return A07("subscribers_count");
        }

        public GraphQLXWA2NewsletterVerifyState BIy() {
            return (GraphQLXWA2NewsletterVerifyState) A06(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
        }

        public GraphQLXWA2NewsletterVerifySource BIz() {
            return (GraphQLXWA2NewsletterVerifySource) A06(GraphQLXWA2NewsletterVerifySource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification_source");
        }

        public ThreadMetadata(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public final class ViewerMetadata extends AnonymousClass9Y8 implements NewsletterMetadataFields.ViewerMetadata {
        public GraphQLXWA2NewsletterMuteSetting BEO() {
            return (GraphQLXWA2NewsletterMuteSetting) A06(GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "mute");
        }

        public GraphQLXWA2NewsletterRole BGr() {
            return (GraphQLXWA2NewsletterRole) A06(GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
        }

        public ViewerMetadata(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public NewsletterMetadataFields.State BHu() {
        return (NewsletterMetadataFields.State) A03(State.class, "state");
    }

    public NewsletterMetadataFields.ThreadMetadata BIH() {
        return (NewsletterMetadataFields.ThreadMetadata) A03(ThreadMetadata.class, "thread_metadata");
    }

    public NewsletterMetadataFields.ViewerMetadata BJA() {
        return (NewsletterMetadataFields.ViewerMetadata) A03(ViewerMetadata.class, "viewer_metadata");
    }

    public NewsletterMetadataFieldsImpl(JSONObject jSONObject) {
        super(jSONObject);
    }
}
