package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9y6  reason: invalid class name and case insensitive filesystem */
public class C208359y6 implements B5O, C22853Ax3, B0U, B5P {
    public AnonymousClass9YD A00;
    public List A01;
    public final Matrix A02;
    public final String A03;
    public final List A04;
    public final Paint A05;
    public final Path A06;
    public final RectF A07;
    public final RectF A08;
    public final C165737u4 A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C208359y6(X.AnonymousClass9Y2 r10, X.C165737u4 r11, X.C208549yR r12, X.C208409yC r13) {
        /*
            r9 = this;
            java.lang.String r6 = r12.A00
            boolean r8 = r12.A02
            java.util.List r2 = r12.A01
            java.util.ArrayList r7 = X.C36361kB.A0r(r2)
            r1 = 0
        L_0x000b:
            int r0 = r2.size()
            r3 = r11
            r5 = r13
            if (r1 >= r0) goto L_0x0025
            java.lang.Object r0 = r2.get(r1)
            X.Ax4 r0 = (X.C22854Ax4) r0
            X.B0T r0 = r0.Bvf(r10, r11, r13)
            if (r0 == 0) goto L_0x0022
            r7.add(r0)
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0040
            java.lang.Object r4 = r2.get(r1)
            X.Ax4 r4 = (X.C22854Ax4) r4
            boolean r0 = r4 instanceof X.C208599yW
            if (r0 == 0) goto L_0x003d
            X.9yW r4 = (X.C208599yW) r4
        L_0x0038:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L_0x003d:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0040:
            r4 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208359y6.<init>(X.9Y2, X.7u4, X.9yR, X.9yC):void");
    }

    public List A00() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass001.A0I();
            int i = 0;
            while (true) {
                List list = this.A04;
                if (i >= list.size()) {
                    break;
                }
                Object obj = list.get(i);
                if (obj instanceof B5O) {
                    this.A01.add(obj);
                }
                i++;
            }
        }
        return this.A01;
    }

    public void B0q(C199409fG r2, Object obj) {
        AnonymousClass9YD r0 = this.A00;
        if (r0 != null) {
            r0.A04(r2, obj);
        }
    }

    public void B5x(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int A0I;
        if (!this.A0A) {
            Matrix matrix2 = this.A02;
            matrix2.set(matrix);
            AnonymousClass9YD r1 = this.A00;
            if (r1 != null) {
                matrix2.preConcat(r1.A00());
                C196189Yb r0 = r1.A02;
                if (r0 == null) {
                    A0I = 100;
                } else {
                    A0I = AnonymousClass000.A0I(r0.A05());
                }
                i = (int) ((((((float) A0I) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            if (this.A09.A0S) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    List list = this.A04;
                    if (i2 >= list.size()) {
                        break;
                    } else if (!(list.get(i2) instanceof B5P) || (i3 = i3 + 1) < 2) {
                        i2++;
                    } else if (i != 255) {
                        z = true;
                        RectF rectF = this.A07;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        B8v(matrix2, rectF, true);
                        Paint paint = this.A05;
                        paint.setAlpha(i);
                        C203079nF.A02(canvas, paint, rectF, 31);
                        i = 255;
                    }
                }
            }
            z = false;
            List list2 = this.A04;
            for (int A062 = C36421kH.A06(list2, 1); A062 >= 0; A062--) {
                Object obj = list2.get(A062);
                if (obj instanceof B5P) {
                    ((B5P) obj).B5x(canvas, matrix2, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        Matrix matrix2 = this.A02;
        matrix2.set(matrix);
        AnonymousClass9YD r0 = this.A00;
        if (r0 != null) {
            matrix2.preConcat(r0.A00());
        }
        RectF rectF2 = this.A08;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                B0T b0t = (B0T) list.get(size);
                if (b0t instanceof B5P) {
                    ((B5P) b0t).B8v(matrix2, rectF2, z);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public Path BFG() {
        Matrix matrix = this.A02;
        matrix.reset();
        AnonymousClass9YD r0 = this.A00;
        if (r0 != null) {
            matrix.set(r0.A00());
        }
        Path path = this.A06;
        path.reset();
        if (!this.A0A) {
            List list = this.A04;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                B0T b0t = (B0T) list.get(size);
                if (b0t instanceof B5O) {
                    path.addPath(((B5O) b0t).BFG(), matrix);
                }
            }
        }
        return path;
    }

    public void BkC() {
        this.A09.invalidateSelf();
    }

    public void Bof(C201629k0 r4, C201629k0 r5, List list, int i) {
        String str = this.A03;
        if (r4.A02(str, i) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                C201629k0 r1 = new C201629k0(r5);
                r1.A01.add(str);
                r5 = r1;
                if (r4.A01(str, i)) {
                    C201629k0 r0 = new C201629k0(r1);
                    r0.A00 = this;
                    list.add(r0);
                }
            }
            if (r4.A03(str, i)) {
                int A002 = i + r4.A00(str, i);
                int i2 = 0;
                while (true) {
                    List list2 = this.A04;
                    if (i2 < list2.size()) {
                        B0T b0t = (B0T) list2.get(i2);
                        if (b0t instanceof B0U) {
                            ((B0U) b0t).Bof(r4, r5, list, A002);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void Bqe(List list, List list2) {
        int size = list.size();
        List list3 = this.A04;
        ArrayList A14 = C36441kJ.A14(size + list3.size());
        A14.addAll(list);
        int size2 = list3.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                B0T b0t = (B0T) list3.get(size2);
                b0t.Bqe(A14, list3.subList(0, size2));
                A14.add(b0t);
            } else {
                return;
            }
        }
    }

    public String getName() {
        return this.A03;
    }

    public C208359y6(C165737u4 r5, C208599yW r6, C208409yC r7, String str, List list, boolean z) {
        this.A05 = new C165717u2();
        this.A07 = C36441kJ.A0N();
        this.A02 = C90524aI.A0B();
        this.A06 = C36441kJ.A0M();
        this.A08 = C36441kJ.A0N();
        this.A03 = str;
        this.A09 = r5;
        this.A0A = z;
        this.A04 = list;
        if (r6 != null) {
            AnonymousClass9YD r0 = new AnonymousClass9YD(r6);
            this.A00 = r0;
            r0.A03(r7);
            this.A00.A02(this);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = list.get(size);
            if (obj instanceof Ax2) {
                A0I.add(obj);
            }
        }
        int size2 = A0I.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((Ax2) A0I.get(size2)).Azr(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
