package com.caverock.androidsvg;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C198899eN;
import X.C200029gS;
import X.C203809ou;
import X.C22735Auz;
import X.C36331k8;
import X.C90524aI;
import X.C91464c3;
import X.C91474c4;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class SVGImageView extends ImageView {
    public static Method A02;
    public C200029gS A00 = null;
    public C198899eN A01 = new C198899eN();

    public void setImageAsset(String str) {
        try {
            InputStream open = getContext().getAssets().open(str);
            new C91464c3(this).execute(new InputStream[]{open});
        } catch (IOException unused) {
            Log.e("SVGImageView", AnonymousClass000.A0p("File not found: ", str, AnonymousClass000.A0u()));
        }
    }

    public void setImageURI(Uri uri) {
        try {
            InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
            new C91464c3(this).execute(new InputStream[]{openInputStream});
        } catch (FileNotFoundException unused) {
            Log.e("SVGImageView", AnonymousClass000.A0l(uri, "File not found: ", AnonymousClass000.A0u()));
        }
    }

    static {
        Class<View> cls = View.class;
        try {
            A02 = cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class});
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void A01(SVGImageView sVGImageView) {
        C200029gS r1 = sVGImageView.A00;
        if (r1 != null) {
            Picture A012 = r1.A01(sVGImageView.A01);
            Method method = A02;
            if (method != null) {
                try {
                    int i = View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(sVGImageView.getContext()));
                    Object[] A0M = AnonymousClass001.A0M();
                    C36331k8.A1W(A0M, i);
                    A0M[1] = null;
                    method.invoke(sVGImageView, A0M);
                } catch (Exception e) {
                    Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
                }
            }
            sVGImageView.setImageDrawable(new PictureDrawable(A012));
        }
    }

    private void setFromString(String str) {
        try {
            this.A00 = new C203809ou().A0T(C90524aI.A0P(str.getBytes()));
            A01(this);
        } catch (C22735Auz unused) {
            Log.e("SVGImageView", AnonymousClass000.A0p("Could not find SVG at: ", str, AnonymousClass000.A0u()));
        }
    }

    public void setCSS(String str) {
        this.A01.A00(str);
        A01(this);
    }

    public void setSVG(C200029gS r2) {
        if (r2 != null) {
            this.A00 = r2;
            A01(this);
            return;
        }
        throw AnonymousClass001.A08("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 != 0) goto L_0x0072
            android.content.res.Resources$Theme r2 = X.C36361kB.A09(r7)
            int[] r1 = X.C112695eJ.A00
            r0 = 0
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r8, r1, r9, r0)
            java.lang.String r1 = r5.getString(r0)     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x001c
            X.9eN r0 = r7.A01     // Catch:{ all -> 0x006d }
            r0.A00(r1)     // Catch:{ all -> 0x006d }
        L_0x001c:
            r0 = 1
            r6 = 1
            r1 = -1
            int r0 = r5.getResourceId(r0, r1)     // Catch:{ all -> 0x006d }
            if (r0 == r1) goto L_0x0029
            r7.setImageResource(r0)     // Catch:{ all -> 0x006d }
            goto L_0x0069
        L_0x0029:
            java.lang.String r4 = r5.getString(r6)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0069
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x006d }
            r3 = 0
            android.content.Context r0 = r7.getContext()     // Catch:{ FileNotFoundException -> 0x004d }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x004d }
            java.io.InputStream r2 = r0.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x004d }
            X.4c3 r1 = new X.4c3     // Catch:{ FileNotFoundException -> 0x004d }
            r1.<init>(r7)     // Catch:{ FileNotFoundException -> 0x004d }
            java.io.InputStream[] r0 = new java.io.InputStream[r6]     // Catch:{ FileNotFoundException -> 0x004d }
            r0[r3] = r2     // Catch:{ FileNotFoundException -> 0x004d }
            r1.execute(r0)     // Catch:{ FileNotFoundException -> 0x004d }
            goto L_0x0069
        L_0x004d:
            android.content.Context r0 = r7.getContext()     // Catch:{ IOException -> 0x0066 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0066 }
            java.io.InputStream r2 = r0.open(r4)     // Catch:{ IOException -> 0x0066 }
            X.4c3 r1 = new X.4c3     // Catch:{ IOException -> 0x0066 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0066 }
            java.io.InputStream[] r0 = new java.io.InputStream[r6]     // Catch:{ IOException -> 0x0066 }
            r0[r3] = r2     // Catch:{ IOException -> 0x0066 }
            r1.execute(r0)     // Catch:{ IOException -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r7.setFromString(r4)     // Catch:{ all -> 0x006d }
        L_0x0069:
            r5.recycle()
            return
        L_0x006d:
            r0 = move-exception
            r5.recycle()
            throw r0
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGImageView.A00(android.util.AttributeSet, int):void");
    }

    public void setImageResource(int i) {
        new C91474c4(getContext(), this, i).execute(new Integer[0]);
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00(attributeSet, 0);
    }

    public void setSVG(C200029gS r2, String str) {
        if (r2 != null) {
            this.A00 = r2;
            this.A01.A00(str);
            A01(this);
            return;
        }
        throw AnonymousClass001.A08("Null value passed to setSVG()");
    }

    public SVGImageView(Context context) {
        super(context);
    }
}
