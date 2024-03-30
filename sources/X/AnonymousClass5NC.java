package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5NC  reason: invalid class name */
public final class AnonymousClass5NC extends AnonymousClass5ND {
    public int A00 = 1;
    public AnonymousClass1K3 A01;
    public AnonymousClass66D A02;
    public AnonymousClass11F A03;
    public Integer A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = true;

    public AnonymousClass5NC(Context context, View view, AnonymousClass11F r7) {
        super(context, view);
        A09();
        this.A0Q = false;
        setId(R.id.bot_embodiment_draggable_container);
        setClipToPadding(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        this.A0Y = false;
        this.A03 = r7;
    }

    public static /* synthetic */ void getCornerType$annotations() {
    }

    public void onViewAdded(View view) {
        AnonymousClass00C.A0D(view, 0);
        super.onViewAdded(view);
        View view2 = this.A0C;
        if (view2 != null) {
            C36361kB.A18(view2, this, 20);
            view2.setOnLongClickListener(new C163337q2(this, 0));
        }
    }

    public final void setBonsaiUiUtil(AnonymousClass1K3 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setBotEmbodimentLoggingManager(AnonymousClass66D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public void setConfiguration(Configuration configuration) {
        View view;
        int i;
        int A002;
        AnonymousClass00C.A0D(configuration, 0);
        int i2 = this.A07;
        super.setConfiguration(configuration);
        AnonymousClass11F r2 = this.A03;
        if (r2 != null && getVisibility() == 0 && (view = this.A0C) != null && view.getVisibility() == 0 && i2 != (i = this.A07)) {
            AnonymousClass66D botEmbodimentLoggingManager = getBotEmbodimentLoggingManager();
            if (i == 2) {
                A002 = 2;
            } else {
                A002 = A00();
            }
            String A003 = botEmbodimentLoggingManager.A00(r2);
            C21010yW r22 = botEmbodimentLoggingManager.A00;
            C1039457r r1 = new C1039457r();
            r1.A03 = A003;
            r1.A02 = A01(r1, A002, i);
            r22.Bly(r1);
        }
    }

    private final Integer A00() {
        int i;
        View view = this.A0C;
        if (view != null && this.A04 >= 0 && this.A05 >= 0) {
            if (A06(this)) {
                i = 5;
            } else {
                int A0A = A0A(view.getWidth());
                if (A0A == getLeftOfDraggableArea() - AnonymousClass5ND.A07(this, view.getWidth())) {
                    i = 3;
                    if (this.A06) {
                        i = 1;
                    }
                } else {
                    int width = view.getWidth();
                    if (A0A == (getRightOfDraggableArea() - width) + AnonymousClass5ND.A07(this, width)) {
                        i = 4;
                        if (this.A06) {
                            i = 2;
                        }
                    }
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public static Integer A01(C1039457r r0, Integer num, int i) {
        r0.A01 = num;
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return null;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r6.A00 != 2) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass5NC r6, int r7, boolean r8) {
        /*
            r6.A00 = r7
            android.view.View r4 = r6.A0C
            if (r4 == 0) goto L_0x0067
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x000f
            X.0Z5 r0 = r6.A0Z
            r0.A0A()
        L_0x000f:
            r5 = 1
            r2 = 2
            if (r7 != r5) goto L_0x007e
            int r0 = r6.getLeftOfDraggableArea()
            if (r0 < 0) goto L_0x0079
            int r0 = r6.getRightOfDraggableArea()
            if (r0 < 0) goto L_0x0079
            int r1 = r6.getLeftOfDraggableArea()
            int r0 = r6.getRightOfDraggableArea()
            int r1 = r1 + r0
        L_0x0028:
            int r1 = r1 / 2
            int r0 = r4.getWidth()
            int r0 = r0 / r2
            int r1 = r1 - r0
            int r0 = r4.getHeight()
            int r3 = r6.A0C(r0)
        L_0x0038:
            if (r3 >= 0) goto L_0x003f
            int r3 = r4.getHeight()
            int r3 = r3 / r2
        L_0x003f:
            if (r1 < 0) goto L_0x0067
            if (r3 < 0) goto L_0x0067
            if (r2 != r7) goto L_0x0047
            r6.A0P = r5
        L_0x0047:
            if (r8 == 0) goto L_0x0068
            r6.A04 = r1
            r6.A05 = r3
            java.lang.Integer r1 = r6.A00()
            java.lang.Integer r0 = r6.A04
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x005b
            r6.A04 = r1
        L_0x005b:
            int r0 = r6.A07
            if (r0 == r2) goto L_0x0064
            int r0 = r6.A00
            r1 = 0
            if (r0 == r2) goto L_0x0065
        L_0x0064:
            r1 = 1
        L_0x0065:
            r6.A0S = r1
        L_0x0067:
            return
        L_0x0068:
            boolean r0 = r6.A0I(r1, r3)
            if (r0 == 0) goto L_0x005b
            r1 = 9
            X.74h r0 = new X.74h
            r0.<init>(r6, r4, r1)
            X.C011504z.A07(r4, r0)
            goto L_0x005b
        L_0x0079:
            int r1 = r6.getMeasuredWidth()
            goto L_0x0028
        L_0x007e:
            r6.A06 = r5
            int r0 = r4.getWidth()
            int r1 = r6.getRightOfDraggableArea()
            int r1 = r1 - r0
            int r0 = X.AnonymousClass5ND.A07(r6, r0)
            int r1 = r1 + r0
            int r0 = r4.getHeight()
            int r3 = r6.A0C(r0)
            if (r1 >= 0) goto L_0x0038
            int r1 = r6.getMeasuredWidth()
            int r0 = r4.getWidth()
            int r0 = r0 / r2
            int r1 = r1 - r0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NC.A03(X.5NC, int, boolean):void");
    }

    public static final void A04(AnonymousClass5NC r5, boolean z) {
        AnonymousClass11F r0 = r5.A03;
        if (r0 != null) {
            AnonymousClass66D botEmbodimentLoggingManager = r5.getBotEmbodimentLoggingManager();
            Integer num = r5.A04;
            int i = r5.A07;
            String A002 = botEmbodimentLoggingManager.A00(r0);
            C21010yW r2 = botEmbodimentLoggingManager.A00;
            C1039457r r1 = new C1039457r();
            r1.A03 = A002;
            r1.A00 = Integer.valueOf(C36371kC.A00(z ? 1 : 0));
            r1.A02 = A01(r1, num, i);
            r2.Bly(r1);
        }
    }

    public static final boolean A06(AnonymousClass5NC r4) {
        int measuredWidth;
        View view = r4.A0C;
        if (view == null) {
            return false;
        }
        int width = r4.A04 + (view.getWidth() / 2);
        if (r4.getLeftOfDraggableArea() < 0 || r4.getRightOfDraggableArea() < 0) {
            measuredWidth = r4.getMeasuredWidth();
        } else {
            measuredWidth = r4.getLeftOfDraggableArea() + r4.getRightOfDraggableArea();
        }
        if (width == measuredWidth / 2) {
            return true;
        }
        return false;
    }

    public final AnonymousClass1K3 getBonsaiUiUtil() {
        AnonymousClass1K3 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("bonsaiUiUtil");
    }

    public final AnonymousClass66D getBotEmbodimentLoggingManager() {
        AnonymousClass66D r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("botEmbodimentLoggingManager");
    }

    public static final void A02(View view, AnonymousClass5NC r3, int i) {
        r3.A06 = AnonymousClass000.A1T(AnonymousClass000.A05(i, r3.A0C(view.getHeight())), AnonymousClass000.A05(i, r3.A0D(view.getHeight())));
        r3.A05(false);
    }

    private final void A05(boolean z) {
        Integer A002 = A00();
        if (!AnonymousClass00C.A0J(A002, this.A04)) {
            this.A04 = A002;
        } else if (!z) {
            return;
        }
        Integer num = this.A04;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass11F r0 = this.A03;
            if (r0 != null) {
                AnonymousClass66D botEmbodimentLoggingManager = getBotEmbodimentLoggingManager();
                int i = this.A07;
                String A003 = botEmbodimentLoggingManager.A00(r0);
                C21010yW r2 = botEmbodimentLoggingManager.A00;
                C1039457r r1 = new C1039457r();
                r1.A03 = A003;
                r1.A02 = A01(r1, Integer.valueOf(intValue), i);
                r2.Bly(r1);
            }
        }
    }

    public boolean A0I(int i, int i2) {
        boolean A0I = super.A0I(i, i2);
        Integer A002 = A00();
        if (!AnonymousClass00C.A0J(A002, this.A04)) {
            this.A04 = A002;
            if (A002 != null && A002.intValue() == 5) {
                A05(true);
            }
        }
        return A0I;
    }
}
