package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.06m  reason: invalid class name and case insensitive filesystem */
public abstract class C015006m {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static int A01(TypedArray typedArray) {
        return typedArray.getType(0);
    }

    public static Typeface A03(Context context, int i) {
        Context context2 = context;
        if (context.isRestricted()) {
            return null;
        }
        return A04(context2, new TypedValue(), (AnonymousClass071) null, i, 0, false, false);
    }

    public static void A07(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static int A00(Resources.Theme theme, Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C015206o.A00(theme, resources, i);
        }
        return resources.getColor(i);
    }

    public static ColorStateList A02(Resources.Theme theme, Resources resources, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        C02490An r5;
        Resources.Theme theme2;
        C015106n r4 = new C015106n(theme, resources);
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(r4);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r5 = (C02490An) sparseArray.get(i)) == null)) {
                if (!r5.A02.equals(r4.A01.getConfiguration()) || (!((theme2 = r4.A00) == null && r5.A00 == 0) && (theme2 == null || r5.A00 != theme2.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList = r5.A01;
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z) {
            try {
                colorStateList2 = C02480Am.A02(theme, resources, resources.getXml(i));
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList2 != null) {
            synchronized (obj) {
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(r4);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(r4, sparseArray2);
                }
                sparseArray2.append(i, new C02490An(colorStateList2, r4.A01.getConfiguration(), theme));
            }
            return colorStateList2;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return C015206o.A01(theme, resources, i);
        } else {
            return resources.getColorStateList(i);
        }
    }

    public static C15710nr A05(Resources resources, XmlPullParser xmlPullParser) {
        List list;
        List list2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser2), C33531fW.A01);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, 500);
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser2.next() != 3) {
                if (xmlPullParser2.getEventType() == 2) {
                    if (xmlPullParser2.getName().equals("font")) {
                        arrayList.add(A06(resources, xmlPullParser2));
                    } else {
                        A07(xmlPullParser2);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C09610ce((AnonymousClass0TP[]) arrayList.toArray(new AnonymousClass0TP[0]));
        }
        while (xmlPullParser2.next() != 3) {
            A07(xmlPullParser2);
        }
        if (resourceId == 0) {
            list2 = Collections.emptyList();
        } else {
            TypedArray obtainTypedArray = resources.obtainTypedArray(resourceId);
            try {
                if (obtainTypedArray.length() == 0) {
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (A01(obtainTypedArray) == 1) {
                        for (int i = 0; i < obtainTypedArray.length(); i++) {
                            int resourceId2 = obtainTypedArray.getResourceId(i, 0);
                            if (resourceId2 != 0) {
                                String[] stringArray = resources.getStringArray(resourceId2);
                                ArrayList arrayList3 = new ArrayList();
                                for (String decode : stringArray) {
                                    arrayList3.add(Base64.decode(decode, 0));
                                }
                                arrayList2.add(arrayList3);
                            }
                        }
                        list = arrayList2;
                    } else {
                        String[] stringArray2 = resources.getStringArray(resourceId);
                        ArrayList arrayList4 = new ArrayList();
                        for (String decode2 : stringArray2) {
                            arrayList4.add(Base64.decode(decode2, 0));
                        }
                        arrayList2.add(arrayList4);
                        list = arrayList2;
                    }
                }
            } finally {
                obtainTypedArray.recycle();
            }
        }
        return new C09620cf(new AnonymousClass0U3(string, string2, string3, list2), string4, integer, integer2);
    }

    public static AnonymousClass0TP A06(Resources resources, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C33531fW.A02);
        int i = 1;
        if (obtainAttributes.hasValue(8)) {
            i = 8;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = 2;
        if (obtainAttributes.hasValue(6)) {
            i3 = 6;
        }
        boolean z = false;
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        }
        int i4 = 3;
        if (obtainAttributes.hasValue(9)) {
            i4 = 9;
        }
        int i5 = 4;
        if (obtainAttributes.hasValue(7)) {
            i5 = 7;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = 0;
        if (obtainAttributes.hasValue(5)) {
            i7 = 5;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            A07(xmlPullParser);
        }
        return new AnonymousClass0TP(string2, string, i2, i6, resourceId, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0253, code lost:
        if (r0 != null) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e8, code lost:
        if (r19 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0171 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ed A[Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0 A[Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b A[Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017c A[Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface A04(android.content.Context r17, android.util.TypedValue r18, X.AnonymousClass071 r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            r16 = 0
            r10 = r17
            android.content.res.Resources r6 = r10.getResources()
            r11 = 1
            r1 = r18
            r8 = r20
            r6.getValue(r8, r1, r11)
            java.lang.String r5 = "ResourcesCompat"
            java.lang.CharSequence r0 = r1.string
            if (r0 == 0) goto L_0x0293
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r4.startsWith(r0)
            r3 = -3
            r9 = r19
            if (r0 == 0) goto L_0x028b
            int r0 = r1.assetCookie
            X.00v r2 = X.AnonymousClass089.A00
            r7 = r21
            java.lang.String r0 = X.AnonymousClass089.A00(r6, r4, r8, r0, r7)
            java.lang.Object r0 = r2.A04(r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0072
            if (r19 == 0) goto L_0x004a
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r1)
            X.0gK r1 = new X.0gK
            r1.<init>(r0, r9)
            r2.post(r1)
        L_0x004a:
            r16 = r0
        L_0x004c:
            if (r16 != 0) goto L_0x0292
            if (r9 != 0) goto L_0x0292
            if (r23 != 0) goto L_0x0292
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Font resource ID #0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r8)
            r1.append(r0)
            java.lang.String r0 = " could not be retrieved."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0072:
            if (r23 != 0) goto L_0x004c
            java.lang.String r12 = r4.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r0 = ".xml"
            boolean r0 = r12.endsWith(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 == 0) goto L_0x0236
            android.content.res.XmlResourceParser r12 = r6.getXml(r8)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x0084:
            int r13 = r12.next()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r0 = 2
            if (r13 == r0) goto L_0x008f
            if (r13 != r11) goto L_0x0084
            goto L_0x01f9
        L_0x008f:
            r11 = 0
            java.lang.String r13 = "font-family"
            r12.require(r0, r11, r13)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r0 = r12.getName()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            boolean r0 = r0.equals(r13)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 == 0) goto L_0x00a4
            X.0nr r11 = A05(r6, r12)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x00a7
        L_0x00a4:
            A07(r12)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x00a7:
            if (r11 != 0) goto L_0x00b4
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r5, r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r19 == 0) goto L_0x004c
            r9.A00(r3)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x004c
        L_0x00b4:
            int r14 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            boolean r0 = r11 instanceof X.C09620cf     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 == 0) goto L_0x020a
            X.0cf r11 = (X.C09620cf) r11     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r1 = r11.A03     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r0 = 0
            if (r1 == 0) goto L_0x00db
            boolean r12 = r1.isEmpty()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r12 != 0) goto L_0x00db
            r13 = 0
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r1, r13)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r13)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r12 == 0) goto L_0x00db
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r1 != 0) goto L_0x00db
            r0 = r12
        L_0x00db:
            if (r0 == 0) goto L_0x00e1
            if (r19 == 0) goto L_0x004a
            goto L_0x0255
        L_0x00e1:
            if (r22 == 0) goto L_0x00e8
            int r0 = r11.A00     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 != 0) goto L_0x00ee
            goto L_0x00ea
        L_0x00e8:
            if (r19 != 0) goto L_0x00ee
        L_0x00ea:
            r15 = 1
        L_0x00eb:
            if (r22 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00ee:
            r15 = 0
            goto L_0x00eb
        L_0x00f0:
            r13 = -1
            goto L_0x00f4
        L_0x00f2:
            int r13 = r11.A01     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x00f4:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.0WH r0 = new X.0WH     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r0.<init>(r9)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.0U3 r12 = r11.A02     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.0Tq r11 = new X.0Tq     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r11.<init>(r1, r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r15 == 0) goto L_0x017c
            java.util.concurrent.ExecutorService r0 = X.C07440Xr.A03     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r0 = r12.A00     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.append(r7)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r1 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.00v r0 = X.C07440Xr.A00     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.Object r0 = r0.A04(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 != 0) goto L_0x0201
            r0 = -1
            if (r13 != r0) goto L_0x013b
            X.0WP r0 = X.C07440Xr.A01(r10, r12, r1, r7)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r11.A00(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.graphics.Typeface r0 = r0.A01     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x0219
        L_0x013b:
            r22 = 0
            X.0t3 r0 = new X.0t3     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r19 = r12
            r20 = r1
            r17 = r0
            r18 = r10
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.util.concurrent.ExecutorService r1 = X.C07440Xr.A03     // Catch:{ InterruptedException -> 0x0171 }
            java.util.concurrent.Future r12 = r1.submit(r0)     // Catch:{ InterruptedException -> 0x0171 }
            long r0 = (long) r13     // Catch:{ InterruptedException -> 0x0171 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x016a, InterruptedException -> 0x0160, TimeoutException -> 0x0162 }
            java.lang.Object r0 = r12.get(r0, r10)     // Catch:{ ExecutionException -> 0x016a, InterruptedException -> 0x0160, TimeoutException -> 0x0162 }
            X.0WP r0 = (X.AnonymousClass0WP) r0     // Catch:{ InterruptedException -> 0x0171 }
            r11.A00(r0)     // Catch:{ InterruptedException -> 0x0171 }
            android.graphics.Typeface r0 = r0.A01     // Catch:{ InterruptedException -> 0x0171 }
            goto L_0x0219
        L_0x0160:
            r1 = move-exception
            goto L_0x0169
        L_0x0162:
            java.lang.String r0 = "timeout"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x0171 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x0171 }
        L_0x0169:
            throw r1     // Catch:{ InterruptedException -> 0x0171 }
        L_0x016a:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x0171 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0171 }
            throw r0     // Catch:{ InterruptedException -> 0x0171 }
        L_0x0171:
            X.0WP r0 = new X.0WP     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r0.<init>((int) r3)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r11.A00(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r0 = 0
            goto L_0x0219
        L_0x017c:
            java.util.concurrent.ExecutorService r0 = X.C07440Xr.A03     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r0 = r12.A00     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.append(r7)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.String r1 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.00v r0 = X.C07440Xr.A00     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.Object r0 = r0.A04(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 != 0) goto L_0x0201
            r0 = 0
            X.0t9 r13 = new X.0t9     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r13.<init>(r11, r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.lang.Object r15 = X.C07440Xr.A02     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            monitor-enter(r15)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.007 r11 = X.C07440Xr.A01     // Catch:{ all -> 0x01f6 }
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x01f6 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x01b6
            r0.add(r13)     // Catch:{ all -> 0x01f6 }
            monitor-exit(r15)     // Catch:{ all -> 0x01f6 }
            goto L_0x0217
        L_0x01b6:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01f6 }
            r0.<init>()     // Catch:{ all -> 0x01f6 }
            r0.add(r13)     // Catch:{ all -> 0x01f6 }
            r11.put(r1, r0)     // Catch:{ all -> 0x01f6 }
            monitor-exit(r15)     // Catch:{ all -> 0x01f6 }
            r22 = 1
            X.0t3 r11 = new X.0t3     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r19 = r12
            r20 = r1
            r17 = r11
            r18 = r10
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            java.util.concurrent.ExecutorService r12 = X.C07440Xr.A03     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.0cl r10 = new X.0cl     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r10.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 != 0) goto L_0x01f0
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x01e7:
            X.0h1 r0 = new X.0h1     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r0.<init>(r1, r10, r11)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r12.execute(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x0217
        L_0x01f0:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x01e7
        L_0x01f6:
            r1 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01f6 }
            goto L_0x0200
        L_0x01f9:
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x0200:
            throw r1     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x0201:
            X.0WP r1 = new X.0WP     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>((android.graphics.Typeface) r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r11.A00(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x0219
        L_0x020a:
            X.08A r0 = X.AnonymousClass089.A01     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.0ce r11 = (X.C09610ce) r11     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.graphics.Typeface r0 = r0.A02(r10, r6, r11, r7)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r19 == 0) goto L_0x0219
            if (r0 == 0) goto L_0x0268
            goto L_0x021c
        L_0x0217:
            r0 = r16
        L_0x0219:
            if (r0 == 0) goto L_0x004a
            goto L_0x022d
        L_0x021c:
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.os.Handler r10 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r10.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.0gK r1 = new X.0gK     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>(r0, r9)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r10.post(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x022d:
            java.lang.String r1 = X.AnonymousClass089.A00(r6, r4, r8, r14, r7)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r2.A08(r1, r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x004a
        L_0x0236:
            int r1 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.08A r17 = X.AnonymousClass089.A01     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r18 = r10
            r19 = r6
            r20 = r4
            r21 = r8
            r22 = r7
            android.graphics.Typeface r0 = r17.A03(r18, r19, r20, r21, r22)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            if (r0 == 0) goto L_0x0251
            java.lang.String r1 = X.AnonymousClass089.A00(r6, r4, r8, r1, r7)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r2.A08(r1, r0)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
        L_0x0251:
            if (r9 == 0) goto L_0x004a
            if (r0 == 0) goto L_0x0268
        L_0x0255:
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r2.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            X.0gK r1 = new X.0gK     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r1.<init>(r0, r9)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            r2.post(r1)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x004a
        L_0x0268:
            r9.A00(r3)     // Catch:{ XmlPullParserException -> 0x0276, IOException -> 0x026d }
            goto L_0x004a
        L_0x026d:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to read xml resource "
            goto L_0x027e
        L_0x0276:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to parse xml resource "
        L_0x027e:
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r5, r0, r2)
        L_0x028b:
            if (r9 == 0) goto L_0x004c
            r9.A00(r3)
            goto L_0x004c
        L_0x0292:
            return r16
        L_0x0293:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Resource \""
            r2.append(r0)
            java.lang.String r0 = r6.getResourceName(r8)
            r2.append(r0)
            java.lang.String r0 = "\" ("
            r2.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r8)
            r2.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015006m.A04(android.content.Context, android.util.TypedValue, X.071, int, int, boolean, boolean):android.graphics.Typeface");
    }
}
