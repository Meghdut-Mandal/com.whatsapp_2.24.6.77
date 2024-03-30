package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.Date;

/* renamed from: X.6uJ  reason: invalid class name and case insensitive filesystem */
public class C145656uJ implements AnonymousClass4V2, C162037nv {
    public final long A00;
    public final Uri A01;
    public final File A02;

    public int BE7() {
        return 3;
    }

    public String BEF() {
        return "video/*";
    }

    public int BGs() {
        return 0;
    }

    public boolean BLq() {
        return false;
    }

    public int getType() {
        return 1;
    }

    public long BAn() {
        return new Date(this.A02.lastModified()).getTime();
    }

    public Bitmap Bvb(int i) {
        File A0S;
        String path = this.A01.getPath();
        if (path == null) {
            A0S = null;
        } else {
            A0S = C90524aI.A0S(path);
        }
        return C25541Gs.A01(A0S);
    }

    public C145656uJ(File file) {
        Uri fromFile = Uri.fromFile(file);
        long length = file.length();
        this.A01 = fromFile;
        this.A00 = length;
        this.A02 = file;
    }

    public Uri B7k() {
        return this.A01;
    }

    public /* synthetic */ long BBF() {
        return 0;
    }

    public File BBo() {
        return this.A02;
    }

    public long getContentLength() {
        return this.A00;
    }
}
