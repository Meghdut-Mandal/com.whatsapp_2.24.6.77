package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {
    public String a;

    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new h(this.a, (g) null);
    }

    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.a = str;
        return this;
    }
}
