package X;

import java.io.Serializable;

public class AUB implements Serializable {
    public static final long serialVersionUID = 1663511998052L;
    public final int cell2GValue;
    public final int cell3GValue;
    public final int cell4GValue;
    public final int defaultValue;
    public final int degradedValue;
    public final int excellentValue = 0;
    public final int goodValue;
    public final int moderateValue;
    public final int poorValue;
    public final boolean useNetworkQuality = false;
    public final boolean useNetworkQualityWifiOnly = false;
    public final boolean useNetworkType = false;
    public final int wifiValue;

    public AUB(AnonymousClass9LR r3) {
        this.goodValue = r3.A01;
        this.moderateValue = r3.A02;
        this.poorValue = r3.A03;
        this.degradedValue = r3.A00;
        this.wifiValue = 0;
        this.cell4GValue = 0;
        this.cell3GValue = 0;
        this.cell2GValue = 0;
        this.defaultValue = 0;
    }
}
