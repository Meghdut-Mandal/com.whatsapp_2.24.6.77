package X;

import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: X.1UM  reason: invalid class name */
public class AnonymousClass1UM {
    public final AnonymousClass1UK A00;
    public final AnonymousClass1UL A01;
    public final AnonymousClass17Y A02;

    public AnonymousClass1UM(AnonymousClass17Y r2, AnonymousClass1UK r3, AnonymousClass1UL r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public AnonymousClass695 A00(AnonymousClass1US r8) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/getLinkedFbUserEntity called by ");
        sb.append(r8);
        AnonymousClass00C.A0D(sb.toString(), 0);
        AnonymousClass1UK r3 = this.A00;
        AtomicReference atomicReference = r3.A00;
        if (atomicReference.get() != null) {
            return (AnonymousClass695) atomicReference.get();
        }
        String string = AnonymousClass1UI.A00(r3.A03).getString("pref_xfamily_fb_account_info", (String) null);
        if (string == null) {
            return null;
        }
        String string2 = new JSONObject(r3.A02.A00(string)).getString("access_token");
        AnonymousClass00C.A0B(string2);
        AnonymousClass00C.A0D(string2, 0);
        AnonymousClass695 r1 = new AnonymousClass695(new C134876bk(new C135086c7(new C146356vT(), String.class, string2, "XFamilyFbAccessToken"), 2));
        atomicReference.set(r1);
        return r1;
    }

    public Boolean A01(AnonymousClass1US r5) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/isAutoCrosspostingOn called by ");
        sb.append(r5);
        AnonymousClass00C.A0D(sb.toString(), 0);
        AnonymousClass1UI r2 = this.A00.A03;
        if (AnonymousClass1UI.A00(r2).contains("pref_xfamily_fb_auto_crossposting")) {
            return Boolean.valueOf(AnonymousClass1UI.A00(r2).getBoolean("pref_xfamily_fb_auto_crossposting", false));
        }
        return null;
    }

    public void A02(AnonymousClass1US r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/saveHasUserConsented called by ");
        sb.append(r4);
        AnonymousClass00C.A0D(sb.toString(), 0);
        AnonymousClass1UI.A00(this.A00.A03).edit().putBoolean("pref_xfamily_fb_account_user_consented", true).apply();
    }

    public void A03(AnonymousClass1US r4, AnonymousClass695 r5) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/linkAccount called by ");
        sb.append(r4);
        AnonymousClass00C.A0D(sb.toString(), 0);
        C131886Rd.A01(new AnonymousClass4HR(r5, this.A00), 2);
        this.A02.Bp3(new C35751jC(this, 18));
    }

    public void A04(AnonymousClass1US r5, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/unlinkAccount called by ");
        sb.append(r5);
        AnonymousClass00C.A0D(sb.toString(), 0);
        AnonymousClass1UK r2 = this.A00;
        r2.A00.set((Object) null);
        AnonymousClass1UI r3 = r2.A03;
        AnonymousClass1UI.A00(r3).edit().remove("pref_xfamily_fb_account_info").apply();
        AnonymousClass1UI.A00(r3).edit().remove("pref_xfamily_fb_auto_crossposting").apply();
        AnonymousClass1UI.A00(r3).edit().remove("pref_xfamily_fb_account_update_time").apply();
        AnonymousClass1UI.A00(r3).edit().remove("pref_xfamily_fb_account_user_consented").apply();
        this.A02.Bp3(new C35751jC(this, 19));
        if (z) {
            AnonymousClass1UI.A00(r3).edit().putBoolean("pref_xfamily_fb_account_has_system_unlinked", true).apply();
        }
    }

    public void A05(AnonymousClass1US r4, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/updateIsAutoCrosspostingOn called by ");
        sb.append(r4);
        AnonymousClass00C.A0D(sb.toString(), 0);
        AnonymousClass1UI.A00(this.A00.A03).edit().putBoolean("pref_xfamily_fb_auto_crossposting", z).apply();
        this.A02.Bp3(new C35231iM(15, (Object) this, z));
    }

    public boolean A06(AnonymousClass1US r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/isAccountLinked called by ");
        sb.append(r3);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (A00(r3) != null) {
            return true;
        }
        return false;
    }
}
