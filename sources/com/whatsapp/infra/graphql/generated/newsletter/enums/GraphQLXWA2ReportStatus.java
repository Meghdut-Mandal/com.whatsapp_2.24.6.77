package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2ReportStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PENDING("PENDING"),
    FAIL("FAIL");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2ReportStatus(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
