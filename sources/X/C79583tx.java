package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3tx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79583tx implements C25711Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C225314u A03;
    public final /* synthetic */ C79593ty A04;
    public final /* synthetic */ C64723Pe A05;
    public final /* synthetic */ C207269up A06;
    public final /* synthetic */ C196089Xp A07;
    public final /* synthetic */ AnonymousClass11F A08;
    public final /* synthetic */ UserJid A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ boolean A0B;

    public /* synthetic */ C79583tx(C225314u r1, C79593ty r2, C64723Pe r3, C207269up r4, C196089Xp r5, AnonymousClass11F r6, UserJid userJid, List list, int i, int i2, long j, boolean z) {
        this.A05 = r3;
        this.A00 = i;
        this.A0A = list;
        this.A0B = z;
        this.A03 = r1;
        this.A01 = i2;
        this.A08 = r6;
        this.A06 = r4;
        this.A09 = userJid;
        this.A02 = j;
        this.A07 = r5;
        this.A04 = r2;
    }

    public final void accept(Object obj) {
        C64723Pe r10 = this.A05;
        int i = this.A00;
        List list = this.A0A;
        boolean z = this.A0B;
        C225314u r8 = this.A03;
        int i2 = this.A01;
        AnonymousClass11F r7 = this.A08;
        C207269up r11 = this.A06;
        UserJid userJid = this.A09;
        long j = this.A02;
        C196089Xp r24 = this.A07;
        C79593ty r13 = this.A04;
        AnonymousClass00I r14 = (AnonymousClass00I) obj;
        if (i == list.size() - 1) {
            C21700zf r15 = (C21700zf) r10.A05.A02.get("send_product_message_tag");
            if (r15 != null) {
                r15.A06("image_upload");
            }
            if (!z) {
                r8.Bnv();
            }
        }
        File file = (File) r14.A01;
        if (r14.A00 == Boolean.FALSE) {
            r8.Bnv();
            r8.BO5(R.string.f12nameremoved);
            Log.w("product-details/send-product/product load failed");
            r10.A05.A05("send_product_message_tag", false);
            Log.w("product-details/send-product/temp file creation failed");
        } else {
            if (i2 == 2) {
                Intent A1Z = C36441kJ.A0j().A1Z(r8, r7, 0);
                A1Z.putExtra("product", r11);
                A1Z.putExtra("product_file", file);
                A1Z.putExtra("_ci_", C65743Th.A01(r8, 0, C36431kI.A0D(), 0));
                A1Z.putExtra("business_jid", userJid.getRawString());
                AnonymousClass3M9.A01(A1Z, "CatalogUtils");
                r8.startActivity(A1Z);
            } else {
                Uri fromFile = Uri.fromFile(file);
                if (i2 != 1 || r7 == null) {
                    HashSet A16 = C36441kJ.A16();
                    AnonymousClass000.A1F(A16, 23);
                    AnonymousClass3OM r1 = new AnonymousClass3OM(r8);
                    r1.A0G = true;
                    r1.A0L = true;
                    r1.A0V = file.getAbsolutePath();
                    r1.A0a = C36441kJ.A15(A16);
                    r8.startActivityForResult(AnonymousClass3OM.A00(r1), 3);
                } else {
                    AnonymousClass3T1 r19 = null;
                    if (j > 0) {
                        r19 = C36421kH.A0R(r10.A06, j);
                    }
                    AnonymousClass1X4 r4 = r10.A02;
                    r4.A1J.Boy(new C35451ii(fromFile, r4, r11, userJid, r19, Collections.singletonList(r7)));
                    if (i < C36421kH.A06(list, 1)) {
                        C196089Xp r16 = r24;
                        AnonymousClass11F r17 = r7;
                        C64723Pe r142 = r10;
                        C225314u r152 = r8;
                        r142.A01(r152, r16, r17, userJid, list, 1, i + 1, j);
                    } else {
                        C36331k8.A0m(r8);
                    }
                }
            }
            r10.A05.A05("send_product_message_tag", true);
        }
        r13.A0E();
    }
}
