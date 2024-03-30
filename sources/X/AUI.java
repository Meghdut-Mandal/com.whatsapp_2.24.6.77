package X;

import java.io.Serializable;

public class AUI implements Serializable {
    public static final long serialVersionUID = 8153954923060974396L;
    public final int cellHighWaterMarkDeltaMs = 0;
    public final float cellLowWaterMarkMultiplier = 0.0f;
    public final int cellMaxLowWaterMarkMs = 0;
    public final int cellMinLowWaterMarkMs = 0;
    public final float waterMarkHighMultiplier = 0.0f;
    public final float waterMarkLowMultiplier = 0.0f;
    public final int wifiHighWaterMarkDeltaMs = 0;
    public final float wifiLowWaterMarkMultiplier = 0.0f;
    public final int wifiMaxLowWaterMarkMs = 0;
    public final int wifiMinLowWaterMarkMs = 0;

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WifiMinLowWaterMarkMs=");
        A0u.append(this.wifiMinLowWaterMarkMs);
        A0u.append(",WifiMaxLowWaterMarkMs=");
        A0u.append(this.wifiMaxLowWaterMarkMs);
        A0u.append(",WifiLowWaterMarkMultiplier=");
        A0u.append(this.wifiLowWaterMarkMultiplier);
        A0u.append(",WifiHighWaterMarkDeltaMs=");
        A0u.append(this.wifiHighWaterMarkDeltaMs);
        A0u.append(",CellMinLowWaterMarkMs=");
        A0u.append(this.cellMinLowWaterMarkMs);
        A0u.append(",CellMaxLowWaterMarkMs=");
        A0u.append(this.cellMaxLowWaterMarkMs);
        A0u.append(",CellLowWaterMarkMultiplier=");
        A0u.append(this.cellLowWaterMarkMultiplier);
        A0u.append(",CellHighWaterMarkDeltaMs=");
        A0u.append(this.cellHighWaterMarkDeltaMs);
        A0u.append(",WaterMarkLowMultipler=");
        A0u.append(this.waterMarkLowMultiplier);
        A0u.append(",WaterMarkHighMultipler=");
        A0u.append(this.waterMarkHighMultiplier);
        return A0u.toString();
    }
}
