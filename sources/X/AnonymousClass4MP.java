package X;

import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.4MP  reason: invalid class name */
public final class AnonymousClass4MP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass4SY $onQueryTextChangeListener;
    public final /* synthetic */ WDSSearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MP(AnonymousClass4SY r2, WDSSearchView wDSSearchView) {
        super(1);
        this.this$0 = wDSSearchView;
        this.$onQueryTextChangeListener = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            if (r16 == 0) goto L_0x0008
            java.lang.String r4 = r16.toString()
            if (r4 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r4 = ""
        L_0x000a:
            com.whatsapp.wds.components.search.WDSSearchView r0 = r15.this$0
            java.lang.String r0 = r0.A04
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 != 0) goto L_0x0039
            com.whatsapp.wds.components.search.WDSSearchView r0 = r15.this$0
            r0.A04 = r4
            X.4SY r1 = r15.$onQueryTextChangeListener
            if (r1 == 0) goto L_0x0039
            X.4Xq r1 = (X.C89724Xq) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0152;
                case 1: goto L_0x0149;
                case 2: goto L_0x0124;
                case 3: goto L_0x010c;
                case 4: goto L_0x00ff;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.Settings r2 = (com.whatsapp.settings.Settings) r2
            androidx.recyclerview.widget.RecyclerView r0 = r2.A05
            if (r0 != 0) goto L_0x003c
            com.whatsapp.wds.components.search.WDSSearchBar r1 = r2.A0u
            if (r1 == 0) goto L_0x003c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0039
            r0 = 0
            r1.A02(r0)
        L_0x0039:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x003c:
            r2.A13 = r4
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00d4
            X.3TR r3 = r2.A0m
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            java.lang.String r0 = ""
            X.AnonymousClass3TR.A02(r3, r4, r0, r1)
            java.util.List r0 = X.C007103b.A0Y(r1)
            X.3TR r5 = r2.A0m
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.LinkedHashMap r6 = X.C36431kI.A1G()
            java.util.Iterator r4 = r0.iterator()
        L_0x0061:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.4Us r0 = (X.C88964Us) r0
            X.4Us r0 = X.AnonymousClass3TR.A00(r0, r5)
            java.lang.String r0 = r0.BDM()
            java.lang.Object r0 = X.C36391kE.A0s(r0, r6)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x0061
        L_0x0080:
            java.util.Iterator r8 = X.AnonymousClass000.A0z(r6)
        L_0x0084:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r8.next()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r0 = 10
            java.util.List r0 = X.C89834Yb.A00(r1, r0)
            java.util.Iterator r7 = r0.iterator()
            r6 = 0
        L_0x009b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0084
            int r4 = r6 + 1
            java.lang.Object r1 = r7.next()
            X.4Us r1 = (X.C88964Us) r1
            java.lang.String r11 = r1.BGE()
            java.lang.String r12 = r1.BDM()
            r14 = 1
            r13 = 0
            if (r6 != 0) goto L_0x00d2
            X.4Us r0 = X.AnonymousClass3TR.A00(r1, r5)
            android.graphics.drawable.Drawable r10 = r0.getIcon()
        L_0x00bd:
            java.lang.String r1 = r1.BF9()
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00c8
            r13 = r1
        L_0x00c8:
            X.3Jx r9 = new X.3Jx
            r9.<init>(r10, r11, r12, r13, r14)
            r3.add(r9)
            r6 = r4
            goto L_0x009b
        L_0x00d2:
            r10 = r13
            goto L_0x00bd
        L_0x00d4:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            goto L_0x00f8
        L_0x00d9:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00f4
            X.0wG r1 = r5.A03
            r0 = 2131897007(0x7f122aaf, float:1.9428891E38)
            java.lang.String r6 = X.C36371kC.A0v(r1, r0)
            r5 = 0
            r9 = 2
            X.3Jx r4 = new X.3Jx
            r8 = r5
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            r3.add(r4)
        L_0x00f4:
            java.util.List r0 = X.C007103b.A0Y(r3)
        L_0x00f8:
            r2.A15 = r0
            com.whatsapp.settings.Settings.A0J(r2)
            goto L_0x0039
        L_0x00ff:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet r0 = (com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet) r0
            X.1vZ r0 = r0.A05
            if (r0 == 0) goto L_0x0039
            android.widget.Filter r0 = r0.getFilter()
            goto L_0x011f
        L_0x010c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.inappbugreporting.BugReportingCategoriesActivity r0 = (com.whatsapp.inappbugreporting.BugReportingCategoriesActivity) r0
            X.1wa r0 = r0.A01
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "bugCategoryListAdapter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011b:
            android.widget.Filter r0 = r0.getFilter()
        L_0x011f:
            r0.filter(r4)
            goto L_0x0039
        L_0x0124:
            r3 = 0
            java.lang.Object r0 = r1.A00
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r0 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r0
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r2 = r0.A0E
            if (r2 != 0) goto L_0x0132
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0132:
            r2.A00 = r4
            X.0ts r0 = r2.A0H
            java.util.ArrayList r1 = X.C202859mm.A03(r0, r4)
            X.AnonymousClass00C.A08(r1)
            X.00s r0 = r2.A0D
            X.C36341k9.A16(r0, r3)
            X.00s r0 = r2.A0E
            r0.A0D(r1)
            goto L_0x0039
        L_0x0149:
            java.lang.Object r0 = r1.A00
            X.27v r0 = (X.AnonymousClass27v) r0
            r0.A41(r4)
            goto L_0x0039
        L_0x0152:
            java.lang.Object r0 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1x(r4)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MP.invoke(java.lang.Object):java.lang.Object");
    }
}
