package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {
    public final long a;

    public /* synthetic */ e(long j, int i, d dVar) {
        this.a = j;
    }

    public final int a() {
        return 0;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) && this.a == ((e) ((StandardIntegrityManager.PrepareIntegrityTokenRequest) obj)).a);
    }

    public final int hashCode() {
        return (AnonymousClass000.A08(this.a) ^ 1000003) * 1000003;
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrepareIntegrityTokenRequest{cloudProjectNumber=");
        A0u.append(this.a);
        return AnonymousClass000.A0q(", webViewRequestMode=0}", A0u);
    }
}
