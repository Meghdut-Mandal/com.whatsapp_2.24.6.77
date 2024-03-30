package X;

import android.view.View;
import android.view.animation.Animation;
import android.widget.AbsListView;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.emoji.EmojiPopupFooter;

/* renamed from: X.2vQ  reason: invalid class name and case insensitive filesystem */
public class C55932vQ implements AbsListView.OnScrollListener {
    public Object A00;
    public final int A01;

    public C55932vQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r2 <= 1.0f) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.widget.AbsListView r9) {
        /*
            r8 = this;
            java.lang.Object r5 = r8.A00
            X.3Tz r5 = (X.C65923Tz) r5
            int r0 = X.C65923Tz.A0Z
            android.view.ViewGroup r4 = r5.A0F
            if (r4 == 0) goto L_0x005b
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            android.content.Context r0 = r9.getContext()
            float r3 = X.C36341k9.A00(r0)
            float r3 = r3 * r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r1 = r9.getFirstVisiblePosition()
            android.view.View r0 = X.C36411kG.A0L(r9)
            r7 = 0
            if (r0 != 0) goto L_0x005c
            r0 = 0
        L_0x0025:
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x0044
            float r2 = -r0
            android.content.res.Resources r1 = X.C36341k9.A0F(r9)
            r0 = 2131166430(0x7f0704de, float:1.7947105E38)
            float r0 = X.C36441kJ.A00(r1, r0)
            float r2 = r2 / r0
            float r2 = java.lang.Math.min(r2, r6)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0045
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0045
        L_0x0044:
            float r3 = r3 * r2
        L_0x0045:
            int r1 = r5.A09
            r0 = 1095761920(0x41500000, float:13.0)
            float r2 = r2 * r0
            int r0 = (int) r2
            int r1 = X.C018107s.A06(r1, r0)
            int r0 = r5.A07
            int r0 = X.C018107s.A05(r1, r0)
            r4.setBackgroundColor(r0)
            X.C011004s.A05(r4, r3)
        L_0x005b:
            return
        L_0x005c:
            int r0 = r0.getTop()
            float r0 = (float) r0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55932vQ.A00(android.widget.AbsListView):void");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        Object obj;
        switch (this.A01) {
            case 0:
                A00(absListView);
                int i4 = C65923Tz.A0Z;
                AbsListView.OnScrollListener onScrollListener = ((C65923Tz) this.A00).A0H;
                if (onScrollListener != null) {
                    onScrollListener.onScroll(absListView, i, i2, i3);
                    return;
                }
                return;
            case 1:
                CallLogActivity.A0F((CallLogActivity) this.A00);
                return;
            case 2:
                ListChatInfoActivity.A0z((ListChatInfoActivity) this.A00);
                return;
            case 3:
                obj = this.A00;
                break;
            case 4:
                obj = ((C81323wp) this.A00).A00;
                break;
            case 5:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                View view = contactPickerFragment.A09;
                if (view == null) {
                    return;
                }
                if (i != 0) {
                    view.setVisibility(8);
                    return;
                } else if (contactPickerFragment.A3o.containsKey(C177528dw.A00)) {
                    contactPickerFragment.A09.setVisibility(0);
                    View childAt = absListView.getChildAt(0);
                    if (childAt != null) {
                        contactPickerFragment.A09.setAlpha(((float) (childAt.getHeight() + childAt.getTop())) / C36441kJ.A02(childAt));
                        contactPickerFragment.A09.setTranslationY((float) childAt.getTop());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                AnonymousClass22t r3 = (AnonymousClass22t) this.A00;
                int height = r3.A08.getHeight();
                int i5 = r3.A02;
                if (i5 >= i) {
                    height = -1;
                    if (i5 > i) {
                        height = 0;
                    }
                }
                r3.A02 = i;
                if (height >= 0) {
                    EmojiPopupFooter emojiPopupFooter = r3.A08;
                    if (height != emojiPopupFooter.A00) {
                        Animation animation = emojiPopupFooter.getAnimation();
                        if (!(animation instanceof C37651mz) || ((C37651mz) animation).A00 != height) {
                            if (animation != null) {
                                animation.cancel();
                            }
                            r3.A08.startAnimation(new C37651mz(r3, height));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
        ((AnonymousClass2E6) obj).A0C();
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        Object obj;
        switch (this.A01) {
            case 0:
                A00(absListView);
                int i2 = C65923Tz.A0Z;
                AbsListView.OnScrollListener onScrollListener = ((C65923Tz) this.A00).A0H;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i);
                    return;
                }
                return;
            case 3:
                obj = this.A00;
                break;
            case 4:
                obj = ((C81323wp) this.A00).A00;
                break;
            case 6:
                if (i == 0) {
                    InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = (InviteNonWhatsAppContactPickerActivity) this.A00;
                    AnonymousClass1JI r1 = inviteNonWhatsAppContactPickerActivity.A0F;
                    if (r1 != null) {
                        r1.A02(inviteNonWhatsAppContactPickerActivity.getWindow());
                        return;
                    }
                    throw C36331k8.A0d("scrollPerfLoggerManager");
                } else if (i == 1) {
                    InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity2 = (InviteNonWhatsAppContactPickerActivity) this.A00;
                    AnonymousClass1JI r2 = inviteNonWhatsAppContactPickerActivity2.A0F;
                    if (r2 != null) {
                        r2.A03(inviteNonWhatsAppContactPickerActivity2.getWindow(), 12);
                        return;
                    }
                    throw C36331k8.A0d("scrollPerfLoggerManager");
                } else {
                    return;
                }
            default:
                return;
        }
        ((AnonymousClass2E6) obj).A0C();
    }
}
