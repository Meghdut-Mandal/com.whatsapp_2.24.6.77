package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1SV  reason: invalid class name */
public class AnonymousClass1SV extends AnonymousClass12N {
    public static final BitmapFactory.Options A08;
    public int A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass1PM A02;
    public final AnonymousClass1SX A03;
    public final HashMap A04 = new HashMap();
    public final List A05 = new ArrayList();
    public final AnonymousClass1SW A06;
    public final AnonymousClass1EJ A07;

    private synchronized Bitmap A02(String str) {
        Bitmap bitmap;
        bitmap = (Bitmap) this.A02.A09(str);
        if (bitmap == null || bitmap.isRecycled()) {
            if (bitmap != null && bitmap.isRecycled()) {
                Log.e("!! recycled message in hard cache");
            }
            HashMap hashMap = this.A04;
            SoftReference softReference = (SoftReference) hashMap.get(str);
            if (softReference != null) {
                bitmap = (Bitmap) softReference.get();
            } else {
                bitmap = null;
            }
            if (bitmap == null || bitmap.isRecycled()) {
                if (softReference != null) {
                    hashMap.remove(str);
                }
                bitmap = null;
            }
        }
        return bitmap;
    }

    private void A04(View view, AnonymousClass3T1 r12, AnonymousClass68H r13, C160527l9 r14, Object obj) {
        AnonymousClass3T1 r6;
        Bitmap A022;
        synchronized (this) {
            r6 = r12;
            A022 = A02(A03(r12));
        }
        View view2 = view;
        AnonymousClass68H r3 = r13;
        C160527l9 r8 = r14;
        if (A022 != null) {
            r13.A02(A022);
            r14.Bte(A022, view, r12);
            return;
        }
        Bitmap A002 = r13.A00();
        C63683Kz A0V = r12.A0V();
        if (A002 != null || A0V == null || A0V.A01()) {
            r14.Bte(A002, view, r12);
            r13.A01();
            return;
        }
        this.A06.A00(r12, new C35461ij(this, r3, A0V, view2, r6, obj, r8, 1));
        r14.Btu(view);
    }

    public static synchronized void A06(View view, AnonymousClass3T1 r6, C160527l9 r7, AnonymousClass1SV r8, Object obj, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass1SV r4 = r8;
        synchronized (r4) {
            View view2 = view;
            Object obj2 = obj;
            view2.setTag(obj);
            if (C224714l.A02()) {
                r8.A0B();
            }
            AnonymousClass3T1 r2 = r6;
            C160527l9 r3 = r7;
            boolean z4 = z3;
            r4.A04(view2, r2, new C106785Li(view2, r2, r3, r4, obj2, i, z4, z2, z), r3, obj2);
        }
    }

    public synchronized Bitmap A0A(AnonymousClass3T1 r4) {
        Bitmap A012;
        C18740tg.A00();
        A012 = A01(r4, A07(r4), 100, false, false);
        if (A012 == null) {
            C63683Kz A0V = r4.A0V();
            if (A0V != null && !A0V.A01()) {
                this.A07.A00(r4);
                byte[] A022 = A0V.A02();
                if (A022 != null) {
                    A012 = C111745cm.A00(A08, A022, 100);
                }
            }
            A012 = null;
        }
        return A012;
    }

    public void A0C(View view, AnonymousClass3T1 r3, C160527l9 r4) {
        A0G(view, r3, r4, false);
    }

    public void A0E(View view, AnonymousClass3T1 r12, C160527l9 r13, Object obj, boolean z) {
        view.setTag(obj);
        C123495wb r6 = new C123495wb(view, r12, r13, this, obj);
        AnonymousClass1SX r0 = this.A03;
        r0.A01(view, r12, r6, r13, obj, z);
    }

    public void A0G(View view, AnonymousClass3T1 r11, C160527l9 r12, boolean z) {
        View view2 = view;
        C160527l9 r2 = r12;
        A06(view2, r11, r2, this, r11.A1J, 100, z, false, true);
    }

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        synchronized (this) {
            this.A04.clear();
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A08 = options;
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inDither = true;
    }

    public AnonymousClass1SV(C20690y0 r12, AnonymousClass16L r13, C19630wG r14, C18820ts r15, C20060wx r16, AnonymousClass1H2 r17, C20810yC r18, C25521Gq r19, AnonymousClass1SW r20, AnonymousClass1EJ r21, AnonymousClass1D5 r22, AnonymousClass1HA r23, AnonymousClass1HB r24, C220112n r25) {
        super(r25);
        this.A07 = r21;
        this.A06 = r20;
        this.A03 = new AnonymousClass1SX(r12, r14, r15, r16, r17, r18, r19, r22, r23, r24);
        StringBuilder sb = new StringBuilder();
        sb.append("messagethumbcache/construct ");
        sb.append((int) ((C19430v1.A00 / 1024) / 8));
        Log.i(sb.toString());
        this.A02 = r13.A02();
        r13.A01().A0B(new C36281k3(this, 1));
        A08();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        if (r2 > 0.0f) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass2bU r5, int r6) {
        /*
            X.3Qj r1 = r5.A01
            X.C18740tg.A06(r1)
            int r2 = r1.A0A
            if (r2 <= 0) goto L_0x0016
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x0016
            float r1 = (float) r6
            float r0 = (float) r0
            float r1 = r1 * r0
            float r0 = (float) r2
        L_0x0011:
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r0 <= 0) goto L_0x0068
            return r0
        L_0x0016:
            java.io.File r0 = r1.A0I
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0068
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            java.io.File r0 = r1.A0I
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r2)
            int r0 = r2.outWidth
            if (r0 <= 0) goto L_0x0068
            int r0 = r2.outHeight
            if (r0 <= 0) goto L_0x0068
            java.io.File r0 = r1.A0I     // Catch:{ IOException -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0062 }
            X.9oz r1 = new X.9oz     // Catch:{ IOException -> 0x0062 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x0062 }
            r0 = 1
            int r1 = r1.A0Y(r0)     // Catch:{ IOException -> 0x0062 }
            r0 = 6
            if (r1 == r0) goto L_0x0059
            r0 = 8
            if (r1 == r0) goto L_0x0059
            float r1 = (float) r6     // Catch:{ IOException -> 0x0062 }
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            float r1 = r1 * r0
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            goto L_0x0011
        L_0x0059:
            float r1 = (float) r6     // Catch:{ IOException -> 0x0062 }
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            float r1 = r1 * r0
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            goto L_0x0011
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = "failure retrieving exif, io exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0068:
            int r0 = r5.A1I
            boolean r4 = X.C66013Ui.A0M(r0)
            if (r4 == 0) goto L_0x00c7
            int r0 = r5.A0D()
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = r5.A0b()
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r5.A0b()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00c7
            java.lang.String r1 = r5.A0b()
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r1, r0)
        L_0x008f:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            int r1 = r3.length
            r0 = 0
            android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1, r2)
            int r1 = r2.outWidth
            if (r1 <= 0) goto L_0x00e5
            int r0 = r2.outHeight
            if (r0 <= 0) goto L_0x00e5
            float r2 = (float) r0
            float r0 = (float) r1
            float r2 = r2 / r0
        L_0x00a7:
            if (r4 == 0) goto L_0x00e8
            X.3Kz r1 = r5.A0V()
            X.C18740tg.A06(r1)
            java.lang.Float r0 = r1.A00
            if (r0 != 0) goto L_0x00ba
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.A00 = r0
        L_0x00ba:
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00e8
            float r0 = (float) r6
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
        L_0x00c7:
            byte[] r0 = r5.A1V()
            if (r0 == 0) goto L_0x00d9
            byte[] r0 = r5.A1V()
            int r0 = r0.length
            if (r0 <= 0) goto L_0x00d9
            byte[] r3 = r5.A1V()
            goto L_0x008f
        L_0x00d9:
            X.3Qj r0 = r5.A01
            if (r0 == 0) goto L_0x00e5
            float r2 = r0.A00
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e5
            goto L_0x00a7
        L_0x00e5:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00a7
        L_0x00e8:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SV.A00(X.2bU, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(X.AnonymousClass3T1 r2, byte[] r3, int r4, boolean r5, boolean r6) {
        /*
            boolean r0 = r2 instanceof X.AnonymousClass4TX
            r1 = 0
            if (r0 != 0) goto L_0x0049
            if (r3 == 0) goto L_0x0049
            android.graphics.BitmapFactory$Options r0 = A08
            android.graphics.Bitmap r3 = X.C111745cm.A00(r0, r3, r4)
            if (r3 == 0) goto L_0x0049
            if (r5 == 0) goto L_0x0022
            boolean r0 = r2 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0023
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x001a:
            int r1 = r0.intValue()
            r0 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r3, r1, r0)
        L_0x0022:
            return r3
        L_0x0023:
            boolean r0 = r2 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0022
            boolean r0 = r2 instanceof X.C46972by
            r2 = 1
            if (r0 != 0) goto L_0x0036
            if (r6 == 0) goto L_0x002f
            r2 = 2
        L_0x002f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x001a
        L_0x0036:
            int r0 = r3.getHeight()
            r1 = 100
            if (r0 >= r1) goto L_0x0022
            int r0 = r3.getWidth()
            if (r0 >= r1) goto L_0x0022
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x001a
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SV.A01(X.3T1, byte[], int, boolean, boolean):android.graphics.Bitmap");
    }

    public static String A03(AnonymousClass3T1 r4) {
        String str;
        String str2;
        C64933Qa r0 = r4.A1J;
        if (r0 == null || (str = r0.A01) == null) {
            return "null";
        }
        AnonymousClass11F r02 = r0.A00;
        if (r02 != null) {
            str2 = r02.toString();
        } else {
            str2 = "";
        }
        if (C203369nr.A08(r4)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(":");
            sb.append(C203369nr.A03(r4));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        return sb2.toString();
    }

    public static byte[] A07(AnonymousClass3T1 r2) {
        if (!(r2 instanceof AnonymousClass4TX)) {
            if (r2 instanceof AnonymousClass2bV) {
                return ((AnonymousClass2bV) r2).A1c();
            }
            if (r2.A0V() != null && r2.A0V().A01()) {
                return r2.A0V().A02();
            }
        }
        return null;
    }

    public int A09(Context context) {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A00 = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public void A0D(View view, AnonymousClass3T1 r3, C160527l9 r4) {
        A05(view, r3, r4, this, r3.A1J);
    }

    public void A0F(View view, AnonymousClass3T1 r8, C160527l9 r9, boolean z) {
        AnonymousClass3BG r3;
        String str;
        view.setTag(r8.A0V.A09);
        synchronized (this) {
            if (C224714l.A02()) {
                A0B();
            }
            AnonymousClass3BG r0 = r8.A0V;
            if (r0 != null) {
                byte[] bArr = r0.A00;
                if (!TextUtils.isEmpty(r0.A04)) {
                    r3 = r8.A0V;
                    str = r3.A04;
                } else {
                    r3 = r8.A0V;
                    str = r3.A09;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(z);
                String obj = sb.toString();
                if (bArr == null) {
                    bArr = r3.A0F;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append("_micro");
                    obj = sb2.toString();
                }
                Bitmap A022 = A02(obj);
                if (A022 == null) {
                    A022 = A01(r8, bArr, 2000, z, false);
                    this.A04.remove(obj);
                    if (A022 != null) {
                        this.A02.A0D(obj, A022);
                    }
                }
                r9.Bte(A022, view, r8);
            }
        }
    }

    public void A0H(AnonymousClass3T1 r3) {
        this.A02.A0C(A03(r3));
        this.A04.remove(A03(r3));
    }

    public String BHv() {
        StringBuilder sb = new StringBuilder();
        sb.append("mtc=");
        sb.append(this.A04.size());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (((X.AnonymousClass2bV) r4).A1c() == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.view.View r3, X.AnonymousClass3T1 r4, X.C160527l9 r5, X.AnonymousClass1SV r6, java.lang.Object r7) {
        /*
            r3.setTag(r7)
            boolean r0 = X.C224714l.A02()
            r2 = r6
            if (r0 == 0) goto L_0x000d
            r6.A0B()
        L_0x000d:
            boolean r0 = r4 instanceof X.AnonymousClass4TX
            r6 = r5
            if (r0 != 0) goto L_0x0020
            boolean r0 = r4 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0025
            r0 = r4
            X.2bV r0 = (X.AnonymousClass2bV) r0
            byte[] r1 = r0.A1c()
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0020:
            r0 = 0
            r5.Bte(r0, r3, r4)
            return
        L_0x0025:
            boolean r0 = r4.A1Q()
        L_0x0029:
            if (r0 == 0) goto L_0x0020
            X.5Lh r5 = new X.5Lh
            r5.<init>(r4, r2)
            r2.A04(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SV.A05(android.view.View, X.3T1, X.7l9, X.1SV, java.lang.Object):void");
    }

    public void A0B() {
        C18740tg.A01();
        List<Runnable> list = this.A05;
        synchronized (list) {
            for (Runnable run : list) {
                run.run();
            }
            list.clear();
        }
    }
}
