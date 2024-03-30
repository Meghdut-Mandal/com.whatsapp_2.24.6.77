package X;

import android.content.Context;
import android.location.Location;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.7pB  reason: invalid class name and case insensitive filesystem */
public class C162807pB extends AnonymousClass5B8 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162807pB(Context context, C124515yJ r2, Object obj, int i) {
        super(context, r2);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1 != 3) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x000b
            boolean r0 = super.dispatchTouchEvent(r11)
            return r0
        L_0x000b:
            java.lang.Object r4 = r10.A00
            com.whatsapp.location.LocationPicker r4 = (com.whatsapp.location.LocationPicker) r4
            X.6Zc r1 = r4.A0P
            boolean r0 = r1.A0i
            r7 = 0
            if (r0 == 0) goto L_0x0027
            android.widget.ImageView r1 = r1.A0K
            r0 = 2131231185(0x7f0801d1, float:1.8078444E38)
            r1.setImageResource(r0)
            X.6Zc r0 = r4.A0P
            r0.A0h = r7
        L_0x0022:
            boolean r0 = super.dispatchTouchEvent(r11)
            return r0
        L_0x0027:
            int r1 = r11.getAction()
            if (r1 == 0) goto L_0x011f
            r2 = 120(0x78, double:5.93E-322)
            r8 = 1
            r6 = 8
            r5 = 0
            if (r1 == r8) goto L_0x00e1
            r0 = 2
            if (r1 == r0) goto L_0x003c
            r0 = 3
            if (r1 == r0) goto L_0x00e1
            goto L_0x0022
        L_0x003c:
            X.6Zc r0 = r4.A0P
            com.whatsapp.location.PlaceInfo r0 = r0.A0V
            if (r0 == 0) goto L_0x0058
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0050
            X.4q1 r1 = (X.C97634q1) r1
            X.5hZ r0 = r4.A04
            r1.A09(r0)
            r1.A07()
        L_0x0050:
            X.6Zc r1 = r4.A0P
            r0 = 0
            r1.A0V = r0
            X.C133586Zc.A0C(r1)
        L_0x0058:
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x0022
            float r9 = r11.getX()
            float r1 = r11.getY()
            float r0 = r4.A00
            float r9 = r9 - r0
            float r9 = r9 * r9
            float r0 = r4.A01
            float r1 = r1 - r0
            float r1 = r1 * r1
            float r9 = r9 + r1
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131167010(0x7f070722, float:1.7948282E38)
            float r0 = r1.getDimension(r0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r4.A0X = r8
            X.6Zc r1 = r4.A0P
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x00b6
            android.view.View r0 = r1.A09
            r0.setVisibility(r7)
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A09
            float r0 = X.C36441kJ.A02(r0)
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r5, r0, r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r1.setDuration(r2)
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A0A
            r0.startAnimation(r1)
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A0B
            r0.setVisibility(r7)
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A08
            r0.setVisibility(r6)
        L_0x00b6:
            X.6Zc r1 = r4.A0P
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x00c1
            android.view.View r0 = r1.A08
            r0.setVisibility(r6)
        L_0x00c1:
            r0 = 2131431380(0x7f0b0fd4, float:1.8484488E38)
            android.view.View r2 = r10.findViewById(r0)
            r0 = 2131431302(0x7f0b0f86, float:1.848433E38)
            android.view.View r1 = r10.findViewById(r0)
            if (r2 == 0) goto L_0x00d4
            r2.setVisibility(r6)
        L_0x00d4:
            if (r1 == 0) goto L_0x0022
            X.6Zc r0 = r4.A0P
            boolean r0 = r0.A0e
            if (r0 == 0) goto L_0x0022
            r1.setVisibility(r6)
            goto L_0x0022
        L_0x00e1:
            r4.A00 = r5
            r4.A01 = r5
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0022
            r4.A0X = r7
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A09
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0022
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A09
            r0.setVisibility(r6)
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A09
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r5, r0, r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r1.setDuration(r2)
            X.6Zc r0 = r4.A0P
            android.view.View r0 = r0.A0A
            r0.startAnimation(r1)
            goto L_0x0022
        L_0x011f:
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x0022
            float r0 = r11.getX()
            r4.A00 = r0
            float r0 = r11.getY()
            r4.A01 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162807pB.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public Location getMyLocation() {
        C142466ov r0;
        Location location;
        if (this.A01 != 0 || (r0 = ((GroupChatLiveLocationsActivity) this.A00).A0N) == null || (location = r0.A07) == null) {
            return super.getMyLocation();
        }
        return location;
    }
}
