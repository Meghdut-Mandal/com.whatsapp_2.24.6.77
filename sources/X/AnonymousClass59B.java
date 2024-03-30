package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.59B  reason: invalid class name */
public final class AnonymousClass59B extends C74823mE {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass59B(Uri uri, C21050ya r3, String str, String str2, long j, long j2, long j3) {
        super(uri, r3, str, str2, j, j2, j3);
        AnonymousClass00C.A0D(uri, 3);
    }

    public Bitmap A00(long j, int i) {
        File A0S;
        boolean z;
        String str;
        String str2 = this.A03;
        if (str2 == null) {
            A0S = null;
        } else {
            A0S = C90524aI.A0S(str2);
        }
        if (A0S == null) {
            Log.e("mediafileutils/createVideoThumbnail/file=null");
            return null;
        }
        try {
            C21656ATx.A04(A0S);
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            return C25541Gs.A00((RectF) null, new C146386vW(A0S), 0, 0, 512, 0, 0, false, false);
        }
        try {
            return C21656ATx.A00(A0S);
        } catch (IOException | IllegalArgumentException e) {
            e = e;
            str = "mediafileutils/createGifThumbnail/gif file not read ";
            Log.e(str, e);
            return null;
        } catch (Exception e2) {
            e = e2;
            str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
            Log.e(str, e);
            return null;
        }
    }

    public Bitmap Bvb(int i) {
        File A0S;
        boolean z;
        String str;
        if (i < 144) {
            String str2 = this.A03;
            if (str2 == null) {
                A0S = null;
            } else {
                A0S = C90524aI.A0S(str2);
            }
            if (A0S == null) {
                Log.e("mediafileutils/createVideoThumbnail/file=null");
                return null;
            }
            try {
                C21656ATx.A04(A0S);
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                return C25541Gs.A00((RectF) null, new C146386vW(A0S), 0, 0, 96, 0, 0, false, false);
            }
            try {
                return C21656ATx.A00(A0S);
            } catch (IOException | IllegalArgumentException e) {
                e = e;
                str = "mediafileutils/createGifThumbnail/gif file not read ";
                Log.e(str, e);
                return null;
            } catch (Exception e2) {
                e = e2;
                str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
                Log.e(str, e);
                return null;
            }
        } else {
            long j = (long) i;
            return A00(2 * j * j, i);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass59B) || !AnonymousClass00C.A0J(this.A01, ((C74823mE) obj).A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.toString().hashCode();
    }

    public int getType() {
        return 1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoObject");
        return C36411kG.A11(A0u, this.A00);
    }
}
