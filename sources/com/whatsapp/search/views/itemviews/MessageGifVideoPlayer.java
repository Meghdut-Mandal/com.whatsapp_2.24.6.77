package com.whatsapp.search.views.itemviews;

import X.AnonymousClass1QZ;
import X.AnonymousClass5K0;
import X.AnonymousClass6UA;
import X.AnonymousClass6Zk;
import X.AnonymousClass7d3;
import X.C148426yq;
import X.C165277tA;
import X.C181788o2;
import X.C18700tb;
import X.C19770wU;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36441kJ;
import X.C66723Xb;
import X.C81163wZ;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

public class MessageGifVideoPlayer extends TextureView implements C18700tb {
    public MediaPlayer.OnErrorListener A00;
    public MediaPlayer.OnPreparedListener A01;
    public MediaPlayer A02;
    public Surface A03;
    public C66723Xb A04;
    public C181788o2 A05;
    public AnonymousClass7d3 A06;
    public C19770wU A07;
    public AnonymousClass1QZ A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final TextureView.SurfaceTextureListener A0G;

    private void A00() {
        this.A09 = false;
        if (this.A0F) {
            this.A0D = true;
        } else if (!this.A0B) {
            this.A0C = true;
        } else {
            setSurfaceTextureListener(this.A0G);
            this.A07.Boy(new C81163wZ((Object) this, 11));
        }
    }

    public static void A01(MessageGifVideoPlayer messageGifVideoPlayer) {
        if (messageGifVideoPlayer.A0B && messageGifVideoPlayer.A02 != null && messageGifVideoPlayer.A09) {
            AnonymousClass7d3 r0 = messageGifVideoPlayer.A06;
            if (r0 != null) {
                AnonymousClass5K0.A00(((C148426yq) r0).A00, false);
            }
            messageGifVideoPlayer.setVisibility(0);
            messageGifVideoPlayer.A02.start();
            messageGifVideoPlayer.A0A = true;
        }
    }

    public static void A02(MessageGifVideoPlayer messageGifVideoPlayer) {
        MediaPlayer mediaPlayer;
        messageGifVideoPlayer.setVisibility(8);
        AnonymousClass7d3 r0 = messageGifVideoPlayer.A06;
        if (r0 != null) {
            AnonymousClass5K0.A00(((C148426yq) r0).A00, true);
        }
        if (messageGifVideoPlayer.A0A && (mediaPlayer = messageGifVideoPlayer.A02) != null) {
            mediaPlayer.pause();
            messageGifVideoPlayer.A02.seekTo(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r3 < r2) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r4 > r6) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r1 = r3 / r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r2 = 1.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer r8) {
        /*
            X.3Xb r1 = r8.A04
            if (r1 == 0) goto L_0x003c
            int r0 = r1.A02
            float r7 = (float) r0
            int r0 = r1.A01
            float r6 = (float) r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            float r5 = X.C36441kJ.A01(r8)
            float r4 = X.C36441kJ.A02(r8)
            float r3 = r7 / r6
            float r2 = r5 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
        L_0x0029:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
        L_0x002d:
            float r2 = r2 / r3
        L_0x002e:
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 / r0
            android.graphics.Matrix r0 = X.C90524aI.A0B()
            r0.setScale(r1, r2, r5, r4)
            r8.setTransform(r0)
        L_0x003c:
            return
        L_0x003d:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            goto L_0x0029
        L_0x0046:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
        L_0x004e:
            float r3 = r3 / r2
            r1 = r3
        L_0x0050:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.MessageGifVideoPlayer.A03(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer):void");
    }

    public void A04() {
        if (!this.A0E) {
            this.A0E = true;
            this.A07 = C36341k9.A0Z(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void setMessage(C181788o2 r2) {
        if ((this.A05 != r2 || this.A02 == null) && r2.A01 != null) {
            this.A05 = r2;
            A00();
        }
    }

    public void setScrolling(boolean z) {
        this.A0F = z;
        if (!z && this.A0D) {
            this.A0D = false;
            A00();
        }
    }

    public void setShouldPlay(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            if (!z) {
                if (this.A0A && this.A02 != null) {
                    A02(this);
                }
            } else if (this.A0C) {
                A00();
            } else if (this.A09) {
                A01(this);
            }
        }
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A04();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A01(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A02(this);
    }

    public void setPlayingListener(AnonymousClass7d3 r1) {
        this.A06 = r1;
    }

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A0B = false;
        this.A0F = false;
        this.A0G = new AnonymousClass6UA(this, 1);
        this.A01 = new C165277tA(this, 1);
        this.A00 = AnonymousClass6Zk.A00;
    }

    public MessageGifVideoPlayer(Context context) {
        super(context);
        A04();
        this.A0B = false;
        this.A0F = false;
        this.A0G = new AnonymousClass6UA(this, 1);
        this.A01 = new C165277tA(this, 1);
        this.A00 = AnonymousClass6Zk.A00;
    }
}
