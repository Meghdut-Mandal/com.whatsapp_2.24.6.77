package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2AppealState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SUCCESS("SUCCESS"),
    PENDING("PENDING"),
    REJECT("REJECT"),
    CONTENT_UNAVAILABLE("CONTENT_UNAVAILABLE"),
    NOT_APPEALED("NOT_APPEALED");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2AppealState(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
