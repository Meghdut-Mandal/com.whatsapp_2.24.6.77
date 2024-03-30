package X;

import android.content.SharedPreferences;

/* renamed from: X.1KW  reason: invalid class name */
public final class AnonymousClass1KW {
    public C18910u1 A00 = new C18910u1((Object) null, new C36251k0(this, 3));
    public final C19890wg A01;

    public AnonymousClass1KW(C19890wg r4) {
        AnonymousClass00C.A0D(r4, 1);
        this.A01 = r4;
    }

    public final long A00(String str, String str2) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(str2, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("extensions_metadata_banned_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), 0);
    }

    public final String A01(String str) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("flows_biz_public_key_pem_");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getString(sb.toString(), (String) null);
    }

    public final void A02(long j, String str, String str2) {
        AnonymousClass00C.A0D(str, 0);
        SharedPreferences.Editor edit = ((SharedPreferences) this.A00.get()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("extensions_metadata_banned_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        edit.putLong(sb.toString(), j).apply();
    }

    public final void A03(String str) {
        AnonymousClass00C.A0D(str, 0);
        SharedPreferences.Editor edit = ((SharedPreferences) this.A00.get()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("extensions_biz_public_key_");
        sb.append(str);
        edit.remove(sb.toString()).apply();
    }

    public final void A04(String str, String str2) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A00.get()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("messageless_flow_ids_per_business_");
        sb.append(str);
        edit.putString(sb.toString(), str2).apply();
    }
}
