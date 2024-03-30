package com.whatsapp.numberkeyboard;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.AnonymousClass9KS;
import X.AnonymousClass9NE;
import X.B1C;
import X.C110505am;
import X.C147106wg;
import X.C165587tf;
import X.C178338fm;
import X.C178348fn;
import X.C18700tb;
import X.C18820ts;
import X.C192609Hw;
import X.C203499oB;
import X.C21060yb;
import X.C224514j;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36351kA;
import X.C36411kG;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class NumberEntryKeyboard extends LinearLayout implements C18700tb {
    public static final int A0J = ((int) Math.floor(20.399999618530273d));
    public int A00;
    public int A01;
    public long A02;
    public View A03;
    public EditText A04;
    public C21060yb A05;
    public C18820ts A06;
    public AnonymousClass9KS A07;
    public B1C A08;
    public AnonymousClass1QZ A09;
    public Map A0A;
    public Map A0B;
    public boolean A0C;
    public boolean A0D;
    public View[][] A0E;
    public C192609Hw[][] A0F;
    public Paint A0G;
    public RectF A0H;
    public final View.OnTouchListener A0I;

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void setCustomKey(B1C b1c) {
        this.A08 = b1c;
        View[] viewArr = this.A0E[3];
        char c = 2;
        if (C36351kA.A1Y(this.A06)) {
            c = 0;
        }
        ViewGroup viewGroup = (ViewGroup) viewArr[c];
        viewGroup.removeAllViews();
        if (b1c != null) {
            viewGroup.addView(b1c.BJ4(getContext()));
        }
        invalidate();
    }

    public static C147106wg A00(C18820ts r1) {
        if (C110505am.A00(r1).equals(".")) {
            return new C178348fn();
        }
        return new C178338fm();
    }

    private void A01(Context context, AttributeSet attributeSet) {
        KeyEvent.Callback callback;
        View[] viewArr;
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        ViewGroup A0P = C36411kG.A0P(this, R.id.custom_key_container);
        boolean z = false;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0C, 0, 0).getInteger(0, 0) == 1) {
            C147106wg A002 = A00(this.A06);
            this.A08 = A002;
            A0P.addView(A002.BJ4(context));
        }
        View[][] viewArr2 = new View[4][];
        View[] viewArr3 = new View[3];
        if (C36351kA.A1Y(this.A06)) {
            C165587tf.A10(this, viewArr3, R.id.one_key, 0);
            C165587tf.A10(this, viewArr3, R.id.two_key, 1);
            C165587tf.A10(this, viewArr3, R.id.three_key, 2);
            viewArr2[0] = viewArr3;
            View[] viewArr4 = new View[3];
            C165587tf.A10(this, viewArr4, R.id.four_key, 0);
            C165587tf.A10(this, viewArr4, R.id.five_key, 1);
            C165587tf.A10(this, viewArr4, R.id.six_key, 2);
            viewArr2[1] = viewArr4;
            View[] viewArr5 = new View[3];
            C165587tf.A10(this, viewArr5, R.id.seven_key, 0);
            C165587tf.A10(this, viewArr5, R.id.eight_key, 1);
            C165587tf.A10(this, viewArr5, R.id.nine_key, 2);
            viewArr2[2] = viewArr5;
            View[] viewArr6 = new View[3];
            viewArr6[0] = A0P;
            C165587tf.A10(this, viewArr6, R.id.zero_key, 1);
            viewArr = viewArr6;
            callback = findViewById(R.id.backspace_key);
        } else {
            C165587tf.A10(this, viewArr3, R.id.three_key, 0);
            C165587tf.A10(this, viewArr3, R.id.two_key, 1);
            C165587tf.A10(this, viewArr3, R.id.one_key, 2);
            viewArr2[0] = viewArr3;
            View[] viewArr7 = new View[3];
            C165587tf.A10(this, viewArr7, R.id.six_key, 0);
            C165587tf.A10(this, viewArr7, R.id.five_key, 1);
            C165587tf.A10(this, viewArr7, R.id.four_key, 2);
            viewArr2[1] = viewArr7;
            View[] viewArr8 = new View[3];
            C165587tf.A10(this, viewArr8, R.id.nine_key, 0);
            C165587tf.A10(this, viewArr8, R.id.eight_key, 1);
            C165587tf.A10(this, viewArr8, R.id.seven_key, 2);
            viewArr2[2] = viewArr8;
            View[] viewArr9 = new View[3];
            C165587tf.A10(this, viewArr9, R.id.backspace_key, 0);
            C165587tf.A10(this, viewArr9, R.id.zero_key, 1);
            callback = A0P;
            viewArr = viewArr9;
        }
        viewArr[2] = callback;
        viewArr2[3] = viewArr;
        this.A0E = viewArr2;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0C, 0, 0).getInteger(0, 0) == 1) {
            setCustomKey(A00(this.A06));
        }
        int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOrientation(1);
        C36341k9.A0q(getContext(), this, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        for (int i = 0; i < this.A0E.length; i++) {
            int i2 = 0;
            while (true) {
                View[][] viewArr10 = this.A0E;
                if (i2 >= viewArr10[i].length) {
                    break;
                }
                View view = viewArr10[i][i2];
                if (view != null && (view instanceof TextView)) {
                    TextView textView = (TextView) view;
                    NumberFormat A0M = this.A06.A0M();
                    int id = view.getId();
                    int i3 = 0;
                    if (id != R.id.zero_key) {
                        i3 = 1;
                        if (id != R.id.one_key) {
                            i3 = 2;
                            if (id != R.id.two_key) {
                                i3 = 3;
                                if (id != R.id.three_key) {
                                    i3 = 4;
                                    if (id != R.id.four_key) {
                                        i3 = 5;
                                        if (id != R.id.five_key) {
                                            i3 = 6;
                                            if (id != R.id.six_key) {
                                                i3 = 7;
                                                if (id != R.id.seven_key) {
                                                    i3 = 9;
                                                    if (id == R.id.eight_key) {
                                                        i3 = 8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView.setText(A0M.format((long) i3));
                }
                i2++;
            }
        }
        if (Settings.System.getFloat(this.A05.A0O().A00, "window_animation_scale", 1.0f) == 1.0f) {
            z = true;
        }
        this.A0C = z;
        if (z) {
            Paint paint = new Paint(1);
            this.A0G = paint;
            paint.setColor(AnonymousClass00F.A00(context, R.color.f6nameremoved));
            this.A0G.setStyle(Paint.Style.FILL);
            C165587tf.A0v(this.A0G, PorterDuff.Mode.SRC_OVER);
            this.A0H = C36441kJ.A0N();
            this.A0B = AnonymousClass001.A0J();
            this.A07 = new AnonymousClass9KS(this);
        }
        setOnTouchListener(this.A0I);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0C) {
            Map map = this.A0B;
            Objects.requireNonNull(map);
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                AnonymousClass9NE r6 = (AnonymousClass9NE) this.A0B.get(A10.next());
                Objects.requireNonNull(r6);
                PointF pointF = r6.A04;
                Objects.requireNonNull(pointF);
                float f = r6.A00;
                float f2 = pointF.x;
                float f3 = f / 2.0f;
                float f4 = pointF.y;
                RectF rectF = this.A0H;
                Objects.requireNonNull(rectF);
                rectF.set(f2 - f3, f4 - f3, f2 + f3, f4 + f3);
                Paint paint = this.A0G;
                Objects.requireNonNull(paint);
                paint.setAlpha(r6.A01);
                canvas.drawOval(this.A0H, this.A0G);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            View[][] viewArr = this.A0E;
            int length = viewArr[0].length;
            float f2 = width / ((float) length);
            int length2 = viewArr.length;
            float f3 = height / ((float) length2);
            int floor = ((int) Math.floor((double) f2)) + 12;
            this.A00 = floor;
            this.A01 = (int) (((float) floor) / 2.0f);
            int[] A1O = C36441kJ.A1O();
            A1O[1] = length;
            A1O[0] = length2;
            this.A0F = (C192609Hw[][]) Array.newInstance(C192609Hw.class, A1O);
            for (int i6 = 0; i6 < this.A0E.length; i6++) {
                int i7 = 0;
                while (true) {
                    View[][] viewArr2 = this.A0E;
                    int length3 = viewArr2[0].length;
                    if (i7 >= length3) {
                        break;
                    }
                    View view = viewArr2[i6][i7];
                    float f4 = ((float) i7) * f2;
                    float f5 = ((float) i6) * f3;
                    float f6 = f4 + f2;
                    float f7 = f5 + f3;
                    if (i7 == 0) {
                        i5 = getPaddingLeft();
                    } else if (i7 == length3 - 1) {
                        i5 = -getPaddingRight();
                    } else {
                        f = 0.0f;
                        C192609Hw r1 = new C192609Hw(new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f), new RectF(f4, f5, f6, f7));
                        this.A0F[i6][i7] = r1;
                        this.A0A.put(view, r1);
                        i7++;
                    }
                    f = (float) i5;
                    C192609Hw r12 = new C192609Hw(new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f), new RectF(f4, f5, f6, f7));
                    this.A0F[i6][i7] = r12;
                    this.A0A.put(view, r12);
                    i7++;
                }
            }
        }
    }

    public void setEditText(WaEditText waEditText) {
        this.A04 = waEditText;
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A0D) {
            this.A0D = true;
            C27861Qc.A0q((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        this.A0A = AnonymousClass001.A0J();
        this.A02 = -1;
        this.A0I = new C203499oB(this, 2);
        A01(context, attributeSet);
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0D) {
            this.A0D = true;
            C27861Qc.A0q((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        this.A0A = AnonymousClass001.A0J();
        this.A02 = -1;
        this.A0I = new C203499oB(this, 2);
        A01(context, attributeSet);
    }

    public NumberEntryKeyboard(Context context) {
        this(context, (AttributeSet) null);
    }
}
