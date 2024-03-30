package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import com.whatsapp.stickers.store.StickerStoreActivity;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.4Xo  reason: invalid class name and case insensitive filesystem */
public class C89704Xo implements AnonymousClass02G {
    public Object A00;
    public final int A01;

    public C89704Xo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r4 = (com.whatsapp.notification.PopupNotification) r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcA(int r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x000f
            r5 = 1
            if (r7 != r5) goto L_0x0010
            java.lang.Object r0 = r6.A00
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            r0.A1M = r5
        L_0x000f:
            return
        L_0x0010:
            if (r7 != 0) goto L_0x000f
            java.lang.Object r4 = r6.A00
            com.whatsapp.notification.PopupNotification r4 = (com.whatsapp.notification.PopupNotification) r4
            java.lang.Integer r0 = r4.A1I
            if (r0 == 0) goto L_0x000f
            java.util.List r1 = r4.A1J
            int r0 = r0.intValue()
            r1.remove(r0)
            java.lang.Integer r0 = r4.A1I
            int r1 = r0.intValue()
            java.util.List r0 = r4.A1J
            int r0 = r0.size()
            if (r1 < r0) goto L_0x003e
            java.lang.Integer r0 = r4.A1I
            int r0 = r0.intValue()
            int r0 = r0 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A1I = r0
        L_0x003e:
            X.1zV r0 = r4.A0L
            r0.A09()
            com.whatsapp.notification.PopupNotificationViewPager r3 = r4.A10
            X.1zV r2 = r4.A0L
            java.lang.Integer r0 = r4.A1I
            int r1 = r0.intValue()
            r3.setAdapter(r2)
            r0 = 0
            r3.A0J(r1, r0)
            com.whatsapp.notification.PopupNotificationViewPager r0 = r4.A10
            int r0 = r0.getCurrentItem()
            com.whatsapp.notification.PopupNotification.A0L(r4, r0)
            java.util.List r0 = r4.A1J
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0068
            com.whatsapp.notification.PopupNotification.A0G(r4)
        L_0x0068:
            r0 = 0
            r4.A1I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89704Xo.BcA(int):void");
    }

    public void BcB(int i, float f, int i2) {
        if (1 - this.A01 == 0) {
            PopupNotification popupNotification = (PopupNotification) this.A00;
            if (popupNotification.A1M) {
                C36401kF.A1H(popupNotification, popupNotification.A13);
                C36391kE.A1P(popupNotification);
            }
        }
    }

    public void BcC(int i) {
        switch (this.A01) {
            case 0:
                CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this.A00;
                AnonymousClass9Y1 r3 = catalogMediaViewFragment.A04;
                if (r3 != null) {
                    C195209Sx r2 = new C195209Sx();
                    AnonymousClass9Y1 r1 = catalogMediaViewFragment.A04;
                    if (r1 != null) {
                        r2.A0A = r1.A02;
                        r2.A05 = Integer.valueOf(r1.A0C.get());
                        AnonymousClass9Y1 r12 = catalogMediaViewFragment.A04;
                        if (r12 != null) {
                            r2.A0D = r12.A00;
                            r2.A0E = r12.A01;
                            r2.A09 = C36441kJ.A0y(r12.A0D.getAndIncrement());
                            C36401kF.A1F(r2, 11);
                            C36411kG.A1G(r2, 30);
                            C207269up r0 = catalogMediaViewFragment.A03;
                            if (r0 == null) {
                                throw C36331k8.A0d("product");
                            }
                            r2.A0G = r0.A0F;
                            r2.A00 = catalogMediaViewFragment.A08;
                            r3.A03(r2);
                            return;
                        }
                        throw C36331k8.A0d("catalogAnalyticManager");
                    }
                    throw C36331k8.A0d("catalogAnalyticManager");
                }
                throw C36331k8.A0d("catalogAnalyticManager");
            case 1:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (popupNotification.A1I == null) {
                    PopupNotification.A0L(popupNotification, popupNotification.A10.getCurrentItem());
                    return;
                }
                return;
            case 2:
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this.A00;
                downloadableWallpaperPreviewActivity.A00.setEnabled(AnonymousClass000.A1Z(downloadableWallpaperPreviewActivity.A08, i));
                return;
            default:
                int i2 = 0;
                while (true) {
                    StickerStoreActivity stickerStoreActivity = (StickerStoreActivity) this.A00;
                    if (i2 < stickerStoreActivity.A04.A00.size()) {
                        StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) stickerStoreActivity.A04.A0M(i2);
                        boolean A1S = AnonymousClass000.A1S(i, i2);
                        RecyclerView recyclerView = stickerStoreTabFragment.A03;
                        if (recyclerView != null) {
                            recyclerView.setNestedScrollingEnabled(A1S);
                        }
                        if (A1S) {
                            String str = stickerStoreActivity.A07;
                            if (str != null) {
                                String A0k = AnonymousClass000.A0k(stickerStoreTabFragment);
                                if (!A0k.equals(str)) {
                                    boolean equals = StickerStoreMyTabFragment.class.getName().equals(A0k);
                                    AnonymousClass6O1 r32 = stickerStoreActivity.A03;
                                    int i3 = 7;
                                    int i4 = 2;
                                    if (equals) {
                                        i3 = 1;
                                        i4 = 24;
                                    }
                                    r32.A02(Integer.valueOf(i4), 7, i3);
                                }
                            }
                            stickerStoreActivity.A07 = AnonymousClass000.A0k(stickerStoreTabFragment);
                        }
                        i2++;
                    } else {
                        stickerStoreActivity.A00.requestLayout();
                        return;
                    }
                }
        }
    }
}
