package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import org.json.JSONObject;

/* renamed from: X.6Ft  reason: invalid class name and case insensitive filesystem */
public abstract class C129196Ft {
    public static float A03 = 12.0f;
    public static float A04 = 24.0f;
    public static float A05 = 32.0f;
    public static float A06 = 96.0f;
    public float A00;
    public final Paint A01;
    public final RectF A02 = C36441kJ.A0N();

    public static void A06(Canvas canvas, C129196Ft r2) {
        AnonymousClass00C.A0D(canvas, 0);
        r2.A0I(canvas);
    }

    public void A0L(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0A());
        RectF rectF = this.A02;
        jSONObject.put("l", (int) (rectF.left * 100.0f));
        jSONObject.put("t", (int) (rectF.top * 100.0f));
        jSONObject.put("r", (int) (rectF.right * 100.0f));
        jSONObject.put("b", (int) (rectF.bottom * 100.0f));
        float f = this.A00;
        if (f != 0.0f) {
            jSONObject.put("rotate", (int) (f * 100.0f));
        }
        jSONObject.put("color", this.A01.getColor());
        jSONObject.put("stroke", (int) (A08() * 100.0f));
    }

    public final void A0M(JSONObject jSONObject) {
        float A042 = C90504aG.A04(this.A02, jSONObject);
        this.A00 = ((float) jSONObject.optInt("rotate", 0)) / A042;
        A0G(jSONObject.getInt("color"));
        A0F(((float) jSONObject.getInt("stroke")) / A042);
    }

    public static void A07(RectF rectF, float f, float f2, float f3, float f4) {
        rectF.set(f - ((f - rectF.left) * f2), f3 - ((f3 - rectF.top) * f4), f - (f2 * (f - rectF.right)), f3 - (f4 * (f3 - rectF.bottom)));
    }

    public float A08() {
        float strokeWidth;
        int i;
        if (this instanceof AnonymousClass5Ck) {
            strokeWidth = this.A01.getStrokeWidth() * ((float) 5);
            i = 3;
        } else if (!(this instanceof AnonymousClass5Ch) && !(this instanceof AnonymousClass5Cg)) {
            return this.A01.getStrokeWidth();
        } else {
            strokeWidth = this.A01.getStrokeWidth() * ((float) 3);
            i = 2;
        }
        return strokeWidth / ((float) i);
    }

    public C122675vF A09() {
        if (this instanceof AnonymousClass5Cl) {
            AnonymousClass5Cl r1 = (AnonymousClass5Cl) this;
            RectF rectF = r1.A02;
            float f = r1.A00;
            int color = r1.A01.getColor();
            return new C104935Ca(rectF, r1.A0A, f, r1.A08(), r1.A05, color, r1.A06, r1.A08, r1.A0E.A02, r1.A07);
        }
        return new C122675vF(this.A02, this.A00, A08(), this.A01.getColor());
    }

    public String A0A() {
        if (this instanceof AnonymousClass5Ck) {
            return "thinking-bubble";
        }
        if (this instanceof AnonymousClass5Cl) {
            return "text";
        }
        if (this instanceof AnonymousClass5Ch) {
            return "speech-bubble-rect";
        }
        if (this instanceof AnonymousClass5Cg) {
            return "speech-bubble-oval";
        }
        if (this instanceof AnonymousClass5Cf) {
            return "rect";
        }
        if (this instanceof AnonymousClass5Ci) {
            return "pen";
        }
        if (this instanceof AnonymousClass5Ce) {
            return "oval";
        }
        if (this instanceof C104955Cm) {
            return "newsletter";
        }
        if (this instanceof AnonymousClass5Cj) {
            return "image-file";
        }
        if (this instanceof AnonymousClass5Cc) {
            return "circular-mask";
        }
        if (this instanceof AnonymousClass5Cd) {
            return "arrow";
        }
        if (this instanceof AnonymousClass5CZ) {
            return "sticker";
        }
        if (this instanceof AnonymousClass5CX) {
            return "emoji";
        }
        if (this instanceof AnonymousClass5CY) {
            return ((AnonymousClass5CY) this).A0N;
        }
        if (this instanceof AnonymousClass5Co) {
            return ((AnonymousClass5Co) this).A0E;
        }
        return ((C104965Cn) this).A0F;
    }

    public String A0B(Context context) {
        String valueOf;
        if (this instanceof AnonymousClass5Ck) {
            AnonymousClass00C.A0D(context, 0);
            return C36361kB.A0m(context, R.string.f12nameremoved);
        } else if (this instanceof AnonymousClass5Cl) {
            return ((AnonymousClass5Cl) this).A0A;
        } else {
            if (this instanceof AnonymousClass5Ch) {
                AnonymousClass00C.A0D(context, 0);
                return C36361kB.A0m(context, R.string.f12nameremoved);
            } else if (this instanceof AnonymousClass5Cg) {
                AnonymousClass00C.A0D(context, 0);
                return C36361kB.A0m(context, R.string.f12nameremoved);
            } else if (this instanceof AnonymousClass5Cf) {
                AnonymousClass00C.A0D(context, 0);
                return C36361kB.A0m(context, R.string.f12nameremoved);
            } else if (this instanceof AnonymousClass5Ci) {
                return "";
            } else {
                if (this instanceof AnonymousClass5Ce) {
                    AnonymousClass00C.A0D(context, 0);
                    return C36361kB.A0m(context, R.string.f12nameremoved);
                } else if ((this instanceof C104955Cm) || (this instanceof AnonymousClass5Cj) || (this instanceof AnonymousClass5Cc)) {
                    return "";
                } else {
                    if (this instanceof AnonymousClass5Cd) {
                        AnonymousClass00C.A0D(context, 0);
                        return C36361kB.A0m(context, R.string.f12nameremoved);
                    } else if (this instanceof AnonymousClass5CZ) {
                        return ((AnonymousClass5CZ) this).A05;
                    } else {
                        if (this instanceof AnonymousClass5CX) {
                            AnonymousClass00C.A0D(context, 0);
                            AnonymousClass1XQ r0 = ((AnonymousClass5CX) this).A01;
                            if (r0 == null) {
                                valueOf = context.getString(R.string.f12nameremoved);
                            } else {
                                valueOf = String.valueOf(r0);
                            }
                            AnonymousClass00C.A0B(valueOf);
                            return valueOf;
                        } else if (this instanceof AnonymousClass5CY) {
                            AnonymousClass00C.A0D(context, 0);
                            return C36361kB.A0m(context, R.string.f12nameremoved);
                        } else if (this instanceof AnonymousClass5Co) {
                            AnonymousClass00C.A0D(context, 0);
                            return C36361kB.A0m(context, R.string.f12nameremoved);
                        } else {
                            AnonymousClass00C.A0D(context, 0);
                            return C36361kB.A0m(context, R.string.f12nameremoved);
                        }
                    }
                }
            }
        }
    }

    public void A0C() {
        if (this instanceof AnonymousClass5Co) {
            RectF rectF = this.A02;
            if (rectF.height() < A03) {
                float width = rectF.width() / rectF.height();
                float f = (float) 2;
                rectF.set(rectF.centerX() - ((A03 * width) / f), rectF.centerY() - (A03 / f), rectF.centerX() + ((A03 * width) / f), rectF.centerY() + (A03 / f));
            }
        } else if (this instanceof AnonymousClass5CY) {
            AnonymousClass5CY r1 = (AnonymousClass5CY) this;
            float f2 = (A03 * r1.A00) / ((float) 116);
            RectF rectF2 = r1.A02;
            if (rectF2.height() < A03 || rectF2.width() < f2) {
                float f3 = (float) 2;
                float f4 = f2 / f3;
                rectF2.set(rectF2.centerX() - f4, rectF2.centerY() - (A03 / f3), rectF2.centerX() + f4, rectF2.centerY() + (A03 / f3));
            }
        } else {
            RectF rectF3 = this.A02;
            if (rectF3.width() < A03) {
                float f5 = (float) 2;
                rectF3.set(rectF3.centerX() - (A03 / f5), rectF3.top, rectF3.centerX() + (A03 / f5), rectF3.bottom);
            }
            if (rectF3.height() < A03) {
                float f6 = (float) 2;
                rectF3.set(rectF3.left, rectF3.centerY() - (A03 / f6), rectF3.right, rectF3.centerY() + (A03 / f6));
            }
        }
    }

    public void A0D() {
        AnonymousClass67Q r1;
        if (this instanceof AnonymousClass5CY) {
            r1 = ((AnonymousClass5CY) this).A0M;
        } else if (this instanceof AnonymousClass5Co) {
            r1 = ((AnonymousClass5Co) this).A0D;
        } else if (this instanceof C104965Cn) {
            r1 = ((C104965Cn) this).A0E;
        } else {
            return;
        }
        r1.A00 = false;
    }

    public void A0E(float f) {
        RectF rectF = this.A02;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        rectF.set(centerX - ((centerX - rectF.left) * f), centerY - ((centerY - rectF.top) * f), centerX - ((centerX - rectF.right) * f), centerY - (f * (centerY - rectF.bottom)));
        A0C();
    }

    public void A0F(float f) {
        this.A01.setStrokeWidth(f);
    }

    public void A0G(int i) {
        if (this instanceof AnonymousClass5Cl) {
            AnonymousClass5Cl r1 = (AnonymousClass5Cl) this;
            r1.A01.setColor(i);
            AnonymousClass3PW r12 = r1.A0E;
            r12.A03 = i;
            r12.A01(i, r12.A02);
        } else if (!(this instanceof AnonymousClass5Co)) {
            this.A01.setColor(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r7 == 2) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r7 == 2) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(int r7, float r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass5Ch
            if (r0 == 0) goto L_0x0024
            android.graphics.RectF r5 = r6.A02
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r7 == 0) goto L_0x0015
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r2) goto L_0x0016
        L_0x0015:
            r1 = r8
        L_0x0016:
            r0 = 1
            if (r7 == r0) goto L_0x001d
            if (r7 == r2) goto L_0x001d
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            A07(r5, r4, r1, r3, r8)
            r6.A0C()
            return
        L_0x0024:
            boolean r0 = r6 instanceof X.AnonymousClass5Cf
            if (r0 == 0) goto L_0x0048
            android.graphics.RectF r5 = r6.A02
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r7 == 0) goto L_0x0039
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r2) goto L_0x003a
        L_0x0039:
            r1 = r8
        L_0x003a:
            r0 = 1
            if (r7 == r0) goto L_0x0041
            if (r7 == r2) goto L_0x0041
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0041:
            A07(r5, r4, r1, r3, r8)
            r6.A0C()
            return
        L_0x0048:
            boolean r0 = r6 instanceof X.AnonymousClass5Ce
            if (r0 == 0) goto L_0x006c
            android.graphics.RectF r5 = r6.A02
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r7 == 0) goto L_0x005d
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r2) goto L_0x005e
        L_0x005d:
            r1 = r8
        L_0x005e:
            r0 = 1
            if (r7 == r0) goto L_0x0065
            if (r7 == r2) goto L_0x0065
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0065:
            A07(r5, r4, r1, r3, r8)
            r6.A0C()
            return
        L_0x006c:
            r6.A0E(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129196Ft.A0H(int, float):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.5Cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.5CY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.5Cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.5Cn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0638  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06c0 A[LOOP:2: B:244:0x06ba->B:246:0x06c0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r6 = r18
            boolean r0 = r6 instanceof X.AnonymousClass5Ck
            r4 = r19
            if (r0 == 0) goto L_0x006f
            X.5Ck r6 = (X.AnonymousClass5Ck) r6
            android.graphics.RectF r8 = X.AnonymousClass5Ch.A00(r6, r4)
            r4.save()
            android.graphics.Matrix r7 = r6.A00
            android.graphics.RectF r0 = r6.A05
            float r5 = r0.left
            float r3 = r0.top
            float r2 = r0.right
            float r0 = r0.bottom
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r3, r2, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER
            r7.setRectToRect(r1, r8, r0)
            android.graphics.Path r2 = r6.A04
            r2.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r2.setFillType(r0)
            android.graphics.Path r0 = r6.A02
            r0.transform(r7, r2)
            android.graphics.Paint r1 = r6.A01
            X.C36431kI.A1L(r1)
            r0 = -31
            r1.setColor(r0)
            r2.close()
            r4.drawPath(r2, r1)
            r2.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r2.setFillType(r0)
            android.graphics.Path r0 = r6.A03
            r0.transform(r7, r2)
            android.graphics.Paint r0 = r6.A01
            X.C36421kH.A0q(r0)
            r4.drawPath(r2, r0)
            r4.restore()
            r1 = 1067869798(0x3fa66666, float:1.3)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.AnonymousClass5Ck.A00(r4, r6, r1, r0)
            r1 = 1071225242(0x3fd9999a, float:1.7)
            r0 = 1056964608(0x3f000000, float:0.5)
            X.AnonymousClass5Ck.A00(r4, r6, r1, r0)
        L_0x006e:
            return
        L_0x006f:
            boolean r0 = r6 instanceof X.AnonymousClass5Cl
            if (r0 == 0) goto L_0x00bc
            X.5Cl r6 = (X.AnonymousClass5Cl) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = r6.A0A
            int r0 = r0.length()
            r12 = 1
            if (r0 == 0) goto L_0x006e
            android.graphics.RectF r10 = r6.A02
            r10.sort()
            r4.save()
            float r2 = r6.A00
            float r1 = java.lang.Math.abs(r2)
            r0 = 1077936128(0x40400000, float:3.0)
            r9 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0098
            r2 = 0
        L_0x0098:
            X.C90474aD.A0v(r4, r10, r2)
            android.text.TextPaint r3 = r6.A0C
            X.3PW r5 = r6.A0E
            int r0 = r5.A01
            r3.setColor(r0)
            float r1 = r5.A00
            r0 = 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.setAlpha(r0)
            android.content.Context r7 = r6.A0B
            android.text.StaticLayout r1 = r6.A09
            java.lang.String r14 = "layout"
            r2 = 0
            if (r1 != 0) goto L_0x0640
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r14)
            throw r0
        L_0x00bc:
            boolean r0 = r6 instanceof X.AnonymousClass5Cg
            if (r0 == 0) goto L_0x011e
            X.5Cg r6 = (X.AnonymousClass5Cg) r6
            android.graphics.RectF r3 = X.AnonymousClass5Ch.A00(r6, r4)
            android.graphics.Paint r7 = r6.A01
            X.C36421kH.A0q(r7)
            android.graphics.Matrix r5 = r6.A00
            r5.reset()
            float r1 = r6.A00
            r0 = 0
            r5.setRotate(r1, r0, r0)
            float r2 = r3.width()
            r1 = 1157234688(0x44fa0000, float:2000.0)
            float r2 = r2 / r1
            float r0 = r3.height()
            float r0 = r0 / r1
            r5.postScale(r2, r0)
            float r1 = r3.centerX()
            float r0 = r3.centerY()
            r5.postTranslate(r1, r0)
            android.graphics.Path r3 = r6.A03
            r3.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r3.setFillType(r0)
            android.graphics.Path r2 = r6.A02
            r2.transform(r5, r3)
            android.graphics.Paint r1 = r6.A01
            X.C36431kI.A1L(r1)
            r0 = -31
            r1.setColor(r0)
            r3.close()
            r4.drawPath(r3, r1)
            r3.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r3.setFillType(r0)
            r2.transform(r5, r3)
            r4.drawPath(r3, r7)
            return
        L_0x011e:
            boolean r0 = r6 instanceof X.AnonymousClass5Cf
            if (r0 == 0) goto L_0x0135
            android.graphics.RectF r1 = X.AnonymousClass5Ch.A00(r6, r4)
            r4.save()
            float r0 = r6.A00
            X.C90474aD.A0v(r4, r1, r0)
            android.graphics.Paint r0 = r6.A01
            r4.drawRect(r1, r0)
            goto L_0x06f8
        L_0x0135:
            boolean r0 = r6 instanceof X.AnonymousClass5Ci
            if (r0 == 0) goto L_0x014b
            X.5Ci r6 = (X.AnonymousClass5Ci) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x006e
            X.6Px r0 = r6.A03
            if (r0 == 0) goto L_0x006e
            r0.A04(r4)
            return
        L_0x014b:
            boolean r0 = r6 instanceof X.AnonymousClass5Ce
            if (r0 == 0) goto L_0x0162
            android.graphics.RectF r1 = X.AnonymousClass5Ch.A00(r6, r4)
            r4.save()
            float r0 = r6.A00
            X.C90474aD.A0v(r4, r1, r0)
            android.graphics.Paint r0 = r6.A01
            r4.drawOval(r1, r0)
            goto L_0x06f8
        L_0x0162:
            boolean r0 = r6 instanceof X.C104955Cm
            if (r0 != 0) goto L_0x006e
            boolean r0 = r6 instanceof X.AnonymousClass5Cj
            if (r0 == 0) goto L_0x017d
            X.5Cj r6 = (X.AnonymousClass5Cj) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = r6.A01
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
            android.graphics.Paint r1 = r6.A00
            r0 = 0
            r4.drawBitmap(r2, r0, r0, r1)
            return
        L_0x017d:
            boolean r0 = r6 instanceof X.AnonymousClass5Cc
            if (r0 == 0) goto L_0x01ca
            android.graphics.RectF r0 = X.AnonymousClass5Ch.A00(r6, r4)
            r4.save()
            android.graphics.Path r8 = X.C36441kJ.A0M()
            float r7 = r0.width()
            float r6 = r0.height()
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r7 / r5
            float r2 = r6 / r5
            r1 = 1065772646(0x3f866666, float:1.05)
            float r0 = java.lang.Math.min(r7, r6)
            float r1 = r1 * r0
            float r1 = r1 / r5
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r8.addCircle(r3, r2, r1, r0)
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r0, r0, r7, r6)
            android.graphics.Path r2 = X.C36441kJ.A0M()
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r2.addRect(r1, r0)
            android.graphics.Path$Op r0 = android.graphics.Path.Op.DIFFERENCE
            r2.op(r8, r0)
            android.graphics.Paint r1 = X.C36371kC.A0E()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.C36401kF.A0z(r0, r1)
            r4.drawPath(r2, r1)
            goto L_0x06f8
        L_0x01ca:
            boolean r0 = r6 instanceof X.AnonymousClass5Cd
            if (r0 == 0) goto L_0x0247
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            r4.save()
            float r1 = r6.A00
            android.graphics.RectF r0 = r6.A02
            X.C90474aD.A0v(r4, r0, r1)
            float r5 = r0.left
            float r1 = r0.bottom
            float r3 = r0.right
            float r7 = r0.top
            android.graphics.Paint r2 = r6.A01
            r8 = r4
            r9 = r5
            r10 = r1
            r11 = r3
            r12 = r7
            r13 = r2
            r8.drawLine(r9, r10, r11, r12, r13)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0234
            r0 = 90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01f9:
            r4.save()
            r4.translate(r3, r7)
            float r1 = X.C36441kJ.A03(r0)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 150(0x96, float:2.1E-43)
            if (r3 <= 0) goto L_0x020b
            r0 = 30
        L_0x020b:
            float r0 = (float) r0
            float r1 = r1 + r0
            r4.rotate(r1)
            r5 = 0
            float r7 = r2.getStrokeWidth()
            r0 = 5
            float r1 = (float) r0
            float r7 = r7 * r1
            r6 = 0
            r8 = 0
            r9 = r2
            r4.drawLine(r5, r6, r7, r8, r9)
            r0 = 1114636288(0x42700000, float:60.0)
            if (r3 <= 0) goto L_0x0224
            r0 = -1032847360(0xffffffffc2700000, float:-60.0)
        L_0x0224:
            r4.rotate(r0)
            float r7 = r2.getStrokeWidth()
            float r7 = r7 * r1
            r4.drawLine(r5, r6, r7, r8, r9)
            r4.restore()
            goto L_0x06f8
        L_0x0234:
            float r1 = r7 - r1
            float r0 = r3 - r5
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.atan(r0)
            double r0 = java.lang.Math.toDegrees(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x01f9
        L_0x0247:
            boolean r0 = r6 instanceof X.AnonymousClass5CZ
            if (r0 == 0) goto L_0x0275
            X.5CZ r6 = (X.AnonymousClass5CZ) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            android.graphics.drawable.Drawable r0 = r6.A00
            if (r0 == 0) goto L_0x006e
            r4.save()
            android.graphics.drawable.Drawable r2 = r6.A00
            boolean r0 = r2 instanceof X.C165747u5
            if (r0 == 0) goto L_0x06db
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.stickers.animation.AnimatedStickerDrawable"
            X.AnonymousClass00C.A0E(r2, r0)
            X.7u5 r2 = (X.C165747u5) r2
            android.graphics.Rect r0 = r2.getBounds()
            int r1 = r0.right
            int r0 = r0.bottom
            X.AnonymousClass5CZ.A01(r4, r6, r1, r0)
            r2.A00(r4)
            goto L_0x06f8
        L_0x0275:
            boolean r0 = r6 instanceof X.AnonymousClass5CX
            if (r0 == 0) goto L_0x02a1
            X.5CX r6 = (X.AnonymousClass5CX) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            android.graphics.drawable.Drawable r7 = r6.A00
            if (r7 == 0) goto L_0x006e
            android.graphics.RectF r5 = r6.A02
            float r0 = r5.left
            int r3 = (int) r0
            float r0 = r5.top
            int r2 = (int) r0
            float r0 = r5.right
            int r1 = (int) r0
            float r0 = r5.bottom
            int r0 = (int) r0
            r7.setBounds(r3, r2, r1, r0)
            r4.save()
            float r0 = r6.A00
            X.C90474aD.A0v(r4, r5, r0)
            r7.draw(r4)
            goto L_0x06f8
        L_0x02a1:
            boolean r0 = r6 instanceof X.AnonymousClass5CY
            if (r0 == 0) goto L_0x03c2
            X.5CY r6 = (X.AnonymousClass5CY) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.66R r1 = r6.A0L
            float r3 = r1.A00()
            boolean r8 = r6.A06
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x02c0
            float r1 = r1.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02c0
            r8 = r8 ^ 1
        L_0x02c0:
            r4.save()
            android.graphics.RectF r5 = r6.A02
            r5.sort()
            float r0 = r6.A00
            X.C90474aD.A0v(r4, r5, r0)
            float r7 = r5.width()
            float r0 = r6.A00
            float r7 = r7 / r0
            float r2 = r5.height()
            r0 = 116(0x74, float:1.63E-43)
            float r0 = (float) r0
            float r2 = r2 / r0
            float r1 = r5.left
            float r0 = r5.top
            r4.scale(r7, r2, r1, r0)
            float r1 = r5.left
            float r0 = r5.top
            r4.translate(r1, r0)
            float r1 = r6.A00
            r0 = 2
            float r11 = (float) r0
            float r1 = r1 / r11
            r0 = 1114112000(0x42680000, float:58.0)
            r4.scale(r3, r3, r1, r0)
            if (r8 == 0) goto L_0x0318
            X.5vE[] r0 = r6.A0P
        L_0x02f8:
            java.util.List r0 = X.AnonymousClass02R.A0C(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0300:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x031b
            java.lang.Object r0 = r7.next()
            X.5vE r0 = (X.C122665vE) r0
            android.graphics.RectF r3 = r0.A03
            float r2 = r0.A00
            float r1 = r0.A01
            android.graphics.Paint r0 = r0.A02
            r4.drawRoundRect(r3, r2, r1, r0)
            goto L_0x0300
        L_0x0318:
            X.5vE[] r0 = r6.A0Q
            goto L_0x02f8
        L_0x031b:
            if (r8 == 0) goto L_0x032c
            android.text.TextPaint r7 = r6.A0H
            android.text.TextPaint r3 = r6.A0G
        L_0x0321:
            java.lang.String r2 = r6.A02
            java.lang.String r12 = "formattedTime"
            if (r2 != 0) goto L_0x0331
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r12)
            throw r0
        L_0x032c:
            android.text.TextPaint r7 = r6.A0J
            android.text.TextPaint r3 = r6.A0I
            goto L_0x0321
        L_0x0331:
            r1 = 0
            int r0 = r2.length()
            android.graphics.Rect r10 = r6.A0F
            r7.getTextBounds(r2, r1, r0, r10)
            float r2 = r6.A00
            r9 = 2
            float r2 = r2 / r11
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x0348
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r12)
            throw r0
        L_0x0348:
            float r1 = r7.measureText(r0)
            java.lang.String r0 = r6.A01
            java.lang.String r8 = "formattedPeriod"
            if (r0 != 0) goto L_0x0357
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0357:
            float r0 = r3.measureText(r0)
            float r1 = r1 + r0
            float r1 = r1 / r11
            float r2 = r2 - r1
            int r0 = r10.height()
            int r0 = r0 / r9
            int r0 = r0 + 58
            float r1 = (float) r0
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0373
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x062e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r12)
            throw r0
        L_0x0373:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x039f
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x0380
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r12)
            throw r0
        L_0x0380:
            r4.drawText(r0, r2, r1, r7)
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x038c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r12)
            throw r0
        L_0x038c:
            float r0 = r7.measureText(r0)
            float r2 = r2 + r0
            java.lang.String r0 = r6.A01
            if (r0 != 0) goto L_0x039a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x039a:
            r4.drawText(r0, r2, r1, r3)
            goto L_0x0631
        L_0x039f:
            java.lang.String r0 = r6.A01
            if (r0 != 0) goto L_0x03a8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x03a8:
            r4.drawText(r0, r2, r1, r3)
            java.lang.String r0 = r6.A01
            if (r0 != 0) goto L_0x03b4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x03b4:
            float r0 = r3.measureText(r0)
            float r2 = r2 + r0
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x062e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r12)
            throw r0
        L_0x03c2:
            boolean r0 = r6 instanceof X.AnonymousClass5Co
            if (r0 == 0) goto L_0x04d2
            X.5Co r6 = (X.AnonymousClass5Co) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.66R r1 = r6.A0C
            float r3 = r1.A00()
            boolean r13 = r6.A07
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x03e1
            float r1 = r1.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03e1
            r13 = r13 ^ 1
        L_0x03e1:
            r4.save()
            android.graphics.RectF r8 = r6.A02
            r8.sort()
            float r0 = r6.A00
            X.C90474aD.A0v(r4, r8, r0)
            float r5 = r8.width()
            float r0 = r6.A02
            float r5 = r5 / r0
            float r2 = r8.height()
            r0 = 1121058816(0x42d20000, float:105.0)
            float r2 = r2 / r0
            float r1 = r8.left
            float r0 = r8.top
            r4.scale(r5, r2, r1, r0)
            float r1 = r8.left
            float r0 = r8.top
            r4.translate(r1, r0)
            float r1 = r6.A02
            r0 = 2
            float r11 = (float) r0
            float r1 = r1 / r11
            r7 = 1112670208(0x42520000, float:52.5)
            r4.scale(r3, r3, r1, r7)
            if (r13 == 0) goto L_0x0421
            X.5vE[] r12 = r6.A08
            if (r12 != 0) goto L_0x042c
            java.lang.String r0 = "darkThemeRects"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0421:
            X.5vE[] r12 = r6.A09
            if (r12 != 0) goto L_0x042c
            java.lang.String r0 = "lightThemeRects"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x042c:
            int r10 = r12.length
            r9 = 0
            r5 = 0
        L_0x042f:
            if (r5 >= r10) goto L_0x0441
            r0 = r12[r5]
            android.graphics.RectF r3 = r0.A03
            float r2 = r0.A00
            float r1 = r0.A01
            android.graphics.Paint r0 = r0.A02
            r4.drawRoundRect(r3, r2, r1, r0)
            int r5 = r5 + 1
            goto L_0x042f
        L_0x0441:
            if (r13 == 0) goto L_0x04ca
            android.graphics.Picture r5 = r6.A04
            android.text.TextPaint r12 = r6.A0B
            r0 = -1
        L_0x0448:
            r12.setColor(r0)
            if (r5 == 0) goto L_0x04c8
            int r0 = r5.getWidth()
        L_0x0451:
            float r2 = (float) r0
            if (r5 == 0) goto L_0x0458
            int r9 = r5.getHeight()
        L_0x0458:
            float r9 = (float) r9
            r3 = 1104150528(0x41d00000, float:26.0)
            float r3 = r3 + r2
            float r0 = r6.A02
            float r3 = r3 + r0
            float r3 = r3 / r11
            float r1 = r12.descent()
            float r0 = r12.ascent()
            float r1 = r1 + r0
            float r1 = r1 / r11
            float r1 = r7 - r1
            boolean r10 = r6.A0F
            if (r10 != 0) goto L_0x0475
            java.lang.String r0 = r6.A05
            r4.drawText(r0, r3, r1, r12)
        L_0x0475:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r9
            float r0 = r0 / r11
            float r7 = r7 - r0
            if (r5 == 0) goto L_0x048f
            r1 = 1108738048(0x42160000, float:37.5)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.save()
            r4.translate(r1, r7)
            r4.scale(r0, r0)
            r4.drawPicture(r5)
            r4.restore()
        L_0x048f:
            if (r10 == 0) goto L_0x04bb
            r9 = 1108738048(0x42160000, float:37.5)
            android.graphics.Paint r7 = r6.A0A
            android.content.Context r1 = r6.A00
            r0 = 2131102831(0x7f060c6f, float:1.7818111E38)
            X.C36381kD.A16(r1, r7, r0)
            r0 = 8
            float r5 = (float) r0
            android.util.DisplayMetrics r0 = X.C90484aE.A0P()
            float r0 = r0.density
            float r5 = r5 * r0
            float r9 = r9 + r2
            r0 = 1104150528(0x41d00000, float:26.0)
            float r9 = r9 + r0
            r0 = 1126825984(0x432a0000, float:170.0)
            float r3 = r9 + r0
            r2 = 1108738048(0x42160000, float:37.5)
            r1 = 1116143616(0x42870000, float:67.5)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r9, r2, r3, r1)
            r4.drawRoundRect(r0, r5, r5, r7)
        L_0x04bb:
            r4.restore()
            if (r10 != 0) goto L_0x006e
            X.67Q r1 = r6.A0D
            float r0 = r6.A00
            r1.A01(r4, r8, r0)
            return
        L_0x04c8:
            r0 = 0
            goto L_0x0451
        L_0x04ca:
            android.graphics.Picture r5 = r6.A03
            android.text.TextPaint r12 = r6.A0B
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0448
        L_0x04d2:
            X.5Cn r6 = (X.C104965Cn) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            boolean r14 = r6.A08
            X.66R r2 = r6.A0D
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x04e9
            float r1 = r2.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x04e9
            r14 = r14 ^ 1
        L_0x04e9:
            if (r14 == 0) goto L_0x0581
            android.graphics.Picture r13 = r6.A02
        L_0x04ed:
            if (r13 == 0) goto L_0x006e
            r11 = 1059816735(0x3f2b851f, float:0.67)
            boolean r5 = r6.A0G
            if (r5 != 0) goto L_0x0506
            r4.save()
            android.graphics.RectF r0 = r6.A02
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            r4.scale(r11, r11, r1, r0)
        L_0x0506:
            float r2 = r2.A00()
            android.graphics.RectF r7 = r6.A02
            r7.sort()
            r4.save()
            float r0 = r6.A00
            X.C90474aD.A0v(r4, r7, r0)
            float r8 = r7.width()
            int r0 = r13.getHeight()
            float r0 = (float) r0
            float r8 = r8 / r0
            float r3 = r7.height()
            int r0 = r13.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r1 = r7.left
            float r0 = r7.top
            r4.scale(r8, r3, r1, r0)
            float r1 = r7.left
            float r0 = r7.top
            r4.translate(r1, r0)
            int r0 = r13.getWidth()
            r10 = 2
            int r0 = r0 / r10
            float r1 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / r10
            float r0 = (float) r0
            r4.scale(r2, r2, r1, r0)
            r4.save()
            r4.drawPicture(r13)
            r4.restore()
            int r0 = r13.getWidth()
            int r0 = r0 / r10
            float r3 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / r10
            float r2 = (float) r0
            r1 = 1104150528(0x41d00000, float:26.0)
            if (r14 == 0) goto L_0x057e
            android.graphics.Paint r0 = r6.A09
        L_0x0564:
            r4.drawCircle(r3, r2, r1, r0)
            r4.save()
            if (r14 == 0) goto L_0x0577
            X.5vE r15 = r6.A04
            if (r15 != 0) goto L_0x0585
            java.lang.String r0 = "darkThemeHour"
        L_0x0572:
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0577:
            X.5vE r15 = r6.A06
            if (r15 != 0) goto L_0x0585
            java.lang.String r0 = "lightThemeHour"
            goto L_0x0572
        L_0x057e:
            android.graphics.Paint r0 = r6.A0A
            goto L_0x0564
        L_0x0581:
            android.graphics.Picture r13 = r6.A03
            goto L_0x04ed
        L_0x0585:
            r0 = 360(0x168, float:5.04E-43)
            double r2 = (double) r0
            int r0 = r6.A00
            int r0 = r0 + 9
            double r8 = (double) r0
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r8 = r8 % r0
            double r8 = r8 / r0
            double r8 = r8 * r2
            int r0 = r6.A01
            int r0 = r0 * 30
            double r0 = (double) r0
            r16 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r0 = r0 / r16
            double r8 = r8 + r0
            android.graphics.RectF r12 = r6.A0B
            android.graphics.RectF r0 = r15.A03
            r12.set(r0)
            int r0 = (int) r8
            float r8 = (float) r0
            int r0 = r13.getWidth()
            int r0 = r0 / r10
            float r1 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / r10
            float r0 = (float) r0
            r4.rotate(r8, r1, r0)
            float r8 = r15.A00
            float r1 = r15.A01
            android.graphics.Paint r0 = r15.A02
            r4.drawRoundRect(r12, r8, r1, r0)
            r4.restore()
            r4.save()
            if (r14 == 0) goto L_0x05d0
            X.5vE r8 = r6.A05
            if (r8 != 0) goto L_0x05d7
            java.lang.String r0 = "darkThemeMinute"
        L_0x05cb:
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05d0:
            X.5vE r8 = r6.A07
            if (r8 != 0) goto L_0x05d7
            java.lang.String r0 = "lightThemeMinute"
            goto L_0x05cb
        L_0x05d7:
            int r0 = r6.A01
            int r0 = r0 + 45
            double r0 = (double) r0
            double r0 = r0 % r16
            double r0 = r0 / r16
            double r2 = r2 * r0
            android.graphics.RectF r0 = r8.A03
            r12.set(r0)
            int r0 = (int) r2
            float r2 = (float) r0
            int r0 = r13.getWidth()
            int r0 = r0 / r10
            float r1 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / r10
            float r0 = (float) r0
            r4.rotate(r2, r1, r0)
            float r2 = r8.A00
            float r1 = r8.A01
            android.graphics.Paint r0 = r8.A02
            r4.drawRoundRect(r12, r2, r1, r0)
            r4.restore()
            r4.restore()
            if (r5 != 0) goto L_0x006e
            r4.restore()
            float r5 = r7.width()
            float r5 = r5 * r11
            float r0 = (float) r10
            float r5 = r5 / r0
            float r3 = r7.centerX()
            float r3 = r3 - r5
            float r2 = r7.centerY()
            float r2 = r2 - r5
            float r1 = r7.centerX()
            float r1 = r1 + r5
            float r0 = r7.centerY()
            float r0 = r0 + r5
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r3, r2, r1, r0)
            X.67Q r1 = r6.A0E
            goto L_0x063a
        L_0x062e:
            r4.drawText(r0, r2, r1, r7)
        L_0x0631:
            r4.restore()
            boolean r0 = r6.A0O
            if (r0 != 0) goto L_0x006e
            X.67Q r1 = r6.A0M
        L_0x063a:
            float r0 = r6.A00
            r1.A01(r4, r5, r0)
            return
        L_0x0640:
            float r0 = r6.A05
            r11 = 2
            float r8 = (float) r11
            float r0 = r0 / r8
            java.util.ArrayList r13 = X.AnonymousClass3TG.A00(r7, r1, r0)
            int r0 = r6.A06
            if (r0 != r11) goto L_0x065d
            android.text.StaticLayout r1 = r6.A09
            if (r1 != 0) goto L_0x0656
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r14)
            throw r0
        L_0x0656:
            float r0 = r6.A05
            float r0 = r0 / r8
            java.util.ArrayList r13 = X.AnonymousClass3TG.A01(r7, r1, r0)
        L_0x065d:
            float r7 = r10.width()
            float r0 = r6.A00
            float r7 = r7 / r0
            int r0 = r6.A08
            if (r0 == 0) goto L_0x0687
            if (r0 == r12) goto L_0x0684
            if (r0 == r11) goto L_0x0679
            float r1 = r10.centerX()
            android.text.StaticLayout r0 = r6.A09
            if (r0 != 0) goto L_0x0694
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r14)
            throw r0
        L_0x0679:
            float r1 = r10.right
            android.text.StaticLayout r0 = r6.A09
            if (r0 != 0) goto L_0x069c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r14)
            throw r0
        L_0x0684:
            float r1 = r10.left
            goto L_0x06a3
        L_0x0687:
            float r1 = r10.centerX()
            android.text.StaticLayout r0 = r6.A09
            if (r0 != 0) goto L_0x0694
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r14)
            throw r0
        L_0x0694:
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r7
            float r0 = r0 / r8
            goto L_0x06a2
        L_0x069c:
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r7
        L_0x06a2:
            float r1 = r1 - r0
        L_0x06a3:
            float r0 = r10.top
            r4.translate(r1, r0)
            r4.scale(r7, r7, r9, r9)
            float r1 = r6.A05
            float r1 = r1 / r8
            android.graphics.CornerPathEffect r0 = new android.graphics.CornerPathEffect
            r0.<init>(r1)
            r3.setPathEffect(r0)
            java.util.Iterator r1 = r13.iterator()
        L_0x06ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06ca
            java.lang.Object r0 = r1.next()
            android.graphics.Path r0 = (android.graphics.Path) r0
            r4.drawPath(r0, r3)
            goto L_0x06ba
        L_0x06ca:
            r3.setPathEffect(r2)
            int r0 = r5.A04
            r3.setColor(r0)
            android.text.StaticLayout r0 = r6.A09
            if (r0 != 0) goto L_0x06f5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r14)
            throw r0
        L_0x06db:
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
            X.AnonymousClass00C.A0E(r2, r0)
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r0 = r2.getBitmap()
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            X.AnonymousClass5CZ.A01(r4, r6, r1, r0)
            r2.draw(r4)
            goto L_0x06f8
        L_0x06f5:
            r0.draw(r4)
        L_0x06f8:
            r4.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129196Ft.A0I(android.graphics.Canvas):void");
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        if (AnonymousClass000.A1Q((f > f3 ? 1 : (f == f3 ? 0 : -1)))) {
            f3 += 1.0f;
        }
        if (f2 == f4) {
            f4 += 1.0f;
        }
        RectF rectF2 = this.A02;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A0C();
    }

    public void A0K(C122675vF r3) {
        this.A02.set(r3.A03);
        this.A00 = r3.A00;
        A0G(r3.A02);
        A0F(r3.A01);
    }

    public boolean A0N() {
        if ((this instanceof AnonymousClass5Cl) || (this instanceof AnonymousClass5Ci) || (this instanceof AnonymousClass5CZ) || (this instanceof AnonymousClass5CX) || (this instanceof AnonymousClass5CY) || (this instanceof AnonymousClass5Co) || (this instanceof C104965Cn)) {
            return false;
        }
        return true;
    }

    public boolean A0O() {
        if ((this instanceof AnonymousClass5Cl) || (this instanceof AnonymousClass5Ci) || (this instanceof AnonymousClass5CW) || (this instanceof AnonymousClass5CZ) || (this instanceof AnonymousClass5CX) || (this instanceof AnonymousClass5CY)) {
            return false;
        }
        return true;
    }

    public C129196Ft() {
        Paint A0E = C36371kC.A0E();
        C36421kH.A0q(A0E);
        A0E.setStrokeJoin(Paint.Join.ROUND);
        A0E.setStrokeCap(Paint.Cap.ROUND);
        this.A01 = A0E;
    }
}
