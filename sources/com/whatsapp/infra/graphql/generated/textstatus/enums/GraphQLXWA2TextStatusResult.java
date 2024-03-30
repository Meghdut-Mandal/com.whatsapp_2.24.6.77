package com.whatsapp.infra.graphql.generated.textstatus.enums;

public enum GraphQLXWA2TextStatusResult {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SUCCESS("SUCCESS");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2TextStatusResult(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
