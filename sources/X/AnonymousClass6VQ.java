package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6VQ  reason: invalid class name */
public final class AnonymousClass6VQ {
    public static final C130956Nc A05 = new C130956Nc();
    public int A00;
    public RectF A01;
    public RectF A02;
    public String A03;
    public List A04;

    public final void A04(int i, Bitmap bitmap) {
        AnonymousClass00C.A0D(bitmap, 0);
        Canvas A0A = C90524aI.A0A(bitmap);
        A06(bitmap, A0A, i, false, false);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C129196Ft A0N = C90524aI.A0N(it);
            if (A0N instanceof AnonymousClass5Ck) {
                C129196Ft.A06(A0A, A0N);
            } else if (A0N instanceof AnonymousClass5Cl) {
                C129196Ft.A06(A0A, A0N);
            } else if (A0N instanceof AnonymousClass5Ch) {
                C129196Ft.A06(A0A, A0N);
            } else if (A0N instanceof AnonymousClass5Cg) {
                C129196Ft.A06(A0A, A0N);
            } else if (A0N instanceof AnonymousClass5Cf) {
                C129196Ft.A06(A0A, A0N);
            } else if (A0N instanceof AnonymousClass5Ci) {
                C129196Ft.A06(A0A, A0N);
            } else if (A0N instanceof AnonymousClass5Ce) {
                C129196Ft.A06(A0A, A0N);
            } else if (!(A0N instanceof C104955Cm)) {
                if (A0N instanceof AnonymousClass5Cj) {
                    C129196Ft.A06(A0A, A0N);
                } else if (A0N instanceof AnonymousClass5Cc) {
                    C129196Ft.A06(A0A, A0N);
                } else if (A0N instanceof AnonymousClass5Cd) {
                    C129196Ft.A06(A0A, A0N);
                } else if (A0N instanceof AnonymousClass5CZ) {
                    AnonymousClass5CZ r1 = (AnonymousClass5CZ) A0N;
                    AnonymousClass00C.A0D(A0A, 0);
                    if (r1.A00 != null) {
                        A0A.save();
                        r1.A0I(A0A);
                        A0A.restore();
                    }
                } else if (A0N instanceof AnonymousClass5CX) {
                    C129196Ft.A06(A0A, A0N);
                } else if (A0N instanceof AnonymousClass5CY) {
                    C129196Ft.A06(A0A, A0N);
                } else if (A0N instanceof AnonymousClass5Co) {
                    C129196Ft.A06(A0A, A0N);
                } else {
                    C129196Ft.A06(A0A, A0N);
                }
            }
        }
    }

    public final void A05(Bitmap bitmap, int i, boolean z, boolean z2) {
        AnonymousClass00C.A0D(bitmap, 0);
        Canvas A0A = C90524aI.A0A(bitmap);
        A06(bitmap, A0A, i, z, z2);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C90524aI.A0N(it).A0I(A0A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(java.io.File r5) {
        /*
            r4 = this;
            r1 = 0
            java.lang.String r0 = r4.A02()
            r3 = 0
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x001d }
            r2.<init>(r5)     // Catch:{ IOException -> 0x001d }
            r2.write(r0)     // Catch:{ all -> 0x0016 }
            r2.close()     // Catch:{ IOException -> 0x001d }
            r3 = 1
            return r3
        L_0x0016:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x001d }
            throw r0     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r1 = move-exception
            java.lang.String r0 = "Doodle/save failed to save doodle string to file"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VQ.A08(java.io.File):boolean");
    }

    private final boolean A01(String... strArr) {
        List list = this.A04;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass02R.A0F(C90524aI.A0N(it).A0A(), strArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ArrayList A03(float f, float f2) {
        InteractiveAnnotation interactiveAnnotation;
        List list = this.A04;
        ArrayList<C158467gy> A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if ((next instanceof C158467gy) && next != null) {
                A0I.add(next);
            }
        }
        if (!A0I.isEmpty()) {
            RectF rectF = this.A01;
            float f3 = f;
            float f4 = f2;
            Matrix A002 = A00(f3, f4, (float) this.A00, rectF.width(), rectF.height(), false, false);
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (C158467gy r5 : A0I) {
                PointF pointF = new PointF(f3, f4);
                C129196Ft r3 = (C129196Ft) r5;
                RectF rectF2 = r3.A02;
                rectF2.sort();
                Matrix A0B = C90524aI.A0B();
                A0B.preConcat(A002);
                A0B.preTranslate(-rectF.left, -rectF.top);
                A0B.preRotate(r3.A00, rectF2.centerX(), rectF2.centerY());
                float[] fArr = new float[8];
                float f5 = rectF2.left;
                fArr[0] = f5;
                float f6 = rectF2.top;
                fArr[1] = f6;
                float f7 = rectF2.right;
                fArr[2] = f7;
                fArr[3] = f6;
                fArr[4] = f7;
                float f8 = rectF2.bottom;
                fArr[5] = f8;
                C90494aF.A1P(fArr, f5, f8);
                A0B.mapPoints(fArr);
                float f9 = fArr[0];
                float f10 = pointF.x;
                double d = (double) (f9 / f10);
                float f11 = fArr[1];
                float f12 = pointF.y;
                SerializablePoint[] serializablePointArr = {new SerializablePoint(d, (double) (f11 / f12)), new SerializablePoint((double) (fArr[2] / f10), (double) (fArr[3] / f12)), new SerializablePoint((double) (fArr[4] / f10), (double) (fArr[5] / f12)), new SerializablePoint((double) (fArr[6] / f10), (double) (fArr[7] / f12))};
                if (r5 instanceof AnonymousClass5Co) {
                    boolean BuC = r5.BuC();
                    AnonymousClass5Co r52 = (AnonymousClass5Co) r5;
                    interactiveAnnotation = new InteractiveAnnotation(r52.A06, serializablePointArr, r52.A00, r52.A01, BuC);
                } else if (r5 instanceof C104955Cm) {
                    C104955Cm r4 = (C104955Cm) r5;
                    C28981Uw A012 = C28981Uw.A03.A01(r4.A03);
                    if (A012 != null) {
                        boolean BuC2 = r5.BuC();
                        int i = r4.A00;
                        String str = r4.A04;
                        interactiveAnnotation = new InteractiveAnnotation(A012, r4.A01, str, r4.A02, serializablePointArr, i, BuC2);
                    }
                }
                A0I2.add(interactiveAnnotation);
            }
            if (!A0I2.isEmpty()) {
                return A0I2;
            }
        }
        return null;
    }

    public final void A07(C1042358u r20) {
        long j = 0;
        C1042358u r1 = r20;
        if (A01("pen")) {
            r1.A0F = Long.valueOf(C36371kC.A0A(r1.A0F) + 1);
        }
        if (A01("arrow", "oval", "thinking-bubble", "speech-bubble-oval", "speech-bubble-rect", "digital-clock", "analog-clock", "location", "sticker", "emoji")) {
            r1.A0J = Long.valueOf(C36371kC.A0A(r1.A0J) + 1);
        }
        if (A01("text")) {
            Long l = r1.A0L;
            if (l != null) {
                j = l.longValue();
            }
            r1.A0L = Long.valueOf(j + 1);
        }
        r1.A04 = Boolean.valueOf(A01("location"));
    }

    public AnonymousClass6VQ(RectF rectF, RectF rectF2, List list, int i) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = i;
        this.A04 = list;
    }

    public static final Matrix A00(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        float f6;
        float f7;
        float f8;
        Matrix A0B = C90524aI.A0B();
        int i = ((f3 % 180.0f) > 90.0f ? 1 : ((f3 % 180.0f) == 90.0f ? 0 : -1));
        if (i == 0) {
            f6 = f2 / f4;
            f7 = f / f5;
        } else {
            float f9 = f2 / f5;
            f6 = f / f4;
            f7 = f9;
        }
        A0B.preScale(f6, f7);
        float f10 = 0.0f;
        if (z) {
            Matrix A0B2 = C90524aI.A0B();
            A0B2.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A0B.preConcat(A0B2);
            float f11 = f4;
            if (i == 0) {
                f11 = f5;
            }
            A0B.preTranslate(-f11, 0.0f);
        }
        if (z2) {
            Matrix A0B3 = C90524aI.A0B();
            A0B3.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A0B.preConcat(A0B3);
            float f12 = f5;
            if (i == 0) {
                f12 = f4;
            }
            A0B.preTranslate(-f12, 0.0f);
        }
        A0B.preRotate(f3);
        if (f3 == 90.0f) {
            A0B.preTranslate(0.0f, -f5);
        } else {
            if (f3 == 180.0f) {
                f8 = -f4;
                f10 = -f5;
            } else {
                f8 = -f4;
                if (f3 != 270.0f) {
                    if (f3 != 0.0f) {
                        throw AnonymousClass001.A08("Failed requirement.");
                    }
                }
            }
            A0B.preTranslate(f8, f10);
            return A0B;
        }
        return A0B;
    }

    public final String A02() {
        AnonymousClass6L5 r4;
        JSONObject jSONObject;
        try {
            JSONArray A0u = C90524aI.A0u();
            List list = this.A04;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C129196Ft A0N = C90524aI.A0N(it);
                JSONObject A1B = C36441kJ.A1B();
                A0N.A0L(A1B);
                A0u.put(A1B);
            }
            JSONObject A0w = C90484aE.A0w();
            RectF rectF = this.A02;
            A0w.put("l", (int) (rectF.left * 100.0f));
            A0w.put("t", (int) (rectF.top * 100.0f));
            A0w.put("r", (int) (rectF.right * 100.0f));
            A0w.put("b", (int) (rectF.bottom * 100.0f));
            RectF rectF2 = this.A01;
            A0w.put("crop-l", (int) (rectF2.left * 100.0f));
            A0w.put("crop-t", (int) (rectF2.top * 100.0f));
            A0w.put("crop-r", (int) (rectF2.right * 100.0f));
            A0w.put("crop-b", (int) (rectF2.bottom * 100.0f));
            A0w.put("rotate", this.A00);
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                if (next instanceof AnonymousClass5Ci) {
                    A0I.add(next);
                }
            }
            Iterator it2 = A0I.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    r4 = null;
                    break;
                }
                r4 = ((AnonymousClass5Ci) it2.next()).A04;
                if (r4 != null) {
                    break;
                }
            }
            if (r4 != null) {
                if (r4.A03 == null) {
                    jSONObject = null;
                } else {
                    jSONObject = C36441kJ.A1B();
                    jSONObject.put("origin-width", r4.A01);
                    jSONObject.put("origin-height", r4.A00);
                    jSONObject.put("small-bitmap", AnonymousClass6Y8.A0B(r4.A03));
                }
                A0w.put("blurred-bitmap-provider", jSONObject);
            }
            return C90484aE.A0l(A0u, "shapes", A0w);
        } catch (JSONException e) {
            Log.e("Doodle/toJson error while constructing JSON", e);
            return null;
        }
    }

    public final void A06(Bitmap bitmap, Canvas canvas, int i, boolean z, boolean z2) {
        RectF rectF = this.A02;
        canvas.concat(A00((float) bitmap.getWidth(), (float) bitmap.getHeight(), (float) i, rectF.width(), rectF.height(), z, z2));
    }
}
