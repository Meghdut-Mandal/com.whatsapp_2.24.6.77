package X;

import android.view.MenuItem;

/* renamed from: X.4YB  reason: invalid class name */
public class AnonymousClass4YB implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4YB(AnonymousClass155 r1, AnonymousClass141 r2, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A00 = r2;
            this.A01 = r1;
            return;
        }
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        r2.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0156, code lost:
        r1 = X.AnonymousClass001.A07();
        X.C36401kF.A14(r1, r4, "arg_contact_jid");
        r2.A17(r1);
        X.C65443Sb.A02(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x003c;
                case 2: goto L_0x0049;
                case 3: goto L_0x0062;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00ed;
                case 6: goto L_0x00fb;
                case 7: goto L_0x0007;
                case 8: goto L_0x010e;
                case 9: goto L_0x013f;
                case 10: goto L_0x013f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            return r0
        L_0x0007:
            java.lang.Object r5 = r7.A00
            com.whatsapp.gallery.GalleryTabHostFragment r5 = (com.whatsapp.gallery.GalleryTabHostFragment) r5
            java.lang.Object r4 = r7.A01
            X.36q r4 = (X.C601436q) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            r3 = 1
            X.66x r2 = r5.A0F
            if (r2 == 0) goto L_0x0167
            r0 = 19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 15
            r2.A02(r1, r3, r0)
            android.content.Intent r1 = r4.A00
            r0 = 91
            r5.startActivityForResult(r1, r0)
            goto L_0x0005
        L_0x002b:
            java.lang.Object r2 = r7.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r7.A01
            X.141 r1 = (X.AnonymousClass141) r1
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r0 = r0.A1W(r2, r1)
            goto L_0x005d
        L_0x003c:
            java.lang.Object r2 = r7.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r7.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            android.content.Intent r0 = X.AnonymousClass190.A0u(r2, r0)
            goto L_0x005d
        L_0x0049:
            java.lang.Object r1 = r7.A00
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            X.3IL r0 = r1.A0F
            if (r0 == 0) goto L_0x0165
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r0 = r0.A1V(r2, r1)
        L_0x005d:
            r2.startActivity(r0)
            goto L_0x0165
        L_0x0062:
            java.lang.Object r0 = r7.A00
            X.3Af r0 = (X.C61013Af) r0
            java.lang.Object r6 = r7.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            com.whatsapp.community.CommunityMembersViewModel r5 = r0.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.0wD r0 = r5.A08
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0095
            X.05L r4 = r5.A0N
        L_0x007a:
            java.lang.Object r3 = r4.getValue()
            X.4Iz r2 = new X.4Iz
            r2.<init>(r5)
            X.49H r1 = new X.49H
            r1.<init>(r5)
            X.2Ex r0 = new X.2Ex
            r0.<init>(r6, r1, r2)
            boolean r0 = r4.B3B(r3, r0)
            if (r0 == 0) goto L_0x007a
            goto L_0x0165
        L_0x0095:
            X.05L r3 = r5.A0N
        L_0x0097:
            java.lang.Object r2 = r3.getValue()
            X.49I r1 = new X.49I
            r1.<init>(r5)
            X.2Ev r0 = new X.2Ev
            r0.<init>(r1)
            boolean r0 = r3.B3B(r2, r0)
            if (r0 == 0) goto L_0x0097
            goto L_0x0165
        L_0x00ad:
            java.lang.Object r0 = r7.A00
            X.3Af r0 = (X.C61013Af) r0
            java.lang.Object r6 = r7.A01
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            X.3Eh r5 = r0.A04
            X.3KY r0 = X.C61993Eh.A00(r5, r6)
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0165
            r0 = 1
            X.3D3 r4 = new X.3D3
            r4.<init>(r0)
            X.155 r3 = r5.A01
            r0 = 2131890871(0x7f1212b7, float:1.9416446E38)
            java.lang.String r1 = r3.getString(r0)
            android.os.Bundle r2 = r4.A01
            java.lang.String r0 = "title"
            r2.putString(r0, r1)
            r0 = 2131890870(0x7f1212b6, float:1.9416444E38)
            java.lang.String r1 = X.C36361kB.A0m(r3, r0)
            java.lang.String r0 = "message"
            r2.putCharSequence(r0, r1)
            X.AnonymousClass3D3.A01(r2, r4, r5, r6)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            X.AnonymousClass3D3.A00(r2, r3, r4, r0)
            goto L_0x0165
        L_0x00ed:
            java.lang.Object r0 = r7.A00
            X.3Af r0 = (X.C61013Af) r0
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.3Eh r0 = r0.A04
            r0.A01(r1)
            goto L_0x0165
        L_0x00fb:
            java.lang.Object r0 = r7.A00
            X.3Af r0 = (X.C61013Af) r0
            java.lang.Object r2 = r7.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.3Eh r0 = r0.A04
            r1 = 0
            X.3KY r0 = X.C61993Eh.A00(r0, r2)
            r0.A01(r2, r1)
            goto L_0x0165
        L_0x010e:
            java.lang.Object r3 = r7.A00
            X.3Ek r3 = (X.C62023Ek) r3
            java.lang.Object r4 = r7.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            X.1LY r2 = r3.A02
            java.lang.String r1 = "newsletter_multi_admin"
            r0 = 0
            boolean r0 = r2.A01(r0, r1)
            r0 = r0 ^ 1
            X.155 r1 = r3.A00
            if (r0 == 0) goto L_0x0133
            X.01z r3 = r1.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet r2 = new com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet
            r2.<init>()
            goto L_0x0156
        L_0x0133:
            boolean r0 = r1 instanceof com.whatsapp.newsletter.NewsletterInfoActivity
            if (r0 == 0) goto L_0x0165
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            if (r1 == 0) goto L_0x0165
            r1.BZK(r4)
            goto L_0x0165
        L_0x013f:
            java.lang.Object r1 = r7.A00
            X.3Ek r1 = (X.C62023Ek) r1
            java.lang.Object r4 = r7.A01
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            X.155 r0 = r1.A00
            X.01z r3 = r0.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment r2 = new com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment
            r2.<init>()
        L_0x0156:
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "arg_contact_jid"
            X.C36401kF.A14(r1, r4, r0)
            r2.A17(r1)
            X.C65443Sb.A02(r2, r3)
        L_0x0165:
            r0 = 1
            return r0
        L_0x0167:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YB.onMenuItemClick(android.view.MenuItem):boolean");
    }

    public AnonymousClass4YB(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
