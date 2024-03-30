package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass1QZ;
import X.AnonymousClass2KR;
import X.AnonymousClass2KV;
import X.AnonymousClass2KZ;
import X.AnonymousClass38q;
import X.AnonymousClass3R4;
import X.AnonymousClass3SN;
import X.AnonymousClass3UF;
import X.C023109s;
import X.C100744vb;
import X.C18700tb;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C19460v5;
import X.C19470v6;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C36751lF;
import X.C61753Dh;
import X.C65013Qj;
import X.C65023Qk;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ConversationRowImage$RowImageView extends AppCompatImageView implements C18700tb {
    public Drawable A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C19460v5 A09;
    public C65013Qj A0A;
    public C65023Qk A0B;
    public C18820ts A0C;
    public AnonymousClass38q A0D;
    public AnonymousClass1QZ A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public Shader A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Matrix A0N;
    public final RectF A0O;
    public final RectF A0P;
    public final RectF A0Q;

    public ConversationRowImage$RowImageView(Context context) {
        super(context, (AttributeSet) null);
        this.A0P = C36391kE.A0J(this);
        this.A0O = C36441kJ.A0N();
        this.A0N = new Matrix();
        this.A0Q = C36441kJ.A0N();
        A01(this);
        A02(this);
    }

    public static void A01(ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        Drawable A002;
        if (conversationRowImage$RowImageView.A0D != null) {
            boolean z = conversationRowImage$RowImageView.A0L;
            boolean z2 = conversationRowImage$RowImageView.A04;
            if (z) {
                Context context = conversationRowImage$RowImageView.getContext();
                if (z2) {
                    AnonymousClass00C.A0D(context, 0);
                    Drawable A003 = AnonymousClass00E.A00(context, R.drawable.balloon_live_location_outgoing_frame);
                    int A012 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
                    C18740tg.A06(A003);
                    A002 = AnonymousClass3UF.A08(A003, A012);
                    AnonymousClass00C.A08(A002);
                } else {
                    A002 = AnonymousClass3SN.A02(context);
                }
            } else {
                Context context2 = conversationRowImage$RowImageView.getContext();
                if (z2) {
                    A002 = AnonymousClass3SN.A01(context2);
                } else {
                    A002 = AnonymousClass3SN.A00(context2);
                }
            }
            conversationRowImage$RowImageView.A00 = A002;
            if (conversationRowImage$RowImageView.A0I) {
                Context context3 = conversationRowImage$RowImageView.getContext();
                boolean z3 = conversationRowImage$RowImageView.A0L;
                Context context4 = conversationRowImage$RowImageView.getContext();
                int i = R.attr.f4nameremoved;
                int i2 = R.color.f6nameremoved;
                if (z3) {
                    i = R.attr.f4nameremoved;
                    i2 = R.color.f6nameremoved;
                }
                AnonymousClass3UF.A08(A002, C36351kA.A02(context4, context3, i, i2));
            }
        }
    }

    public void A03() {
        if (!this.A0K) {
            this.A0K = true;
            this.A09 = C19470v6.A00;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            this.A0C = C36341k9.A0T(r1);
            this.A0D = (AnonymousClass38q) r1.A00.A71.get();
        }
    }

    public void A04(int i, int i2) {
        C65013Qj r0 = this.A0A;
        if (r0 == null) {
            r0 = new C65013Qj();
            this.A0A = r0;
        }
        r0.A0A = i;
        r0.A06 = i2;
        setImageData(r0);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0E;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0E = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return C65023Qk.A01(this.A0B);
    }

    public void setFullWidth(boolean z) {
        this.A02 = z;
        A02(this);
    }

    public void setImageBitmap(Bitmap bitmap) {
        C36751lF r0;
        if (bitmap == null) {
            r0 = null;
        } else {
            r0 = new C36751lF(C36341k9.A0F(this), bitmap, this);
        }
        super.setImageDrawable(r0);
        A00();
    }

    public void setImageData(C65013Qj r3) {
        this.A0A = r3;
        this.A0B.A00 = new C65013Qj(r3);
    }

    public void setInAlbum(boolean z) {
        this.A03 = z;
        A02(this);
    }

    public void setOutgoing(boolean z) {
        if (this.A0L != z) {
            this.A0L = z;
            A01(this);
        }
    }

    public void setPaddingOnTopOnly(boolean z) {
        if (z != this.A04) {
            this.A04 = z;
            A01(this);
        }
    }

    public void setPortraitPreviewEnabled(boolean z) {
        this.A0M = z;
        A02(this);
    }

    private void A00() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF A042 = this.A0B.A04(measuredWidth, measuredHeight);
        RectF rectF = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight);
        if (A042 != null) {
            RectF rectF2 = this.A0O;
            rectF2.set(A042);
            RectF rectF3 = this.A0P;
            rectF3.set(rectF);
            Matrix matrix = this.A0N;
            matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
            setImageMatrix(matrix);
        }
    }

    public static void A02(ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        C65013Qj r3;
        C61753Dh r1;
        C65023Qk r2;
        C65013Qj r0;
        int A002 = AnonymousClass3R4.A00(conversationRowImage$RowImageView.getContext());
        C65023Qk r02 = conversationRowImage$RowImageView.A0B;
        if (r02 == null || (r0 = r02.A00) == null) {
            r3 = null;
        } else {
            r3 = new C65013Qj(r0);
        }
        if (conversationRowImage$RowImageView.A03) {
            r2 = new AnonymousClass2KR(A002, C36361kB.A0C(C36361kB.A06(conversationRowImage$RowImageView)).getHeight());
        } else if (conversationRowImage$RowImageView.A02) {
            r2 = new AnonymousClass2KV(conversationRowImage$RowImageView.getContext(), conversationRowImage$RowImageView.A0M);
        } else {
            if (conversationRowImage$RowImageView.A0M) {
                r1 = AnonymousClass2KZ.A04;
            } else {
                r1 = AnonymousClass2KZ.A03;
            }
            r2 = new AnonymousClass2KZ(r1, AnonymousClass2KZ.A02, A002);
        }
        conversationRowImage$RowImageView.A0B = r2;
        if (r3 != null) {
            r2.A00 = r3;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        A02(this);
        super.onConfigurationChanged(configuration);
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A0B2 = AnonymousClass000.A0B(this);
            int A0A2 = AnonymousClass000.A0A(this);
            Context context = getContext();
            C18740tg.A06(context);
            AnonymousClass38q r8 = this.A0D;
            if (r8 != null) {
                Integer num = this.A01;
                if (num == C023109s.A0C) {
                    int height = getHeight();
                    AnonymousClass38q r0 = this.A0D;
                    r0.A00.setShader(this.A0J);
                    RectF rectF = this.A0Q;
                    float f = (float) height;
                    rectF.set(0.0f, f - (context.getResources().getDimension(R.dimen.f7nameremoved) * 1.0f), C36441kJ.A01(this), f);
                    canvas.drawRect(rectF, this.A0D.A00);
                } else if (num == C023109s.A01) {
                    Drawable drawable2 = r8.A02;
                    if (drawable2 == null) {
                        drawable2 = new C100744vb(context.getResources().getDrawable(R.drawable.balloon_media_botshade), r8.A03);
                        r8.A02 = drawable2;
                    }
                    C19460v5 r1 = this.A09;
                    if (!r1.A05() || !this.A0F) {
                        if (C36351kA.A1Y(this.A0C)) {
                            drawable2.setBounds(A0B2 - drawable2.getIntrinsicWidth(), A0A2 - drawable2.getIntrinsicHeight(), A0B2, A0A2);
                        } else {
                            drawable2.setBounds(paddingLeft, A0A2 - drawable2.getIntrinsicHeight(), drawable2.getIntrinsicWidth() + paddingLeft, A0A2);
                        }
                        drawable2.draw(canvas);
                    } else {
                        r1.A02();
                        throw AnonymousClass001.A0A("getFrameOverlayShadeLabelsDrawable");
                    }
                }
                if (!this.A03 && (drawable = this.A00) != null) {
                    drawable.setBounds(paddingLeft, paddingTop, A0B2, A0A2);
                    this.A00.draw(canvas);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00();
    }

    public void onMeasure(int i, int i2) {
        int A042;
        int A032;
        if (isInEditMode()) {
            A042 = 800;
            A032 = 600;
        } else {
            Pair A052 = this.A0B.A05(i, i2);
            if (this.A0G) {
                A042 = this.A06;
                A032 = this.A05;
            } else if (this.A0H) {
                A042 = this.A08;
                A032 = this.A07;
            } else {
                A042 = C36381kD.A04(A052);
                A032 = C36381kD.A03(A052);
            }
        }
        setMeasuredDimension(A042, A032);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode() && this.A01 == C023109s.A0C && this.A0D != null) {
            Context context = getContext();
            float f = (float) i2;
            this.A0J = new LinearGradient(0.0f, f - (context.getResources().getDimension(R.dimen.f7nameremoved) * 1.0f), 0.0f, f, 0, context.getResources().getColor(R.color.f6nameremoved), Shader.TileMode.CLAMP);
        }
    }

    public void setCarouselCardHeight(int i) {
        this.A05 = i;
    }

    public void setCarouselCardWidth(int i) {
        this.A06 = i;
    }

    public void setHasLabels(boolean z) {
        this.A0F = z;
    }

    public void setIsCarouselCard(boolean z) {
        this.A0G = z;
    }

    public void setIsLimitedTimeOffer(boolean z) {
        this.A0H = z;
    }

    public void setLimitedTimeOfferHeight(int i) {
        this.A07 = i;
    }

    public void setLimitedTimeOfferWidth(int i) {
        this.A08 = i;
    }

    public void setTemplateImageRatio(boolean z) {
        A02(this);
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0P = C36391kE.A0J(this);
        this.A0O = C36441kJ.A0N();
        this.A0N = new Matrix();
        this.A0Q = C36441kJ.A0N();
        A01(this);
        A02(this);
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0P = C36391kE.A0J(this);
        this.A0O = C36441kJ.A0N();
        this.A0N = new Matrix();
        this.A0Q = C36441kJ.A0N();
        A01(this);
        A02(this);
    }
}
