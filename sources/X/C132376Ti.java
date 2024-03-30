package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.videoplayback.BloksVideoPlayerView;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.math.BigDecimal;

/* renamed from: X.6Ti  reason: invalid class name and case insensitive filesystem */
public class C132376Ti {
    public final C24791Du A00;
    public final AnonymousClass17Y A01;
    public final C1264363y A02;
    public final AnonymousClass6KT A03;
    public final C1255560i A04;
    public final C21060yb A05;
    public final C18820ts A06;
    public final C20810yC A07;
    public final AnonymousClass1N2 A08;
    public final AnonymousClass005 A09;

    public static void A01(C121325sx r7, float f, float f2, float f3) {
        if (r7 != null) {
            double d = (double) f3;
            BigDecimal bigDecimal = new BigDecimal(((double) Math.round(((double) f) / d)) * d);
            BigDecimal bigDecimal2 = new BigDecimal(((double) Math.round(((double) f2) / d)) * d);
            float floatValue = bigDecimal.floatValue();
            float floatValue2 = bigDecimal2.floatValue();
            C140456lc r5 = r7.A01;
            C160377ku r4 = r7.A02;
            C1271967i r3 = r7.A00;
            C1273868b A002 = C1273868b.A00();
            A002.A0A(C129316Gk.A00((double) floatValue), 0);
            A002.A0A(C129316Gk.A00((double) floatValue2), 1);
            C1273868b.A06(r3, r5, A002, r4);
        }
    }

    public void A04(ImageView imageView, byte[] bArr) {
        Bitmap decodeByteArray;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT <= 23) {
            Context context = imageView.getContext();
            AnonymousClass00C.A0D(context, 0);
            Point point = new Point();
            C21060yb.A01(context).getDefaultDisplay().getSize(point);
            if (C36341k9.A04(context) == 2 && (i = point.x) < (i2 = point.y)) {
                point.y = i;
                point.x = i2;
            }
            int dimensionPixelSize = point.y - (context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved) + C65123Qv.A02(context, C21060yb.A01(context)));
            point.y = dimensionPixelSize;
            int i3 = point.x;
            decodeByteArray = AnonymousClass6Y8.A08((AnonymousClass67H) null, new C130396Kx(new BitmapFactory.Options(), Long.valueOf(C19430v1.A00 / ((long) 32)), i3, dimensionPixelSize, false), bArr, false).A02;
        } else {
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        imageView.setImageBitmap(decodeByteArray);
    }

    public C132376Ti(C24791Du r1, AnonymousClass17Y r2, C1264363y r3, AnonymousClass6KT r4, C1255560i r5, C21060yb r6, C18820ts r7, C20810yC r8, AnonymousClass1N2 r9, AnonymousClass005 r10) {
        this.A07 = r8;
        this.A01 = r2;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3.length() <= 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.google.android.material.textfield.TextInputEditText r3, com.google.android.material.textfield.TextInputLayout r4, boolean r5) {
        /*
            android.text.Editable r3 = r3.getText()
            X.4fP r0 = r4.A15
            int r1 = r0.A01
            r0 = 2
            if (r1 == r0) goto L_0x000d
            if (r1 != 0) goto L_0x0032
        L_0x000d:
            r2 = 0
            if (r5 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x0019
            int r1 = r3.length()
            r0 = 1
            if (r1 > 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r4.setEndIconVisible(r0)
            if (r5 == 0) goto L_0x0032
            r0 = 2131231516(0x7f08031c, float:1.8079115E38)
            r4.setEndIconDrawable((int) r0)
            r0 = 2131896404(0x7f122854, float:1.9427668E38)
            r4.setEndIconContentDescription((int) r0)
            r4.setEndIconCheckable(r2)
            r0 = 0
            r4.setEndIconTintList(r0)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132376Ti.A00(com.google.android.material.textfield.TextInputEditText, com.google.android.material.textfield.TextInputLayout, boolean):void");
    }

    public void A02(View view) {
        BloksVideoPlayerView bloksVideoPlayerView = (BloksVideoPlayerView) view.findViewById(R.id.video_player_view);
        C65083Qq r0 = bloksVideoPlayerView.A0C;
        if (r0 != null) {
            r0.A0D();
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = bloksVideoPlayerView.A00;
        if (onScrollChangedListener != null) {
            bloksVideoPlayerView.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
        bloksVideoPlayerView.A00 = null;
    }

    public void A03(View view, String str, boolean z) {
        int i;
        File A002;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C012005e.A02(view, R.id.video_view);
        View A022 = C012005e.A02(view, R.id.loading_progress);
        View A023 = C012005e.A02(view, R.id.play_button);
        String str2 = null;
        if (!TextUtils.isEmpty(str) && (A002 = this.A04.A00(str)) != null) {
            str2 = A002.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(str2)) {
            videoSurfaceView.setVideoPath(str2);
        }
        videoSurfaceView.A0A = new C165277tA(A022, 0);
        videoSurfaceView.A08 = new C163427qB(A023, 0);
        A023.setOnClickListener(new C135506co(A023, videoSurfaceView, 18));
        if (z) {
            videoSurfaceView.start();
            i = 8;
        } else {
            i = 0;
        }
        A023.setVisibility(i);
    }
}
