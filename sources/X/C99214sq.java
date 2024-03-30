package X;

import android.view.View;
import com.whatsapp.camera.DragGalleryStripIndicator;

/* renamed from: X.4sq  reason: invalid class name and case insensitive filesystem */
public class C99214sq extends C06570Uc {
    public boolean A00 = false;
    public final /* synthetic */ C225314u A01;
    public final /* synthetic */ AnonymousClass6YT A02;
    public final /* synthetic */ AnonymousClass6F9 A03;
    public final /* synthetic */ C1270866x A04;

    public C99214sq(C225314u r2, AnonymousClass6YT r3, AnonymousClass6F9 r4, C1270866x r5) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void A02(View view, float f) {
        AnonymousClass6YT r1 = this.A02;
        float f2 = 1.0f - f;
        r1.A05.setAlpha(f2);
        r1.A0G.A00.setAlpha(f2);
        r1.A0I.A01.setAlpha(f2);
        AnonymousClass64G r2 = r1.A0H;
        r2.A01.setBackgroundColor(((int) (255.0f * f)) << 24);
        AnonymousClass6F9 r22 = this.A03;
        if (r22.A07.getConfiguration().orientation != 2 || r22.A0D) {
            r22.A0A.setAlpha(f2);
            DragGalleryStripIndicator dragGalleryStripIndicator = r22.A03;
            if (dragGalleryStripIndicator != null) {
                dragGalleryStripIndicator.setAlpha(f2);
            }
        }
        r22.A09.setAlpha(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r13, int r14) {
        /*
            r12 = this;
            X.6F9 r2 = r12.A03
            r4 = 1
            r2.A03(r4)
            X.6YT r7 = r12.A02
            boolean r9 = r12.A00
            X.02E r5 = r7.A0Y
            r3 = 4
            r8 = 0
            boolean r0 = X.C36381kD.A1U(r14, r3)
            r5.A1V(r0)
            r6 = 3
            if (r14 != r6) goto L_0x008d
            if (r9 != 0) goto L_0x002c
            boolean r0 = r5 instanceof X.C160017kK
            if (r0 == 0) goto L_0x002c
            r11 = r5
            X.7kK r11 = (X.C160017kK) r11
            X.6Dz r0 = r7.A0g
            java.util.List r10 = r0.A08
            java.util.Set r1 = r0.A09
            X.6Tg r0 = r0.A03
            r11.BsA(r0, r10, r1)
        L_0x002c:
            X.0v0 r0 = r7.A0o
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "show_camera_gallery_tip"
            X.C36331k8.A0w(r1, r0, r8)
            android.view.View r0 = r7.A05
            r0.setVisibility(r3)
            X.6F9 r0 = r7.A0F
            if (r0 == 0) goto L_0x0044
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0B
            r0.A00 = r4
        L_0x0044:
            X.60p r0 = r7.A0G
            if (r14 != r6) goto L_0x0049
            r8 = 4
        L_0x0049:
            com.whatsapp.camera.mode.CameraModeTabLayout r0 = r0.A00
            r0.setVisibility(r8)
            if (r14 != r3) goto L_0x007e
            if (r9 == 0) goto L_0x0061
            boolean r0 = r5 instanceof X.C160017kK
            if (r0 == 0) goto L_0x0061
            X.7kK r5 = (X.C160017kK) r5
            X.6Dz r0 = r7.A0g
            java.util.Set r1 = r0.A09
            X.6Tg r0 = r0.A03
            r5.BHA(r0, r1)
        L_0x0061:
            X.6WU r1 = r7.A0E
            X.6Dz r0 = r7.A0g
            java.util.Set r0 = r0.A09
            X.C90504aG.A1B(r1, r0)
            X.64G r5 = r7.A0H
            X.0wG r0 = r7.A0n
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)
            r0 = 2131102972(0x7f060cfc, float:1.7818397E38)
            int r1 = r1.getColor(r0)
            android.view.View r0 = r5.A01
            r0.setBackgroundColor(r1)
        L_0x007e:
            r5 = 0
            if (r14 != r4) goto L_0x00a1
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x00e0
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r2.A0B
            r0.A0W(r3)
            r12.A00 = r5
            return
        L_0x008d:
            android.view.View r0 = r7.A05
            r0.setVisibility(r8)
            X.6F9 r1 = r7.A0F
            if (r1 == 0) goto L_0x0044
            X.6Dz r0 = r7.A0g
            int r0 = r0.A01
            if (r0 == r4) goto L_0x0044
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r1.A0B
            r0.A00 = r8
            goto L_0x0044
        L_0x00a1:
            if (r14 != r6) goto L_0x00e0
            X.66x r7 = r12.A04
            r6 = 6
            r1 = 17
            r0 = 65
            X.C1270866x.A00(r7, r0, r6, r1)
            X.14u r6 = r12.A01
            r1 = 2130969722(0x7f04047a, float:1.7548134E38)
            r0 = 2131100922(0x7f0604fa, float:1.781424E38)
            int r0 = X.C224514j.A00(r6, r1, r0)
            X.AnonymousClass1RC.A05(r6, r0)
            r1 = 2130969973(0x7f040575, float:1.7548643E38)
            r0 = 2131101103(0x7f0605af, float:1.7814606E38)
            int r0 = X.C224514j.A00(r6, r1, r0)
            X.AnonymousClass1RC.A06(r6, r0, r4)
            android.view.View r0 = r2.A01
            if (r0 == 0) goto L_0x00d0
            r0.setVisibility(r3)
        L_0x00d0:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0A
            r0.setVisibility(r3)
            r12.A00 = r4
        L_0x00d7:
            android.view.View r0 = r2.A09
            r0.setEnabled(r4)
            r0.setVisibility(r5)
            return
        L_0x00e0:
            X.14u r6 = r12.A01
            android.view.Window r0 = r6.getWindow()
            X.AnonymousClass1RC.A09(r0, r5)
            int r0 = X.C224314h.A00(r6)
            X.AnonymousClass1RC.A04(r6, r0)
            r1 = 2130968861(0x7f04011d, float:1.7546388E38)
            r0 = 2131099982(0x7f06014e, float:1.7812333E38)
            int r1 = X.C224514j.A00(r6, r1, r0)
            r0 = 2
            X.AnonymousClass1RC.A06(r6, r1, r0)
            android.view.View r1 = r2.A01
            if (r1 == 0) goto L_0x010b
            boolean r0 = r2.A0C
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
        L_0x010b:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0A
            r0.setVisibility(r5)
            if (r14 != r3) goto L_0x00d7
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x011d
            X.1wW r0 = r2.A04
            if (r0 == 0) goto L_0x011d
            r0.A06()
        L_0x011d:
            r12.A00 = r5
            android.view.View r0 = r2.A09
            r0.setEnabled(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99214sq.A03(android.view.View, int):void");
    }
}
