package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.community.SubgroupWithParentView;

/* renamed from: X.4Yc  reason: invalid class name and case insensitive filesystem */
public class C89844Yc implements AnonymousClass026 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89844Yc(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void accept(Object obj) {
        int i;
        if (this.A02 != 0) {
            C132446Tt r0 = (C132446Tt) this.A00;
            Number number = (Number) this.A01;
            C225314u r7 = (C225314u) obj;
            int intValue = number.intValue();
            if (intValue == 0) {
                Intent A0D = C36431kI.A0D();
                A0D.setData((Uri) r7.getIntent().getParcelableExtra("emojiEditorImageResult"));
                A0D.putExtra("emojiEditorImageResult", r7.getIntent().getParcelableExtra("emojiEditorImageResult"));
                A0D.putExtra("skip_cropping", true);
                C36331k8.A0o(r7, A0D);
            } else if (!C36431kI.A1Y(r0)) {
                C36321k7.A1J(number, "GroupProfileEmojiEditor/render/error ", AnonymousClass000.A0u());
                if (intValue == -2) {
                    boolean A002 = C20060wx.A00();
                    i = R.string.f12nameremoved;
                    if (A002) {
                        i = R.string.f12nameremoved;
                    }
                } else if (intValue == -3) {
                    i = R.string.f12nameremoved;
                } else {
                    r7.A05.A06(R.string.f12nameremoved, 1);
                    return;
                }
                r7.BO5(i);
            }
        } else {
            SubgroupWithParentView subgroupWithParentView = (SubgroupWithParentView) this.A00;
            WaImageView waImageView = subgroupWithParentView.A01;
            int i2 = subgroupWithParentView.A00;
            ((AnonymousClass1RY) this.A01).A04(waImageView, new C53982sD(subgroupWithParentView, 1), (AnonymousClass141) obj, i2);
        }
    }
}
