package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.R;

/* renamed from: X.1zH  reason: invalid class name and case insensitive filesystem */
public class C42721zH extends AnonymousClass0D3 implements AnonymousClass04S {
    public final View A00;
    public final CheckBox A01;
    public final int[] A02;
    public final int[] A03;
    public final int[] A04;

    public void A0B(boolean z, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        CheckBox checkBox = this.A01;
        Resources resources = checkBox.getResources();
        int i2 = R.drawable.group_profile_emoji_editor_color_selection_unchecked;
        if (z) {
            i2 = R.drawable.group_profile_emoji_editor_color_selection_checked;
        }
        Drawable A002 = AnonymousClass0BT.A00(C36361kB.A09(checkBox), resources, i2);
        C18740tg.A06(A002);
        LayerDrawable layerDrawable = (LayerDrawable) A002;
        int[] iArr = this.A03;
        int i3 = iArr[i % iArr.length];
        int[] iArr2 = this.A04;
        int i4 = iArr2[i % iArr2.length];
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.color_selection_ring);
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.color_selection_circle);
        Drawable A08 = AnonymousClass3UF.A08(findDrawableByLayerId, i4);
        Drawable A082 = AnonymousClass3UF.A08(findDrawableByLayerId2, i3);
        layerDrawable.setDrawableByLayerId(R.id.color_selection_ring, A08);
        layerDrawable.setDrawableByLayerId(R.id.color_selection_circle, A082);
        stateListDrawable.addState(StateSet.WILD_CARD, layerDrawable);
        stateListDrawable.mutate();
        Context context = checkBox.getContext();
        int[] iArr3 = this.A02;
        C36331k8.A0q(context, checkBox, iArr3[i % iArr3.length]);
        checkBox.setButtonDrawable(stateListDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BTH(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r6.A04()
            int r0 = r7.intValue()
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1S(r5, r0)
            android.widget.CheckBox r2 = r6.A01
            boolean r1 = r2.isChecked()
            if (r3 == 0) goto L_0x001a
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x001a:
            r0 = 0
            if (r3 != 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
        L_0x001f:
            if (r5 < 0) goto L_0x0028
            if (r0 != 0) goto L_0x0025
            if (r4 == 0) goto L_0x0028
        L_0x0025:
            r6.A0B(r3, r5)
        L_0x0028:
            r2.setChecked(r3)
            return
        L_0x002c:
            r4 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42721zH.BTH(java.lang.Object):void");
    }

    public C42721zH(View view, int[] iArr, int[] iArr2, int[] iArr3) {
        super(view);
        this.A00 = C012005e.A02(view, R.id.selectionRingContainer);
        CheckBox checkBox = (CheckBox) C012005e.A02(view, R.id.selectionRing);
        this.A01 = checkBox;
        C33521fV.A03(checkBox, R.string.f12nameremoved);
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A02 = iArr3;
    }
}
