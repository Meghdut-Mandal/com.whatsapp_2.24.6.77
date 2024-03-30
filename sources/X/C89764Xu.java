package X;

import android.widget.AdapterView;

/* renamed from: X.4Xu  reason: invalid class name and case insensitive filesystem */
public class C89764Xu implements AdapterView.OnItemLongClickListener {
    public Object A00;
    public final int A01;

    public C89764Xu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r0.A09 == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onItemLongClick(android.widget.AdapterView r12, android.view.View r13, int r14, long r15) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0081;
                case 2: goto L_0x00d7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            X.1nO r0 = r1.A0X
            int r0 = r0.getCount()
            if (r14 >= r0) goto L_0x011d
            X.1nO r0 = r1.A0X
            java.util.List r0 = r0.A00
            X.3T1 r0 = X.C36411kG.A0n(r0, r14)
            r1.A3j(r13, r0)
        L_0x001c:
            r0 = 1
            return r0
        L_0x001e:
            java.lang.Object r3 = r11.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            android.widget.ListView r0 = r3.A0D
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r0 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0032
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
        L_0x0032:
            X.2Gc r2 = (X.AnonymousClass2Gc) r2
            android.widget.ListView r0 = r3.A0D
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0045
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r0 = r1.getHeadersCount()
            int r14 = r14 - r0
        L_0x0045:
            if (r14 < 0) goto L_0x001c
            X.2Gc r0 = r3.A0v
            int r0 = r0.getCount()
            if (r14 >= r0) goto L_0x001c
            java.util.List r0 = r2.A02
            java.lang.Object r0 = r0.get(r14)
            X.4Ph r0 = (X.C87564Ph) r0
            X.141 r2 = r0.getContact()
            if (r2 == 0) goto L_0x011d
            boolean r0 = r2.A0z
            if (r0 == 0) goto L_0x011d
            X.3L0 r0 = r2.A0E
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.A09
            r1 = 1
            if (r0 != 0) goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            X.1NG r0 = r3.A0Z
            boolean r0 = X.C36331k8.A1Y(r0, r2)
            if (r0 != 0) goto L_0x011d
            if (r1 != 0) goto L_0x011d
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.PaymentContactPickerFragment
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaPaymentMerchantContactPickerFragment
            if (r0 != 0) goto L_0x001c
            com.whatsapp.contact.picker.ContactPickerFragment.A0E(r13, r3, r2)
            goto L_0x001c
        L_0x0081:
            java.lang.Object r7 = r11.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r7 = (com.whatsapp.documentpicker.DocumentPickerActivity) r7
            android.widget.ListView r0 = r7.getListView()
            int r0 = r0.getHeaderViewsCount()
            int r14 = r14 - r0
            r2 = 1
            if (r14 < 0) goto L_0x001c
            java.util.List r0 = r7.A0Q
            java.lang.Object r1 = r0.get(r14)
            X.3GY r1 = (X.AnonymousClass3GY) r1
            X.0V9 r0 = r7.A03
            if (r0 == 0) goto L_0x00a2
            com.whatsapp.documentpicker.DocumentPickerActivity.A0w(r1, r7)
            goto L_0x001c
        L_0x00a2:
            java.util.List r0 = r7.A0Y
            r0.clear()
            r0.add(r1)
            X.0yb r6 = r7.A08
            android.content.res.Resources r5 = r7.getResources()
            r4 = 2131755217(0x7f1000d1, float:1.9141307E38)
            int r3 = r0.size()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 0
            int r0 = r0.size()
            X.AnonymousClass000.A1L(r2, r0, r1)
            java.lang.String r0 = r5.getQuantityString(r4, r3, r2)
            X.C33521fV.A00(r7, r6, r0)
            X.09f r0 = r7.A0X
            X.0V9 r0 = r7.But(r0)
            r7.A03 = r0
            X.1nY r0 = r7.A0F
            r0.notifyDataSetChanged()
            goto L_0x001c
        L_0x00d7:
            java.lang.Object r4 = r11.A00
            com.whatsapp.status.StatusesFragment r4 = (com.whatsapp.status.StatusesFragment) r4
            java.lang.Object r3 = r13.getTag()
            X.1yu r3 = (X.C42491yu) r3
            X.01I r2 = r4.A0h()
            X.C18740tg.A06(r2)
            if (r3 == 0) goto L_0x011d
            com.whatsapp.jid.UserJid r1 = r3.A06
            X.13z r0 = X.C223613z.A00
            if (r1 == r0) goto L_0x011d
            X.01z r0 = r2.getSupportFragmentManager()
            boolean r0 = r0.A0r()
            if (r0 != 0) goto L_0x011d
            X.1CR r0 = r4.A0k
            X.C18740tg.A06(r1)
            boolean r0 = r0.A0l(r1)
            com.whatsapp.jid.UserJid r5 = r3.A06
            r6 = 0
            java.lang.String r9 = com.whatsapp.status.StatusesFragment.A03(r4)
            r10 = 1
            r8 = r6
            r7 = r6
            if (r0 == 0) goto L_0x0118
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = X.C55402uZ.A00(r5, r6, r7, r8, r9, r10)
        L_0x0113:
            X.AnonymousClass3LQ.A01(r0, r4)
            goto L_0x001c
        L_0x0118:
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = X.C55392uY.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0113
        L_0x011d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89764Xu.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }
}
