package X;

import android.media.Image;
import java.nio.ByteBuffer;

public class BAL implements C22997Azn {
    public Object A00;
    public final int A01;

    public BAL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        int i3 = this.A01;
        Object obj = this.A00;
        switch (i3) {
            case 0:
                return C165617ti.A09((Image) obj, i).getBuffer();
            case 1:
                i2 = C165617ti.A09((Image) obj, i).getPixelStride();
                break;
            case 2:
                i2 = C165617ti.A09((Image) obj, i).getRowStride();
                break;
            case 3:
                ByteBuffer byteBuffer = ((C20953A0k) ((C22775Avl[]) obj)[i]).A02;
                AnonymousClass00C.A08(byteBuffer);
                return byteBuffer;
            case 4:
                i2 = ((C20953A0k) ((C22775Avl[]) obj)[i]).A00;
                break;
            default:
                i2 = ((C20953A0k) ((C22775Avl[]) obj)[i]).A01;
                break;
        }
        return Integer.valueOf(i2);
    }
}
