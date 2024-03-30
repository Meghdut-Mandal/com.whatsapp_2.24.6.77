package com.whatsapp.inappsupportbloks.components;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass1D4;
import X.AnonymousClass1QZ;
import X.AnonymousClass3YG;
import X.AnonymousClass4P8;
import X.AnonymousClass73L;
import X.AnonymousClass9SQ;
import X.C18700tb;
import X.C18800tq;
import X.C19600wD;
import X.C19770wU;
import X.C34081gQ;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C68943ci;
import X.C80303vB;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.Formatter;
import java.util.Locale;

public final class BloksSupportVideoView extends ConstraintLayout implements C18700tb {
    public int A00;
    public AnonymousClass17Y A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public AnonymousClass4P8 A05;
    public C19600wD A06;
    public AnonymousClass9SQ A07;
    public C19770wU A08;
    public AnonymousClass1QZ A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A05 = new C68943ci(this);
        A00();
    }

    public static final void setVideoThumbnail$lambda$4$lambda$3(BloksSupportVideoView bloksSupportVideoView, Bitmap bitmap) {
        AnonymousClass00C.A0D(bloksSupportVideoView, 0);
        WaImageView waImageView = bloksSupportVideoView.A03;
        if (waImageView == null) {
            throw C36331k8.A0d("videoThumbnail");
        }
        waImageView.setImageBitmap(bitmap);
    }

    public final void A07(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        long j;
        AnonymousClass00C.A0D(str, 0);
        if (str2 != null) {
            int A002 = AnonymousClass1D4.A00(getConnectivityStateProvider().A04());
            if (A002 == 2 || A002 == 3 || A002 == 4) {
                Log.i("BloksSupportVideoView/getVideoUrlByNetworkType: use hdVideoUrl");
            } else {
                Log.i("BloksSupportVideoView/getVideoUrlByNetworkType: use sdVideoUrl");
                str = str2;
            }
        }
        this.A0D = str;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
        if (num != null) {
            j = (long) num.intValue();
        } else {
            j = 1000;
        }
        setVideoInformation(j);
        AnonymousClass9SQ supportVideoLogger = getSupportVideoLogger();
        supportVideoLogger.A01 = C36361kB.A0l();
        supportVideoLogger.A02 = str6;
        supportVideoLogger.A04 = str7;
        supportVideoLogger.A03 = str5;
        supportVideoLogger.A00 = str4;
    }

    public final void setConnectivityStateProvider(C19600wD r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setSupportVideoLogger(AnonymousClass9SQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r5 == null) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r6, long r7) {
        /*
            java.lang.String r4 = r6.A0D
            if (r4 != 0) goto L_0x000b
            java.lang.String r0 = "videoUrl"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
        L_0x000a:
            throw r0
        L_0x000b:
            r2 = 0
            r5 = 0
            X.1le r1 = new X.1le     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x002a }
            r1.setDataSource(r4, r0)     // Catch:{ Exception -> 0x002a }
            r0 = 9
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ Exception -> 0x0027, all -> 0x005b }
            if (r0 == 0) goto L_0x003f
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0027, all -> 0x005b }
            goto L_0x003f
        L_0x0027:
            r4 = move-exception
            r5 = r1
            goto L_0x002b
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "BloksSupportVideoView/retrieveVideoDuration: "
            X.C36321k7.A1W(r0, r1, r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            if (r5 == 0) goto L_0x000a
            goto L_0x005d
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            r5.release()
            goto L_0x0042
        L_0x003f:
            r1.release()
        L_0x0042:
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            r6.setVideoThumbnail(r4)
        L_0x004b:
            r6.setVideoDuration(r2)
            return
        L_0x004f:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0057
            r0 = 2
            long r7 = r2 / r0
        L_0x0057:
            r6.setVideoThumbnail(r7)
            goto L_0x004b
        L_0x005b:
            r0 = move-exception
            r5 = r1
        L_0x005d:
            r5.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.A01(com.whatsapp.inappsupportbloks.components.BloksSupportVideoView, long):void");
    }

    public void A06() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A01 = C36351kA.A0M(A0W);
            this.A08 = C36341k9.A0Z(A0W);
            this.A06 = C36391kE.A0c(A0W);
            this.A07 = (AnonymousClass9SQ) A0W.A00.ACl.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final C19600wD getConnectivityStateProvider() {
        C19600wD r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("connectivityStateProvider");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final AnonymousClass9SQ getSupportVideoLogger() {
        AnonymousClass9SQ r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("supportVideoLogger");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    private final void A00() {
        View inflate = View.inflate(getContext(), R.layout.f9nameremoved, this);
        C34081gQ.A04(inflate.findViewById(R.id.rootView), getResources().getDimension(R.dimen.f7nameremoved));
        this.A03 = (WaImageView) C36361kB.A0F(inflate, R.id.video_thumbnail);
        this.A02 = (WaImageView) C36361kB.A0F(inflate, R.id.play_button);
        AnonymousClass155 r2 = (AnonymousClass155) C36361kB.A06(this);
        r2.A3Z(this.A05);
        WaImageView waImageView = this.A02;
        if (waImageView == null) {
            throw C36331k8.A0d("playButton");
        }
        AnonymousClass3YG.A00(waImageView, r2, this, 37);
        this.A04 = C36351kA.A0Q(inflate, R.id.duration_text);
    }

    private final void setVideoDuration(long j) {
        getGlobalUI().A0H(new AnonymousClass73L(this, AnonymousClass000.A0u(), new Formatter(AnonymousClass000.A0u(), Locale.getDefault()), 5, j));
    }

    private final void setVideoInformation(long j) {
        getWaWorkers().Boy(new C80303vB(this, j, 11));
    }

    private final void setVideoThumbnail(long j) {
        getWaWorkers().Boy(new C80303vB(this, j, 12));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A05 = new C68943ci(this);
        A00();
    }

    public BloksSupportVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A06();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksSupportVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A05 = new C68943ci(this);
        A00();
    }
}
