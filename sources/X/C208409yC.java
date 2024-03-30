package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9yC  reason: invalid class name and case insensitive filesystem */
public abstract class C208409yC implements C22853Ax3, B0U, B5P {
    public float A00;
    public BlurMaskFilter A01;
    public AnonymousClass812 A02;
    public C192819Ir A03;
    public C208409yC A04;
    public C208409yC A05;
    public boolean A06;
    public Paint A07;
    public List A08;
    public boolean A09;
    public final Matrix A0A;
    public final Paint A0B = new C165717u2(1);
    public final Paint A0C = new C165717u2(1, PorterDuff.Mode.DST_IN);
    public final Paint A0D = new C165717u2(1, PorterDuff.Mode.DST_OUT);
    public final Path A0E = C36441kJ.A0M();
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final C165737u4 A0J;
    public final AnonymousClass9YD A0K;
    public final C195509Uo A0L;
    public final List A0M;
    public final Matrix A0N = C90524aI.A0B();
    public final Matrix A0O = C90524aI.A0B();
    public final Paint A0P;
    public final Paint A0Q;
    public final RectF A0R;

    public void Bqe(List list, List list2) {
    }

    private void A05() {
        if (this.A08 == null) {
            C208409yC r1 = this.A05;
            if (r1 == null) {
                this.A08 = Collections.emptyList();
                return;
            }
            this.A08 = AnonymousClass001.A0I();
            do {
                this.A08.add(r1);
                r1 = r1.A05;
            } while (r1 != null);
        }
    }

    private void A06(Canvas canvas) {
        RectF rectF = this.A0H;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0P);
    }

    public C190979Bc A08() {
        if (!(this instanceof AnonymousClass81F)) {
            return this.A0L.A0E;
        }
        AnonymousClass81F r1 = (AnonymousClass81F) this;
        C190979Bc r0 = r1.A0L.A0E;
        if (r0 == null) {
            return r1.A01.A08();
        }
        return r0;
    }

    public AnonymousClass9M9 A09() {
        if (!(this instanceof AnonymousClass81F)) {
            return this.A0L.A0F;
        }
        AnonymousClass81F r1 = (AnonymousClass81F) this;
        AnonymousClass9M9 r0 = r1.A0L.A0F;
        if (r0 == null) {
            return r1.A01.A09();
        }
        return r0;
    }

    public void A0A(float f) {
        AnonymousClass9YD r1 = this.A0K;
        C196189Yb r0 = r1.A02;
        if (r0 != null) {
            r0.A08(f);
        }
        C196189Yb r02 = r1.A06;
        if (r02 != null) {
            r02.A08(f);
        }
        C196189Yb r03 = r1.A01;
        if (r03 != null) {
            r03.A08(f);
        }
        C196189Yb r04 = r1.A00;
        if (r04 != null) {
            r04.A08(f);
        }
        C196189Yb r05 = r1.A03;
        if (r05 != null) {
            r05.A08(f);
        }
        C196189Yb r06 = r1.A05;
        if (r06 != null) {
            r06.A08(f);
        }
        C196189Yb r07 = r1.A04;
        if (r07 != null) {
            r07.A08(f);
        }
        AnonymousClass812 r08 = r1.A07;
        if (r08 != null) {
            r08.A08(f);
        }
        AnonymousClass812 r09 = r1.A08;
        if (r09 != null) {
            r09.A08(f);
        }
        C192819Ir r4 = this.A03;
        if (r4 != null) {
            int i = 0;
            while (true) {
                List list = r4.A00;
                if (i >= list.size()) {
                    break;
                }
                ((C196189Yb) list.get(i)).A08(f);
                i++;
            }
        }
        AnonymousClass812 r010 = this.A02;
        if (r010 != null) {
            r010.A08(f);
        }
        C208409yC r011 = this.A04;
        if (r011 != null) {
            r011.A0A(f);
        }
        List list2 = this.A0M;
        list2.size();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ((C196189Yb) list2.get(i2)).A08(f);
        }
        list2.size();
    }

    public void A0B(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap;
        String str;
        AnonymousClass9M8 r7;
        int width;
        int height;
        int A0I2;
        int i2 = i;
        if (this instanceof AnonymousClass81E) {
            AnonymousClass81E r1 = (AnonymousClass81E) this;
            C195509Uo r6 = r1.A03;
            int alpha = Color.alpha(r6.A04);
            if (alpha != 0) {
                C196189Yb r0 = r1.A0K.A02;
                if (r0 == null) {
                    A0I2 = 100;
                } else {
                    A0I2 = AnonymousClass000.A0I(r0.A05());
                }
                int i3 = (int) ((((float) i2) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) A0I2)) / 100.0f) * 255.0f);
                Paint paint = r1.A01;
                paint.setAlpha(i3);
                C165587tf.A0w(paint, r1.A00);
                if (i3 > 0) {
                    float[] fArr = r1.A04;
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    float f = (float) r6.A06;
                    fArr[2] = f;
                    fArr[3] = 0.0f;
                    fArr[4] = f;
                    float f2 = (float) r6.A05;
                    fArr[5] = f2;
                    fArr[6] = 0.0f;
                    fArr[7] = f2;
                    matrix.mapPoints(fArr);
                    Path path = r1.A02;
                    path.reset();
                    path.moveTo(fArr[0], fArr[1]);
                    path.lineTo(fArr[2], fArr[3]);
                    path.lineTo(fArr[4], fArr[5]);
                    path.lineTo(fArr[6], fArr[7]);
                    path.lineTo(fArr[0], fArr[1]);
                    path.close();
                    canvas.drawPath(path, paint);
                }
            }
        } else if (this instanceof AnonymousClass81F) {
            ((AnonymousClass81F) this).A00.B5x(canvas, matrix, i2);
        } else if (!(this instanceof AnonymousClass81C)) {
            if (this instanceof AnonymousClass81D) {
                AnonymousClass81D r2 = (AnonymousClass81D) this;
                C196189Yb r02 = r2.A01;
                if (r02 == null || (bitmap = (Bitmap) r02.A05()) == null) {
                    String str2 = r2.A0L.A0J;
                    C165737u4 r72 = r2.A0J;
                    C197949ce r5 = r72.A0J;
                    if (r5 != null) {
                        Drawable.Callback callback = r72.getCallback();
                        Context context = null;
                        if (callback != null && (callback instanceof View)) {
                            context = ((View) callback).getContext();
                        }
                        Context context2 = r5.A01;
                        if (context2 instanceof Application) {
                            context = context.getApplicationContext();
                        }
                        if (context != context2) {
                            r72.A0J = null;
                        }
                    }
                    C197949ce r4 = r72.A0J;
                    if (r4 == null) {
                        r4 = new C197949ce(r72.getCallback(), r72.A0N, r72.A0F.A0A);
                        r72.A0J = r4;
                    }
                    Map map = r4.A03;
                    AnonymousClass9M8 r8 = (AnonymousClass9M8) map.get(str2);
                    if (r8 != null) {
                        bitmap = r8.A00;
                        if (bitmap == null) {
                            Context context3 = r4.A01;
                            if (context3 != null) {
                                String str3 = r8.A03;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inScaled = true;
                                options.inDensity = 160;
                                if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                                    try {
                                        String str4 = r4.A02;
                                        if (!TextUtils.isEmpty(str4)) {
                                            try {
                                                bitmap = BitmapFactory.decodeStream(context3.getAssets().open(C36321k7.A0D(str4, str3)), (Rect) null, options);
                                                if (bitmap == null) {
                                                    StringBuilder A0u = AnonymousClass000.A0u();
                                                    A0u.append("Decoded image `");
                                                    A0u.append(str2);
                                                    AnonymousClass6GP.A00(AnonymousClass000.A0q("` is null.", A0u));
                                                } else {
                                                    int i4 = r8.A02;
                                                    int i5 = r8.A01;
                                                    if (!(bitmap.getWidth() == i4 && bitmap.getHeight() == i5)) {
                                                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, true);
                                                        bitmap.recycle();
                                                        bitmap = createScaledBitmap;
                                                    }
                                                }
                                            } catch (IllegalArgumentException e) {
                                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                                A0u2.append("Unable to decode image `");
                                                A0u2.append(str2);
                                                AnonymousClass6GP.A01(AnonymousClass000.A0q("`.", A0u2), e);
                                            }
                                        } else {
                                            throw AnonymousClass001.A09("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        str = "Unable to open asset.";
                                        AnonymousClass6GP.A01(str, e);
                                        AnonymousClass9M8 r03 = r2.A05;
                                        return;
                                    }
                                } else {
                                    try {
                                        byte[] decode = Base64.decode(C165607th.A0o(str3.indexOf(44), str3), 0);
                                        bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    } catch (IllegalArgumentException e3) {
                                        e = e3;
                                        str = "data URL did not have correct base64 format.";
                                        AnonymousClass6GP.A01(str, e);
                                        AnonymousClass9M8 r032 = r2.A05;
                                        return;
                                    }
                                }
                                synchronized (C197949ce.A04) {
                                    ((AnonymousClass9M8) map.get(str2)).A00 = bitmap;
                                }
                                if (bitmap != null) {
                                }
                            }
                        }
                    }
                    AnonymousClass9M8 r0322 = r2.A05;
                    if (r0322 == null || (bitmap = r0322.A00) == null) {
                        return;
                    }
                }
                if (!bitmap.isRecycled() && (r7 = r2.A05) != null) {
                    float A002 = C203079nF.A00();
                    Paint paint2 = r2.A02;
                    paint2.setAlpha(i2);
                    C165587tf.A0w(paint2, r2.A00);
                    canvas.save();
                    canvas.concat(matrix);
                    Rect rect = r2.A04;
                    rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    boolean z = r2.A0J.A0U;
                    Rect rect2 = r2.A03;
                    if (z) {
                        width = (int) (((float) r7.A02) * A002);
                        height = r7.A01;
                    } else {
                        width = (int) (((float) bitmap.getWidth()) * A002);
                        height = bitmap.getHeight();
                    }
                    rect2.set(0, 0, width, (int) (((float) height) * A002));
                    canvas.drawBitmap(bitmap, rect, rect2, paint2);
                } else {
                    return;
                }
            } else {
                AnonymousClass81G r73 = (AnonymousClass81G) this;
                RectF rectF = r73.A04;
                C195509Uo r52 = r73.A0L;
                rectF.set(0.0f, 0.0f, r52.A01, r52.A00);
                matrix.mapRect(rectF);
                if (!r73.A0J.A0S || r73.A05.size() <= 1 || i2 == 255) {
                    canvas.save();
                } else {
                    Paint paint3 = r73.A03;
                    paint3.setAlpha(i2);
                    C203079nF.A02(canvas, paint3, rectF, 31);
                    i2 = 255;
                }
                List list = r73.A05;
                for (int A062 = C36421kH.A06(list, 1); A062 >= 0; A062--) {
                    if ((!r73.A01 && "__container".equals(r52.A0I)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                        ((C208409yC) list.get(A062)).B5x(canvas, matrix, i2);
                    }
                }
            }
            canvas.restore();
        }
    }

    public void A0C(C196189Yb r2) {
        if (r2 != null) {
            this.A0M.add(r2);
        }
    }

    public void A0D(C201629k0 r5, C201629k0 r6, List list, int i) {
        if (this instanceof AnonymousClass81F) {
            ((AnonymousClass81F) this).A00.Bof(r5, r6, list, i);
        } else if (this instanceof AnonymousClass81G) {
            AnonymousClass81G r3 = (AnonymousClass81G) this;
            int i2 = 0;
            while (true) {
                List list2 = r3.A05;
                if (i2 < list2.size()) {
                    ((C208409yC) list2.get(i2)).Bof(r5, r6, list, i);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0E(boolean z) {
        if (z && this.A07 == null) {
            this.A07 = new C165717u2();
        }
        this.A09 = z;
    }

    public void B0q(C199409fG r2, Object obj) {
        this.A0K.A04(r2, obj);
    }

    public void B5x(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Paint paint2;
        C192819Ir r0;
        Number number;
        if (this.A06) {
            C195509Uo r02 = this.A0L;
            C195509Uo r18 = r02;
            if (!r02.A0N) {
                A05();
                Matrix matrix2 = this.A0O;
                matrix2.reset();
                Matrix matrix3 = matrix;
                matrix2.set(matrix3);
                int size = this.A08.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(((C208409yC) this.A08.get(size)).A0K.A00());
                }
                int i2 = 100;
                AnonymousClass9YD r10 = this.A0K;
                C196189Yb r03 = r10.A02;
                if (!(r03 == null || (number = (Number) r03.A05()) == null)) {
                    i2 = number.intValue();
                }
                int i3 = (int) ((((((float) i) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
                Canvas canvas2 = canvas;
                if (this.A04 != null || ((r0 = this.A03) != null && !r0.A00.isEmpty())) {
                    RectF rectF = this.A0H;
                    B8v(matrix2, rectF, false);
                    if (!(this.A04 == null || r18.A0H == C023109s.A0C)) {
                        RectF rectF2 = this.A0G;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        this.A04.B8v(matrix3, rectF2, true);
                        if (!rectF.intersect(rectF2)) {
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                    matrix2.preConcat(r10.A00());
                    RectF rectF3 = this.A0F;
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                    C192819Ir r6 = this.A03;
                    if (r6 != null) {
                        List list = r6.A00;
                        if (!list.isEmpty()) {
                            List list2 = r6.A01;
                            int size2 = list2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    AnonymousClass9L4 r13 = (AnonymousClass9L4) list2.get(i4);
                                    Path path = (Path) ((C196189Yb) list.get(i4)).A05();
                                    if (path != null) {
                                        Path path2 = this.A0E;
                                        path2.set(path);
                                        path2.transform(matrix2);
                                        int intValue = r13.A02.intValue();
                                        if (intValue == 3 || intValue == 1 || ((intValue == 2 || intValue == 0) && r13.A03)) {
                                            break;
                                        }
                                        RectF rectF4 = this.A0I;
                                        path2.computeBounds(rectF4, false);
                                        if (i4 == 0) {
                                            rectF3.set(rectF4);
                                        } else {
                                            rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                        }
                                    }
                                    i4++;
                                } else if (!rectF.intersect(rectF3)) {
                                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                            }
                        }
                    }
                    RectF rectF5 = this.A0R;
                    rectF5.set(0.0f, 0.0f, (float) canvas2.getWidth(), (float) canvas2.getHeight());
                    Matrix matrix4 = this.A0N;
                    canvas2.getMatrix(matrix4);
                    if (!matrix4.isIdentity()) {
                        matrix4.invert(matrix4);
                        matrix4.mapRect(rectF5);
                    }
                    if (!rectF.intersect(rectF5)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                        Paint paint3 = this.A0B;
                        paint3.setAlpha(255);
                        C203079nF.A02(canvas2, paint3, rectF, 31);
                        A06(canvas2);
                        A0B(canvas2, matrix2, i3);
                        if (r6 != null) {
                            List list3 = r6.A00;
                            if (!list3.isEmpty()) {
                                Paint paint4 = this.A0C;
                                C203079nF.A02(canvas2, paint4, rectF, 19);
                                if (Build.VERSION.SDK_INT < 28) {
                                    A06(canvas2);
                                }
                                int i5 = 0;
                                while (true) {
                                    List list4 = r6.A01;
                                    if (i5 >= list4.size()) {
                                        break;
                                    }
                                    AnonymousClass9L4 r14 = (AnonymousClass9L4) list4.get(i5);
                                    C196189Yb r12 = (C196189Yb) list3.get(i5);
                                    C196189Yb r132 = (C196189Yb) r6.A02.get(i5);
                                    int intValue2 = r14.A02.intValue();
                                    if (intValue2 != 3) {
                                        if (intValue2 == 1) {
                                            if (i5 == 0) {
                                                paint3.setColor(-16777216);
                                                paint3.setAlpha(255);
                                                canvas2.drawRect(rectF, paint3);
                                            }
                                            if (r14.A03) {
                                                paint2 = this.A0D;
                                                C203079nF.A02(canvas2, paint2, rectF, 31);
                                                canvas2.drawRect(rectF, paint3);
                                                A07(paint2, r132);
                                                canvas2.drawPath(A04(matrix2, r12, this), paint2);
                                            } else {
                                                canvas2.drawPath(A04(matrix2, r12, this), this.A0D);
                                            }
                                        } else if (intValue2 != 2) {
                                            if (intValue2 == 0) {
                                                if (r14.A03) {
                                                    C203079nF.A02(canvas2, paint3, rectF, 31);
                                                    canvas2.drawRect(rectF, paint3);
                                                    Path A042 = A04(matrix2, r12, this);
                                                    A07(paint3, r132);
                                                    canvas2.drawPath(A042, this.A0D);
                                                } else {
                                                    Path A043 = A04(matrix2, r12, this);
                                                    A07(paint3, r132);
                                                    canvas2.drawPath(A043, paint3);
                                                }
                                            }
                                        } else if (r14.A03) {
                                            C203079nF.A02(canvas2, paint4, rectF, 31);
                                            canvas2.drawRect(rectF, paint3);
                                            paint2 = this.A0D;
                                            A07(paint2, r132);
                                            canvas2.drawPath(A04(matrix2, r12, this), paint2);
                                        } else {
                                            C203079nF.A02(canvas2, paint4, rectF, 31);
                                            Path A044 = A04(matrix2, r12, this);
                                            A07(paint3, r132);
                                            canvas2.drawPath(A044, paint3);
                                        }
                                        canvas2.restore();
                                    } else if (!list3.isEmpty()) {
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < list4.size()) {
                                                if (((AnonymousClass9L4) list4.get(i6)).A02 != C023109s.A0G) {
                                                    break;
                                                }
                                                i6++;
                                            } else {
                                                paint3.setAlpha(255);
                                                canvas2.drawRect(rectF, paint3);
                                                break;
                                            }
                                        }
                                    }
                                    i5++;
                                }
                                canvas2.restore();
                            }
                        }
                        if (this.A04 != null) {
                            C203079nF.A02(canvas2, this.A0Q, rectF, 19);
                            A06(canvas2);
                            this.A04.B5x(canvas2, matrix3, i3);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    if (this.A09 && (paint = this.A07) != null) {
                        paint.setStyle(Paint.Style.STROKE);
                        this.A07.setColor(-251901);
                        this.A07.setStrokeWidth(4.0f);
                        canvas2.drawRect(rectF, this.A07);
                        this.A07.setStyle(Paint.Style.FILL);
                        this.A07.setColor(1357638635);
                        canvas2.drawRect(rectF, this.A07);
                    }
                } else {
                    matrix2.preConcat(r10.A00());
                    A0B(canvas2, matrix2, i3);
                }
                AnonymousClass9L1 r5 = this.A0J.A0F.A0D;
                String str = r18.A0I;
                if (r5.A00) {
                    Map map = r5.A01;
                    AnonymousClass9G9 r3 = (AnonymousClass9G9) map.get(str);
                    if (r3 == null) {
                        r3 = new AnonymousClass9G9();
                        map.put(str, r3);
                    }
                    float f = r3.A00 + 0.0f;
                    r3.A00 = f;
                    int i7 = r3.A01 + 1;
                    r3.A01 = i7;
                    if (i7 == Integer.MAX_VALUE) {
                        r3.A00 = f / 2.0f;
                        r3.A01 = 1073741823;
                    }
                    if (str.equals("__container")) {
                        Iterator it = r5.A02.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass001.A0A("onFrameRendered");
                        }
                    }
                }
            }
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        this.A0H.set(0.0f, 0.0f, 0.0f, 0.0f);
        A05();
        Matrix matrix2 = this.A0A;
        matrix2.set(matrix);
        if (z) {
            List list = this.A08;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(((C208409yC) this.A08.get(size)).A0K.A00());
                }
            } else {
                C208409yC r0 = this.A05;
                if (r0 != null) {
                    matrix2.preConcat(r0.A0K.A00());
                }
            }
        }
        matrix2.preConcat(this.A0K.A00());
    }

    public void BkC() {
        this.A0J.invalidateSelf();
    }

    public void Bof(C201629k0 r4, C201629k0 r5, List list, int i) {
        C208409yC r0 = this.A04;
        if (r0 != null) {
            String str = r0.A0L.A0I;
            C201629k0 r2 = new C201629k0(r5);
            r2.A01.add(str);
            if (r4.A01(this.A04.A0L.A0I, i)) {
                C208409yC r1 = this.A04;
                C201629k0 r02 = new C201629k0(r2);
                r02.A00 = r1;
                list.add(r02);
            }
            if (r4.A03(this.A0L.A0I, i)) {
                this.A04.A0D(r4, r2, list, r4.A00(this.A04.A0L.A0I, i) + i);
            }
        }
        String str2 = this.A0L.A0I;
        if (r4.A02(str2, i)) {
            if (!"__container".equals(str2)) {
                C201629k0 r12 = new C201629k0(r5);
                r12.A01.add(str2);
                r5 = r12;
                if (r4.A01(str2, i)) {
                    C201629k0 r03 = new C201629k0(r12);
                    r03.A00 = this;
                    list.add(r03);
                }
            }
            if (r4.A03(str2, i)) {
                A0D(r4, r5, list, i + r4.A00(str2, i));
            }
        }
    }

    public String getName() {
        return this.A0L.A0I;
    }

    public C208409yC(C165737u4 r6, C195509Uo r7) {
        PorterDuff.Mode mode;
        C165717u2 r2 = new C165717u2(1);
        this.A0Q = r2;
        this.A0P = new C165717u2(PorterDuff.Mode.CLEAR);
        this.A0H = C36441kJ.A0N();
        this.A0R = C36441kJ.A0N();
        this.A0F = C36441kJ.A0N();
        this.A0G = C36441kJ.A0N();
        this.A0I = C36441kJ.A0N();
        this.A0A = C90524aI.A0B();
        this.A0M = AnonymousClass001.A0I();
        this.A06 = true;
        this.A00 = 0.0f;
        this.A0J = r6;
        this.A0L = r7;
        if (r7.A0H == C023109s.A0C) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        C165587tf.A0v(r2, mode);
        AnonymousClass9YD r0 = new AnonymousClass9YD(r7.A0D);
        this.A0K = r0;
        r0.A02(this);
        List list = r7.A0L;
        if (list != null && !list.isEmpty()) {
            C192819Ir r02 = new C192819Ir(list);
            this.A03 = r02;
            for (C196189Yb A092 : r02.A00) {
                A092.A09(this);
            }
            for (C196189Yb r03 : this.A03.A02) {
                A0C(r03);
                r03.A09(this);
            }
        }
        List list2 = this.A0L.A0K;
        boolean z = true;
        if (!list2.isEmpty()) {
            AnonymousClass812 r1 = new AnonymousClass812(list2);
            this.A02 = r1;
            r1.A04 = true;
            r1.A09(new AnonymousClass9y7(this));
            z = C196189Yb.A01(this.A02) != 1.0f ? false : z;
            if (z != this.A06) {
                this.A06 = z;
                this.A0J.invalidateSelf();
            }
            A0C(this.A02);
        } else if (true != this.A06) {
            this.A06 = true;
            this.A0J.invalidateSelf();
        }
    }

    public static Path A04(Matrix matrix, C196189Yb r3, C208409yC r4) {
        Path path = r4.A0E;
        path.set((Path) r3.A05());
        path.transform(matrix);
        return path;
    }

    public static void A07(Paint paint, C196189Yb r3) {
        paint.setAlpha((int) (((float) ((Number) r3.A05()).intValue()) * 2.55f));
    }
}
