package com.google.android.play.core.integrity;

import X.AnonymousClass001;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.util.Objects;

public final class am extends IntegrityTokenRequest.Builder {
    public String a;
    public Long b;

    public final IntegrityTokenRequest build() {
        String str = this.a;
        if (str != null) {
            return new ao(str, this.b, (Object) null, (an) null);
        }
        throw AnonymousClass001.A09("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        Objects.requireNonNull(str, "Null nonce");
        this.a = str;
        return this;
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.b = Long.valueOf(j);
        return this;
    }
}
