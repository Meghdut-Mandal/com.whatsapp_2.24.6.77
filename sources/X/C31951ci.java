package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1ci  reason: invalid class name and case insensitive filesystem */
public class C31951ci implements C021809f {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public MenuItem A0E;
    public MenuItem A0F;
    public MenuItem A0G;
    public MenuItem A0H;
    public MenuItem A0I;
    public MenuItem A0J;
    public MenuItem A0K;
    public MenuItem A0L;
    public final C31961cj A0M = new C31961cj();
    public final /* synthetic */ ConversationsFragment A0N;

    public C31951ci(ConversationsFragment conversationsFragment) {
        this.A0N = conversationsFragment;
    }

    private void A00(boolean z) {
        String str;
        Intent A0x;
        ConversationsFragment conversationsFragment = this.A0N;
        AnonymousClass11F A062 = ConversationsFragment.A06(conversationsFragment);
        conversationsFragment.A2L = A062;
        C222813r r1 = UserJid.Companion;
        UserJid A002 = C222813r.A00(A062);
        ConversationsFragment.A0L(conversationsFragment, 2);
        if (A002 != null) {
            if (z) {
                str = "chat_list_block";
            } else {
                str = "chat_list_noinsub_block";
            }
            boolean A0O = conversationsFragment.A0t.A0O(A002);
            AnonymousClass16D r12 = conversationsFragment.A15;
            if (A0O) {
                AnonymousClass141 A0D2 = r12.A0D(A002);
                conversationsFragment.A0t.A0G(conversationsFragment.A0i(), A0D2, str, false);
                return;
            }
            AnonymousClass141 A0D3 = r12.A0D(A002);
            AnonymousClass01I A0i = conversationsFragment.A0i();
            if (A0D3.A0E()) {
                AnonymousClass3F2 r0 = new AnonymousClass3F2(A0i, A002, str);
                r0.A00 = true;
                r0.A03 = true;
                A0x = r0.A00();
            } else if (A0D3.A0C()) {
                A0x = AnonymousClass190.A0x(A0i, A002, str, false, true, false, false);
            } else {
                AnonymousClass3F5 B3t = conversationsFragment.A0u.B3t(A002, str);
                B3t.A04 = true;
                B3t.A05 = false;
                UserJid userJid = B3t.A07;
                boolean z2 = B3t.A02;
                int i = B3t.A01;
                BlockConfirmationDialogFragment.A03(userJid, B3t.A08, B3t.A00, i, z2, B3t.A03, true, false).A1f(conversationsFragment.A0k(), (String) null);
                return;
            }
            A0i.startActivity(A0x);
        }
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r15) {
        RecyclerView recyclerView;
        if ((menu instanceof C016307a) && AnonymousClass1MI.A02(this.A0N.A21, (C21000yV) null, 4497)) {
            ((C016307a) menu).A0C = true;
        }
        ConversationsFragment conversationsFragment = this.A0N;
        if (conversationsFragment.A2A.A00() && (recyclerView = conversationsFragment.A0G) != null) {
            recyclerView.setAlpha(0.5f);
        }
        C31961cj r7 = this.A0M;
        r7.A00.clear();
        this.A08 = menu.add(0, R.id.menuitem_conversations_pin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_pin);
        this.A0D = menu.add(0, R.id.menuitem_conversations_unpin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unpin);
        this.A02 = menu.add(0, R.id.menuitem_conversations_block_non_trusted, 0, (CharSequence) null).setIcon(AnonymousClass3UF.A02(conversationsFragment.A0a(), R.drawable.ic_spam_block, R.color.f6nameremoved));
        this.A0I = menu.add(0, R.id.menuitem_conversations_unblock_non_trusted, 0, (CharSequence) null).setIcon(AnonymousClass3UF.A02(conversationsFragment.A0a(), R.drawable.ic_spam_block, R.color.f6nameremoved));
        this.A05 = menu.add(0, R.id.menuitem_conversations_delete, 0, (CharSequence) null).setIcon(R.drawable.ic_action_delete);
        this.A07 = menu.add(0, R.id.menuitem_conversations_mute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_mute);
        this.A0C = menu.add(0, R.id.menuitem_conversations_unmute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unmute);
        MenuItem add = menu.add(0, R.id.menuitem_conversations_archive, 0, (CharSequence) null);
        this.A04 = add;
        boolean isVisible = add.isVisible();
        MenuItem menuItem = this.A04;
        if (isVisible) {
            menuItem.setIcon(AnonymousClass3UF.A02(conversationsFragment.A0a(), R.drawable.ic_action_archive, R.color.f6nameremoved));
        } else {
            menuItem.setIcon(R.drawable.ic_action_archive);
        }
        MenuItem add2 = menu.add(0, R.id.menuitem_conversations_unarchive, 0, (CharSequence) null);
        this.A0B = add2;
        boolean isVisible2 = add2.isVisible();
        MenuItem menuItem2 = this.A0B;
        if (isVisible2) {
            menuItem2.setIcon(AnonymousClass3UF.A02(conversationsFragment.A0a(), R.drawable.ic_action_unarchive, R.color.f6nameremoved));
        } else {
            menuItem2.setIcon(R.drawable.ic_action_unarchive);
        }
        this.A09 = menu.add(0, R.id.menuitem_conversations_overflow_menu_pin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_pin);
        this.A0E = menu.add(0, R.id.menuitem_conversations_overflow_menu_unpin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unpin);
        this.A06 = menu.add(0, R.id.menuitem_conversations_leave, 0, (CharSequence) null).setIcon(R.drawable.ic_exit_group);
        this.A01 = menu.add(0, R.id.menuitem_conversations_create_shortcuit, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_spam_add);
        this.A0L = menu.add(0, R.id.menuitem_conversations_contact_info, 0, R.string.f12nameremoved).setIcon(R.drawable.vec_ic_settings_contacts);
        this.A00 = menu.add(0, R.id.menuitem_conversations_add_new_contact, 0, R.string.f12nameremoved).setIcon(R.drawable.vec_ic_settings_contacts);
        this.A0A = menu.add(0, R.id.menuitem_conversations_mark_read, 0, R.string.f12nameremoved).setIcon(R.drawable.vec_ic_read);
        this.A0F = menu.add(0, R.id.menuitem_conversations_mark_unread, 0, R.string.f12nameremoved).setIcon(R.drawable.smart_filter_unread);
        this.A0H = menu.add(0, R.id.menuitem_conversations_select_all, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_select_all);
        this.A0K = menu.add(0, R.id.menuitem_conversations_unlock, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_chat_unlock_outline);
        this.A0G = menu.add(0, R.id.menuitem_conversations_lock, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_chat_lock_outline);
        this.A03 = menu.add(0, R.id.menuitem_conversations_block, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_spam_block);
        this.A0J = menu.add(0, R.id.menuitem_conversations_unblock, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_spam_block);
        this.A08.setShowAsAction(2);
        this.A0D.setShowAsAction(2);
        this.A04.setShowAsAction(2);
        this.A0B.setShowAsAction(2);
        this.A05.setShowAsAction(2);
        this.A07.setShowAsAction(2);
        this.A0C.setShowAsAction(2);
        this.A02.setShowAsAction(2);
        this.A0I.setShowAsAction(2);
        this.A09.setShowAsAction(8);
        this.A0E.setShowAsAction(8);
        this.A06.setShowAsAction(8);
        this.A01.setShowAsAction(8);
        this.A0L.setShowAsAction(8);
        this.A00.setShowAsAction(8);
        this.A0A.setShowAsAction(8);
        this.A0F.setShowAsAction(8);
        this.A0H.setShowAsAction(8);
        this.A0K.setShowAsAction(8);
        this.A0G.setShowAsAction(8);
        this.A03.setShowAsAction(8);
        this.A0J.setShowAsAction(8);
        r7.A00(R.id.menuitem_conversations_overflow_menu_pin);
        r7.A00(R.id.menuitem_conversations_overflow_menu_unpin);
        r7.A00(R.id.menuitem_conversations_leave);
        r7.A00(R.id.menuitem_conversations_create_shortcuit);
        r7.A00(R.id.menuitem_conversations_contact_info);
        r7.A00(R.id.menuitem_conversations_add_new_contact);
        r7.A00(R.id.menuitem_conversations_mark_read);
        r7.A00(R.id.menuitem_conversations_mark_unread);
        r7.A00(R.id.menuitem_conversations_select_all);
        r7.A00(R.id.menuitem_conversations_unlock);
        r7.A00(R.id.menuitem_conversations_lock);
        r7.A00(R.id.menuitem_conversations_block);
        r7.A00(R.id.menuitem_conversations_unblock);
        return true;
    }

    public void BVS(AnonymousClass0V9 r3) {
        RecyclerView recyclerView;
        ConversationsFragment conversationsFragment = this.A0N;
        ConversationsFragment.A0K(conversationsFragment, 2);
        conversationsFragment.A0E = null;
        ConversationsFragment.A0R(conversationsFragment, true);
        if (conversationsFragment.A2A.A00() && (recyclerView = conversationsFragment.A0G) != null) {
            recyclerView.setAlpha(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028b, code lost:
        if (r0 == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a1, code lost:
        if (((X.AnonymousClass1K3) r6.A2y.get()).BLB(r9) != false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a7, code lost:
        if (r11 == false) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02bd, code lost:
        if (r0 != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c3, code lost:
        if (r11 != false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e1, code lost:
        if (r6.A1y() == false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02eb, code lost:
        if (r6.A1y() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0382, code lost:
        if (r17 != false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03c2, code lost:
        if (r6.A1t() == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r3 != 1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0197, code lost:
        if (r6.A1v() == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a2, code lost:
        if (r6.A1v() == false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0207, code lost:
        if (r6.A1u() == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0211, code lost:
        if (r6.A1x() == false) goto L_0x0213;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03c6 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e3 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BdJ(android.view.Menu r26, X.AnonymousClass0V9 r27) {
        /*
            r25 = this;
            r7 = r25
            com.whatsapp.conversationslist.ConversationsFragment r6 = r7.A0N
            boolean r0 = r6.A12()
            r5 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "conversations/actionmode/fragment is not attached to activity."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r5
        L_0x0011:
            java.util.LinkedHashSet r0 = r6.A35
            r4 = 1
            r8 = r27
            if (r0 == 0) goto L_0x0483
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0483
            com.whatsapp.conversationslist.ConversationsFragment.A0R(r6, r5)
            java.util.LinkedHashSet r0 = r6.A35
            int r3 = r0.size()
            boolean r0 = r6.A3D
            if (r0 == 0) goto L_0x047f
            X.0wQ r0 = r6.A0f
            r0.A0G()
            X.142 r0 = r0.A0E
            if (r0 == 0) goto L_0x047f
            X.11F r1 = r0.A0H
            if (r1 == 0) goto L_0x047f
            java.util.LinkedHashSet r0 = r6.A35
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x047f
            r24 = 0
            r23 = 0
            if (r3 == r4) goto L_0x0048
        L_0x0046:
            r23 = 1
        L_0x0048:
            X.0ts r0 = r6.A1i
            android.content.Context r0 = r0.A00
            java.util.Locale r2 = X.C18820ts.A01(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r5] = r0
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            r8.A0B(r0)
            android.view.MenuItem r1 = r7.A04
            if (r3 != r4) goto L_0x0435
            r0 = 2131887191(0x7f120457, float:1.9408982E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0B
            r0 = 2131887199(0x7f12045f, float:1.9408998E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A05
            r0 = 2131887193(0x7f120459, float:1.9408986E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A06
            r0 = 2131887195(0x7f12045b, float:1.940899E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A08
            r0 = 2131887197(0x7f12045d, float:1.9408994E38)
            r2 = 2131887197(0x7f12045d, float:1.9408994E38)
            r1.setTitle(r0)
            android.view.MenuItem r0 = r7.A0D
            r1 = 2131887201(0x7f120461, float:1.9409002E38)
            r0.setTitle(r1)
            android.view.MenuItem r0 = r7.A09
            r0.setTitle(r2)
            android.view.MenuItem r0 = r7.A0E
            r0.setTitle(r1)
            android.view.MenuItem r1 = r7.A0K
            r0 = 2131887762(0x7f120692, float:1.941014E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0G
            r0 = 2131887761(0x7f120691, float:1.9410138E38)
        L_0x00ad:
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A07
            r0 = 2131890985(0x7f121329, float:1.9416677E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0C
            r0 = 2131891002(0x7f12133a, float:1.9416712E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A02
            r0 = 2131886899(0x7f120333, float:1.940839E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0I
            r0 = 2131895180(0x7f12238c, float:1.9425186E38)
            r1.setTitle(r0)
            java.util.List r0 = com.whatsapp.conversationslist.ConversationsFragment.A07(r6)
            if (r0 != 0) goto L_0x042f
            r0 = 0
        L_0x00d7:
            r9 = 0
            if (r3 >= r0) goto L_0x00db
            r9 = 1
        L_0x00db:
            r0 = 64
            r8 = 0
            if (r3 <= r0) goto L_0x00e1
            r8 = 1
        L_0x00e1:
            java.util.LinkedHashSet r0 = r6.A35
            int r0 = r0.size()
            r22 = 0
            if (r0 != r4) goto L_0x00ed
            r22 = 1
        L_0x00ed:
            java.util.LinkedHashSet r0 = r6.A35
            int r0 = r0.size()
            r10 = 0
            if (r0 != r4) goto L_0x00f7
            r10 = 1
        L_0x00f7:
            java.util.LinkedHashSet r0 = r6.A35
            boolean r1 = r6.A21(r0)
            java.util.LinkedHashSet r0 = r6.A35
            java.util.Iterator r21 = r0.iterator()
            r20 = 0
            r19 = 0
            r18 = 0
            r3 = 0
            r17 = 0
            r16 = 0
            r11 = 1
            r15 = 1
            r14 = 1
        L_0x0111:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r2 = r21.next()
            X.11F r2 = (X.AnonymousClass11F) r2
            X.16D r0 = r6.A15
            X.141 r12 = r0.A0D(r2)
            X.1A6 r0 = r6.A1F
            boolean r13 = r0.A0E(r2)
            boolean r0 = r2 instanceof X.AnonymousClass146
            if (r0 == 0) goto L_0x0139
            r8 = 1
            r22 = 0
            r10 = 0
            r1 = 0
            r18 = 1
            r17 = 1
            r16 = 1
            r11 = 0
        L_0x0139:
            X.3IL r0 = r12.A0F
            if (r0 != 0) goto L_0x0422
            X.11F r0 = r12.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 == 0) goto L_0x03c9
            android.view.MenuItem r1 = r7.A0L
            r0 = 2131890779(0x7f12125b, float:1.941626E38)
            r1.setTitle(r0)
            android.view.MenuItem r12 = r7.A0L
            android.content.Context r11 = r6.A0a()
            r1 = 2131232729(0x7f0807d9, float:1.8081575E38)
            X.0yC r0 = r6.A21
            boolean r0 = X.AnonymousClass1MI.A01(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A03(r11, r1, r0)
            r12.setIcon(r0)
            r22 = 0
            r1 = 0
        L_0x0164:
            r11 = 0
        L_0x0165:
            X.0xf r0 = r6.A22
            boolean r0 = X.AnonymousClass3M3.A01(r0, r2)
            if (r0 != 0) goto L_0x0175
            X.1CF r0 = r6.A2D
            boolean r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0176
        L_0x0175:
            r1 = 0
        L_0x0176:
            X.12q r0 = r6.A1l
            boolean r0 = r0.A0O(r2)
            r19 = r19 | r0
            X.12q r0 = r6.A1l
            boolean r0 = r0.A0N(r2)
            r0 = r0 ^ 1
            r18 = r18 | r0
            X.12q r0 = r6.A1l
            boolean r0 = r0.A0Q(r2)
            r20 = r20 | r0
            if (r20 == 0) goto L_0x0199
            boolean r12 = r6.A1v()
            r0 = 1
            if (r12 != 0) goto L_0x019a
        L_0x0199:
            r0 = 0
        L_0x019a:
            r5 = r5 | r0
            if (r20 != 0) goto L_0x01a4
            boolean r12 = r6.A1v()
            r0 = 1
            if (r12 != 0) goto L_0x01a5
        L_0x01a4:
            r0 = 0
        L_0x01a5:
            r3 = r3 | r0
            boolean r0 = r6.A3D
            if (r0 == 0) goto L_0x01b2
            X.0wQ r0 = r6.A0f
            boolean r0 = r0.A0M(r2)
            if (r0 != 0) goto L_0x01c4
        L_0x01b2:
            X.1CR r12 = r6.A2f
            java.lang.String r0 = r2.getRawString()
            X.3LI r0 = X.AnonymousClass1CR.A02(r12, r0)
            boolean r0 = r0.A0A()
            r0 = r0 ^ 1
            r17 = r17 | r0
        L_0x01c4:
            X.1CR r12 = r6.A2f
            java.lang.String r0 = r2.getRawString()
            X.3LI r0 = X.AnonymousClass1CR.A02(r12, r0)
            boolean r0 = r0.A0I
            r0 = r0 ^ 1
            r16 = r16 | r0
            X.12q r0 = r6.A1l
            int r2 = r0.A02(r2)
            r0 = 0
            if (r2 != 0) goto L_0x01de
            r0 = 1
        L_0x01de:
            r0 = r0 ^ 1
            r8 = r8 | r0
            if (r4 != 0) goto L_0x03c6
            if (r11 != 0) goto L_0x03c6
            if (r22 != 0) goto L_0x03c6
            if (r10 != 0) goto L_0x03c6
            if (r1 != 0) goto L_0x03c6
            if (r15 != 0) goto L_0x03c6
            if (r16 == 0) goto L_0x03c6
            if (r17 == 0) goto L_0x03c6
            if (r8 == 0) goto L_0x03c6
            if (r18 == 0) goto L_0x03c6
            r22 = 0
            r11 = 0
            r14 = 0
        L_0x01f9:
            r12 = r18 ^ 1
            if (r20 == 0) goto L_0x03bb
            r18 = 0
        L_0x01ff:
            r2 = 0
        L_0x0200:
            if (r18 == 0) goto L_0x0209
            boolean r0 = r6.A1u()
            r13 = 1
            if (r0 != 0) goto L_0x020a
        L_0x0209:
            r13 = 0
        L_0x020a:
            if (r12 == 0) goto L_0x0213
            boolean r0 = r6.A1x()
            r12 = 1
            if (r0 != 0) goto L_0x0214
        L_0x0213:
            r12 = 0
        L_0x0214:
            if (r19 == 0) goto L_0x0217
            r11 = 0
        L_0x0217:
            android.view.MenuItem r0 = r7.A05
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A06
            r0.setVisible(r11)
            android.view.MenuItem r0 = r7.A0H
            r0.setVisible(r9)
            android.view.MenuItem r0 = r7.A04
            r0.setVisible(r13)
            android.view.MenuItem r0 = r7.A0B
            r0.setVisible(r12)
            android.view.MenuItem r0 = r7.A0K
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0G
            r0.setVisible(r3)
            X.11F r3 = com.whatsapp.conversationslist.ConversationsFragment.A06(r6)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r9 = X.C222813r.A00(r3)
            if (r9 == 0) goto L_0x03b5
            X.0yC r3 = r6.A21
            r0 = 2290(0x8f2, float:3.209E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r4, r3, r0)
            if (r0 == 0) goto L_0x03b5
            X.16D r0 = r6.A15
            X.141 r3 = r0.A0D(r9)
            X.3L0 r0 = r3.A0E
            if (r0 == 0) goto L_0x026e
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x026e
            boolean r0 = r3.A0D()
            if (r0 != 0) goto L_0x026e
            boolean r0 = r3.A0E()
            if (r0 == 0) goto L_0x03b5
        L_0x026e:
            X.1NG r0 = r6.A0t
            boolean r12 = r0.A0O(r9)
            X.1C6 r0 = r6.A2k
            boolean r11 = r0.A0A(r9)
            X.0wQ r0 = r6.A0f
            boolean r0 = r0.A0M(r9)
            if (r0 == 0) goto L_0x028d
            X.0yC r3 = r6.A21
            r0 = 1967(0x7af, float:2.756E-42)
            boolean r0 = X.C20800yB.A01(r4, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x028e
        L_0x028d:
            r4 = 0
        L_0x028e:
            if (r12 != 0) goto L_0x02a3
            if (r11 == 0) goto L_0x02a3
            if (r4 != 0) goto L_0x02a3
            X.005 r0 = r6.A2y
            java.lang.Object r0 = r0.get()
            X.1K3 r0 = (X.AnonymousClass1K3) r0
            boolean r0 = r0.BLB(r9)
            r5 = 1
            if (r0 == 0) goto L_0x02a9
        L_0x02a3:
            r5 = 0
            if (r12 == 0) goto L_0x02a9
            r3 = 1
            if (r11 != 0) goto L_0x02bf
        L_0x02a9:
            r3 = 0
            if (r12 != 0) goto L_0x02bf
            if (r11 != 0) goto L_0x02bf
            if (r4 != 0) goto L_0x02bf
            X.005 r0 = r6.A2y
            java.lang.Object r0 = r0.get()
            X.1K3 r0 = (X.AnonymousClass1K3) r0
            boolean r0 = r0.BLB(r9)
            r9 = 1
            if (r0 == 0) goto L_0x02c5
        L_0x02bf:
            r9 = 0
            if (r12 == 0) goto L_0x02c5
            r4 = 1
            if (r11 == 0) goto L_0x02c6
        L_0x02c5:
            r4 = 0
        L_0x02c6:
            android.view.MenuItem r0 = r7.A03
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0J
            r0.setVisible(r3)
            android.view.MenuItem r0 = r7.A02
            r0.setVisible(r9)
            android.view.MenuItem r0 = r7.A0I
            r0.setVisible(r4)
            if (r16 == 0) goto L_0x02e3
            boolean r0 = r6.A1y()
            r5 = 1
            if (r0 != 0) goto L_0x02ed
        L_0x02e3:
            r5 = 0
            if (r16 != 0) goto L_0x02ed
            boolean r0 = r6.A1y()
            r3 = 1
            if (r0 != 0) goto L_0x02ee
        L_0x02ed:
            r3 = 0
        L_0x02ee:
            if (r9 != 0) goto L_0x039e
            if (r4 != 0) goto L_0x039e
            android.view.MenuItem r0 = r7.A08
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0D
            r0.setVisible(r3)
            android.view.MenuItem r0 = r7.A09
            r4 = 0
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0E
            r0.setVisible(r4)
        L_0x0307:
            if (r14 == 0) goto L_0x0359
            android.view.MenuItem r0 = r7.A07
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0C
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0A
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0F
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A04
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0B
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A08
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0D
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A09
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0E
        L_0x0338:
            r0.setVisible(r4)
        L_0x033b:
            android.view.MenuItem r0 = r7.A01
            r0.setVisible(r2)
            android.view.MenuItem r0 = r7.A0L
            r0.setVisible(r10)
            android.view.MenuItem r0 = r7.A00
            r0.setVisible(r1)
            X.1cj r2 = r7.A0M
            X.01I r1 = r6.A0h()
            X.0yC r0 = r6.A21
            r3 = r26
            r2.A01(r1, r3, r0)
            r0 = 1
            return r0
        L_0x0359:
            if (r15 == 0) goto L_0x036d
            android.view.MenuItem r0 = r7.A07
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0C
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0A
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0F
            goto L_0x0338
        L_0x036d:
            boolean r3 = r6.A1w()
            android.view.MenuItem r0 = r7.A07
            if (r3 == 0) goto L_0x0395
            if (r24 == 0) goto L_0x037a
            if (r17 == 0) goto L_0x037a
            r4 = 1
        L_0x037a:
            r0.setVisible(r4)
            android.view.MenuItem r3 = r7.A0C
            if (r23 == 0) goto L_0x0384
            r0 = 1
            if (r17 == 0) goto L_0x0385
        L_0x0384:
            r0 = 0
        L_0x0385:
            r3.setVisible(r0)
        L_0x0388:
            android.view.MenuItem r0 = r7.A0A
            r0.setVisible(r8)
            android.view.MenuItem r3 = r7.A0F
            r0 = r8 ^ 1
            r3.setVisible(r0)
            goto L_0x033b
        L_0x0395:
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0C
            r0.setVisible(r4)
            goto L_0x0388
        L_0x039e:
            r4 = 0
            android.view.MenuItem r0 = r7.A08
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A0D
            r0.setVisible(r4)
            android.view.MenuItem r0 = r7.A09
            r0.setVisible(r5)
            android.view.MenuItem r0 = r7.A0E
            r0.setVisible(r3)
            goto L_0x0307
        L_0x03b5:
            r9 = 0
            r4 = 0
            r5 = 0
            r3 = 0
            goto L_0x02c6
        L_0x03bb:
            if (r22 == 0) goto L_0x01ff
            boolean r0 = r6.A1t()
            r2 = 1
            if (r0 != 0) goto L_0x0200
            goto L_0x01ff
        L_0x03c6:
            r14 = 0
            goto L_0x0111
        L_0x03c9:
            boolean r0 = r12.A0G()
            if (r0 == 0) goto L_0x0420
            android.view.MenuItem r12 = r7.A0L
            X.1LV r1 = r6.A10
            r0 = r2
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r1 = r1.A0H(r0)
            r0 = 2131890172(0x7f120ffc, float:1.9415028E38)
            if (r1 == 0) goto L_0x03e2
            r0 = 2131886486(0x7f120196, float:1.9407552E38)
        L_0x03e2:
            r12.setTitle(r0)
            android.view.MenuItem r13 = r7.A0L
            android.content.Context r12 = r6.A0a()
            r1 = 2131232729(0x7f0807d9, float:1.8081575E38)
            X.0yC r0 = r6.A21
            boolean r0 = X.AnonymousClass1MI.A01(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A03(r12, r1, r0)
            r13.setIcon(r0)
            X.0xQ r1 = r6.A24
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r0 = X.C65533Sl.A03(r2)
            boolean r0 = r1.A0q(r0)
            if (r0 != 0) goto L_0x040f
            r4 = 0
        L_0x040a:
            r11 = 0
        L_0x040b:
            r1 = 0
            r15 = 0
            goto L_0x0165
        L_0x040f:
            X.17X r1 = r6.A1q
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass6SZ.A00(r2)
            X.C18740tg.A06(r0)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x040a
            r4 = 0
            goto L_0x040b
        L_0x0420:
            r10 = 0
            goto L_0x042c
        L_0x0422:
            android.view.MenuItem r1 = r7.A0L
            r0 = 2131895674(0x7f12257a, float:1.9426188E38)
            r1.setTitle(r0)
            r4 = r4 & r13
            r1 = 0
        L_0x042c:
            r15 = 0
            goto L_0x0164
        L_0x042f:
            int r0 = r0.size()
            goto L_0x00d7
        L_0x0435:
            r0 = 2131887190(0x7f120456, float:1.940898E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0B
            r0 = 2131887198(0x7f12045e, float:1.9408996E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A05
            r0 = 2131887192(0x7f120458, float:1.9408984E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A06
            r0 = 2131887194(0x7f12045a, float:1.9408988E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A08
            r0 = 2131887196(0x7f12045c, float:1.9408992E38)
            r2 = 2131887196(0x7f12045c, float:1.9408992E38)
            r1.setTitle(r0)
            android.view.MenuItem r0 = r7.A0D
            r1 = 2131887200(0x7f120460, float:1.9409E38)
            r0.setTitle(r1)
            android.view.MenuItem r0 = r7.A09
            r0.setTitle(r2)
            android.view.MenuItem r0 = r7.A0E
            r0.setTitle(r1)
            android.view.MenuItem r1 = r7.A0K
            r0 = 2131887760(0x7f120690, float:1.9410136E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r7.A0G
            r0 = 2131887759(0x7f12068f, float:1.9410134E38)
            goto L_0x00ad
        L_0x047f:
            r24 = 1
            goto L_0x0046
        L_0x0483:
            com.whatsapp.conversationslist.ConversationsFragment.A0R(r6, r4)
            r8.A05()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31951ci.BdJ(android.view.Menu, X.0V9):boolean");
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r17) {
        C19770wU r3;
        Runnable r1;
        AbstractCollection linkedHashSet;
        int i;
        C53502rQ r32;
        C53502rQ r2;
        Object tag;
        Intent A0q;
        AnonymousClass147 r12;
        AnonymousClass147 A022;
        Collection collection;
        int itemId = menuItem.getItemId();
        ConversationsFragment conversationsFragment = this.A0N;
        AnonymousClass1AO r33 = conversationsFragment.A0y;
        int i2 = 5;
        if (conversationsFragment.A35.size() == 1) {
            i2 = 1;
        }
        r33.A01 = i2;
        if (itemId == R.id.menuitem_conversations_archive) {
            linkedHashSet = new ArrayList(conversationsFragment.A35);
            ConversationsFragment.A0L(conversationsFragment, 0);
            if (!linkedHashSet.isEmpty()) {
                r3 = conversationsFragment.A2u;
                i = 20;
            }
            return true;
        }
        if (itemId == R.id.menuitem_conversations_unarchive) {
            ArrayList arrayList = new ArrayList(conversationsFragment.A35);
            ConversationsFragment.A0L(conversationsFragment, 0);
            ListView listView = conversationsFragment.A0A;
            if (listView != null) {
                listView.post(new C35681j5(this, arrayList, 21));
            }
            if (conversationsFragment.A1h.A2F()) {
                int size = arrayList.size();
                conversationsFragment.A1q(conversationsFragment.A0a().getResources().getQuantityString(R.plurals.f10nameremoved, size, new Object[]{Integer.valueOf(size)}), conversationsFragment.A0n(R.string.f12nameremoved), new C35151iE(this, arrayList, 5));
                return true;
            }
        } else if (itemId == R.id.menuitem_conversations_delete) {
            AnonymousClass11F A062 = ConversationsFragment.A06(conversationsFragment);
            conversationsFragment.A2L = A062;
            if (A062 != null) {
                C33411fH r22 = conversationsFragment.A1S;
                r22.A07.A01(A062, new C79213tM(conversationsFragment.A0M, r22, A062));
                return true;
            }
            AnonymousClass01z r13 = conversationsFragment.A0M;
            if (!(r13 == null || conversationsFragment.A35.size() == 0)) {
                C79203tL r5 = new C79203tL(r13, this);
                C33051ed r4 = conversationsFragment.A2p;
                C50222kP r23 = new C50222kP(r4.A02, (C88654Tn) r5, (Set) conversationsFragment.A35);
                r4.A03.Box(r23, new Void[0]);
                r4.A00.A0I(new C35771jE(r23, r5, 17), 500);
                return true;
            }
        } else if (itemId == R.id.menuitem_conversations_leave) {
            AnonymousClass01z r6 = conversationsFragment.A0M;
            if (r6 != null) {
                ProgressDialogFragment A032 = ProgressDialogFragment.A03(R.string.f12nameremoved, R.string.f12nameremoved);
                A032.A1f(r6, "count_progress");
                LinkedHashSet linkedHashSet2 = conversationsFragment.A35;
                Parcelable.Creator creator = AnonymousClass147.CREATOR;
                AnonymousClass00C.A0D(linkedHashSet2, 0);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = linkedHashSet2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof AnonymousClass147) {
                        arrayList2.add(next);
                    }
                }
                Set A0f = C007103b.A0f(arrayList2);
                C19770wU r14 = conversationsFragment.A2u;
                AnonymousClass1YR r10 = conversationsFragment.A1w;
                r14.Box(new C49422j5(new AnonymousClass4ZJ(r6, A032, A0f, 0), conversationsFragment, conversationsFragment.A10, r10, A0f), new Object[0]);
                return true;
            }
        } else if (itemId == R.id.menuitem_conversations_mute) {
            AnonymousClass11F A063 = ConversationsFragment.A06(conversationsFragment);
            conversationsFragment.A2L = A063;
            if (A063 != null) {
                collection = Collections.singleton(A063);
            } else {
                collection = conversationsFragment.A35;
            }
            AnonymousClass3RD.A02(C51992oi.CHAT_LIST_SCREEN, collection).A1f(conversationsFragment.A0l(), (String) null);
            return true;
        } else if (itemId == R.id.menuitem_conversations_unmute) {
            linkedHashSet = new LinkedHashSet(conversationsFragment.A35);
            ConversationsFragment.A0L(conversationsFragment, 1);
            r3 = conversationsFragment.A2u;
            i = 18;
        } else if (itemId == R.id.menuitem_conversations_block_non_trusted || itemId == R.id.menuitem_conversations_unblock_non_trusted) {
            A00(false);
            return true;
        } else if (itemId == R.id.menuitem_conversations_block || itemId == R.id.menuitem_conversations_unblock) {
            A00(true);
            return true;
        } else if (itemId == R.id.menuitem_conversations_pin || itemId == R.id.menuitem_conversations_overflow_menu_pin) {
            HashSet hashSet = new HashSet(conversationsFragment.A35);
            Set A0X = conversationsFragment.A2f.A0X();
            hashSet.removeAll(A0X);
            int size2 = hashSet.size();
            if (A0X.size() + size2 > 3) {
                conversationsFragment.A1P.A00(A0X);
                return true;
            }
            ConversationsFragment.A0L(conversationsFragment, 1);
            r3 = conversationsFragment.A2u;
            r1 = new C35261iP((Object) this, size2, 14, (Object) hashSet);
            r3.Boy(r1);
        } else if (itemId == R.id.menuitem_conversations_unpin || itemId == R.id.menuitem_conversations_overflow_menu_unpin) {
            linkedHashSet = new LinkedHashSet(conversationsFragment.A35);
            ConversationsFragment.A0L(conversationsFragment, 1);
            r3 = conversationsFragment.A2u;
            i = 19;
        } else if (itemId == R.id.menuitem_conversations_create_shortcuit) {
            AnonymousClass11F A064 = ConversationsFragment.A06(conversationsFragment);
            conversationsFragment.A2L = A064;
            if (A064 != null) {
                conversationsFragment.A0j.A05(conversationsFragment.A15.A0D(A064));
            }
            ConversationsFragment.A0L(conversationsFragment, 2);
            return true;
        } else {
            if (itemId == R.id.menuitem_conversations_contact_info) {
                AnonymousClass11F A065 = ConversationsFragment.A06(conversationsFragment);
                conversationsFragment.A2L = A065;
                if (A065 != null) {
                    AnonymousClass141 A0D2 = conversationsFragment.A15.A0D(A065);
                    ConversationsFragment.A0L(conversationsFragment, 2);
                    if (A0D2.A0F != null) {
                        AnonymousClass01I A0i = conversationsFragment.A0i();
                        A0i.startActivity(conversationsFragment.A2G.A1X(A0i, A0D2, 12));
                        return true;
                    }
                    boolean z = A0D2.A0H instanceof C177618e5;
                    AnonymousClass01I A0i2 = conversationsFragment.A0i();
                    if (z) {
                        A0q = AnonymousClass190.A0p(A0i2, A0D2.A0H, true);
                    } else if (!A0D2.A0G() || (r12 = (AnonymousClass147) A0D2.A06(AnonymousClass147.class)) == null || (A022 = conversationsFragment.A10.A02(r12)) == null || !conversationsFragment.A1l.A0O(r12)) {
                        A0q = AnonymousClass190.A0q(A0i2, A0D2.A0H, true, false, true);
                        AnonymousClass3M9.A01(A0q, A0i2.getClass().getSimpleName());
                    } else {
                        conversationsFragment.A11.Bkz(A0i2, A0i2.findViewById(16908290), A022);
                        return true;
                    }
                    C05290Pd.A00(A0i2, A0q, (Bundle) null);
                    return true;
                }
            } else if (itemId == R.id.menuitem_conversations_add_new_contact) {
                AnonymousClass11F A066 = ConversationsFragment.A06(conversationsFragment);
                conversationsFragment.A2L = A066;
                if (A066 != null) {
                    AnonymousClass141 A0D3 = conversationsFragment.A15.A0D(A066);
                    CreateOrAddToContactsDialog.A03(A0D3, conversationsFragment.A0f.A0M(A0D3.A0H)).A1f(conversationsFragment.A0k(), (String) null);
                    return true;
                }
            } else {
                if (itemId == R.id.menuitem_conversations_mark_read) {
                    Iterator it2 = conversationsFragment.A35.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass11F r102 = (AnonymousClass11F) it2.next();
                        if (!(r102 instanceof AnonymousClass146)) {
                            conversationsFragment.A1E.A02(r102, 3, true, true, true);
                            conversationsFragment.A2Q.A09();
                        }
                    }
                } else if (itemId == R.id.menuitem_conversations_mark_unread) {
                    Iterator it3 = conversationsFragment.A35.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass11F r15 = (AnonymousClass11F) it3.next();
                        if (!(r15 instanceof C177618e5) && !(r15 instanceof AnonymousClass146)) {
                            conversationsFragment.A1E.A03(r15, true);
                        }
                    }
                } else if (itemId == R.id.menuitem_conversations_select_all) {
                    conversationsFragment.A37.clear();
                    if (conversationsFragment.A0A != null) {
                        for (int i3 = 0; i3 < conversationsFragment.A0A.getChildCount(); i3++) {
                            View childAt = conversationsFragment.A0A.getChildAt(i3);
                            if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof ViewHolder))) {
                                ViewHolder viewHolder = (ViewHolder) tag;
                                AnonymousClass11F BDC = viewHolder.A01.BDC();
                                if (!conversationsFragment.A35.contains(BDC)) {
                                    conversationsFragment.A35.add(BDC);
                                    viewHolder.A0H(false, 2);
                                    viewHolder.A0J(true, true);
                                }
                            }
                        }
                    }
                    List<AnonymousClass7gQ> A072 = ConversationsFragment.A07(conversationsFragment);
                    if (A072 != null) {
                        for (AnonymousClass7gQ BDC2 : A072) {
                            AnonymousClass11F BDC3 = BDC2.BDC();
                            if (!conversationsFragment.A35.contains(BDC3) && !(BDC3 instanceof AnonymousClass146)) {
                                conversationsFragment.A35.add(BDC3);
                            }
                        }
                    }
                    if (conversationsFragment.A0E != null) {
                        int size3 = conversationsFragment.A35.size();
                        conversationsFragment.A0E.A0B(String.format(C18820ts.A01(conversationsFragment.A1i.A00), "%d", new Object[]{Integer.valueOf(size3)}));
                        conversationsFragment.A0E.A06();
                    }
                    if (!conversationsFragment.A35.isEmpty()) {
                        C33521fV.A00(conversationsFragment.A0i(), conversationsFragment.A1d, conversationsFragment.A0a().getResources().getQuantityString(R.plurals.f10nameremoved, conversationsFragment.A35.size(), new Object[]{Integer.valueOf(conversationsFragment.A35.size())}));
                        return true;
                    }
                } else if (itemId == R.id.menuitem_conversations_unlock) {
                    conversationsFragment.A2L = ConversationsFragment.A06(conversationsFragment);
                    ((C235718z) conversationsFragment.A32.get()).A00 = true;
                    if (conversationsFragment.A0h() instanceof AnonymousClass155) {
                        C235718z r42 = (C235718z) conversationsFragment.A32.get();
                        AnonymousClass155 r34 = (AnonymousClass155) conversationsFragment.A0h();
                        AnonymousClass11F r0 = conversationsFragment.A2L;
                        if (r0 != null) {
                            r2 = new AnonymousClass2EK(r0);
                        } else {
                            r2 = new AnonymousClass2EL(conversationsFragment.A35);
                        }
                        r42.A0A(r34, r2, conversationsFragment.A3V, 4);
                        return true;
                    }
                } else if (itemId == R.id.menuitem_conversations_lock) {
                    conversationsFragment.A2L = ConversationsFragment.A06(conversationsFragment);
                    if (conversationsFragment.A0h() instanceof AnonymousClass155) {
                        AnonymousClass11F r52 = null;
                        LinkedHashSet linkedHashSet3 = conversationsFragment.A35;
                        if (linkedHashSet3.iterator().hasNext()) {
                            r52 = (AnonymousClass11F) linkedHashSet3.iterator().next();
                        }
                        C235718z r16 = (C235718z) conversationsFragment.A32.get();
                        AnonymousClass155 r24 = (AnonymousClass155) conversationsFragment.A0h();
                        AnonymousClass11F r02 = conversationsFragment.A2L;
                        if (r02 != null) {
                            r32 = new AnonymousClass2EM(r02);
                        } else {
                            r32 = new AnonymousClass2EN(conversationsFragment.A35);
                        }
                        r16.A0C(r24, r32, conversationsFragment.A3W, r52, 1);
                        return true;
                    }
                } else if (conversationsFragment.A0I.A05()) {
                    conversationsFragment.A0U.A02();
                    throw new NullPointerException("getMenuItemChatAssignmentId");
                }
                ConversationsFragment.A0L(conversationsFragment, 1);
                return true;
            }
            return false;
        }
        return true;
        r1 = new C35681j5(this, linkedHashSet, i);
        r3.Boy(r1);
        return true;
    }
}
