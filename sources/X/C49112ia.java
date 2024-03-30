package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2ia  reason: invalid class name and case insensitive filesystem */
public final class C49112ia extends C132446Tt {
    public final WeakReference A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49112ia(AnonymousClass27v r2, List list) {
        super(r2, true);
        AnonymousClass00C.A0D(list, 2);
        this.A01 = list;
        this.A00 = AnonymousClass001.A0F(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.whatsapp.calling.favorite.FavoritePicker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0131, code lost:
        if (X.AnonymousClass098.A06(r0) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0169, code lost:
        if (r2 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c1, code lost:
        if (r8 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0570 A[LOOP:14: B:265:0x056a->B:267:0x0570, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.ref.WeakReference r0 = r13.A00
            java.lang.Object r5 = r0.get()
            X.27v r5 = (X.AnonymousClass27v) r5
            if (r5 == 0) goto L_0x0560
            boolean r0 = r5 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x0033
            r3 = r5
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r3 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r3
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.List r0 = r3.A06
            if (r0 == 0) goto L_0x0321
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0319
            java.lang.Object r0 = r1.next()
            X.378 r0 = (X.AnonymousClass378) r0
            X.141 r0 = r0.A00
            r2.add(r0)
            goto L_0x0021
        L_0x0033:
            boolean r0 = r5 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 == 0) goto L_0x006c
            r7 = r5
            com.whatsapp.group.GroupMembersSelector r7 = (com.whatsapp.group.GroupMembersSelector) r7
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.List r0 = r7.A0A
            if (r0 != 0) goto L_0x0293
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r7.A0A = r0
            X.1NZ r0 = r7.A05
            java.util.ArrayList r0 = r0.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x0052:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0293
            X.11F r1 = X.C36401kF.A0a(r2)
            X.16D r0 = r7.A09
            X.141 r1 = r0.A08(r1)
            boolean r0 = r1.A0z
            if (r0 == 0) goto L_0x0052
            java.util.List r0 = r7.A0A
            r0.add(r1)
            goto L_0x0052
        L_0x006c:
            boolean r0 = r5 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x0121
            r3 = r5
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r3 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r3
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.3I5 r2 = r3.A04
            if (r2 == 0) goto L_0x00bb
            X.12q r1 = r3.A06
            if (r1 == 0) goto L_0x011a
            X.00T r0 = r3.A0V
            X.11F r0 = X.C36421kH.A0O(r0)
            java.lang.String r7 = r1.A0D(r0)
            java.lang.String r0 = "com.whatsapp.community.DirectoryContactsLoader"
            java.util.Map r6 = r2.A00
            java.lang.Object r0 = r6.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x0097
            X.02c r0 = X.C004702c.A00
        L_0x0097:
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            X.2Go r0 = new X.2Go
            r0.<init>(r7, r1)
            r4.add(r0)
            java.lang.String r0 = "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader"
            java.lang.Object r0 = r6.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x00af
            X.02c r0 = X.C004702c.A00
        L_0x00af:
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            X.2Gk r0 = new X.2Gk
            r0.<init>(r1)
            r4.add(r0)
        L_0x00bb:
            java.util.List r1 = r3.A0P
            X.AnonymousClass00C.A07(r1)
            X.2Gl r0 = new X.2Gl
            r0.<init>(r1)
            r4.add(r0)
            java.lang.String r0 = r3.A0N
            if (r0 == 0) goto L_0x0117
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0117
            java.util.List r1 = r3.A0Q
        L_0x00d4:
            X.AnonymousClass00C.A0B(r1)
            X.2Gn r0 = new X.2Gn
            r0.<init>(r1)
            r4.add(r0)
            if (r2 == 0) goto L_0x0332
            boolean r0 = com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0z(r3)
            if (r0 != 0) goto L_0x00f1
            X.0yC r1 = r3.A0D
            r0 = 4575(0x11df, float:6.411E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0332
        L_0x00f1:
            X.0yC r0 = r3.A0D
            boolean r0 = X.C36441kJ.A1L(r0)
            if (r0 == 0) goto L_0x0332
            X.171 r3 = r3.A0B
            X.AnonymousClass00C.A07(r3)
            java.lang.String r1 = "com.whatsapp.contact.picker.NonWaContactsLoader"
            java.util.Map r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x010c
            X.02c r0 = X.C004702c.A00
        L_0x010c:
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
            X.2Gq r2 = new X.2Gq
            r2.<init>(r3, r0)
            goto L_0x0306
        L_0x0117:
            java.util.List r1 = r3.A0R
            goto L_0x00d4
        L_0x011a:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0121:
            boolean r0 = r5 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 == 0) goto L_0x0199
            r3 = r5
            com.whatsapp.calling.favorite.FavoritePicker r3 = (com.whatsapp.calling.favorite.FavoritePicker) r3
            java.lang.String r0 = r3.A0N
            r6 = 1
            if (r0 == 0) goto L_0x0133
            boolean r0 = X.AnonymousClass098.A06(r0)
            if (r0 == 0) goto L_0x030d
        L_0x0133:
            X.00T r0 = r3.A04
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.calling.favorite.FavoritePickerViewModel r2 = (com.whatsapp.calling.favorite.FavoritePickerViewModel) r2
            java.lang.String r4 = "FavoritePickerViewModel"
            java.util.List r0 = r2.A02
            if (r0 != 0) goto L_0x0167
            r0 = 0
            com.whatsapp.calling.favorite.FavoritePickerViewModel$getContacts$1 r1 = new com.whatsapp.calling.favorite.FavoritePickerViewModel$getContacts$1     // Catch:{ Exception -> 0x014d }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x014d }
            X.03u r0 = X.C008903u.A00     // Catch:{ Exception -> 0x014d }
            X.C110515an.A00(r0, r1)     // Catch:{ Exception -> 0x014d }
            goto L_0x0167
        L_0x014d:
            r2 = move-exception
            boolean r0 = r2 instanceof java.lang.InterruptedException
            if (r0 == 0) goto L_0x015c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r4)
            java.lang.String r0 = "/getContacts/was interrupted: "
        L_0x0158:
            X.C36321k7.A1J(r2, r0, r1)
            goto L_0x016b
        L_0x015c:
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x025c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r4)
            java.lang.String r0 = "/getContacts/was cancelled: "
            goto L_0x0158
        L_0x0167:
            java.util.List r2 = r2.A02
            if (r2 != 0) goto L_0x016d
        L_0x016b:
            X.09w r2 = X.C023409w.A00
        L_0x016d:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            boolean r0 = X.C36401kF.A1a(r2)
            if (r0 == 0) goto L_0x0182
            r1 = 2131888296(0x7f1208a8, float:1.9411223E38)
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1, r2, r6)
            r4.add(r0)
        L_0x0182:
            java.util.List r0 = r3.A0P
            X.AnonymousClass00C.A07(r0)
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x0332
            java.util.List r0 = r3.A0P
            X.AnonymousClass00C.A07(r0)
            X.2Gl r2 = new X.2Gl
            r2.<init>(r0)
            goto L_0x0306
        L_0x0199:
            boolean r0 = r5 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x0313
            r3 = r5
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r3 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r3
            r6 = 1
            r3.A09 = r6
            java.lang.String r0 = r3.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r0 == 0) goto L_0x025d
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel r2 = r3.A00
            if (r2 == 0) goto L_0x01c4
            java.util.List r0 = r2.A02
            if (r0 != 0) goto L_0x01bf
            r0 = 0
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$getContacts$1 r1 = new com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$getContacts$1     // Catch:{ Exception -> 0x01c6 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x01c6 }
            X.03u r0 = X.C008903u.A00     // Catch:{ Exception -> 0x01c6 }
            X.C110515an.A00(r0, r1)     // Catch:{ Exception -> 0x01c6 }
        L_0x01bf:
            java.util.List r8 = r2.A02
            if (r8 != 0) goto L_0x01db
            goto L_0x01d9
        L_0x01c4:
            r8 = 0
            goto L_0x01db
        L_0x01c6:
            r2 = move-exception
            boolean r0 = r2 instanceof java.lang.InterruptedException
            if (r0 == 0) goto L_0x024b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupCallParticipantSuggestionsViewModel"
            r1.append(r0)
            java.lang.String r0 = "/getContacts/was interrupted: "
        L_0x01d6:
            X.C36321k7.A1J(r2, r0, r1)
        L_0x01d9:
            X.09w r8 = X.C023409w.A00
        L_0x01db:
            if (r8 == 0) goto L_0x025d
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x025d
            r3.A09 = r4
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r1 = 2131888296(0x7f1208a8, float:1.9411223E38)
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1, r8, r6)
            r4.add(r0)
            java.util.List r1 = r3.A0P
            X.2Gl r0 = new X.2Gl
            r0.<init>(r1)
            r4.add(r0)
            java.util.ArrayList r0 = r3.A08
            r2 = 1
            if (r0 == 0) goto L_0x0249
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0249
            X.0yC r1 = r3.A0D
            r0 = 6742(0x1a56, float:9.448E-42)
            int r0 = r1.A07(r0)
            if (r0 != r6) goto L_0x0249
        L_0x0213:
            if (r2 == 0) goto L_0x0224
            X.171 r2 = r3.A0B
            java.util.ArrayList r1 = r3.A08
            X.C18740tg.A06(r1)
            X.2Gp r0 = new X.2Gp
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x0224:
            X.6W1 r7 = X.AnonymousClass22g.A01(r3)
            int r0 = r8.size()
            java.lang.Long r6 = X.C36441kJ.A0y(r0)
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel r0 = r3.A00
            X.C18740tg.A06(r0)
            long r0 = r0.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.0wk r2 = r7.A03
            r1 = 42
            X.74n r0 = new X.74n
            r0.<init>(r7, r6, r3, r1)
            r2.execute(r0)
            goto L_0x0332
        L_0x0249:
            r2 = 0
            goto L_0x0213
        L_0x024b:
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x025c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupCallParticipantSuggestionsViewModel"
            r1.append(r0)
            java.lang.String r0 = "/getContacts/was cancelled: "
            goto L_0x01d6
        L_0x025c:
            throw r2
        L_0x025d:
            java.util.ArrayList r0 = r3.A08
            r2 = 1
            if (r0 == 0) goto L_0x0291
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0291
            X.0yC r1 = r3.A0D
            r0 = 6742(0x1a56, float:9.448E-42)
            int r0 = r1.A07(r0)
            if (r0 != r6) goto L_0x0291
        L_0x0272:
            if (r2 == 0) goto L_0x030d
            r3.A09 = r4
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.List r1 = r3.A0P
            X.2Gl r0 = new X.2Gl
            r0.<init>(r1)
            r4.add(r0)
            X.171 r1 = r3.A0B
            java.util.ArrayList r0 = r3.A08
            X.C18740tg.A06(r0)
            X.2Gp r2 = new X.2Gp
            r2.<init>(r1, r0)
            goto L_0x0306
        L_0x0291:
            r2 = 0
            goto L_0x0272
        L_0x0293:
            java.util.List r1 = r7.A0A
            X.2Gk r0 = new X.2Gk
            r0.<init>(r1)
            r4.add(r0)
            X.12q r1 = r7.A02
            X.147 r0 = r7.A07
            int r1 = r1.A05(r0)
            r0 = 1
            if (r1 != r0) goto L_0x02bc
            X.12q r1 = r7.A02
            X.147 r0 = r7.A07
            java.lang.String r2 = r1.A0D(r0)
            java.util.List r1 = com.whatsapp.group.GroupMembersSelector.A0w(r7)
            X.2Go r0 = new X.2Go
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x02bc:
            java.util.List r1 = r7.A0P
            X.2Gl r0 = new X.2Gl
            r0.<init>(r1)
            r4.add(r0)
            java.lang.String r0 = r7.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x030a
            java.util.List r1 = r7.A0R
        L_0x02d0:
            X.2Gn r0 = new X.2Gn
            r0.<init>(r1)
            r4.add(r0)
            X.0yC r0 = r7.A0D
            boolean r0 = X.C36441kJ.A1L(r0)
            if (r0 == 0) goto L_0x0332
            X.171 r6 = r7.A0B
            java.util.List r0 = r7.A09
            if (r0 != 0) goto L_0x02ff
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r7.A09 = r1
            X.16D r0 = r7.A09
            r0.A0o(r1)
            java.util.List r3 = r7.A09
            X.171 r2 = r7.A0B
            X.0ts r1 = r7.A0I
            X.3xD r0 = new X.3xD
            r0.<init>(r2, r1)
            java.util.Collections.sort(r3, r0)
        L_0x02ff:
            java.util.List r0 = r7.A09
            X.2Gq r2 = new X.2Gq
            r2.<init>(r6, r0)
        L_0x0306:
            r4.add(r2)
            goto L_0x0332
        L_0x030a:
            java.util.List r1 = r7.A0Q
            goto L_0x02d0
        L_0x030d:
            X.3yR r4 = new X.3yR
            r4.<init>(r3)
            goto L_0x0332
        L_0x0313:
            X.3yR r4 = new X.3yR
            r4.<init>(r5)
            goto L_0x0332
        L_0x0319:
            X.2Gm r0 = new X.2Gm
            r0.<init>(r2)
            r4.add(r0)
        L_0x0321:
            java.util.List r3 = r3.A0P
            X.AnonymousClass00C.A07(r3)
            r2 = 2131888294(0x7f1208a6, float:1.941122E38)
            r1 = 1
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2, r3, r1)
            r4.add(r0)
        L_0x0332:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0560
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.HashSet r8 = X.C36441kJ.A16()
            java.util.Iterator r9 = r4.iterator()
        L_0x0344:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x03c5
            java.lang.Object r7 = r9.next()
            X.3Jb r7 = (X.C63183Jb) r7
            java.util.List r6 = r13.A01
            boolean r0 = r7 instanceof X.AnonymousClass2Gn
            if (r0 == 0) goto L_0x0373
            java.util.List r0 = r7.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x035c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0344
            X.141 r1 = X.C36391kE.A0f(r2)
            java.util.ArrayList r0 = r7.A01
            r0.add(r1)
            X.11F r0 = r1.A0H
            if (r0 == 0) goto L_0x035c
            r8.add(r0)
            goto L_0x035c
        L_0x0373:
            boolean r0 = r7 instanceof X.AnonymousClass2Gq
            if (r0 == 0) goto L_0x0393
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.util.List r0 = r7.A02
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0385:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0344
            X.141 r0 = X.C36391kE.A0f(r1)
            X.C63183Jb.A00(r7, r0, r6, r8)
            goto L_0x0385
        L_0x0393:
            boolean r1 = r7 instanceof X.AnonymousClass2Gm
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.util.List r0 = r7.A02
            if (r1 == 0) goto L_0x03af
            java.util.Iterator r1 = r0.iterator()
        L_0x03a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0344
            X.141 r0 = X.C36391kE.A0f(r1)
            X.C63183Jb.A00(r7, r0, r6, r8)
            goto L_0x03a1
        L_0x03af:
            java.util.Iterator r2 = r0.iterator()
        L_0x03b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0344
            X.141 r1 = X.C36391kE.A0f(r2)
            boolean r0 = r1.A0z
            if (r0 == 0) goto L_0x03b3
            X.C63183Jb.A00(r7, r1, r6, r8)
            goto L_0x03b3
        L_0x03c5:
            java.util.Iterator r12 = r4.iterator()
        L_0x03c9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0581
            java.lang.Object r7 = r12.next()
            X.3Jb r7 = (X.C63183Jb) r7
            boolean r0 = r7.A03
            r8 = 1
            if (r0 != 0) goto L_0x03f7
            java.util.Iterator r2 = r4.iterator()
            r1 = 0
        L_0x03df:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x055d
            java.lang.Object r0 = r2.next()
            X.3Jb r0 = (X.C63183Jb) r0
            java.util.ArrayList r0 = r0.A01
            boolean r0 = X.C36411kG.A1a(r0)
            if (r0 == 0) goto L_0x03df
            int r1 = r1 + 1
            if (r1 <= r8) goto L_0x03df
        L_0x03f7:
            r1 = 1
        L_0x03f8:
            boolean r0 = r7 instanceof X.AnonymousClass2Gq
            if (r0 == 0) goto L_0x0524
            X.2Gq r7 = (X.AnonymousClass2Gq) r7
            boolean r0 = r7 instanceof X.AnonymousClass2Gp
            if (r0 == 0) goto L_0x048e
            java.util.LinkedHashMap r9 = X.C36431kI.A1G()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r8 = r7.A01
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0558
            if (r1 == 0) goto L_0x0420
            java.lang.String r1 = r7.A01(r5)
            X.2Gi r0 = new X.2Gi
            r0.<init>(r1)
            r6.add(r0)
        L_0x0420:
            java.util.Iterator r10 = r8.iterator()
        L_0x0424:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0458
            X.141 r2 = X.C36391kE.A0f(r10)
            X.171 r0 = r7.A00
            java.lang.String r1 = r0.A0H(r2)
            if (r1 == 0) goto L_0x0424
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0424
            boolean r0 = r9.containsKey(r1)
            if (r0 != 0) goto L_0x0449
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r9.put(r1, r0)
        L_0x0449:
            java.lang.Object r0 = r9.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0424
            X.AnonymousClass00C.A0B(r2)
            r0.add(r2)
            goto L_0x0424
        L_0x0458:
            java.util.Iterator r8 = r8.iterator()
        L_0x045c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0558
            X.141 r1 = X.C36391kE.A0f(r8)
            X.171 r0 = r7.A00
            java.lang.String r2 = r0.A0H(r1)
            if (r2 == 0) goto L_0x045c
            int r0 = r2.length()
            if (r0 == 0) goto L_0x045c
            java.lang.Object r1 = r9.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x045c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x045c
            X.2Gh r0 = new X.2Gh
            r0.<init>(r1)
            r6.add(r0)
            r9.remove(r2)
            goto L_0x045c
        L_0x048e:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r9 = r7.A01
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0558
            if (r1 == 0) goto L_0x04a8
            java.lang.String r1 = r7.A01(r5)
            X.2Gi r0 = new X.2Gi
            r0.<init>(r1)
            r6.add(r0)
        L_0x04a8:
            java.util.HashMap r10 = X.AnonymousClass001.A0J()
            java.util.Iterator r11 = r9.iterator()
        L_0x04b0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04eb
            X.141 r2 = X.C36391kE.A0f(r11)
            X.171 r1 = r7.A00
            r0 = -1
            X.34G r0 = r1.A0C(r2, r0)
            java.lang.String r2 = r0.A01
            r1 = 0
            if (r2 == 0) goto L_0x04b0
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x04b0
            boolean r0 = r10.containsKey(r2)
            if (r0 == 0) goto L_0x04e6
            java.lang.Number r0 = X.C36441kJ.A10(r2, r10)
            if (r0 == 0) goto L_0x04dc
            int r1 = r0.intValue()
        L_0x04dc:
            int r0 = r1 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04e2:
            r10.put(r2, r0)
            goto L_0x04b0
        L_0x04e6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x04e2
        L_0x04eb:
            java.util.Iterator r11 = r9.iterator()
        L_0x04ef:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0558
            X.141 r9 = X.C36391kE.A0f(r11)
            X.AnonymousClass00C.A0B(r9)
            X.171 r1 = r7.A00
            r0 = -1
            X.34G r0 = r1.A0C(r9, r0)
            java.lang.String r2 = r0.A01
            r1 = 0
            if (r2 == 0) goto L_0x051a
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x051a
            java.lang.Number r0 = X.C36441kJ.A10(r2, r10)
            if (r0 == 0) goto L_0x051a
            int r0 = r0.intValue()
            if (r0 == r8) goto L_0x051b
        L_0x051a:
            r1 = 1
        L_0x051b:
            X.2Gg r0 = new X.2Gg
            r0.<init>(r9, r1)
            r6.add(r0)
            goto L_0x04ef
        L_0x0524:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r2 = r7.A01
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0558
            if (r1 == 0) goto L_0x053e
            java.lang.String r1 = r7.A01(r5)
            X.2Gi r0 = new X.2Gi
            r0.<init>(r1)
            r6.add(r0)
        L_0x053e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0542:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0558
            X.141 r1 = X.C36391kE.A0f(r2)
            X.AnonymousClass00C.A0B(r1)
            X.2Gf r0 = new X.2Gf
            r0.<init>(r1)
            r6.add(r0)
            goto L_0x0542
        L_0x0558:
            r3.addAll(r6)
            goto L_0x03c9
        L_0x055d:
            r1 = 0
            goto L_0x03f8
        L_0x0560:
            java.util.List r0 = r13.A01
            java.util.ArrayList r3 = X.C36321k7.A0J(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x056a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x057d
            X.141 r1 = X.C36391kE.A0f(r2)
            X.2Gf r0 = new X.2Gf
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x056a
        L_0x057d:
            java.util.ArrayList r3 = X.C36361kB.A0q(r3)
        L_0x0581:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49112ia.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List A0h = C36421kH.A0h(obj);
        AnonymousClass27v r0 = (AnonymousClass27v) this.A00.get();
        if (r0 != null) {
            r0.A46(A0h);
        }
    }
}
