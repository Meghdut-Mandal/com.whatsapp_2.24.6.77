package X;

import android.os.SystemClock;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.settings.Settings;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4W3  reason: invalid class name */
public class AnonymousClass4W3 extends C226815j {
    public Object A00;
    public final int A01;

    public static Object A01(AnonymousClass4W3 r1, Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return r1.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0298, code lost:
        r3.Bp1(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x033a, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x033d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03c9, code lost:
        X.C36381kD.A1R(r3, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0117, code lost:
        if (r1 == null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018c, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018e, code lost:
        r6 = (X.C28981Uw) r6;
        X.AnonymousClass00C.A0D(r6, 0);
        r5 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0198, code lost:
        if (r5.A00 > 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019a, code lost:
        r8 = 0;
        r2 = r5.A01.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a5, code lost:
        if (r2.hasNext() == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a7, code lost:
        r7 = r2.next();
        r1 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ad, code lost:
        if (r8 >= 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        throw X.C36351kA.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b4, code lost:
        r7 = (X.AnonymousClass3JI) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c0, code lost:
        if (X.AnonymousClass00C.A0J(r7.A02.A0J(), r6) == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c2, code lost:
        r5.A04.Bp6(new X.C80513vW(r5, r6, r7, r8, 19), "RecommendedNewslettersAdapter/notifyItemChanged");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        r8 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass11F r11) {
        /*
            r10 = this;
            r6 = r11
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0025;
                case 2: goto L_0x0350;
                case 3: goto L_0x0035;
                case 4: goto L_0x0066;
                case 5: goto L_0x035a;
                case 6: goto L_0x0006;
                case 7: goto L_0x0082;
                case 8: goto L_0x00b3;
                case 9: goto L_0x036d;
                case 10: goto L_0x00d9;
                case 11: goto L_0x0006;
                case 12: goto L_0x00f2;
                case 13: goto L_0x0006;
                case 14: goto L_0x0182;
                case 15: goto L_0x01d3;
                case 16: goto L_0x012a;
                case 17: goto L_0x01db;
                case 18: goto L_0x0379;
                case 19: goto L_0x0383;
                case 20: goto L_0x0006;
                case 21: goto L_0x0006;
                case 22: goto L_0x01fd;
                case 23: goto L_0x0229;
                case 24: goto L_0x024f;
                case 25: goto L_0x0142;
                case 26: goto L_0x0285;
                case 27: goto L_0x029c;
                case 28: goto L_0x02b2;
                case 29: goto L_0x02ca;
                case 30: goto L_0x0006;
                case 31: goto L_0x02e2;
                case 32: goto L_0x0399;
                case 33: goto L_0x02f8;
                case 34: goto L_0x030a;
                case 35: goto L_0x0006;
                case 36: goto L_0x0322;
                case 37: goto L_0x033e;
                case 38: goto L_0x03a6;
                case 39: goto L_0x0006;
                case 40: goto L_0x03b9;
                default: goto L_0x0006;
            }
        L_0x0006:
            super.A04(r11)
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r10.A00
            X.8Ta r2 = (X.C173788Ta) r2
            X.16D r0 = r2.A08
            X.141 r0 = r0.A0D(r11)
            X.2Lc r1 = new X.2Lc
            r1.<init>(r0)
            java.util.List r0 = r2.A0I
            boolean r0 = X.AnonymousClass141.A01(r1, r0)
            if (r0 == 0) goto L_0x0009
            X.7vb r0 = r2.A0O
            goto L_0x033a
        L_0x0025:
            java.lang.Object r1 = r10.A00
            com.whatsapp.calling.callhistory.CallLogActivity r1 = (com.whatsapp.calling.callhistory.CallLogActivity) r1
            X.11F r0 = r1.A0T
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0009
            com.whatsapp.calling.callhistory.CallLogActivity.A07(r1)
            return
        L_0x0035:
            java.lang.Object r2 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.String r0 = X.C36341k9.A0d(r2)
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.2EI r0 = r2.A0h
            r0.A0U()
            return
        L_0x004d:
            X.141 r0 = X.AnonymousClass22g.A07(r2, r11)
            X.2Lc r1 = new X.2Lc
            r1.<init>(r0)
            X.1nV r0 = r2.A0e
            if (r0 == 0) goto L_0x0009
            java.util.List r0 = r0.A02
            boolean r0 = X.AnonymousClass141.A01(r1, r0)
            if (r0 == 0) goto L_0x0009
            X.1nV r0 = r2.A0e
            goto L_0x033a
        L_0x0066:
            boolean r0 = X.AnonymousClass143.A0G(r11)
            if (r0 != 0) goto L_0x0009
            java.lang.Object r2 = r10.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r2 = (com.whatsapp.chatinfo.ListChatInfoActivity) r2
            X.141 r0 = X.AnonymousClass22g.A07(r2, r11)
            X.2Lc r1 = new X.2Lc
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A0h
            X.AnonymousClass141.A01(r1, r0)
            X.1nH r0 = r2.A08
            goto L_0x033a
        L_0x0082:
            boolean r0 = X.AnonymousClass143.A0G(r11)
            if (r0 == 0) goto L_0x0009
            java.lang.Object r5 = r10.A00
            com.whatsapp.community.EditCommunityActivity r5 = (com.whatsapp.community.EditCommunityActivity) r5
            com.whatsapp.jid.GroupJid r0 = r5.A07
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.1O7 r0 = r5.A03
            X.141 r1 = r5.A06
            X.16K r0 = r0.A03
            r0.A04(r1)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131167643(0x7f07099b, float:1.7949565E38)
            int r4 = r1.getDimensionPixelSize(r0)
            X.1RY r3 = r5.A04
            X.141 r2 = r5.A06
            android.widget.ImageView r1 = r5.A03
            r0 = 0
            r3.A0A(r1, r2, r4, r0)
            return
        L_0x00b3:
            java.lang.Object r1 = r10.A00
            X.3BL r1 = (X.AnonymousClass3BL) r1
            X.147 r0 = r1.A0D
            boolean r0 = X.AnonymousClass00C.A0J(r0, r11)
            if (r0 == 0) goto L_0x0009
            java.util.Iterator r3 = X.AnonymousClass3BL.A00(r1)
        L_0x00c3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r2 = r3.next()
            X.30n r2 = (X.C586530n) r2
            X.1uf r0 = r2.A00
            X.0wk r1 = r0.A0t
            r0 = 48
            X.C81323wp.A00(r1, r2, r0)
            goto L_0x00c3
        L_0x00d9:
            boolean r0 = X.AnonymousClass143.A0G(r11)
            if (r0 != 0) goto L_0x0009
            java.lang.Object r2 = r10.A00
            X.27v r2 = (X.AnonymousClass27v) r2
            X.16D r0 = r2.A09
            X.141 r1 = r0.A0D(r11)
            X.2Lc r0 = new X.2Lc
            r0.<init>(r1)
            r2.A3x(r0)
            return
        L_0x00f2:
            r3 = 0
            X.AnonymousClass00C.A0D(r11, r3)
            java.lang.Object r2 = r10.A00
            X.28d r2 = (X.AnonymousClass28d) r2
            X.11F r0 = r2.A0e
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.widget.ProgressBar r1 = r2.A09
            if (r1 != 0) goto L_0x0124
            android.view.ViewStub r0 = r2.A06
            if (r0 == 0) goto L_0x0119
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ProgressBar"
            X.AnonymousClass00C.A0E(r1, r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r2.A09 = r1
            if (r1 != 0) goto L_0x0124
        L_0x0119:
            android.widget.ImageView r0 = r2.A09()
            r0.setVisibility(r3)
            r2.A0H()
            return
        L_0x0124:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0119
        L_0x012a:
            java.lang.Object r1 = A01(r10, r11)
            X.1tR r1 = (X.C39731tR) r1
            X.147 r0 = r1.A01
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wU r3 = r1.A02
            r0 = 34
            X.3v4 r2 = X.C80233v4.A00(r1, r0)
            goto L_0x0298
        L_0x0142:
            if (r11 == 0) goto L_0x0009
            java.lang.Object r1 = r10.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.141 r0 = r1.A0Y
            if (r0 != 0) goto L_0x0153
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0153:
            X.11F r0 = r0.A0H
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0166
            X.2EJ r0 = r1.A0j
            if (r0 != 0) goto L_0x03cd
            java.lang.String r0 = "newsletterInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0166:
            boolean r0 = r11 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x016d
            X.3oA r1 = r1.A0u
            goto L_0x018c
        L_0x016d:
            boolean r0 = com.whatsapp.newsletter.NewsletterInfoActivity.A1D(r1)
            if (r0 == 0) goto L_0x0009
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r1 = r1.A0i
            if (r1 == 0) goto L_0x0009
            X.0wU r3 = r1.A0E
            r0 = 28
            X.74j r2 = new X.74j
            r2.<init>(r11, r1, r0)
            goto L_0x0298
        L_0x0182:
            boolean r0 = r11 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r10.A00
            X.2HH r0 = (X.AnonymousClass2HH) r0
            X.3oA r1 = r0.A02
        L_0x018c:
            if (r1 == 0) goto L_0x0009
            X.1Uw r6 = (X.C28981Uw) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.1wG r5 = r1.A04
            int r0 = r5.A00
            if (r0 > 0) goto L_0x0009
            java.util.List r0 = r5.A01
            r8 = 0
            java.util.Iterator r2 = r0.iterator()
        L_0x01a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r7 = r2.next()
            int r1 = r8 + 1
            if (r8 >= 0) goto L_0x01b4
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x01b4:
            X.3JI r7 = (X.AnonymousClass3JI) r7
            X.2La r0 = r7.A02
            X.1Uw r0 = r0.A0J()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x01d1
            X.0wU r1 = r5.A04
            r9 = 19
            X.3vW r4 = new X.3vW
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r0 = "RecommendedNewslettersAdapter/notifyItemChanged"
            r1.Bp6(r4, r0)
            return
        L_0x01d1:
            r8 = r1
            goto L_0x01a1
        L_0x01d3:
            java.lang.Object r0 = r10.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r0 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r0
            X.1nW r0 = r0.A0B
            goto L_0x033a
        L_0x01db:
            java.lang.Object r2 = r10.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            java.util.ArrayList r0 = r2.A0X
            java.util.Iterator r1 = r0.iterator()
        L_0x01e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r1.next()
            X.3IC r0 = (X.AnonymousClass3IC) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01e5
            android.widget.BaseAdapter r0 = r2.A01
            goto L_0x033a
        L_0x01fd:
            if (r11 == 0) goto L_0x0009
            boolean r0 = X.AnonymousClass143.A0G(r11)
            if (r0 != 0) goto L_0x0009
            java.lang.Object r2 = r10.A00
            com.whatsapp.group.GroupAdminPickerActivity r2 = (com.whatsapp.group.GroupAdminPickerActivity) r2
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r11)
            boolean r0 = com.whatsapp.group.GroupAdminPickerActivity.A0H(r2, r0)
            if (r0 == 0) goto L_0x0009
            X.16D r0 = r2.A06
            X.141 r0 = r0.A0D(r11)
            X.2Lc r1 = new X.2Lc
            r1.<init>(r0)
            java.util.List r0 = r2.A0M
            X.AnonymousClass141.A01(r1, r0)
            X.1vm r0 = r2.A0E
            r0.A06()
            return
        L_0x0229:
            boolean r0 = X.AnonymousClass143.A0G(r11)
            java.lang.Object r2 = r10.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            if (r0 == 0) goto L_0x03d1
            X.147 r0 = r2.A1Y
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r1 = r2.A06
            r0 = 8
            r1.setVisibility(r0)
            X.1O7 r0 = r2.A0k
            X.141 r1 = r2.A0y
            X.16K r0 = r0.A03
            r0.A04(r1)
            com.whatsapp.group.GroupChatInfoActivity.A1C(r2)
            return
        L_0x024f:
            java.lang.Object r2 = r10.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            com.whatsapp.jid.GroupJid r0 = r2.A14
            r1 = 0
            if (r0 == 0) goto L_0x0268
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0268
            androidx.fragment.app.DialogFragment r0 = r2.A08
            if (r0 == 0) goto L_0x0009
            r0.A1b()
            r2.A08 = r1
            return
        L_0x0268:
            X.0wQ r0 = r2.A0J
            r0.A0G()
            X.142 r0 = r0.A0E
            if (r0 == 0) goto L_0x0009
            if (r11 == 0) goto L_0x0009
            X.11F r0 = r0.A0H
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            androidx.fragment.app.DialogFragment r0 = r2.A09
            if (r0 == 0) goto L_0x0009
            r0.A1b()
            r2.A09 = r1
            return
        L_0x0285:
            boolean r0 = r11 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0009
            if (r11 == 0) goto L_0x0009
            java.lang.Object r1 = r10.A00
            X.14p r1 = (X.C224914p) r1
            X.0wU r3 = r1.A04
            r0 = 44
            X.74j r2 = new X.74j
            r2.<init>(r1, r11, r0)
        L_0x0298:
            r3.Bp1(r2)
            return
        L_0x029c:
            java.lang.Object r1 = r10.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            X.141 r0 = r1.A0l
            if (r0 == 0) goto L_0x0009
            if (r11 == 0) goto L_0x0009
            X.11F r0 = r0.A0H
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.whatsapp.notification.PopupNotification.A0K(r1)
            return
        L_0x02b2:
            java.lang.Object r1 = r10.A00
            com.whatsapp.profile.ProfileInfoActivity r1 = (com.whatsapp.profile.ProfileInfoActivity) r1
            X.141 r0 = r1.A0G
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.C36431kI.A1V(r1, r11)
            if (r0 == 0) goto L_0x0009
            X.142 r0 = X.C36431kI.A0V(r1)
            r1.A0G = r0
            com.whatsapp.profile.ProfileInfoActivity.A07(r1)
            return
        L_0x02ca:
            java.lang.Object r1 = r10.A00
            com.whatsapp.profile.ProfilePhotoReminder r1 = (com.whatsapp.profile.ProfilePhotoReminder) r1
            X.141 r0 = r1.A07
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.C36431kI.A1V(r1, r11)
            if (r0 == 0) goto L_0x0009
            X.142 r0 = X.C36431kI.A0V(r1)
            r1.A07 = r0
            com.whatsapp.profile.ProfilePhotoReminder.A01(r1)
            return
        L_0x02e2:
            java.lang.Object r3 = r10.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r3 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r3
            com.whatsapp.jid.UserJid r0 = r3.A0G
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.1RY r2 = r3.A09
            X.141 r1 = r3.A0E
            android.widget.ImageView r0 = r3.A01
            r2.A08(r0, r1)
            return
        L_0x02f8:
            java.lang.Object r1 = r10.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            X.141 r0 = r1.A0i
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.C36431kI.A1V(r1, r11)
            if (r0 == 0) goto L_0x0009
            com.whatsapp.registration.RegisterName.A0H(r1)
            return
        L_0x030a:
            java.lang.Object r1 = r10.A00
            com.whatsapp.settings.Settings r1 = (com.whatsapp.settings.Settings) r1
            X.141 r0 = r1.A0a
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.C36431kI.A1V(r1, r11)
            if (r0 == 0) goto L_0x0009
            X.142 r0 = X.C36431kI.A0V(r1)
            r1.A0a = r0
            com.whatsapp.settings.Settings.A0I(r1)
            return
        L_0x0322:
            java.lang.Object r2 = r10.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            boolean r0 = r11 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0009
            X.1nZ r0 = r2.A0o
            java.util.Map r1 = r0.A02
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r11)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0009
            X.1nZ r0 = r2.A0o
        L_0x033a:
            r0.notifyDataSetChanged()
            return
        L_0x033e:
            if (r11 == 0) goto L_0x0009
            java.lang.Object r1 = r10.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            com.whatsapp.jid.UserJid r0 = r1.A0R
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0B(r1)
            return
        L_0x0350:
            java.lang.Object r0 = r10.A00
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = (com.whatsapp.calling.callhistory.group.GroupCallLogActivity) r0
            X.1wT r0 = r0.A02
            X.C41011wT.A00(r0, r11)
            return
        L_0x035a:
            java.lang.Object r1 = A01(r10, r11)
            com.whatsapp.community.CommunityMembersViewModel r1 = (com.whatsapp.community.CommunityMembersViewModel) r1
            X.040 r4 = X.C109325Xd.A00(r1)
            X.02l r3 = r1.A0J
            r0 = 0
            com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onProfilePhotoChanged$1 r2 = new com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onProfilePhotoChanged$1
            r2.<init>(r1, r11, r0)
            goto L_0x03c9
        L_0x036d:
            java.lang.Object r0 = r10.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.0wU r1 = r0.A2L
            r0 = 12
            X.C80273v8.A00(r1, r10, r11, r0)
            return
        L_0x0379:
            java.lang.Object r0 = r10.A00
            X.2JG r0 = (X.AnonymousClass2JG) r0
            X.4V4 r0 = r0.A05
            r0.notifyDataSetChanged()
            return
        L_0x0383:
            java.lang.Object r1 = r10.A00
            X.1uL r1 = (X.C39951uL) r1
            X.11F r0 = r1.A01
            boolean r0 = X.C1901797e.A00(r11, r0)
            if (r0 == 0) goto L_0x0392
            r1.A0T()
        L_0x0392:
            X.1Rs r1 = r1.A0I
            r0 = 1
            X.C36341k9.A18(r1, r0)
            return
        L_0x0399:
            java.lang.Object r0 = r10.A00
            com.whatsapp.quickcontact.QuickContactActivity r0 = (com.whatsapp.quickcontact.QuickContactActivity) r0
            com.whatsapp.quickcontact.QuickContactActivity.A07(r0)
            X.3QZ r0 = r0.A0i
            r0.A04()
            return
        L_0x03a6:
            java.lang.Object r0 = A01(r10, r11)
            X.3PF r0 = (X.AnonymousClass3PF) r0
            X.1w5 r0 = r0.A01
            if (r0 != 0) goto L_0x03b5
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x03b5:
            r0.A0L(r11)
            return
        L_0x03b9:
            java.lang.Object r1 = A01(r10, r11)
            X.3OA r1 = (X.AnonymousClass3OA) r1
            X.040 r4 = r1.A0B
            X.02l r3 = r1.A0A
            r0 = 0
            com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1 r2 = new com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1
            r2.<init>(r11, r1, r0)
        L_0x03c9:
            X.C36381kD.A1R(r3, r2, r4)
            return
        L_0x03cd:
            r0.A0U()
            return
        L_0x03d1:
            X.141 r0 = X.AnonymousClass22g.A07(r2, r11)
            X.2Lc r1 = new X.2Lc
            r1.<init>(r0)
            X.1tr r0 = r2.A1H
            r0.A0T(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4W3.A04(X.11F):void");
    }

    public AnonymousClass4W3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static AnonymousClass4W3 A00(Object obj, int i) {
        return new AnonymousClass4W3(obj, i);
    }

    public void A05(AnonymousClass11F r3) {
        if (23 - this.A01 != 0) {
            super.A05(r3);
        } else if (AnonymousClass143.A0G(r3)) {
            GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
            if (r3.equals(groupChatInfoActivity.A1Y)) {
                groupChatInfoActivity.A06.setVisibility(0);
            }
        }
    }

    public void A06(UserJid userJid) {
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel;
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                C173788Ta r2 = (C173788Ta) this.A00;
                if (AnonymousClass141.A01(new C44102Ld(r2.A08.A0D(userJid)), r2.A0I)) {
                    baseAdapter = r2.A0O;
                    break;
                } else {
                    return;
                }
            case 1:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (callLogActivity.A0T.equals(userJid)) {
                    CallLogActivity.A07(callLogActivity);
                    return;
                }
                return;
            case 3:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (userJid.equals(C36431kI.A0l(C36341k9.A0d(contactInfoActivity)))) {
                    contactInfoActivity.A0h.A0U();
                    return;
                }
                return;
            case 4:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                if (!C36431kI.A1V(listChatInfoActivity, userJid)) {
                    AnonymousClass141.A01(new C44102Ld(AnonymousClass22g.A07(listChatInfoActivity, userJid)), listChatInfoActivity.A0h);
                    baseAdapter = listChatInfoActivity.A08;
                    break;
                } else {
                    return;
                }
            case 5:
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) this.A00;
                C36381kD.A1R(communityMembersViewModel.A0J, new CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1(communityMembersViewModel, userJid, (C023509x) null), C109325Xd.A00(communityMembersViewModel));
                return;
            case 9:
                C80273v8.A00(((ContactPickerFragment) this.A00).A2L, this, userJid, 13);
                return;
            case 10:
                AnonymousClass27v r22 = (AnonymousClass27v) this.A00;
                r22.A3x(new C44102Ld(r22.A09.A0D(userJid)));
                return;
            case 12:
                AnonymousClass28d r1 = (AnonymousClass28d) A01(this, userJid);
                if (userJid.equals(r1.A0e)) {
                    r1.A0B();
                    return;
                }
                return;
            case 19:
                C39951uL r12 = (C39951uL) this.A00;
                if (C1901797e.A00(userJid, r12.A01)) {
                    r12.A0T();
                    return;
                }
                return;
            case 22:
                if (userJid != null && !AnonymousClass143.A0G(userJid)) {
                    GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                    if (GroupAdminPickerActivity.A0H(groupAdminPickerActivity, userJid)) {
                        AnonymousClass141.A01(new C44102Ld(groupAdminPickerActivity.A06.A0D(userJid)), groupAdminPickerActivity.A0M);
                        groupAdminPickerActivity.A0E.A06();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                if (userJid != null) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                    if (C36431kI.A1V(groupChatInfoActivity, userJid)) {
                        baseAdapter = groupChatInfoActivity.A1C;
                        break;
                    } else {
                        groupChatInfoActivity.A1H.A0T(new C44102Ld(AnonymousClass22g.A07(groupChatInfoActivity, userJid)));
                        return;
                    }
                } else {
                    return;
                }
            case 25:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (!C36431kI.A1V(newsletterInfoActivity, userJid) && NewsletterInfoActivity.A1D(newsletterInfoActivity) && userJid != null && (newsletterInfoMembersListViewModel = newsletterInfoActivity.A0i) != null) {
                    newsletterInfoMembersListViewModel.A0E.Bp1(new C1502074j(userJid, newsletterInfoMembersListViewModel, 28));
                    return;
                }
                return;
            case 28:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                if (C36431kI.A1V(profileInfoActivity, userJid)) {
                    profileInfoActivity.A0M.setSubText(profileInfoActivity.A07.A00());
                    C64873Pt.A00(profileInfoActivity.A0P, 3, 2);
                    return;
                }
                return;
            case 30:
                SetAboutInfo setAboutInfo = (SetAboutInfo) this.A00;
                if (C36431kI.A1V(setAboutInfo, userJid)) {
                    String A002 = setAboutInfo.A01.A00();
                    if (setAboutInfo.A06) {
                        setAboutInfo.A06 = false;
                        Iterator it = SetAboutInfo.A0A.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                SetAboutInfo.A0A.add(0, A002);
                            } else if (AnonymousClass001.A0C(it).equals(A002)) {
                            }
                        }
                        SetAboutInfo.A01(setAboutInfo);
                    }
                    TextEmojiLabel textEmojiLabel = setAboutInfo.A02;
                    textEmojiLabel.setText(AnonymousClass3UG.A03(textEmojiLabel.getContext(), setAboutInfo.A02.getPaint(), setAboutInfo.A0C, A002));
                    setAboutInfo.A04.notifyDataSetInvalidated();
                    AnonymousClass3Y5.A00(setAboutInfo.A00, this, 37);
                    return;
                }
                return;
            case 34:
                Settings settings = (Settings) this.A00;
                if (C36431kI.A1V(settings, userJid) && !settings.A0D.A0E(4921)) {
                    settings.A0I.A0I(settings.A0F.A00());
                    return;
                }
                return;
            default:
                super.A06(userJid);
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0233, code lost:
        r2.Boy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0236, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d2, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.UserJid r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x01b9;
                case 1: goto L_0x01a9;
                case 2: goto L_0x021c;
                case 3: goto L_0x0179;
                case 4: goto L_0x015e;
                case 5: goto L_0x0206;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0226;
                case 10: goto L_0x01f3;
                case 11: goto L_0x0005;
                case 12: goto L_0x014c;
                case 13: goto L_0x0127;
                case 14: goto L_0x0005;
                case 15: goto L_0x011f;
                case 16: goto L_0x0005;
                case 17: goto L_0x00fd;
                case 18: goto L_0x01e9;
                case 19: goto L_0x00d0;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x00a8;
                case 23: goto L_0x008f;
                case 24: goto L_0x0005;
                case 25: goto L_0x0061;
                case 26: goto L_0x0005;
                case 27: goto L_0x0033;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0005;
                case 31: goto L_0x0005;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x001b;
                case 37: goto L_0x0009;
                case 38: goto L_0x01d6;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A07(r6)
        L_0x0008:
            return
        L_0x0009:
            if (r6 == 0) goto L_0x0008
            java.lang.Object r1 = r5.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            com.whatsapp.jid.UserJid r0 = r1.A0R
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0B(r1)
            return
        L_0x001b:
            java.lang.Object r2 = r5.A00
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            if (r6 == 0) goto L_0x0008
            X.1nZ r0 = r2.A0o
            java.util.Map r1 = r0.A02
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r6)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0008
            X.1nZ r0 = r2.A0o
            goto L_0x01d2
        L_0x0033:
            java.lang.Object r1 = r5.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            java.util.List r0 = r1.A1J
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0008
            X.3T1 r0 = r1.A16
            X.11F r0 = X.C64933Qa.A01(r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0057
            X.3T1 r0 = r1.A16
            X.11F r0 = r0.A0J()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
        L_0x0057:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r1.A10
            int r0 = r0.getCurrentItem()
            com.whatsapp.notification.PopupNotification.A0L(r1, r0)
            return
        L_0x0061:
            java.lang.Object r1 = r5.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.141 r0 = r1.A0Y
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0070:
            boolean r0 = X.C36411kG.A1V(r0, r6)
            if (r0 != 0) goto L_0x0008
            boolean r0 = com.whatsapp.newsletter.NewsletterInfoActivity.A1D(r1)
            if (r0 == 0) goto L_0x0008
            if (r6 == 0) goto L_0x0008
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r3 = r1.A0i
            if (r3 == 0) goto L_0x0008
            X.0wU r2 = r3.A0E
            r1 = 28
            X.74j r0 = new X.74j
            r0.<init>(r6, r3, r1)
            r2.Bp1(r0)
            return
        L_0x008f:
            boolean r0 = X.AnonymousClass143.A0G(r6)
            if (r0 != 0) goto L_0x0008
            java.lang.Object r2 = r5.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.141 r0 = X.AnonymousClass22g.A07(r2, r6)
            X.2Lb r1 = new X.2Lb
            r1.<init>(r0)
            X.1tr r0 = r2.A1H
            r0.A0T(r1)
            return
        L_0x00a8:
            if (r6 == 0) goto L_0x0008
            boolean r0 = X.AnonymousClass143.A0G(r6)
            if (r0 != 0) goto L_0x0008
            java.lang.Object r2 = r5.A00
            com.whatsapp.group.GroupAdminPickerActivity r2 = (com.whatsapp.group.GroupAdminPickerActivity) r2
            boolean r0 = com.whatsapp.group.GroupAdminPickerActivity.A0H(r2, r6)
            if (r0 == 0) goto L_0x0008
            X.16D r0 = r2.A06
            X.141 r0 = r0.A0D(r6)
            X.2Lb r1 = new X.2Lb
            r1.<init>(r0)
            java.util.List r0 = r2.A0M
            X.AnonymousClass141.A01(r1, r0)
            java.lang.String r0 = r2.A0I
            com.whatsapp.group.GroupAdminPickerActivity.A0G(r2, r0)
            return
        L_0x00d0:
            java.lang.Object r1 = r5.A00
            X.1uL r1 = (X.C39951uL) r1
            X.11F r0 = r1.A01
            boolean r0 = X.C1901797e.A00(r6, r0)
            if (r0 == 0) goto L_0x00df
            r1.A0T()
        L_0x00df:
            X.1sS r3 = r1.A09
            X.6tS r1 = r3.A01
            boolean r0 = r1 instanceof X.AnonymousClass28S
            if (r0 == 0) goto L_0x0008
            if (r6 == 0) goto L_0x0008
            X.28S r1 = (X.AnonymousClass28S) r1
            com.whatsapp.jid.UserJid r0 = r1.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.0wU r2 = r3.A0c
            r0 = 5
            X.3wc r1 = new X.3wc
            r1.<init>(r3, r6, r0)
            goto L_0x0233
        L_0x00fd:
            java.lang.Object r2 = r5.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            java.util.ArrayList r0 = r2.A0X
            java.util.Iterator r1 = r0.iterator()
        L_0x0107:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r1.next()
            X.3IC r0 = (X.AnonymousClass3IC) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0107
            android.widget.BaseAdapter r0 = r2.A01
            goto L_0x01d2
        L_0x011f:
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r0 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r0
            X.1nW r0 = r0.A0B
            goto L_0x01d2
        L_0x0127:
            if (r6 == 0) goto L_0x0008
            java.lang.Object r2 = r5.A00
            X.28f r2 = (X.AnonymousClass28f) r2
            X.11F r0 = r2.A0G
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.141 r0 = r2.A00
            boolean r1 = r0.A0C()
            X.AnonymousClass28f.A02(r2)
            X.141 r0 = r2.A00
            boolean r0 = r0.A0C()
            if (r1 == r0) goto L_0x0008
            X.01L r0 = r2.A05
            r0.invalidateOptionsMenu()
            return
        L_0x014c:
            java.lang.Object r1 = A01(r5, r6)
            X.28d r1 = (X.AnonymousClass28d) r1
            X.11F r0 = r1.A0e
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1.A0H()
            return
        L_0x015e:
            boolean r0 = X.AnonymousClass143.A0G(r6)
            if (r0 != 0) goto L_0x0008
            java.lang.Object r2 = r5.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r2 = (com.whatsapp.chatinfo.ListChatInfoActivity) r2
            X.141 r0 = X.AnonymousClass22g.A07(r2, r6)
            X.2Lb r1 = new X.2Lb
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A0h
            X.AnonymousClass141.A01(r1, r0)
            X.1nH r0 = r2.A08
            goto L_0x01d2
        L_0x0179:
            java.lang.Object r2 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.String r0 = X.C36341k9.A0d(r2)
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0191
            X.2EI r0 = r2.A0h
            r0.A0U()
            return
        L_0x0191:
            X.141 r0 = X.AnonymousClass22g.A07(r2, r6)
            X.2Lb r1 = new X.2Lb
            r1.<init>(r0)
            X.1nV r0 = r2.A0e
            if (r0 == 0) goto L_0x0008
            java.util.List r0 = r0.A02
            boolean r0 = X.AnonymousClass141.A01(r1, r0)
            if (r0 == 0) goto L_0x0008
            X.1nV r0 = r2.A0e
            goto L_0x01d2
        L_0x01a9:
            java.lang.Object r1 = r5.A00
            com.whatsapp.calling.callhistory.CallLogActivity r1 = (com.whatsapp.calling.callhistory.CallLogActivity) r1
            X.11F r0 = r1.A0T
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0008
            com.whatsapp.calling.callhistory.CallLogActivity.A07(r1)
            return
        L_0x01b9:
            java.lang.Object r2 = r5.A00
            X.8Ta r2 = (X.C173788Ta) r2
            X.16D r0 = r2.A08
            X.141 r0 = r0.A0D(r6)
            X.2Lb r1 = new X.2Lb
            r1.<init>(r0)
            java.util.List r0 = r2.A0I
            boolean r0 = X.AnonymousClass141.A01(r1, r0)
            if (r0 == 0) goto L_0x0008
            X.7vb r0 = r2.A0O
        L_0x01d2:
            r0.notifyDataSetChanged()
            return
        L_0x01d6:
            java.lang.Object r0 = A01(r5, r6)
            X.3PF r0 = (X.AnonymousClass3PF) r0
            X.1w5 r0 = r0.A01
            if (r0 != 0) goto L_0x01e5
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x01e5:
            r0.A0L(r6)
            return
        L_0x01e9:
            java.lang.Object r0 = r5.A00
            X.2JG r0 = (X.AnonymousClass2JG) r0
            X.4V4 r0 = r0.A05
            r0.notifyDataSetChanged()
            return
        L_0x01f3:
            java.lang.Object r2 = r5.A00
            X.27v r2 = (X.AnonymousClass27v) r2
            X.16D r0 = r2.A09
            X.141 r1 = r0.A0D(r6)
            X.2Lb r0 = new X.2Lb
            r0.<init>(r1)
            r2.A3x(r0)
            return
        L_0x0206:
            java.lang.Object r4 = A01(r5, r6)
            com.whatsapp.community.CommunityMembersViewModel r4 = (com.whatsapp.community.CommunityMembersViewModel) r4
            X.040 r3 = X.C109325Xd.A00(r4)
            X.02l r2 = r4.A0J
            r1 = 0
            com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onDisplayNameChanged$1 r0 = new com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onDisplayNameChanged$1
            r0.<init>(r4, r6, r1)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x021c:
            java.lang.Object r0 = r5.A00
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = (com.whatsapp.calling.callhistory.group.GroupCallLogActivity) r0
            X.1wT r0 = r0.A02
            X.C41011wT.A00(r0, r6)
            return
        L_0x0226:
            java.lang.Object r0 = r5.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.0wU r2 = r0.A2L
            r0 = 14
            X.3v8 r1 = new X.3v8
            r1.<init>(r5, r6, r0)
        L_0x0233:
            r2.Boy(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4W3.A07(com.whatsapp.jid.UserJid):void");
    }

    public void A08(UserJid userJid) {
        switch (this.A01) {
            case 3:
            case 9:
            case 10:
            case 19:
            case 23:
                A06(userJid);
                return;
            case 12:
                AnonymousClass28d r1 = (AnonymousClass28d) A01(this, userJid);
                if (userJid.equals(r1.A0e)) {
                    r1.A0I = r1.A0c.A01(userJid);
                    r1.A0B();
                    return;
                }
                return;
            case 34:
                Settings settings = (Settings) this.A00;
                if (C36431kI.A1V(settings, userJid) && settings.A0D.A0E(4921)) {
                    if (settings.A03 == null) {
                        Settings.A0G(settings);
                    }
                    settings.A0c.A01(settings.A0b.A00());
                    return;
                }
                return;
            default:
                super.A08(userJid);
                return;
        }
    }

    public void A09(Collection collection) {
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                baseAdapter = ((C173788Ta) this.A00).A0O;
                break;
            case 3:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                ContactInfoActivity.A0z(contactInfoActivity);
                ContactInfoActivity.A11(contactInfoActivity);
                return;
            case 9:
                ((ContactPickerFragment) this.A00).A1g();
                return;
            case 10:
                baseAdapter = ((AnonymousClass27v) this.A00).A01;
                break;
            case 19:
                for (Object next : collection) {
                    C39951uL r1 = (C39951uL) this.A00;
                    if (C1901797e.A00(next, r1.A01)) {
                        C36341k9.A18(r1.A0G, true);
                        return;
                    }
                }
                return;
            case 21:
                ChangeEphemeralSettingActivity changeEphemeralSettingActivity = (ChangeEphemeralSettingActivity) this.A00;
                AnonymousClass11F r12 = changeEphemeralSettingActivity.A0I;
                if ((r12 instanceof UserJid) && C36351kA.A1X(changeEphemeralSettingActivity.A03, r12) && !changeEphemeralSettingActivity.isFinishing()) {
                    AnonymousClass17Y r2 = changeEphemeralSettingActivity.A05;
                    int i = changeEphemeralSettingActivity.A01;
                    int i2 = R.string.f12nameremoved;
                    if (i == 0) {
                        i2 = R.string.f12nameremoved;
                    }
                    r2.A06(i2, 1);
                    changeEphemeralSettingActivity.finish();
                    return;
                }
                return;
            case 35:
                C81163wZ.A00(((C224914p) this.A00).A04, this, 37);
                return;
            default:
                super.A09(collection);
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public void A0A(Collection collection) {
        switch (this.A01) {
            case 1:
                CallLogActivity.A07((CallLogActivity) this.A00);
                return;
            case 6:
                ((C40021ub) this.A00).A0M.execute(new C80263v7(this, collection, 13));
                return;
            case 13:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F A0W = C36341k9.A0W(it);
                    if (A0W != null) {
                        AnonymousClass28f r1 = (AnonymousClass28f) this.A00;
                        if (A0W.equals(r1.A0G)) {
                            AnonymousClass28f.A02(r1);
                            r1.A05.invalidateOptionsMenu();
                            return;
                        }
                    }
                }
                return;
            case 20:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    AnonymousClass11F A0W2 = C36341k9.A0W(it2);
                    if (A0W2 != null) {
                        C39881u5 r3 = (C39881u5) this.A00;
                        if (A0W2.equals(r3.A00.A0H)) {
                            AnonymousClass1A5 r2 = r3.A01;
                            AnonymousClass11F r12 = r3.A00.A0H;
                            C222713q r0 = AnonymousClass11F.A00;
                            AnonymousClass141 A012 = r2.A01(C222713q.A00(r12));
                            r3.A00 = A012;
                            C28201Rs r13 = r3.A03;
                            AnonymousClass1EL r22 = r3.A02;
                            C36341k9.A19(r13, r22.A00(A012));
                            C36341k9.A19(r3.A04, r22.A00(r3.A00));
                        }
                    }
                }
                return;
            case 32:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                QuickContactActivity.A07(quickContactActivity);
                AnonymousClass3QZ.A01(quickContactActivity);
                return;
            case 39:
                ((AnonymousClass3OF) this.A00).A0G.Bp6(new C81203wd(this, collection, 41), "ug_names_populator");
                return;
            default:
                super.A0A(collection);
                return;
        }
    }

    public void A0B(Collection collection) {
        BaseAdapter baseAdapter;
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel;
        switch (this.A01) {
            case 0:
                C173788Ta.A0w((C173788Ta) this.A00);
                return;
            case 1:
                CallLogActivity.A07((CallLogActivity) this.A00);
                return;
            case 3:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A0h.A0U();
                contactInfoActivity.A1o();
                ContactInfoActivity.A16(contactInfoActivity, true, false);
                return;
            case 4:
                ListChatInfoActivity.A0w((ListChatInfoActivity) this.A00);
                return;
            case 8:
                if (collection != null) {
                    AnonymousClass3BL r1 = (AnonymousClass3BL) this.A00;
                    if (collection.contains(r1.A0D)) {
                        Iterator A002 = AnonymousClass3BL.A00(r1);
                        while (A002.hasNext()) {
                            C586530n r2 = (C586530n) A002.next();
                            C81323wp.A00(r2.A00.A0t, r2, 48);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (!ContactPickerFragment.A3r) {
                    ContactPickerFragment.A0G(contactPickerFragment);
                    return;
                }
                return;
            case 10:
                ((AnonymousClass27v) this.A00).A3q();
                return;
            case 11:
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = ((InviteNonWhatsAppContactPickerActivity) this.A00).A0E;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    throw C36331k8.A0a();
                }
                inviteNonWhatsAppContactPickerViewModel.A0L.clear();
                AnonymousClass08S r4 = inviteNonWhatsAppContactPickerViewModel.A09;
                C001700s r3 = inviteNonWhatsAppContactPickerViewModel.A0E;
                r4.A0E(r3);
                inviteNonWhatsAppContactPickerViewModel.A0J.A00(new AnonymousClass4ZI(inviteNonWhatsAppContactPickerViewModel, 2), r3, r4);
                return;
            case 12:
                ((AnonymousClass28d) this.A00).A0H();
                return;
            case 13:
                AnonymousClass28f.A02((AnonymousClass28f) this.A00);
                return;
            case 15:
                baseAdapter = ((MediaAlbumActivity) this.A00).A0B;
                break;
            case 17:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 18:
                ((AnonymousClass2JG) this.A00).A05.notifyDataSetChanged();
                return;
            case 19:
                C39951uL r0 = (C39951uL) this.A00;
                r0.A0T();
                C36341k9.A18(r0.A0H, true);
                return;
            case 22:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                GroupAdminPickerActivity.A0G(groupAdminPickerActivity, groupAdminPickerActivity.A0I);
                return;
            case 23:
                GroupChatInfoActivity.A14((GroupChatInfoActivity) this.A00);
                return;
            case 25:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (NewsletterInfoActivity.A1D(newsletterInfoActivity) && (newsletterInfoMembersListViewModel = newsletterInfoActivity.A0i) != null) {
                    newsletterInfoMembersListViewModel.A0S(C52172p0.SHORT);
                    return;
                }
                return;
            case 27:
                PopupNotification.A0F((PopupNotification) this.A00);
                return;
            case 36:
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (true) {
                        boolean z = false;
                        while (it.hasNext()) {
                            AnonymousClass11F A0a = C36401kF.A0a(it);
                            if (!z) {
                                StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                                if (!(A0a instanceof UserJid) || !statusesFragment.A0o.A02.containsKey(C36401kF.A0b(A0a))) {
                                }
                            }
                            z = true;
                        }
                        if (z) {
                            C38011nZ.A00((StatusesFragment) this.A00);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 37:
                StatusPlaybackContactFragment.A0B((StatusPlaybackContactFragment) this.A00);
                return;
            case 38:
                C40771w5 r02 = ((AnonymousClass3PF) this.A00).A01;
                if (r02 == null) {
                    throw C36331k8.A0Y();
                }
                r02.A06();
                return;
            default:
                super.A0B(collection);
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public void A0C(Collection collection) {
        switch (this.A01) {
            case 3:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (C36401kF.A1Y(contactInfoActivity.A0D)) {
                    contactInfoActivity.A0h.A0U();
                    contactInfoActivity.A1o();
                    return;
                }
                return;
            case 32:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                QuickContactActivity.A07(quickContactActivity);
                AnonymousClass3QZ.A01(quickContactActivity);
                return;
            default:
                super.A0C(collection);
                return;
        }
    }

    public void A0D(Collection collection) {
        if (5 - this.A01 != 0) {
            super.A0D(collection);
            return;
        }
        CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) A01(this, collection);
        C36381kD.A1R(communityMembersViewModel.A0J, new CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1(communityMembersViewModel, collection, (C023509x) null), C109325Xd.A00(communityMembersViewModel));
    }

    public static final void A02(AnonymousClass4W3 r5) {
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass3OF r3 = (AnonymousClass3OF) r5.A00;
        Set set = r3.A0H;
        synchronized (set) {
            A0I.addAll(set);
            set.clear();
            r3.A00 = Long.valueOf(SystemClock.uptimeMillis());
        }
        if (!A0I.isEmpty() && C36441kJ.A0n(r3.A02) != null) {
            r3.A0G.Bp6(new C81203wd(A0I, r3, 43), "ug_names_populator");
        }
    }
}
