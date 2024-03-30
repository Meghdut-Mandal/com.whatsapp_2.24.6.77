package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: X.0cq  reason: invalid class name and case insensitive filesystem */
public final class C09730cq implements C17310r4 {
    public final int A00;
    public final int A01;
    public final ClipData A02;
    public final Uri A03;
    public final Bundle A04;

    public ContentInfo BJJ() {
        return null;
    }

    public C09730cq(C09710co r5) {
        ClipData clipData = r5.A02;
        Objects.requireNonNull(clipData);
        this.A02 = clipData;
        int i = r5.A01;
        AnonymousClass0YM.A01(i, 0, "source", 5);
        this.A01 = i;
        int i2 = r5.A00;
        if ((i2 & 1) == i2) {
            this.A00 = i2;
            this.A03 = r5.A03;
            this.A04 = r5.A04;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Requested flags 0x");
        A0u.append(Integer.toHexString(i2));
        A0u.append(", but only 0x");
        A0u.append(Integer.toHexString(1));
        throw AnonymousClass000.A0c(" are allowed", A0u);
    }

    public String toString() {
        String str;
        String valueOf;
        String A0q;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContentInfoCompat{clip=");
        A0u.append(this.A02.getDescription());
        A0u.append(", source=");
        int i = this.A01;
        if (i == 0) {
            str = "SOURCE_APP";
        } else if (i == 1) {
            str = "SOURCE_CLIPBOARD";
        } else if (i == 2) {
            str = "SOURCE_INPUT_METHOD";
        } else if (i == 3) {
            str = "SOURCE_DRAG_AND_DROP";
        } else if (i == 4) {
            str = "SOURCE_AUTOFILL";
        } else if (i != 5) {
            str = String.valueOf(i);
        } else {
            str = "SOURCE_PROCESS_TEXT";
        }
        A0u.append(str);
        A0u.append(", flags=");
        int i2 = this.A00;
        if ((i2 & 1) != 0) {
            valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            valueOf = String.valueOf(i2);
        }
        A0u.append(valueOf);
        Uri uri = this.A03;
        String str2 = "";
        if (uri == null) {
            A0q = str2;
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append(", hasLinkUri(");
            A0u2.append(uri.toString().length());
            A0q = AnonymousClass000.A0q(")", A0u2);
        }
        A0u.append(A0q);
        if (this.A04 != null) {
            str2 = ", hasExtras";
        }
        A0u.append(str2);
        return AnonymousClass000.A0q("}", A0u);
    }

    public ClipData B9k() {
        return this.A02;
    }

    public int BBx() {
        return this.A00;
    }

    public int BHk() {
        return this.A01;
    }

    public Bundle getExtras() {
        return this.A04;
    }

    public Uri getLinkUri() {
        return this.A03;
    }
}
