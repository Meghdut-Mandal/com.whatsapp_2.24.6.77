package X;

import android.graphics.Rect;
import android.media.Image;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.9Sq  reason: invalid class name and case insensitive filesystem */
public class C195139Sq {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Pair A04;
    public Float A05;
    public Long A06;
    public Long A07;
    public boolean A08;
    public byte[] A09;
    public float[] A0A;
    public AnonymousClass9RI[] A0B;
    public Rect A0C;

    public void A00(Image image, Pair pair, Float f, Long l, Long l2, float[] fArr, boolean z, boolean z2) {
        int i;
        this.A08 = z;
        Image.Plane[] planes = image.getPlanes();
        AnonymousClass9RI[] r0 = this.A0B;
        if (r0 == null || r0.length != (i = planes.length)) {
            i = planes.length;
            this.A0B = new AnonymousClass9RI[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass9RI[] r1 = this.A0B;
            if (r1[i2] == null) {
                r1[i2] = new AnonymousClass9RI();
            }
            AnonymousClass9RI r5 = r1[i2];
            ByteBuffer buffer = planes[i2].getBuffer();
            if (z2) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(buffer.capacity());
                buffer.rewind();
                allocateDirect.put(buffer);
                buffer.rewind();
                allocateDirect.flip();
                buffer = allocateDirect;
            }
            r5.A02 = buffer;
            this.A0B[i2].A00 = planes[i2].getPixelStride();
            this.A0B[i2].A01 = planes[i2].getRowStride();
        }
        this.A0A = fArr;
        this.A04 = pair;
        this.A07 = l;
        this.A05 = f;
        this.A06 = l2;
        this.A01 = image.getFormat();
        this.A03 = image.getTimestamp();
        this.A02 = image.getWidth();
        this.A00 = image.getHeight();
        this.A0C = image.getCropRect();
    }
}
