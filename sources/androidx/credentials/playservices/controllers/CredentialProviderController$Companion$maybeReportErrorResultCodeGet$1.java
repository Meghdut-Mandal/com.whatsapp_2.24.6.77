package androidx.credentials.playservices.controllers;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.C006302t;
import X.C10810fG;

public final class CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C10810fG $exception;
    public final /* synthetic */ C006302t $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(C006302t r2, C10810fG r3) {
        super(0);
        this.$onError = r2;
        this.$exception = r3;
    }

    public final void invoke() {
        this.$onError.invoke(this.$exception.element);
    }
}
