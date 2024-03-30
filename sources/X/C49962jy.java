package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2jy  reason: invalid class name and case insensitive filesystem */
public class C49962jy extends C132446Tt {
    public AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A00;
    public final C21010yW A01;
    public final C606138n A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.A03;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.A05)) {
                AnonymousClass2QV r7 = new AnonymousClass2QV();
                try {
                    AnonymousClass1BI r0 = this.A02.A03;
                    AnonymousClass68B A002 = r0.A00(str2, str);
                    boolean A1a = C36341k9.A1a(str2, str);
                    if (r0.A06.A03(str2, str)) {
                        return new C597835g(0, (String) null);
                    }
                    r7.A00 = Boolean.valueOf(A002.A0P);
                    r7.A02 = C36441kJ.A0y(A002.A05.size());
                    r7.A03 = Long.valueOf((A002.A01 / 10) / 1024);
                    r7.A01 = Boolean.valueOf(A1a);
                    C21010yW r3 = this.A01;
                    r3.Bly(r7);
                    C45482Rn r2 = new C45482Rn();
                    r2.A02 = false;
                    r2.A04 = C36371kC.A0n();
                    r2.A01 = Boolean.valueOf(A002.A0R);
                    r2.A00 = false;
                    r3.Bly(r2);
                    return new C597835g(A1a ? 1 : 0, (String) null);
                } catch (Exception e) {
                    Log.e("AddThirdPartyStickerPackActivity/fetch sticker pack error:", e);
                    r7.A01 = false;
                    this.A01.Bly(r7);
                    return new C597835g(2, e.getMessage());
                }
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("one of the follow fields are empty. pack id:");
        A0u.append(str);
        A0u.append(",authority:");
        A0u.append(this.A03);
        A0u.append(",sticker pack name:");
        return new C597835g(2, AnonymousClass000.A0q(this.A05, A0u));
    }

    public void A0A() {
        AnonymousClass01I r5 = (AnonymousClass01I) this.A06.get();
        if (r5 != null) {
            String str = this.A04;
            String str2 = this.A03;
            String str3 = this.A05;
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("sticker_pack_id", str);
            A07.putString("sticker_pack_authority", str2);
            A07.putString("sticker_pack_name", str3);
            AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = new AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment();
            addStickerPackDialogFragment.A17(A07);
            this.A00 = addStickerPackDialogFragment;
            addStickerPackDialogFragment.A1f(r5.getSupportFragmentManager(), "add");
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C597835g r7 = (C597835g) obj;
        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = this.A00;
        if (addStickerPackDialogFragment != null && !addStickerPackDialogFragment.A0a) {
            int i = r7.A00;
            if (i == 0) {
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = addStickerPackDialogFragment.A05;
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A03(addStickerPackDialogFragment, C36401kF.A0q(addStickerPackDialogFragment, addStickerPackDialogFragment.A0n(R.string.f12nameremoved), A0M, 1, R.string.f12nameremoved), 8, 0, 8);
                Activity A0D = C36441kJ.A0D(this.A06);
                if (A0D != null) {
                    Intent A0D2 = C36431kI.A0D();
                    A0D2.putExtra("already_added", true);
                    A0D.setResult(-1, A0D2);
                }
            } else if (i == 1) {
                Object[] A0M2 = AnonymousClass001.A0M();
                A0M2[0] = addStickerPackDialogFragment.A05;
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A03(addStickerPackDialogFragment, C36401kF.A0q(addStickerPackDialogFragment, addStickerPackDialogFragment.A0n(R.string.f12nameremoved), A0M2, 1, R.string.f12nameremoved), 8, 8, 0);
            } else {
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A03(addStickerPackDialogFragment, C36401kF.A0q(addStickerPackDialogFragment, addStickerPackDialogFragment.A0n(R.string.f12nameremoved), new Object[1], 0, R.string.f12nameremoved), 8, 0, 8);
                Activity A0D3 = C36441kJ.A0D(this.A06);
                if (A0D3 != null) {
                    Intent A0D4 = C36431kI.A0D();
                    A0D4.putExtra("validation_error", r7.A01);
                    A0D3.setResult(0, A0D4);
                }
            }
        }
    }

    public C49962jy(AnonymousClass01I r2, C21010yW r3, C606138n r4, String str, String str2, String str3) {
        this.A01 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = r4;
        this.A06 = AnonymousClass001.A0F(r2);
    }
}
