package X;

import com.whatsapp.jid.DeviceJid;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final /* synthetic */ class ATK implements C25711Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C30641aX A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ Set A07;

    public /* synthetic */ ATK(C30641aX r1, DeviceJid deviceJid, String str, Map map, Set set, int i, int i2, int i3) {
        this.A03 = r1;
        this.A06 = map;
        this.A04 = deviceJid;
        this.A05 = str;
        this.A07 = set;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void accept(Object obj) {
        C30641aX r2 = this.A03;
        Map map = this.A06;
        r2.A0M.Bp1(new AW4(r2, this.A04, this.A05, (List) obj, map, this.A07, this.A00, this.A01, this.A02));
    }
}
