package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9UJ  reason: invalid class name */
public final class AnonymousClass9UJ {
    public Rect A00;
    public final Bitmap A01;
    public final List A02;
    public final List A03;

    public C198029cm A00() {
        C22760AvV[] avVArr;
        float f;
        float f2;
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Bitmap bitmap2 = bitmap;
            int width = bitmap.getWidth() * bitmap.getHeight();
            if (width > 12544) {
                double sqrt = Math.sqrt(((double) 12544) / ((double) width));
                if (sqrt > 0.0d) {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * sqrt), (int) Math.ceil(((double) bitmap.getHeight()) * sqrt), false);
                }
            }
            Rect rect = this.A00;
            if (!(bitmap2 == bitmap || rect == null)) {
                double width2 = ((double) bitmap2.getWidth()) / ((double) bitmap.getWidth());
                rect.left = (int) Math.floor(((double) rect.left) * width2);
                rect.top = (int) Math.floor(((double) rect.top) * width2);
                rect.right = Math.min((int) Math.ceil(((double) rect.right) * width2), bitmap2.getWidth());
                rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width2), bitmap2.getHeight());
            }
            int width3 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[(width3 * height)];
            bitmap2.getPixels(iArr, 0, width3, 0, 0, width3, height);
            Rect rect2 = this.A00;
            if (rect2 != null) {
                int width4 = rect2.width();
                int height2 = this.A00.height();
                int[] iArr2 = new int[(width4 * height2)];
                for (int i = 0; i < height2; i++) {
                    Rect rect3 = this.A00;
                    System.arraycopy(iArr, ((rect3.top + i) * width3) + rect3.left, iArr2, i * width4, width4);
                }
                iArr = iArr2;
            }
            List list = this.A02;
            if (list.isEmpty()) {
                avVArr = null;
            } else {
                avVArr = (C22760AvV[]) list.toArray(new C22760AvV[list.size()]);
            }
            C201999kq r1 = new C201999kq(iArr, avVArr);
            if (bitmap2 != bitmap) {
                bitmap2.recycle();
            }
            C198029cm r8 = new C198029cm(r1.A01, this.A03);
            List list2 = r8.A03;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C197859cU r5 = (C197859cU) list2.get(i2);
                float[] fArr = r5.A02;
                int i3 = 0;
                int i4 = 0;
                float f3 = 0.0f;
                do {
                    float f4 = fArr[i4];
                    if (f4 > 0.0f) {
                        f3 += f4;
                    }
                    i4++;
                } while (i4 < 3);
                if (f3 != 0.0f) {
                    do {
                        if (fArr[i3] > 0.0f) {
                            fArr[i3] = fArr[i3] / f3;
                        }
                        i3++;
                    } while (i3 < 3);
                }
                Map map = r8.A04;
                List list3 = r8.A02;
                int size2 = list3.size();
                float f5 = 0.0f;
                C200089ga r3 = null;
                for (int i5 = 0; i5 < size2; i5++) {
                    C200089ga r2 = (C200089ga) list3.get(i5);
                    float[] A012 = r2.A01();
                    int i6 = 1;
                    float f6 = A012[1];
                    float[] fArr2 = r5.A01;
                    if (f6 >= fArr2[0] && f6 <= fArr2[2]) {
                        float f7 = A012[2];
                        float[] fArr3 = r5.A00;
                        if (f7 >= fArr3[0] && f7 <= fArr3[2] && !r8.A00.get(r2.A05)) {
                            float[] A013 = r2.A01();
                            C200089ga r12 = r8.A01;
                            if (r12 != null) {
                                i6 = r12.A04;
                            }
                            float[] fArr4 = r5.A02;
                            float f8 = fArr4[0];
                            float f9 = 0.0f;
                            if (f8 > 0.0f) {
                                f = f8 * (1.0f - C90494aF.A01(A013[1], fArr2[1]));
                            } else {
                                f = 0.0f;
                            }
                            float f10 = fArr4[1];
                            if (f10 > 0.0f) {
                                f2 = f10 * (1.0f - C90494aF.A01(A013[2], fArr3[1]));
                            } else {
                                f2 = 0.0f;
                            }
                            float f11 = fArr4[2];
                            if (f11 > 0.0f) {
                                f9 = f11 * (((float) r2.A04) / ((float) i6));
                            }
                            float f12 = f + f2 + f9;
                            if (r3 == null || f12 > f5) {
                                r3 = r2;
                                f5 = f12;
                            }
                        }
                    }
                }
                if (r3 != null) {
                    r8.A00.append(r3.A05, true);
                }
                map.put(r5, r3);
            }
            r8.A00.clear();
            return r8;
        }
        throw new AssertionError();
    }

    public void A01(int i, int i2, int i3, int i4) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Rect rect = this.A00;
            if (rect == null) {
                rect = new Rect();
                this.A00 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A00.intersect(i, i2, i3, i4)) {
                throw AnonymousClass001.A08("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }

    public AnonymousClass9UJ(Bitmap bitmap) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A03 = A0I;
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A02 = A0I2;
        if (!bitmap.isRecycled()) {
            A0I2.add(C198029cm.A05);
            this.A01 = bitmap;
            A0I.add(C197859cU.A06);
            A0I.add(C197859cU.A08);
            A0I.add(C197859cU.A04);
            A0I.add(C197859cU.A05);
            A0I.add(C197859cU.A07);
            A0I.add(C197859cU.A03);
            return;
        }
        throw AnonymousClass001.A08("Bitmap is not valid");
    }
}
