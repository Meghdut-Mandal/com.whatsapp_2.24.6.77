package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.3Ln  reason: invalid class name and case insensitive filesystem */
public class C63813Ln implements AbsListView.OnScrollListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C63813Ln(AnonymousClass27v r2) {
        this.A02 = 1;
        this.A01 = r2;
        this.A00 = 0;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View view;
        float f;
        if (4 - this.A02 == 0) {
            if (i + i2 == i3) {
                int bottom = absListView.getChildAt(i2 - 1).getBottom();
                LiveLocationPrivacyActivity liveLocationPrivacyActivity = (LiveLocationPrivacyActivity) this.A01;
                int bottom2 = liveLocationPrivacyActivity.A01.getBottom() - liveLocationPrivacyActivity.A01.getPaddingBottom();
                view = liveLocationPrivacyActivity.A00;
                if (bottom == bottom2) {
                    f = 0.0f;
                }
                f = (float) this.A00;
            } else {
                view = ((LiveLocationPrivacyActivity) this.A01).A00;
                f = (float) this.A00;
            }
            view.setElevation(f);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r2, int r3) {
        /*
            r1 = this;
            int r0 = r1.A02
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x002a;
                case 4: goto L_0x0016;
                case 5: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            if (r3 == r0) goto L_0x0014
            java.lang.Object r0 = r1.A01
            X.155 r0 = (X.AnonymousClass155) r0
            X.1N2 r0 = r0.A0C
        L_0x0011:
            r0.A01(r2)
        L_0x0014:
            r1.A00 = r3
        L_0x0016:
            return
        L_0x0017:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            if (r3 == r0) goto L_0x0014
            java.lang.Object r0 = r1.A01
            com.whatsapp.contact.picker.BidiContactListView r0 = (com.whatsapp.contact.picker.BidiContactListView) r0
            X.1N2 r0 = r0.getImeUtils()
            goto L_0x0011
        L_0x002a:
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            if (r3 == r0) goto L_0x0014
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            X.1N2 r0 = r0.A08
            goto L_0x0011
        L_0x0037:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            if (r3 == r0) goto L_0x0014
            java.lang.Object r0 = r1.A01
            com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment r0 = (com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment) r0
            X.1N2 r0 = r0.A08
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63813Ln.onScrollStateChanged(android.widget.AbsListView, int):void");
    }

    public C63813Ln(LiveLocationPrivacyActivity liveLocationPrivacyActivity, int i) {
        this.A02 = 4;
        this.A01 = liveLocationPrivacyActivity;
        this.A00 = i;
    }

    public C63813Ln(Object obj, int i) {
        this.A02 = i;
        this.A01 = obj;
    }

    public C63813Ln(PhoneContactsSelector phoneContactsSelector) {
        this.A02 = 2;
        this.A01 = phoneContactsSelector;
        this.A00 = 0;
    }

    public C63813Ln(GroupParticipantsSearchFragment groupParticipantsSearchFragment) {
        this.A02 = 3;
        this.A01 = groupParticipantsSearchFragment;
        this.A00 = 0;
    }
}
