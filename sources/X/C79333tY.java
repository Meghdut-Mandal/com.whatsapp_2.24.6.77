package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3tY  reason: invalid class name and case insensitive filesystem */
public class C79333tY implements C160527l9 {
    public boolean A00 = false;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ AnonymousClass9XI A04;
    public final /* synthetic */ C29461Ws A05;
    public final /* synthetic */ C199439fJ A06;
    public final /* synthetic */ C46852bm A07;
    public final /* synthetic */ AnonymousClass1SV A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ void BXv() {
    }

    public /* synthetic */ void Btu(View view) {
    }

    public C79333tY(Context context, View view, AnonymousClass9XI r4, C29461Ws r5, C199439fJ r6, C46852bm r7, AnonymousClass1SV r8, int i, boolean z, boolean z2) {
        this.A07 = r7;
        this.A02 = context;
        this.A05 = r5;
        this.A09 = z;
        this.A0A = z2;
        this.A01 = i;
        this.A04 = r4;
        this.A06 = r6;
        this.A08 = r8;
        this.A03 = view;
    }

    public int BHb() {
        return this.A08.A09(this.A03.getContext());
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r31) {
        C196089Xp r5;
        C132386Tk r14;
        ByteArrayInputStream byteArrayInputStream;
        if (!this.A00) {
            this.A00 = true;
            if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                bitmap = null;
            }
            C46852bm r0 = this.A07;
            Context context = this.A02;
            String str = r0.A06;
            Activity A002 = C18860tw.A00(context);
            if (A002 instanceof AnonymousClass4V7) {
                r5 = ((AnonymousClass4V7) A002).getCatalogLoadSession();
                if (bitmap != null) {
                    StringBuilder A0v = AnonymousClass000.A0v(str);
                    A0v.append('_');
                    String A10 = C36381kD.A10(A0v, 3);
                    C195119So r3 = r5.A01;
                    if (r3.A01 != null) {
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(C36401kF.A1b(bitmap));
                            C102164zP r2 = r3.A01;
                            String A042 = C18750th.A04(A10);
                            C18740tg.A06(A042);
                            r2.A03.A04(byteArrayInputStream, A042);
                            byteArrayInputStream.close();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
            } else {
                r5 = null;
            }
            ArrayList A0I = AnonymousClass001.A0I();
            for (int i = 0; i < r0.A00; i++) {
                if (i != 0 || r5 == null || bitmap == null) {
                    A0I.add((Object) null);
                } else {
                    A0I.add(new C206759tv(str, "", "", bitmap.getWidth(), bitmap.getHeight()));
                }
            }
            String str2 = r0.A09;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = r0.A04;
            if (str3 == null) {
                str3 = "";
            }
            BigDecimal bigDecimal = r0.A0A;
            if (TextUtils.isEmpty(r0.A03)) {
                r14 = null;
            } else {
                r14 = new C132386Tk(r0.A03);
            }
            String str4 = r0.A07;
            String str5 = r0.A08;
            C206769tw r16 = new C206769tw((String) null, (String) null, (List) null, 0, false);
            AnonymousClass00C.A0D(str, 1);
            C207269up r9 = new C207269up((C206589te) null, r16, (C134726bV) null, (C134736bW) null, r14, str, str2, str3, str4, str5, (String) null, bigDecimal, A0I, 0, 99, false, false);
            this.A05.A0C(r9, (UserJid) null);
            UserJid userJid = r0.A01;
            C18740tg.A06(userJid);
            String str6 = r9.A0F;
            boolean z = this.A09;
            boolean z2 = this.A0A;
            AnonymousClass3SM.A03(context, this.A04, this.A06, userJid, (Integer) null, (Integer) null, str6, this.A01, z, z2, false);
            return;
        }
        return;
        throw th;
    }
}
