package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.02X  reason: invalid class name */
public final class AnonymousClass02X {
    public static AnonymousClass02X A07;
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public static final AnonymousClass02Y A09 = new AnonymousClass02Y();
    public TypedValue A00;
    public AnonymousClass02Z A01;
    public AnonymousClass007 A02;
    public C10890fO A03;
    public WeakHashMap A04;
    public boolean A05;
    public final WeakHashMap A06 = new WeakHashMap(0);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable A01(android.content.Context r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap r0 = r4.A06     // Catch:{ all -> 0x002b }
            java.lang.Object r3 = r0.get(r5)     // Catch:{ all -> 0x002b }
            X.00i r3 = (X.C000700i) r3     // Catch:{ all -> 0x002b }
            r2 = 0
            if (r3 == 0) goto L_0x0029
            java.lang.Object r0 = r3.A05(r6)     // Catch:{ all -> 0x002b }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0026
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r4)
            return r0
        L_0x0026:
            r3.A08(r6)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02X.A01(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private synchronized void A04(Context context, Drawable drawable, long j) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.A06;
            C000700i r1 = (C000700i) weakHashMap.get(context);
            if (r1 == null) {
                r1 = new C000700i();
                weakHashMap.put(context, r1);
            }
            r1.A0A(j, new WeakReference(constantState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList A07(android.content.Context r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x0121 }
            r3 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0121 }
            X.0fO r0 = (X.C10890fO) r0     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r3 = X.C06840Vh.A00(r0, r10)     // Catch:{ all -> 0x0121 }
            android.content.res.ColorStateList r3 = (android.content.res.ColorStateList) r3     // Catch:{ all -> 0x0121 }
        L_0x0014:
            if (r3 != 0) goto L_0x011f
            X.02Z r2 = r8.A01     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00fc
            X.02a r2 = (X.C004502a) r2     // Catch:{ all -> 0x0121 }
            r0 = 2131230918(0x7f0800c6, float:1.8077902E38)
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            if (r10 == r0) goto L_0x00f7
            r0 = 2131230964(0x7f0800f4, float:1.8077996E38)
            r1 = 2131099672(0x7f060018, float:1.7811704E38)
            if (r10 == r0) goto L_0x00f7
            r0 = 2131230963(0x7f0800f3, float:1.8077994E38)
            if (r10 != r0) goto L_0x0095
            r0 = 3
            int[][] r2 = new int[r0][]     // Catch:{ all -> 0x0121 }
            int[] r1 = new int[r0]     // Catch:{ all -> 0x0121 }
            r0 = 2130969038(0x7f0401ce, float:1.7546747E38)
            r6 = 2130969038(0x7f0401ce, float:1.7546747E38)
            android.content.res.ColorStateList r5 = X.C015606t.A02(r9, r0)     // Catch:{ all -> 0x0121 }
            r7 = 2
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0075
            boolean r0 = r5.isStateful()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0075
            int[] r0 = X.C015606t.A04     // Catch:{ all -> 0x0121 }
            r2[r3] = r0     // Catch:{ all -> 0x0121 }
            r0 = r2[r3]     // Catch:{ all -> 0x0121 }
            int r0 = r5.getColorForState(r0, r3)     // Catch:{ all -> 0x0121 }
            r1[r3] = r0     // Catch:{ all -> 0x0121 }
            int[] r0 = X.C015606t.A03     // Catch:{ all -> 0x0121 }
            r2[r4] = r0     // Catch:{ all -> 0x0121 }
            r0 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.C015606t.A01(r9, r0)     // Catch:{ all -> 0x0121 }
            r1[r4] = r0     // Catch:{ all -> 0x0121 }
            int[] r0 = X.C015606t.A05     // Catch:{ all -> 0x0121 }
            r2[r7] = r0     // Catch:{ all -> 0x0121 }
            int r0 = r5.getDefaultColor()     // Catch:{ all -> 0x0121 }
        L_0x006c:
            r1[r7] = r0     // Catch:{ all -> 0x0121 }
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList     // Catch:{ all -> 0x0121 }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x0075:
            int[] r0 = X.C015606t.A04     // Catch:{ all -> 0x0121 }
            r2[r3] = r0     // Catch:{ all -> 0x0121 }
            int r0 = X.C015606t.A00(r9, r6)     // Catch:{ all -> 0x0121 }
            r1[r3] = r0     // Catch:{ all -> 0x0121 }
            int[] r0 = X.C015606t.A03     // Catch:{ all -> 0x0121 }
            r2[r4] = r0     // Catch:{ all -> 0x0121 }
            r0 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.C015606t.A01(r9, r0)     // Catch:{ all -> 0x0121 }
            r1[r4] = r0     // Catch:{ all -> 0x0121 }
            int[] r0 = X.C015606t.A05     // Catch:{ all -> 0x0121 }
            r2[r7] = r0     // Catch:{ all -> 0x0121 }
            int r0 = X.C015606t.A01(r9, r6)     // Catch:{ all -> 0x0121 }
            goto L_0x006c
        L_0x0095:
            r0 = 2131230906(0x7f0800ba, float:1.8077878E38)
            r1 = 2130968992(0x7f0401a0, float:1.7546653E38)
            if (r10 == r0) goto L_0x00ee
            r0 = 2131230900(0x7f0800b4, float:1.8077866E38)
            if (r10 != r0) goto L_0x00a8
            r0 = 0
            android.content.res.ColorStateList r3 = X.C004502a.A00(r9, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00a8:
            r0 = 2131230905(0x7f0800b9, float:1.8077876E38)
            r1 = 2130968990(0x7f04019e, float:1.754665E38)
            if (r10 == r0) goto L_0x00ee
            r0 = 2131230959(0x7f0800ef, float:1.8077985E38)
            if (r10 == r0) goto L_0x00ea
            r0 = 2131230960(0x7f0800f0, float:1.8077988E38)
            if (r10 == r0) goto L_0x00ea
            int[] r0 = r2.A04     // Catch:{ all -> 0x0121 }
            boolean r0 = X.C004502a.A02(r0, r10)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00ca
            r0 = 2130968997(0x7f0401a5, float:1.7546663E38)
            android.content.res.ColorStateList r3 = X.C015606t.A02(r9, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00ca:
            int[] r0 = r2.A05     // Catch:{ all -> 0x0121 }
            boolean r0 = X.C004502a.A02(r0, r10)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00d6
            r1 = 2131099668(0x7f060014, float:1.7811696E38)
            goto L_0x00f7
        L_0x00d6:
            int[] r0 = r2.A03     // Catch:{ all -> 0x0121 }
            boolean r0 = X.C004502a.A02(r0, r10)     // Catch:{ all -> 0x0121 }
            r1 = 2131099667(0x7f060013, float:1.7811694E38)
            if (r0 != 0) goto L_0x00f7
            r0 = 2131230956(0x7f0800ec, float:1.807798E38)
            if (r10 != r0) goto L_0x00fc
            r1 = 2131099670(0x7f060016, float:1.78117E38)
            goto L_0x00f7
        L_0x00ea:
            r1 = 2131099671(0x7f060017, float:1.7811702E38)
            goto L_0x00f7
        L_0x00ee:
            int r0 = X.C015606t.A01(r9, r1)     // Catch:{ all -> 0x0121 }
            android.content.res.ColorStateList r3 = X.C004502a.A00(r9, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00f7:
            android.content.res.ColorStateList r3 = X.C013105r.A00(r9, r1)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00fc:
            r3 = 0
        L_0x00fd:
            if (r3 == 0) goto L_0x011f
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x010a
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0121 }
            r0.<init>()     // Catch:{ all -> 0x0121 }
            r8.A04 = r0     // Catch:{ all -> 0x0121 }
        L_0x010a:
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x0121 }
            X.0fO r1 = (X.C10890fO) r1     // Catch:{ all -> 0x0121 }
            if (r1 != 0) goto L_0x011c
            X.0fO r1 = new X.0fO     // Catch:{ all -> 0x0121 }
            r1.<init>()     // Catch:{ all -> 0x0121 }
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x0121 }
            r0.put(r9, r1)     // Catch:{ all -> 0x0121 }
        L_0x011c:
            r1.A01(r10, r3)     // Catch:{ all -> 0x0121 }
        L_0x011f:
            monitor-exit(r8)
            return r3
        L_0x0121:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02X.A07(android.content.Context, int):android.content.res.ColorStateList");
    }

    public synchronized Drawable A08(Context context, int i) {
        return A09(context, i, false);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02d9 A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ea A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0 A[Catch:{ Exception -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable A09(android.content.Context r11, int r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.A05     // Catch:{ all -> 0x0303 }
            if (r0 != 0) goto L_0x0025
            r0 = 1
            r10.A05 = r0     // Catch:{ all -> 0x0303 }
            r0 = 2131230976(0x7f080100, float:1.807802E38)
            android.graphics.drawable.Drawable r1 = r10.A08(r11, r0)     // Catch:{ all -> 0x0303 }
            if (r1 == 0) goto L_0x02f8
            boolean r0 = r1 instanceof X.C010804n     // Catch:{ all -> 0x0303 }
            if (r0 != 0) goto L_0x0025
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x0303 }
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x0303 }
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02f8
        L_0x0025:
            X.007 r0 = r10.A02     // Catch:{ all -> 0x0303 }
            r2 = 0
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0303 }
            if (r0 != 0) goto L_0x00d7
            X.0fO r0 = r10.A03     // Catch:{ all -> 0x0303 }
            java.lang.String r4 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = X.C06840Vh.A00(r0, r12)     // Catch:{ all -> 0x0303 }
            boolean r0 = r4.equals(r1)     // Catch:{ all -> 0x0303 }
            if (r0 != 0) goto L_0x00d7
            if (r1 == 0) goto L_0x0053
            X.007 r0 = r10.A02     // Catch:{ all -> 0x0303 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0303 }
            if (r0 != 0) goto L_0x0053
            goto L_0x00d7
        L_0x004c:
            X.0fO r0 = new X.0fO     // Catch:{ all -> 0x0303 }
            r0.<init>()     // Catch:{ all -> 0x0303 }
            r10.A03 = r0     // Catch:{ all -> 0x0303 }
        L_0x0053:
            android.util.TypedValue r6 = r10.A00     // Catch:{ all -> 0x0303 }
            if (r6 != 0) goto L_0x005e
            android.util.TypedValue r6 = new android.util.TypedValue     // Catch:{ all -> 0x0303 }
            r6.<init>()     // Catch:{ all -> 0x0303 }
            r10.A00 = r6     // Catch:{ all -> 0x0303 }
        L_0x005e:
            android.content.res.Resources r7 = r11.getResources()     // Catch:{ all -> 0x0303 }
            r9 = 1
            r7.getValue(r12, r6, r9)     // Catch:{ all -> 0x0303 }
            int r0 = r6.assetCookie     // Catch:{ all -> 0x0303 }
            long r0 = (long) r0     // Catch:{ all -> 0x0303 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r6.data     // Catch:{ all -> 0x0303 }
            long r2 = (long) r2     // Catch:{ all -> 0x0303 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r2 = r10.A01(r11, r0)     // Catch:{ all -> 0x0303 }
            if (r2 != 0) goto L_0x00d7
            java.lang.CharSequence r3 = r6.string     // Catch:{ all -> 0x0303 }
            if (r3 == 0) goto L_0x00d0
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0303 }
            java.lang.String r3 = ".xml"
            boolean r3 = r5.endsWith(r3)     // Catch:{ all -> 0x0303 }
            if (r3 == 0) goto L_0x00d0
            android.content.res.XmlResourceParser r8 = r7.getXml(r12)     // Catch:{ Exception -> 0x00c8 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r8)     // Catch:{ Exception -> 0x00c8 }
        L_0x008e:
            int r5 = r8.next()     // Catch:{ Exception -> 0x00c8 }
            r3 = 2
            if (r5 == r3) goto L_0x0098
            if (r5 == r9) goto L_0x0098
            goto L_0x008e
        L_0x0098:
            if (r5 != r3) goto L_0x00c0
            java.lang.String r5 = r8.getName()     // Catch:{ Exception -> 0x00c8 }
            X.0fO r3 = r10.A03     // Catch:{ Exception -> 0x00c8 }
            r3.A01(r12, r5)     // Catch:{ Exception -> 0x00c8 }
            X.007 r3 = r10.A02     // Catch:{ Exception -> 0x00c8 }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ Exception -> 0x00c8 }
            X.0pp r5 = (X.C16630pp) r5     // Catch:{ Exception -> 0x00c8 }
            if (r5 == 0) goto L_0x00b5
            android.content.res.Resources$Theme r3 = r11.getTheme()     // Catch:{ Exception -> 0x00c8 }
            android.graphics.drawable.Drawable r2 = r5.B4Y(r11, r3, r7, r8)     // Catch:{ Exception -> 0x00c8 }
        L_0x00b5:
            if (r2 == 0) goto L_0x00d0
            int r3 = r6.changingConfigurations     // Catch:{ Exception -> 0x00c8 }
            r2.setChangingConfigurations(r3)     // Catch:{ Exception -> 0x00c8 }
            r10.A04(r11, r2, r0)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d0
        L_0x00c0:
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00c8 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00c8 }
            throw r0     // Catch:{ Exception -> 0x00c8 }
        L_0x00c8:
            r3 = move-exception
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Exception while inflating drawable"
            android.util.Log.e(r1, r0, r3)     // Catch:{ all -> 0x0303 }
        L_0x00d0:
            if (r2 != 0) goto L_0x00d7
            X.0fO r0 = r10.A03     // Catch:{ all -> 0x0303 }
            r0.A01(r12, r4)     // Catch:{ all -> 0x0303 }
        L_0x00d7:
            if (r2 != 0) goto L_0x01e0
            android.util.TypedValue r4 = r10.A00     // Catch:{ all -> 0x0303 }
            if (r4 != 0) goto L_0x00e4
            android.util.TypedValue r4 = new android.util.TypedValue     // Catch:{ all -> 0x0303 }
            r4.<init>()     // Catch:{ all -> 0x0303 }
            r10.A00 = r4     // Catch:{ all -> 0x0303 }
        L_0x00e4:
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ all -> 0x0303 }
            r0 = 1
            r1.getValue(r12, r4, r0)     // Catch:{ all -> 0x0303 }
            int r0 = r4.assetCookie     // Catch:{ all -> 0x0303 }
            long r0 = (long) r0     // Catch:{ all -> 0x0303 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r4.data     // Catch:{ all -> 0x0303 }
            long r2 = (long) r2     // Catch:{ all -> 0x0303 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r2 = r10.A01(r11, r0)     // Catch:{ all -> 0x0303 }
            if (r2 != 0) goto L_0x01e0
            X.02Z r3 = r10.A01     // Catch:{ all -> 0x0303 }
            r2 = 0
            if (r3 == 0) goto L_0x01e0
            r2 = 2131230914(0x7f0800c2, float:1.8077894E38)
            if (r12 != r2) goto L_0x0124
            r2 = 2
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x0303 }
            r3 = 0
            r2 = 2131230913(0x7f0800c1, float:1.8077892E38)
            android.graphics.drawable.Drawable r2 = r10.A08(r11, r2)     // Catch:{ all -> 0x0303 }
            r5[r3] = r2     // Catch:{ all -> 0x0303 }
            r3 = 1
            r2 = 2131230915(0x7f0800c3, float:1.8077896E38)
            android.graphics.drawable.Drawable r2 = r10.A08(r11, r2)     // Catch:{ all -> 0x0303 }
            r5[r3] = r2     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x0303 }
            r2.<init>(r5)     // Catch:{ all -> 0x0303 }
            goto L_0x01d6
        L_0x0124:
            r2 = 2131230949(0x7f0800e5, float:1.8077965E38)
            if (r12 != r2) goto L_0x012d
            r3 = 2131165243(0x7f07003b, float:1.7944698E38)
            goto L_0x013e
        L_0x012d:
            r2 = 2131230948(0x7f0800e4, float:1.8077963E38)
            if (r12 != r2) goto L_0x0136
            r3 = 2131165244(0x7f07003c, float:1.79447E38)
            goto L_0x013e
        L_0x0136:
            r2 = 2131230950(0x7f0800e6, float:1.8077967E38)
            if (r12 != r2) goto L_0x01d5
            r3 = 2131165245(0x7f07003d, float:1.7944702E38)
        L_0x013e:
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ all -> 0x0303 }
            int r8 = r2.getDimensionPixelSize(r3)     // Catch:{ all -> 0x0303 }
            r2 = 2131230961(0x7f0800f1, float:1.807799E38)
            android.graphics.drawable.Drawable r7 = r10.A08(r11, r2)     // Catch:{ all -> 0x0303 }
            r2 = 2131230962(0x7f0800f2, float:1.8077992E38)
            android.graphics.drawable.Drawable r5 = r10.A08(r11, r2)     // Catch:{ all -> 0x0303 }
            boolean r2 = r7 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0303 }
            r6 = 0
            if (r2 == 0) goto L_0x01be
            int r2 = r7.getIntrinsicWidth()     // Catch:{ all -> 0x0303 }
            if (r2 != r8) goto L_0x01be
            int r2 = r7.getIntrinsicHeight()     // Catch:{ all -> 0x0303 }
            if (r2 != r8) goto L_0x01be
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7     // Catch:{ all -> 0x0303 }
            android.graphics.Bitmap r3 = r7.getBitmap()     // Catch:{ all -> 0x0303 }
        L_0x016b:
            android.graphics.drawable.BitmapDrawable r9 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0303 }
            r9.<init>(r3)     // Catch:{ all -> 0x0303 }
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ all -> 0x0303 }
            r9.setTileModeX(r2)     // Catch:{ all -> 0x0303 }
            boolean r2 = r5 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0303 }
            if (r2 == 0) goto L_0x01a7
            int r2 = r5.getIntrinsicWidth()     // Catch:{ all -> 0x0303 }
            if (r2 != r8) goto L_0x01a7
            int r2 = r5.getIntrinsicHeight()     // Catch:{ all -> 0x0303 }
            if (r2 != r8) goto L_0x01a7
        L_0x0185:
            r2 = 3
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x0303 }
            r3[r6] = r7     // Catch:{ all -> 0x0303 }
            r7 = 1
            r3[r7] = r5     // Catch:{ all -> 0x0303 }
            r5 = 2
            r3[r5] = r9     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x0303 }
            r2.<init>(r3)     // Catch:{ all -> 0x0303 }
            r3 = 16908288(0x1020000, float:2.387723E-38)
            r2.setId(r6, r3)     // Catch:{ all -> 0x0303 }
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r2.setId(r7, r3)     // Catch:{ all -> 0x0303 }
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r2.setId(r5, r3)     // Catch:{ all -> 0x0303 }
            goto L_0x01d6
        L_0x01a7:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0303 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x0303 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x0303 }
            r2.<init>(r3)     // Catch:{ all -> 0x0303 }
            r5.setBounds(r6, r6, r8, r8)     // Catch:{ all -> 0x0303 }
            r5.draw(r2)     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0303 }
            r5.<init>(r3)     // Catch:{ all -> 0x0303 }
            goto L_0x0185
        L_0x01be:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0303 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x0303 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x0303 }
            r2.<init>(r3)     // Catch:{ all -> 0x0303 }
            r7.setBounds(r6, r6, r8, r8)     // Catch:{ all -> 0x0303 }
            r7.draw(r2)     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0303 }
            r7.<init>(r3)     // Catch:{ all -> 0x0303 }
            goto L_0x016b
        L_0x01d5:
            r2 = 0
        L_0x01d6:
            if (r2 == 0) goto L_0x01e0
            int r3 = r4.changingConfigurations     // Catch:{ all -> 0x0303 }
            r2.setChangingConfigurations(r3)     // Catch:{ all -> 0x0303 }
            r10.A04(r11, r2, r0)     // Catch:{ all -> 0x0303 }
        L_0x01e0:
            if (r2 != 0) goto L_0x01e6
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00E.A00(r11, r12)     // Catch:{ all -> 0x0303 }
        L_0x01e6:
            if (r2 == 0) goto L_0x02f1
            android.content.res.ColorStateList r1 = r10.A07(r11, r12)     // Catch:{ all -> 0x0303 }
            if (r1 == 0) goto L_0x020f
            boolean r0 = X.C010504k.A03(r2)     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x01f8
            android.graphics.drawable.Drawable r2 = r2.mutate()     // Catch:{ all -> 0x0303 }
        L_0x01f8:
            android.graphics.drawable.Drawable r2 = X.AnonymousClass08I.A01(r2)     // Catch:{ all -> 0x0303 }
            X.AnonymousClass076.A01(r1, r2)     // Catch:{ all -> 0x0303 }
            X.02Z r0 = r10.A01     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02f1
            r0 = 2131230963(0x7f0800f3, float:1.8077994E38)
            if (r12 != r0) goto L_0x02f1
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x0303 }
            X.AnonymousClass076.A04(r0, r2)     // Catch:{ all -> 0x0303 }
            goto L_0x02f1
        L_0x020f:
            X.02Z r1 = r10.A01     // Catch:{ all -> 0x0303 }
            if (r1 == 0) goto L_0x028d
            r0 = 2131230958(0x7f0800ee, float:1.8077983E38)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            r7 = 16908303(0x102000f, float:2.387727E-38)
            r3 = 16908288(0x1020000, float:2.387723E-38)
            if (r12 != r0) goto L_0x0221
            goto L_0x025d
        L_0x0221:
            r0 = 2131230949(0x7f0800e5, float:1.8077965E38)
            if (r12 == r0) goto L_0x0230
            r0 = 2131230948(0x7f0800e4, float:1.8077963E38)
            if (r12 == r0) goto L_0x0230
            r0 = 2131230950(0x7f0800e6, float:1.8077967E38)
            if (r12 != r0) goto L_0x028d
        L_0x0230:
            r4 = r2
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r3)     // Catch:{ all -> 0x0303 }
            r0 = 2130968997(0x7f0401a5, float:1.7546663E38)
            int r0 = X.C015606t.A00(r11, r0)     // Catch:{ all -> 0x0303 }
            android.graphics.PorterDuff$Mode r5 = X.AnonymousClass02W.A02     // Catch:{ all -> 0x0303 }
            X.C004502a.A01(r5, r1, r0)     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0303 }
            r0 = 2130968995(0x7f0401a3, float:1.754666E38)
            r3 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.C015606t.A01(r11, r0)     // Catch:{ all -> 0x0303 }
            X.C004502a.A01(r5, r1, r0)     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r6)     // Catch:{ all -> 0x0303 }
            int r0 = X.C015606t.A01(r11, r3)     // Catch:{ all -> 0x0303 }
            goto L_0x0289
        L_0x025d:
            r4 = r2
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r3)     // Catch:{ all -> 0x0303 }
            r0 = 2130968997(0x7f0401a5, float:1.7546663E38)
            r3 = 2130968997(0x7f0401a5, float:1.7546663E38)
            int r0 = X.C015606t.A01(r11, r0)     // Catch:{ all -> 0x0303 }
            android.graphics.PorterDuff$Mode r5 = X.AnonymousClass02W.A02     // Catch:{ all -> 0x0303 }
            X.C004502a.A01(r5, r1, r0)     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0303 }
            int r0 = X.C015606t.A01(r11, r3)     // Catch:{ all -> 0x0303 }
            X.C004502a.A01(r5, r1, r0)     // Catch:{ all -> 0x0303 }
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r6)     // Catch:{ all -> 0x0303 }
            r0 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.C015606t.A01(r11, r0)     // Catch:{ all -> 0x0303 }
        L_0x0289:
            X.C004502a.A01(r5, r1, r0)     // Catch:{ all -> 0x0303 }
            goto L_0x02f1
        L_0x028d:
            r4 = r2
            if (r1 == 0) goto L_0x02ee
            X.02a r1 = (X.C004502a) r1     // Catch:{ all -> 0x0303 }
            android.graphics.PorterDuff$Mode r5 = X.AnonymousClass02W.A02     // Catch:{ all -> 0x0303 }
            int[] r0 = r1.A02     // Catch:{ all -> 0x0303 }
            boolean r0 = X.C004502a.A02(r0, r12)     // Catch:{ all -> 0x0303 }
            r6 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            if (r0 == 0) goto L_0x02a1
            goto L_0x02c4
        L_0x02a1:
            int[] r0 = r1.A01     // Catch:{ all -> 0x0303 }
            boolean r0 = X.C004502a.A02(r0, r12)     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02ad
            r6 = 2130968995(0x7f0401a3, float:1.754666E38)
            goto L_0x02c7
        L_0x02ad:
            int[] r0 = r1.A00     // Catch:{ all -> 0x0303 }
            boolean r0 = X.C004502a.A02(r0, r12)     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02b8
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x0303 }
            goto L_0x02c7
        L_0x02b8:
            r0 = 2131230935(0x7f0800d7, float:1.8077937E38)
            if (r12 != r0) goto L_0x02be
            goto L_0x02c9
        L_0x02be:
            r0 = 2131230917(0x7f0800c5, float:1.80779E38)
            if (r12 != r0) goto L_0x02ee
            goto L_0x02c7
        L_0x02c4:
            r6 = 2130968997(0x7f0401a5, float:1.7546663E38)
        L_0x02c7:
            r1 = -1
            goto L_0x02d3
        L_0x02c9:
            r6 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r0)     // Catch:{ all -> 0x0303 }
        L_0x02d3:
            boolean r0 = X.C010504k.A03(r2)     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02dd
            android.graphics.drawable.Drawable r4 = r2.mutate()     // Catch:{ all -> 0x0303 }
        L_0x02dd:
            int r0 = X.C015606t.A01(r11, r6)     // Catch:{ all -> 0x0303 }
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass02W.A00(r5, r0)     // Catch:{ all -> 0x0303 }
            r4.setColorFilter(r0)     // Catch:{ all -> 0x0303 }
            if (r1 == r3) goto L_0x02f1
            r4.setAlpha(r1)     // Catch:{ all -> 0x0303 }
            goto L_0x02f1
        L_0x02ee:
            if (r13 == 0) goto L_0x02f1
            r2 = 0
        L_0x02f1:
            if (r2 == 0) goto L_0x02f6
            X.C010504k.A02(r2)     // Catch:{ all -> 0x0303 }
        L_0x02f6:
            monitor-exit(r10)
            return r2
        L_0x02f8:
            r0 = 0
            r10.A05 = r0     // Catch:{ all -> 0x0303 }
            java.lang.String r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0303 }
            r0.<init>(r1)     // Catch:{ all -> 0x0303 }
            throw r0     // Catch:{ all -> 0x0303 }
        L_0x0303:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02X.A09(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AnonymousClass02X.class) {
            AnonymousClass02Y r3 = A09;
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) r3.A04(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                r3.A08(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized AnonymousClass02X A03() {
        AnonymousClass02X r0;
        synchronized (AnonymousClass02X.class) {
            if (A07 == null) {
                AnonymousClass02X r2 = new AnonymousClass02X();
                A07 = r2;
                if (Build.VERSION.SDK_INT < 24) {
                    r2.A06(new C09530cW(), "vector");
                    r2.A06(new C09510cU(), "animated-vector");
                    r2.A06(new C09500cT(), "animated-selector");
                    r2.A06(new C09520cV(), "drawable");
                }
            }
            r0 = A07;
        }
        return r0;
    }

    private void A06(C16630pp r3, String str) {
        AnonymousClass007 r1 = this.A02;
        if (r1 == null) {
            r1 = new AnonymousClass007(0);
            this.A02 = r1;
        }
        r1.put(str, r3);
    }

    public static Drawable A02(View view, int i) {
        return A03().A08(view.getContext(), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.graphics.drawable.Drawable r3, X.C015806v r4, int[] r5) {
        /*
            boolean r0 = X.C010504k.A03(r3)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 == r3) goto L_0x0014
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0042
            r2 = 0
        L_0x001d:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x003f
            android.graphics.PorterDuff$Mode r1 = r4.A01
        L_0x0023:
            if (r2 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003d
            r0 = 0
            int r0 = r2.getColorForState(r5, r0)
            android.graphics.PorterDuffColorFilter r0 = A00(r1, r0)
        L_0x0030:
            r3.setColorFilter(r0)
        L_0x0033:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x0013
            r3.invalidateSelf()
            return
        L_0x003d:
            r0 = 0
            goto L_0x0030
        L_0x003f:
            android.graphics.PorterDuff$Mode r1 = A08
            goto L_0x0023
        L_0x0042:
            r3.clearColorFilter()
            goto L_0x0033
        L_0x0046:
            android.content.res.ColorStateList r2 = r4.A00
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02X.A05(android.graphics.drawable.Drawable, X.06v, int[]):void");
    }
}
