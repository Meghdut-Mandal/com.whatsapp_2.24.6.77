package X;

import android.graphics.BitmapFactory;
import java.io.File;

/* renamed from: X.2sE  reason: invalid class name and case insensitive filesystem */
public class C53992sE implements C16680pu {
    public Object A00;
    public final int A01;

    public C53992sE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            return BitmapFactory.decodeFile(((File) obj).getAbsolutePath());
        }
        byte[] bArr = ((C124245xp) obj).A00;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }
}
