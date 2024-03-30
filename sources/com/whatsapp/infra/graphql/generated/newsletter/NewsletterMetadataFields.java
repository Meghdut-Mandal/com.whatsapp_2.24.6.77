package com.whatsapp.infra.graphql.generated.newsletter;

import X.C23931Ak;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

public interface NewsletterMetadataFields {

    public interface State {
        GraphQLXWA2NewsletterStateType BIc();
    }

    public interface ThreadMetadata {

        public interface Description {
            String BIF();

            String getId();
        }

        public interface Name {
            String BIF();

            String getId();
        }

        public interface Picture {
            String BB9();

            GraphQLXWA2PictureType BId();

            String BIk();

            String getId();
        }

        public interface Preview {
            String BB9();

            GraphQLXWA2PictureType BId();

            String BIk();

            String getId();
        }

        public interface Settings {

            public interface ReactionCodes {
                C23931Ak B8q();

                String BBV();

                GraphQLXWA2NewsletterReactionCodesSettingValue BIn();
            }

            ReactionCodes BGS();
        }

        String BAQ();

        Description BB0();

        String BCD();

        String BCr();

        Name BEQ();

        Picture BFu();

        Preview BG9();

        Settings BHP();

        String BI0();

        GraphQLXWA2NewsletterVerifyState BIy();

        GraphQLXWA2NewsletterVerifySource BIz();
    }

    public interface ViewerMetadata {
        GraphQLXWA2NewsletterMuteSetting BEO();

        GraphQLXWA2NewsletterRole BGr();
    }

    State BHu();

    ThreadMetadata BIH();

    ViewerMetadata BJA();
}
