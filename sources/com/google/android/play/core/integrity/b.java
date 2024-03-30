package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class b extends bq {
    public String a;
    public y b;

    public final bq a(y yVar) {
        this.b = yVar;
        return this;
    }

    public final bq b(String str) {
        Objects.requireNonNull(str, "Null token");
        this.a = str;
        return this;
    }

    public final br c() {
        y yVar;
        String str = this.a;
        if (str != null && (yVar = this.b) != null) {
            return new br(str, yVar);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (str == null) {
            A0u.append(" token");
        }
        if (this.b == null) {
            A0u.append(" integrityDialogWrapper");
        }
        throw AnonymousClass001.A09("Missing required properties:".concat(A0u.toString()));
    }
}
