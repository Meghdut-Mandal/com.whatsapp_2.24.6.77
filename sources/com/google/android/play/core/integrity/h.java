package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.C36341k9;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {
    public final String a;

    public /* synthetic */ h(String str, g gVar) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
                String str = this.a;
                String str2 = ((h) ((StandardIntegrityManager.StandardIntegrityTokenRequest) obj)).a;
                if (str != null) {
                    return str.equals(str2);
                }
                if (str2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C36341k9.A09(this.a) ^ 1000003;
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StandardIntegrityTokenRequest{requestHash=");
        A0u.append(this.a);
        return AnonymousClass000.A0q("}", A0u);
    }
}
