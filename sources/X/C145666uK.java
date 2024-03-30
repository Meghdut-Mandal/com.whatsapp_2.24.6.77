package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/* renamed from: X.6uK  reason: invalid class name and case insensitive filesystem */
public class C145666uK implements AnonymousClass4V2, C162037nv {
    public final long A00;
    public final Uri A01;
    public final C21050ya A02;
    public final int A03;
    public final File A04;
    public final boolean A05;

    public int BE7() {
        return 1;
    }

    public String BEF() {
        return "image/*";
    }

    public Bitmap Bvb(int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        Bitmap A0L;
        try {
            C21050ya r3 = this.A02;
            Uri uri = this.A01;
            Matrix A0A = AnonymousClass1GW.A0A(uri, r3);
            try {
                File A032 = AnonymousClass6YY.A03(uri);
                if (A032 != null) {
                    parcelFileDescriptor = ParcelFileDescriptor.open(A032, 268435456);
                } else {
                    parcelFileDescriptor = r3.A05(uri, "r");
                }
            } catch (FileNotFoundException unused) {
                parcelFileDescriptor = null;
            }
            long j = (long) i;
            Bitmap A012 = AnonymousClass3R8.A01(parcelFileDescriptor, i, j * j * 2);
            if (A0A == null || A0A.isIdentity()) {
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                return A012;
            }
            if (A012 == null) {
                A0L = null;
            } else {
                A0L = C90484aE.A0L(A012, A0A);
            }
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            return A0L;
        } catch (IOException unused2) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public int getType() {
        return 0;
    }

    public long BAn() {
        return new Date(this.A04.lastModified()).getTime();
    }

    public C145666uK(C21050ya r4, File file, int i, boolean z) {
        Uri.Builder buildUpon = Uri.fromFile(file).buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("flip-h", "1");
        }
        if (i != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(i));
        }
        Uri build = buildUpon.build();
        long length = file.length();
        this.A02 = r4;
        this.A01 = build;
        this.A00 = length;
        this.A04 = file;
        this.A05 = z;
        this.A03 = i;
    }

    public Uri B7k() {
        return this.A01;
    }

    public /* synthetic */ long BBF() {
        return 0;
    }

    public File BBo() {
        return this.A04;
    }

    public int BGs() {
        return this.A03;
    }

    public boolean BLq() {
        return this.A05;
    }

    public long getContentLength() {
        return this.A00;
    }
}
