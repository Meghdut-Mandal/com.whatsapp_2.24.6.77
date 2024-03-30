package X;

import com.whatsapp.settings.SettingsUserProxyViewModel;
import java.util.Map;

/* renamed from: X.3mz  reason: invalid class name and case insensitive filesystem */
public class C75293mz implements C160437l0 {
    public final /* synthetic */ AnonymousClass3QR A00;
    public final /* synthetic */ SettingsUserProxyViewModel A01;

    public /* synthetic */ void BUJ(String str) {
    }

    public /* synthetic */ void BVA(long j) {
    }

    public C75293mz(AnonymousClass3QR r1, SettingsUserProxyViewModel settingsUserProxyViewModel) {
        this.A01 = settingsUserProxyViewModel;
        this.A00 = r1;
    }

    public void Bez(String str, Map map) {
    }

    public void BWo(String str) {
        C36321k7.A1P("SettingsUserProxyViewModel/MediaHealthCheck on error: ", str, AnonymousClass000.A0u());
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A01;
        String A012 = settingsUserProxyViewModel.A0D.A01();
        String str2 = this.A00.A03;
        if (A012 != null && A012.split(":")[0].equalsIgnoreCase(str2)) {
            settingsUserProxyViewModel.A0G.A04.A04(6);
        }
    }
}
