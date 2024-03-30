package X;

import android.net.Uri;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2kM  reason: invalid class name and case insensitive filesystem */
public class C50192kM extends C132446Tt {
    public final Uri A00;
    public final C21159AAt A01;
    public final AnonymousClass3PE A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass005 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final WeakReference A08;
    public final boolean A09;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        UserJid userJid;
        AnonymousClass6E1 A002;
        try {
            this.A03.A0B(32000);
            Pair A022 = this.A01.A02(C108515Tu.A0C, this.A07);
            C131626Pu r4 = (C131626Pu) A022.first;
            C194169Oj r3 = (C194169Oj) A022.second;
            boolean z = false;
            if (!(r3 == null || (userJid = r3.A0D) == null || !C197029b1.A00(userJid) || (A002 = ((AnonymousClass6BB) ((AnonymousClass1HX) this.A04.get()).A04.get()).A00(userJid)) == null || !A002.A0B)) {
                z = true;
            }
            return new AnonymousClass36L(r4, r3, z);
        } catch (C33111ej unused) {
            return null;
        }
    }

    public void A09() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A08.get();
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            Log.i("contactpicker/existencecheck/canceled");
            contactPickerFragment.A0z = null;
            contactPickerFragment.A0w.Bnv();
        }
    }

    public void A0A() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A08.get();
        if (contactPickerFragment != null && contactPickerFragment.A12()) {
            Log.i("contactpicker/existencecheck/started");
            contactPickerFragment.A0w.Bu2(0, R.string.f12nameremoved);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        if (r2.getQueryParameter("src") != null) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r18) {
        /*
            r17 = this;
            r7 = r18
            X.36L r7 = (X.AnonymousClass36L) r7
            r2 = r17
            java.lang.ref.WeakReference r0 = r2.A08
            java.lang.Object r1 = r0.get()
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            if (r1 == 0) goto L_0x0043
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x0043
            java.lang.String r4 = r2.A07
            boolean r6 = r2.A09
            X.3PE r10 = r2.A02
            java.lang.String r9 = r2.A06
            java.lang.String r8 = r2.A05
            android.net.Uri r2 = r2.A00
            r11 = 0
            r1.A0z = r11
            r3 = 1
            r12 = 0
            if (r7 != 0) goto L_0x0044
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handledeeplink/message-handler/disconnected/"
        L_0x002f:
            X.C36321k7.A1R(r0, r4, r2)
            X.3cN r6 = r1.A0w
            r5 = 2131888838(0x7f120ac6, float:1.9412323E38)
        L_0x0037:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r12] = r4
        L_0x003b:
            r6.BO9(r2, r12, r5)
        L_0x003e:
            X.3cN r0 = r1.A0w
            r0.Bnv()
        L_0x0043:
            return
        L_0x0044:
            X.6Pu r5 = r7.A00
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x02ad
            X.9Oj r4 = r7.A01
            boolean r5 = X.AnonymousClass000.A1V(r4)
            java.lang.String r0 = "deeplink: user is null"
            X.C18740tg.A0D(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x00b3
            r1.A2d = r9
            r1.A2c = r8
        L_0x0061:
            java.lang.String r0 = "messenger"
            boolean r5 = r0.equals(r8)
            java.lang.String r0 = "source"
            if (r5 == 0) goto L_0x0073
            android.os.Bundle r9 = r1.A1Z()
            r8 = 6
            r9.putInt(r0, r8)
        L_0x0073:
            int r8 = r4.A04
            if (r8 != r3) goto L_0x0237
            r1.A1J = r10
            com.whatsapp.jid.UserJid r9 = r4.A0D
            X.1IN r8 = r1.A1G
            X.1Hy r5 = r1.A1I
            X.9TX r5 = r5.A00(r10, r9)
            r8.A04(r5)
            com.whatsapp.jid.UserJid r10 = r4.A0D
            X.3PE r5 = r1.A1J
            org.json.JSONObject r9 = r5.A0D
            if (r9 == 0) goto L_0x009a
            if (r10 == 0) goto L_0x009a
            X.2aJ r8 = r1.A1M
            X.3II r5 = new X.3II
            r5.<init>(r10, r9)
            r8.A07(r5)
        L_0x009a:
            X.0yC r8 = r1.A1g
            r5 = 7926(0x1ef6, float:1.1107E-41)
            boolean r5 = r8.A0E(r5)
            if (r5 == 0) goto L_0x00bf
            if (r2 == 0) goto L_0x00bd
            java.lang.String r5 = "source_surface"
            java.lang.String r8 = r2.getQueryParameter(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x00bd
            goto L_0x00b8
        L_0x00b3:
            r1.A2d = r11
            r1.A2c = r11
            goto L_0x0061
        L_0x00b8:
            java.lang.Long r13 = java.lang.Long.valueOf(r8)     // Catch:{ NumberFormatException -> 0x00c1 }
            goto L_0x00c7
        L_0x00bd:
            r13 = r11
            goto L_0x00c7
        L_0x00bf:
            r13 = r11
            goto L_0x00c7
        L_0x00c1:
            r8 = -1
            java.lang.Long r13 = java.lang.Long.valueOf(r8)
        L_0x00c7:
            X.3Fe r10 = r1.A1d
            com.whatsapp.jid.UserJid r8 = r4.A0D
            if (r8 == 0) goto L_0x00d7
            X.16D r5 = r1.A0j
            boolean r5 = r5.A0q(r8)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
        L_0x00d7:
            java.lang.String r14 = r1.A2b
            r15 = 2
            android.os.Bundle r5 = r1.A1Z()
            int r16 = r5.getInt(r0, r3)
            X.185 r5 = r1.A0o
            com.whatsapp.jid.UserJid r3 = r4.A0D
            X.3L0 r3 = r5.A02(r3)
            java.lang.Integer r12 = X.C65683Tb.A01(r3)
            r10.A00(r11, r12, r13, r14, r15, r16)
            com.whatsapp.jid.UserJid r8 = r4.A0D
            android.os.Bundle r3 = r1.A1Z()
            int r3 = r3.getInt(r0)
            r0 = 1
            if (r0 != r3) goto L_0x0127
            java.lang.String r11 = "type"
            java.lang.String r0 = r2.getQueryParameter(r11)
            java.lang.String r5 = "custom_url"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = "src"
            java.lang.String r3 = r2.getQueryParameter(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            r10 = 5
            r9 = 4
            if (r0 == 0) goto L_0x01a0
            X.3Gi r5 = r1.A1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r5.A00(r8, r3, r0)
        L_0x0127:
            com.whatsapp.jid.UserJid r0 = r4.A0D
            X.141 r5 = new X.141
            r5.<init>(r0)
            X.0wU r3 = r1.A2L
            r0 = 8
            X.C80273v8.A00(r3, r1, r4, r0)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            boolean r0 = X.C197029b1.A00(r0)
            if (r0 == 0) goto L_0x01e3
            com.whatsapp.jid.UserJid r8 = r4.A0D
            boolean r6 = r7.A02
            X.01I r4 = r1.A0h()
            boolean r0 = r4 instanceof X.C225314u
            if (r0 == 0) goto L_0x01d1
            X.005 r0 = r1.A2Q
            java.lang.Object r5 = r0.get()
            X.1K6 r5 = (X.AnonymousClass1K6) r5
            X.14u r4 = (X.C225314u) r4
            r0 = 0
            X.4WW r3 = new X.4WW
            r3.<init>(r8, r1, r0)
            X.C36331k8.A1I(r4, r2)
            java.lang.String r0 = "s"
            java.lang.String r2 = r2.getQueryParameter(r0)
            java.lang.String r0 = "5"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0194
            r2 = 10
        L_0x016c:
            X.005 r0 = r5.A07
            java.lang.Object r0 = r0.get()
            X.1Hg r0 = (X.C25681Hg) r0
            if (r6 == 0) goto L_0x0187
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01c7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.2nm r0 = X.C51412nm.META_AI_SHORTCUT
        L_0x0182:
            X.AnonymousClass1K6.A00(r4, r3, r5, r0, r2)
            goto L_0x003e
        L_0x0187:
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01c7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.2nm r0 = X.C51412nm.AGENT
            goto L_0x0182
        L_0x0194:
            java.lang.String r0 = "4"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            r2 = 5
            if (r0 == 0) goto L_0x016c
            r2 = 11
            goto L_0x016c
        L_0x01a0:
            java.lang.String r0 = r2.getQueryParameter(r11)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "src"
            java.lang.String r3 = r2.getQueryParameter(r0)
            java.lang.String r0 = "qr"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0127
            X.3Gi r5 = r1.A1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r5.A01(r8, r3, r0)
            goto L_0x0127
        L_0x01c7:
            com.whatsapp.bonsai.waitlist.BonsaiWaitlistUnavailableBottomSheet r0 = new com.whatsapp.bonsai.waitlist.BonsaiWaitlistUnavailableBottomSheet
            r0.<init>()
            r4.Btm(r0)
            goto L_0x003e
        L_0x01d1:
            X.3cN r4 = r1.A0w
            android.content.Context r0 = r1.A0a()
            android.content.Intent r3 = X.AnonymousClass190.A09(r0)
            r2 = 1
            X.4vn r0 = r4.A00
            r0.A33(r3, r2)
            goto L_0x003e
        L_0x01e3:
            if (r6 != 0) goto L_0x0232
            com.whatsapp.jid.UserJid r0 = r4.A0D
            if (r0 == 0) goto L_0x01f9
            java.lang.String r0 = r1.A2a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f9
            java.lang.String r0 = r1.A2h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0232
        L_0x01f9:
            android.content.Context r0 = r1.A1D()
            r2 = 0
            android.content.Intent r5 = X.AnonymousClass190.A0F(r0, r2)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            X.C36371kC.A17(r5, r0)
            java.lang.String r0 = "skip_preview"
            r5.putExtra(r0, r2)
            java.lang.String r0 = "number_from_url"
            r3 = 1
            r5.putExtra(r0, r3)
            java.lang.String r0 = "text_from_url"
            r5.putExtra(r0, r2)
            java.lang.String r2 = r1.A2b
            java.lang.String r0 = "extra_deep_link_session_id"
            r5.putExtra(r0, r2)
            com.whatsapp.contact.picker.ContactPickerFragment.A0C(r5, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r5.addFlags(r0)
            X.AnonymousClass3M9.A00(r5, r1)
            X.3cN r0 = r1.A0w
            X.4vn r0 = r0.A00
            r0.A33(r5, r3)
            goto L_0x003e
        L_0x0232:
            com.whatsapp.contact.picker.ContactPickerFragment.A0I(r1, r5)
            goto L_0x003e
        L_0x0237:
            r0 = 2
            if (r8 != r0) goto L_0x0287
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handledeeplink/existencesync/user/not-wa/"
            r2.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            X.C36331k8.A1P(r0, r2)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            X.C18740tg.A06(r0)
            java.lang.String r6 = r0.user
            X.0yC r2 = r1.A1g
            r0 = 4691(0x1253, float:6.573E-42)
            boolean r2 = r2.A0E(r0)
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0275
            X.3cN r9 = r1.A0w
            r13 = 2131888837(0x7f120ac5, float:1.941232E38)
            r14 = 2131888299(0x7f1208ab, float:1.941123E38)
            X.3cF r10 = new X.3cF
            r10.<init>(r1, r6, r5)
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r0 = X.C65983Uf.A0E(r0, r6)
            r11[r12] = r0
            r9.BO8(r10, r11, r12, r13, r14)
            goto L_0x003e
        L_0x0275:
            X.3cN r5 = r1.A0w
            r4 = 2131888837(0x7f120ac5, float:1.941232E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r0 = X.C65983Uf.A0E(r0, r6)
            r2[r12] = r0
            r5.BO9(r2, r12, r4)
            goto L_0x003e
        L_0x0287:
            r0 = 3
            if (r8 != r0) goto L_0x003e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handledeeplink/existencesync/user/invalid/"
            r2.append(r0)
            java.util.List r0 = r4.A0K
            java.lang.String r0 = X.C36401kF.A0s(r0, r12)
            X.C36321k7.A1Z(r2, r0)
            X.3cN r6 = r1.A0w
            r5 = 2131888832(0x7f120ac0, float:1.941231E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.util.List r0 = r4.A0K
            java.lang.Object r0 = r0.get(r12)
            r2[r12] = r0
            goto L_0x003b
        L_0x02ad:
            int r2 = r5.A00
            if (r2 != 0) goto L_0x02c1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handledeeplink/existencesync/network-unavailable/"
            X.C36321k7.A1R(r0, r4, r2)
            X.3cN r6 = r1.A0w
            r5 = 2131888836(0x7f120ac4, float:1.9412319E38)
            goto L_0x0037
        L_0x02c1:
            r0 = 4
            if (r2 != r0) goto L_0x02cc
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handledeeplink/existencesync/failed/try-again-later/"
            goto L_0x002f
        L_0x02cc:
            if (r2 != r3) goto L_0x02d9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handledeeplink/existencesync/exisitng request ongoing/"
        L_0x02d4:
            X.C36321k7.A1R(r0, r4, r2)
            goto L_0x003e
        L_0x02d9:
            r0 = 6
            if (r2 != r0) goto L_0x003e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handledeeplink/existencesync/exception-occurred/"
            goto L_0x02d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50192kM.A0C(java.lang.Object):void");
    }

    public C50192kM(Uri uri, ContactPickerFragment contactPickerFragment, C21159AAt aAt, AnonymousClass3PE r5, AnonymousClass19A r6, AnonymousClass005 r7, String str, String str2, String str3, boolean z) {
        this.A08 = AnonymousClass001.A0F(contactPickerFragment);
        this.A07 = str;
        this.A09 = z;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = aAt;
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = uri;
        this.A04 = r7;
    }
}
