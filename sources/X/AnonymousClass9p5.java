package X;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.9p5  reason: invalid class name */
public class AnonymousClass9p5 {
    public static HashSet A06;
    public Canvas A00;
    public C200029gS A01;
    public C198179d2 A02;
    public Stack A03;
    public Stack A04;
    public Stack A05;

    public static float A02(C1687781x r3, AnonymousClass9p5 r4) {
        List list = r3.A01;
        if (list == null || list.size() == 0) {
            return 0.0f;
        }
        return ((AUX) r3.A01.get(0)).A03(r4);
    }

    private C198839eH A0D(AUX aux, AUX aux2, AUX aux3, AUX aux4) {
        float f;
        float f2;
        float f3 = 0.0f;
        float A012 = A01(aux, this);
        if (aux2 != null) {
            f3 = aux2.A03(this);
        }
        C198179d2 r1 = this.A02;
        C198839eH r0 = r1.A02;
        if (r0 == null) {
            r0 = r1.A03;
        }
        if (aux3 != null) {
            f = aux3.A02(this);
        } else {
            f = r0.A03;
        }
        if (aux4 != null) {
            f2 = aux4.A03(this);
        } else {
            f2 = r0.A00;
        }
        return new C198839eH(A012, f3, f, f2);
    }

    private void A0H(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        AnonymousClass9L5 r0 = this.A02.A04.A0E;
        if (r0 != null) {
            f += r0.A01.A02(this);
            f2 += this.A02.A04.A0E.A03.A03(this);
            f5 -= this.A02.A04.A0E.A02.A02(this);
            f6 -= this.A02.A04.A0E.A00.A03(this);
        }
        this.A00.clipRect(f, f2, f5, f6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.booleanValue() == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0S(X.C1686081g r7, X.AnonymousClass824 r8) {
        /*
            r6 = this;
            r4 = 0
            java.lang.Boolean r0 = r7.A05
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r5 = 1065353216(0x3f800000, float:1.0)
            X.AUX r0 = r7.A01
            if (r1 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0070
            float r2 = r0.A02(r6)
        L_0x0019:
            X.AUX r0 = r7.A00
            if (r0 == 0) goto L_0x006b
            float r3 = r0.A03(r6)
        L_0x0021:
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            A0j(r6)
            X.9d2 r1 = new X.9d2
            r1.<init>(r6)
            X.AUW r0 = X.AUW.A00()
            A0V(r0, r1, r6)
            r6.A0c(r7, r1)
            r6.A02 = r1
            X.AUW r1 = r1.A04
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r1.A0O = r0
            java.lang.Boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0064
            android.graphics.Canvas r2 = r6.A00
            X.9eH r0 = r8.A00
            float r1 = r0.A01
            float r0 = r0.A02
            r2.translate(r1, r0)
            X.9eH r0 = r8.A00
            float r1 = r0.A03
            float r0 = r0.A00
            r2.scale(r1, r0)
        L_0x0064:
            r6.A0W(r7, r4)
            A0i(r6)
        L_0x006a:
            return
        L_0x006b:
            X.9eH r0 = r8.A00
            float r3 = r0.A00
            goto L_0x0021
        L_0x0070:
            X.9eH r0 = r8.A00
            float r2 = r0.A03
            goto L_0x0019
        L_0x0075:
            r3 = 1067030938(0x3f99999a, float:1.2)
            if (r0 == 0) goto L_0x008f
            float r2 = r0.A04(r6, r5)
        L_0x007e:
            X.AUX r0 = r7.A00
            if (r0 == 0) goto L_0x0086
            float r3 = r0.A04(r6, r5)
        L_0x0086:
            X.9eH r1 = r8.A00
            float r0 = r1.A03
            float r2 = r2 * r0
            float r0 = r1.A00
            float r3 = r3 * r0
            goto L_0x0021
        L_0x008f:
            r2 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0S(X.81g, X.824):void");
    }

    public static float A00(AUX aux, AnonymousClass9p5 r1) {
        if (aux != null) {
            return aux.A03(r1);
        }
        return 0.0f;
    }

    public static float A01(AUX aux, AnonymousClass9p5 r1) {
        if (aux != null) {
            return aux.A02(r1);
        }
        return 0.0f;
    }

    public static int A03(int i, float f) {
        int i2 = 255;
        int A062 = C90514aH.A06((float) ((i >> 24) & 255), f);
        if (A062 < 0) {
            i2 = 0;
        } else if (A062 <= 255) {
            i2 = A062;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static Matrix A05(C198839eH r3, boolean z) {
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(r3.A01, r3.A02);
            matrix.preScale(r3.A03, r3.A00);
        }
        return matrix;
    }

    private Path A06(C198839eH r8, AnonymousClass824 r9) {
        Path A0B;
        AnonymousClass825 A042 = r9.A01.A04(this.A02.A04.A0a);
        boolean z = false;
        if (A042 == null) {
            A0k("ClipPath reference '%s' not found", this.A02.A04.A0a);
            return null;
        }
        C1685681c r5 = (C1685681c) A042;
        this.A05.push(this.A02);
        A0d(r5, this);
        Boolean bool = r5.A00;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix A052 = A05(r8, z);
        Matrix matrix = r5.A00;
        if (matrix != null) {
            A052.preConcat(matrix);
        }
        Path A0M = C36441kJ.A0M();
        for (AnonymousClass9QD r1 : r5.A05) {
            if ((r1 instanceof AnonymousClass824) && (A0B = A0B((AnonymousClass824) r1, true)) != null) {
                A0M.op(A0B, Path.Op.UNION);
            }
        }
        if (this.A02.A04.A0a != null) {
            C198839eH r0 = r5.A00;
            if (r0 == null) {
                r0 = A0C(A0M);
                r5.A00 = r0;
            }
            Path A062 = A06(r0, r5);
            if (A062 != null) {
                A0M.op(A062, Path.Op.INTERSECT);
            }
        }
        A0M.transform(A052);
        this.A02 = (C198179d2) this.A05.pop();
        return A0M;
    }

    private Path A07(AnonymousClass81V r24) {
        AnonymousClass81V r4 = r24;
        float f = 0.0f;
        float A012 = A01(r4.A00, this);
        AUX aux = r4.A01;
        if (aux != null) {
            f = aux.A03(this);
        }
        float A013 = r4.A02.A01(this);
        float f2 = A012 - A013;
        float f3 = f - A013;
        float f4 = A012 + A013;
        float f5 = f + A013;
        if (r4.A00 == null) {
            float f6 = 2.0f * A013;
            r4.A00 = new C198839eH(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * A013;
        Path A0M = C36441kJ.A0M();
        A0M.moveTo(A012, f3);
        float f8 = A012 + f7;
        float f9 = f - f7;
        A0M.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        A0M.cubicTo(f4, f10, f8, f5, A012, f5);
        float f11 = A012 - f7;
        A0M.cubicTo(f11, f5, f2, f10, f2, f);
        A0M.cubicTo(f2, f9, f11, f3, A012, f3);
        A0M.close();
        return A0M;
    }

    private Path A08(AnonymousClass81W r27) {
        AnonymousClass81W r7 = r27;
        float f = 0.0f;
        float A012 = A01(r7.A00, this);
        AUX aux = r7.A01;
        if (aux != null) {
            f = aux.A03(this);
        }
        float A022 = r7.A02.A02(this);
        float A032 = r7.A03.A03(this);
        float f2 = A012 - A022;
        float f3 = f - A032;
        float f4 = A012 + A022;
        float f5 = f + A032;
        if (r7.A00 == null) {
            r7.A00 = new C198839eH(f2, f3, A022 * 2.0f, 2.0f * A032);
        }
        float f6 = A022 * 0.5522848f;
        float f7 = 0.5522848f * A032;
        Path A0M = C36441kJ.A0M();
        A0M.moveTo(A012, f3);
        float f8 = A012 + f6;
        float f9 = f - f7;
        A0M.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f7 + f;
        A0M.cubicTo(f4, f10, f8, f5, A012, f5);
        float f11 = A012 - f6;
        A0M.cubicTo(f11, f5, f2, f10, f2, f);
        A0M.cubicTo(f2, f9, f11, f3, A012, f3);
        A0M.close();
        return A0M;
    }

    private Path A0A(AnonymousClass81Y r25) {
        float A022;
        float A032;
        AnonymousClass81Y r3 = r25;
        AUX aux = r3.A01;
        if (aux == null && r3.A02 == null) {
            A022 = 0.0f;
            A032 = 0.0f;
        } else {
            AUX aux2 = r3.A02;
            if (aux == null) {
                A022 = aux2.A03(this);
            } else {
                A022 = aux.A02(this);
                if (aux2 != null) {
                    A032 = r3.A02.A03(this);
                }
            }
            A032 = A022;
        }
        float min = Math.min(A022, r3.A03.A02(this) / 2.0f);
        float min2 = Math.min(A032, r3.A00.A03(this) / 2.0f);
        float A012 = A01(r3.A04, this);
        float A002 = A00(r3.A05, this);
        float A023 = r3.A03.A02(this);
        float A033 = r3.A00.A03(this);
        if (r3.A00 == null) {
            r3.A00 = new C198839eH(A012, A002, A023, A033);
        }
        float f = A012 + A023;
        float f2 = A002 + A033;
        Path A0M = C36441kJ.A0M();
        if (min == 0.0f || min2 == 0.0f) {
            A0M.moveTo(A012, A002);
            A0M.lineTo(f, A002);
            A0M.lineTo(f, f2);
            A0M.lineTo(A012, f2);
            A0M.lineTo(A012, A002);
        } else {
            float f3 = min * 0.5522848f;
            float f4 = 0.5522848f * min2;
            float f5 = A002 + min2;
            A0M.moveTo(A012, f5);
            float f6 = f5 - f4;
            float f7 = A012 + min;
            float f8 = f7 - f3;
            A0M.cubicTo(A012, f6, f8, A002, f7, A002);
            float f9 = f - min;
            A0M.lineTo(f9, A002);
            float f10 = f9 + f3;
            float f11 = f;
            A0M.cubicTo(f10, A002, f11, f6, f, f5);
            float f12 = f2 - min2;
            A0M.lineTo(f, f12);
            float f13 = f12 + f4;
            A0M.cubicTo(f11, f13, f10, f2, f9, f2);
            A0M.lineTo(f7, f2);
            A0M.cubicTo(f8, f2, A012, f13, A012, f12);
            A0M.lineTo(A012, f5);
        }
        A0M.close();
        return A0M;
    }

    private Path A0B(AnonymousClass824 r9, boolean z) {
        boolean z2;
        Path path;
        Path A062;
        float f;
        float f2;
        float f3;
        Matrix matrix;
        Path.FillType fillType;
        this.A05.push(this.A02);
        C198179d2 r0 = new C198179d2(this.A02, this);
        this.A02 = r0;
        A0a(r9, r0);
        Boolean bool = this.A02.A04.A0L;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        if (z2 && A0p(this)) {
            if (r9 instanceof C1685481a) {
                if (!z) {
                    A0k("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                C1685481a r3 = (C1685481a) r9;
                AnonymousClass825 A042 = r9.A01.A04(r3.A04);
                if (A042 == null) {
                    A0k("Use reference '%s' not found", r3.A04);
                } else if (A042 instanceof AnonymousClass824) {
                    path = A0B((AnonymousClass824) A042, false);
                    if (path != null) {
                        if (r3.A00 == null) {
                            r3.A00 = A0C(path);
                        }
                        Matrix matrix2 = r3.A00;
                        if (matrix2 != null) {
                            path.transform(matrix2);
                        }
                    }
                    return null;
                }
            } else {
                if (r9 instanceof C1686181h) {
                    C1686181h r1 = (C1686181h) r9;
                    if (r9 instanceof AnonymousClass81T) {
                        path = new C208779yp(((AnonymousClass81T) r9).A00, this).A02;
                        if (r9.A00 == null) {
                            r9.A00 = A0C(path);
                        }
                    } else if (r9 instanceof AnonymousClass81Y) {
                        path = A0A((AnonymousClass81Y) r9);
                    } else if (r9 instanceof AnonymousClass81V) {
                        path = A07((AnonymousClass81V) r9);
                    } else if (r9 instanceof AnonymousClass81W) {
                        path = A08((AnonymousClass81W) r9);
                    } else {
                        if (r9 instanceof AnonymousClass81U) {
                            path = A09((AnonymousClass81U) r9);
                        }
                        return null;
                    }
                    if (r1.A00 == null) {
                        r1.A00 = A0C(path);
                    }
                    matrix = r1.A00;
                } else if (r9 instanceof AnonymousClass820) {
                    AnonymousClass820 r32 = (AnonymousClass820) r9;
                    List list = r32.A02;
                    if (list == null || list.size() == 0) {
                        f = 0.0f;
                    } else {
                        f = ((AUX) r32.A02.get(0)).A02(this);
                    }
                    List list2 = r32.A03;
                    if (list2 == null || list2.size() == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = ((AUX) r32.A03.get(0)).A03(this);
                    }
                    List list3 = r32.A00;
                    if (list3 == null || list3.size() == 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = ((AUX) r32.A00.get(0)).A02(this);
                    }
                    float A022 = A02(r32, this);
                    if (this.A02.A04.A0Y != C023109s.A00) {
                        AnonymousClass827 r02 = new AnonymousClass827(this);
                        A0f(r32, r02);
                        float f4 = r02.A00;
                        if (this.A02.A04.A0Y == C023109s.A01) {
                            f4 /= 2.0f;
                        }
                        f -= f4;
                    }
                    A0g(r32, this, f, f2);
                    path = C36441kJ.A0M();
                    A0f(r32, new AnonymousClass829(path, this, f + f3, f2 + A022));
                    matrix = r32.A00;
                } else {
                    A0k("Invalid %s element found in clipPath definition", r9.A00());
                    return null;
                }
                if (matrix != null) {
                    path.transform(matrix);
                }
                Integer num = this.A02.A04.A0T;
                if (num == null || num != C023109s.A01) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path.setFillType(fillType);
            }
            if (!(this.A02.A04.A0a == null || (A062 = A06(r9.A00, r9)) == null)) {
                path.op(A062, Path.Op.INTERSECT);
            }
            this.A02 = (C198179d2) this.A05.pop();
            return path;
        }
        this.A02 = (C198179d2) this.A05.pop();
        return null;
    }

    private Integer A0E() {
        Integer num;
        AUW auw = this.A02.A04;
        Integer num2 = auw.A05;
        Integer num3 = C023109s.A00;
        if (num2 == num3 || (num = auw.A0Y) == C023109s.A01) {
            return auw.A0Y;
        }
        if (num == num3) {
            return C023109s.A0C;
        }
        return num3;
    }

    private String A0F(String str, boolean z, boolean z2) {
        String str2;
        if (this.A02.A07) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (z) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z2) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, " ");
    }

    private void A0G() {
        C1686981p r1;
        AUW auw = this.A02.A04;
        AUT aut = auw.A0K;
        if (aut instanceof C1686981p) {
            r1 = (C1686981p) aut;
        } else if (aut instanceof C1686881o) {
            r1 = auw.A00;
        } else {
            return;
        }
        int i = r1.A00;
        Float f = auw.A0S;
        if (f != null) {
            i = A03(i, f.floatValue());
        }
        this.A00.drawColor(i);
    }

    public static void A0I(Matrix matrix, AnonymousClass9p5 r2) {
        if (matrix != null) {
            r2.A00.concat(matrix);
        }
    }

    private void A0J(Path path) {
        C198179d2 r2 = this.A02;
        Integer num = r2.A04.A0Z;
        Integer num2 = C023109s.A01;
        Canvas canvas = this.A00;
        if (num == num2) {
            Matrix matrix = canvas.getMatrix();
            Path A0M = C36441kJ.A0M();
            path.transform(matrix, A0M);
            canvas.setMatrix(C90524aI.A0B());
            Shader shader = this.A02.A01.getShader();
            Matrix A0B = C90524aI.A0B();
            if (shader != null) {
                shader.getLocalMatrix(A0B);
                Matrix matrix2 = new Matrix(A0B);
                matrix2.postConcat(matrix);
                shader.setLocalMatrix(matrix2);
            }
            canvas.drawPath(A0M, this.A02.A01);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(A0B);
                return;
            }
            return;
        }
        canvas.drawPath(path, r2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0177, code lost:
        if (r4 != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r0.booleanValue() == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0K(android.graphics.Path r20, X.AnonymousClass824 r21) {
        /*
            r19 = this;
            r10 = r19
            X.9d2 r0 = r10.A02
            X.AUW r0 = r0.A04
            X.AUT r2 = r0.A0G
            boolean r0 = r2 instanceof X.C1686781n
            r6 = r20
            if (r0 == 0) goto L_0x01d1
            X.9gS r1 = r10.A01
            X.81n r2 = (X.C1686781n) r2
            java.lang.String r0 = r2.A01
            X.825 r9 = r1.A04(r0)
            boolean r0 = r9 instanceof X.C1687681w
            if (r0 == 0) goto L_0x01d1
            X.81w r9 = (X.C1687681w) r9
            java.lang.Boolean r0 = r9.A06
            r18 = 1
            r17 = 0
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            java.lang.String r0 = r9.A07
            if (r0 == 0) goto L_0x0035
            r10.A0U(r9, r0)
        L_0x0035:
            r8 = 0
            X.AUX r0 = r9.A03
            r11 = r21
            if (r1 == 0) goto L_0x018b
            float r16 = A01(r0, r10)
            X.AUX r0 = r9.A04
            float r2 = A00(r0, r10)
            X.AUX r0 = r9.A02
            float r1 = A01(r0, r10)
            X.AUX r0 = r9.A01
            float r0 = A00(r0, r10)
        L_0x0052:
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01da
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01da
            X.9fC r8 = r9.A00
            if (r8 != 0) goto L_0x0060
            X.9fC r8 = X.C199369fC.A02
        L_0x0060:
            A0j(r10)
            android.graphics.Canvas r7 = r10.A00
            r7.clipPath(r6)
            X.9d2 r5 = new X.9d2
            r5.<init>(r10)
            X.AUW r3 = X.AUW.A00()
            A0V(r3, r5, r10)
            X.AUW r4 = r5.A04
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r17)
            r4.A0M = r3
            r10.A0c(r9, r5)
            r10.A02 = r5
            X.9eH r6 = r11.A00
            android.graphics.Matrix r3 = r9.A00
            if (r3 == 0) goto L_0x0107
            r7.concat(r3)
            android.graphics.Matrix r5 = X.C90524aI.A0B()
            android.graphics.Matrix r3 = r9.A00
            boolean r3 = r3.invert(r5)
            if (r3 == 0) goto L_0x0107
            r3 = 8
            float[] r15 = new float[r3]
            X.9eH r13 = r11.A00
            float r12 = r13.A01
            r15[r17] = r12
            float r6 = r13.A02
            r15[r18] = r6
            float r3 = r13.A03
            float r4 = r12 + r3
            r3 = 2
            r15[r3] = r4
            r3 = 3
            r15[r3] = r6
            r3 = 4
            r15[r3] = r4
            r4 = 5
            float r3 = r13.A00
            float r6 = r6 + r3
            r15[r4] = r6
            r14 = 6
            r15[r14] = r12
            r3 = 7
            r15[r3] = r6
            r5.mapPoints(r15)
            r4 = r15[r17]
            r3 = r15[r18]
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r4, r3, r4, r3)
            r6 = 2
        L_0x00ca:
            r3 = r15[r6]
            float r12 = r13.left
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x00d6
            r12 = r15[r6]
            r13.left = r12
        L_0x00d6:
            r3 = r15[r6]
            float r5 = r13.right
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e2
            r5 = r15[r6]
            r13.right = r5
        L_0x00e2:
            int r18 = r6 + 1
            r3 = r15[r18]
            float r4 = r13.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f0
            r4 = r15[r18]
            r13.top = r4
        L_0x00f0:
            r17 = r15[r18]
            float r3 = r13.bottom
            int r17 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r17 <= 0) goto L_0x00fc
            r3 = r15[r18]
            r13.bottom = r3
        L_0x00fc:
            int r6 = r6 + 2
            if (r6 <= r14) goto L_0x00ca
            float r5 = r5 - r12
            float r3 = r3 - r4
            X.9eH r6 = new X.9eH
            r6.<init>(r12, r4, r5, r3)
        L_0x0107:
            float r5 = r6.A01
            float r3 = r5 - r16
            float r3 = r3 / r1
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r12 = (float) r3
            float r12 = r12 * r1
            float r16 = r16 + r12
            float r12 = r6.A02
            float r3 = r12 - r2
            float r3 = r3 / r0
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r13 = (float) r3
            float r13 = r13 * r0
            float r2 = r2 + r13
            float r3 = r6.A03
            float r5 = r5 + r3
            float r3 = r6.A00
            float r12 = r12 + r3
            r3 = 0
            X.9eH r13 = new X.9eH
            r13.<init>(r3, r3, r1, r0)
            boolean r14 = r10.A0l()
        L_0x0132:
            int r3 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01c8
            r6 = r16
        L_0x0138:
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0189
            r13.A01 = r6
            r13.A02 = r2
            A0j(r10)
            X.9d2 r3 = r10.A02
            A0O(r13, r3, r10)
            X.9eH r3 = r9.A00
            if (r3 == 0) goto L_0x016e
            android.graphics.Matrix r3 = A04(r8, r13, r3)
            r7.concat(r3)
        L_0x0153:
            java.util.List r3 = r9.A05
            java.util.Iterator r4 = r3.iterator()
        L_0x0159:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0169
            java.lang.Object r3 = r4.next()
            X.9QD r3 = (X.AnonymousClass9QD) r3
            r10.A0b(r3)
            goto L_0x0159
        L_0x0169:
            A0i(r10)
            float r6 = r6 + r1
            goto L_0x0138
        L_0x016e:
            java.lang.Boolean r3 = r9.A05
            if (r3 == 0) goto L_0x0179
            boolean r4 = r3.booleanValue()
            r3 = 0
            if (r4 == 0) goto L_0x017a
        L_0x0179:
            r3 = 1
        L_0x017a:
            r7.translate(r6, r2)
            if (r3 != 0) goto L_0x0153
            X.9eH r3 = r11.A00
            float r4 = r3.A03
            float r3 = r3.A00
            r7.scale(r4, r3)
            goto L_0x0153
        L_0x0189:
            float r2 = r2 + r0
            goto L_0x0132
        L_0x018b:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01c5
            float r16 = r0.A04(r10, r3)
        L_0x0193:
            X.AUX r0 = r9.A04
            if (r0 == 0) goto L_0x01c3
            float r2 = r0.A04(r10, r3)
        L_0x019b:
            X.AUX r0 = r9.A02
            if (r0 == 0) goto L_0x01c1
            float r1 = r0.A04(r10, r3)
        L_0x01a3:
            X.AUX r0 = r9.A01
            if (r0 == 0) goto L_0x01bf
            float r0 = r0.A04(r10, r3)
        L_0x01ab:
            X.9eH r7 = r11.A00
            float r3 = r7.A01
            float r5 = r7.A03
            float r16 = r16 * r5
            float r16 = r16 + r3
            float r4 = r7.A02
            float r3 = r7.A00
            float r2 = r2 * r3
            float r2 = r2 + r4
            float r1 = r1 * r5
            float r0 = r0 * r3
            goto L_0x0052
        L_0x01bf:
            r0 = 0
            goto L_0x01ab
        L_0x01c1:
            r1 = 0
            goto L_0x01a3
        L_0x01c3:
            r2 = 0
            goto L_0x019b
        L_0x01c5:
            r16 = 0
            goto L_0x0193
        L_0x01c8:
            if (r14 == 0) goto L_0x01cd
            r10.A0Y(r9)
        L_0x01cd:
            A0i(r10)
            return
        L_0x01d1:
            android.graphics.Canvas r1 = r10.A00
            X.9d2 r0 = r10.A02
            android.graphics.Paint r0 = r0.A00
            r1.drawPath(r6, r0)
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0K(android.graphics.Path, X.824):void");
    }

    public static void A0L(C199369fC r3, C198839eH r4, C198839eH r5, C1687281s r6, AnonymousClass9p5 r7) {
        if (r4.A03 != 0.0f && r4.A00 != 0.0f) {
            if (r3 == null && (r3 = r6.A00) == null) {
                r3 = C199369fC.A02;
            }
            if (A0o(r6, r7)) {
                C198179d2 r0 = r7.A02;
                r0.A03 = r4;
                A0O(r4, r0, r7);
                r7.A0N(r7.A02.A03, r6);
                Canvas canvas = r7.A00;
                C198839eH r02 = r7.A02.A03;
                if (r5 != null) {
                    canvas.concat(A04(r3, r02, r5));
                    r7.A02.A02 = r6.A00;
                } else {
                    canvas.translate(r02.A01, r02.A02);
                }
                boolean A0l = r7.A0l();
                r7.A0G();
                r7.A0W(r6, true);
                if (A0l) {
                    r7.A0Y(r6);
                }
                r7.A0Z(r6);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r0.booleanValue() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e3, code lost:
        if (r0.booleanValue() == false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M(X.C198839eH r23, X.C1686781n r24, boolean r25) {
        /*
            r22 = this;
            r2 = r22
            X.9gS r0 = r2.A01
            r6 = r24
            java.lang.String r4 = r6.A01
            X.825 r5 = r0.A04(r4)
            r8 = r25
            if (r5 != 0) goto L_0x002e
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            if (r25 == 0) goto L_0x002b
            java.lang.String r0 = "Fill"
        L_0x0018:
            r3 = 0
            X.C90494aF.A1H(r0, r4, r1)
            java.lang.String r0 = "%s reference '%s' not found"
            A0k(r0, r1)
            X.AUT r1 = r6.A00
            X.9d2 r0 = r2.A02
            if (r1 == 0) goto L_0x01d7
            A0e(r1, r0, r8)
        L_0x002a:
            return
        L_0x002b:
            java.lang.String r0 = "Stroke"
            goto L_0x0018
        L_0x002e:
            boolean r0 = r5 instanceof X.AnonymousClass81R
            r4 = r23
            if (r0 == 0) goto L_0x00cc
            X.81R r5 = (X.AnonymousClass81R) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x003d
            r2.A0P(r5, r0)
        L_0x003d:
            java.lang.Boolean r0 = r5.A01
            r3 = 1
            r10 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.booleanValue()
            r9 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r9 = 0
        L_0x004b:
            X.9d2 r1 = r2.A02
            if (r25 == 0) goto L_0x00c9
            android.graphics.Paint r0 = r1.A00
        L_0x0051:
            if (r9 == 0) goto L_0x009b
            X.9eH r6 = r1.A02
            if (r6 != 0) goto L_0x0059
            X.9eH r6 = r1.A03
        L_0x0059:
            X.AUX r1 = r5.A00
            float r15 = A01(r1, r2)
            X.AUX r1 = r5.A02
            float r16 = A00(r1, r2)
            X.AUX r1 = r5.A01
            if (r1 == 0) goto L_0x0098
            float r6 = r1.A02(r2)
        L_0x006d:
            X.AUX r1 = r5.A03
            if (r1 == 0) goto L_0x00c6
            float r18 = r1.A03(r2)
        L_0x0075:
            A0j(r2)
            A0d(r5, r2)
            android.graphics.Matrix r7 = A05(r4, r9)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0086
            r7.preConcat(r1)
        L_0x0086:
            java.util.List r1 = r5.A04
            int r9 = r1.size()
            if (r9 != 0) goto L_0x01e2
            A0i(r2)
            X.9d2 r0 = r2.A02
            if (r25 == 0) goto L_0x01df
            r0.A05 = r10
            return
        L_0x0098:
            float r6 = r6.A03
            goto L_0x006d
        L_0x009b:
            X.AUX r1 = r5.A00
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x00c4
            float r15 = r1.A04(r2, r7)
        L_0x00a5:
            X.AUX r1 = r5.A02
            if (r1 == 0) goto L_0x00c1
            float r16 = r1.A04(r2, r7)
        L_0x00ad:
            X.AUX r1 = r5.A01
            if (r1 == 0) goto L_0x00be
            float r6 = r1.A04(r2, r7)
        L_0x00b5:
            X.AUX r1 = r5.A03
            if (r1 == 0) goto L_0x00c6
            float r18 = r1.A04(r2, r7)
            goto L_0x0075
        L_0x00be:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b5
        L_0x00c1:
            r16 = 0
            goto L_0x00ad
        L_0x00c4:
            r15 = 0
            goto L_0x00a5
        L_0x00c6:
            r18 = 0
            goto L_0x0075
        L_0x00c9:
            android.graphics.Paint r0 = r1.A01
            goto L_0x0051
        L_0x00cc:
            boolean r0 = r5 instanceof X.AnonymousClass81S
            if (r0 == 0) goto L_0x0164
            X.81S r5 = (X.AnonymousClass81S) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x00d9
            r2.A0P(r5, r0)
        L_0x00d9:
            java.lang.Boolean r0 = r5.A01
            r7 = 0
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 != 0) goto L_0x00e6
        L_0x00e5:
            r6 = 0
        L_0x00e6:
            X.9d2 r0 = r2.A02
            if (r25 == 0) goto L_0x0161
            android.graphics.Paint r0 = r0.A00
        L_0x00ec:
            if (r6 == 0) goto L_0x013d
            r9 = 1112014848(0x42480000, float:50.0)
            java.lang.Integer r1 = X.C023109s.A0X
            X.AUX r3 = new X.AUX
            r3.<init>(r1, r9)
            X.AUX r1 = r5.A00
            if (r1 == 0) goto L_0x0138
            float r11 = r1.A02(r2)
        L_0x00ff:
            X.AUX r1 = r5.A01
            if (r1 == 0) goto L_0x0133
            float r12 = r1.A03(r2)
        L_0x0107:
            X.AUX r1 = r5.A04
            if (r1 == 0) goto L_0x010c
            r3 = r1
        L_0x010c:
            float r13 = r3.A01(r2)
        L_0x0110:
            A0j(r2)
            A0d(r5, r2)
            android.graphics.Matrix r4 = A05(r4, r6)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0121
            r4.preConcat(r1)
        L_0x0121:
            java.util.List r1 = r5.A04
            int r3 = r1.size()
            if (r3 != 0) goto L_0x027a
            A0i(r2)
            X.9d2 r0 = r2.A02
            if (r25 == 0) goto L_0x0277
            r0.A05 = r7
            return
        L_0x0133:
            float r12 = r3.A03(r2)
            goto L_0x0107
        L_0x0138:
            float r11 = r3.A02(r2)
            goto L_0x00ff
        L_0x013d:
            X.AUX r1 = r5.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x015b
            float r11 = r1.A04(r2, r3)
        L_0x0147:
            X.AUX r1 = r5.A01
            if (r1 == 0) goto L_0x0158
            float r12 = r1.A04(r2, r3)
        L_0x014f:
            X.AUX r1 = r5.A04
            if (r1 == 0) goto L_0x015e
            float r13 = r1.A04(r2, r3)
            goto L_0x0110
        L_0x0158:
            r12 = 1056964608(0x3f000000, float:0.5)
            goto L_0x014f
        L_0x015b:
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0147
        L_0x015e:
            r13 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0110
        L_0x0161:
            android.graphics.Paint r0 = r0.A01
            goto L_0x00ec
        L_0x0164:
            boolean r0 = r5 instanceof X.C1686481k
            if (r0 == 0) goto L_0x002a
            r10 = 1
            r6 = 6442450944(0x180000000, double:3.1829936864E-314)
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            X.AUW r9 = r5.A02
            boolean r0 = A0m(r9, r0)
            if (r25 == 0) goto L_0x01ad
            if (r0 == 0) goto L_0x018f
            X.9d2 r5 = r2.A02
            X.AUW r1 = r5.A04
            X.AUT r0 = r9.A0H
            r1.A0G = r0
            if (r0 != 0) goto L_0x018d
            r10 = 0
        L_0x018d:
            r5.A05 = r10
        L_0x018f:
            boolean r0 = A0m(r9, r3)
            if (r0 == 0) goto L_0x019d
            X.9d2 r0 = r2.A02
            X.AUW r1 = r0.A04
            java.lang.Float r0 = r9.A0P
            r1.A0N = r0
        L_0x019d:
            boolean r0 = A0m(r9, r6)
            if (r0 == 0) goto L_0x002a
            X.9d2 r1 = r2.A02
            X.AUW r0 = r1.A04
            X.AUT r0 = r0.A0G
        L_0x01a9:
            A0e(r0, r1, r8)
            return
        L_0x01ad:
            if (r0 == 0) goto L_0x01bc
            X.9d2 r5 = r2.A02
            X.AUW r1 = r5.A04
            X.AUT r0 = r9.A0H
            r1.A0J = r0
            if (r0 != 0) goto L_0x01ba
            r10 = 0
        L_0x01ba:
            r5.A06 = r10
        L_0x01bc:
            boolean r0 = A0m(r9, r3)
            if (r0 == 0) goto L_0x01ca
            X.9d2 r0 = r2.A02
            X.AUW r1 = r0.A04
            java.lang.Float r0 = r9.A0P
            r1.A0R = r0
        L_0x01ca:
            boolean r0 = A0m(r9, r6)
            if (r0 == 0) goto L_0x002a
            X.9d2 r1 = r2.A02
            X.AUW r0 = r1.A04
            X.AUT r0 = r0.A0J
            goto L_0x01a9
        L_0x01d7:
            if (r25 == 0) goto L_0x01dc
            r0.A05 = r3
            return
        L_0x01dc:
            r0.A06 = r3
            return
        L_0x01df:
            r0.A06 = r10
            return
        L_0x01e2:
            int[] r8 = new int[r9]
            float[] r4 = new float[r9]
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r1 = r5.A04
            java.util.Iterator r13 = r1.iterator()
        L_0x01ee:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x023a
            java.lang.Object r11 = r13.next()
            X.9QD r11 = (X.AnonymousClass9QD) r11
            X.81l r11 = (X.C1686581l) r11
            java.lang.Float r1 = r11.A00
            if (r1 == 0) goto L_0x0238
            float r12 = r1.floatValue()
        L_0x0204:
            if (r10 == 0) goto L_0x0234
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x0234
            r4[r10] = r14
        L_0x020c:
            A0j(r2)
            X.9d2 r1 = r2.A02
            r2.A0a(r11, r1)
            X.9d2 r1 = r2.A02
            X.AUW r12 = r1.A04
            X.AUT r1 = r12.A0I
            X.81p r1 = (X.C1686981p) r1
            if (r1 != 0) goto L_0x0220
            X.81p r1 = X.C1686981p.A01
        L_0x0220:
            int r11 = r1.A00
            java.lang.Float r1 = r12.A0Q
            float r1 = r1.floatValue()
            int r1 = A03(r11, r1)
            r8[r10] = r1
            int r10 = r10 + 1
            A0i(r2)
            goto L_0x01ee
        L_0x0234:
            r4[r10] = r12
            r14 = r12
            goto L_0x020c
        L_0x0238:
            r12 = 0
            goto L_0x0204
        L_0x023a:
            int r1 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0242
            int r1 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x026d
        L_0x0242:
            if (r9 == r3) goto L_0x026d
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.CLAMP
            java.lang.Integer r3 = r5.A02
            if (r3 == 0) goto L_0x0250
            java.lang.Integer r1 = X.C023109s.A01
            if (r3 != r1) goto L_0x0266
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.MIRROR
        L_0x0250:
            A0i(r2)
            android.graphics.LinearGradient r14 = new android.graphics.LinearGradient
            r19 = r8
            r20 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r14.setLocalMatrix(r7)
            r0.setShader(r14)
            goto L_0x02f2
        L_0x0266:
            java.lang.Integer r1 = X.C023109s.A0C
            if (r3 != r1) goto L_0x0250
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x0250
        L_0x026d:
            A0i(r2)
            int r9 = r9 - r3
            r1 = r8[r9]
            r0.setColor(r1)
            return
        L_0x0277:
            r0.A06 = r7
            return
        L_0x027a:
            int[] r14 = new int[r3]
            float[] r15 = new float[r3]
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r1 = r5.A04
            java.util.Iterator r9 = r1.iterator()
        L_0x0286:
            boolean r1 = r9.hasNext()
            r8 = 0
            if (r1 == 0) goto L_0x02d1
            java.lang.Object r6 = r9.next()
            X.9QD r6 = (X.AnonymousClass9QD) r6
            X.81l r6 = (X.C1686581l) r6
            java.lang.Float r1 = r6.A00
            if (r1 == 0) goto L_0x029d
            float r8 = r1.floatValue()
        L_0x029d:
            if (r7 == 0) goto L_0x02cd
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x02cd
            r15[r7] = r10
        L_0x02a5:
            A0j(r2)
            X.9d2 r1 = r2.A02
            r2.A0a(r6, r1)
            X.9d2 r1 = r2.A02
            X.AUW r8 = r1.A04
            X.AUT r1 = r8.A0I
            X.81p r1 = (X.C1686981p) r1
            if (r1 != 0) goto L_0x02b9
            X.81p r1 = X.C1686981p.A01
        L_0x02b9:
            int r6 = r1.A00
            java.lang.Float r1 = r8.A0Q
            float r1 = r1.floatValue()
            int r1 = A03(r6, r1)
            r14[r7] = r1
            int r7 = r7 + 1
            A0i(r2)
            goto L_0x0286
        L_0x02cd:
            r15[r7] = r8
            r10 = r8
            goto L_0x02a5
        L_0x02d1:
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0315
            r1 = 1
            if (r3 == r1) goto L_0x0315
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            java.lang.Integer r3 = r5.A02
            if (r3 == 0) goto L_0x02e4
            java.lang.Integer r1 = X.C023109s.A01
            if (r3 != r1) goto L_0x030e
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.MIRROR
        L_0x02e4:
            A0i(r2)
            android.graphics.RadialGradient r10 = new android.graphics.RadialGradient
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r10.setLocalMatrix(r4)
            r0.setShader(r10)
        L_0x02f2:
            X.9d2 r1 = r2.A02
            X.AUW r1 = r1.A04
            java.lang.Float r1 = r1.A0N
            float r2 = r1.floatValue()
            r1 = 1132462080(0x43800000, float:256.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 >= 0) goto L_0x0309
            r2 = 0
        L_0x0305:
            r0.setAlpha(r2)
            return
        L_0x0309:
            if (r2 <= r1) goto L_0x0305
            r2 = 255(0xff, float:3.57E-43)
            goto L_0x0305
        L_0x030e:
            java.lang.Integer r1 = X.C023109s.A0C
            if (r3 != r1) goto L_0x02e4
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x02e4
        L_0x0315:
            A0i(r2)
            r1 = 1
            int r3 = r3 - r1
            r1 = r14[r3]
            r0.setColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0M(X.9eH, X.81n, boolean):void");
    }

    private void A0N(C198839eH r3, AnonymousClass824 r4) {
        Path A062;
        if (this.A02.A04.A0a != null && (A062 = A06(r3, r4)) != null) {
            this.A00.clipPath(A062);
        }
    }

    public static void A0O(C198839eH r4, C198179d2 r5, AnonymousClass9p5 r6) {
        if (!r5.A04.A0M.booleanValue()) {
            r6.A0H(r4.A01, r4.A02, r4.A03, r4.A00);
        }
    }

    private void A0P(C1686381j r5, String str) {
        Object[] objArr;
        String str2;
        AnonymousClass825 A042 = r5.A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Gradient reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(A042 instanceof C1686381j)) {
            objArr = new Object[0];
            str2 = "Gradient href attributes must point to other gradient elements";
        } else if (A042 == r5) {
            objArr = new Object[]{str};
            str2 = "Circular reference in gradient href attribute '%s'";
        } else {
            C1686381j r2 = (C1686381j) A042;
            if (r5.A01 == null) {
                r5.A01 = r2.A01;
            }
            if (r5.A00 == null) {
                r5.A00 = r2.A00;
            }
            if (r5.A02 == null) {
                r5.A02 = r2.A02;
            }
            if (r5.A04.isEmpty()) {
                r5.A04 = r2.A04;
            }
            try {
                if (r5 instanceof AnonymousClass81R) {
                    AnonymousClass81R r1 = (AnonymousClass81R) r5;
                    AnonymousClass81R r3 = (AnonymousClass81R) A042;
                    if (r1.A00 == null) {
                        r1.A00 = r3.A00;
                    }
                    if (r1.A02 == null) {
                        r1.A02 = r3.A02;
                    }
                    if (r1.A01 == null) {
                        r1.A01 = r3.A01;
                    }
                    if (r1.A03 == null) {
                        r1.A03 = r3.A03;
                    }
                } else {
                    AnonymousClass81S r12 = (AnonymousClass81S) r5;
                    AnonymousClass81S r32 = (AnonymousClass81S) A042;
                    if (r12.A00 == null) {
                        r12.A00 = r32.A00;
                    }
                    if (r12.A01 == null) {
                        r12.A01 = r32.A01;
                    }
                    if (r12.A04 == null) {
                        r12.A04 = r32.A04;
                    }
                    if (r12.A02 == null) {
                        r12.A02 = r32.A02;
                    }
                    if (r12.A03 == null) {
                        r12.A03 = r32.A03;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str3 = r2.A03;
            if (str3 != null) {
                A0P(r5, str3);
                return;
            }
            return;
        }
        A0k(str2, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q(X.C1686181h r25) {
        /*
            r24 = this;
            r8 = r25
            r1 = r24
            X.9d2 r0 = r1.A02
            X.AUW r2 = r0.A04
            java.lang.String r4 = r2.A0B
            if (r4 != 0) goto L_0x0015
            java.lang.String r0 = r2.A0A
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r2.A09
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r7 = "Marker reference '%s' not found"
            r16 = 0
            r2 = 0
            r3 = 1
            if (r4 == 0) goto L_0x01cf
            X.9gS r0 = r8.A01
            X.825 r6 = r0.A04(r4)
            if (r6 == 0) goto L_0x01c2
            X.81v r6 = (X.C1687581v) r6
        L_0x0027:
            X.9d2 r0 = r1.A02
            X.AUW r0 = r0.A04
            java.lang.String r4 = r0.A0A
            if (r4 == 0) goto L_0x01be
            X.9gS r0 = r8.A01
            X.825 r5 = r0.A04(r4)
            if (r5 == 0) goto L_0x01b1
            X.81v r5 = (X.C1687581v) r5
        L_0x0039:
            X.9d2 r0 = r1.A02
            X.AUW r0 = r0.A04
            java.lang.String r4 = r0.A09
            if (r4 == 0) goto L_0x01ad
            X.9gS r0 = r8.A01
            X.825 r4 = r0.A04(r4)
            if (r4 == 0) goto L_0x01a0
            X.81v r4 = (X.C1687581v) r4
        L_0x004b:
            boolean r0 = r8 instanceof X.AnonymousClass81T
            if (r0 == 0) goto L_0x00db
            X.81T r8 = (X.AnonymousClass81T) r8
            X.9yr r7 = r8.A00
            X.9yq r0 = new X.9yq
            r0.<init>(r7, r1)
            java.util.List r0 = r0.A00
        L_0x005a:
            int r8 = r0.size()
            if (r8 == 0) goto L_0x0014
            X.9d2 r7 = r1.A02
            X.AUW r9 = r7.A04
            r7 = r16
            r9.A09 = r7
            r9.A0A = r7
            r9.A0B = r7
            if (r6 == 0) goto L_0x0077
            java.lang.Object r7 = r0.get(r2)
            X.9X5 r7 = (X.AnonymousClass9X5) r7
            r1.A0R(r6, r7)
        L_0x0077:
            if (r5 == 0) goto L_0x01d3
            int r7 = r0.size()
            r6 = 2
            if (r7 <= r6) goto L_0x01d3
            java.lang.Object r13 = r0.get(r2)
            X.9X5 r13 = (X.AnonymousClass9X5) r13
            java.lang.Object r10 = r0.get(r3)
            X.9X5 r10 = (X.AnonymousClass9X5) r10
            r9 = 1
        L_0x008d:
            int r2 = r8 + -1
            if (r9 >= r2) goto L_0x01d3
            int r9 = r9 + 1
            java.lang.Object r7 = r0.get(r9)
            X.9X5 r7 = (X.AnonymousClass9X5) r7
            boolean r2 = r10.A00
            if (r2 == 0) goto L_0x00ce
            float r12 = r10.A01
            float r11 = r10.A02
            float r15 = r10.A03
            float r2 = r13.A03
            float r6 = r15 - r2
            float r14 = r10.A04
            float r2 = r13.A04
            float r2 = r14 - r2
            float r6 = X.C90514aH.A00(r12, r6, r11, r2)
            r13 = 0
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00c0
            float r6 = r7.A03
            float r6 = r6 - r15
            float r2 = r7.A04
            float r2 = r2 - r14
            float r6 = X.C90514aH.A00(r12, r6, r11, r2)
        L_0x00c0:
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00ce
            if (r2 != 0) goto L_0x00d4
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00ce
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00d4
        L_0x00ce:
            r13 = r10
            r1.A0R(r5, r10)
            r10 = r7
            goto L_0x008d
        L_0x00d4:
            float r2 = -r12
            r10.A01 = r2
            float r2 = -r11
            r10.A02 = r2
            goto L_0x00ce
        L_0x00db:
            boolean r0 = r8 instanceof X.AnonymousClass81X
            if (r0 == 0) goto L_0x011d
            X.81X r8 = (X.AnonymousClass81X) r8
            X.AUX r0 = r8.A00
            float r9 = A01(r0, r1)
            X.AUX r0 = r8.A02
            float r10 = A00(r0, r1)
            X.AUX r0 = r8.A01
            float r19 = A01(r0, r1)
            X.AUX r0 = r8.A03
            float r20 = A00(r0, r1)
            r0 = 2
            java.util.ArrayList r0 = X.C36441kJ.A14(r0)
            float r11 = r19 - r9
            float r12 = r20 - r10
            X.9X5 r7 = new X.9X5
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
            X.9X5 r7 = new X.9X5
            r17 = r7
            r18 = r1
            r21 = r11
            r22 = r12
            r17.<init>(r18, r19, r20, r21, r22)
            r0.add(r7)
            goto L_0x005a
        L_0x011d:
            X.81U r8 = (X.AnonymousClass81U) r8
            float[] r11 = r8.A00
            int r0 = r11.length
            r23 = r0
            r10 = 2
            if (r0 < r10) goto L_0x0014
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r14 = r11[r2]
            r7 = r11[r3]
            r21 = 0
            X.9X5 r9 = new X.9X5
            r22 = 0
            r19 = r14
            r20 = r7
            r17 = r9
            r18 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            r13 = 0
            r12 = 0
        L_0x0142:
            r15 = r23
            if (r10 >= r15) goto L_0x0168
            r13 = r11[r10]
            int r12 = r10 + 1
            r12 = r11[r12]
            r9.A00(r13, r12)
            r0.add(r9)
            float r15 = r9.A03
            float r21 = r13 - r15
            float r9 = r9.A04
            float r22 = r12 - r9
            X.9X5 r9 = new X.9X5
            r19 = r13
            r20 = r12
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            int r10 = r10 + 2
            goto L_0x0142
        L_0x0168:
            boolean r8 = r8 instanceof X.C1685781d
            if (r8 == 0) goto L_0x019b
            int r8 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x005a
            int r8 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x005a
            r9.A00(r14, r7)
            r0.add(r9)
            float r8 = r9.A03
            float r12 = r14 - r8
            float r8 = r9.A04
            float r13 = r7 - r8
            X.9X5 r8 = new X.9X5
            r10 = r14
            r11 = r7
            r9 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Object r7 = r0.get(r2)
            X.9X5 r7 = (X.AnonymousClass9X5) r7
            r8.A01(r7)
            r0.add(r8)
            r0.set(r2, r8)
            goto L_0x005a
        L_0x019b:
            r0.add(r9)
            goto L_0x005a
        L_0x01a0:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.9d2 r0 = r1.A02
            X.AUW r0 = r0.A04
            java.lang.String r0 = r0.A09
            r4[r2] = r0
            A0k(r7, r4)
        L_0x01ad:
            r4 = r16
            goto L_0x004b
        L_0x01b1:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.9d2 r0 = r1.A02
            X.AUW r0 = r0.A04
            java.lang.String r0 = r0.A0A
            r4[r2] = r0
            A0k(r7, r4)
        L_0x01be:
            r5 = r16
            goto L_0x0039
        L_0x01c2:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.9d2 r0 = r1.A02
            X.AUW r0 = r0.A04
            java.lang.String r0 = r0.A0B
            r4[r2] = r0
            A0k(r7, r4)
        L_0x01cf:
            r6 = r16
            goto L_0x0027
        L_0x01d3:
            if (r4 == 0) goto L_0x0014
            int r8 = r8 - r3
            java.lang.Object r0 = r0.get(r8)
            X.9X5 r0 = (X.AnonymousClass9X5) r0
            r1.A0R(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0Q(X.81h):void");
    }

    private void A0U(C1687681w r5, String str) {
        Object[] objArr;
        String str2;
        AnonymousClass825 A042 = r5.A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Pattern reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(A042 instanceof C1687681w)) {
            objArr = new Object[0];
            str2 = "Pattern href attributes must point to other pattern elements";
        } else if (A042 == r5) {
            objArr = new Object[]{str};
            str2 = "Circular reference in pattern href attribute '%s'";
        } else {
            C1687681w r1 = (C1687681w) A042;
            if (r5.A06 == null) {
                r5.A06 = r1.A06;
            }
            if (r5.A05 == null) {
                r5.A05 = r1.A05;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            if (r5.A03 == null) {
                r5.A03 = r1.A03;
            }
            if (r5.A04 == null) {
                r5.A04 = r1.A04;
            }
            if (r5.A02 == null) {
                r5.A02 = r1.A02;
            }
            if (r5.A01 == null) {
                r5.A01 = r1.A01;
            }
            if (r5.A05.isEmpty()) {
                r5.A05 = r1.A05;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            String str3 = r1.A07;
            if (str3 != null) {
                A0U(r5, str3);
                return;
            }
            return;
        }
        A0k(str2, objArr);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r4 == X.C1686981p.A02) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x028e, code lost:
        if (r6.equals(r0) == false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0290, code lost:
        r0 = android.graphics.Typeface.SANS_SERIF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0292, code lost:
        r1 = android.graphics.Typeface.create(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0296, code lost:
        if (r1 == null) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x021d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r4 == X.C1686981p.A02) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0V(X.AUW r12, X.C198179d2 r13, X.AnonymousClass9p5 r14) {
        /*
            r0 = 4096(0x1000, double:2.0237E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x000e
            X.AUW r1 = r13.A04
            X.81p r0 = r12.A00
            r1.A00 = r0
        L_0x000e:
            r0 = 2048(0x800, double:1.0118E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x001c
            X.AUW r1 = r13.A04
            java.lang.Float r0 = r12.A0O
            r1.A0O = r0
        L_0x001c:
            r0 = 1
            boolean r0 = A0m(r12, r0)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0038
            X.AUW r1 = r13.A04
            X.AUT r0 = r12.A0G
            r1.A0G = r0
            X.AUT r4 = r12.A0G
            if (r4 == 0) goto L_0x0035
            X.81p r1 = X.C1686981p.A02
            r0 = 1
            if (r4 != r1) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r13.A05 = r0
        L_0x0038:
            r0 = 4
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0046
            X.AUW r1 = r13.A04
            java.lang.Float r0 = r12.A0N
            r1.A0N = r0
        L_0x0046:
            r0 = 6149(0x1805, double:3.038E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0055
            X.AUW r0 = r13.A04
            X.AUT r0 = r0.A0G
            A0e(r0, r13, r3)
        L_0x0055:
            r0 = 2
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0063
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A0U
            r1.A0U = r0
        L_0x0063:
            r0 = 8
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x007d
            X.AUW r1 = r13.A04
            X.AUT r0 = r12.A0J
            r1.A0J = r0
            X.AUT r4 = r12.A0J
            if (r4 == 0) goto L_0x007a
            X.81p r1 = X.C1686981p.A02
            r0 = 1
            if (r4 != r1) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r13.A06 = r0
        L_0x007d:
            r0 = 16
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x008b
            X.AUW r1 = r13.A04
            java.lang.Float r0 = r12.A0R
            r1.A0R = r0
        L_0x008b:
            r0 = 6168(0x1818, double:3.0474E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x009a
            X.AUW r0 = r13.A04
            X.AUT r0 = r0.A0J
            A0e(r0, r13, r2)
        L_0x009a:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x00ab
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A0Z
            r1.A0Z = r0
        L_0x00ab:
            r0 = 32
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x00c2
            X.AUW r1 = r13.A04
            X.AUX r0 = r12.A02
            r1.A02 = r0
            android.graphics.Paint r1 = r13.A01
            float r0 = r0.A01(r14)
            r1.setStrokeWidth(r0)
        L_0x00c2:
            r0 = 64
            boolean r0 = A0m(r12, r0)
            r4 = 2
            if (r0 == 0) goto L_0x00e4
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A06
            r1.A06 = r0
            java.lang.Integer r0 = r12.A06
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x0178
            if (r0 == r3) goto L_0x0172
            if (r0 != r4) goto L_0x00e4
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L_0x00e1:
            r1.setStrokeCap(r0)
        L_0x00e4:
            r0 = 128(0x80, double:6.32E-322)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0105
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A07
            r1.A07 = r0
            java.lang.Integer r0 = r12.A07
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x016d
            if (r0 == r3) goto L_0x0168
            if (r0 != r4) goto L_0x0105
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        L_0x0102:
            r1.setStrokeJoin(r0)
        L_0x0105:
            r0 = 256(0x100, double:1.265E-321)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x011e
            X.AUW r1 = r13.A04
            java.lang.Float r0 = r12.A04
            r1.A04 = r0
            android.graphics.Paint r1 = r13.A01
            java.lang.Float r0 = r12.A04
            float r0 = r0.floatValue()
            r1.setStrokeMiter(r0)
        L_0x011e:
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x012c
            X.AUW r1 = r13.A04
            X.AUX[] r0 = r12.A0C
            r1.A0C = r0
        L_0x012c:
            r0 = 1024(0x400, double:5.06E-321)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x013a
            X.AUW r1 = r13.A04
            X.AUX r0 = r12.A01
            r1.A01 = r0
        L_0x013a:
            r0 = 1536(0x600, double:7.59E-321)
            boolean r0 = A0m(r12, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0198
            X.AUW r8 = r13.A04
            X.AUX[] r0 = r8.A0C
            if (r0 == 0) goto L_0x0402
            int r10 = r0.length
            int r0 = r10 % 2
            int r7 = r10 * 2
            if (r0 != 0) goto L_0x0151
            r7 = r10
        L_0x0151:
            float[] r5 = new float[r7]
            r11 = 0
            r4 = 0
            r6 = 0
        L_0x0156:
            if (r4 >= r7) goto L_0x017e
            X.AUX[] r1 = r8.A0C
            int r0 = r4 % r10
            r0 = r1[r0]
            float r0 = r0.A01(r14)
            r5[r4] = r0
            float r6 = r6 + r0
            int r4 = r4 + 1
            goto L_0x0156
        L_0x0168:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L_0x0102
        L_0x016d:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L_0x0102
        L_0x0172:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x00e1
        L_0x0178:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L_0x00e1
        L_0x017e:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0402
            X.AUX r0 = r8.A01
            float r4 = r0.A01(r14)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x018e
            float r4 = r4 % r6
            float r4 = r4 + r6
        L_0x018e:
            android.graphics.Paint r1 = r13.A01
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r5, r4)
            r1.setPathEffect(r0)
        L_0x0198:
            r0 = 16384(0x4000, double:8.0948E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x01c4
            X.9d2 r0 = r14.A02
            android.graphics.Paint r0 = r0.A00
            float r4 = r0.getTextSize()
            X.AUW r1 = r13.A04
            X.AUX r0 = r12.A0F
            r1.A0F = r0
            android.graphics.Paint r1 = r13.A00
            X.AUX r0 = r12.A0F
            float r0 = r0.A04(r14, r4)
            r1.setTextSize(r0)
            android.graphics.Paint r1 = r13.A01
            X.AUX r0 = r12.A0F
            float r0 = r0.A04(r14, r4)
            r1.setTextSize(r0)
        L_0x01c4:
            r0 = 8192(0x2000, double:4.0474E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x01d2
            X.AUW r1 = r13.A04
            java.util.List r0 = r12.A0c
            r1.A0c = r0
        L_0x01d2:
            r0 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x01f7
            java.lang.Integer r5 = r12.A0W
            int r1 = r5.intValue()
            r0 = -1
            r4 = 100
            if (r1 != r0) goto L_0x03e4
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r1.A0W
            int r0 = r0.intValue()
            if (r0 <= r4) goto L_0x03fc
            int r0 = r0 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0W = r0
        L_0x01f7:
            r0 = 65536(0x10000, double:3.2379E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0206
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A0V
            r1.A0V = r0
        L_0x0206:
            r0 = 106496(0x1a000, double:5.2616E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02a2
            X.AUW r3 = r13.A04
            java.util.List r1 = r3.A0c
            if (r1 == 0) goto L_0x0266
            X.9gS r0 = r14.A01
            if (r0 == 0) goto L_0x0266
            java.util.Iterator r7 = r1.iterator()
        L_0x021d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.String r6 = X.AnonymousClass001.A0C(r7)
            java.lang.Integer r5 = r3.A0W
            java.lang.Integer r1 = r3.A0V
            java.lang.Integer r0 = X.C023109s.A01
            boolean r4 = X.C36361kB.A1a(r1, r0)
            int r1 = r5.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 <= r0) goto L_0x0261
            r1 = 1
            if (r4 == 0) goto L_0x023d
            r1 = 3
        L_0x023d:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1536685117: goto L_0x0245;
                case -1431958525: goto L_0x0248;
                case -1081737434: goto L_0x0253;
                case 109326717: goto L_0x0256;
                case 1126973893: goto L_0x0288;
                default: goto L_0x0244;
            }
        L_0x0244:
            goto L_0x021d
        L_0x0245:
            java.lang.String r0 = "sans-serif"
            goto L_0x028a
        L_0x0248:
            java.lang.String r0 = "monospace"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            goto L_0x0292
        L_0x0253:
            java.lang.String r0 = "fantasy"
            goto L_0x028a
        L_0x0256:
            java.lang.String r0 = "serif"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            goto L_0x0292
        L_0x0261:
            r1 = 0
            if (r4 == 0) goto L_0x023d
            r1 = 2
            goto L_0x023d
        L_0x0266:
            java.lang.Integer r4 = r3.A0W
            java.lang.Integer r1 = r3.A0V
            java.lang.Integer r0 = X.C023109s.A01
            boolean r3 = X.C36361kB.A1a(r1, r0)
            int r1 = r4.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 <= r0) goto L_0x0283
            r1 = 1
            if (r3 == 0) goto L_0x027c
            r1 = 3
        L_0x027c:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r0, r1)
            goto L_0x0298
        L_0x0283:
            r1 = 0
            if (r3 == 0) goto L_0x027c
            r1 = 2
            goto L_0x027c
        L_0x0288:
            java.lang.String r0 = "cursive"
        L_0x028a:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
        L_0x0292:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r0, r1)
            if (r1 == 0) goto L_0x021d
        L_0x0298:
            android.graphics.Paint r0 = r13.A00
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r13.A01
            r0.setTypeface(r1)
        L_0x02a2:
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02dc
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A08
            r1.A08 = r0
            android.graphics.Paint r1 = r13.A00
            java.lang.Integer r0 = r12.A08
            java.lang.Integer r4 = X.C023109s.A0G
            boolean r0 = X.C36361kB.A1a(r0, r4)
            r1.setStrikeThruText(r0)
            java.lang.Integer r0 = r12.A08
            java.lang.Integer r3 = X.C023109s.A01
            boolean r0 = X.C36361kB.A1a(r0, r3)
            r1.setUnderlineText(r0)
            android.graphics.Paint r1 = r13.A01
            java.lang.Integer r0 = r12.A08
            boolean r0 = X.C36361kB.A1a(r0, r4)
            r1.setStrikeThruText(r0)
            java.lang.Integer r0 = r12.A08
            if (r0 != r3) goto L_0x02d9
            r2 = 1
        L_0x02d9:
            r1.setUnderlineText(r2)
        L_0x02dc:
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02ed
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A05
            r1.A05 = r0
        L_0x02ed:
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02fc
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A0Y
            r1.A0Y = r0
        L_0x02fc:
            r0 = 524288(0x80000, double:2.590327E-318)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x030b
            X.AUW r1 = r13.A04
            java.lang.Boolean r0 = r12.A0M
            r1.A0M = r0
        L_0x030b:
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x031a
            X.AUW r1 = r13.A04
            java.lang.String r0 = r12.A0B
            r1.A0B = r0
        L_0x031a:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0329
            X.AUW r1 = r13.A04
            java.lang.String r0 = r12.A0A
            r1.A0A = r0
        L_0x0329:
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0338
            X.AUW r1 = r13.A04
            java.lang.String r0 = r12.A09
            r1.A09 = r0
        L_0x0338:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0347
            X.AUW r1 = r13.A04
            java.lang.Boolean r0 = r12.A0L
            r1.A0L = r0
        L_0x0347:
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0356
            X.AUW r1 = r13.A04
            java.lang.Boolean r0 = r12.A03
            r1.A03 = r0
        L_0x0356:
            r0 = 1048576(0x100000, double:5.180654E-318)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0365
            X.AUW r1 = r13.A04
            X.9L5 r0 = r12.A0E
            r1.A0E = r0
        L_0x0365:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0374
            X.AUW r1 = r13.A04
            java.lang.String r0 = r12.A0a
            r1.A0a = r0
        L_0x0374:
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0383
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A0T
            r1.A0T = r0
        L_0x0383:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0392
            X.AUW r1 = r13.A04
            java.lang.String r0 = r12.A0b
            r1.A0b = r0
        L_0x0392:
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03a1
            X.AUW r1 = r13.A04
            X.AUT r0 = r12.A0I
            r1.A0I = r0
        L_0x03a1:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03b0
            X.AUW r1 = r13.A04
            java.lang.Float r0 = r12.A0Q
            r1.A0Q = r0
        L_0x03b0:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03c1
            X.AUW r1 = r13.A04
            X.AUT r0 = r12.A0K
            r1.A0K = r0
        L_0x03c1:
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03d2
            X.AUW r1 = r13.A04
            java.lang.Float r0 = r12.A0S
            r1.A0S = r0
        L_0x03d2:
            r0 = 137438953472(0x2000000000, double:6.7903865311E-313)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03e3
            X.AUW r1 = r13.A04
            java.lang.Integer r0 = r12.A0X
            r1.A0X = r0
        L_0x03e3:
            return
        L_0x03e4:
            if (r1 != r3) goto L_0x03fc
            X.AUW r3 = r13.A04
            java.lang.Integer r0 = r3.A0W
            int r1 = r0.intValue()
            r0 = 900(0x384, float:1.261E-42)
            if (r1 >= r0) goto L_0x03fc
            int r0 = r1 + 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0W = r0
            goto L_0x01f7
        L_0x03fc:
            X.AUW r0 = r13.A04
            r0.A0W = r5
            goto L_0x01f7
        L_0x0402:
            android.graphics.Paint r0 = r13.A01
            r0.setPathEffect(r9)
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0V(X.AUW, X.9d2, X.9p5):void");
    }

    private void A0W(B0V b0v, boolean z) {
        if (z) {
            this.A04.push(b0v);
            this.A03.push(this.A00.getMatrix());
        }
        for (AnonymousClass9QD A0b : b0v.B9f()) {
            A0b(A0b);
        }
        if (z) {
            this.A04.pop();
            this.A03.pop();
        }
    }

    private void A0X(AnonymousClass824 r4) {
        AUT aut = this.A02.A04.A0G;
        if (aut instanceof C1686781n) {
            A0M(r4.A00, (C1686781n) aut, true);
        }
        AUT aut2 = this.A02.A04.A0J;
        if (aut2 instanceof C1686781n) {
            A0M(r4.A00, (C1686781n) aut2, false);
        }
    }

    private void A0Y(AnonymousClass824 r7) {
        if (this.A02.A04.A0b != null) {
            Paint paint = new Paint();
            C165587tf.A0v(paint, PorterDuff.Mode.DST_IN);
            Canvas canvas = this.A00;
            canvas.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer((RectF) null, paint2, 31);
            C1686081g r2 = (C1686081g) this.A01.A04(this.A02.A04.A0b);
            A0S(r2, r7);
            canvas.restore();
            Paint paint3 = new Paint();
            C165587tf.A0v(paint3, PorterDuff.Mode.DST_IN);
            canvas.saveLayer((RectF) null, paint3, 31);
            A0S(r2, r7);
            canvas.restore();
            canvas.restore();
        }
        A0i(this);
    }

    private void A0Z(AnonymousClass824 r11) {
        if (r11.A00 != null && r11.A00 != null) {
            Matrix A0B = C90524aI.A0B();
            if (((Matrix) this.A03.peek()).invert(A0B)) {
                C198839eH r3 = r11.A00;
                float f = r3.A01;
                float f2 = r3.A02;
                float f3 = f + r3.A03;
                int i = 2;
                float f4 = f2 + r3.A00;
                float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                A0B.preConcat(this.A00.getMatrix());
                A0B.mapPoints(fArr);
                float f5 = fArr[0];
                float f6 = fArr[1];
                RectF rectF = new RectF(f5, f6, f5, f6);
                do {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                    i += 2;
                } while (i <= 6);
                AnonymousClass824 r6 = (AnonymousClass824) this.A04.peek();
                C198839eH r32 = r6.A00;
                float f7 = rectF.left;
                float f8 = rectF.top;
                C198839eH r5 = new C198839eH(f7, f8, rectF.right - f7, rectF.bottom - f8);
                if (r32 == null) {
                    r6.A00 = r5;
                    return;
                }
                float f9 = r5.A01;
                float f10 = r32.A01;
                if (f9 < f10) {
                    r32.A01 = f9;
                    f10 = f9;
                }
                float f11 = r5.A02;
                float f12 = r32.A02;
                if (f11 < f12) {
                    r32.A02 = f11;
                    f12 = f11;
                }
                float f13 = r5.A01 + r5.A03;
                if (f13 > r32.A03 + f10) {
                    r32.A03 = f13 - f10;
                }
                float f14 = r5.A02 + r5.A00;
                if (f14 > r32.A00 + f12) {
                    r32.A00 = f14 - f12;
                }
            }
        }
    }

    private void A0a(AnonymousClass825 r5, C198179d2 r6) {
        boolean A1W = AnonymousClass000.A1W(r5.A00);
        AUW auw = r6.A04;
        Boolean bool = Boolean.TRUE;
        auw.A0L = bool;
        if (!A1W) {
            bool = Boolean.FALSE;
        }
        auw.A0M = bool;
        auw.A0E = null;
        auw.A0a = null;
        Float valueOf = Float.valueOf(1.0f);
        auw.A0O = valueOf;
        auw.A0I = C1686981p.A01;
        auw.A0Q = valueOf;
        auw.A0b = null;
        auw.A0H = null;
        auw.A0P = valueOf;
        auw.A0K = null;
        auw.A0S = valueOf;
        auw.A0Z = C023109s.A00;
        AUW auw2 = r5.A02;
        if (auw2 != null) {
            A0V(auw2, r6, this);
        }
        List list = this.A01.A00.A00;
        if (list != null && !list.isEmpty()) {
            for (AnonymousClass9RD r2 : this.A01.A00.A00) {
                if (C203389nt.A03((C1890892a) null, r2.A00, r5)) {
                    A0V(r2.A01, r6, this);
                }
            }
        }
        AUW auw3 = r5.A03;
        if (auw3 != null) {
            A0V(auw3, r6, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.820} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.81X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.81W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.81V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.81Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: X.81T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.81r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: X.81U} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0261, code lost:
        if (r8 != false) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x034b, code lost:
        if (r3 != false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ba, code lost:
        if (r2 != false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x040c, code lost:
        if (r1 != false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04d2, code lost:
        if (r0 != false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r7 == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024f, code lost:
        if (r1 != false) goto L_0x0263;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0b(X.AnonymousClass9QD r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C15850o5
            if (r0 != 0) goto L_0x0036
            A0j(r11)
            boolean r0 = r12 instanceof X.AnonymousClass825
            if (r0 == 0) goto L_0x001a
            r0 = r12
            X.825 r0 = (X.AnonymousClass825) r0
            java.lang.Boolean r0 = r0.A04
            if (r0 == 0) goto L_0x001a
            X.9d2 r1 = r11.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x001a:
            boolean r0 = r12 instanceof X.C1687281s
            if (r0 == 0) goto L_0x0037
            X.81s r12 = (X.C1687281s) r12
            X.AUX r3 = r12.A02
            X.AUX r2 = r12.A03
            X.AUX r1 = r12.A01
            X.AUX r0 = r12.A00
            X.9eH r2 = r11.A0D(r3, r2, r1, r0)
            X.9eH r1 = r12.A00
            X.9fC r0 = r12.A00
            A0L(r0, r2, r1, r12, r11)
        L_0x0033:
            A0i(r11)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r12 instanceof X.C1685481a
            if (r0 == 0) goto L_0x0140
            X.81a r12 = (X.C1685481a) r12
            r2 = 0
            X.AUX r0 = r12.A01
            if (r0 == 0) goto L_0x004a
            float r1 = r0.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            X.AUX r0 = r12.A00
            if (r0 == 0) goto L_0x0056
            float r1 = r0.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            goto L_0x0033
        L_0x0056:
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            X.9gS r1 = r12.A01
            java.lang.String r0 = r12.A04
            X.825 r3 = r1.A04(r0)
            if (r3 != 0) goto L_0x0074
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.lang.String r0 = r12.A04
            r1[r2] = r0
            java.lang.String r0 = "Use reference '%s' not found"
            A0k(r0, r1)
            goto L_0x0033
        L_0x0074:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.AUX r0 = r12.A02
            r2 = 0
            float r1 = A01(r0, r11)
            X.AUX r0 = r12.A03
            if (r0 == 0) goto L_0x0088
            float r2 = r0.A03(r11)
        L_0x0088:
            android.graphics.Canvas r4 = r11.A00
            r4.translate(r1, r2)
            boolean r7 = A0n(r12, r11)
            java.util.Stack r0 = r11.A04
            r0.push(r12)
            java.util.Stack r1 = r11.A03
            android.graphics.Matrix r0 = r4.getMatrix()
            r1.push(r0)
            boolean r0 = r3 instanceof X.C1687281s
            r6 = 0
            if (r0 == 0) goto L_0x00c9
            X.81s r3 = (X.C1687281s) r3
            X.AUX r1 = r12.A01
            X.AUX r0 = r12.A00
            X.9eH r2 = r11.A0D(r6, r6, r1, r0)
            A0j(r11)
            X.9eH r1 = r3.A00
            X.9fC r0 = r3.A00
            A0L(r0, r2, r1, r3, r11)
        L_0x00b8:
            A0i(r11)
        L_0x00bb:
            java.util.Stack r0 = r11.A04
            r0.pop()
            java.util.Stack r0 = r11.A03
            r0.pop()
            if (r7 == 0) goto L_0x0266
            goto L_0x0263
        L_0x00c9:
            boolean r0 = r3 instanceof X.C1687381t
            if (r0 == 0) goto L_0x013b
            X.AUX r5 = r12.A01
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r5 != 0) goto L_0x00da
            java.lang.Integer r0 = X.C023109s.A0X
            X.AUX r5 = new X.AUX
            r5.<init>(r0, r2)
        L_0x00da:
            X.AUX r1 = r12.A00
            if (r1 != 0) goto L_0x00e5
            java.lang.Integer r0 = X.C023109s.A0X
            X.AUX r1 = new X.AUX
            r1.<init>(r0, r2)
        L_0x00e5:
            X.9eH r5 = r11.A0D(r6, r6, r5, r1)
            A0j(r11)
            X.81q r3 = (X.C1687081q) r3
            float r0 = r5.A03
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            float r0 = r5.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            X.9fC r2 = r3.A00
            if (r2 != 0) goto L_0x0101
            X.9fC r2 = X.C199369fC.A02
        L_0x0101:
            X.9d2 r0 = r11.A02
            r11.A0a(r3, r0)
            X.9d2 r0 = r11.A02
            r0.A03 = r5
            A0O(r5, r0, r11)
            X.9eH r1 = r3.A00
            X.9d2 r0 = r11.A02
            X.9eH r0 = r0.A03
            if (r1 == 0) goto L_0x0133
            android.graphics.Matrix r0 = A04(r2, r0, r1)
            r4.concat(r0)
            X.9d2 r1 = r11.A02
            X.9eH r0 = r3.A00
            r1.A02 = r0
        L_0x0122:
            boolean r1 = r11.A0l()
            r0 = 1
            r11.A0W(r3, r0)
            if (r1 == 0) goto L_0x012f
            r11.A0Y(r3)
        L_0x012f:
            r11.A0Z(r3)
            goto L_0x00b8
        L_0x0133:
            float r1 = r0.A01
            float r0 = r0.A02
            r4.translate(r1, r0)
            goto L_0x0122
        L_0x013b:
            r11.A0b(r3)
            goto L_0x00bb
        L_0x0140:
            boolean r0 = r12 instanceof X.AnonymousClass81Z
            if (r0 == 0) goto L_0x0236
            X.81f r12 = (X.C1685981f) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            boolean r8 = A0n(r12, r11)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r4 = r0.getLanguage()
            java.util.List r0 = r12.A05
            java.util.Iterator r7 = r0.iterator()
        L_0x0163:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r3 = r7.next()
            X.9QD r3 = (X.AnonymousClass9QD) r3
            boolean r0 = r3 instanceof X.B3X
            if (r0 == 0) goto L_0x0163
            r2 = r3
            X.B3X r2 = (X.B3X) r2
            java.lang.String r0 = r2.BGi()
            if (r0 != 0) goto L_0x0163
            java.util.Set r1 = r2.BI7()
            if (r1 == 0) goto L_0x018f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0163
            boolean r0 = r1.contains(r4)
            if (r0 != 0) goto L_0x018f
            goto L_0x0163
        L_0x018f:
            java.util.Set r5 = r2.BGj()
            if (r5 == 0) goto L_0x0252
            java.util.HashSet r0 = A06
            if (r0 != 0) goto L_0x0226
            java.lang.Class<X.9p5> r6 = X.AnonymousClass9p5.class
            monitor-enter(r6)
            java.util.HashSet r1 = X.C36441kJ.A16()     // Catch:{ all -> 0x0609 }
            A06 = r1     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Structure"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "BasicStructure"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "ConditionalProcessing"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Image"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Style"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "ViewportAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Shape"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "BasicText"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "PaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "BasicPaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "OpacityAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "BasicGraphicsAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Marker"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Gradient"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Pattern"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Clip"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "BasicClip"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "Mask"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0609 }
            java.lang.String r0 = "View"
            r1.add(r0)     // Catch:{ all -> 0x0609 }
            monitor-exit(r6)
        L_0x0226:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0163
            java.util.HashSet r0 = A06
            boolean r0 = r0.containsAll(r5)
            if (r0 != 0) goto L_0x0252
            goto L_0x0163
        L_0x0236:
            boolean r0 = r12 instanceof X.C1685981f
            if (r0 == 0) goto L_0x0270
            X.81f r12 = (X.C1685981f) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            boolean r1 = A0n(r12, r11)
            r0 = 1
            r11.A0W(r12, r0)
            if (r1 == 0) goto L_0x0266
            goto L_0x0263
        L_0x0252:
            java.util.Set r0 = r2.BGl()
            if (r0 != 0) goto L_0x026b
            java.util.Set r0 = r2.BGk()
            if (r0 != 0) goto L_0x026b
            r11.A0b(r3)
        L_0x0261:
            if (r8 == 0) goto L_0x0266
        L_0x0263:
            r11.A0Y(r12)
        L_0x0266:
            r11.A0Z(r12)
            goto L_0x0033
        L_0x026b:
            r0.isEmpty()
            goto L_0x0163
        L_0x0270:
            boolean r0 = r12 instanceof X.C1687181r
            if (r0 == 0) goto L_0x0352
            X.81r r12 = (X.C1687181r) r12
            r6 = 0
            X.AUX r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A01
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            X.AUX r0 = r12.A01
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            java.lang.String r3 = r12.A05
            if (r3 == 0) goto L_0x0033
            X.9fC r8 = r12.A00
            if (r8 != 0) goto L_0x0296
            X.9fC r8 = X.C199369fC.A02
        L_0x0296:
            java.lang.String r0 = "data:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0033
            int r1 = r3.length()
            r0 = 14
            if (r1 < r0) goto L_0x0033
            r0 = 44
            int r2 = r3.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0033
            r0 = 12
            if (r2 < r0) goto L_0x0033
            int r0 = r2 + -7
            java.lang.String r1 = r3.substring(r0, r2)
            java.lang.String r0 = ";base64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = X.C165607th.A0o(r2, r3)
            byte[] r1 = android.util.Base64.decode(r0, r6)
            int r0 = r1.length
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r1, r6, r0)
            if (r5 == 0) goto L_0x0033
            int r0 = r5.getWidth()
            float r1 = (float) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            r4 = 0
            X.9eH r7 = new X.9eH
            r7.<init>(r4, r4, r1, r0)
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.AUX r0 = r12.A03
            float r10 = A01(r0, r11)
            X.AUX r0 = r12.A04
            float r9 = A00(r0, r11)
            X.AUX r0 = r12.A02
            float r3 = r0.A02(r11)
            X.AUX r0 = r12.A01
            float r2 = r0.A02(r11)
            X.9d2 r1 = r11.A02
            X.9eH r0 = new X.9eH
            r0.<init>(r10, r9, r3, r2)
            r1.A03 = r0
            A0O(r0, r1, r11)
            X.9d2 r0 = r11.A02
            X.9eH r0 = r0.A03
            r12.A00 = r0
            r11.A0Z(r12)
            boolean r3 = A0n(r12, r11)
            r11.A0G()
            android.graphics.Canvas r2 = r11.A00
            r2.save()
            X.9d2 r0 = r11.A02
            X.9eH r0 = r0.A03
            android.graphics.Matrix r0 = A04(r8, r0, r7)
            r2.concat(r0)
            X.9d2 r0 = r11.A02
            X.AUW r0 = r0.A04
            java.lang.Integer r1 = r0.A0X
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 == r0) goto L_0x0340
            r6 = 2
        L_0x0340:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r6)
            r2.drawBitmap(r5, r4, r4, r0)
            r2.restore()
            if (r3 == 0) goto L_0x0033
        L_0x034d:
            r11.A0Y(r12)
            goto L_0x0033
        L_0x0352:
            boolean r0 = r12 instanceof X.AnonymousClass81T
            if (r0 == 0) goto L_0x03c0
            X.81T r12 = (X.AnonymousClass81T) r12
            X.9yr r0 = r12.A00
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.9d2 r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0374
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0374
            goto L_0x0033
        L_0x0374:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.9yr r1 = r12.A00
            X.9yp r0 = new X.9yp
            r0.<init>(r1, r11)
            android.graphics.Path r3 = r0.A02
            X.9eH r0 = r12.A00
            if (r0 != 0) goto L_0x038c
            X.9eH r0 = A0C(r3)
            r12.A00 = r0
        L_0x038c:
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r2 = A0n(r12, r11)
            X.9d2 r1 = r11.A02
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x03ae
            X.AUW r0 = r1.A04
            java.lang.Integer r1 = r0.A0U
            if (r1 == 0) goto L_0x03bd
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x03bd
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x03a8:
            r3.setFillType(r0)
            r11.A0K(r3, r12)
        L_0x03ae:
            X.9d2 r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x03b7
            r11.A0J(r3)
        L_0x03b7:
            r11.A0Q(r12)
            if (r2 == 0) goto L_0x0033
            goto L_0x034d
        L_0x03bd:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x03a8
        L_0x03c0:
            boolean r0 = r12 instanceof X.AnonymousClass81Y
            if (r0 == 0) goto L_0x0410
            X.81Y r12 = (X.AnonymousClass81Y) r12
            X.AUX r0 = r12.A03
            if (r0 == 0) goto L_0x0033
            X.AUX r2 = r12.A00
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A01
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            android.graphics.Path r2 = r11.A0A(r12)
        L_0x03f0:
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r1 = A0n(r12, r11)
            X.9d2 r0 = r11.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0403
            r11.A0K(r2, r12)
        L_0x0403:
            X.9d2 r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x040c
            r11.A0J(r2)
        L_0x040c:
            if (r1 == 0) goto L_0x0033
            goto L_0x034d
        L_0x0410:
            boolean r0 = r12 instanceof X.AnonymousClass81V
            if (r0 == 0) goto L_0x0437
            X.81V r12 = (X.AnonymousClass81V) r12
            X.AUX r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r1 = r0.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            android.graphics.Path r2 = r11.A07(r12)
            goto L_0x03f0
        L_0x0437:
            boolean r0 = r12 instanceof X.AnonymousClass81W
            if (r0 == 0) goto L_0x0468
            X.81W r12 = (X.AnonymousClass81W) r12
            X.AUX r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            X.AUX r2 = r12.A03
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A01
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            android.graphics.Path r2 = r11.A08(r12)
            goto L_0x03f0
        L_0x0468:
            boolean r0 = r12 instanceof X.AnonymousClass81X
            if (r0 == 0) goto L_0x04e5
            X.81X r12 = (X.AnonymousClass81X) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.9d2 r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.AUX r0 = r12.A00
            r8 = 0
            if (r0 != 0) goto L_0x04e0
            r7 = 0
        L_0x048b:
            X.AUX r0 = r12.A02
            if (r0 != 0) goto L_0x04db
            r6 = 0
        L_0x0490:
            X.AUX r0 = r12.A01
            if (r0 != 0) goto L_0x04d6
            r5 = 0
        L_0x0495:
            X.AUX r0 = r12.A03
            if (r0 == 0) goto L_0x049d
            float r8 = r0.A03(r11)
        L_0x049d:
            X.9eH r0 = r12.A00
            if (r0 != 0) goto L_0x04b8
            float r4 = java.lang.Math.min(r7, r5)
            float r3 = java.lang.Math.min(r6, r8)
            float r2 = X.C90494aF.A01(r5, r7)
            float r1 = X.C90494aF.A01(r8, r6)
            X.9eH r0 = new X.9eH
            r0.<init>(r4, r3, r2, r1)
            r12.A00 = r0
        L_0x04b8:
            android.graphics.Path r1 = X.C36441kJ.A0M()
            r1.moveTo(r7, r6)
            r1.lineTo(r5, r8)
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r0 = A0n(r12, r11)
            r11.A0J(r1)
            r11.A0Q(r12)
            if (r0 == 0) goto L_0x0033
            goto L_0x034d
        L_0x04d6:
            float r5 = r0.A02(r11)
            goto L_0x0495
        L_0x04db:
            float r6 = r0.A03(r11)
            goto L_0x0490
        L_0x04e0:
            float r7 = r0.A02(r11)
            goto L_0x048b
        L_0x04e5:
            boolean r0 = r12 instanceof X.C1685781d
            if (r0 == 0) goto L_0x0516
            X.81U r12 = (X.AnonymousClass81U) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.9d2 r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0503
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0503
            goto L_0x0033
        L_0x0503:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r2 = r11.A09(r12)
            r11.A0Z(r12)
            goto L_0x0557
        L_0x0516:
            boolean r0 = r12 instanceof X.AnonymousClass81U
            if (r0 == 0) goto L_0x0578
            X.81U r12 = (X.AnonymousClass81U) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.9d2 r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0534
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0534
            goto L_0x0033
        L_0x0534:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r2 = r11.A09(r12)
            r11.A0Z(r12)
            X.9d2 r0 = r11.A02
            X.AUW r0 = r0.A04
            java.lang.Integer r1 = r0.A0U
            if (r1 == 0) goto L_0x0575
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x0575
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0554:
            r2.setFillType(r0)
        L_0x0557:
            r11.A0X(r12)
            boolean r1 = A0n(r12, r11)
            X.9d2 r0 = r11.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0567
            r11.A0K(r2, r12)
        L_0x0567:
            X.9d2 r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0570
            r11.A0J(r2)
        L_0x0570:
            r11.A0Q(r12)
            goto L_0x040c
        L_0x0575:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x0554
        L_0x0578:
            boolean r0 = r12 instanceof X.AnonymousClass820
            if (r0 == 0) goto L_0x0033
            X.820 r12 = (X.AnonymousClass820) r12
            r1 = 0
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            java.util.List r0 = r12.A02
            if (r0 == 0) goto L_0x0607
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0607
            java.util.List r0 = r12.A02
            java.lang.Object r0 = r0.get(r1)
            X.AUX r0 = (X.AUX) r0
            float r5 = r0.A02(r11)
        L_0x05a0:
            java.util.List r0 = r12.A03
            if (r0 == 0) goto L_0x0605
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0605
            java.util.List r0 = r12.A03
            java.lang.Object r0 = r0.get(r1)
            X.AUX r0 = (X.AUX) r0
            float r6 = r0.A03(r11)
        L_0x05b6:
            java.util.List r0 = r12.A00
            if (r0 == 0) goto L_0x0603
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0603
            java.util.List r0 = r12.A00
            java.lang.Object r0 = r0.get(r1)
            X.AUX r0 = (X.AUX) r0
            float r4 = r0.A02(r11)
        L_0x05cc:
            float r3 = A02(r12, r11)
            java.lang.Integer r2 = r11.A0E()
            java.lang.Integer r0 = X.C023109s.A00
            if (r2 == r0) goto L_0x05ea
            X.827 r0 = new X.827
            r0.<init>(r11)
            r11.A0f(r12, r0)
            float r1 = r0.A00
            java.lang.Integer r0 = X.C023109s.A01
            if (r2 != r0) goto L_0x05e9
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x05e9:
            float r5 = r5 - r1
        L_0x05ea:
            A0g(r12, r11, r5, r6)
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r1 = A0n(r12, r11)
            float r5 = r5 + r4
            float r6 = r6 + r3
            X.828 r0 = new X.828
            r0.<init>(r11, r5, r6)
            r11.A0f(r12, r0)
            goto L_0x040c
        L_0x0603:
            r4 = 0
            goto L_0x05cc
        L_0x0605:
            r6 = 0
            goto L_0x05b6
        L_0x0607:
            r5 = 0
            goto L_0x05a0
        L_0x0609:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0b(X.9QD):void");
    }

    public static void A0d(AnonymousClass9QD r2, AnonymousClass9p5 r3) {
        C198179d2 r1 = new C198179d2(r3);
        A0V(AUW.A00(), r1, r3);
        r3.A0c(r2, r1);
        r3.A02 = r1;
    }

    public static void A0e(AUT aut, C198179d2 r4, boolean z) {
        Float f;
        C1686981p r3;
        Paint paint;
        AUW auw = r4.A04;
        if (z) {
            f = auw.A0N;
        } else {
            f = auw.A0R;
        }
        float floatValue = f.floatValue();
        if (aut instanceof C1686981p) {
            r3 = (C1686981p) aut;
        } else if (aut instanceof C1686881o) {
            r3 = auw.A00;
        } else {
            return;
        }
        int A032 = A03(r3.A00, floatValue);
        if (z) {
            paint = r4.A00;
        } else {
            paint = r4.A01;
        }
        paint.setColor(A032);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.821} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.81z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.821} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.821} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        if (r2 != false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (r0 != false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        A0Y(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0f(X.AnonymousClass822 r12, X.AnonymousClass9TN r13) {
        /*
            r11 = this;
            X.9d2 r0 = r11.A02
            X.AUW r0 = r0.A04
            java.lang.Boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            java.util.List r0 = r12.A05
            java.util.Iterator r10 = r0.iterator()
            r2 = 1
        L_0x0016:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r10.next()
            X.9QD r1 = (X.AnonymousClass9QD) r1
            boolean r0 = r1 instanceof X.C1686681m
            if (r0 == 0) goto L_0x0039
            X.81m r1 = (X.C1686681m) r1
            java.lang.String r1 = r1.A00
            boolean r0 = r10.hasNext()
            r0 = r0 ^ 1
            java.lang.String r0 = r11.A0F(r1, r2, r0)
            r13.A00(r0)
        L_0x0037:
            r2 = 0
            goto L_0x0016
        L_0x0039:
            r2 = r1
            X.822 r2 = (X.AnonymousClass822) r2
            boolean r0 = r13 instanceof X.AnonymousClass82A
            if (r0 == 0) goto L_0x0083
            r6 = r13
            X.82A r6 = (X.AnonymousClass82A) r6
            boolean r0 = r2 instanceof X.C1687981z
            r5 = 1
            if (r0 == 0) goto L_0x009a
            r4 = r2
            X.81z r4 = (X.C1687981z) r4
            X.9gS r1 = r2.A01
            java.lang.String r0 = r4.A02
            X.825 r3 = r1.A04(r0)
            r2 = 0
            if (r3 != 0) goto L_0x0062
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = r4.A02
            r1[r2] = r0
            java.lang.String r0 = "TextPath path reference '%s' not found"
            A0k(r0, r1)
            goto L_0x0037
        L_0x0062:
            X.81T r3 = (X.AnonymousClass81T) r3
            X.9p5 r2 = r6.A03
            X.9yr r1 = r3.A00
            X.9yp r0 = new X.9yp
            r0.<init>(r1, r2)
            android.graphics.Path r2 = r0.A02
            android.graphics.Matrix r0 = r3.A00
            if (r0 == 0) goto L_0x0076
            r2.transform(r0)
        L_0x0076:
            android.graphics.RectF r1 = X.C36441kJ.A0N()
            r2.computeBounds(r1, r5)
            android.graphics.RectF r0 = r6.A02
            r0.union(r1)
            goto L_0x0037
        L_0x0083:
            boolean r0 = r13 instanceof X.AnonymousClass829
            if (r0 == 0) goto L_0x009a
            boolean r0 = r2 instanceof X.C1687981z
            if (r0 == 0) goto L_0x009a
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "Using <textPath> elements in a clip path is not supported."
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "SVGAndroidRenderer"
            android.util.Log.w(r0, r1)
            goto L_0x0037
        L_0x009a:
            boolean r0 = r1 instanceof X.C1687981z
            if (r0 == 0) goto L_0x0122
            A0j(r11)
            X.81z r1 = (X.C1687981z) r1
            r4 = 0
            boolean r0 = A0o(r1, r11)
            if (r0 == 0) goto L_0x00c7
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x00c7
            X.9gS r2 = r1.A01
            java.lang.String r0 = r1.A02
            X.825 r3 = r2.A04(r0)
            if (r3 != 0) goto L_0x00cc
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            java.lang.String r0 = r1.A02
            r2[r4] = r0
            java.lang.String r0 = "TextPath reference '%s' not found"
        L_0x00c4:
            A0k(r0, r2)
        L_0x00c7:
            A0i(r11)
            goto L_0x0037
        L_0x00cc:
            X.81T r3 = (X.AnonymousClass81T) r3
            X.9yr r2 = r3.A00
            X.9yp r0 = new X.9yp
            r0.<init>(r2, r11)
            android.graphics.Path r5 = r0.A02
            android.graphics.Matrix r0 = r3.A00
            if (r0 == 0) goto L_0x00de
            r5.transform(r0)
        L_0x00de:
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r0.<init>(r5, r4)
            X.AUX r2 = r1.A00
            if (r2 == 0) goto L_0x0120
            float r0 = r0.getLength()
            float r4 = r2.A04(r11, r0)
        L_0x00ef:
            java.lang.Integer r3 = r11.A0E()
            java.lang.Integer r0 = X.C023109s.A00
            if (r3 == r0) goto L_0x0109
            X.827 r0 = new X.827
            r0.<init>(r11)
            r11.A0f(r1, r0)
            float r2 = r0.A00
            java.lang.Integer r0 = X.C023109s.A01
            if (r3 != r0) goto L_0x0108
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
        L_0x0108:
            float r4 = r4 - r2
        L_0x0109:
            X.0o6 r0 = r1.A01
            X.824 r0 = (X.AnonymousClass824) r0
            r11.A0X(r0)
            boolean r2 = r11.A0l()
            X.826 r0 = new X.826
            r0.<init>(r5, r11, r4)
            r11.A0f(r1, r0)
            if (r2 == 0) goto L_0x00c7
            goto L_0x01b0
        L_0x0120:
            r4 = 0
            goto L_0x00ef
        L_0x0122:
            boolean r0 = r1 instanceof X.AnonymousClass821
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x01d1
            A0j(r11)
            X.821 r1 = (X.AnonymousClass821) r1
            boolean r0 = A0o(r1, r11)
            if (r0 == 0) goto L_0x00c7
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x01ce
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01ce
        L_0x013d:
            boolean r3 = r13 instanceof X.AnonymousClass828
            r6 = 0
            if (r3 == 0) goto L_0x01ca
            if (r5 != 0) goto L_0x01bd
            r0 = r13
            X.828 r0 = (X.AnonymousClass828) r0
            float r6 = r0.A00
        L_0x0149:
            java.util.List r0 = r1.A03
            if (r0 == 0) goto L_0x01b7
            int r0 = r0.size()
            if (r0 == 0) goto L_0x01b7
            java.util.List r0 = r1.A03
            java.lang.Object r0 = r0.get(r4)
            X.AUX r0 = (X.AUX) r0
            float r7 = r0.A03(r11)
        L_0x015f:
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x01b5
            int r0 = r0.size()
            if (r0 == 0) goto L_0x01b5
            java.util.List r0 = r1.A00
            java.lang.Object r0 = r0.get(r4)
            X.AUX r0 = (X.AUX) r0
            float r9 = r0.A02(r11)
        L_0x0175:
            float r8 = A02(r1, r11)
        L_0x0179:
            if (r5 == 0) goto L_0x0195
            java.lang.Integer r4 = r11.A0E()
            java.lang.Integer r0 = X.C023109s.A00
            if (r4 == r0) goto L_0x0195
            X.827 r0 = new X.827
            r0.<init>(r11)
            r11.A0f(r1, r0)
            float r2 = r0.A00
            java.lang.Integer r0 = X.C023109s.A01
            if (r4 != r0) goto L_0x0194
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
        L_0x0194:
            float r6 = r6 - r2
        L_0x0195:
            X.0o6 r0 = r1.A00
            X.824 r0 = (X.AnonymousClass824) r0
            r11.A0X(r0)
            if (r3 == 0) goto L_0x01a7
            r0 = r13
            X.828 r0 = (X.AnonymousClass828) r0
            float r6 = r6 + r9
            r0.A00 = r6
            float r7 = r7 + r8
            r0.A01 = r7
        L_0x01a7:
            boolean r0 = r11.A0l()
            r11.A0f(r1, r13)
            if (r0 == 0) goto L_0x00c7
        L_0x01b0:
            r11.A0Y(r1)
            goto L_0x00c7
        L_0x01b5:
            r9 = 0
            goto L_0x0175
        L_0x01b7:
            r0 = r13
            X.828 r0 = (X.AnonymousClass828) r0
            float r7 = r0.A01
            goto L_0x015f
        L_0x01bd:
            java.util.List r0 = r1.A02
            java.lang.Object r0 = r0.get(r4)
            X.AUX r0 = (X.AUX) r0
            float r6 = r0.A02(r11)
            goto L_0x0149
        L_0x01ca:
            r8 = 0
            r7 = 0
            r9 = 0
            goto L_0x0179
        L_0x01ce:
            r5 = 0
            goto L_0x013d
        L_0x01d1:
            boolean r0 = r1 instanceof X.C1687881y
            if (r0 == 0) goto L_0x0037
            A0j(r11)
            r3 = r1
            X.81y r3 = (X.C1687881y) r3
            boolean r0 = A0o(r3, r11)
            if (r0 == 0) goto L_0x00c7
            X.0o6 r0 = r3.A00
            X.824 r0 = (X.AnonymousClass824) r0
            r11.A0X(r0)
            X.9gS r1 = r1.A01
            java.lang.String r0 = r3.A01
            X.825 r2 = r1.A04(r0)
            if (r2 == 0) goto L_0x020e
            boolean r0 = r2 instanceof X.AnonymousClass822
            if (r0 == 0) goto L_0x020e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.822 r2 = (X.AnonymousClass822) r2
            r11.A0h(r2, r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00c7
            java.lang.String r0 = r1.toString()
            r13.A00(r0)
            goto L_0x00c7
        L_0x020e:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r0 = r3.A01
            r2[r4] = r0
            java.lang.String r0 = "Tref reference '%s' not found"
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0f(X.822, X.9TN):void");
    }

    public static void A0g(AnonymousClass822 r5, AnonymousClass9p5 r6, float f, float f2) {
        if (r5.A00 == null) {
            AnonymousClass82A r0 = new AnonymousClass82A(r6, f, f2);
            r6.A0f(r5, r0);
            RectF rectF = r0.A02;
            r5.A00 = new C198839eH(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
    }

    private void A0h(AnonymousClass822 r5, StringBuilder sb) {
        Iterator it = r5.A05.iterator();
        boolean z = true;
        while (it.hasNext()) {
            AnonymousClass9QD r1 = (AnonymousClass9QD) it.next();
            if (r1 instanceof AnonymousClass822) {
                A0h((AnonymousClass822) r1, sb);
            } else if (r1 instanceof C1686681m) {
                sb.append(A0F(((C1686681m) r1).A00, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public static void A0i(AnonymousClass9p5 r1) {
        r1.A00.restore();
        r1.A02 = (C198179d2) r1.A05.pop();
    }

    public static void A0j(AnonymousClass9p5 r2) {
        r2.A00.save();
        r2.A05.push(r2.A02);
        r2.A02 = new C198179d2(r2.A02, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.A0b != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0l() {
        /*
            r5 = this;
            X.9d2 r0 = r5.A02
            X.AUW r1 = r0.A04
            java.lang.Float r0 = r1.A0O
            float r3 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            java.lang.String r1 = r1.A0b
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r4 = 0
            if (r0 != 0) goto L_0x001a
            return r4
        L_0x001a:
            android.graphics.Canvas r2 = r5.A00
            r0 = 1132462080(0x43800000, float:256.0)
            float r3 = r3 * r0
            int r1 = (int) r3
            r0 = 255(0xff, float:3.57E-43)
            if (r1 >= 0) goto L_0x0064
            r1 = 0
        L_0x0025:
            r0 = 31
            r3 = 0
            r2.saveLayerAlpha(r3, r1, r0)
            java.util.Stack r1 = r5.A05
            X.9d2 r0 = r5.A02
            r1.push(r0)
            X.9d2 r1 = r5.A02
            X.9d2 r0 = new X.9d2
            r0.<init>(r1, r5)
            r5.A02 = r0
            X.AUW r0 = r0.A04
            java.lang.String r1 = r0.A0b
            r2 = 1
            if (r1 == 0) goto L_0x0063
            X.9gS r0 = r5.A01
            X.825 r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0 instanceof X.C1686081g
            if (r0 != 0) goto L_0x0063
        L_0x004e:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.9d2 r0 = r5.A02
            X.AUW r0 = r0.A04
            java.lang.String r0 = r0.A0b
            r1[r4] = r0
            java.lang.String r0 = "Mask reference '%s' not found"
            A0k(r0, r1)
            X.9d2 r0 = r5.A02
            X.AUW r0 = r0.A04
            r0.A0b = r3
        L_0x0063:
            return r2
        L_0x0064:
            if (r1 <= r0) goto L_0x0025
            r1 = 255(0xff, float:3.57E-43)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0l():boolean");
    }

    public static boolean A0m(AUW auw, long j) {
        return AnonymousClass000.A1P(((auw.A0D & j) > 0 ? 1 : ((auw.A0D & j) == 0 ? 0 : -1)));
    }

    public static boolean A0n(AnonymousClass824 r1, AnonymousClass9p5 r2) {
        r2.A0N(r1.A00, r1);
        return r2.A0l();
    }

    public static boolean A0o(AnonymousClass825 r1, AnonymousClass9p5 r2) {
        r2.A0a(r1, r2.A02);
        Boolean bool = r2.A02.A04.A0L;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static boolean A0p(AnonymousClass9p5 r0) {
        Boolean bool = r0.A02.A04.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public AnonymousClass9p5(Canvas canvas) {
        this.A00 = canvas;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r8 != 7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r4 = r4 - r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Matrix A04(X.C199369fC r12, X.C198839eH r13, X.C198839eH r14) {
        /*
            android.graphics.Matrix r5 = X.C90524aI.A0B()
            X.8zH r11 = r12.A00
            if (r11 == 0) goto L_0x002f
            float r10 = r13.A03
            float r9 = r14.A03
            float r8 = r10 / r9
            float r7 = r13.A00
            float r6 = r14.A00
            float r2 = r7 / r6
            float r0 = r14.A01
            float r4 = -r0
            float r0 = r14.A02
            float r3 = -r0
            X.9fC r0 = X.C199369fC.A03
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0030
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r8, r2)
        L_0x002c:
            r5.preTranslate(r4, r3)
        L_0x002f:
            return r5
        L_0x0030:
            java.lang.Integer r1 = r12.A01
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x0070
            float r2 = java.lang.Math.max(r8, r2)
        L_0x003a:
            float r10 = r10 / r2
            float r7 = r7 / r2
            int r8 = r11.ordinal()
            r1 = 1073741824(0x40000000, float:2.0)
            switch(r8) {
                case 2: goto L_0x006c;
                case 3: goto L_0x006a;
                case 4: goto L_0x0045;
                case 5: goto L_0x006c;
                case 6: goto L_0x006a;
                case 7: goto L_0x0045;
                case 8: goto L_0x006c;
                case 9: goto L_0x006a;
                default: goto L_0x0045;
            }
        L_0x0045:
            r0 = 5
            if (r8 == r0) goto L_0x0066
            r0 = 8
            if (r8 == r0) goto L_0x0064
            r0 = 6
            if (r8 == r0) goto L_0x0066
            r0 = 9
            if (r8 == r0) goto L_0x0064
            r0 = 4
            if (r8 == r0) goto L_0x0066
            r0 = 7
            if (r8 == r0) goto L_0x0064
        L_0x0059:
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r2, r2)
            goto L_0x002c
        L_0x0064:
            float r6 = r6 - r7
            goto L_0x0068
        L_0x0066:
            float r6 = r6 - r7
            float r6 = r6 / r1
        L_0x0068:
            float r3 = r3 - r6
            goto L_0x0059
        L_0x006a:
            float r9 = r9 - r10
            goto L_0x006e
        L_0x006c:
            float r9 = r9 - r10
            float r9 = r9 / r1
        L_0x006e:
            float r4 = r4 - r9
            goto L_0x0045
        L_0x0070:
            float r2 = java.lang.Math.min(r8, r2)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A04(X.9fC, X.9eH, X.9eH):android.graphics.Matrix");
    }

    private Path A09(AnonymousClass81U r6) {
        Path A0M = C36441kJ.A0M();
        float[] fArr = r6.A00;
        A0M.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = r6.A00;
            if (i >= fArr2.length) {
                break;
            }
            A0M.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (r6 instanceof C1685781d) {
            A0M.close();
        }
        if (r6.A00 == null) {
            r6.A00 = A0C(A0M);
        }
        return A0M;
    }

    public static C198839eH A0C(Path path) {
        RectF A0N = C36441kJ.A0N();
        path.computeBounds(A0N, true);
        return new C198839eH(A0N.left, A0N.top, A0N.width(), A0N.height());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        if (r9 != 7) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0R(X.C1687581v r13, X.AnonymousClass9X5 r14) {
        /*
            r12 = this;
            A0j(r12)
            java.lang.Float r0 = r13.A04
            r4 = 0
            if (r0 == 0) goto L_0x0125
            float r3 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L_0x002b
            float r1 = r14.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            float r0 = r14.A02
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
        L_0x001e:
            float r0 = r14.A02
            double r2 = (double) r0
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r3 = (float) r0
        L_0x002b:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0119
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0031:
            A0d(r13, r12)
            android.graphics.Matrix r5 = X.C90524aI.A0B()
            float r1 = r14.A03
            float r0 = r14.A04
            r5.preTranslate(r1, r0)
            r5.preRotate(r3)
            r5.preScale(r2, r2)
            X.AUX r0 = r13.A02
            float r10 = A01(r0, r12)
            X.AUX r0 = r13.A03
            float r8 = A00(r0, r12)
            X.AUX r0 = r13.A01
            r3 = 1077936128(0x40400000, float:3.0)
            if (r0 == 0) goto L_0x0115
            float r2 = r0.A02(r12)
        L_0x005b:
            X.AUX r0 = r13.A00
            if (r0 == 0) goto L_0x0063
            float r3 = r0.A03(r12)
        L_0x0063:
            X.9eH r1 = r13.A00
            if (r1 == 0) goto L_0x00fb
            float r0 = r1.A03
            float r7 = r2 / r0
            float r0 = r1.A00
            float r6 = r3 / r0
            X.9fC r9 = r13.A00
            if (r9 != 0) goto L_0x0075
            X.9fC r9 = X.C199369fC.A02
        L_0x0075:
            X.9fC r0 = X.C199369fC.A03
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0088
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x00f6
            float r7 = java.lang.Math.max(r7, r6)
        L_0x0087:
            r6 = r7
        L_0x0088:
            float r1 = -r10
            float r1 = r1 * r7
            float r0 = -r8
            float r0 = r0 * r6
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r1 = r12.A00
            r1.concat(r5)
            X.9eH r0 = r13.A00
            float r8 = r0.A03
            float r8 = r8 * r7
            float r10 = r0.A00
            float r10 = r10 * r6
            X.8zH r0 = r9.A00
            int r9 = r0.ordinal()
            r11 = 1073741824(0x40000000, float:2.0)
            switch(r9) {
                case 2: goto L_0x00ed;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00ed;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00f1;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            r0 = 5
            if (r9 == r0) goto L_0x00e5
            r0 = 8
            if (r9 == r0) goto L_0x00e9
            r0 = 6
            if (r9 == r0) goto L_0x00e5
            r0 = 9
            if (r9 == r0) goto L_0x00e9
            r0 = 4
            if (r9 == r0) goto L_0x00e5
            r0 = 7
            if (r9 == r0) goto L_0x00e9
        L_0x00bc:
            X.9d2 r0 = r12.A02
            X.AUW r0 = r0.A04
            java.lang.Boolean r0 = r0.A0M
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cb
            r12.A0H(r8, r4, r2, r3)
        L_0x00cb:
            r5.reset()
            r5.preScale(r7, r6)
            r1.concat(r5)
        L_0x00d4:
            boolean r1 = r12.A0l()
            r0 = 0
            r12.A0W(r13, r0)
            if (r1 == 0) goto L_0x00e1
            r12.A0Y(r13)
        L_0x00e1:
            A0i(r12)
            return
        L_0x00e5:
            float r0 = r3 - r10
            float r0 = r0 / r11
            goto L_0x00eb
        L_0x00e9:
            float r0 = r3 - r10
        L_0x00eb:
            float r4 = r4 - r0
            goto L_0x00bc
        L_0x00ed:
            float r0 = r2 - r8
            float r0 = r0 / r11
            goto L_0x00f3
        L_0x00f1:
            float r0 = r2 - r8
        L_0x00f3:
            float r8 = r4 - r0
            goto L_0x00a8
        L_0x00f6:
            float r7 = java.lang.Math.min(r7, r6)
            goto L_0x0087
        L_0x00fb:
            float r1 = -r10
            float r0 = -r8
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r0 = r12.A00
            r0.concat(r5)
            X.9d2 r0 = r12.A02
            X.AUW r0 = r0.A04
            java.lang.Boolean r0 = r0.A0M
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d4
            r12.A0H(r4, r4, r2, r3)
            goto L_0x00d4
        L_0x0115:
            r2 = 1077936128(0x40400000, float:3.0)
            goto L_0x005b
        L_0x0119:
            X.9d2 r0 = r12.A02
            X.AUW r0 = r0.A04
            X.AUX r0 = r0.A02
            float r2 = r0.A00()
            goto L_0x0031
        L_0x0125:
            r3 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9p5.A0R(X.81v, X.9X5):void");
    }

    private void A0c(AnonymousClass9QD r3, C198179d2 r4) {
        ArrayList A0I = AnonymousClass001.A0I();
        while (true) {
            if (r3 instanceof AnonymousClass825) {
                A0I.add(0, r3);
            }
            if (r3.A00 == null) {
                break;
            }
            r3 = (AnonymousClass9QD) r3.A00;
        }
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            A0a((AnonymousClass825) it.next(), r4);
        }
        C198179d2 r1 = this.A02;
        r4.A02 = r1.A02;
        r4.A03 = r1.A03;
    }

    public static void A0k(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void A0T(B37 b37, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        float f8 = f6;
        float f9 = f;
        float f10 = f7;
        if (f != f6 || f2 != f7) {
            B37 b372 = b37;
            if (f3 == 0.0f || f4 == 0.0f) {
                b372.BOB(f8, f10);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            float f11 = f5;
            double radians = (double) ((float) Math.toRadians(((double) f11) % 360.0d));
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f12 = (f9 - f6) / 2.0f;
            float f13 = (f2 - f7) / 2.0f;
            float A002 = C90514aH.A00(cos, f12, sin, f13);
            float A003 = C90514aH.A00(-sin, f12, f13, cos);
            float f14 = abs * abs;
            float f15 = abs2 * abs2;
            float f16 = A002 * A002;
            float f17 = A003 * A003;
            float f18 = (f16 / f14) + (f17 / f15);
            if (f18 > 1.0f) {
                float sqrt = (float) Math.sqrt((double) f18);
                abs *= sqrt;
                abs2 *= sqrt;
                f14 = abs * abs;
                f15 = abs2 * abs2;
            }
            float f19 = 1.0f;
            if (z == z2) {
                f19 = -1.0f;
            }
            float f20 = f14 * f15;
            float f21 = f14 * f17;
            float f22 = f15 * f16;
            float f23 = ((f20 - f21) - f22) / (f21 + f22);
            if (f23 < 0.0f) {
                f23 = 0.0f;
            }
            float sqrt2 = (float) (((double) f19) * Math.sqrt((double) f23));
            float f24 = ((abs * A003) / abs2) * sqrt2;
            float f25 = sqrt2 * (-((abs2 * A002) / abs));
            float A012 = ((f9 + f6) / 2.0f) + C90514aH.A01(cos, f24, sin, f25);
            float A004 = ((f2 + f7) / 2.0f) + C90514aH.A00(sin, f24, cos, f25);
            float f26 = (A002 - f24) / abs;
            float f27 = (A003 - f25) / abs2;
            float f28 = ((-A002) - f24) / abs;
            float f29 = ((-A003) - f25) / abs2;
            float f30 = (f26 * f26) + (f27 * f27);
            float sqrt3 = (float) Math.sqrt((double) f30);
            float f31 = 1.0f;
            if (f27 < 0.0f) {
                f31 = -1.0f;
            }
            float degrees = (float) Math.toDegrees(((double) f31) * Math.acos((double) (f26 / sqrt3)));
            float sqrt4 = (float) Math.sqrt((double) (f30 * ((f28 * f28) + (f29 * f29))));
            float A005 = C90514aH.A00(f26, f28, f27, f29);
            float f32 = 1.0f;
            if (C90514aH.A01(f26, f29, f27, f28) < 0.0f) {
                f32 = -1.0f;
            }
            double degrees2 = Math.toDegrees(((double) f32) * Math.acos((double) (A005 / sqrt4)));
            if (z2 || degrees2 <= 0.0d) {
                d = 360.0d;
                if (z2 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            double d2 = degrees2 % d;
            int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
            int i = ceil;
            double radians2 = Math.toRadians((double) (degrees % 360.0f));
            float radians3 = (float) (Math.toRadians(d2) / ((double) ceil));
            float f33 = radians3;
            double d3 = (double) radians3;
            double d4 = d3 / 2.0d;
            double sin2 = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
            int i2 = i * 6;
            float[] fArr = new float[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                double d5 = ((double) (((float) i4) * f33)) + radians2;
                double cos2 = Math.cos(d5);
                double sin3 = Math.sin(d5);
                int i5 = i3 + 1;
                fArr[i3] = (float) (cos2 - (sin2 * sin3));
                int i6 = i5 + 1;
                fArr[i5] = (float) (sin3 + (cos2 * sin2));
                double d6 = d5 + d3;
                double cos3 = Math.cos(d6);
                double sin4 = Math.sin(d6);
                int i7 = i6 + 1;
                fArr[i6] = (float) ((sin2 * sin4) + cos3);
                int i8 = i7 + 1;
                fArr[i7] = (float) (sin4 - (sin2 * cos3));
                int i9 = i8 + 1;
                fArr[i8] = (float) cos3;
                i3 = i9 + 1;
                fArr[i9] = (float) sin4;
            }
            Matrix A0B = C90524aI.A0B();
            A0B.postScale(abs, abs2);
            A0B.postRotate(f11);
            A0B.postTranslate(A012, A004);
            A0B.mapPoints(fArr);
            fArr[i2 - 2] = f6;
            fArr[i2 - 1] = f7;
            for (int i10 = 0; i10 < i2; i10 += 6) {
                b372.B51(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]);
            }
        }
    }
}
