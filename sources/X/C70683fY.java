package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3fY  reason: invalid class name and case insensitive filesystem */
public abstract class C70683fY implements C88744Tw, C021809f {
    public AnonymousClass4Q1 A00;
    public C20810yC A01;
    public Integer A02;
    public final AnonymousClass155 A03;
    public final C31961cj A04 = new C31961cj();
    public final Context A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass171 A07;
    public final AnonymousClass3PH A08;
    public final AnonymousClass4Q2 A09;
    public final AnonymousClass3ID A0A;
    public final C18820ts A0B;
    public final AnonymousClass1H2 A0C;
    public final Map A0D = AnonymousClass001.A0J();

    public void A00() {
        MessageSelectionViewModel messageSelectionViewModel;
        AnonymousClass4W7 r0 = (AnonymousClass4W7) this;
        int i = r0.A01;
        Object obj = r0.A00;
        switch (i) {
            case 0:
                messageSelectionViewModel = ((MediaAlbumActivity) obj).A0A;
                break;
            case 1:
                messageSelectionViewModel = ((AnonymousClass2JG) obj).A08;
                break;
            case 2:
                messageSelectionViewModel = (MessageSelectionViewModel) ((ReportToAdminMessagesActivity) obj).A0C.getValue();
                break;
            case 3:
                messageSelectionViewModel = ((C70803fk) obj).A2e;
                break;
            case 4:
                ((MediaGalleryActivity) obj).B7Q();
                return;
            case 5:
                AnonymousClass0V9 r02 = ((MyStatusesActivity) obj).A00;
                if (r02 != null) {
                    r02.A05();
                    return;
                }
                return;
            default:
                ((StorageUsageGalleryActivity) obj).B7Q();
                return;
        }
        messageSelectionViewModel.A0S();
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r8) {
        AnonymousClass00C.A0D(menuItem, 1);
        Collection BHB = BHB();
        if (BHB != null && !BHB.isEmpty()) {
            if (!this.A09.B73(this.A00, BHB, menuItem.getItemId())) {
                return false;
            }
            C88784Ua A002 = this.A0A.A00(menuItem.getItemId());
            if (A002 != null && A002.BBr()) {
                A00();
            }
        }
        return true;
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r13) {
        AnonymousClass00C.A0D(menu, 1);
        if ((menu instanceof C016307a) && C36361kB.A1Y(this.A01)) {
            ((C016307a) menu).A0C = true;
        }
        AnonymousClass3PH r4 = this.A08;
        AnonymousClass3ID r3 = this.A0A;
        Set keySet = ((Map) r3.A00.getValue()).keySet();
        AnonymousClass00C.A0D(keySet, 0);
        Iterator it = AnonymousClass4YZ.A00(keySet, new AnonymousClass4NP(r4), 6).iterator();
        while (it.hasNext()) {
            int A0A2 = C36341k9.A0A(it);
            C88784Ua A002 = r3.A00(A0A2);
            if (A002 == null) {
                C18740tg.A0D(false, "Action id returned from repository provided a null action!");
            } else {
                String BIN = A002.BIN(this);
                AnonymousClass155 r1 = this.A03;
                MenuItem add = menu.add(0, A0A2, 0, AnonymousClass3UG.A05(r1, this.A0C, BIN));
                Drawable BCW = A002.BCW(r1, this.A0B);
                if (BCW != null) {
                    Integer num = this.A02;
                    if (num != null) {
                        BCW.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP);
                    }
                    add.setIcon(BCW);
                }
                Integer valueOf = Integer.valueOf(A0A2);
                Map map = this.A0D;
                AnonymousClass00C.A0B(add);
                map.put(valueOf, add);
                int ordinal = r4.A01(A0A2).ordinal();
                if (ordinal == 0) {
                    this.A04.A01.add(valueOf);
                } else if (ordinal == 2) {
                    this.A04.A00(A0A2);
                }
            }
        }
        return true;
    }

    public void BVS(AnonymousClass0V9 r7) {
        AnonymousClass4W7 r2 = (AnonymousClass4W7) this;
        switch (r2.A01) {
            case 0:
                Log.i("MediaAlbumActivity/onDestroyActionMode");
                break;
            case 1:
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(((AnonymousClass2JG) r2.A00).A3k());
                C36321k7.A1a(A0u, "/selectionended");
                break;
            case 2:
                AnonymousClass00C.A0D(r7, 0);
                break;
            case 3:
                break;
            case 4:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) r2.A00;
                C62473Gh r1 = mediaGalleryActivity.A0H;
                if (r1 != null) {
                    r1.A02();
                    mediaGalleryActivity.A0H = null;
                }
                mediaGalleryActivity.A05 = null;
                for (AnonymousClass02E r12 : mediaGalleryActivity.A2m()) {
                    if (r12 instanceof AnonymousClass4TA) {
                        ((AnonymousClass4TA) r12).Bg9();
                    }
                }
                return;
            case 5:
                MyStatusesActivity myStatusesActivity = (MyStatusesActivity) r2.A00;
                Set set = myStatusesActivity.A0y;
                set.clear();
                Map map = myStatusesActivity.A0x;
                set.addAll(map.keySet());
                Handler handler = myStatusesActivity.A0q;
                Runnable runnable = myStatusesActivity.A0t;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 200);
                map.clear();
                myStatusesActivity.A00 = null;
                myStatusesActivity.A0X.notifyDataSetChanged();
                return;
            default:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r2.A00;
                C62473Gh r13 = storageUsageGalleryActivity.A0D;
                if (r13 != null) {
                    r13.A02();
                    storageUsageGalleryActivity.A0D = null;
                }
                storageUsageGalleryActivity.A05 = null;
                StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = storageUsageGalleryActivity.A0O;
                if (storageUsageMediaGalleryFragment != null && storageUsageMediaGalleryFragment.A12()) {
                    storageUsageMediaGalleryFragment.A1b();
                    return;
                }
                return;
        }
        Log.i("conversation/selectionended");
        r2.A00();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BdJ(android.view.Menu r13, X.AnonymousClass0V9 r14) {
        /*
            r12 = this;
            r7 = 0
            boolean r6 = X.C36341k9.A1a(r14, r13)
            java.util.Collection r4 = r12.BHB()
            if (r4 == 0) goto L_0x01d0
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x01d0
            java.util.Collection r2 = r12.BHB()
            if (r2 == 0) goto L_0x0078
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0078
            java.util.Iterator r1 = r2.iterator()
            X.3T1 r1 = X.C36391kE.A0l(r1)
        L_0x0025:
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A08(r1)
            boolean r1 = X.C64933Qa.A04(r1)
            if (r1 == 0) goto L_0x0048
            X.0yC r2 = r12.A01
            if (r2 == 0) goto L_0x0048
            r1 = 6516(0x1974, float:9.131E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 != r6) goto L_0x0048
            X.1cj r2 = r12.A04
            r1 = 5
            r2.A00(r1)
            r1 = 34
            r2.A00(r1)
        L_0x0048:
            java.util.Map r1 = r12.A0D
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r1)
        L_0x004e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x007a
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r5)
            java.lang.Object r1 = r2.getKey()
            int r3 = X.AnonymousClass000.A0I(r1)
            java.lang.Object r2 = r2.getValue()
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            X.3ID r1 = r12.A0A
            X.4Ua r1 = r1.A00(r3)
            if (r1 == 0) goto L_0x0076
            boolean r1 = r1.BtJ(r4)
        L_0x0072:
            r2.setVisible(r1)
            goto L_0x004e
        L_0x0076:
            r1 = 0
            goto L_0x0072
        L_0x0078:
            r1 = 0
            goto L_0x0025
        L_0x007a:
            int r1 = r4.size()
            if (r1 != r6) goto L_0x00b7
            java.util.Collection r2 = r12.BHB()
            if (r2 == 0) goto L_0x0114
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0114
            java.util.Iterator r1 = r2.iterator()
            X.3T1 r3 = X.C36391kE.A0l(r1)
        L_0x0094:
            X.C18740tg.A06(r3)
            X.AnonymousClass00C.A08(r3)
            X.3Qa r2 = r3.A1J
            X.11F r1 = r2.A00
            boolean r1 = X.AnonymousClass143.A0G(r1)
            if (r1 == 0) goto L_0x00b7
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x00ad
            int r2 = r3.A0D
            r1 = 6
            if (r2 != r1) goto L_0x00b7
        L_0x00ad:
            r1 = 11
            r12.A01(r1)
            r1 = 15
            r12.A01(r1)
        L_0x00b7:
            r1 = 17
            r12.A01(r1)
            r1 = 30
            r12.A01(r1)
            X.0ts r1 = r12.A0B
            java.util.Locale r3 = X.C36401kF.A0x(r1)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r1 = r4.size()
            X.AnonymousClass000.A1L(r2, r1, r7)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            java.lang.String r1 = "%d"
            java.lang.String r1 = java.lang.String.format(r3, r1, r2)
            X.AnonymousClass00C.A08(r1)
            r14.A0B(r1)
            r8 = r12
            X.4W7 r8 = (X.AnonymousClass4W7) r8
            int r5 = r8.A01
            r0 = 6
            if (r0 != r5) goto L_0x0129
            java.lang.Object r4 = r8.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r4 = (com.whatsapp.storage.StorageUsageGalleryActivity) r4
            X.3Gh r1 = r4.A0D
            java.util.HashMap r1 = r1.A03
            java.util.Collection r1 = r1.values()
            java.util.HashMap r10 = X.AnonymousClass001.A0J()
            java.util.Iterator r9 = r1.iterator()
        L_0x00fc:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0117
            X.3T1 r2 = X.C36391kE.A0l(r9)
            boolean r1 = r2 instanceof X.AnonymousClass2bU
            if (r1 == 0) goto L_0x00fc
            X.2bU r2 = (X.AnonymousClass2bU) r2
            java.lang.String r3 = r2.A04
            long r1 = r2.A00
            X.C36421kH.A1K(r3, r10, r1)
            goto L_0x00fc
        L_0x0114:
            r3 = 0
            goto L_0x0094
        L_0x0117:
            java.util.Iterator r11 = X.C36391kE.A10(r10)
            r2 = 0
        L_0x011d:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x012b
            long r9 = X.C36391kE.A0D(r11)
            long r2 = r2 + r9
            goto L_0x011d
        L_0x0129:
            r1 = 0
            goto L_0x013c
        L_0x012b:
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0129
            X.0ts r4 = r4.A00
            r1 = 1
            android.util.Pair r1 = X.AnonymousClass3TF.A00(r4, r2, r1, r7)
            java.lang.Object r1 = r1.first
            java.lang.String r1 = (java.lang.String) r1
        L_0x013c:
            r14.A0A(r1)
            switch(r5) {
                case 2: goto L_0x014c;
                case 3: goto L_0x0169;
                default: goto L_0x0142;
            }
        L_0x0142:
            X.1cj r3 = r12.A04
            X.155 r2 = r12.A03
            X.0yC r1 = r12.A01
            r3.A01(r2, r13, r1)
            return r6
        L_0x014c:
            r1 = 2
            r13.removeItem(r1)
            r1 = 3
            r13.removeItem(r1)
            r1 = 24
            r13.removeItem(r1)
            r1 = 25
            r13.removeItem(r1)
            r1 = 19
            r13.removeItem(r1)
            r1 = 20
            r13.removeItem(r1)
            goto L_0x0142
        L_0x0169:
            java.lang.Object r5 = r8.A00
            X.3fk r5 = (X.C70803fk) r5
            r5.A21()
            X.4V6 r1 = r5.A2l
            X.3Gh r1 = r1.getSelectedMessages()
            if (r1 == 0) goto L_0x0142
            X.155 r2 = r8.A03
            int r1 = r13.size()
            if (r1 == 0) goto L_0x0142
            android.view.MenuItem r1 = r13.getItem(r7)
            int r1 = r1.getItemId()
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x0142
            android.view.ViewParent r1 = r2.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L_0x0142
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r1 = 2131431668(0x7f0b10f4, float:1.8485072E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x0142
            android.graphics.Rect r1 = X.AnonymousClass001.A06()
            r2.getGlobalVisibleRect(r1)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0142
            X.3NY r4 = r5.A2V
            X.11F r3 = r5.A45
            X.4V6 r1 = r5.A2l
            X.3Gh r2 = r1.getSelectedMessages()
            r1 = 2
            X.2Qw r2 = X.AnonymousClass3NY.A00(r2, r3, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.A04 = r1
            X.0yW r1 = r4.A00
            r1.Bly(r2)
            goto L_0x0142
        L_0x01d0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70683fY.BdJ(android.view.Menu, X.0V9):boolean");
    }

    public final void A01(int i) {
        C88784Ua A002;
        MenuItem menuItem = (MenuItem) C36371kC.A0r(this.A0D, i);
        if (menuItem != null && (A002 = this.A0A.A00(i)) != null) {
            menuItem.setTitle(AnonymousClass3UG.A05(this.A03.getBaseContext(), this.A0C, A002.BIN(this)));
        }
    }

    public C70683fY(AnonymousClass155 r2, AnonymousClass16D r3, AnonymousClass171 r4, AnonymousClass3PH r5, AnonymousClass4Q2 r6, AnonymousClass3ID r7, C18820ts r8, AnonymousClass1H2 r9) {
        C36321k7.A19(r9, r3, r4, r8);
        AnonymousClass00C.A0D(r7, 8);
        this.A03 = r2;
        this.A0C = r9;
        this.A06 = r3;
        this.A07 = r4;
        this.A0B = r8;
        this.A09 = r6;
        this.A08 = r5;
        this.A0A = r7;
        this.A05 = r2;
    }

    public String BBB() {
        AnonymousClass3T1 r1;
        UserJid A032;
        Collection BHB = BHB();
        if (BHB == null || BHB.isEmpty()) {
            r1 = null;
        } else {
            r1 = C36391kE.A0l(BHB.iterator());
        }
        if (r1 == null || (A032 = C20350xQ.A03(r1)) == null) {
            return null;
        }
        return C36381kD.A0v(this.A07, this.A06.A0D(A032));
    }

    public Context getContext() {
        return this.A05;
    }
}
