package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1QZ;
import X.AnonymousClass2KP;
import X.AnonymousClass2KQ;
import X.AnonymousClass2KT;
import X.AnonymousClass2KU;
import X.AnonymousClass2KW;
import X.AnonymousClass3R4;
import X.AnonymousClass3SN;
import X.AnonymousClass3UF;
import X.C18700tb;
import X.C36351kA;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C65013Qj;
import X.C65023Qk;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ConversationRowVideo$RowVideoView extends AppCompatImageView implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public C65023Qk A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public Paint A0E;
    public RectF A0F;
    public Shader A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public ConversationRowVideo$RowVideoView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A0E = new Paint(1);
        this.A0F = new RectF();
        this.A08 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A03 = 0;
        this.A02 = 0;
        A00();
    }

    public static void A01(ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView) {
        Drawable A002;
        boolean z = conversationRowVideo$RowVideoView.A0A;
        Context context = conversationRowVideo$RowVideoView.getContext();
        if (z) {
            A002 = AnonymousClass3SN.A02(context);
        } else {
            A002 = AnonymousClass3SN.A00(context);
        }
        conversationRowVideo$RowVideoView.A04 = A002;
        if (conversationRowVideo$RowVideoView.A09) {
            A002 = AnonymousClass3SN.A01(conversationRowVideo$RowVideoView.getContext());
            conversationRowVideo$RowVideoView.A04 = A002;
        }
        if (conversationRowVideo$RowVideoView.A0B) {
            Context context2 = conversationRowVideo$RowVideoView.getContext();
            boolean z2 = conversationRowVideo$RowVideoView.A0A;
            Context context3 = conversationRowVideo$RowVideoView.getContext();
            int i = R.attr.f4nameremoved;
            int i2 = R.color.f6nameremoved;
            if (z2) {
                i = R.attr.f4nameremoved;
                i2 = R.color.f6nameremoved;
            }
            AnonymousClass3UF.A08(A002, C36351kA.A02(context3, context2, i, i2));
        }
    }

    public void A02(int i, int i2, boolean z) {
        int i3;
        int i4 = this.A0D;
        if (i4 <= 0 || (i3 = this.A0C) <= 0 || z) {
            hashCode();
            this.A0D = i;
            i4 = i;
            this.A0C = i2;
            i3 = i2;
        }
        this.A05.A07(i4, i3);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return C65023Qk.A01(this.A05);
    }

    public void setFullWidth(boolean z) {
        this.A0H = z;
        A00();
    }

    public void setInAlbum(boolean z) {
        this.A0I = z;
        A00();
    }

    public void setIsGif(boolean z) {
        this.A0J = z;
        A00();
    }

    public void setKeepRatio(boolean z) {
        this.A0K = z;
        A00();
    }

    public void setPortraitPreviewEnabled(boolean z) {
        this.A0L = z;
        A00();
    }

    private void A00() {
        C65013Qj r3;
        C65023Qk r2;
        C65013Qj r0;
        int A002 = AnonymousClass3R4.A00(getContext());
        C65023Qk r02 = this.A05;
        if (r02 == null || (r0 = r02.A00) == null) {
            r3 = null;
        } else {
            r3 = new C65013Qj(r0);
        }
        if (this.A0I && this.A0K) {
            r2 = new AnonymousClass2KP(A002);
        } else if (this.A0J) {
            r2 = new AnonymousClass2KW(getContext());
        } else if (this.A0H) {
            r2 = new AnonymousClass2KT(getContext(), this.A0L);
        } else if (this.A0K) {
            r2 = new AnonymousClass2KQ(A002);
        } else {
            r2 = new AnonymousClass2KU(A002, this.A0L);
        }
        this.A05 = r2;
        if (r3 != null) {
            r2.A00 = r3;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        A00();
        super.onConfigurationChanged(configuration);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            float dimension = getResources().getDimension(R.dimen.f7nameremoved);
            int width = getWidth();
            Paint paint = this.A0E;
            paint.setColor(1711276032);
            paint.setShader(this.A0G);
            C36431kI.A1L(paint);
            RectF rectF = this.A0F;
            rectF.set(0.0f, C36441kJ.A02(this) - ((dimension * 4.0f) / 3.0f), (float) width, C36441kJ.A02(this));
            canvas.drawRect(rectF, paint);
            if (this.A04 != null && !this.A0I) {
                RectF rectF2 = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                this.A04.setBounds(new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom)));
                this.A04.draw(canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int A042;
        int A032;
        if (!isInEditMode()) {
            if (getDrawable() == null || (getDrawable() instanceof ColorDrawable)) {
                i3 = this.A0D;
                i4 = this.A0C;
            } else {
                i3 = getDrawable().getIntrinsicWidth();
                i4 = getDrawable().getIntrinsicHeight();
            }
            C65023Qk r0 = this.A05;
            r0.A07(i3, i4);
            Pair A052 = r0.A05(i, i2);
            if (this.A08) {
                A042 = this.A01;
                A032 = this.A00;
            } else if (this.A09) {
                A042 = this.A03;
                A032 = this.A02;
            } else {
                A042 = C36381kD.A04(A052);
                A032 = C36381kD.A03(A052);
            }
            setMeasuredDimension(A042, A032);
        } else if (this.A0K) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(600, 600);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode()) {
            float f = (float) i2;
            this.A0G = new LinearGradient(0.0f, f - ((getResources().getDimension(R.dimen.f7nameremoved) * 4.0f) / 3.0f), 0.0f, f, 0, -16777216, Shader.TileMode.CLAMP);
        }
    }

    public void setCarouselCardHeight(int i) {
        this.A00 = i;
    }

    public void setCarouselCardWidth(int i) {
        this.A01 = i;
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A04 = drawable;
    }

    public void setIsCarouselCard(boolean z) {
        this.A08 = z;
    }

    public void setIsLimitedTimeOffer(boolean z) {
        this.A09 = z;
    }

    public void setIsOutgoing(boolean z) {
        this.A0A = z;
    }

    public void setLimitedTimeOfferHeight(int i) {
        this.A02 = i;
    }

    public void setLimitedTimeOfferWidth(int i) {
        this.A03 = i;
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A0E = new Paint(1);
        this.A0F = new RectF();
        this.A08 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A03 = 0;
        this.A02 = 0;
        A00();
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A0E = new Paint(1);
        this.A0F = new RectF();
        this.A08 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A03 = 0;
        this.A02 = 0;
        A00();
    }
}
