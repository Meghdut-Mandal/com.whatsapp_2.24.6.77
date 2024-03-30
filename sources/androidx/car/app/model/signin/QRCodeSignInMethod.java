package androidx.car.app.model.signin;

import X.AnonymousClass001;
import X.C15650nl;
import X.C165597tg;
import android.net.Uri;
import java.util.Objects;

public final class QRCodeSignInMethod implements C15650nl {
    public final Uri mUri = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCodeSignInMethod)) {
            return false;
        }
        return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
    }

    public int hashCode() {
        return C165597tg.A06(this.mUri, AnonymousClass001.A0L(), 0);
    }
}
