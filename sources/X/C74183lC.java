package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.io.File;
import java.util.List;

/* renamed from: X.3lC  reason: invalid class name and case insensitive filesystem */
public final class C74183lC implements AnonymousClass00M {
    public final C20690y0 A00;
    public final C19890wg A01;

    public AnonymousClass6QO A03(Context context, AnonymousClass141 r14, C63393Jw r15) {
        C004602b A012 = AnonymousClass1RC.A01(context);
        AnonymousClass2YW r3 = new AnonymousClass2YW(A012);
        int dimensionPixelSize = r3.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        float f = ((float) dimensionPixelSize) / 2.0f;
        Bitmap A05 = r3.getContactPhotosBitmapManager().A05(r3.getContext(), r14, f, dimensionPixelSize);
        r3.setBackground(C55382uX.A00(C36371kC.A0B(r3), A05));
        ImageView imageView = r3.A04;
        if (A05 == null) {
            int A02 = r3.getContactAvatars().A02(r14);
            A05 = AnonymousClass1Pp.A01(r3.getContext(), r3.getContactAvatars(), f, A02, dimensionPixelSize);
            AnonymousClass00C.A08(A05);
        }
        imageView.setImageBitmap(A05);
        r3.A08.A05(r14);
        C65073Qp A09 = r3.getChatsCache().A09(r14.A0H, false);
        AnonymousClass00C.A0E(A09, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
        C44072La r11 = (C44072La) A09;
        int i = (int) r11.A07;
        C64633Ov newsletterNumberFormatter = r3.getNewsletterNumberFormatter();
        int A002 = C64633Ov.A00(newsletterNumberFormatter, i);
        String A013 = newsletterNumberFormatter.A01(A002);
        AnonymousClass00C.A0D(A013, 1);
        TextView textView = r3.A06;
        C36351kA.A16(r3.getResources(), textView, new Object[]{A013}, R.plurals.f10nameremoved, A002);
        String str = r11.A0H;
        if (str == null || AnonymousClass098.A06(str)) {
            r3.A05.setVisibility(8);
        } else {
            C21060yb systemServices = r3.getSystemServices();
            C19890wg sharedPreferencesFactory = r3.getSharedPreferencesFactory();
            Context context2 = r3.getContext();
            TextView textView2 = r3.A05;
            textView2.setText(C36441kJ.A0P(AnonymousClass6YV.A08(systemServices, sharedPreferencesFactory, AnonymousClass3UG.A03(context2, textView2.getPaint(), r3.getEmojiLoader(), str))));
        }
        AnonymousClass000.A16(r3, r3.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1073741824, View.MeasureSpec.makeMeasureSpec(r3.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1073741824));
        r3.layout(0, 0, r3.getMeasuredWidth(), r3.getMeasuredHeight());
        File A014 = A01(A012, r3, (View) null, this, 0.0f);
        if (A014 == null) {
            return null;
        }
        Uri fromFile = Uri.fromFile(A014);
        AnonymousClass00C.A0B(fromFile);
        AnonymousClass6QO r4 = new AnonymousClass6QO(fromFile);
        r4.A0F(A014);
        C104955Cm A003 = A00(r3.A03, r15, true);
        C104955Cm A004 = A00(r3.A07, r15, false);
        C104955Cm[] r0 = new C104955Cm[2];
        r0[0] = A003;
        A02(r3, r4, C36341k9.A0m(A004, r0, 1));
        return r4;
    }

    public static final C104955Cm A00(View view, C63393Jw r10, boolean z) {
        String rawString = r10.A01.getRawString();
        int i = r10.A00;
        C104955Cm r2 = new C104955Cm(r10.A02, rawString, r10.A04, r10.A03, i, z);
        float f = ((float) 3) / C36441kJ.A0J(view).getDisplayMetrics().density;
        RectF A002 = C54862tg.A00(view);
        float f2 = A002.left * f;
        A002.left = f2;
        float f3 = A002.top * f;
        A002.top = f3;
        float f4 = A002.right * f;
        A002.right = f4;
        float f5 = A002.bottom * f;
        A002.bottom = f5;
        r2.A0J(A002, f2, f3, f4, f5);
        return r2;
    }

    public C74183lC(C20690y0 r1, C19890wg r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File A01(android.content.Context r10, android.view.View r11, android.view.View r12, X.C74183lC r13, float r14) {
        /*
            android.content.res.Resources r3 = r10.getResources()
            X.AnonymousClass00C.A0B(r3)
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            float r2 = r0.density
            r0 = 3
            float r1 = (float) r0
            float r1 = r1 / r2
            r0 = 2131167706(0x7f0709da, float:1.7949693E38)
            float r0 = r3.getDimension(r0)
            float r0 = r0 * r1
            int r7 = (int) r0
            r0 = 2131167702(0x7f0709d6, float:1.7949685E38)
            float r0 = r3.getDimension(r0)
            float r0 = r0 * r1
            int r6 = (int) r0
            r5 = 1
            r8 = 0
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ RuntimeException -> 0x00a9 }
            boolean r0 = X.C011304x.A03(r11)     // Catch:{ RuntimeException -> 0x00a9 }
            if (r0 == 0) goto L_0x009e
            int r1 = r11.getWidth()     // Catch:{ RuntimeException -> 0x00a9 }
            int r0 = r11.getHeight()     // Catch:{ RuntimeException -> 0x00a9 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r1, r0, r2)     // Catch:{ RuntimeException -> 0x00a9 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x00a9 }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x00a9 }
            int r0 = r11.getScrollX()     // Catch:{ RuntimeException -> 0x00a9 }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x00a9 }
            float r1 = -r0
            int r0 = r11.getScrollY()     // Catch:{ RuntimeException -> 0x00a9 }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x00a9 }
            float r0 = -r0
            r2.translate(r1, r0)     // Catch:{ RuntimeException -> 0x00a9 }
            r11.draw(r2)     // Catch:{ RuntimeException -> 0x00a9 }
            if (r12 == 0) goto L_0x006f
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x00a9 }
            r3.<init>(r4)     // Catch:{ RuntimeException -> 0x00a9 }
            android.graphics.Paint r2 = X.C36441kJ.A0L(r5)     // Catch:{ RuntimeException -> 0x00a9 }
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OUT     // Catch:{ RuntimeException -> 0x00a9 }
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode     // Catch:{ RuntimeException -> 0x00a9 }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x00a9 }
            r2.setXfermode(r0)     // Catch:{ RuntimeException -> 0x00a9 }
            r0 = 0
            r2.setColor(r0)     // Catch:{ RuntimeException -> 0x00a9 }
            android.graphics.RectF r0 = X.C54862tg.A00(r12)     // Catch:{ RuntimeException -> 0x00a9 }
            r3.drawRoundRect(r0, r14, r14, r2)     // Catch:{ RuntimeException -> 0x00a9 }
        L_0x006f:
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r7, r6, r5)     // Catch:{ RuntimeException -> 0x00a9 }
            X.0y0 r9 = r13.A00     // Catch:{ RuntimeException -> 0x00a9 }
            X.0wg r10 = r13.A01     // Catch:{ RuntimeException -> 0x00a9 }
            java.lang.String r12 = ".png"
            X.1Gl r11 = X.C25471Gl.A0D     // Catch:{ RuntimeException -> 0x00a9 }
            r13 = 0
            r14 = 2
            java.io.File r3 = X.AnonymousClass1GW.A0G(r9, r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x00a9 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ RuntimeException -> 0x00a9 }
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x00a9 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x009a }
            r0 = 100
            boolean r0 = r4.compress(r1, r0, r2)     // Catch:{ all -> 0x009a }
            r2.close()     // Catch:{ RuntimeException -> 0x00a9 }
            if (r0 == 0) goto L_0x0094
            return r3
        L_0x0094:
            java.lang.String r0 = "Error generating media"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00a9 }
            return r8
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            goto L_0x00a5
        L_0x009e:
            java.lang.String r0 = "View needs to be laid out before calling drawToBitmap()"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ RuntimeException -> 0x00a9 }
            goto L_0x00a8
        L_0x00a5:
            X.C05600Qi.A00(r2, r1)     // Catch:{ RuntimeException -> 0x00a9 }
        L_0x00a8:
            throw r0     // Catch:{ RuntimeException -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74183lC.A01(android.content.Context, android.view.View, android.view.View, X.3lC, float):java.io.File");
    }

    public static final void A02(View view, AnonymousClass6QO r5, List list) {
        float f = ((float) 3) / C36441kJ.A0J(view).getDisplayMetrics().density;
        RectF rectF = new RectF(0.0f, 0.0f, C36441kJ.A01(view) * f, C36441kJ.A02(view) * f);
        r5.A0I(new AnonymousClass6VQ(rectF, rectF, list, 0).A02());
    }
}
