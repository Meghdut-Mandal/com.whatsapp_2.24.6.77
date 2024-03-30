package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: X.1mX  reason: invalid class name and case insensitive filesystem */
public class C37511mX extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;
    public final /* synthetic */ AnonymousClass2IR A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37511mX(Context context, AnonymousClass2IR r3) {
        super(context);
        this.A04 = r3;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass001.A06();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2.isPressed() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRowSelected(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 == r4) goto L_0x001b
            r3.A02 = r4
            r3.setSelected(r4)
            X.2IR r2 = r3.A04
            if (r4 != 0) goto L_0x0014
            boolean r1 = r2.isPressed()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.dispatchSetPressed(r0)
            r3.invalidate()
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37511mX.setRowSelected(boolean):void");
    }

    public boolean isSelected() {
        return this.A02;
    }

    public void onDraw(Canvas canvas) {
        int BHE;
        super.onDraw(canvas);
        if (this.A02) {
            AnonymousClass2IR r4 = this.A04;
            C89004Uw r0 = r4.A0c;
            if (r0 == null || r0.BPt()) {
                Rect rect = this.A03;
                getDrawingRect(rect);
                if (r4.A0O) {
                    rect.top += r4.getPaddingTop();
                    BHE = rect.bottom - r4.getPaddingBottom();
                } else {
                    C89014Ux r5 = r4.A0d;
                    if (r5.BLr()) {
                        if (r4.A00) {
                            rect.top += r4.A0b.getTop();
                        }
                        if (r4.A1H()) {
                            Rect rect2 = r4.A0i;
                            rect.top = rect2.top - r5.BHF(getContext());
                            int BHE2 = rect2.bottom + r5.BHE(getContext());
                            rect.bottom = BHE2;
                            RelativeLayout relativeLayout = r4.A06;
                            if (relativeLayout != null) {
                                BHE = BHE2 + (relativeLayout.getHeight() - r4.getReactionsViewVerticalOverlap());
                            }
                            canvas.drawRect(rect, r4.A0d.BBz());
                        }
                        rect.top -= r5.BHF(getContext());
                    }
                    BHE = rect.bottom + r5.BHE(getContext());
                }
                rect.bottom = BHE;
                canvas.drawRect(rect, r4.A0d.BBz());
            }
        }
    }
}
