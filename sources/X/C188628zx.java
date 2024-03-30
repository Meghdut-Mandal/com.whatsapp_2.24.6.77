package X;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

/* renamed from: X.8zx  reason: invalid class name and case insensitive filesystem */
public enum C188628zx {
    GTE(">="),
    LTE("<="),
    EQ("=="),
    TSEQ("==="),
    NE("!="),
    TSNE("!=="),
    LT("<"),
    GT(">"),
    REGEX("=~"),
    NIN("NIN"),
    IN("IN"),
    CONTAINS("CONTAINS"),
    ALL("ALL"),
    SIZE("SIZE"),
    EXISTS("EXISTS"),
    TYPE(CredentialProviderBaseController.TYPE_TAG),
    MATCHES("MATCHES"),
    EMPTY("EMPTY"),
    SUBSETOF("SUBSETOF"),
    ANYOF("ANYOF"),
    NONEOF("NONEOF");
    
    public final String operatorString;

    /* access modifiers changed from: public */
    C188628zx(String str) {
        this.operatorString = str;
    }

    public String toString() {
        return this.operatorString;
    }
}
