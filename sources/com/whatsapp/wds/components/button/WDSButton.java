package com.whatsapp.wds.components.button;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.C13180jS;
import X.C18820ts;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21520zN;
import X.C224514j;
import X.C27981Qp;
import X.C27991Qq;
import X.C34251gh;
import X.C34261gj;
import X.C34271gk;
import X.C34281gl;
import X.C34291gm;
import X.C34301gn;
import X.C34311go;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class WDSButton extends C34251gh {
    public static final int[] A0I = {16842913};
    public static final int[] A0J = new int[0];
    public Drawable A00;
    public C18820ts A01;
    public C21520zN A02;
    public C20810yC A03;
    public C34301gn A04;
    public C34261gj A05 = new C34261gj();
    public C27981Qp A06;
    public boolean A07;
    public PorterDuffColorFilter A08;
    public C34271gk A09;
    public String A0A = "";
    public boolean A0B = true;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = true;
    public final RectF A0F = new RectF();
    public final RectF A0G = new RectF();
    public final AnonymousClass00T A0H = new AnonymousClass00U(C34291gm.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        Drawable drawable;
        AnonymousClass00C.A0D(context, 1);
        C34301gn r7 = C34301gn.NORMAL;
        this.A04 = r7;
        C34271gk r6 = C34271gk.NORMAL;
        this.A09 = r6;
        C27981Qp r5 = C27981Qp.FILLED;
        this.A06 = r5;
        this.A0D = true;
        C18820ts r0 = this.A01;
        if (r0 != null) {
            z = C18820ts.A00(r0).A06;
        } else {
            z = false;
        }
        this.A07 = z;
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A04;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(5, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(4, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getString(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId4 != 0) {
                setText(resourceId4);
            }
            this.A0E = obtainStyledAttributes.getResourceId(7, 0) == 0;
            this.A0C = obtainStyledAttributes.getBoolean(9, false);
            int i = obtainStyledAttributes.getInt(6, 0);
            C34301gn[] values = C34301gn.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r7 = values[i];
                }
            }
            setAction(r7);
            int i2 = obtainStyledAttributes.getInt(11, 0);
            C34271gk[] values2 = C34271gk.values();
            if (i2 >= 0) {
                AnonymousClass00C.A0D(values2, 0);
                if (i2 <= values2.length - 1) {
                    r6 = values2[i2];
                }
            }
            setSize(r6);
            int i3 = obtainStyledAttributes.getInt(10, 0);
            C27981Qp[] values3 = C27981Qp.values();
            if (i3 >= 0) {
                AnonymousClass00C.A0D(values3, 0);
                if (i3 <= values3.length - 1) {
                    r5 = values3[i3];
                }
            }
            setVariant(r5);
            Drawable[] compoundDrawables = super.getCompoundDrawables();
            AnonymousClass00C.A08(compoundDrawables);
            if (compoundDrawables.length == 0 || super.getCompoundDrawables()[0] == null) {
                drawable = this.A00 == null ? obtainStyledAttributes.getDrawable(8) : drawable;
                obtainStyledAttributes.recycle();
            } else {
                drawable = super.getCompoundDrawables()[0];
            }
            setupIcon(drawable);
            obtainStyledAttributes.recycle();
        }
        A02();
        A03();
    }

    public static final ColorStateList A00(Context context, C34311go r8) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[0]}, new int[]{AnonymousClass00F.A00(context, r8.A00), AnonymousClass00F.A00(context, r8.A02), AnonymousClass00F.A00(context, r8.A01)});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.drawable.Drawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.drawable.Drawable A01(int r13, boolean r14) {
        /*
            r12 = this;
            r7 = 0
            if (r14 == 0) goto L_0x0047
            r4 = 0
            r5 = 0
        L_0x0005:
            r3 = 8
            float[] r2 = new float[r3]
            r1 = 0
        L_0x000a:
            X.1gj r0 = r12.A05
            float r0 = r0.A00
            r2[r1] = r0
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x000a
            r1 = 0
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r2, r1, r1)
            android.graphics.drawable.ShapeDrawable r3 = new android.graphics.drawable.ShapeDrawable
            r3.<init>(r0)
            android.graphics.Paint r0 = r3.getPaint()
            r0.setColor(r13)
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x0034
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            r6 = r4
            r7 = r5
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0031:
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            return r2
        L_0x0034:
            r0 = 1
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r0[r7] = r3
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
            r10 = r4
            r11 = r5
            r6 = r2
            r8 = r4
            r9 = r5
            r6.setLayerInset(r7, r8, r9, r10, r11)
            goto L_0x0031
        L_0x0047:
            X.1gj r0 = r12.A05
            int r4 = r0.A03
            int r5 = r0.A04
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButton.A01(int, boolean):android.graphics.drawable.Drawable");
    }

    public Drawable[] getCompoundDrawables() {
        return new Drawable[]{this.A00, null, null, null};
    }

    public void onDraw(Canvas canvas) {
        int width;
        float f;
        AnonymousClass00C.A0D(canvas, 0);
        this.A0A = getEllipsizedText();
        float measureText = getPaint().measureText(this.A0A);
        if (this.A00 == null) {
            width = 0;
        } else {
            C34261gj r2 = this.A05;
            width = r2.A03 + r2.A07 + ((((getWidth() - getFixedSpace()) - r2.A02) - ((int) measureText)) / 2);
            if (this.A07) {
                width = (getWidth() - width) - r2.A02;
            }
        }
        int height = getHeight();
        C34261gj r22 = this.A05;
        int i = r22.A02;
        int i2 = (height - i) / 2;
        if (this.A00 == null) {
            f = (((float) getWidth()) - measureText) / 2.0f;
        } else if (this.A07) {
            f = ((float) (width - r22.A06)) - measureText;
        } else {
            f = ((float) (width + i)) + ((float) r22.A06);
        }
        canvas.drawText(this.A0A, f, ((((float) getHeight()) - getPaint().descent()) - getPaint().ascent()) / 2.0f, getPaint());
        Drawable drawable = this.A00;
        if (drawable != null) {
            if (!this.A0C) {
                PorterDuffColorFilter porterDuffColorFilter = this.A08;
                if (porterDuffColorFilter == null) {
                    AnonymousClass00C.A0G("colorFilter");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            int i3 = r22.A02;
            drawable.setBounds(width, i2, i3 + width, i3 + i2);
            drawable.draw(canvas);
            drawable.clearColorFilter();
        }
        if (this.A06 == C27981Qp.OUTLINE) {
            RectF rectF = this.A0F;
            rectF.set(getBackground().getBounds());
            float f2 = ((float) r22.A09) / 2.0f;
            float f3 = (float) r22.A04;
            float height2 = (((float) getHeight()) / 2.0f) - f3;
            RectF rectF2 = this.A0G;
            float f4 = (float) r22.A03;
            rectF2.set(rectF.left + f2 + f4, rectF.top + f2 + f3, (rectF.right - f2) - f4, (rectF.bottom - f2) - f3);
            canvas.drawRoundRect(rectF2, height2, height2, getButtonStrokePaint());
        }
    }

    public void onMeasure(int i, int i2) {
        C34261gj r3;
        int min;
        this.A0B = true;
        CharSequence text = getText();
        if ((text == null || text.length() == 0) && this.A00 != null) {
            r3 = this.A05;
            min = r3.A05;
        } else {
            int fixedSpace = getFixedSpace();
            r3 = this.A05;
            min = Math.min(getMaxWidth(), Math.max(getMinWidth(), fixedSpace + r3.A02 + ((int) getPaint().measureText(getText().toString()))));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.resolveSize(min, i), 1073741824), View.MeasureSpec.makeMeasureSpec(r3.A01, 1073741824));
    }

    public final void setAction(C34301gn r3) {
        boolean z = false;
        AnonymousClass00C.A0D(r3, 0);
        if (this.A04 != r3) {
            z = true;
        }
        this.A04 = r3;
        if (z) {
            A03();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable A002;
        Drawable A003;
        if (i == 0) {
            A002 = null;
        } else {
            A002 = AnonymousClass00E.A00(getContext(), i);
        }
        if (i3 == 0) {
            A003 = null;
        } else {
            A003 = AnonymousClass00E.A00(getContext(), i3);
        }
        setCompoundDrawablesWithIntrinsicBounds(A002, (Drawable) null, A003, (Drawable) null);
    }

    public final void setSize(C34271gk r3) {
        boolean z = false;
        AnonymousClass00C.A0D(r3, 0);
        if (this.A09 != r3) {
            z = true;
        }
        this.A09 = r3;
        if (z) {
            A02();
            A03();
            requestLayout();
        }
    }

    public final void setVariant(C27981Qp r3) {
        boolean z = false;
        AnonymousClass00C.A0D(r3, 0);
        if (this.A06 != r3) {
            z = true;
        }
        this.A06 = r3;
        if (z) {
            A03();
        }
    }

    public void setupBackgroundStyle(ColorStateList colorStateList) {
        AnonymousClass00C.A0D(colorStateList, 0);
        int defaultColor = colorStateList.getDefaultColor();
        Drawable A012 = A01(colorStateList.getColorForState(getDrawableState(), defaultColor), false);
        int colorForState = colorStateList.getColorForState(new int[]{16842919, 16842910}, defaultColor);
        if (isEnabled()) {
            A012 = new RippleDrawable(colorStateList, A012, A01(colorForState, true));
        }
        setBackground(A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r4.A06 != X.C27981Qp.OUTLINE) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupContentStyle(android.content.res.ColorStateList r5) {
        /*
            r4 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            int[] r1 = r4.getDrawableState()
            r0 = -1
            int r2 = r5.getColorForState(r1, r0)
            android.text.TextPaint r0 = r4.getPaint()
            r0.setColor(r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r1)
            r4.A08 = r0
            X.1gn r1 = r4.A04
            X.1gn r0 = X.C34301gn.MEDIA
            if (r1 != r0) goto L_0x002a
            X.1Qp r2 = r4.A06
            X.1Qp r1 = X.C27981Qp.OUTLINE
            r0 = 1
            if (r2 == r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            android.text.TextPaint r3 = r4.getPaint()
            if (r0 == 0) goto L_0x0043
            r2 = 1073741824(0x40000000, float:2.0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131102842(0x7f060c7a, float:1.7818133E38)
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            r0 = 0
            r3.setShadowLayer(r2, r0, r0, r1)
            return
        L_0x0043:
            r3.clearShadowLayer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButton.setupContentStyle(android.content.res.ColorStateList):void");
    }

    private final void A02() {
        C34281gl r7;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.A0D) {
            boolean z = false;
            if (this.A00 == null) {
                z = true;
            }
            CharSequence text = getText();
            if (text == null || text.length() == 0) {
                if (!z) {
                    r7 = C34281gl.ICON;
                }
                r7 = C34281gl.TEXT;
            } else {
                if (!z) {
                    r7 = C34281gl.ICON_TEXT;
                }
                r7 = C34281gl.TEXT;
            }
            C34261gj r5 = this.A05;
            Resources resources = getResources();
            AnonymousClass00C.A08(resources);
            C34271gk r1 = this.A09;
            C27981Qp r0 = this.A06;
            AnonymousClass00C.A0D(r1, 1);
            AnonymousClass00C.A0D(r0, 2);
            r5.A0B = r1;
            r5.A0C = r0;
            r5.A0A = r7;
            int ordinal = r1.ordinal();
            if (ordinal == 0) {
                i = R.dimen.f7nameremoved;
            } else if (ordinal == 1) {
                i = R.dimen.f7nameremoved;
            } else if (ordinal == 2) {
                i = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A01 = resources.getDimensionPixelSize(i);
            int ordinal2 = r5.A0B.ordinal();
            if (ordinal2 == 0) {
                i2 = R.dimen.f7nameremoved;
            } else if (ordinal2 == 1) {
                i2 = R.dimen.f7nameremoved;
            } else if (ordinal2 == 2) {
                i2 = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A05 = resources.getDimensionPixelSize(i2);
            int ordinal3 = r7.ordinal();
            if (ordinal3 != 1) {
                if (ordinal3 == 0) {
                    int ordinal4 = r5.A0B.ordinal();
                    if (ordinal4 == 0) {
                        i11 = R.dimen.f7nameremoved;
                    } else if (ordinal4 == 1) {
                        i11 = R.dimen.f7nameremoved;
                    } else if (ordinal4 == 2) {
                        i11 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                } else if (ordinal3 == 2) {
                    int ordinal5 = r5.A0B.ordinal();
                    if (ordinal5 == 0) {
                        i11 = R.dimen.f7nameremoved;
                    } else if (ordinal5 == 1) {
                        i11 = R.dimen.f7nameremoved;
                    } else if (ordinal5 == 2) {
                        i11 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                } else {
                    throw new C13180jS();
                }
                i3 = resources.getDimensionPixelSize(i11);
            } else {
                i3 = 0;
            }
            r5.A02 = i3;
            int ordinal6 = r5.A0B.ordinal();
            if (ordinal6 == 0) {
                i4 = R.dimen.f7nameremoved;
            } else if (ordinal6 == 1) {
                i4 = R.dimen.f7nameremoved;
            } else if (ordinal6 == 2) {
                i4 = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A09 = resources.getDimensionPixelSize(i4);
            int ordinal7 = r5.A0B.ordinal();
            if (ordinal7 == 0) {
                int ordinal8 = r5.A0C.ordinal();
                i5 = 3;
                int ordinal9 = r5.A0A.ordinal();
                if (ordinal8 != 3) {
                    if (ordinal9 != 1) {
                        if (ordinal9 != 0) {
                            if (ordinal9 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i6 = R.dimen.f7nameremoved;
                } else if (ordinal9 == 1) {
                    i6 = R.dimen.f7nameremoved;
                } else if (ordinal9 != 0) {
                    if (ordinal9 == 2) {
                        i6 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i6 = R.dimen.f7nameremoved;
            } else if (ordinal7 == 1) {
                int ordinal10 = r5.A0C.ordinal();
                i5 = 3;
                int ordinal11 = r5.A0A.ordinal();
                if (ordinal10 != 3) {
                    if (ordinal11 != 1) {
                        if (ordinal11 != 0) {
                            if (ordinal11 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i6 = R.dimen.f7nameremoved;
                } else if (ordinal11 == 1) {
                    i6 = R.dimen.f7nameremoved;
                } else if (ordinal11 != 0) {
                    if (ordinal11 == 2) {
                        i6 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i6 = R.dimen.f7nameremoved;
            } else if (ordinal7 == 2) {
                int ordinal12 = r5.A0C.ordinal();
                i5 = 3;
                int ordinal13 = r5.A0A.ordinal();
                if (ordinal12 != 3) {
                    if (ordinal13 != 1) {
                        if (ordinal13 != 0) {
                            if (ordinal13 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i6 = R.dimen.f7nameremoved;
                } else if (ordinal13 == 1) {
                    i6 = R.dimen.f7nameremoved;
                } else if (ordinal13 != 0) {
                    if (ordinal13 == 2) {
                        i6 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i6 = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A07 = resources.getDimensionPixelSize(i6);
            int ordinal14 = r5.A0B.ordinal();
            if (ordinal14 == 0) {
                int ordinal15 = r5.A0C.ordinal();
                int ordinal16 = r5.A0A.ordinal();
                if (ordinal15 != i5) {
                    if (ordinal16 != 1) {
                        if (ordinal16 != 0) {
                            if (ordinal16 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i7 = R.dimen.f7nameremoved;
                } else if (ordinal16 == 1) {
                    i7 = R.dimen.f7nameremoved;
                } else if (ordinal16 != 0) {
                    if (ordinal16 == 2) {
                        i7 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i7 = R.dimen.f7nameremoved;
            } else if (ordinal14 == 1) {
                int ordinal17 = r5.A0C.ordinal();
                int ordinal18 = r5.A0A.ordinal();
                if (ordinal17 != i5) {
                    if (ordinal18 != 1) {
                        if (ordinal18 != 0) {
                            if (ordinal18 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i7 = R.dimen.f7nameremoved;
                } else if (ordinal18 == 1) {
                    i7 = R.dimen.f7nameremoved;
                } else if (ordinal18 != 0) {
                    if (ordinal18 == 2) {
                        i7 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i7 = R.dimen.f7nameremoved;
            } else if (ordinal14 == 2) {
                int ordinal19 = r5.A0C.ordinal();
                int ordinal20 = r5.A0A.ordinal();
                if (ordinal19 != i5) {
                    if (ordinal20 != 1) {
                        if (ordinal20 != 0) {
                            if (ordinal20 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i7 = R.dimen.f7nameremoved;
                } else if (ordinal20 == 1) {
                    i7 = R.dimen.f7nameremoved;
                } else if (ordinal20 != 0) {
                    if (ordinal20 == 2) {
                        i7 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i7 = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A08 = resources.getDimensionPixelSize(i7);
            int ordinal21 = r5.A0B.ordinal();
            if (ordinal21 == 0) {
                i8 = R.dimen.f7nameremoved;
            } else if (ordinal21 == 1) {
                i8 = R.dimen.f7nameremoved;
            } else if (ordinal21 == 2) {
                i8 = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A04 = resources.getDimensionPixelSize(i8);
            int ordinal22 = r5.A0B.ordinal();
            if (ordinal22 == 0) {
                int ordinal23 = r5.A0C.ordinal();
                int ordinal24 = r5.A0A.ordinal();
                if (ordinal23 != i5) {
                    if (ordinal24 != 1) {
                        if (ordinal24 != 0) {
                            if (ordinal24 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i9 = R.dimen.f7nameremoved;
                } else if (ordinal24 == 1) {
                    i9 = R.dimen.f7nameremoved;
                } else if (ordinal24 != 0) {
                    if (ordinal24 == 2) {
                        i9 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i9 = R.dimen.f7nameremoved;
            } else if (ordinal22 == 1) {
                int ordinal25 = r5.A0C.ordinal();
                int ordinal26 = r5.A0A.ordinal();
                if (ordinal25 != i5) {
                    if (ordinal26 != 1) {
                        if (ordinal26 != 0) {
                            if (ordinal26 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i9 = R.dimen.f7nameremoved;
                } else if (ordinal26 == 1) {
                    i9 = R.dimen.f7nameremoved;
                } else if (ordinal26 != 0) {
                    if (ordinal26 == 2) {
                        i9 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i9 = R.dimen.f7nameremoved;
            } else if (ordinal22 == 2) {
                int ordinal27 = r5.A0C.ordinal();
                int ordinal28 = r5.A0A.ordinal();
                if (ordinal27 != i5) {
                    if (ordinal28 != 1) {
                        if (ordinal28 != 0) {
                            if (ordinal28 != 2) {
                                throw new C13180jS();
                            }
                        }
                    }
                    i9 = R.dimen.f7nameremoved;
                } else if (ordinal28 == 1) {
                    i9 = R.dimen.f7nameremoved;
                } else if (ordinal28 != 0) {
                    if (ordinal28 == 2) {
                        i9 = R.dimen.f7nameremoved;
                    } else {
                        throw new C13180jS();
                    }
                }
                i9 = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A06 = resources.getDimensionPixelSize(i9);
            int ordinal29 = r5.A0B.ordinal();
            if (ordinal29 == 0) {
                i10 = R.dimen.f7nameremoved;
            } else if (ordinal29 == 1) {
                i10 = R.dimen.f7nameremoved;
            } else if (ordinal29 == 2) {
                i10 = R.dimen.f7nameremoved;
            } else {
                throw new C13180jS();
            }
            r5.A03 = resources.getDimensionPixelSize(i10);
            r5.A00 = (((float) r5.A01) / 2.0f) - ((float) r5.A04);
            getButtonStrokePaint().setStrokeWidth((float) r5.A09);
            this.A0B = true;
        }
    }

    private final void A03() {
        C34311go r4;
        C34311go r5;
        C34311go r42;
        int i;
        int i2;
        int i3;
        int i4;
        C34311go r43;
        C34311go r44;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.A0D) {
            C34311go r3 = null;
            setStateListAnimator((StateListAnimator) null);
            Context context = getContext();
            AnonymousClass00C.A08(context);
            C27981Qp r0 = this.A06;
            C34301gn r1 = this.A04;
            AnonymousClass00C.A0D(r0, 2);
            AnonymousClass00C.A0D(r1, 3);
            int ordinal = r0.ordinal();
            if (ordinal == 0) {
                int ordinal2 = r1.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        r42 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i = R.color.f6nameremoved;
                        i2 = R.color.f6nameremoved;
                    } else if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 == 4) {
                                r42 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                                i = R.color.f6nameremoved;
                            }
                            AnonymousClass00C.A0G("content");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                        r42 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i = R.color.f6nameremoved;
                        i2 = R.color.f6nameremoved;
                    } else {
                        r42 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i = R.color.f6nameremoved;
                        i2 = R.color.f6nameremoved;
                    }
                    r5 = new C34311go(i, i2, R.color.f6nameremoved);
                } else {
                    r4 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                    r5 = new C34311go(C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.color.f6nameremoved, R.color.f6nameremoved);
                }
            } else if (ordinal == 1) {
                int ordinal3 = r1.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        r43 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i3 = R.color.f6nameremoved;
                        i4 = R.color.f6nameremoved;
                    } else if (ordinal3 == 2) {
                        r43 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i3 = R.color.f6nameremoved;
                        i4 = R.color.f6nameremoved;
                    } else if (ordinal3 != 3) {
                        if (ordinal3 == 4) {
                            r4 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                            r5 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        }
                        AnonymousClass00C.A0G("content");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    } else {
                        r43 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i3 = R.color.f6nameremoved;
                        i4 = R.color.f6nameremoved;
                    }
                    r5 = new C34311go(i3, i4, R.color.f6nameremoved);
                } else {
                    r4 = new C34311go(C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.color.f6nameremoved);
                    r5 = new C34311go(C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.color.f6nameremoved);
                }
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    int ordinal4 = r1.ordinal();
                    if (ordinal4 != 0) {
                        if (ordinal4 == 1) {
                            r4 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                            i7 = R.color.f6nameremoved;
                            i8 = R.color.f6nameremoved;
                        } else if (ordinal4 == 2) {
                            r4 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                            i7 = R.color.f6nameremoved;
                            i8 = R.color.f6nameremoved;
                        } else if (ordinal4 == 3) {
                            r4 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                            i7 = R.color.f6nameremoved;
                            i8 = R.color.f6nameremoved;
                        } else if (ordinal4 == 4) {
                            r4 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                            i7 = R.color.f6nameremoved;
                            i8 = R.color.f6nameremoved;
                        }
                        r5 = new C34311go(i7, i8, i7);
                    } else {
                        r4 = new C34311go(C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.color.f6nameremoved);
                        r5 = new C34311go(R.color.f6nameremoved, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.color.f6nameremoved);
                    }
                }
                AnonymousClass00C.A0G("content");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                int ordinal5 = r1.ordinal();
                if (ordinal5 != 0) {
                    if (ordinal5 == 1) {
                        r44 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i5 = R.color.f6nameremoved;
                        i6 = R.color.f6nameremoved;
                    } else if (ordinal5 == 2) {
                        r4 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        r5 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        r3 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                    } else if (ordinal5 != 3) {
                        if (ordinal5 == 4) {
                            r44 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                            i5 = R.color.f6nameremoved;
                            i6 = R.color.f6nameremoved;
                        }
                        AnonymousClass00C.A0G("content");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    } else {
                        r44 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
                        i5 = R.color.f6nameremoved;
                        i6 = R.color.f6nameremoved;
                    }
                    r5 = new C34311go(i5, i6, i5);
                } else {
                    r44 = new C34311go(C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.color.f6nameremoved);
                    r5 = new C34311go(R.color.f6nameremoved, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.color.f6nameremoved);
                }
                r3 = new C34311go(R.color.f6nameremoved, R.color.f6nameremoved, R.color.f6nameremoved);
            }
            Context context2 = getContext();
            AnonymousClass00C.A08(context2);
            setupContentStyle(A00(context2, r4));
            Context context3 = getContext();
            AnonymousClass00C.A08(context3);
            setupBackgroundStyle(A00(context3, r5));
            if (r3 != null) {
                Context context4 = getContext();
                AnonymousClass00C.A08(context4);
                setupStrokeStyle(A00(context4, r3));
            }
        }
    }

    private final Paint getButtonStrokePaint() {
        return (Paint) this.A0H.getValue();
    }

    private final String getEllipsizedText() {
        if (!this.A0B) {
            return this.A0A;
        }
        this.A0B = false;
        return TextUtils.ellipsize(getText(), getPaint(), Math.min((float) ((getWidth() - getFixedSpace()) - this.A05.A02), getPaint().measureText(getText().toString())), TextUtils.TruncateAt.END).toString();
    }

    private final int getFixedSpace() {
        C34261gj r2 = this.A05;
        return (r2.A03 * 2) + r2.A07 + r2.A06 + r2.A08;
    }

    private final void setupIcon(Drawable drawable) {
        C20810yC r2;
        int[] iArr;
        if ((drawable instanceof StateListDrawable) && (r2 = this.A03) != null && C20800yB.A01(C21000yV.A02, r2, 4359)) {
            if (isSelected()) {
                iArr = A0I;
            } else {
                iArr = A0J;
            }
            drawable.setState(iArr);
        }
        C20810yC r22 = this.A03;
        if (r22 != null && C20800yB.A01(C21000yV.A02, r22, 4358)) {
            if (drawable != null) {
                drawable = drawable.mutate();
            } else {
                drawable = null;
            }
        }
        this.A00 = drawable;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == null) {
            setVariant(C27981Qp.BORDERLESS);
        } else {
            super.setBackground(drawable);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A07 || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public final void setIcon(int i) {
        Drawable A002;
        if (i == 0) {
            A002 = null;
        } else {
            A002 = AnonymousClass00E.A00(getContext(), i);
        }
        setIcon(A002);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.A0B) {
            this.A0B = !AnonymousClass00C.A0J(getText(), String.valueOf(charSequence));
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r4.A06 != X.C27981Qp.OUTLINE) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupStrokeStyle(android.content.res.ColorStateList r5) {
        /*
            r4 = this;
            android.graphics.Paint r2 = r4.getButtonStrokePaint()
            int[] r1 = r4.getDrawableState()
            r0 = 0
            int r0 = r5.getColorForState(r1, r0)
            r2.setColor(r0)
            X.1gn r1 = r4.A04
            X.1gn r0 = X.C34301gn.MEDIA
            if (r1 != r0) goto L_0x001d
            X.1Qp r2 = r4.A06
            X.1Qp r1 = X.C27981Qp.OUTLINE
            r0 = 1
            if (r2 == r1) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            android.graphics.Paint r3 = r4.getButtonStrokePaint()
            if (r0 == 0) goto L_0x0036
            r2 = 1073741824(0x40000000, float:2.0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131102842(0x7f060c7a, float:1.7818133E38)
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            r0 = 0
            r3.setShadowLayer(r2, r0, r0, r1)
            return
        L_0x0036:
            r3.clearShadowLayer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButton.setupStrokeStyle(android.content.res.ColorStateList):void");
    }

    public final C21520zN getAbPreChatdProps() {
        return this.A02;
    }

    public final C20810yC getAbProps() {
        return this.A03;
    }

    public final C34301gn getAction() {
        return this.A04;
    }

    public final Drawable getIcon() {
        return this.A00;
    }

    public final C34271gk getSize() {
        return this.A09;
    }

    public final C27981Qp getVariant() {
        return this.A06;
    }

    public final C18820ts getWhatsAppLocale() {
        return this.A01;
    }

    public void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            A03();
        }
    }

    public void setSelected(boolean z) {
        if (isSelected() != z) {
            super.setSelected(z);
            A03();
            Drawable drawable = this.A00;
            if (drawable instanceof StateListDrawable) {
                setIcon(drawable);
            } else {
                requestLayout();
            }
        }
    }

    public final void setAbPreChatdProps(C21520zN r1) {
        this.A02 = r1;
    }

    public final void setAbProps(C20810yC r1) {
        this.A03 = r1;
    }

    public final void setWhatsAppLocale(C18820ts r1) {
        this.A01 = r1;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A07 || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public final void setIcon(Drawable drawable) {
        setupIcon(drawable);
        A02();
        requestLayout();
    }
}
