package X;

import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.6dB  reason: invalid class name and case insensitive filesystem */
public class C135736dB implements View.OnTouchListener {
    public float A00;
    public float A01;
    public final /* synthetic */ VoipCallControlBottomSheetV2 A02;

    public C135736dB(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A02 = voipCallControlBottomSheetV2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = r10.A02
            X.6X3 r0 = r4.A0L
            r3 = 1
            if (r0 == 0) goto L_0x00aa
            boolean r2 = r0.A07()
            X.61I r0 = r4.A0d
            if (r0 == 0) goto L_0x0162
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            boolean r0 = r1.A1w
            if (r0 != 0) goto L_0x0023
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r1.A17
            if (r0 != 0) goto L_0x0023
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r1.A0e
            X.00s r0 = r0.A0I
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x0162
        L_0x0023:
            r8 = 1
        L_0x0024:
            float r6 = r12.getX()
            float r5 = r12.getY()
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x00ab
            if (r2 != 0) goto L_0x00ab
            int r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A03(r4)
            float r0 = (float) r0
            float r0 = r0 + r5
            r12.setLocation(r6, r0)
            X.01I r0 = r4.A0h()
            r0.dispatchTouchEvent(r12)
            X.61I r0 = r4.A0d
            if (r0 == 0) goto L_0x00ab
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            com.whatsapp.voipcalling.VoipActivityV2 r7 = r0.A00
            boolean r0 = r7.A1q
            if (r0 != 0) goto L_0x006a
            android.widget.ImageButton r0 = r7.A0H
            X.C18740tg.A04(r0)
            r2.add(r0)
            android.view.View r0 = r7.A0D
            X.C18740tg.A04(r0)
            r2.add(r0)
            android.view.ViewGroup r0 = r7.A0G
            X.C18740tg.A04(r0)
            r2.add(r0)
        L_0x006a:
            X.6ro r0 = r7.A0l
            if (r0 == 0) goto L_0x0080
            X.6wd r0 = r0.A09
            com.whatsapp.glasses.layouts.SupToggle r0 = r0.A05
            r1 = 0
            if (r0 == 0) goto L_0x0077
            android.widget.ImageView r1 = r0.A04
        L_0x0077:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            r2.add(r1)
        L_0x0080:
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = r7.A0d
            r2.add(r0)
            android.graphics.Rect r7 = X.AnonymousClass001.A06()
            java.util.Iterator r2 = r2.iterator()
        L_0x008d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ab
            android.view.View r0 = X.C36431kI.A0K(r2)
            r0.getGlobalVisibleRect(r7)
            float r0 = r12.getX()
            int r1 = (int) r0
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r0 = r7.contains(r1, r0)
            if (r0 == 0) goto L_0x008d
        L_0x00aa:
            return r3
        L_0x00ab:
            if (r8 != 0) goto L_0x00aa
            int r0 = r12.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0113
            r10.A00 = r6
            r10.A01 = r5
        L_0x00b8:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r4.A0T
            if (r0 == 0) goto L_0x0138
            X.6X3 r0 = r4.A0L
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0138
            int r0 = r12.getAction()
            if (r0 == r3) goto L_0x00d0
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x0138
        L_0x00d0:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r4.A0T
            android.view.View r0 = r4.A07
            int r0 = r0.getTop()
            float r8 = (float) r0
            float r8 = r8 - r5
            int r7 = r12.getAction()
            int r0 = r1.A01
            if (r0 != 0) goto L_0x00ef
            android.content.res.Resources r9 = r1.getResources()
            r0 = 2131165546(0x7f07016a, float:1.7945312E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r1.A01 = r0
        L_0x00ef:
            int r0 = r1.getLeft()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0135
            int r0 = r1.getRight()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0135
            int r0 = r1.A01
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0135
            boolean r0 = com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator.A01(r1, r7)
            if (r0 == 0) goto L_0x0138
            r10.A00 = r2
            r10.A01 = r2
            return r3
        L_0x0113:
            int r1 = r12.getAction()
            r0 = 2
            if (r1 != r0) goto L_0x00b8
            float r0 = r10.A00
            float r0 = X.C90494aF.A01(r6, r0)
            float r1 = r4.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0130
            float r0 = r10.A01
            float r0 = X.C90494aF.A01(r5, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
        L_0x0130:
            r10.A00 = r2
            r10.A01 = r2
            goto L_0x00b8
        L_0x0135:
            r0 = 0
            r1.A03 = r0
        L_0x0138:
            int r0 = r12.getAction()
            if (r0 != r3) goto L_0x00aa
            float r0 = r10.A00
            float r0 = X.C90494aF.A01(r6, r0)
            float r1 = r4.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00aa
            float r0 = r10.A01
            float r0 = X.C90494aF.A01(r5, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00aa
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r4.A0N
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x00aa
            r10.A00 = r2
            r10.A01 = r2
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A08(r4)
            return r3
        L_0x0162:
            r8 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135736dB.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
