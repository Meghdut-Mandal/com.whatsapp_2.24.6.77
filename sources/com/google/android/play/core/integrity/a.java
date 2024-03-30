package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.AnonymousClass001;

public final class a extends ap {
    public String a;
    public y b;

    public final ap a(y yVar) {
        this.b = yVar;
        return this;
    }

    public final ap b(String str) {
        this.a = str;
        return this;
    }

    public final aq c() {
        y yVar;
        String str = this.a;
        if (str != null && (yVar = this.b) != null) {
            return new aq(str, yVar);
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
