package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;

/* renamed from: X.3FO  reason: invalid class name */
public class AnonymousClass3FO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Rect A08;
    public Uri A09;
    public Uri A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E = true;
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I = true;
    public final Context A0J;

    public Intent A00() {
        Context context = this.A0J;
        Uri uri = this.A09;
        Uri uri2 = this.A0A;
        String str = this.A0C;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A06;
        int i4 = this.A07;
        int i5 = this.A04;
        int i6 = this.A03;
        Rect rect = this.A08;
        boolean z = this.A0E;
        boolean z2 = this.A0I;
        boolean z3 = this.A0F;
        int i7 = this.A05;
        boolean z4 = this.A0G;
        String str2 = this.A0D;
        String str3 = this.A0B;
        int i8 = this.A02;
        boolean z5 = this.A0H;
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(context.getPackageName(), "com.whatsapp.crop.CropImage");
        A0D2.setData(uri);
        A0D2.putExtra("output", uri2);
        A0D2.putExtra("outputFormat", str);
        A0D2.putExtra("circleCrop", (String) null);
        A0D2.putExtra("aspectX", i);
        A0D2.putExtra("aspectY", i2);
        A0D2.putExtra("outputX", i3);
        A0D2.putExtra("outputY", i4);
        A0D2.putExtra("minCrop", i5);
        A0D2.putExtra("maxCrop", i6);
        A0D2.putExtra("initialRect", rect);
        A0D2.putExtra("cropByOutputSize", z);
        A0D2.putExtra("scale", true);
        A0D2.putExtra("scaleUpIfNeeded", z2);
        A0D2.putExtra("maxFileSize", 0);
        A0D2.putExtra("flattenRotation", z3);
        A0D2.putExtra("rotation", i7);
        A0D2.putExtra("flipH", z4);
        A0D2.putExtra("flipV", false);
        A0D2.putExtra("webImageSource", str2);
        A0D2.putExtra("doodle", str3);
        A0D2.putExtra("filter", i8);
        A0D2.putExtra("rotateAspect", z5);
        return A0D2;
    }

    public AnonymousClass3FO(Context context) {
        this.A0J = context;
    }
}
