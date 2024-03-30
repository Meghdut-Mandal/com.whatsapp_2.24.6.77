package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2NewsletterStateType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ACTIVE("ACTIVE"),
    SUSPENDED("SUSPENDED"),
    GEOSUSPENDED("GEOSUSPENDED"),
    DELETED("DELETED"),
    NON_EXISTING("NON_EXISTING");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2NewsletterStateType(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
