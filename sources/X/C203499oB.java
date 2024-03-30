package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.9oB  reason: invalid class name and case insensitive filesystem */
public class C203499oB implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public C203499oB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        NumberEntryKeyboard numberEntryKeyboard = (NumberEntryKeyboard) this.A00;
        int i = NumberEntryKeyboard.A0J;
        numberEntryKeyboard.A03 = null;
        if (numberEntryKeyboard.A0C) {
            AnonymousClass9NE r1 = (AnonymousClass9NE) numberEntryKeyboard.A0B.get(Long.valueOf(numberEntryKeyboard.A02));
            Objects.requireNonNull(r1);
            if (r1.A02.isRunning()) {
                r1.A05 = true;
                return;
            }
            ValueAnimator valueAnimator = r1.A03;
            if (!valueAnimator.isRunning()) {
                valueAnimator.start();
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        int i;
        switch (this.A01) {
            case 0:
                ProductListActivity productListActivity = (ProductListActivity) this.A00;
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action != 2 || productListActivity.A03.canScrollVertically(-1) || !productListActivity.A0P) {
                        return false;
                    }
                    C168177zp r2 = productListActivity.A0F;
                    if (r2.A0L()) {
                        return false;
                    }
                    r2.A05.add(0, new A93());
                    r2.A08(0);
                    return false;
                } else if (!productListActivity.A0P || !productListActivity.A0F.A0L()) {
                    return false;
                } else {
                    C168177zp r1 = productListActivity.A0F;
                    if (r1.A0L()) {
                        r1.A05.remove(0);
                        r1.A09(0);
                    }
                    if (!productListActivity.A07.A09()) {
                        return false;
                    }
                    C167487y7 r4 = productListActivity.A0G;
                    r4.A07.A01(r4.A09, AnonymousClass96V.A00(), new C22352AlF(r4));
                    productListActivity.A0P = false;
                    return false;
                }
            case 1:
                AnonymousClass8ZY r3 = (AnonymousClass8ZY) this.A00;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    r3.A08 = true;
                } else if (action2 != 1 && action2 != 3) {
                    return false;
                } else {
                    r3.A08 = false;
                }
                AnonymousClass8ZY.A0E(r3, false);
                return false;
            default:
                NumberEntryKeyboard numberEntryKeyboard = (NumberEntryKeyboard) this.A00;
                int i2 = NumberEntryKeyboard.A0J;
                if (numberEntryKeyboard.A04 != null) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    int i3 = 0;
                    while (true) {
                        view2 = null;
                        if (i3 < numberEntryKeyboard.A0F.length) {
                            int i4 = 0;
                            while (true) {
                                C192609Hw[][] r8 = numberEntryKeyboard.A0F;
                                if (i4 >= r8[0].length) {
                                    i3++;
                                } else if (r8[i3][i4] == null || !r8[i3][i4].A01.contains(x, y)) {
                                    i4++;
                                } else {
                                    View view3 = numberEntryKeyboard.A0E[i3][i4];
                                    if (!(view3.getId() == R.id.custom_key_container && numberEntryKeyboard.A08 == null)) {
                                        view2 = view3;
                                    }
                                }
                            }
                        }
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 != 0) {
                        if (action3 != 1) {
                            if (action3 == 2) {
                                View view4 = numberEntryKeyboard.A03;
                                if (view4 == null || view4 == view2) {
                                    return true;
                                }
                                A00();
                                return false;
                            } else if (action3 != 3) {
                                return true;
                            }
                        }
                        View view5 = numberEntryKeyboard.A03;
                        if (view5 == null) {
                            return true;
                        }
                        if (action3 == 1) {
                            if (view5.getId() != R.id.custom_key_container) {
                                View view6 = numberEntryKeyboard.A03;
                                if (view6.getId() == R.id.one_key) {
                                    i = 8;
                                } else if (view6.getId() == R.id.two_key) {
                                    i = 9;
                                } else if (view6.getId() == R.id.three_key) {
                                    i = 10;
                                } else if (view6.getId() == R.id.four_key) {
                                    i = 11;
                                } else if (view6.getId() == R.id.five_key) {
                                    i = 12;
                                } else if (view6.getId() == R.id.six_key) {
                                    i = 13;
                                } else if (view6.getId() == R.id.seven_key) {
                                    i = 14;
                                } else if (view6.getId() == R.id.eight_key) {
                                    i = 15;
                                } else if (view6.getId() == R.id.nine_key) {
                                    i = 16;
                                } else {
                                    i = 67;
                                    if (view6.getId() == R.id.zero_key) {
                                        i = 7;
                                    }
                                }
                                numberEntryKeyboard.A04.dispatchKeyEvent(new KeyEvent(0, 0, 0, i, 0));
                                numberEntryKeyboard.A04.dispatchKeyEvent(new KeyEvent(0, 0, 1, i, 0));
                            } else {
                                B1C b1c = numberEntryKeyboard.A08;
                                if (b1c != null) {
                                    b1c.BdS(numberEntryKeyboard.A04);
                                }
                            }
                        }
                        A00();
                        return true;
                    } else if (numberEntryKeyboard.A03 == null && view2 != null) {
                        numberEntryKeyboard.A03 = view2;
                        numberEntryKeyboard.A02 = System.currentTimeMillis();
                        if (numberEntryKeyboard.A0C) {
                            C192609Hw r12 = (C192609Hw) numberEntryKeyboard.A0A.get(view2);
                            Objects.requireNonNull(r12);
                            PointF pointF = r12.A00;
                            float f = pointF.x;
                            float f2 = pointF.y;
                            long j = numberEntryKeyboard.A02;
                            if (numberEntryKeyboard.A0C) {
                                PointF pointF2 = new PointF(f, f2);
                                int i5 = NumberEntryKeyboard.A0J;
                                AnonymousClass9KS r5 = numberEntryKeyboard.A07;
                                Objects.requireNonNull(r5);
                                AnonymousClass9NE r32 = new AnonymousClass9NE(pointF2, r5, (float) numberEntryKeyboard.A01, (float) numberEntryKeyboard.A00, i5, j);
                                Map map = numberEntryKeyboard.A0B;
                                Objects.requireNonNull(map);
                                map.put(Long.valueOf(j), r32);
                                r32.A05 = false;
                                ValueAnimator valueAnimator = r32.A02;
                                if (!valueAnimator.isRunning()) {
                                    valueAnimator.start();
                                }
                            }
                        }
                        AnonymousClass3T3.A04(numberEntryKeyboard.A05);
                        return true;
                    }
                }
                return view.performClick();
        }
    }
}
