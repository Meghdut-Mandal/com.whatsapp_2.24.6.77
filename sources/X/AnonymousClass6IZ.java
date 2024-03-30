package X;

import android.graphics.Bitmap;
import com.whatsapp.superpack.WhatsAppObiInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.6IZ  reason: invalid class name */
public abstract class AnonymousClass6IZ {
    public static final AnonymousClass1H7 A00 = new AnonymousClass1H7();

    public static Bitmap A00(AnonymousClass1H7 r6, WhatsAppObiInputStream whatsAppObiInputStream) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        if (whatsAppObiInputStream.read(order.array()) == 8) {
            int i = order.getInt();
            int i2 = order.getInt();
            if (i <= 0 || i2 <= 0) {
                throw C90524aI.A0X("Metadata height/width is zero or less");
            } else if (i > 4096 || i2 > 4096) {
                throw C90524aI.A0X("Metadata height/width bigger than max value");
            } else {
                int i3 = i * i2 * 4;
                if (i3 <= 16777216) {
                    ByteBuffer A002 = r6.A00(i3);
                    try {
                        if (whatsAppObiInputStream.read(A002.array(), 0, i3) == i3) {
                            Bitmap A09 = C90524aI.A09(i, i2);
                            A09.copyPixelsFromBuffer(A002);
                            return A09;
                        }
                        throw C90524aI.A0X("Bytes read from stream not equal metadata size in bytes");
                    } finally {
                        r6.A01(A002);
                    }
                } else {
                    throw C90524aI.A0X("Metadata has more bytes than max allowed");
                }
            }
        } else {
            throw C90524aI.A0X("Dim bytes read not 8");
        }
    }
}
