package X;

import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.7qA  reason: invalid class name and case insensitive filesystem */
public class C163417qA implements AnonymousClass02G {
    public Object A00;
    public final int A01;

    public C163417qA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BcC(int i) {
        int i2;
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            C129046Es r1 = (C129046Es) obj;
            r1.A00 = i;
            if (!C36351kA.A1Y(r1.A08)) {
                C100774ve r0 = r1.A03;
                if (r0 != null) {
                    i2 = r0.A01.length;
                } else {
                    i2 = 0;
                }
                i = (i2 - i) - 1;
            }
            r1.A05(i);
            C160157kY r02 = r1.A04;
            if (r02 != null) {
                r02.BcC(i);
                return;
            }
            return;
        }
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) obj;
        MediaComposerFragment A0F = MediaComposerActivity.A0F(mediaComposerActivity);
        if (A0F != null) {
            MediaComposerActivity.A0q(mediaComposerActivity, A0F);
        }
        MediaComposerActivity.A0h(mediaComposerActivity);
        MediaComposerActivity.A0o(mediaComposerActivity, C1031053t.A00(mediaComposerActivity.A0t, i));
    }

    public void BcA(int i) {
    }

    public void BcB(int i, float f, int i2) {
    }
}
